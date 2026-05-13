package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Le implements InterfaceC5185vc, ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5107s9 f65531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5160uc f65532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5160uc f65533c;

    public Le(@NotNull InterfaceC5107s9 interfaceC5107s9, @NotNull Rg rg2, @NotNull C5028p4 c5028p4, @NotNull Xe xe2) {
        this.f65531a = interfaceC5107s9;
        C5160uc c5160uc = new C5160uc(rg2, c5028p4, xe2);
        this.f65532b = c5160uc;
        this.f65533c = c5160uc;
        if (c5160uc.b()) {
            return;
        }
        C5009oa.k().a().subscribe(TimeUnit.SECONDS.toMillis(J7.f65432a.longValue()), C5009oa.k().w().d(), this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5185vc
    @NotNull
    public final G8 a() {
        return this.f65533c;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f65532b.a();
        ((C4929l5) this.f65531a.a()).e();
    }
}
