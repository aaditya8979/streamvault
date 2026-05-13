package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes3.dex */
public class b implements a.InterfaceC0147a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f8993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f8994c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.f8992a = kVar;
        this.f8993b = new a(kVar);
        this.f8994c = new c(kVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(c3 c3Var) {
        h hVarA;
        if (c3Var == null || (hVarA = c3Var.A()) == null || !c3Var.w().compareAndSet(false, true)) {
            return;
        }
        t2.e(hVarA.c(), c3Var);
    }

    public void a() {
        this.f8994c.a();
        this.f8993b.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(c3 c3Var) {
        c(c3Var);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0147a
    public void b(final c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f9245b.c(c3Var);
            }
        }, c3Var.m0());
    }

    public void e(c3 c3Var) {
        long jN0 = c3Var.n0();
        if (jN0 >= 0) {
            this.f8994c.a(c3Var, jN0);
        }
        if (c3Var.x0() || c3Var.y0()) {
            this.f8993b.a(c3Var, this);
        }
    }
}
