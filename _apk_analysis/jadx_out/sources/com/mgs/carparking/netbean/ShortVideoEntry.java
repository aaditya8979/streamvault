package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortVideoEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShortVideoEntry {

    @Nullable
    private String clickNum;

    @Nullable
    private String score;

    @Nullable
    private String videoCoverUrl;
    private int videoId;

    @Nullable
    private List<ShortVideoListEntry> videoList;

    @Nullable
    public final String getClickNum() {
        return this.clickNum;
    }

    @Nullable
    public final String getScore() {
        return this.score;
    }

    @Nullable
    public final String getVideoCoverUrl() {
        return this.videoCoverUrl;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    @Nullable
    public final List<ShortVideoListEntry> getVideoList() {
        return this.videoList;
    }

    public final void setClickNum(@Nullable String str) {
        this.clickNum = str;
    }

    public final void setScore(@Nullable String str) {
        this.score = str;
    }

    public final void setVideoCoverUrl(@Nullable String str) {
        this.videoCoverUrl = str;
    }

    public final void setVideoId(int i10) {
        this.videoId = i10;
    }

    public final void setVideoList(@Nullable List<ShortVideoListEntry> list) {
        this.videoList = list;
    }
}
