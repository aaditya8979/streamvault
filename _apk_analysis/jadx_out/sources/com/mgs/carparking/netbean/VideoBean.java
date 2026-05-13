package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoBean.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class VideoBean {
    private int collection;

    @Nullable
    private String down_url;
    private int episodeNum;
    private int havInfo;
    private boolean isCheck;
    private boolean isCompleteDownload;
    private boolean isDownload;
    private boolean isSelect;
    private int is_ad;
    private int is_p2p;
    private int is_selected;

    @Nullable
    private String orginal_url;
    public int position;
    private int source_id;

    @Nullable
    private String title;
    private int vod_id;

    @Nullable
    private String vod_url;

    public final int getCollection() {
        return this.collection;
    }

    @Nullable
    public final String getDown_url() {
        return this.down_url;
    }

    public final int getEpisodeNum() {
        return this.episodeNum;
    }

    public final int getHavInfo() {
        return this.havInfo;
    }

    @Nullable
    public final String getOrginal_url() {
        return this.orginal_url;
    }

    public final int getSource_id() {
        return this.source_id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public String getVideoUri() {
        return this.vod_url;
    }

    public final int getVod_id() {
        return this.vod_id;
    }

    @Nullable
    public final String getVod_url() {
        return this.vod_url;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final boolean isCompleteDownload() {
        return this.isCompleteDownload;
    }

    public final boolean isDownload() {
        return this.isDownload;
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final int is_ad() {
        return this.is_ad;
    }

    public final int is_p2p() {
        return this.is_p2p;
    }

    public final int is_selected() {
        return this.is_selected;
    }

    public final void setCheck(boolean z10) {
        this.isCheck = z10;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setCompleteDownload(boolean z10) {
        this.isCompleteDownload = z10;
    }

    public final void setDown_url(@Nullable String str) {
        this.down_url = str;
    }

    public final void setDownload(boolean z10) {
        this.isDownload = z10;
    }

    public final void setEpisodeNum(int i10) {
        this.episodeNum = i10;
    }

    public final void setHavInfo(int i10) {
        this.havInfo = i10;
    }

    public final void setOrginal_url(@Nullable String str) {
        this.orginal_url = str;
    }

    public final void setSelect(boolean z10) {
        this.isSelect = z10;
    }

    public final void setSource_id(int i10) {
        this.source_id = i10;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }

    public final void setVod_url(@Nullable String str) {
        this.vod_url = str;
    }

    public final void set_ad(int i10) {
        this.is_ad = i10;
    }

    public final void set_p2p(int i10) {
        this.is_p2p = i10;
    }

    public final void set_selected(int i10) {
        this.is_selected = i10;
    }
}
