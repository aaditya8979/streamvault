package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class On extends AbstractCallableC5265yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f65726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f65727f;

    public On(@NotNull C5024p0 c5024p0, @Nullable InterfaceC4661al interfaceC4661al, int i10, @NotNull Bundle bundle) {
        super(c5024p0, interfaceC4661al);
        this.f65726e = i10;
        this.f65727f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        iAppMetricaService.reportData(this.f65726e, this.f65727f);
    }
}
