package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f19343a;

    public n(p pVar) {
        this.f19343a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f19343a;
        if (pVar.f19353t != null) {
            IAlog.a("%sIdle state reached!", IAlog.a(pVar));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19343a.f19322k;
            if (bVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.s) bVar).j(true);
            }
            this.f19343a.f19353t = null;
        }
    }
}
