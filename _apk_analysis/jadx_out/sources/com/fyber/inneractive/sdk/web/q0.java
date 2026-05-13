package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements k1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f19695a;

    public q0(v0 v0Var) {
        this.f19695a = v0Var;
    }

    @Override // k1.a
    public final void a() {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.f19695a;
        v0Var.f19711b.a(v0Var.f19712c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f19715f, v0Var.f19713d, v0Var.f19717h.f16648a));
        this.f19695a.d("onShowInstallStarted();");
    }

    @Override // k1.a
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}
