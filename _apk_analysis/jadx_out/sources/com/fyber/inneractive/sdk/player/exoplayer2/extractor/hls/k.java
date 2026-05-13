package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.source.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f17536b;

    public k(n nVar, int i10) {
        this.f17536b = nVar;
        this.f17535a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        n nVar = this.f17536b;
        int i10 = this.f17535a;
        if (nVar.f17561x != -9223372036854775807L) {
            return -3;
        }
        loop0: while (nVar.f17548k.size() > 1) {
            int i11 = ((h) nVar.f17548k.getFirst()).f17497j;
            for (int i12 = 0; i12 < nVar.f17547j.size(); i12++) {
                if (nVar.f17559v[i12]) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f17547j.valueAt(i12)).f17455c;
                    if ((eVar.f17418i == 0 ? eVar.f17427r : eVar.f17411b[eVar.f17420k]) == i11) {
                        break loop0;
                    }
                }
            }
            nVar.f17548k.removeFirst();
        }
        h hVar = (h) nVar.f17548k.getFirst();
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = hVar.f18493c;
        if (!oVar.equals(nVar.f17554q)) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = nVar.f17545h;
            int i13 = nVar.f17538a;
            int i14 = hVar.f18494d;
            Object obj = hVar.f18495e;
            long j10 = hVar.f18496f;
            if (fVar.f18509b != null) {
                fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.e(fVar, i13, oVar, i14, obj, j10));
            }
        }
        nVar.f17554q = oVar;
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f17547j.valueAt(i10)).a(pVar, cVar, z10, nVar.f17562y, nVar.f17560w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        n nVar = this.f17536b;
        nVar.f17544g.b();
        f fVar = nVar.f17540c;
        com.fyber.inneractive.sdk.player.exoplayer2.source.g gVar = fVar.f17490j;
        if (gVar != null) {
            throw gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f17491k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f17485e.f17642d.get(aVar);
            hVar.f17629b.b();
            IOException iOException = hVar.f17637j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        n nVar = this.f17536b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f17547j.valueAt(this.f17535a);
        if (!nVar.f17562y || j10 <= gVar.d()) {
            gVar.a(true, j10);
        } else {
            gVar.f();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        n nVar = this.f17536b;
        int i10 = this.f17535a;
        if (!nVar.f17562y) {
            if (nVar.f17561x != -9223372036854775807L) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f17547j.valueAt(i10)).f17455c;
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
