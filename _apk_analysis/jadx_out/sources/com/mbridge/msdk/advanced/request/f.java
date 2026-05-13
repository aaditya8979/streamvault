package com.mbridge.msdk.advanced.request;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: NativeAdvancedV3ParamsEntity.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35509e;

    public int a() {
        return this.f35509e;
    }

    public void a(int i10) {
        this.f35509e = i10;
    }

    public void a(String str) {
        this.f35506b = str;
    }

    public int b() {
        return this.f35508d;
    }

    public void b(int i10) {
        this.f35508d = i10;
    }

    public int c() {
        return this.f35507c;
    }

    public void c(int i10) {
        this.f35507c = i10;
    }

    public int d() {
        return this.f35505a;
    }

    public void d(int i10) {
        this.f35505a = i10;
    }

    public String e() {
        return this.f35506b;
    }

    @NonNull
    public String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f35505a + ", session_id='" + this.f35506b + "', offset=" + this.f35507c + ", expectWidth=" + this.f35508d + ", expectHeight=" + this.f35509e + '}';
    }
}
