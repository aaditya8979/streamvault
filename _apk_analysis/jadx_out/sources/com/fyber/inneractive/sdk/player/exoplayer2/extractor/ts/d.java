package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f18087r = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18088a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18094g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f18102o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f18103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f18104q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f18089b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[7]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18090c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(Arrays.copyOf(f18087r, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18095h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18096i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18097j = 256;

    public d(boolean z10, String str) {
        this.f18088a = z10;
        this.f18091d = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f18095h = 0;
        this.f18096i = 0;
        this.f18097j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f18092e = e0Var.f18114e;
        e0Var.b();
        this.f18093f = jVar.a(e0Var.f18113d, 1);
        if (!this.f18088a) {
            this.f18094g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.h();
            return;
        }
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f18113d, 4);
        this.f18094g = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f18114e, "application/id3", (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
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
            int i13 = this.f18095h;
            if (i13 == 0) {
                byte[] bArr = nVar.f18794a;
                while (true) {
                    if (i11 >= i10) {
                        nVar.e(i11);
                        break;
                    }
                    int i14 = i11 + 1;
                    byte b10 = bArr[i11];
                    int i15 = b10 & 255;
                    int i16 = this.f18097j;
                    if (i16 != 512 || i15 < 240 || i15 == 255) {
                        int i17 = i16 | i15;
                        if (i17 == 329) {
                            this.f18097j = 768;
                        } else if (i17 == 511) {
                            this.f18097j = 512;
                        } else if (i17 == 836) {
                            this.f18097j = 1024;
                        } else {
                            if (i17 == 1075) {
                                this.f18095h = 1;
                                this.f18096i = 3;
                                this.f18101n = 0;
                                this.f18090c.e(0);
                                nVar.e(i14);
                                break;
                            }
                            if (i16 != 256) {
                                this.f18097j = 256;
                            }
                        }
                        i11 = i14;
                    } else {
                        this.f18098k = (b10 & 1) == 0;
                        this.f18095h = 2;
                        this.f18096i = 0;
                        nVar.e(i14);
                    }
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f18090c.f18794a;
                int iMin = Math.min(i12, 10 - this.f18096i);
                nVar.a(bArr2, this.f18096i, iMin);
                int i18 = this.f18096i + iMin;
                this.f18096i = i18;
                if (i18 == 10) {
                    this.f18094g.a(10, this.f18090c);
                    this.f18090c.e(6);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f18094g;
                    int i19 = this.f18090c.i() + 10;
                    this.f18095h = 3;
                    this.f18096i = 10;
                    this.f18103p = rVar;
                    this.f18104q = 0L;
                    this.f18101n = i19;
                }
            } else if (i13 == 2) {
                int i20 = this.f18098k ? 7 : 5;
                byte[] bArr3 = this.f18089b.f18790a;
                int iMin2 = Math.min(i12, i20 - this.f18096i);
                nVar.a(bArr3, this.f18096i, iMin2);
                int i21 = this.f18096i + iMin2;
                this.f18096i = i21;
                if (i21 == i20) {
                    this.f18089b.b(0);
                    if (this.f18099l) {
                        this.f18089b.c(10);
                    } else {
                        int iA = this.f18089b.a(2) + 1;
                        if (iA != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + iA + ", but assuming AAC LC.");
                            iA = 2;
                        }
                        int iA2 = this.f18089b.a(4);
                        this.f18089b.c(1);
                        byte[] bArr4 = {(byte) (((iA << 3) & 248) | ((iA2 >> 1) & 7)), (byte) (((iA2 << 7) & 128) | ((this.f18089b.a(3) << 3) & 120))};
                        Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr4);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f18092e, "audio/mp4a-latm", -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr4), null, this.f18091d);
                        this.f18100m = 1024000000 / ((long) oVarA.f18466s);
                        this.f18093f.a(oVarA);
                        this.f18099l = true;
                    }
                    this.f18089b.c(4);
                    int iA3 = this.f18089b.a(13);
                    int i22 = iA3 - 7;
                    if (this.f18098k) {
                        i22 = iA3 - 9;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f18093f;
                    long j10 = this.f18100m;
                    this.f18095h = 3;
                    this.f18096i = 0;
                    this.f18103p = rVar2;
                    this.f18104q = j10;
                    this.f18101n = i22;
                }
            } else if (i13 == 3) {
                int iMin3 = Math.min(i12, this.f18101n - this.f18096i);
                this.f18103p.a(iMin3, nVar);
                int i23 = this.f18096i + iMin3;
                this.f18096i = i23;
                int i24 = this.f18101n;
                if (i23 == i24) {
                    this.f18103p.a(this.f18102o, 1, i24, 0, null);
                    this.f18102o += this.f18104q;
                    this.f18095h = 0;
                    this.f18096i = 0;
                    this.f18097j = 256;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f18102o = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
