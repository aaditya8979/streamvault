package com.mbridge.msdk.mbbid.common;

/* JADX INFO: compiled from: BidRequestParams.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38573c;

    public c(String str, String str2) {
        this.f38571a = str;
        this.f38572b = str2;
    }

    public c(String str, String str2, String str3) {
        this.f38571a = str;
        this.f38572b = str2;
        this.f38573c = str3;
    }

    public String getmFloorPrice() {
        return this.f38573c;
    }

    public String getmPlacementId() {
        return this.f38571a;
    }

    public String getmUnitId() {
        return this.f38572b;
    }

    public void setmFloorPrice(String str) {
        this.f38573c = str;
    }

    public void setmPlacementId(String str) {
        this.f38571a = str;
    }

    public void setmUnitId(String str) {
        this.f38572b = str;
    }
}
