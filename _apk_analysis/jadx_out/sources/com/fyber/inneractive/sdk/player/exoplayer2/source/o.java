package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f18531b;

    public o(p pVar, int i10) {
        this.f18531b = pVar;
        this.f18530a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        p pVar2 = this.f18531b;
        int i10 = this.f18530a;
        if (pVar2.f18552u || pVar2.D != -9223372036854775807L) {
            return -3;
        }
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar2.f18546o.valueAt(i10)).a(pVar, cVar, z10, pVar2.F, pVar2.C);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        this.f18531b.f18540i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        p pVar = this.f18531b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f18546o.valueAt(this.f18530a);
        if (!pVar.F || j10 <= gVar.d()) {
            gVar.a(true, j10);
        } else {
            gVar.f();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        p pVar = this.f18531b;
        int i10 = this.f18530a;
        if (!pVar.F) {
            if (pVar.D != -9223372036854775807L) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f18546o.valueAt(i10)).f17455c;
            synchronized (eVar) {
                z10 = eVar.f17418i == 0;
            }
            if (z10) {
                return false;
            }
        }
        return true;
    }
}
