package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Fi extends AbstractCallableC5265yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cf f65255e;

    public Fi(@NotNull C5024p0 c5024p0, @Nullable InterfaceC4661al interfaceC4661al, @NotNull Cf cf2) {
        super(c5024p0, interfaceC4661al);
        this.f65255e = cf2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Cf cf2 = this.f65255e;
        synchronized (cf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf2);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
