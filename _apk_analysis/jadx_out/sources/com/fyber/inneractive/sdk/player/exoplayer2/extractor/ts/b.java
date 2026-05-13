package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f18054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18059f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f18063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18065l;

    public b(String str) {
        byte[] bArr = new byte[8];
        this.f18054a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr);
        this.f18055b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        this.f18056c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f18059f = 0;
        this.f18060g = 0;
        this.f18061h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f18057d = e0Var.f18114e;
        e0Var.b();
        this.f18058e = jVar.a(e0Var.f18113d, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iA;
        int i10;
        String str;
        int iA2;
        int i11;
        int i12;
        while (true) {
            int i13 = nVar.f18796c - nVar.f18795b;
            if (i13 <= 0) {
                return;
            }
            int i14 = this.f18059f;
            if (i14 == 0) {
                while (true) {
                    if (nVar.f18796c - nVar.f18795b <= 0) {
                        break;
                    }
                    if (this.f18061h) {
                        int iJ = nVar.j();
                        if (iJ == 119) {
                            this.f18061h = false;
                            this.f18059f = 1;
                            byte[] bArr = this.f18055b.f18794a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f18060g = 2;
                            break;
                        }
                        this.f18061h = iJ == 11;
                    } else {
                        this.f18061h = nVar.j() == 11;
                    }
                }
            } else if (i14 == 1) {
                byte[] bArr2 = this.f18055b.f18794a;
                int iMin = Math.min(i13, 8 - this.f18060g);
                nVar.a(bArr2, this.f18060g, iMin);
                int i15 = this.f18060g + iMin;
                this.f18060g = i15;
                if (i15 == 8) {
                    this.f18054a.b(0);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f18054a;
                    int i16 = (mVar.f18791b * 8) + mVar.f18792c;
                    mVar.c(40);
                    Object[] objArr = mVar.a(5) == 16;
                    mVar.b(i16);
                    int i17 = 6;
                    if (objArr == true) {
                        mVar.c(21);
                        iA2 = (mVar.a(11) + 1) * 2;
                        int iA3 = mVar.a(2);
                        if (iA3 == 3) {
                            i12 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17242c[mVar.a(2)];
                        } else {
                            i17 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17240a[mVar.a(2)];
                            i12 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17241b[iA3];
                        }
                        i11 = i17 * 256;
                        iA = mVar.a(3);
                        i10 = i12;
                        str = "audio/eac3";
                    } else {
                        mVar.c(32);
                        int iA4 = mVar.a(2);
                        int iA5 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(iA4, mVar.a(6));
                        mVar.c(8);
                        iA = mVar.a(3);
                        if ((iA & 1) != 0 && iA != 1) {
                            mVar.c(2);
                        }
                        if ((iA & 4) != 0) {
                            mVar.c(2);
                        }
                        if (iA == 2) {
                            mVar.c(2);
                        }
                        i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17241b[iA4];
                        str = "audio/ac3";
                        iA2 = iA5;
                        i11 = 1536;
                    }
                    int i18 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f17243d[iA] + (mVar.b() ? 1 : 0);
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f18063j;
                    if (oVar == null || i18 != oVar.f18465r || i10 != oVar.f18466s || str != oVar.f18453f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f18057d, str, -1, -1, i18, i10, null, null, this.f18056c);
                        this.f18063j = oVarA;
                        this.f18058e.a(oVarA);
                    }
                    this.f18064k = iA2;
                    this.f18062i = (((long) i11) * 1000000) / ((long) this.f18063j.f18466s);
                    this.f18055b.e(0);
                    this.f18058e.a(8, this.f18055b);
                    this.f18059f = 2;
                }
            } else if (i14 == 2) {
                int iMin2 = Math.min(i13, this.f18064k - this.f18060g);
                this.f18058e.a(iMin2, nVar);
                int i19 = this.f18060g + iMin2;
                this.f18060g = i19;
                int i20 = this.f18064k;
                if (i19 == i20) {
                    this.f18058e.a(this.f18065l, 1, i20, 0, null);
                    this.f18065l += this.f18062i;
                    this.f18059f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f18065l = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
