package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class Zd {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f30827o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<C4041gd> f30828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H1 f30829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C4041gd f30839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C4193p2 f30840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30841n;

    public Zd() {
        this.f30828a = new ArrayList<>();
        this.f30829b = new H1();
    }

    public Zd(int i10, boolean z10, int i11, int i12, H1 h12, C4193p2 c4193p2, int i13, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f30828a = new ArrayList<>();
        this.f30830c = i10;
        this.f30831d = z10;
        this.f30832e = i11;
        this.f30829b = h12;
        this.f30833f = i12;
        this.f30840m = c4193p2;
        this.f30834g = i13;
        this.f30841n = z11;
        this.f30835h = j10;
        this.f30836i = z12;
        this.f30837j = z13;
        this.f30838k = z14;
    }

    public C4041gd a() {
        for (C4041gd c4041gd : this.f30828a) {
            if (c4041gd.d()) {
                return c4041gd;
            }
        }
        return this.f30839l;
    }

    public C4041gd a(String str) {
        for (C4041gd c4041gd : this.f30828a) {
            if (c4041gd.c().equals(str)) {
                return c4041gd;
            }
        }
        return null;
    }

    public void a(C4041gd c4041gd) {
        if (c4041gd != null) {
            this.f30828a.add(c4041gd);
            if (this.f30839l == null) {
                this.f30839l = c4041gd;
            } else if (c4041gd.a(0)) {
                this.f30839l = c4041gd;
            }
        }
    }

    public int b() {
        return this.f30834g;
    }

    public int c() {
        return this.f30833f;
    }

    public boolean d() {
        return this.f30841n;
    }

    public ArrayList<C4041gd> e() {
        return this.f30828a;
    }

    public boolean f() {
        return this.f30836i;
    }

    public int g() {
        return this.f30830c;
    }

    public int h() {
        return this.f30832e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f30832e);
    }

    public boolean j() {
        return this.f30831d;
    }

    public C4193p2 k() {
        return this.f30840m;
    }

    public long l() {
        return this.f30835h;
    }

    public H1 m() {
        return this.f30829b;
    }

    public boolean n() {
        return this.f30838k;
    }

    public boolean o() {
        return this.f30837j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f30830c + ", bidderExclusive=" + this.f30831d + '}';
    }
}
