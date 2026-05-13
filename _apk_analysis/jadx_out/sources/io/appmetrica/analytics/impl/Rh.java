package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class Rh implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5273z0 f65839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f65840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f65841c;

    public Rh(C5273z0 c5273z0, Context context, ReporterConfig reporterConfig) {
        this.f65839a = c5273z0;
        this.f65840b = context;
        this.f65841c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C5273z0 c5273z0 = this.f65839a;
        Context context = this.f65840b;
        ReporterConfig reporterConfig = this.f65841c;
        c5273z0.getClass();
        return C5248y0.a(context).f().c(reporterConfig);
    }
}
