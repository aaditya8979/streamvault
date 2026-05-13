package com.mgs.carparking.netbean;

import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DailyEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DailyEntry implements Serializable {

    @Nullable
    private List<VideoInfoModel> bannerList;

    @Nullable
    private List<CategoryModel> categoryModels;

    @Nullable
    private String title;

    @Nullable
    private String type;
    private int type_id;

    @Nullable
    private VideoInfoModel videoInfo;

    @Nullable
    public final List<VideoInfoModel> getBannerList() {
        return this.bannerList;
    }

    @Nullable
    public final List<CategoryModel> getCategoryModels() {
        return this.categoryModels;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int getType_id() {
        return this.type_id;
    }

    @Nullable
    public final VideoInfoModel getVideoInfo() {
        return this.videoInfo;
    }

    public final void setBannerList(@Nullable List<VideoInfoModel> list) {
        this.bannerList = list;
    }

    public final void setCategoryModels(@Nullable List<CategoryModel> list) {
        this.categoryModels = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setType_id(int i10) {
        this.type_id = i10;
    }

    public final void setVideoInfo(@Nullable VideoInfoModel videoInfoModel) {
        this.videoInfo = videoInfoModel;
    }
}
