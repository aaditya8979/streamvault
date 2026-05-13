package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f18285a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f18286b;

    public z(b0 b0Var) {
        this.f18286b = b0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (nVar.j() != 0) {
            return;
        }
        nVar.e(nVar.f18795b + 7);
        int i10 = (nVar.f18796c - nVar.f18795b) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f18285a;
            nVar.a(mVar.f18790a, 0, 4);
            mVar.b(0);
            int iA = this.f18285a.a(16);
            this.f18285a.c(3);
            if (iA == 0) {
                this.f18285a.c(13);
            } else {
                int iA2 = this.f18285a.a(13);
                b0 b0Var = this.f18286b;
                b0Var.f18074f.put(iA2, new w(new a0(b0Var, iA2)));
                this.f18286b.f18077i++;
            }
        }
        b0 b0Var2 = this.f18286b;
        if (b0Var2.f18069a != 2) {
            b0Var2.f18074f.remove(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
    }
}
