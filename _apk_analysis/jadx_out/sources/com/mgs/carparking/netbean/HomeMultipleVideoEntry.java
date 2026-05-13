package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HomeMultipleVideoEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class HomeMultipleVideoEntry {

    @Nullable
    private String moduleCoverUrl;
    private int moduleId;

    @Nullable
    private String moduleName;
    private int type;

    @Nullable
    private List<RecommandVideosEntity> videoList;

    @Nullable
    public final String getModuleCoverUrl() {
        return this.moduleCoverUrl;
    }

    public final int getModuleId() {
        return this.moduleId;
    }

    @Nullable
    public final String getModuleName() {
        return this.moduleName;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final List<RecommandVideosEntity> getVideoList() {
        return this.videoList;
    }

    public final void setModuleCoverUrl(@Nullable String str) {
        this.moduleCoverUrl = str;
    }

    public final void setModuleId(int i10) {
        this.moduleId = i10;
    }

    public final void setModuleName(@Nullable String str) {
        this.moduleName = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    public final void setVideoList(@Nullable List<RecommandVideosEntity> list) {
        this.videoList = list;
    }
}
