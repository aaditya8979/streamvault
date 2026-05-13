package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18512a;

    public j(p pVar) {
        this.f18512a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f18512a;
        if (pVar.G) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f18547p;
        lVar.getClass();
        lVar.f18356f.obtainMessage(9, pVar).sendToTarget();
    }
}
