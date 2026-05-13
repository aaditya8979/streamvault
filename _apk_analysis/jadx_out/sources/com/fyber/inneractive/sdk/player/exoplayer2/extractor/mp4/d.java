package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17812i;

    public d(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2, boolean z10) {
        this.f17810g = nVar;
        this.f17809f = nVar2;
        this.f17808e = z10;
        nVar2.e(12);
        this.f17804a = nVar2.m();
        nVar.e(12);
        this.f17812i = nVar.m();
        if (!(nVar.b() == 1)) {
            throw new IllegalStateException("first_chunk must be 1");
        }
        this.f17805b = -1;
    }

    public final boolean a() {
        int i10 = this.f17805b + 1;
        this.f17805b = i10;
        if (i10 == this.f17804a) {
            return false;
        }
        this.f17807d = this.f17808e ? this.f17809f.n() : this.f17809f.k();
        if (this.f17805b == this.f17811h) {
            this.f17806c = this.f17810g.m();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f17810g;
            nVar.e(nVar.f18795b + 4);
            int i11 = this.f17812i - 1;
            this.f17812i = i11;
            this.f17811h = i11 > 0 ? this.f17810g.m() - 1 : -1;
        }
        return true;
    }
}
