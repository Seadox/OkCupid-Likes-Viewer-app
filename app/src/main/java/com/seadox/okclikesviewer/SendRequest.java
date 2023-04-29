package com.seadox.okclikesviewer;

import com.google.gson.Gson;
import com.seadox.okclikesviewer.Models.IncomingLikes;
import com.seadox.okclikesviewer.Utilities.SP;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SendRequest {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();

    public IncomingLikes post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .header("Referrer-Policy", "strict-origin-when-cross-origin")
                .header("x-okcupid-version", "1")
                .header("x-okcupid-platform", "DESKTOP")
                .header("x-okcupid-locale", "en")
                .header("sec-fetch-site", "same-origin")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-dest", "empty")
                .header("sec-ch-ua-platform", "Windows")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua", "\"Google Chrome\";v=\"105\", \"Not)A;Brand\";v=\"8\", \"Chromium\";v=\"105\"")
                .header("cookie", SP.getInstance().getString("cookies", ""))
                .url(url)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String res = response.body().string();
            return new Gson().fromJson(res, IncomingLikes.class);
        }
    }

}
