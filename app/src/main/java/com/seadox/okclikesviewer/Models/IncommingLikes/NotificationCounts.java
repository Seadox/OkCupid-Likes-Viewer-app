package com.seadox.okclikesviewer.Models.IncommingLikes;

public class NotificationCounts {
    private int likesIncoming;
    private String __typename;

    public NotificationCounts() {
    }

    public int getLikesIncoming() {
        return likesIncoming;
    }

    public NotificationCounts setLikesIncoming(int likesIncoming) {
        this.likesIncoming = likesIncoming;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public NotificationCounts set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    @Override
    public String toString() {
        return "NotificationCounts{" +
                "likesIncoming=" + likesIncoming +
                ", __typename='" + __typename + '\'' +
                '}';
    }
}
