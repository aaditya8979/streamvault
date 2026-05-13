package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4724d6 extends Qg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f66583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5215wh f66584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5104s6 f66585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L1 f66586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5005o6 f66587j;

    public C4724d6(@NotNull Context context, @NotNull C5024p0 c5024p0, @Nullable InterfaceC4661al interfaceC4661al, @NotNull C5215wh c5215wh) {
        super(c5024p0, interfaceC4661al, c5215wh);
        this.f66583f = context;
        this.f66584g = c5215wh;
        this.f66585h = C4696c4.l().i();
        this.f66586i = C4696c4.l().f();
        this.f66587j = new C5005o6(context);
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh
    public final synchronized void a() {
        if (this.f68046c) {
            return;
        }
        this.f68046c = true;
        String strA = this.f66585h.f67665a.a();
        L1 l12 = this.f66586i;
        Context context = this.f66583f;
        l12.getClass();
        ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
        if (tn.p.f(strA, serviceInfo != null ? serviceInfo.processName : null)) {
            this.f66587j.a(this.f66584g);
        } else {
            this.f68044a.c();
            this.f68046c = false;
            super.a();
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh
    public final boolean c() {
        this.f66587j.a(this.f66584g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC5265yh, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return bn.r.f5635a;
    }
}
