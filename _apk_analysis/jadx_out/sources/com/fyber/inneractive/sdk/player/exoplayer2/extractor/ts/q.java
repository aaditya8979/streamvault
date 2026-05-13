package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f18232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18236f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f18240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18242l;

    public q(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.f18231a = nVar;
        nVar.f18794a[0] = -1;
        this.f18232b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();
        this.f18233c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f18236f = 0;
        this.f18237g = 0;
        this.f18239i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f18234d = e0Var.f18114e;
        e0Var.b();
        this.f18235e = jVar.a(e0Var.f18113d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f18796c;
            int i11 = nVar.f18795b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f18236f;
            if (i13 == 0) {
                byte[] bArr = nVar.f18794a;
                while (true) {
                    if (i11 >= i10) {
                        nVar.e(i10);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f18239i && (b10 & 224) == 224;
                    this.f18239i = z10;
                    if (z11) {
                        nVar.e(i11 + 1);
                        this.f18239i = false;
                        this.f18231a.f18794a[1] = bArr[i11];
                        this.f18237g = 2;
                        this.f18236f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f18237g);
                nVar.a(this.f18231a.f18794a, this.f18237g, iMin);
                int i14 = this.f18237g + iMin;
                this.f18237g = i14;
                if (i14 >= 4) {
                    this.f18231a.e(0);
                    if (com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f18231a.b(), this.f18232b)) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f18232b;
                        this.f18241k = nVar2.f17965c;
                        if (!this.f18238h) {
                            long j10 = ((long) nVar2.f17969g) * 1000000;
                            int i15 = nVar2.f17966d;
                            this.f18240j = j10 / ((long) i15);
                            this.f18235e.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f18234d, nVar2.f17964b, -1, 4096, nVar2.f17967e, i15, null, null, this.f18233c));
                            this.f18238h = true;
                        }
                        this.f18231a.e(0);
                        this.f18235e.a(4, this.f18231a);
                        this.f18236f = 2;
                    } else {
                        this.f18237g = 0;
                        this.f18236f = 1;
                    }
                }
            } else if (i13 == 2) {
                int iMin2 = Math.min(i12, this.f18241k - this.f18237g);
                this.f18235e.a(iMin2, nVar);
                int i16 = this.f18237g + iMin2;
                this.f18237g = i16;
                int i17 = this.f18241k;
                if (i16 >= i17) {
                    this.f18235e.a(this.f18242l, 1, i17, 0, null);
                    this.f18242l += this.f18240j;
                    this.f18237g = 0;
                    this.f18236f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f18242l = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
