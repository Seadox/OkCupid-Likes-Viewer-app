package com.seadox.okclikesviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.seadox.okclikesviewer.Utilities.Clipboard;
import com.seadox.okclikesviewer.Utilities.SignalGenerator;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> allImages;
    private LayoutInflater inflater;

    public GridAdapter(Context context, ArrayList<String> images) {
        this.context = context;
        this.allImages = images;
    }

    @Override
    public int getCount() {
        return allImages.size();
    }

    @Override
    public Object getItem(int position) {
        return allImages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.grid_item, null);

        ShapeableImageView shapeableImageView = convertView.findViewById(R.id.grid_image_imageView);

        shapeableImageView.setOnClickListener(v -> imageClick(allImages.get(position)));

        Glide
                .with(context)
                .load(allImages.get(position))
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(shapeableImageView);

        return convertView;
    }

    private void imageClick(String url) {
        String newUrl = "";
        if (url.split("/").length >= 11)
            newUrl = "https://cdn.okccdn.com/php/load_okc_image.php/images/0x230/540x770/0/" + url.split("/")[11].split("\\.")[0] + ".jpg";
        else
            newUrl = url;

        SignalGenerator.getInstance().toast("link to the image has been copied", Toast.LENGTH_SHORT);
        Clipboard.getInstance().copy("OKC likes viewer", newUrl);
    }

    public void refresh(ArrayList<String> images) {
        allImages = new ArrayList<>(images);
        notifyDataSetChanged();
    }

}
