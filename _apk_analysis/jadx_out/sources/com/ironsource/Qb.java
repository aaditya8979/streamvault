package com.ironsource;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Qb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f30295m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f30296n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private H1 f30298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f30300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList<C3950bc> f30302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private C3950bc f30303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f30304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private C4193p2 f30305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f30306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f30307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f30308l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public Qb(int i10, long j10, boolean z10, @NotNull H1 h12, @NotNull C4193p2 c4193p2, int i11, long j11, boolean z11, boolean z12, boolean z13) {
        tn.p.k(h12, "events");
        tn.p.k(c4193p2, "auctionSettings");
        this.f30297a = z13;
        this.f30302f = new ArrayList<>();
        this.f30299c = i10;
        this.f30300d = j10;
        this.f30301e = z10;
        this.f30298b = h12;
        this.f30304h = i11;
        this.f30305i = c4193p2;
        this.f30306j = j11;
        this.f30307k = z11;
        this.f30308l = z12;
    }

    @Nullable
    public final C3950bc a(@NotNull String str) {
        tn.p.k(str, "placementName");
        for (C3950bc c3950bc : this.f30302f) {
            if (tn.p.f(c3950bc.c(), str)) {
                return c3950bc;
            }
        }
        return null;
    }

    public final void a(int i10) {
        this.f30299c = i10;
    }

    public final void a(long j10) {
        this.f30300d = j10;
    }

    public final void a(@NotNull H1 h12) {
        tn.p.k(h12, "<set-?>");
        this.f30298b = h12;
    }

    public final void a(@Nullable C3950bc c3950bc) {
        if (c3950bc != null) {
            this.f30302f.add(c3950bc);
            if (this.f30303g == null) {
                this.f30303g = c3950bc;
            } else if (c3950bc.b() == 0) {
                this.f30303g = c3950bc;
            }
        }
    }

    public final void a(@NotNull C4193p2 c4193p2) {
        tn.p.k(c4193p2, "<set-?>");
        this.f30305i = c4193p2;
    }

    public final void a(boolean z10) {
        this.f30301e = z10;
    }

    public final boolean a() {
        return this.f30301e;
    }

    public final int b() {
        return this.f30299c;
    }

    public final void b(int i10) {
        this.f30304h = i10;
    }

    public final void b(long j10) {
        this.f30306j = j10;
    }

    public final void b(boolean z10) {
        this.f30307k = z10;
    }

    public final long c() {
        return this.f30300d;
    }

    public final void c(boolean z10) {
        this.f30308l = z10;
    }

    @NotNull
    public final C4193p2 d() {
        return this.f30305i;
    }

    @Nullable
    public final C3950bc e() {
        for (C3950bc c3950bc : this.f30302f) {
            if (c3950bc.d()) {
                return c3950bc;
            }
        }
        return this.f30303g;
    }

    public final int f() {
        return this.f30304h;
    }

    @NotNull
    public final H1 g() {
        return this.f30298b;
    }

    public final long h() {
        return this.f30306j;
    }

    public final boolean i() {
        return this.f30307k;
    }

    public final boolean j() {
        return this.f30297a;
    }

    public final boolean k() {
        return this.f30308l;
    }

    @NotNull
    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f30299c + ", bidderExclusive=" + this.f30301e + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
    }
}
