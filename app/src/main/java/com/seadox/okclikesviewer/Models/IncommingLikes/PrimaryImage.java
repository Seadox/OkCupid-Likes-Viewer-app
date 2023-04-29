package com.seadox.okclikesviewer.Models.IncommingLikes;

public class PrimaryImage {
    private String square225;
    private String __typename;

    public PrimaryImage() {
    }

    public String getSquare225() {
        return square225;
    }

    public PrimaryImage setSquare225(String square225) {
        this.square225 = square225;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public PrimaryImage set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    @Override
    public String toString() {
        return "PrimaryImage{" +
                "square225='" + square225 + '\'' +
                ", __typename='" + __typename + '\'' +
                '}';
    }
}
