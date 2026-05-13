package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b f17639a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j f17644f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f17647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f17648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f17649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f17650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17651m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17641c = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f17645g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f17646h = new b0("HlsPlaylistTracker:MasterPlaylist");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f17640b = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f17642d = new IdentityHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f17643e = new Handler();

    public k(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar) {
        this.f17639a = bVar;
        this.f17647i = fVar;
        this.f17644f = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        boolean z10;
        d0 d0Var = (d0) zVar;
        boolean z11 = iOException instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f17647i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f18674a;
        long j12 = d0Var.f18679f;
        if (fVar.f18509b != null) {
            z10 = z11;
            fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10));
        } else {
            z10 = z11;
        }
        return z10 ? 3 : 0;
    }

    public final d a(a aVar) {
        d dVar;
        h hVar = (h) this.f17642d.get(aVar);
        hVar.getClass();
        hVar.f17634g = SystemClock.elapsedRealtime();
        d dVar2 = hVar.f17631d;
        if (dVar2 != null && this.f17648j.f17574b.contains(aVar) && (((dVar = this.f17650l) == null || !dVar.f17596j) && ((h) this.f17642d.get(this.f17649k)).f17634g - SystemClock.elapsedRealtime() > 15000)) {
            this.f17649k = aVar;
            ((h) this.f17642d.get(aVar)).b();
        }
        return dVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        d0 d0Var;
        b bVar;
        d0 d0Var2 = (d0) zVar;
        e eVar = d0Var2.f18677d;
        boolean z10 = eVar instanceof d;
        if (z10) {
            d0Var = d0Var2;
            List listSingletonList = Collections.singletonList(new a(eVar.f17602a, new o("0", "application/x-mpegURL", null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            List listEmptyList = Collections.emptyList();
            bVar = new b(null, listSingletonList, listEmptyList, listEmptyList, null, null);
        } else {
            d0Var = d0Var2;
            bVar = (b) eVar;
        }
        this.f17648j = bVar;
        this.f17649k = (a) bVar.f17574b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bVar.f17574b);
        arrayList.addAll(bVar.f17575c);
        arrayList.addAll(bVar.f17576d);
        int size = arrayList.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            this.f17642d.put(aVar, new h(this, aVar, jElapsedRealtime));
        }
        h hVar = (h) this.f17642d.get(this.f17649k);
        if (z10) {
            hVar.a((d) eVar);
        } else {
            hVar.b();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f17647i;
        d0 d0Var3 = d0Var;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var3.f18674a;
        long j12 = d0Var3.f18679f;
        if (fVar.f18509b != null) {
            fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f17647i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f18674a;
        long j12 = d0Var.f18679f;
        if (fVar.f18509b != null) {
            fVar.f18508a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12));
        }
    }
}
