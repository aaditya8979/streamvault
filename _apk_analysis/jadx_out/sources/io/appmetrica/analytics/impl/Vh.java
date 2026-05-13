package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class Vh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f66048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66049b;

    public Vh(C4839hi c4839hi, ReporterConfig reporterConfig) {
        this.f66049b = c4839hi;
        this.f66048a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66049b;
        ReporterConfig reporterConfig = this.f66048a;
        C5273z0 c5273z0 = c4839hi.f66922a;
        Context context = c4839hi.f66925d;
        c5273z0.getClass();
        C5248y0.a(context).f().a(reporterConfig);
    }
}
