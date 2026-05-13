package com.ironsource;

import android.content.Context;

/* JADX INFO: renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C3961c5 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C3961c5 f31113h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B7 f31120g;

    private C3961c5(Context context) {
        B7 b7I = Lb.U().i();
        this.f31120g = b7I;
        this.f31114a = b7I.q();
        this.f31115b = b7I.l();
        this.f31116c = b7I.f();
        this.f31117d = b7I.i();
        this.f31118e = b7I.e();
        this.f31119f = b7I.u(context);
    }

    public static C3961c5 b(Context context) {
        if (f31113h == null) {
            f31113h = new C3961c5(context);
        }
        return f31113h;
    }

    public static void g() {
        f31113h = null;
    }

    public float a(Context context) {
        return this.f31120g.E(context);
    }

    public int a() {
        return this.f31118e;
    }

    public String b() {
        return this.f31119f;
    }

    public String c() {
        return this.f31115b;
    }

    public String d() {
        return this.f31114a;
    }

    public String e() {
        return this.f31116c;
    }

    public String f() {
        return this.f31117d;
    }
}
