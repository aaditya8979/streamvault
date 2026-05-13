package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3534kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f27466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Za f27468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Dc f27469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3572m1 f27470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3580m9 f27471g;

    public C3534kd(Context context, G g10, boolean z10, Za za2, Dc dc2, InterfaceC3572m1 interfaceC3572m1, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(g10, "adContext");
        tn.p.k(za2, "telemetryMetaData");
        tn.p.k(dc2, "adTelemetryHelper");
        tn.p.k(interfaceC3572m1, "adUnitCallback");
        this.f27465a = context;
        this.f27466b = g10;
        this.f27467c = z10;
        this.f27468d = za2;
        this.f27469e = dc2;
        this.f27470f = interfaceC3572m1;
        this.f27471g = interfaceC3580m9;
    }
}
