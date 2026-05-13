package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VipListItemEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class VipListItemEntry {

    @Nullable
    private String desc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44321id;
    private boolean isCheck;
    private int is_enable;
    private int is_once;
    private int is_recommend;

    @Nullable
    private String mark_title;

    @Nullable
    private String price;

    @Nullable
    private String price_original;

    @Nullable
    private String title;

    @Nullable
    private String update_time;
    private int user_type;
    private int vip_days;
    private int weight;

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final int getId() {
        return this.f44321id;
    }

    @Nullable
    public final String getMark_title() {
        return this.mark_title;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPrice_original() {
        return this.price_original;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUpdate_time() {
        return this.update_time;
    }

    public final int getUser_type() {
        return this.user_type;
    }

    public final int getVip_days() {
        return this.vip_days;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final int is_enable() {
        return this.is_enable;
    }

    public final int is_once() {
        return this.is_once;
    }

    public final int is_recommend() {
        return this.is_recommend;
    }

    public final void setCheck(boolean z10) {
        this.isCheck = z10;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setId(int i10) {
        this.f44321id = i10;
    }

    public final void setMark_title(@Nullable String str) {
        this.mark_title = str;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setPrice_original(@Nullable String str) {
        this.price_original = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUpdate_time(@Nullable String str) {
        this.update_time = str;
    }

    public final void setUser_type(int i10) {
        this.user_type = i10;
    }

    public final void setVip_days(int i10) {
        this.vip_days = i10;
    }

    public final void setWeight(int i10) {
        this.weight = i10;
    }

    public final void set_enable(int i10) {
        this.is_enable = i10;
    }

    public final void set_once(int i10) {
        this.is_once = i10;
    }

    public final void set_recommend(int i10) {
        this.is_recommend = i10;
    }
}
