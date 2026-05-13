package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4640a0 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4666b0 f66327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f66328b;

    public C4640a0(C4666b0 c4666b0, Context context) {
        this.f66327a = c4666b0;
        this.f66328b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C4666b0 c4666b0 = this.f66327a;
        Context context = this.f66328b;
        c4666b0.getClass();
        c4666b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
