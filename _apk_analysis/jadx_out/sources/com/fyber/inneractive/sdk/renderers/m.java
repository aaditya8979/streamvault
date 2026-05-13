package com.fyber.inneractive.sdk.renderers;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements com.fyber.inneractive.sdk.player.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f19342a;

    public m(p pVar) {
        this.f19342a = pVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19342a.f19322k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.f19342a.f19322k).y();
        }
    }
}
