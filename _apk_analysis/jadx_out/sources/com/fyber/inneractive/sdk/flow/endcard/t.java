package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* JADX INFO: loaded from: classes.dex */
public final class t implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f16374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f16375b;

    public t(u uVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f16375b = uVar;
        this.f16374a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        this.f16375b.f16381h.set(false);
        this.f16375b.f16382i.a(iVar);
        this.f16374a.a();
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f16375b.f16381h.set(false);
        this.f16375b.f16382i.a(iVar, inneractiveInfrastructureError);
        this.f16374a.a(inneractiveInfrastructureError.description());
    }
}
