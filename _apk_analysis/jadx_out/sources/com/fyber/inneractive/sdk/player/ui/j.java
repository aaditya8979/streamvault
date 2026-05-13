package com.fyber.inneractive.sdk.player.ui;

import com.fyber.inneractive.sdk.player.controller.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f19028b;

    public j(l lVar, int i10) {
        this.f19028b = lVar;
        this.f19027a = i10;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        if (this.f19028b.f19023h) {
            IAlog.a("Autoclick is aborted - app in background", new Object[0]);
        } else {
            IAlog.a("Autoclick is triggered", new Object[0]);
            ((z) this.f19028b.f19022g).a(this.f19027a, l.I);
        }
        this.f19028b.p();
    }
}
