package com.seadox.okclikesviewer.Models.IncommingLikes;

public class Datum {
    private PrimaryImageBlurred primaryImageBlurred;
    private String __typename;
    private PrimaryImage primaryImage;

    public PrimaryImageBlurred getPrimaryImageBlurred() {
        return primaryImageBlurred;
    }

    public void setPrimaryImageBlurred(PrimaryImageBlurred primaryImageBlurred) {
        this.primaryImageBlurred = primaryImageBlurred;
    }

    public String get__typename() {
        return __typename;
    }

    public void set__typename(String __typename) {
        this.__typename = __typename;
    }

    public PrimaryImage getPrimaryImage() {
        return primaryImage;
    }

    public void setPrimaryImage(PrimaryImage primaryImage) {
        this.primaryImage = primaryImage;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "primaryImageBlurred=" + primaryImageBlurred +
                ", __typename='" + __typename + '\'' +
                ", primaryImage=" + primaryImage +
                '}';
    }
}
