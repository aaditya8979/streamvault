package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f18513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f18514b;

    public k(p pVar, n nVar) {
        this.f18514b = pVar;
        this.f18513a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f18513a;
        if (nVar.f18529c != null) {
            nVar.f18529c = null;
        }
        int size = this.f18514b.f18546o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f18514b.f18546o.valueAt(i10)).b();
        }
    }
}
