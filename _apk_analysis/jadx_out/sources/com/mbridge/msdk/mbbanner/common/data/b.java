package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: compiled from: BannerUnitData.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38420c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38422e;

    public b(String str, String str2, int i10, int i11) {
        this.f38418a = str;
        this.f38419b = str2;
        this.f38421d = i10;
        this.f38422e = i11;
    }

    public String a() {
        return this.f38420c;
    }

    public void a(int i10) {
        this.f38421d = i10;
    }

    public void a(String str) {
        this.f38420c = str;
    }

    public int b() {
        return this.f38422e;
    }

    public void b(String str) {
        this.f38419b = str;
    }

    public int c() {
        return this.f38421d;
    }

    public String d() {
        return this.f38419b;
    }
}
