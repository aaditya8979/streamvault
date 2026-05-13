package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RegisterEntity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RegisterEntity {

    @Nullable
    private String account;

    @Nullable
    private String app_id;

    @Nullable
    private String head_img;

    @Nullable
    private String intro;
    private int login_type;

    @Nullable
    private String nickname;

    @Nullable
    private String sex;

    @Nullable
    private String token;
    private int user_id;
    private int vip_level;

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getApp_id() {
        return this.app_id;
    }

    @Nullable
    public final String getHead_img() {
        return this.head_img;
    }

    @Nullable
    public final String getIntro() {
        return this.intro;
    }

    public final int getLogin_type() {
        return this.login_type;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public final int getUser_id() {
        return this.user_id;
    }

    public final int getVip_level() {
        return this.vip_level;
    }

    public final void setAccount(@Nullable String str) {
        this.account = str;
    }

    public final void setApp_id(@Nullable String str) {
        this.app_id = str;
    }

    public final void setHead_img(@Nullable String str) {
        this.head_img = str;
    }

    public final void setIntro(@Nullable String str) {
        this.intro = str;
    }

    public final void setLogin_type(int i10) {
        this.login_type = i10;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setSex(@Nullable String str) {
        this.sex = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setUser_id(int i10) {
        this.user_id = i10;
    }

    public final void setVip_level(int i10) {
        this.vip_level = i10;
    }
}
