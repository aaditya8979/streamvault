package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3358dd implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jg f27030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rg f27031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hc f27032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gc f27033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3307be f27034e;

    public C3358dd(InMobiNative inMobiNative, Context context, long j10) {
        tn.p.k(inMobiNative, "inMobiNative");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        Jg jg2 = new Jg();
        jg2.f25731a = j10;
        this.f27030a = jg2;
        C3332cd c3332cd = new C3332cd(this);
        Rg rg2 = new Rg();
        this.f27031b = rg2;
        Hc hc2 = new Hc(inMobiNative, rg2, c3332cd);
        this.f27032c = hc2;
        this.f27033d = new Gc(context, jg2, hc2);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return this.f27033d.a(d10);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return this.f27033d.a(i10, d10);
    }
}
