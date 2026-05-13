package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g1 f19627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f19628c;

    public h(i iVar, String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.f19628c = iVar;
        this.f19627b = g1Var;
        this.f19626a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        i iVar = this.f19628c;
        String str = this.f19626a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.f19627b;
        j1 j1Var = iVar.f19636g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).f19521a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.f19626a;
    }
}
