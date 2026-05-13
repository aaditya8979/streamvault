package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f16513a;

    public o0(p0 p0Var) {
        this.f16513a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        Runnable runnable = this.f16513a.f16518n;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.post(runnable);
        }
        p0 p0Var = this.f16513a;
        v1 v1Var = p0Var.f16519o;
        if (v1Var != null) {
            v1Var.f19580e = null;
            p0Var.f16519o = null;
        }
    }
}
