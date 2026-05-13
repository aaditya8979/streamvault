package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class Gc implements InterfaceC3712rh, Ck, ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3605n9 f25527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ac f25528b;

    public Gc(Context context, Jg jg2, Hc hc2) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(jg2, "pubSettings");
        tn.p.k(hc2, "nativeCallbacks");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k("native", "logType");
        tn.p.k("native", "adType");
        tn.p.k(jg2, "pubSettings");
        Ab ab2 = Jh.f25738a;
        this.f25527a = Jh.a("native", jg2.f25737g);
        this.f25528b = new Ac(new C3622o1(context, this, new C3647p1(this, jg2)), hc2);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return this.f25528b.a(d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return this.f25528b.a(i10, d10);
    }

    @Override // com.inmobi.media.InterfaceC3712rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        tn.p.k(inMobiNativeViewData, "inMobiNativeViewData");
        this.f25528b.a(inMobiNativeViewData);
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        this.f25528b.d();
    }
}
