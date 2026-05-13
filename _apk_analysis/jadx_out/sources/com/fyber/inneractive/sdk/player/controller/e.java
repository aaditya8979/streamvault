package com.fyber.inneractive.sdk.player.controller;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f17155a;

    public e(f fVar) {
        this.f17155a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f17155a.f17160s;
        if (gVar != null) {
            gVar.a(gVar.a(), -9223372036854775807L);
            this.f17155a.f17160s.f18306d.f18356f.sendEmptyMessage(5);
            com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f17155a.f17160s;
            gVar2.f18306d.d();
            gVar2.f18305c.removeCallbacksAndMessages(null);
            this.f17155a.f17160s = null;
        }
    }
}
