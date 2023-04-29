package com.seadox.okclikesviewer.Models.IncommingLikes;

public class Data {
    private Me me;
    private PrimaryImageBlurred primaryImageBlurred;
    private String __typename;
    private PrimaryImage primaryImage;

    public Data() {
    }

    public Me getMe() {
        return me;
    }

    public Data setMe(Me me) {
        this.me = me;
        return this;
    }

    public PrimaryImageBlurred getPrimaryImageBlurred() {
        return primaryImageBlurred;
    }

    public Data setPrimaryImageBlurred(PrimaryImageBlurred primaryImageBlurred) {
        this.primaryImageBlurred = primaryImageBlurred;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public Data set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    public PrimaryImage getPrimaryImage() {
        return primaryImage;
    }

    public Data setPrimaryImage(PrimaryImage primaryImage) {
        this.primaryImage = primaryImage;
        return this;
    }

    @Override
    public String toString() {
        return "Data{" +
                "me=" + me +
                ", primaryImageBlurred=" + primaryImageBlurred +
                ", __typename='" + __typename + '\'' +
                ", primaryImage=" + primaryImage +
                '}';
    }
}
