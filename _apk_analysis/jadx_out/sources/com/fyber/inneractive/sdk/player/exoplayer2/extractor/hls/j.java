package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.u;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f17530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f17531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f17532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f17533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f17534e;

    public j(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, Handler handler, b0 b0Var) {
        b bVar = new b(gVar);
        this.f17530a = uri;
        this.f17531b = bVar;
        this.f17532c = new com.fyber.inneractive.sdk.player.exoplayer2.source.f(handler, b0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new i(this.f17533d, this.f17531b, this.f17532c, bVar, j10);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f17533d;
        kVar.f17646h.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = kVar.f17649k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) kVar.f17642d.get(aVar);
            hVar.f17629b.b();
            IOException iOException = hVar.f17637j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        i iVar = (i) sVar;
        iVar.f17514a.f17645g.remove(iVar);
        iVar.f17521h.removeCallbacksAndMessages(null);
        n[] nVarArr = iVar.f17527n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                int size = nVar.f17547j.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f17547j.valueAt(i10)).b();
                }
                nVar.f17544g.a(null);
                nVar.f17550m.removeCallbacksAndMessages(null);
                nVar.f17556s = true;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        if (this.f17533d != null) {
            throw new IllegalStateException();
        }
        Uri uri = this.f17530a;
        b bVar = this.f17531b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k(uri, bVar, this.f17532c, this);
        this.f17533d = kVar;
        this.f17534e = tVar;
        d0 d0Var = new d0(bVar.f17471a.a(), uri, kVar.f17640b);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = kVar.f17646h;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, kVar, 3, SystemClock.elapsedRealtime());
        if (b0Var.f18604b != null) {
            throw new IllegalStateException();
        }
        b0Var.f18604b = yVar;
        yVar.f18755e = null;
        b0Var.f18603a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f17533d;
        if (kVar != null) {
            kVar.f17646h.a(null);
            Iterator it = kVar.f17642d.values().iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) it.next()).f17629b.a(null);
            }
            kVar.f17643e.removeCallbacksAndMessages(null);
            kVar.f17642d.clear();
            this.f17533d = null;
        }
        this.f17534e = null;
    }
}
