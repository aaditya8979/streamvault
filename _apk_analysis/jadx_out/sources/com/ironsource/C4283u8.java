package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4283u8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34196c = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34198b;

    public C4283u8(int i10, String str) {
        this.f34198b = i10;
        this.f34197a = str == null ? "" : str;
    }

    public int a() {
        return this.f34198b;
    }

    public String b() {
        return this.f34197a;
    }

    public String toString() {
        return "error - code:" + this.f34198b + ", message:" + this.f34197a;
    }
}
