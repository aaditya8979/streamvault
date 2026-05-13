package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16754b;

    public d(e eVar, Context context) {
        this.f16754b = eVar;
        this.f16753a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Omid.activate(this.f16753a);
            this.f16754b.f16759e = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            e.a(this.f16754b, this.f16753a);
            IAlog.a("OMID SDK was activated - version %s", Omid.getVersion());
            IAlog.d("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th2) {
            IAlog.a("Failed starting omsdk with exception %s", th2.getLocalizedMessage());
            this.f16754b.getClass();
            z.a(th2.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th2.getMessage(), null, null);
        }
    }
}
