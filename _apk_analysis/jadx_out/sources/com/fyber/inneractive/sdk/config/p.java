package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f16089a;

    public p(s sVar) {
        this.f16089a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.f16089a;
            if (oVar.equals(sVar.f16144b)) {
                return;
            }
            sVar.f16146d = true;
            sVar.f16144b = oVar;
            com.fyber.inneractive.sdk.util.r.f19555a.execute(new q(sVar));
        }
    }
}
