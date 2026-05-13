package com.inmobi.media;

import com.inmobi.media.Lc;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pc f25867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3312bj f25868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3882yc f25869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3312bj f25870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3312bj f25871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3312bj f25872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3312bj f25873g;

    public Lc(Mc mc2, Pc pc2) {
        tn.p.k(mc2, "nativeBeaconMacroData");
        tn.p.k(pc2, "trackerData");
        this.f25867a = pc2;
        this.f25868b = new C3312bj(mc2, new sn.a() { // from class: n9.r2
            @Override // sn.a
            public final Object invoke() {
                return Lc.c(this.f75596b);
            }
        });
        this.f25869c = new C3882yc(mc2, new sn.a() { // from class: n9.s2
            @Override // sn.a
            public final Object invoke() {
                return Lc.a();
            }
        });
        this.f25870d = new C3312bj(mc2, new sn.a() { // from class: n9.t2
            @Override // sn.a
            public final Object invoke() {
                return Lc.e(this.f75622b);
            }
        });
        this.f25871e = new C3312bj(mc2, new sn.a() { // from class: n9.u2
            @Override // sn.a
            public final Object invoke() {
                return Lc.b(this.f75638b);
            }
        });
        this.f25872f = new C3312bj(mc2, new sn.a() { // from class: n9.v2
            @Override // sn.a
            public final Object invoke() {
                return Lc.a(this.f75653b);
            }
        });
        this.f25873g = new C3312bj(mc2, new sn.a() { // from class: n9.w2
            @Override // sn.a
            public final Object invoke() {
                return Lc.d(this.f75667b);
            }
        });
    }

    public static final List a() {
        return cn.w.m();
    }

    public static final List a(Lc lc2) {
        return cn.f0.O0(AbstractC3899z4.a("impression", lc2.f25867a.f26127a.f28455a), Jl.a(VastTagName.IMPRESSION, lc2.f25867a.f26128b));
    }

    public static final List b(Lc lc2) {
        return AbstractC3899z4.a("impression_shown", lc2.f25867a.f26127a.f28455a);
    }

    public static final List c(Lc lc2) {
        return AbstractC3899z4.a(C3978d4.i.f31359r, lc2.f25867a.f26127a.f28455a);
    }

    public static final List d(Lc lc2) {
        return AbstractC3899z4.a("mrc50", lc2.f25867a.f26127a.f28455a);
    }

    public static final List e(Lc lc2) {
        return AbstractC3899z4.a("start_tracking", lc2.f25867a.f26127a.f28455a);
    }
}
