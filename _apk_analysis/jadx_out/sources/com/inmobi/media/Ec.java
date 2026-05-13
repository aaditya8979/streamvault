package com.inmobi.media;

import com.inmobi.media.Ec;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class Ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3844x f25379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiJsonResponse f25380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ac f25381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ic f25382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3567ll f25383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn.g f25384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bn.g f25385g;

    public Ec(C3844x c3844x, InMobiJsonResponse inMobiJsonResponse, Ac ac2) {
        tn.p.k(c3844x, "adComponent");
        tn.p.k(inMobiJsonResponse, "inMobiJsonResponse");
        tn.p.k(ac2, "adUnitCallback");
        this.f25379a = c3844x;
        this.f25380b = inMobiJsonResponse;
        this.f25381c = ac2;
        this.f25382d = new Ic(c3844x);
        this.f25384f = kotlin.b.b(new sn.a() { // from class: n9.x
            @Override // sn.a
            public final Object invoke() {
                return Ec.b(this.f75684b);
            }
        });
        this.f25385g = kotlin.b.b(new sn.a() { // from class: n9.y
            @Override // sn.a
            public final Object invoke() {
                return Ec.a(this.f75698b);
            }
        });
    }

    public static final C3558lc a(Ec ec2) {
        C3622o1 c3622o1 = ec2.f25382d.f25655a.f28472a;
        return new C3558lc(c3622o1.f27734b, c3622o1.f27737e, c3622o1.f27735c);
    }

    public static final Dc b(Ec ec2) {
        return (Dc) ec2.f25382d.f25656b.getValue();
    }
}
