package com.inmobi.media;

import com.inmobi.media.Ll;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Nl f25895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3882yc f25896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3882yc f25897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3882yc f25898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3882yc f25899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3882yc f25900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3882yc f25901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3882yc f25902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3882yc f25903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3882yc f25904j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3882yc f25905k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3882yc f25906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N5 f25907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3882yc f25908n;

    public Ll(Mc mc2, Nl nl2) {
        tn.p.k(mc2, "nativeBeaconMacroData");
        tn.p.k(nl2, "trackerData");
        this.f25895a = nl2;
        C3312bj c3312bj = new C3312bj(mc2, new sn.a() { // from class: n9.z2
            @Override // sn.a
            public final Object invoke() {
                return Ll.d(this.f75717b);
            }
        });
        C3312bj c3312bj2 = new C3312bj(mc2, new sn.a() { // from class: n9.i3
            @Override // sn.a
            public final Object invoke() {
                return Ll.e(this.f75422b);
            }
        });
        this.f25896b = new C3882yc(mc2, new sn.a() { // from class: n9.j3
            @Override // sn.a
            public final Object invoke() {
                return Ll.c(this.f75441b);
            }
        });
        this.f25897c = new C3882yc(mc2, new sn.a() { // from class: n9.k3
            @Override // sn.a
            public final Object invoke() {
                return Ll.f(this.f75457b);
            }
        });
        this.f25898d = new C3882yc(mc2, new sn.a() { // from class: n9.l3
            @Override // sn.a
            public final Object invoke() {
                return Ll.g(this.f75478b);
            }
        });
        this.f25899e = new C3882yc(mc2, new sn.a() { // from class: n9.m3
            @Override // sn.a
            public final Object invoke() {
                return Ll.b(this.f75497b);
            }
        });
        this.f25900f = new C3882yc(mc2, new sn.a() { // from class: n9.a3
            @Override // sn.a
            public final Object invoke() {
                return Ll.i(this.f75281b);
            }
        });
        this.f25901g = new C3882yc(mc2, new sn.a() { // from class: n9.b3
            @Override // sn.a
            public final Object invoke() {
                return Ll.m(this.f75295b);
            }
        });
        this.f25902h = new C3882yc(mc2, new sn.a() { // from class: n9.c3
            @Override // sn.a
            public final Object invoke() {
                return Ll.j(this.f75314b);
            }
        });
        this.f25903i = new C3882yc(mc2, new sn.a() { // from class: n9.d3
            @Override // sn.a
            public final Object invoke() {
                return Ll.n(this.f75329b);
            }
        });
        this.f25904j = new C3882yc(mc2, new sn.a() { // from class: n9.e3
            @Override // sn.a
            public final Object invoke() {
                return Ll.k(this.f75348b);
            }
        });
        this.f25905k = new C3882yc(mc2, new sn.a() { // from class: n9.f3
            @Override // sn.a
            public final Object invoke() {
                return Ll.l(this.f75363b);
            }
        });
        this.f25906l = new C3882yc(mc2, new sn.a() { // from class: n9.g3
            @Override // sn.a
            public final Object invoke() {
                return Ll.h(this.f75383b);
            }
        });
        this.f25907m = new N5(mc2, nl2, c3312bj, c3312bj2);
        this.f25908n = new C3882yc(mc2, new sn.a() { // from class: n9.h3
            @Override // sn.a
            public final Object invoke() {
                return Ll.a(this.f75397b);
            }
        });
    }

    public static final List a(Ll ll2) {
        return AbstractC3899z4.a("companion_view", ll2.f25895a.f26051a.f27256a);
    }

    public static final List b(Ll ll2) {
        return ll2.a("complete", "complete");
    }

    public static final List c(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE, "firstQuartile");
    }

    public static final List d(Ll ll2) {
        return AbstractC3899z4.a("progress_received", ll2.f25895a.f26051a.f27256a);
    }

    public static final List e(Ll ll2) {
        return AbstractC3899z4.a("progress_occurred", ll2.f25895a.f26051a.f27256a);
    }

    public static final List f(Ll ll2) {
        return ll2.a("second_quartile", CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public static final List g(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE, "thirdQuartile");
    }

    public static final List h(Ll ll2) {
        return ll2.a("error", "error");
    }

    public static final List i(Ll ll2) {
        return ll2.a("load", C3978d4.i.f31359r);
    }

    public static final List j(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_MUTE, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    }

    public static final List k(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public static final List l(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public static final List m(Ll ll2) {
        return ll2.a("start", "start");
    }

    public static final List n(Ll ll2) {
        return ll2.a(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    }

    public final List a(String str, String str2) {
        return cn.f0.O0(Jl.a(str2, this.f25895a.f26052b), AbstractC3899z4.a(str, this.f25895a.f26051a.f27256a));
    }
}
