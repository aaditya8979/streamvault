package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HomeChangeBatchEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeChangeBatchEntry {
    private int startIndex;

    @Nullable
    private List<RecommandVideosEntity> videoList;

    public final int getStartIndex() {
        return this.startIndex;
    }

    @Nullable
    public final List<RecommandVideosEntity> getVideoList() {
        return this.videoList;
    }

    public final void setStartIndex(int i10) {
        this.startIndex = i10;
    }

    public final void setVideoList(@Nullable List<RecommandVideosEntity> list) {
        this.videoList = list;
    }
}
