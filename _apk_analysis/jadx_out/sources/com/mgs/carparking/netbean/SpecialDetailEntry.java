package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpecialDetailEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SpecialDetailEntry {
    private int favoriteNum;
    private int isFavorited;

    @Nullable
    private String moduleCoverUrl;

    @Nullable
    private String moduleDesc;

    @Nullable
    private String moduleName;

    @Nullable
    private String projectCoverUrl;

    @Nullable
    private String projectDesc;

    @Nullable
    private String projectTitle;

    @Nullable
    private List<RecommandVideosEntity> videoList;

    public final int getFavoriteNum() {
        return this.favoriteNum;
    }

    @Nullable
    public final String getModuleCoverUrl() {
        return this.moduleCoverUrl;
    }

    @Nullable
    public final String getModuleDesc() {
        return this.moduleDesc;
    }

    @Nullable
    public final String getModuleName() {
        return this.moduleName;
    }

    @Nullable
    public final String getProjectCoverUrl() {
        return this.projectCoverUrl;
    }

    @Nullable
    public final String getProjectDesc() {
        return this.projectDesc;
    }

    @Nullable
    public final String getProjectTitle() {
        return this.projectTitle;
    }

    @Nullable
    public final List<RecommandVideosEntity> getVideoList() {
        return this.videoList;
    }

    public final int isFavorited() {
        return this.isFavorited;
    }

    public final void setFavoriteNum(int i10) {
        this.favoriteNum = i10;
    }

    public final void setFavorited(int i10) {
        this.isFavorited = i10;
    }

    public final void setModuleCoverUrl(@Nullable String str) {
        this.moduleCoverUrl = str;
    }

    public final void setModuleDesc(@Nullable String str) {
        this.moduleDesc = str;
    }

    public final void setModuleName(@Nullable String str) {
        this.moduleName = str;
    }

    public final void setProjectCoverUrl(@Nullable String str) {
        this.projectCoverUrl = str;
    }

    public final void setProjectDesc(@Nullable String str) {
        this.projectDesc = str;
    }

    public final void setProjectTitle(@Nullable String str) {
        this.projectTitle = str;
    }

    public final void setVideoList(@Nullable List<RecommandVideosEntity> list) {
        this.videoList = list;
    }
}
