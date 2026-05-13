package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.io.EOFException;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18080e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f18082b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(200);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f18083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18084d;

    public c(long j10) {
        this.f18081a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        byte[] bArr = this.f18082b.f18794a;
        int i10 = bVar.f17404f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 200);
            System.arraycopy(bVar.f17402d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            iMin = bVar.a(bArr, 0, 200, 0, true);
        }
        if (iMin != -1) {
            bVar.f17401c += (long) iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f18082b.e(0);
        this.f18082b.d(iMin);
        if (!this.f18084d) {
            this.f18083c.f18102o = this.f18081a;
            this.f18084d = true;
        }
        this.f18083c.a(this.f18082b);
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f18084d = false;
        d dVar = this.f18083c;
        dVar.f18095h = 0;
        dVar.f18096i = 0;
        dVar.f18097j = 256;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        d dVar = new d(true, null);
        this.f18083c = dVar;
        dVar.a(jVar, new e0(Integer.MIN_VALUE, 0, 1));
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(nVar.f18794a);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f18794a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f18080e) {
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
        int i13 = 0;
        int i14 = i10;
        while (true) {
            bVar.a(nVar.f18794a, 0, 2, false);
            nVar.e(0);
            if ((nVar.o() & 65526) != 65520) {
                bVar.f17403e = 0;
                i14++;
                if (i14 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i14, false);
                i12 = 0;
                i13 = 0;
            } else {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                bVar.a(nVar.f18794a, 0, 4, false);
                mVar.b(14);
                int iA = mVar.a(13);
                if (iA <= 6) {
                    return false;
                }
                bVar.a(iA - 6, false);
                i13 += iA;
            }
        }
    }
}
