package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17824e;

    public h(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f17820a = nVar;
        nVar.e(12);
        this.f17822c = nVar.m() & 255;
        this.f17821b = nVar.m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f17821b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i10 = this.f17822c;
        if (i10 == 8) {
            return this.f17820a.j();
        }
        if (i10 == 16) {
            return this.f17820a.o();
        }
        int i11 = this.f17823d;
        this.f17823d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f17824e & 15;
        }
        int iJ = this.f17820a.j();
        this.f17824e = iJ;
        return (iJ & 240) >> 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return false;
    }
}
