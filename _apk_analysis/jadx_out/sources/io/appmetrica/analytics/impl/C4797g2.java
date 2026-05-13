package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.C4797g2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4797g2 {
    public static final boolean a(Throwable th2) {
        return true;
    }

    @NotNull
    public final Ga a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull Ua ua2) {
        return new Ch(new C4807gc(ua2, appMetricaConfig), new InterfaceC4878j6() { // from class: mh.f0
            @Override // io.appmetrica.analytics.impl.InterfaceC4878j6
            public final boolean a(Throwable th2) {
                return C4797g2.a(th2);
            }
        }, appMetricaConfig.crashTransformer, new N9(context));
    }
}
