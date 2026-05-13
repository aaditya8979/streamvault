package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.flow.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f15818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r f15819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f15820c;

    public t(y yVar, c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f15820c = yVar;
        this.f15818a = c0Var;
        this.f15819b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15820c.a(this.f15818a, this.f15819b);
    }
}
