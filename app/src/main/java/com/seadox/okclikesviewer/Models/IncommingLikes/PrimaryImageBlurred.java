package com.seadox.okclikesviewer.Models.IncommingLikes;

public class PrimaryImageBlurred {
    private String square225;
    private String __typename;

    public PrimaryImageBlurred() {
    }

    public String getSquare225() {
        return square225;
    }

    public PrimaryImageBlurred setSquare225(String square225) {
        this.square225 = square225;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public PrimaryImageBlurred set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    @Override
    public String toString() {
        return "PrimaryImageBlurred{" +
                "square225='" + square225 + '\'' +
                ", __typename='" + __typename + '\'' +
                '}';
    }
}
