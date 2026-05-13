package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class H9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f29512n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<M9> f29513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H1 f29514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f29517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4193p2 f29519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f29521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f29524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private M9 f29525m;

    public H9() {
        this.f29513a = new ArrayList<>();
        this.f29514b = new H1();
        this.f29519g = new C4193p2();
    }

    public H9(int i10, boolean z10, int i11, H1 h12, C4193p2 c4193p2, int i12, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f29513a = new ArrayList<>();
        this.f29515c = i10;
        this.f29516d = z10;
        this.f29517e = i11;
        this.f29514b = h12;
        this.f29519g = c4193p2;
        this.f29522j = z12;
        this.f29523k = z13;
        this.f29518f = i12;
        this.f29520h = z11;
        this.f29521i = j10;
        this.f29524l = z14;
    }

    public M9 a() {
        for (M9 m92 : this.f29513a) {
            if (m92.d()) {
                return m92;
            }
        }
        return this.f29525m;
    }

    public M9 a(String str) {
        for (M9 m92 : this.f29513a) {
            if (m92.c().equals(str)) {
                return m92;
            }
        }
        return null;
    }

    public void a(M9 m92) {
        if (m92 != null) {
            this.f29513a.add(m92);
            if (this.f29525m == null) {
                this.f29525m = m92;
            } else if (m92.a(0)) {
                this.f29525m = m92;
            }
        }
    }

    public int b() {
        return this.f29518f;
    }

    public int c() {
        return this.f29515c;
    }

    public int d() {
        return this.f29517e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f29517e);
    }

    public boolean f() {
        return this.f29516d;
    }

    public C4193p2 g() {
        return this.f29519g;
    }

    public long h() {
        return this.f29521i;
    }

    public H1 i() {
        return this.f29514b;
    }

    public boolean j() {
        return this.f29520h;
    }

    public boolean k() {
        return this.f29522j;
    }

    public boolean l() {
        return this.f29524l;
    }

    public boolean m() {
        return this.f29523k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f29515c + ", bidderExclusive=" + this.f29516d + '}';
    }
}
