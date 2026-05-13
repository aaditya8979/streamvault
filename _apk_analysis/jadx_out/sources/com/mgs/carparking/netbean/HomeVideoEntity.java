package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HomeVideoEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class HomeVideoEntity {

    @Nullable
    private List<RecommandVideosEntity> hotVideos;

    @Nullable
    private List<RecommandVideosEntity> recommandVideos;

    @Nullable
    public final List<RecommandVideosEntity> getHotVideos() {
        return this.hotVideos;
    }

    @Nullable
    public final List<RecommandVideosEntity> getRecommandVideos() {
        return this.recommandVideos;
    }

    public final void setHotVideos(@Nullable List<RecommandVideosEntity> list) {
        this.hotVideos = list;
    }

    public final void setRecommandVideos(@Nullable List<RecommandVideosEntity> list) {
        this.recommandVideos = list;
    }
}
