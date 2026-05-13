package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.t;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f18634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f18637d;

    public f(l lVar, o oVar) {
        t tVar = new t();
        d dVar = new d(lVar);
        this.f18634a = lVar;
        this.f18635b = oVar;
        this.f18636c = tVar;
        this.f18637d = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        l lVar = this.f18634a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA = this.f18635b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVarA2 = this.f18636c.a();
        d dVar = this.f18637d;
        return new e(lVar, hVarA, hVarA2, dVar != null ? new c(dVar.f18616a) : null);
    }
}
