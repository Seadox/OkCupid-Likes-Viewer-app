package com.seadox.okclikesviewer.Models.IncommingLikes;

import java.util.ArrayList;

public class Me {
    private String id;
    private long joinDate;
    private NotificationCounts notificationCounts;
    private String __typename;
    private Likes likes;
    private Object lastBoost;
    private ArrayList<PromosForPage> promosForPage;

    public Me() {
    }

    public String getId() {
        return id;
    }

    public Me setId(String id) {
        this.id = id;
        return this;
    }

    public long getJoinDate() {
        return joinDate;
    }

    public Me setJoinDate(long joinDate) {
        this.joinDate = joinDate;
        return this;
    }

    public NotificationCounts getNotificationCounts() {
        return notificationCounts;
    }

    public Me setNotificationCounts(NotificationCounts notificationCounts) {
        this.notificationCounts = notificationCounts;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public Me set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    public Likes getLikes() {
        return likes;
    }

    public Me setLikes(Likes likes) {
        this.likes = likes;
        return this;
    }

    public Object getLastBoost() {
        return lastBoost;
    }

    public Me setLastBoost(Object lastBoost) {
        this.lastBoost = lastBoost;
        return this;
    }

    public ArrayList<PromosForPage> getPromosForPage() {
        return promosForPage;
    }

    public Me setPromosForPage(ArrayList<PromosForPage> promosForPage) {
        this.promosForPage = promosForPage;
        return this;
    }

    @Override
    public String toString() {
        return "Me{" +
                "id='" + id + '\'' +
                ", joinDate=" + joinDate +
                ", notificationCounts=" + notificationCounts +
                ", __typename='" + __typename + '\'' +
                ", likes=" + likes +
                ", lastBoost=" + lastBoost +
                ", promosForPage=" + promosForPage +
                '}';
    }
}
