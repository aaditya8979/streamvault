package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdFormat f16190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16191b;

    public c(e eVar, AdFormat adFormat) {
        this.f16191b = eVar;
        this.f16190a = adFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            QueryInfo.generate(o.f19548a, this.f16190a, e.a(this.f16191b), new b(this));
        } catch (Throwable th2) {
            IAlog.a("Error in resolveDVTokens", th2, new Object[0]);
        }
    }
}
