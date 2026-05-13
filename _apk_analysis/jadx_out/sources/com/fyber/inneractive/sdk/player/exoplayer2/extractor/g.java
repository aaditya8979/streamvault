package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f17453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f17455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingDeque f17456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f17457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f17459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f17461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f17462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a f17463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f17466n;

    public g(com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f17453a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).getClass();
        this.f17454b = 65536;
        this.f17455c = new e();
        this.f17456d = new LinkedBlockingDeque();
        this.f17457e = new d();
        this.f17458f = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);
        this.f17459g = new AtomicInteger();
        this.f17464l = 65536;
    }

    public final int a(int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar;
        if (this.f17464l == this.f17454b) {
            this.f17464l = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f17453a;
            synchronized (lVar) {
                lVar.f18704c++;
                int i11 = lVar.f18705d;
                if (i11 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f18706e;
                    int i12 = i11 - 1;
                    lVar.f18705d = i12;
                    aVar = aVarArr[i12];
                    aVarArr[i12] = null;
                } else {
                    aVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a(0, new byte[65536]);
                }
            }
            this.f17463k = aVar;
            this.f17456d.add(aVar);
        }
        return Math.min(i10, this.f17454b - this.f17464l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final int a(b bVar, int i10, boolean z10) throws InterruptedException, EOFException {
        int iA = 0;
        if (!this.f17459g.compareAndSet(0, 1)) {
            int iMin = Math.min(bVar.f17404f, i10);
            bVar.b(iMin);
            if (iMin == 0) {
                iMin = bVar.a(b.f17398g, 0, Math.min(i10, 4096), 0, true);
            }
            if (iMin != -1) {
                bVar.f17401c += (long) iMin;
            }
            if (iMin != -1) {
                return iMin;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int iA2 = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f17463k;
            byte[] bArr = aVar.f18601a;
            int i11 = aVar.f18602b + this.f17464l;
            int i12 = bVar.f17404f;
            if (i12 != 0) {
                int iMin2 = Math.min(i12, iA2);
                System.arraycopy(bVar.f17402d, 0, bArr, i11, iMin2);
                bVar.b(iMin2);
                iA = iMin2;
            }
            if (iA == 0) {
                iA = bVar.a(bArr, i11, iA2, 0, true);
            }
            if (iA != -1) {
                bVar.f17401c += (long) iA;
            }
            if (iA == -1) {
                if (z10) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f17464l += iA;
            this.f17462j += (long) iA;
            return iA;
        } finally {
            c();
        }
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10, boolean z11, long j10) {
        int iO;
        byte b10;
        e eVar = this.f17455c;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f17461i;
        d dVar = this.f17457e;
        synchronized (eVar) {
            iO = 1;
            if (eVar.f17418i != 0) {
                if (!z10) {
                    com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = eVar.f17417h;
                    int i10 = eVar.f17420k;
                    if (oVarArr[i10] == oVar) {
                        if (cVar.f17381c == null && cVar.f17383e == 0) {
                            b10 = -3;
                        } else {
                            long j11 = eVar.f17415f[i10];
                            cVar.f17382d = j11;
                            cVar.f17379a = eVar.f17414e[i10];
                            dVar.f17406a = eVar.f17413d[i10];
                            dVar.f17407b = eVar.f17412c[i10];
                            dVar.f17409d = eVar.f17416g[i10];
                            eVar.f17422m = Math.max(eVar.f17422m, j11);
                            int i11 = eVar.f17418i - 1;
                            eVar.f17418i = i11;
                            int i12 = eVar.f17420k + 1;
                            eVar.f17420k = i12;
                            eVar.f17419j++;
                            if (i12 == eVar.f17410a) {
                                eVar.f17420k = 0;
                            }
                            dVar.f17408c = i11 > 0 ? eVar.f17412c[eVar.f17420k] : dVar.f17407b + ((long) dVar.f17406a);
                            b10 = -4;
                        }
                    }
                }
                pVar.f18474a = eVar.f17417h[eVar.f17420k];
                b10 = -5;
            } else if (z11) {
                cVar.f17379a = 4;
                b10 = -4;
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f17426q;
                if (oVar2 == null || (!z10 && oVar2 == oVar)) {
                    b10 = -3;
                } else {
                    pVar.f18474a = oVar2;
                    b10 = -5;
                }
            }
        }
        if (b10 == -5) {
            this.f17461i = pVar.f18474a;
            return -5;
        }
        if (b10 != -4) {
            if (b10 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (cVar.b(4)) {
            return -4;
        }
        if (cVar.f17382d < j10) {
            cVar.f17379a = Integer.MIN_VALUE | cVar.f17379a;
        }
        if (cVar.b(1073741824)) {
            d dVar2 = this.f17457e;
            long j12 = dVar2.f17407b;
            this.f17458f.c(1);
            a(j12, this.f17458f.f18794a, 1);
            long j13 = j12 + 1;
            byte b11 = this.f17458f.f18794a[0];
            boolean z12 = (b11 & 128) != 0;
            int i13 = b11 & 127;
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar = cVar.f17380b;
            if (bVar.f17374a == null) {
                bVar.f17374a = new byte[16];
            }
            a(j13, bVar.f17374a, i13);
            long j14 = j13 + ((long) i13);
            if (z12) {
                this.f17458f.c(2);
                a(j14, this.f17458f.f18794a, 2);
                j14 += 2;
                iO = this.f17458f.o();
            }
            int i14 = iO;
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar2 = cVar.f17380b;
            int[] iArr = bVar2.f17375b;
            if (iArr == null || iArr.length < i14) {
                iArr = new int[i14];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = bVar2.f17376c;
            if (iArr3 == null || iArr3.length < i14) {
                iArr3 = new int[i14];
            }
            int[] iArr4 = iArr3;
            if (z12) {
                int i15 = i14 * 6;
                this.f17458f.c(i15);
                a(j14, this.f17458f.f18794a, i15);
                j14 += (long) i15;
                this.f17458f.e(0);
                for (int i16 = 0; i16 < i14; i16++) {
                    iArr2[i16] = this.f17458f.o();
                    iArr4[i16] = this.f17458f.m();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = dVar2.f17406a - ((int) (j14 - dVar2.f17407b));
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar3 = cVar.f17380b;
            bVar3.a(i14, iArr2, iArr4, dVar2.f17409d, bVar3.f17374a);
            long j15 = dVar2.f17407b;
            int i17 = (int) (j14 - j15);
            dVar2.f17407b = j15 + ((long) i17);
            dVar2.f17406a -= i17;
        }
        int i18 = this.f17457e.f17406a;
        ByteBuffer byteBuffer = cVar.f17381c;
        if (byteBuffer == null) {
            cVar.f17381c = cVar.a(i18);
        } else {
            int iCapacity = byteBuffer.capacity();
            int iPosition = cVar.f17381c.position();
            int i19 = i18 + iPosition;
            if (iCapacity < i19) {
                ByteBuffer byteBufferA = cVar.a(i19);
                if (iPosition > 0) {
                    cVar.f17381c.position(0);
                    cVar.f17381c.limit(iPosition);
                    byteBufferA.put(cVar.f17381c);
                }
                cVar.f17381c = byteBufferA;
            }
        }
        d dVar3 = this.f17457e;
        long j16 = dVar3.f17407b;
        ByteBuffer byteBuffer2 = cVar.f17381c;
        int i20 = dVar3.f17406a;
        while (i20 > 0) {
            a(j16);
            int i21 = (int) (j16 - this.f17460h);
            int iMin = Math.min(i20, this.f17454b - i21);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f17456d.peek();
            byteBuffer2.put(aVar.f18601a, aVar.f18602b + i21, iMin);
            j16 += (long) iMin;
            i20 -= iMin;
        }
        a(this.f17457e.f17408c);
        return -4;
    }

    public final void a() {
        e eVar = this.f17455c;
        eVar.f17419j = 0;
        eVar.f17420k = 0;
        eVar.f17421l = 0;
        eVar.f17418i = 0;
        eVar.f17424o = true;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f17453a;
        LinkedBlockingDeque linkedBlockingDeque = this.f17456d;
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar).a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) linkedBlockingDeque.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[linkedBlockingDeque.size()]));
        this.f17456d.clear();
        ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) this.f17453a).a();
        this.f17460h = 0L;
        this.f17462j = 0L;
        this.f17463k = null;
        this.f17464l = this.f17454b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (!this.f17459g.compareAndSet(0, 1)) {
            nVar.e(nVar.f18795b + i10);
            return;
        }
        while (i10 > 0) {
            int iA = a(i10);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = this.f17463k;
            nVar.a(aVar.f18601a, aVar.f18602b + this.f17464l, iA);
            this.f17464l += iA;
            this.f17462j += (long) iA;
            i10 -= iA;
        }
        c();
    }

    public final void a(long j10) {
        int i10 = ((int) (j10 - this.f17460h)) / this.f17454b;
        for (int i11 = 0; i11 < i10; i11++) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar = this.f17453a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f17456d.remove();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.l) bVar;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr = lVar.f18702a;
                aVarArr[0] = aVar;
                lVar.a(aVarArr);
            }
            this.f17460h += (long) this.f17454b;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(long j10, int i10, int i11, int i12, byte[] bArr) {
        if (!this.f17459g.compareAndSet(0, 1)) {
            e eVar = this.f17455c;
            synchronized (eVar) {
                eVar.f17423n = Math.max(eVar.f17423n, j10);
            }
            return;
        }
        try {
            if (this.f17465m) {
                if ((i10 & 1) != 0 && this.f17455c.a(j10)) {
                    this.f17465m = false;
                }
                return;
            }
            this.f17455c.a(j10, i10, (this.f17462j - ((long) i11)) - ((long) i12), i11, bArr);
        } finally {
            c();
        }
    }

    public final void a(long j10, byte[] bArr, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            a(j10);
            int i12 = (int) (j10 - this.f17460h);
            int iMin = Math.min(i10 - i11, this.f17454b - i12);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a) this.f17456d.peek();
            System.arraycopy(aVar.f18601a, aVar.f18602b + i12, bArr, i11, iMin);
            j10 += (long) iMin;
            i11 += iMin;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.r
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        if (oVar == null) {
            oVar = null;
        }
        e eVar = this.f17455c;
        synchronized (eVar) {
            z10 = true;
            if (oVar == null) {
                eVar.f17425p = true;
            } else {
                eVar.f17425p = false;
                com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = eVar.f17426q;
                int i10 = z.f18822a;
                if (!oVar.equals(oVar2)) {
                    eVar.f17426q = oVar;
                }
            }
            z10 = false;
        }
        f fVar = this.f17466n;
        if (fVar == null || !z10) {
            return;
        }
        fVar.e();
    }

    public final void a(boolean z10) {
        int andSet = this.f17459g.getAndSet(z10 ? 0 : 2);
        a();
        e eVar = this.f17455c;
        eVar.f17422m = Long.MIN_VALUE;
        eVar.f17423n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f17461i = null;
        }
    }

    public final boolean a(boolean z10, long j10) {
        long j11;
        e eVar = this.f17455c;
        synchronized (eVar) {
            if (eVar.f17418i != 0) {
                long[] jArr = eVar.f17415f;
                int i10 = eVar.f17420k;
                if (j10 < jArr[i10]) {
                    j11 = -1;
                } else {
                    if (j10 <= eVar.f17423n || z10) {
                        int i11 = -1;
                        int i12 = 0;
                        while (i10 != eVar.f17421l && eVar.f17415f[i10] <= j10) {
                            if ((eVar.f17414e[i10] & 1) != 0) {
                                i11 = i12;
                            }
                            i10 = (i10 + 1) % eVar.f17410a;
                            i12++;
                        }
                        if (i11 != -1) {
                            int i13 = (eVar.f17420k + i11) % eVar.f17410a;
                            eVar.f17420k = i13;
                            eVar.f17419j += i11;
                            eVar.f17418i -= i11;
                            j11 = eVar.f17412c[i13];
                        }
                    }
                    j11 = -1;
                }
            } else {
                j11 = -1;
            }
        }
        if (j11 == -1) {
            return false;
        }
        a(j11);
        return true;
    }

    public final void b() {
        if (this.f17459g.getAndSet(2) == 0) {
            a();
        }
    }

    public final void c() {
        if (this.f17459g.compareAndSet(1, 0)) {
            return;
        }
        a();
    }

    public final long d() {
        long jMax;
        e eVar = this.f17455c;
        synchronized (eVar) {
            jMax = Math.max(eVar.f17422m, eVar.f17423n);
        }
        return jMax;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.o e() {
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar;
        e eVar = this.f17455c;
        synchronized (eVar) {
            oVar = eVar.f17425p ? null : eVar.f17426q;
        }
        return oVar;
    }

    public final void f() {
        long j10;
        e eVar = this.f17455c;
        synchronized (eVar) {
            int i10 = eVar.f17418i;
            if (i10 == 0) {
                j10 = -1;
            } else {
                int i11 = eVar.f17420k + i10;
                int i12 = eVar.f17410a;
                int i13 = (i11 - 1) % i12;
                eVar.f17420k = i11 % i12;
                eVar.f17419j += i10;
                eVar.f17418i = 0;
                j10 = eVar.f17412c[i13] + ((long) eVar.f17413d[i13]);
            }
        }
        if (j10 != -1) {
            a(j10);
        }
    }
}
