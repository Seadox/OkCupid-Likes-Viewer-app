package com.seadox.okclikesviewer.Models.IncommingLikes;

import java.util.ArrayList;

public class Likes {
    private ArrayList<Datum> data;
    private PageInfo pageInfo;
    private String __typename;

    public Likes() {
    }

    public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public Likes setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public Likes set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    @Override
    public String toString() {
        return "Likes{" +
                "data=" + data +
                ", pageInfo=" + pageInfo +
                ", __typename='" + __typename + '\'' +
                '}';
    }
}
