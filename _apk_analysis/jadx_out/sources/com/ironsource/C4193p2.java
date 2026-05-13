package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4193p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f33196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f33197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f33198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<String> f33200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f33201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f33202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f33203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f33204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f33205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f33206t;

    public C4193p2() {
        this.f33188b = "";
        this.f33189c = "";
        this.f33190d = "";
        this.f33195i = 0L;
        this.f33196j = 0L;
        this.f33197k = 0L;
        this.f33198l = 0L;
        this.f33199m = true;
        this.f33200n = new ArrayList<>();
        this.f33193g = 0;
        this.f33201o = false;
        this.f33202p = false;
        this.f33203q = 1;
    }

    public C4193p2(String str, String str2, String str3, int i10, int i11, long j10, long j11, long j12, long j13, long j14, boolean z10, int i12, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15, boolean z16) {
        this.f33188b = str;
        this.f33189c = str2;
        this.f33190d = str3;
        this.f33191e = i10;
        this.f33192f = i11;
        this.f33194h = j10;
        this.f33187a = z13;
        this.f33195i = j11;
        this.f33196j = j12;
        this.f33197k = j13;
        this.f33198l = j14;
        this.f33199m = z10;
        this.f33193g = i12;
        this.f33200n = new ArrayList<>();
        this.f33201o = z11;
        this.f33202p = z12;
        this.f33203q = i13;
        this.f33204r = z14;
        this.f33205s = z15;
        this.f33206t = z16;
    }

    public String a() {
        return this.f33188b;
    }

    public String a(boolean z10) {
        return z10 ? this.f33190d : this.f33189c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33200n.add(str);
    }

    public long b() {
        return this.f33196j;
    }

    public int c() {
        return this.f33192f;
    }

    public int d() {
        return this.f33203q;
    }

    public boolean e() {
        return this.f33199m;
    }

    public ArrayList<String> f() {
        return this.f33200n;
    }

    public int g() {
        return this.f33191e;
    }

    public boolean h() {
        return this.f33187a;
    }

    public int i() {
        return this.f33193g;
    }

    public long j() {
        return this.f33197k;
    }

    public long k() {
        return this.f33195i;
    }

    public long l() {
        return this.f33198l;
    }

    public long m() {
        return this.f33194h;
    }

    public boolean n() {
        return this.f33206t;
    }

    public boolean o() {
        return this.f33201o;
    }

    public boolean p() {
        return this.f33202p;
    }

    public boolean q() {
        return this.f33205s;
    }

    public boolean r() {
        return this.f33204r;
    }
}
