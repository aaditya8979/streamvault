package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18511a;

    public i(p pVar) {
        this.f18511a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f18511a;
        if (pVar.G || pVar.f18550s || pVar.f18548q == null || !pVar.f18549r) {
            return;
        }
        int size = pVar.f18546o.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f18546o.valueAt(i10)).e() == null) {
                return;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = pVar.f18542k;
        synchronized (eVar) {
            eVar.f18767a = false;
        }
        y[] yVarArr = new y[size];
        pVar.f18557z = new boolean[size];
        pVar.f18556y = new boolean[size];
        pVar.f18555x = pVar.f18548q.c();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 >= size) {
                pVar.f18554w = new z(yVarArr);
                pVar.f18550s = true;
                t tVar = pVar.f18537f;
                long j10 = pVar.f18555x;
                tVar.a(new x(j10, j10, 0L, 0L, pVar.f18548q.a(), false), null);
                ((com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f18547p).f18356f.obtainMessage(8, pVar).sendToTarget();
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f18546o.valueAt(i11)).e();
            yVarArr[i11] = new y(oVarE);
            String str = oVarE.f18453f;
            if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) && !"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                z10 = false;
            }
            pVar.f18557z[i11] = z10;
            pVar.A = z10 | pVar.A;
            i11++;
        }
    }
}
