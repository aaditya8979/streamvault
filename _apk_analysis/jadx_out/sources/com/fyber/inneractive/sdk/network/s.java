package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f17028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f17029f;

    public s(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.flow.o oVar) {
        super(rVar, str, oVar);
        this.f17028e = inneractiveAdRequest;
        q0 q0Var = new q0(new q(this), inneractiveAdRequest, rVar);
        this.f17029f = q0Var;
        q0Var.f17037d = new r(this);
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final void a() {
        this.f17004b = true;
        this.f17003a = null;
        this.f17029f.f17034a = true;
    }

    @Override // com.fyber.inneractive.sdk.network.m
    public final String b() {
        return this.f17029f.r();
    }
}
