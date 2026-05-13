package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f18123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18125k;

    public f(String str) {
        byte[] bArr = new byte[15];
        this.f18115a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        bArr[0] = 127;
        bArr[1] = -2;
        bArr[2] = -128;
        bArr[3] = 1;
        this.f18119e = 0;
        this.f18116b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f18119e = 0;
        this.f18120f = 0;
        this.f18121g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f18117c = e0Var.f18114e;
        e0Var.b();
        this.f18118d = jVar.a(e0Var.f18113d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f18796c - nVar.f18795b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f18119e;
            if (i11 == 0) {
                while (true) {
                    if (nVar.f18796c - nVar.f18795b > 0) {
                        int i12 = this.f18121g << 8;
                        this.f18121g = i12;
                        int iJ = i12 | nVar.j();
                        this.f18121g = iJ;
                        if (iJ == 2147385345) {
                            this.f18121g = 0;
                            this.f18120f = 4;
                            this.f18119e = 1;
                            break;
                        }
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr = this.f18115a.f18794a;
                int iMin = Math.min(i10, 15 - this.f18120f);
                nVar.a(bArr, this.f18120f, iMin);
                int i13 = this.f18120f + iMin;
                this.f18120f = i13;
                if (i13 == 15) {
                    byte[] bArr2 = this.f18115a.f18794a;
                    if (this.f18123i == null) {
                        String str = this.f18117c;
                        String str2 = this.f18116b;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr2);
                        mVar.c(60);
                        int i14 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f17318a[mVar.a(6)];
                        int i15 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f17319b[mVar.a(4)];
                        int iA = mVar.a(5);
                        int i16 = iA >= 29 ? -1 : (com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f17320c[iA] * 1000) / 2;
                        mVar.c(10);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, "audio/vnd.dts", i16, -1, i14 + (mVar.a(2) > 0 ? 1 : 0), i15, null, null, str2);
                        this.f18123i = oVarA;
                        this.f18118d.a(oVarA);
                    }
                    this.f18124j = (((bArr2[5] & 2) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f18122h = (int) ((((long) (((((bArr2[4] & 1) << 6) | ((r3 & 252) >> 2)) + 1) * 32)) * 1000000) / ((long) this.f18123i.f18466s));
                    this.f18115a.e(0);
                    this.f18118d.a(15, this.f18115a);
                    this.f18119e = 2;
                }
            } else if (i11 == 2) {
                int iMin2 = Math.min(i10, this.f18124j - this.f18120f);
                this.f18118d.a(iMin2, nVar);
                int i17 = this.f18120f + iMin2;
                this.f18120f = i17;
                int i18 = this.f18124j;
                if (i17 == i18) {
                    this.f18118d.a(this.f18125k, 1, i18, 0, null);
                    this.f18125k += this.f18122h;
                    this.f18119e = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f18125k = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
