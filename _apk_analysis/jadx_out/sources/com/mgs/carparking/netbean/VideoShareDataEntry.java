package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoShareDataEntry.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class VideoShareDataEntry {

    @Nullable
    private String app_share_url;

    @Nullable
    private String vod_app_share_qrcode;

    @Nullable
    private String vod_qrcode;

    @Nullable
    private String vod_share_pic;

    @Nullable
    private String wx_app_url;

    @Nullable
    public final String getApp_share_url() {
        return this.app_share_url;
    }

    @Nullable
    public final String getVod_app_share_qrcode() {
        return this.vod_app_share_qrcode;
    }

    @Nullable
    public final String getVod_qrcode() {
        return this.vod_qrcode;
    }

    @Nullable
    public final String getVod_share_pic() {
        return this.vod_share_pic;
    }

    @Nullable
    public final String getWx_app_url() {
        return this.wx_app_url;
    }

    public final void setApp_share_url(@Nullable String str) {
        this.app_share_url = str;
    }

    public final void setVod_app_share_qrcode(@Nullable String str) {
        this.vod_app_share_qrcode = str;
    }

    public final void setVod_qrcode(@Nullable String str) {
        this.vod_qrcode = str;
    }

    public final void setVod_share_pic(@Nullable String str) {
        this.vod_share_pic = str;
    }

    public final void setWx_app_url(@Nullable String str) {
        this.wx_app_url = str;
    }
}
