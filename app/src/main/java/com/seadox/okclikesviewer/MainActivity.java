package com.seadox.okclikesviewer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.seadox.okclikesviewer.Models.IncomingLikes;
import com.seadox.okclikesviewer.Models.IncommingLikes.Datum;
import com.seadox.okclikesviewer.Utilities.SP;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private SwipeRefreshLayout swipeRefreshLayout;
    private GridView main_grid;
    private GridAdapter gridAdapter;
    private ArrayList<String> images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (SP.getInstance().isEmpty("cookies")) {//was login to OkCupid
            Intent webIntent = new Intent(this, WebActivity.class);
            startActivity(webIntent);
            finish();
        }

        findViews();
        init();
        onRefresh();

        swipeRefreshLayout.setOnRefreshListener(this::onRefresh);
    }

    private void onRefresh() {
        getImages("");
        gridAdapter.refresh(images);
        swipeRefreshLayout.setRefreshing(false);
    }

    private void findViews() {
        main_grid = findViewById(R.id.main_grid);
        swipeRefreshLayout = findViewById(R.id.refreshLayout);
    }

    private void init() {
        images = new ArrayList<>();
        gridAdapter = new GridAdapter(this, images);
        main_grid.setAdapter(gridAdapter);
    }

    private void getImages(String key) {
        SendRequest sendRequest = new SendRequest();

        Thread thread = new Thread(() -> {
            try {
                IncomingLikes res = sendRequest.post("https://www.okcupid.com/graphql?operationName=userrowsIncomingLikes", "{\"operationName\":\"userrowsIncomingLikes\",\"variables\":{\"sort\":\"DESC_TIMESTAMP\", \"after\":\"" + key + "\"},\"query\":\"fragment UserFragment on User {\\n  id\\n  joinDate\\n  notificationCounts {\\n    likesIncoming\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment UserBlurredImage on User {\\n  primaryImageBlurred {\\n    square225\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment UserPrimaryImagesFragment on User {\\n  primaryImage {\\n    id\\n    caption\\n    original\\n    square60\\n    square82\\n    square100\\n    square120\\n    square160\\n    square225\\n    square400\\n    square800\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment UserrowMatchFragment on Match {\\n  matchPercent\\n  senderLikeTime\\n  senderLikes\\n  senderVote\\n  targetLikeTime\\n  targetVote\\n  likeTime\\n  senderMessageTime\\n  targetMessageTime\\n  targetLikeViaSpotlight\\n  targetLikeViaSuperBoost\\n  senderPassed\\n  firstMessage {\\n    text\\n    __typename\\n  }\\n  user {\\n    id\\n    username\\n    displayname\\n    age\\n    isOnline\\n    userLocation {\\n      id\\n      publicName\\n      __typename\\n    }\\n    ...UserPrimaryImagesFragment\\n    ...UserBlurredImage\\n    __typename\\n  }\\n  __typename\\n}\\n\\nfragment PromoFragment on Promo {\\n  upsellType\\n  featureType\\n  name\\n  __typename\\n}\\n\\nfragment MatchPreviewBlurredImage on MatchPreview {\\n  primaryImageBlurred {\\n    square225\\n    __typename\\n  }\\n  __typename\\n}\\n\\nquery userrowsIncomingLikes($after: String, $sort: LikesListSort) {\\n  me {\\n    ...UserFragment\\n    id\\n    likes: likesIncomingWithPreviews(after: $after, sort: $sort) {\\n      data {\\n        ... on Match {\\n          ...UserrowMatchFragment\\n          __typename\\n        }\\n        ... on MatchPreview {\\n          ...MatchPreviewBlurredImage\\n          primaryImage {\\n            square225\\n            __typename\\n          }\\n          __typename\\n        }\\n        __typename\\n      }\\n      pageInfo {\\n        after\\n        hasMore\\n        total\\n        __typename\\n      }\\n      __typename\\n    }\\n    lastBoost {\\n      id\\n      startTime\\n      endTime\\n      __typename\\n    }\\n    promosForPage(page: LIKES_INCOMING) {\\n      ...PromoFragment\\n      __typename\\n    }\\n    __typename\\n  }\\n}\\n\"}");

                for (Datum data : res.getData().getMe().getLikes().getData()) {
                    String image = data.getPrimaryImage().getSquare225();

                    if (!images.contains(image))
                        images.add(image);
                }

                if (res.getData().getMe().getLikes().getPageInfo().isHasMore())
                    getImages(res.getData().getMe().getLikes().getPageInfo().getAfter());

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}