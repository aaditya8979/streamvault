package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.q0;

/* JADX INFO: loaded from: classes.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f16373a;

    public s(u uVar) {
        this.f16373a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        IAlog.a("%s End-Card loaded", this.f16373a.f16304a);
        this.f16373a.f16381h.set(false);
        u uVar = this.f16373a;
        uVar.getClass();
        boolean z10 = iVar != null;
        uVar.f16379f = z10;
        com.fyber.inneractive.sdk.web.m mVar = z10 ? iVar.f19631b : null;
        String str = IAConfigManager.O.H.f15885e;
        if (!uVar.f() || mVar == null || TextUtils.isEmpty(str)) {
            uVar.f16305b.m();
        } else {
            q0.a(mVar, str, uVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.f("%s End-Card failed to load!", this.f16373a.f16304a);
        this.f16373a.f16381h.set(false);
        u uVar = this.f16373a;
        uVar.f16379f = false;
        uVar.f16305b.a(inneractiveInfrastructureError);
    }
}
