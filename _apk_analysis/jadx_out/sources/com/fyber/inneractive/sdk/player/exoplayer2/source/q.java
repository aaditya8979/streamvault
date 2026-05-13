package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.fyber.inneractive.sdk.player.controller.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements u, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.k f18560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f18562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f18563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.v f18564g = new com.fyber.inneractive.sdk.player.exoplayer2.v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f18565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18566i;

    public q(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.c cVar, int i10, Handler handler, b0 b0Var) {
        this.f18558a = uri;
        this.f18559b = gVar;
        this.f18560c = cVar;
        this.f18561d = i10;
        this.f18562e = handler;
        this.f18563f = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new p(this.f18558a, this.f18559b.a(), this.f18560c.a(), this.f18561d, this.f18562e, this.f18563f, this, bVar);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        p pVar = (p) sVar;
        pVar.f18540i.a(new k(pVar, pVar.f18541j));
        pVar.f18545n.removeCallbacksAndMessages(null);
        pVar.G = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        this.f18565h = tVar;
        tVar.a(new x(-9223372036854775807L, -9223372036854775807L, 0L, 0L, false, false), null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        boolean z10 = xVar.a(0, this.f18564g, false).f18833d != -9223372036854775807L;
        if (!this.f18566i || z10) {
            this.f18566i = z10;
            this.f18565h.a(xVar, null);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        this.f18565h = null;
    }
}
