package com.mbridge.msdk.splash.request;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: SplashV3ParamsEntity.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39971e;

    public int a() {
        return this.f39971e;
    }

    public void a(int i10) {
        this.f39971e = i10;
    }

    public void a(String str) {
        this.f39968b = str;
    }

    public int b() {
        return this.f39970d;
    }

    public void b(int i10) {
        this.f39970d = i10;
    }

    public int c() {
        return this.f39969c;
    }

    public void c(int i10) {
        this.f39969c = i10;
    }

    public int d() {
        return this.f39967a;
    }

    public void d(int i10) {
        this.f39967a = i10;
    }

    public String e() {
        return this.f39968b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f39967a + ", session_id='" + this.f39968b + "', offset=" + this.f39969c + ", expectWidth=" + this.f39970d + ", expectHeight=" + this.f39971e + '}';
    }
}
