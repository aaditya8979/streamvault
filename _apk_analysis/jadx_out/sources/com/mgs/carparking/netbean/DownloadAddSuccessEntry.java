package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DownloadAddSuccessEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DownloadAddSuccessEntry {
    private int code;

    @Nullable
    private String msg;
    private int order;

    @Nullable
    private String resource;
    private int status;

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public final int getOrder() {
        return this.order;
    }

    @Nullable
    public final String getResource() {
        return this.resource;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setCode(int i10) {
        this.code = i10;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public final void setOrder(int i10) {
        this.order = i10;
    }

    public final void setResource(@Nullable String str) {
        this.resource = str;
    }

    public final void setStatus(int i10) {
        this.status = i10;
    }
}
