package com.applovin.impl.mediation;

import com.applovin.impl.c3;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f9004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.g0 f9005d;

    public interface a {
        void a(c3 c3Var);
    }

    public c(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f9002a = kVar;
        this.f9003b = kVar.O();
        this.f9004c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c3 c3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9003b.a("AdHiddenCallbackTimeoutManager", "Timing out...");
        }
        this.f9004c.a(c3Var);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9003b.a("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        com.applovin.impl.g0 g0Var = this.f9005d;
        if (g0Var != null) {
            g0Var.a();
            this.f9005d = null;
        }
    }

    public void a(final c3 c3Var, long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9003b.a("AdHiddenCallbackTimeoutManager", "Scheduling in " + j10 + "ms...");
        }
        this.f9005d = com.applovin.impl.g0.a(j10, this.f9002a, new Runnable() { // from class: com.applovin.impl.mediation.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f9249b.a(c3Var);
            }
        });
    }
}
