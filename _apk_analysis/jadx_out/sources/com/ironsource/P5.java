package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public class P5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30125d;

    public P5(int i10, String str, String str2, String str3) {
        this.f30124c = i10;
        this.f30123b = str2;
        this.f30122a = str;
        this.f30125d = str3;
    }

    public P5(String str, String str2, String str3) {
        this.f30124c = -1;
        this.f30123b = str2;
        this.f30122a = str;
        this.f30125d = str3;
    }

    public void a() {
        I4.a(this);
    }

    public String b() {
        return this.f30123b;
    }

    public int c() {
        return this.f30124c;
    }

    public String d() {
        return this.f30125d;
    }

    public String e() {
        return this.f30122a;
    }
}
