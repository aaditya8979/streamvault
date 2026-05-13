package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18225a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18230f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f18227c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f18113d, 4);
        this.f18226b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f18114e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (this.f18227c) {
            int i10 = nVar.f18796c - nVar.f18795b;
            int i11 = this.f18230f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(nVar.f18794a, nVar.f18795b, this.f18225a.f18794a, this.f18230f, iMin);
                if (this.f18230f + iMin == 10) {
                    this.f18225a.e(0);
                    if (73 != this.f18225a.j() || 68 != this.f18225a.j() || 51 != this.f18225a.j()) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f18227c = false;
                        return;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f18225a;
                        nVar2.e(nVar2.f18795b + 3);
                        this.f18229e = this.f18225a.i() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f18229e - this.f18230f);
            this.f18226b.a(iMin2, nVar);
            this.f18230f += iMin2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f18227c = true;
            this.f18228d = j10;
            this.f18229e = 0;
            this.f18230f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        int i10;
        if (this.f18227c && (i10 = this.f18229e) != 0 && this.f18230f == i10) {
            this.f18226b.a(this.f18228d, 1, i10, 0, null);
            this.f18227c = false;
        }
    }
}
