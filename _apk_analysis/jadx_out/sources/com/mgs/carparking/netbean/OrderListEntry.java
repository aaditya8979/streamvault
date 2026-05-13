package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OrderListEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class OrderListEntry {
    private int collection;

    @Nullable
    private String create_time;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44304id;

    @Nullable
    private String order_number;

    @Nullable
    private String pay_status;
    private int payment_id;

    @Nullable
    private String price;

    @Nullable
    private String title;
    private int user_id;
    private int vip_days;
    private int vod_id;

    public final int getCollection() {
        return this.collection;
    }

    @Nullable
    public final String getCreate_time() {
        return this.create_time;
    }

    public final int getId() {
        return this.f44304id;
    }

    @Nullable
    public final String getOrder_number() {
        return this.order_number;
    }

    @Nullable
    public final String getPay_status() {
        return this.pay_status;
    }

    public final int getPayment_id() {
        return this.payment_id;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getUser_id() {
        return this.user_id;
    }

    public final int getVip_days() {
        return this.vip_days;
    }

    public final int getVod_id() {
        return this.vod_id;
    }

    public final void setCollection(int i10) {
        this.collection = i10;
    }

    public final void setCreate_time(@Nullable String str) {
        this.create_time = str;
    }

    public final void setId(int i10) {
        this.f44304id = i10;
    }

    public final void setOrder_number(@Nullable String str) {
        this.order_number = str;
    }

    public final void setPay_status(@Nullable String str) {
        this.pay_status = str;
    }

    public final void setPayment_id(int i10) {
        this.payment_id = i10;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUser_id(int i10) {
        this.user_id = i10;
    }

    public final void setVip_days(int i10) {
        this.vip_days = i10;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }
}
