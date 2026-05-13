package com.ironsource;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class U2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f30518p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H1 f30519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f30521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<C4049h3> f30523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4049h3 f30524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4193p2 f30527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f30529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f30533o;

    public U2() {
        this.f30519a = new H1();
        this.f30523e = new ArrayList<>();
    }

    public U2(int i10, long j10, boolean z10, H1 h12, int i11, C4193p2 c4193p2, int i12, boolean z11, long j11, boolean z12, boolean z13, boolean z14, long j12) {
        this.f30523e = new ArrayList<>();
        this.f30520b = i10;
        this.f30521c = j10;
        this.f30522d = z10;
        this.f30519a = h12;
        this.f30525g = i11;
        this.f30526h = i12;
        this.f30527i = c4193p2;
        this.f30528j = z11;
        this.f30529k = j11;
        this.f30530l = z12;
        this.f30531m = z13;
        this.f30532n = z14;
        this.f30533o = j12;
    }

    public int a() {
        return this.f30520b;
    }

    public C4049h3 a(String str) {
        for (C4049h3 c4049h3 : this.f30523e) {
            if (c4049h3.c().equals(str)) {
                return c4049h3;
            }
        }
        return null;
    }

    public void a(C4049h3 c4049h3) {
        if (c4049h3 != null) {
            this.f30523e.add(c4049h3);
            if (this.f30524f == null) {
                this.f30524f = c4049h3;
            } else if (c4049h3.a(0)) {
                this.f30524f = c4049h3;
            }
        }
    }

    public long b() {
        return this.f30521c;
    }

    public boolean c() {
        return this.f30522d;
    }

    public C4193p2 d() {
        return this.f30527i;
    }

    public long e() {
        return this.f30529k;
    }

    public int f() {
        return this.f30526h;
    }

    public H1 g() {
        return this.f30519a;
    }

    public int h() {
        return this.f30525g;
    }

    @NotNull
    public C4049h3 i() {
        for (C4049h3 c4049h3 : this.f30523e) {
            if (c4049h3.d()) {
                return c4049h3;
            }
        }
        C4049h3 c4049h32 = this.f30524f;
        return c4049h32 != null ? c4049h32 : new C4178o5();
    }

    public long j() {
        return this.f30533o;
    }

    public boolean k() {
        return this.f30528j;
    }

    public boolean l() {
        return this.f30530l;
    }

    public boolean m() {
        return this.f30532n;
    }

    public boolean n() {
        return this.f30531m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f30520b + ", bidderExclusive=" + this.f30522d + '}';
    }
}
