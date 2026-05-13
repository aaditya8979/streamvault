package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5112se extends AbstractCallableC5265yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cf f67674e;

    public C5112se(@NotNull C5024p0 c5024p0, @Nullable InterfaceC4661al interfaceC4661al, @NotNull Cf cf2) {
        super(c5024p0, interfaceC4661al);
        this.f67674e = cf2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        Bundle bundle = new Bundle();
        Cf cf2 = this.f67674e;
        synchronized (cf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf2);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}
