package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: loaded from: classes4.dex */
public interface Ca {
    C4773f4 a();

    void a(AppMetricaConfig appMetricaConfig, Ua ua2);

    Handler b();

    T1 c();

    C4935lb d();

    ICommonExecutor getDefaultExecutor();
}
