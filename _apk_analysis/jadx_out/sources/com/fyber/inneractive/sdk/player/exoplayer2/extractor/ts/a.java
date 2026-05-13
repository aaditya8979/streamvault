package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.io.EOFException;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18044e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18046b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f18047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18048d;

    public a(long j10) {
        this.f18045a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        byte[] bArr = this.f18046b.f18794a;
        int i10 = bVar.f17404f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 2786);
            System.arraycopy(bVar.f17402d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            iMin = bVar.a(bArr, 0, 2786, 0, true);
        }
        if (iMin != -1) {
            bVar.f17401c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f18046b.e(0);
        this.f18046b.d(iMin);
        if (!this.f18048d) {
            this.f18047c.f18065l = this.f18045a;
            this.f18048d = true;
        }
        this.f18047c.a(this.f18046b);
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f18048d = false;
        this.f18047c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        b bVar = new b(null);
        this.f18047c = bVar;
        bVar.f18057d = "0";
        bVar.f18058e = jVar.a(0, 1);
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int iA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f18794a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f18044e) {
                break;
            }
            nVar.e(nVar.f18795b + 3);
            int i11 = nVar.i();
            i10 += i11 + 10;
            bVar.a(i11, false);
        }
        bVar.f17403e = 0;
        bVar.a(i10, false);
        int i12 = 0;
        int i13 = i10;
        while (true) {
            bVar.a(nVar.f18794a, 0, 5, false);
            nVar.e(0);
            if (nVar.o() != 2935) {
                bVar.f17403e = 0;
                i13++;
                if (i13 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = nVar.f18794a;
                if (bArr.length < 5) {
                    iA = -1;
                } else {
                    byte b10 = bArr[4];
                    iA = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a((b10 & 192) >> 6, b10 & 63);
                }
                if (iA == -1) {
                    return false;
                }
                bVar.a(iA - 5, false);
            }
        }
    }
}
