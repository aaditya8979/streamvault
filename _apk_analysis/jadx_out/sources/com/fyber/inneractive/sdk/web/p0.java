package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements k1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f19693c;

    public p0(v0 v0Var, String str, String str2) {
        this.f19693c = v0Var;
        this.f19691a = str;
        this.f19692b = str2;
    }

    @Override // k1.a
    public final void a() {
        v0 v0Var = this.f19693c;
        v0Var.f19711b.a(v0Var.f19712c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f19715f, v0Var.f19713d, v0Var.f19717h.f16648a));
        this.f19693c.d("onShowInstallStarted();");
    }

    @Override // k1.a
    public final void a(String str) {
        v0 v0Var = this.f19693c;
        v0Var.f19711b.m();
        v0Var.d("onInstallationFailed();");
        v0 v0Var2 = this.f19693c;
        v0Var2.f19717h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.f19691a, this.f19692b, v0Var2.f19713d);
    }
}
