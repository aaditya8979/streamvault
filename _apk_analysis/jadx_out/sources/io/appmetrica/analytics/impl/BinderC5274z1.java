package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class BinderC5274z1 extends IAppMetricaService.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B1 f68054a;

    public BinderC5274z1(@NotNull B1 b12) {
        this.f68054a = b12;
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(@NotNull Bundle bundle) {
        ((C1) this.f68054a).pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i10, @NotNull Bundle bundle) {
        ((C1) this.f68054a).reportData(i10, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(@NotNull Bundle bundle) {
        ((C1) this.f68054a).resumeUserSession(bundle);
    }
}
