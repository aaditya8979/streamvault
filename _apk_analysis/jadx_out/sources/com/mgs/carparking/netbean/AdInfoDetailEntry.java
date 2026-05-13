package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AdInfoDetailEntry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AdInfoDetailEntry implements Serializable {
    private int ad_id;

    @Nullable
    private String ad_placement_id;
    private int ad_source_id;
    private int ad_type;

    @Nullable
    private String btn_content;

    @Nullable
    private String content;

    @Nullable
    private String error_codes;
    private int is_allow_close;
    private int jump_type;

    @Nullable
    private String jump_url;
    private int new_user_has_ad;
    private int num;

    @Nullable
    private String pic_url;

    @Nullable
    private String sdk_ad_id;

    @Nullable
    private String title;

    public final int getAd_id() {
        return this.ad_id;
    }

    @Nullable
    public final String getAd_placement_id() {
        return this.ad_placement_id;
    }

    public final int getAd_source_id() {
        return this.ad_source_id;
    }

    public final int getAd_type() {
        return this.ad_type;
    }

    @Nullable
    public final String getBtn_content() {
        return this.btn_content;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getError_codes() {
        return this.error_codes;
    }

    public final int getJump_type() {
        return this.jump_type;
    }

    @Nullable
    public final String getJump_url() {
        return this.jump_url;
    }

    public final int getNew_user_has_ad() {
        return this.new_user_has_ad;
    }

    public final int getNum() {
        return this.num;
    }

    @Nullable
    public final String getPic_url() {
        return this.pic_url;
    }

    @Nullable
    public final String getSdk_ad_id() {
        return this.sdk_ad_id;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int is_allow_close() {
        return this.is_allow_close;
    }

    public final void setAd_id(int i10) {
        this.ad_id = i10;
    }

    public final void setAd_placement_id(@Nullable String str) {
        this.ad_placement_id = str;
    }

    public final void setAd_source_id(int i10) {
        this.ad_source_id = i10;
    }

    public final void setAd_type(int i10) {
        this.ad_type = i10;
    }

    public final void setBtn_content(@Nullable String str) {
        this.btn_content = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setError_codes(@Nullable String str) {
        this.error_codes = str;
    }

    public final void setJump_type(int i10) {
        this.jump_type = i10;
    }

    public final void setJump_url(@Nullable String str) {
        this.jump_url = str;
    }

    public final void setNew_user_has_ad(int i10) {
        this.new_user_has_ad = i10;
    }

    public final void setNum(int i10) {
        this.num = i10;
    }

    public final void setPic_url(@Nullable String str) {
        this.pic_url = str;
    }

    public final void setSdk_ad_id(@Nullable String str) {
        this.sdk_ad_id = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void set_allow_close(int i10) {
        this.is_allow_close = i10;
    }
}
