package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OrderEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OrderEntry {

    @Nullable
    private String pay_url;

    @Nullable
    private String qrcode_raw;

    @Nullable
    public final String getPay_url() {
        return this.pay_url;
    }

    @Nullable
    public final String getQrcode_raw() {
        return this.qrcode_raw;
    }

    public final void setPay_url(@Nullable String str) {
        this.pay_url = str;
    }

    public final void setQrcode_raw(@Nullable String str) {
        this.qrcode_raw = str;
    }
}
