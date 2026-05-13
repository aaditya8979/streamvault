package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RankVideoTypeEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RankVideoTypeEntry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44306id;
    private int isShow;

    @Nullable
    private String rankName;
    private int rankSort;
    private int videoType;

    public final int getId() {
        return this.f44306id;
    }

    @Nullable
    public final String getRankName() {
        return this.rankName;
    }

    public final int getRankSort() {
        return this.rankSort;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final int isShow() {
        return this.isShow;
    }

    public final void setId(int i10) {
        this.f44306id = i10;
    }

    public final void setRankName(@Nullable String str) {
        this.rankName = str;
    }

    public final void setRankSort(int i10) {
        this.rankSort = i10;
    }

    public final void setShow(int i10) {
        this.isShow = i10;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }
}
