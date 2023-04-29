package com.seadox.okclikesviewer.Models;

import com.seadox.okclikesviewer.Models.IncommingLikes.Data;
import com.seadox.okclikesviewer.Models.IncommingLikes.Extensions;

public class IncomingLikes {
    private Data data;
    private Extensions extensions;

    public IncomingLikes() {
    }

    public Data getData() {
        return data;
    }

    public IncomingLikes setData(Data data) {
        this.data = data;
        return this;
    }

    public Extensions getExtensions() {
        return extensions;
    }

    public IncomingLikes setExtensions(Extensions extensions) {
        this.extensions = extensions;
        return this;
    }

    @Override
    public String toString() {
        return "IncomingLikes{" +
                "data=" + data +
                ", extensions=" + extensions +
                '}';
    }
}
