package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f17991a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        l lVar = this.f17991a;
        int i10 = lVar.f18017h;
        if (i10 == 0) {
            boolean zA = true;
            while (zA) {
                if (!lVar.f18010a.a(bVar)) {
                    lVar.f18017h = 3;
                    return -1;
                }
                long j10 = bVar.f17401c;
                long j11 = lVar.f18015f;
                lVar.f18020k = j10 - j11;
                zA = lVar.a(lVar.f18010a.f17993b, j11, lVar.f18019j);
                if (zA) {
                    lVar.f18015f = bVar.f17401c;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = lVar.f18019j.f18008a;
            lVar.f18018i = oVar2.f18466s;
            if (!lVar.f18022m) {
                lVar.f18011b.a(oVar2);
                lVar.f18022m = true;
            }
            c cVar = lVar.f18019j.f18009b;
            if (cVar != null) {
                lVar.f18013d = cVar;
            } else {
                long j12 = bVar.f17400b;
                if (j12 == -1) {
                    lVar.f18013d = new k();
                } else {
                    g gVar = lVar.f18010a.f17992a;
                    lVar.f18013d = new b(lVar.f18015f, j12, lVar, gVar.f18001d + gVar.f18002e, gVar.f17999b);
                }
            }
            lVar.f18019j = null;
            lVar.f18017h = 2;
            lVar.f18010a.a();
        } else if (i10 == 1) {
            bVar.a((int) lVar.f18015f);
            lVar.f18017h = 2;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            long jA = lVar.f18013d.a(bVar);
            if (jA >= 0) {
                oVar.f17970a = jA;
                return 1;
            }
            if (jA < -1) {
                lVar.a(-(jA + 2));
            }
            if (!lVar.f18021l) {
                lVar.f18012c.a(lVar.f18013d.b());
                lVar.f18021l = true;
            }
            if (lVar.f18020k <= 0 && !lVar.f18010a.a(bVar)) {
                lVar.f18017h = 3;
                return -1;
            }
            lVar.f18020k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = lVar.f18010a.f17993b;
            long jA2 = lVar.a(nVar);
            if (jA2 >= 0) {
                long j13 = lVar.f18016g;
                if (j13 + jA2 >= lVar.f18014e) {
                    long j14 = (j13 * 1000000) / ((long) lVar.f18018i);
                    lVar.f18011b.a(nVar.f18796c, nVar);
                    lVar.f18011b.a(j14, 1, nVar.f18796c, 0, null);
                    lVar.f18014e = -1L;
                }
            }
            lVar.f18016g += jA2;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        l lVar = this.f17991a;
        f fVar = lVar.f18010a;
        g gVar = fVar.f17992a;
        gVar.f17998a = 0;
        gVar.f17999b = 0L;
        gVar.f18000c = 0;
        gVar.f18001d = 0;
        gVar.f18002e = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = fVar.f17993b;
        nVar.f18795b = 0;
        nVar.f18796c = 0;
        fVar.f17994c = -1;
        fVar.f17996e = false;
        if (j10 == 0) {
            lVar.a(!lVar.f18021l);
        } else if (lVar.f18017h != 0) {
            lVar.f18014e = lVar.f18013d.c(j11);
            lVar.f18017h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(0, 1);
        jVar.b();
        l lVar = this.f17991a;
        lVar.f18012c = jVar;
        lVar.f18011b = gVarA;
        lVar.f18010a = new f();
        lVar.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        boolean zA;
        boolean zEquals;
        try {
            g gVar = new g();
            if (gVar.a(bVar, true) && (gVar.f17998a & 2) == 2) {
                int iMin = Math.min(gVar.f18002e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(iMin);
                bVar.a(nVar.f18794a, 0, iMin, false);
                nVar.e(0);
                if (nVar.f18796c - nVar.f18795b >= 5 && nVar.j() == 127 && nVar.k() == 1179402563) {
                    this.f17991a = new d();
                } else {
                    nVar.e(0);
                    try {
                        zA = s.a(1, nVar, true);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused) {
                        zA = false;
                    }
                    if (zA) {
                        this.f17991a = new o();
                    } else {
                        nVar.e(0);
                        int i10 = i.f18005o;
                        int i11 = nVar.f18796c - nVar.f18795b;
                        byte[] bArr = i.f18006p;
                        if (i11 < bArr.length) {
                            zEquals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            nVar.a(bArr2, 0, bArr.length);
                            zEquals = Arrays.equals(bArr2, bArr);
                        }
                        if (zEquals) {
                            this.f17991a = new i();
                        }
                    }
                }
                return true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused2) {
        }
        return false;
    }
}
