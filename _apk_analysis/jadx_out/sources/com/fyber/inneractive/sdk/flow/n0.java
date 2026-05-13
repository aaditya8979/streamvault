package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.v1;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f16431a;

    public n0(p0 p0Var) {
        this.f16431a = p0Var;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        com.fyber.inneractive.sdk.util.r.f19556b.post(this.f16431a.f16516l);
        p0 p0Var = this.f16431a;
        v1 v1Var = p0Var.f16517m;
        if (v1Var != null) {
            v1Var.f19580e = null;
            p0Var.f16517m = null;
        }
        p0Var.f16521q = false;
    }
}
