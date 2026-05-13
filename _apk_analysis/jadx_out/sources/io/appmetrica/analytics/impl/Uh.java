package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class Uh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f66005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f66006b;

    public Uh(C4839hi c4839hi, ReporterConfig reporterConfig) {
        this.f66006b = c4839hi;
        this.f66005a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f66006b;
        ReporterConfig reporterConfig = this.f66005a;
        C5273z0 c5273z0 = c4839hi.f66922a;
        Context context = c4839hi.f66925d;
        c5273z0.getClass();
        C5248y0.a(context).f().a(reporterConfig);
    }
}
