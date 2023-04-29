package com.seadox.okclikesviewer.Models.IncommingLikes;

public class PromosForPage {
    private String upsellType;
    private String featureType;
    private String name;
    private String __typename;

    public PromosForPage() {
    }

    public String getUpsellType() {
        return upsellType;
    }

    public PromosForPage setUpsellType(String upsellType) {
        this.upsellType = upsellType;
        return this;
    }

    public String getFeatureType() {
        return featureType;
    }

    public PromosForPage setFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }

    public String getName() {
        return name;
    }

    public PromosForPage setName(String name) {
        this.name = name;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public PromosForPage set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    @Override
    public String toString() {
        return "PromosForPage{" +
                "upsellType='" + upsellType + '\'' +
                ", featureType='" + featureType + '\'' +
                ", name='" + name + '\'' +
                ", __typename='" + __typename + '\'' +
                '}';
    }
}
