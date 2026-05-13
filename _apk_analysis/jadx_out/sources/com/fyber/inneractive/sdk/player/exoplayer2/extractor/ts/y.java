package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f18282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18284c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        long j10;
        long j11;
        long j12 = -9223372036854775807L;
        if (!this.f18284c) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.f18282a;
            long j13 = 0;
            if ((vVar.f18818a == Long.MAX_VALUE ? 0L : vVar.f18820c == -9223372036854775807L ? -9223372036854775807L : vVar.f18819b) == -9223372036854775807L) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f18283b;
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2 = this.f18282a;
            if (vVar2.f18818a == Long.MAX_VALUE) {
                j11 = j13;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f18284c = true;
            } else if (vVar2.f18820c == -9223372036854775807L) {
                j11 = -9223372036854775807L;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f18284c = true;
            } else {
                j13 = vVar2.f18819b;
                j11 = j13;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, "application/x-scte35", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f18284c = true;
            }
        }
        int i10 = nVar.f18796c - nVar.f18795b;
        this.f18283b.a(i10, nVar);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f18283b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3 = this.f18282a;
        if (vVar3.f18820c == -9223372036854775807L) {
            long j14 = vVar3.f18818a;
            if (j14 != Long.MAX_VALUE) {
                j10 = j14;
            }
            rVar2.a(j10, 1, i10, 0, null);
        }
        j12 = vVar3.f18820c;
        j10 = j12;
        rVar2.a(j10, 1, i10, 0, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f18282a = vVar;
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f18113d, 4);
        this.f18283b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f18114e, "application/x-scte35", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }
}
