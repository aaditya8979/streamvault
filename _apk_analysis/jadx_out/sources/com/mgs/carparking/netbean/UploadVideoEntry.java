package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UploadVideoEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class UploadVideoEntry {

    @Nullable
    private String headPhotoUrl;

    @Nullable
    private String nickName;
    private int userId;

    @Nullable
    private List<RecommandVideosEntity> videoList;

    @Nullable
    public final String getHeadPhotoUrl() {
        return this.headPhotoUrl;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final int getUserId() {
        return this.userId;
    }

    @Nullable
    public final List<RecommandVideosEntity> getVideoList() {
        return this.videoList;
    }

    public final void setHeadPhotoUrl(@Nullable String str) {
        this.headPhotoUrl = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setUserId(int i10) {
        this.userId = i10;
    }

    public final void setVideoList(@Nullable List<RecommandVideosEntity> list) {
        this.videoList = list;
    }
}
