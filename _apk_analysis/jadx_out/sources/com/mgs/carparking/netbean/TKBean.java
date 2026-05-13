package com.mgs.carparking.netbean;

import com.mgs.carparking.dbtable.VideoCollectionEntry;
import f8.c;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: TKBean.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TKBean implements Serializable {

    @NotNull
    private int[] ad_collection = new int[0];

    @Nullable
    private String ad_freq;
    private boolean netCineVarIsLike;
    private boolean netCineVarIsShow;
    private boolean netCineVarIsTrue;

    @c("type_id")
    private int netCineVarListType_id;

    @c(VideoCollectionEntry.TYPE_PID)
    private int netCineVarListType_pid;

    @c(VideoCollectionEntry.VOD_ACTOR)
    @Nullable
    private String netCineVarListVod_actor;

    @c("vod_blurb")
    @Nullable
    private String netCineVarListVod_blurb;

    @c(VideoCollectionEntry.VOD_DIRECTOR)
    @Nullable
    private String netCineVarListVod_director;

    @c("id")
    private int netCineVarListVod_id;

    @c(VideoCollectionEntry.VOD_NAME)
    @Nullable
    public String netCineVarListVod_name;

    @c(VideoCollectionEntry.VOD_PIC)
    @Nullable
    private String netCineVarListVod_pic;

    @c("vod_serial")
    @Nullable
    private String netCineVarListVod_serial;

    @c("vod_tag")
    @Nullable
    private String netCineVarListVod_tag;

    @c("vod_total")
    @Nullable
    private String netCineVarListVod_total;

    @c("vod_url")
    @Nullable
    private String netCineVarListVod_url;

    @NotNull
    public final int[] getAd_collection() {
        return this.ad_collection;
    }

    @Nullable
    public final String getAd_freq() {
        return this.ad_freq;
    }

    public final boolean getNetCineVarIsLike() {
        return this.netCineVarIsLike;
    }

    public final boolean getNetCineVarIsShow() {
        return this.netCineVarIsShow;
    }

    public final boolean getNetCineVarIsTrue() {
        return this.netCineVarIsTrue;
    }

    public final int getNetCineVarListType_id() {
        return this.netCineVarListType_id;
    }

    public final int getNetCineVarListType_pid() {
        return this.netCineVarListType_pid;
    }

    @Nullable
    public final String getNetCineVarListVod_actor() {
        return this.netCineVarListVod_actor;
    }

    @Nullable
    public final String getNetCineVarListVod_blurb() {
        return this.netCineVarListVod_blurb;
    }

    @Nullable
    public final String getNetCineVarListVod_director() {
        return this.netCineVarListVod_director;
    }

    public final int getNetCineVarListVod_id() {
        return this.netCineVarListVod_id;
    }

    @Nullable
    public final String getNetCineVarListVod_pic() {
        return this.netCineVarListVod_pic;
    }

    @Nullable
    public final String getNetCineVarListVod_serial() {
        return this.netCineVarListVod_serial;
    }

    @Nullable
    public final String getNetCineVarListVod_tag() {
        return this.netCineVarListVod_tag;
    }

    @Nullable
    public final String getNetCineVarListVod_total() {
        return this.netCineVarListVod_total;
    }

    @Nullable
    public final String getNetCineVarListVod_url() {
        return this.netCineVarListVod_url;
    }

    @NotNull
    public final String getVod_url(@NotNull String str) {
        p.k(str, "s");
        return this.netCineVarListVod_url + str;
    }

    public final void setAd_collection(@NotNull int[] iArr) {
        p.k(iArr, "<set-?>");
        this.ad_collection = iArr;
    }

    public final void setAd_freq(@Nullable String str) {
        this.ad_freq = str;
    }

    public final void setNetCineVarIsLike(boolean z10) {
        this.netCineVarIsLike = z10;
    }

    public final void setNetCineVarIsShow(boolean z10) {
        this.netCineVarIsShow = z10;
    }

    public final void setNetCineVarIsTrue(boolean z10) {
        this.netCineVarIsTrue = z10;
    }

    public final void setNetCineVarListType_id(int i10) {
        this.netCineVarListType_id = i10;
    }

    public final void setNetCineVarListType_pid(int i10) {
        this.netCineVarListType_pid = i10;
    }

    public final void setNetCineVarListVod_actor(@Nullable String str) {
        this.netCineVarListVod_actor = str;
    }

    public final void setNetCineVarListVod_blurb(@Nullable String str) {
        this.netCineVarListVod_blurb = str;
    }

    public final void setNetCineVarListVod_director(@Nullable String str) {
        this.netCineVarListVod_director = str;
    }

    public final void setNetCineVarListVod_id(int i10) {
        this.netCineVarListVod_id = i10;
    }

    public final void setNetCineVarListVod_pic(@Nullable String str) {
        this.netCineVarListVod_pic = str;
    }

    public final void setNetCineVarListVod_serial(@Nullable String str) {
        this.netCineVarListVod_serial = str;
    }

    public final void setNetCineVarListVod_tag(@Nullable String str) {
        this.netCineVarListVod_tag = str;
    }

    public final void setNetCineVarListVod_total(@Nullable String str) {
        this.netCineVarListVod_total = str;
    }

    public final void setNetCineVarListVod_url(@Nullable String str) {
        this.netCineVarListVod_url = str;
    }
}
