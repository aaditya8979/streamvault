package io.appmetrica.analytics.impl;

import android.os.RemoteException;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class Qg extends AbstractCallableC5265yh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5215wh f65817e;

    public Qg(@NotNull C5024p0 c5024p0, @Nullable InterfaceC4661al interfaceC4661al, @NotNull C5215wh c5215wh) {
        super(c5024p0, interfaceC4661al);
        this.f65817e = c5215wh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh
    public final void a(@NotNull IAppMetricaService iAppMetricaService) throws RemoteException {
        C5215wh c5215wh = this.f65817e;
        iAppMetricaService.reportData(c5215wh.f67904c, c5215wh.f67902a.d(c5215wh.f67906e.c()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh
    public final void a(@Nullable Throwable th2) {
    }
}
