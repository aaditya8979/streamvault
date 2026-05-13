package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f16175a;

    public z(a0 a0Var) {
        this.f16175a = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16175a.f15981a.K = new com.fyber.inneractive.sdk.measurement.e();
        a0 a0Var = this.f16175a;
        com.fyber.inneractive.sdk.measurement.e eVar = a0Var.f15981a.K;
        Context context = a0Var.f15982b;
        if (eVar.f16755a) {
            return;
        }
        eVar.f16755a = true;
        com.fyber.inneractive.sdk.util.r.f19556b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
