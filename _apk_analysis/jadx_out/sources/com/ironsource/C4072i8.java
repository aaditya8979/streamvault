package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4072i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31947c;

    public C4072i8() {
        this.f31945a = 0;
        this.f31946b = 0;
        this.f31947c = "";
    }

    public C4072i8(int i10, int i11, String str) {
        this.f31945a = i10;
        this.f31946b = i11;
        this.f31947c = str;
    }

    public int a() {
        return this.f31946b;
    }

    public String b() {
        return this.f31947c;
    }

    public int c() {
        return this.f31945a;
    }

    public boolean d() {
        return this.f31946b > 0 && this.f31945a > 0;
    }

    public boolean e() {
        return this.f31946b == 0 && this.f31945a == 0;
    }

    public String toString() {
        return this.f31947c;
    }
}
