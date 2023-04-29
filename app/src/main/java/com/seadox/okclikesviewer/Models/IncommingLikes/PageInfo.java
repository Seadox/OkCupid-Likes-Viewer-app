package com.seadox.okclikesviewer.Models.IncommingLikes;

public class PageInfo {
    private String after;
    private boolean hasMore;
    private int total;
    private String __typename;

    public PageInfo() {
    }

    public String getAfter() {
        return after;
    }

    public PageInfo setAfter(String after) {
        this.after = after;
        return this;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public PageInfo setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public PageInfo setTotal(int total) {
        this.total = total;
        return this;
    }

    public String get__typename() {
        return __typename;
    }

    public PageInfo set__typename(String __typename) {
        this.__typename = __typename;
        return this;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "after='" + after + '\'' +
                ", hasMore=" + hasMore +
                ", total=" + total +
                ", __typename='" + __typename + '\'' +
                '}';
    }
}
