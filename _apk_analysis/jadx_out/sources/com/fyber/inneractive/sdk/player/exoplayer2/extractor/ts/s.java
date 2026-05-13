package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f18248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f18249b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18250c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f18252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18259l;

    public s(h hVar) {
        this.f18248a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f18250c = 0;
        this.f18251d = 0;
        this.f18255h = false;
        this.f18248a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int i10;
        if (z10) {
            int i11 = this.f18250c;
            if (i11 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i11 == 3) {
                if (this.f18257j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f18257j + " more bytes");
                }
                this.f18248a.b();
            }
            this.f18250c = 1;
            this.f18251d = 0;
        }
        while (true) {
            int i12 = nVar.f18796c;
            int i13 = nVar.f18795b;
            int i14 = i12 - i13;
            if (i14 <= 0) {
                return;
            }
            int i15 = this.f18250c;
            if (i15 == 0) {
                nVar.e(i14 + i13);
            } else if (i15 != 1) {
                if (i15 == 2) {
                    if (a(nVar, this.f18249b.f18790a, Math.min(10, this.f18256i)) && a(nVar, (byte[]) null, this.f18256i)) {
                        this.f18249b.b(0);
                        this.f18259l = -9223372036854775807L;
                        if (this.f18253f) {
                            this.f18249b.c(4);
                            long jA = ((long) this.f18249b.a(3)) << 30;
                            this.f18249b.c(1);
                            long jA2 = jA | ((long) (this.f18249b.a(15) << 15));
                            this.f18249b.c(1);
                            long jA3 = jA2 | ((long) this.f18249b.a(15));
                            this.f18249b.c(1);
                            if (!this.f18255h && this.f18254g) {
                                this.f18249b.c(4);
                                long jA4 = ((long) this.f18249b.a(3)) << 30;
                                this.f18249b.c(1);
                                long jA5 = jA4 | ((long) (this.f18249b.a(15) << 15));
                                this.f18249b.c(1);
                                long jA6 = jA5 | ((long) this.f18249b.a(15));
                                this.f18249b.c(1);
                                this.f18252e.b(jA6);
                                this.f18255h = true;
                            }
                            this.f18259l = this.f18252e.b(jA3);
                        }
                        this.f18248a.a(this.f18258k, this.f18259l);
                        this.f18250c = 3;
                        this.f18251d = 0;
                    }
                } else if (i15 == 3) {
                    int i16 = this.f18257j;
                    int i17 = i16 == -1 ? 0 : i14 - i16;
                    if (i17 > 0) {
                        i14 -= i17;
                        nVar.d(i13 + i14);
                    }
                    this.f18248a.a(nVar);
                    int i18 = this.f18257j;
                    if (i18 != -1) {
                        int i19 = i18 - i14;
                        this.f18257j = i19;
                        if (i19 == 0) {
                            this.f18248a.b();
                            this.f18250c = 1;
                            this.f18251d = 0;
                        }
                    }
                }
            } else if (a(nVar, this.f18249b.f18790a, 9)) {
                this.f18249b.b(0);
                int iA = this.f18249b.a(24);
                if (iA != 1) {
                    Log.w("PesReader", "Unexpected start code prefix: " + iA);
                    this.f18257j = -1;
                    i10 = 0;
                } else {
                    this.f18249b.c(8);
                    int iA2 = this.f18249b.a(16);
                    this.f18249b.c(5);
                    this.f18258k = this.f18249b.b();
                    this.f18249b.c(2);
                    this.f18253f = this.f18249b.b();
                    this.f18254g = this.f18249b.b();
                    this.f18249b.c(6);
                    int iA3 = this.f18249b.a(8);
                    this.f18256i = iA3;
                    if (iA2 == 0) {
                        this.f18257j = -1;
                    } else {
                        this.f18257j = (iA2 - 3) - iA3;
                    }
                    i10 = 2;
                }
                this.f18250c = i10;
                this.f18251d = 0;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f18252e = vVar;
        this.f18248a.a(jVar, e0Var);
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, byte[] bArr, int i10) {
        int iMin = Math.min(nVar.f18796c - nVar.f18795b, i10 - this.f18251d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nVar.e(nVar.f18795b + iMin);
        } else {
            nVar.a(bArr, this.f18251d, iMin);
        }
        int i11 = this.f18251d + iMin;
        this.f18251d = i11;
        return i11 == i10;
    }
}
