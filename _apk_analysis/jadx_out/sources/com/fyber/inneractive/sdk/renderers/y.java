package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements com.fyber.inneractive.sdk.ui.controller.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f19368a;

    public y(a0 a0Var) {
        this.f19368a = a0Var;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void u() {
        a0 a0Var = this.f19368a;
        boolean z10 = a0Var.f19301m;
        if (z10) {
            return;
        }
        if (a0Var.f16282b != null && !z10) {
            a0Var.f19301m = true;
            IAlog.a("%sTracking impression", IAlog.a(a0Var));
            com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) a0Var.f16282b);
            a0Var.f19302n = aVar;
            aVar.a(a0Var);
        }
        a0Var.G();
    }
}
