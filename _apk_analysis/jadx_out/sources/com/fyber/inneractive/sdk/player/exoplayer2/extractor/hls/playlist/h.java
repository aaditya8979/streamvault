package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements x, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f17629b = new b0("HlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f17630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f17631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17635h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IOException f17637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f17638k;

    public h(k kVar, a aVar, long j10) {
        this.f17638k = kVar;
        this.f17628a = aVar;
        this.f17634g = j10;
        this.f17630c = new d0(kVar.f17639a.f17471a.a(), com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(kVar.f17648j.f17602a, aVar.f17572a), kVar.f17640b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        boolean z10;
        d0 d0Var = (d0) zVar;
        boolean z11 = iOException instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f17638k.f17647i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f18674a;
        long j12 = d0Var.f18679f;
        if (fVar.f18509b != null) {
            z10 = z11;
            fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10));
        } else {
            z10 = z11;
        }
        if (z10) {
            return 3;
        }
        if (!(iOException instanceof v)) {
            return 0;
        }
        int i10 = ((v) iOException).f18748a;
        if (i10 != 404 && i10 != 410) {
            return 0;
        }
        a();
        k kVar2 = this.f17638k;
        if (kVar2.f17649k == this.f17628a) {
            List list = kVar2.f17648j.f17574b;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = (h) kVar2.f17642d.get(list.get(i11));
                if (jElapsedRealtime > hVar.f17635h) {
                    kVar2.f17649k = hVar.f17628a;
                    hVar.b();
                }
            }
            return 0;
        }
        return 2;
    }

    public final void a() {
        this.f17635h = SystemClock.elapsedRealtime() + 60000;
        k kVar = this.f17638k;
        a aVar = this.f17628a;
        int size = kVar.f17645g.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.f17645g.get(i10);
            for (n nVar : iVar.f17527n) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = nVar.f17540c;
                int iA = fVar.f17486f.a(aVar.f17573b);
                if (iA != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.f17496p;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bVar.f18586b) {
                            i11 = -1;
                            break;
                        } else if (bVar.f18587c[i11] == iA) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 != -1) {
                        fVar.f17496p.a(i11);
                    }
                }
            }
            if (iVar.f17526m != null) {
                l lVar = (l) iVar.f17523j;
                lVar.getClass();
                lVar.f18356f.obtainMessage(9, iVar).sendToTarget();
            } else {
                for (n nVar2 : iVar.f17527n) {
                    if (!nVar2.f17552o) {
                        nVar2.b(nVar2.f17560w);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d r29) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f18677d;
        if (!(eVar instanceof d)) {
            this.f17637j = new r("Loaded playlist has unexpected type.");
            return;
        }
        a((d) eVar);
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f17638k.f17647i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f18674a;
        long j12 = d0Var.f18679f;
        if (fVar.f18509b != null) {
            fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f17638k.f17647i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f18674a;
        long j12 = d0Var.f18679f;
        if (fVar.f18509b != null) {
            fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    public final void b() {
        this.f17635h = 0L;
        if (this.f17636i || this.f17629b.a()) {
            return;
        }
        b0 b0Var = this.f17629b;
        d0 d0Var = this.f17630c;
        int i10 = this.f17638k.f17641c;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, this, i10, SystemClock.elapsedRealtime());
        if (b0Var.f18604b != null) {
            throw new IllegalStateException();
        }
        b0Var.f18604b = yVar;
        yVar.f18755e = null;
        b0Var.f18603a.execute(yVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17636i = false;
        b();
    }
}
