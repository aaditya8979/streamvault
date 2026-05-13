package e5;

import androidx.annotation.Nullable;
import e5.h0;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k4.u;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes11.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5.b f60459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.t f60461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f60462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f60463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f60464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f60465g;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f60466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f60467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f60468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public y5.a f60469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public a f60470e;

        public a(long j10, int i10) {
            this.f60466a = j10;
            this.f60467b = j10 + ((long) i10);
        }

        public a a() {
            this.f60469d = null;
            a aVar = this.f60470e;
            this.f60470e = null;
            return aVar;
        }

        public void b(y5.a aVar, a aVar2) {
            this.f60469d = aVar;
            this.f60470e = aVar2;
            this.f60468c = true;
        }

        public int c(long j10) {
            return ((int) (j10 - this.f60466a)) + this.f60469d.f87255b;
        }
    }

    public g0(y5.b bVar) {
        this.f60459a = bVar;
        int individualAllocationLength = bVar.getIndividualAllocationLength();
        this.f60460b = individualAllocationLength;
        this.f60461c = new a6.t(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f60462d = aVar;
        this.f60463e = aVar;
        this.f60464f = aVar;
    }

    public final void a(long j10) {
        while (true) {
            a aVar = this.f60463e;
            if (j10 < aVar.f60467b) {
                return;
            } else {
                this.f60463e = aVar.f60470e;
            }
        }
    }

    public final void b(a aVar) {
        if (aVar.f60468c) {
            a aVar2 = this.f60464f;
            boolean z10 = aVar2.f60468c;
            int i10 = (z10 ? 1 : 0) + (((int) (aVar2.f60466a - aVar.f60466a)) / this.f60460b);
            y5.a[] aVarArr = new y5.a[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                aVarArr[i11] = aVar.f60469d;
                aVar = aVar.a();
            }
            this.f60459a.a(aVarArr);
        }
    }

    public void c(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f60462d;
            if (j10 < aVar.f60467b) {
                break;
            }
            this.f60459a.b(aVar.f60469d);
            this.f60462d = this.f60462d.a();
        }
        if (this.f60463e.f60466a < aVar.f60466a) {
            this.f60463e = aVar;
        }
    }

    public void d(long j10) {
        this.f60465g = j10;
        if (j10 != 0) {
            a aVar = this.f60462d;
            if (j10 != aVar.f60466a) {
                while (this.f60465g > aVar.f60467b) {
                    aVar = aVar.f60470e;
                }
                a aVar2 = aVar.f60470e;
                b(aVar2);
                a aVar3 = new a(aVar.f60467b, this.f60460b);
                aVar.f60470e = aVar3;
                if (this.f60465g == aVar.f60467b) {
                    aVar = aVar3;
                }
                this.f60464f = aVar;
                if (this.f60463e == aVar2) {
                    this.f60463e = aVar3;
                    return;
                }
                return;
            }
        }
        b(this.f60462d);
        a aVar4 = new a(this.f60465g, this.f60460b);
        this.f60462d = aVar4;
        this.f60463e = aVar4;
        this.f60464f = aVar4;
    }

    public long e() {
        return this.f60465g;
    }

    public final void f(int i10) {
        long j10 = this.f60465g + ((long) i10);
        this.f60465g = j10;
        a aVar = this.f60464f;
        if (j10 == aVar.f60467b) {
            this.f60464f = aVar.f60470e;
        }
    }

    public final int g(int i10) {
        a aVar = this.f60464f;
        if (!aVar.f60468c) {
            aVar.b(this.f60459a.allocate(), new a(this.f60464f.f60467b, this.f60460b));
        }
        return Math.min(i10, (int) (this.f60464f.f60467b - this.f60465g));
    }

    public final void h(long j10, ByteBuffer byteBuffer, int i10) {
        a(j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (this.f60463e.f60467b - j10));
            a aVar = this.f60463e;
            byteBuffer.put(aVar.f60469d.f87254a, aVar.c(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            a aVar2 = this.f60463e;
            if (j10 == aVar2.f60467b) {
                this.f60463e = aVar2.f60470e;
            }
        }
    }

    public final void i(long j10, byte[] bArr, int i10) {
        a(j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (this.f60463e.f60467b - j10));
            a aVar = this.f60463e;
            System.arraycopy(aVar.f60469d.f87254a, aVar.c(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            a aVar2 = this.f60463e;
            if (j10 == aVar2.f60467b) {
                this.f60463e = aVar2.f60470e;
            }
        }
    }

    public final void j(i4.e eVar, h0.a aVar) {
        long j10 = aVar.f60499b;
        int iE = 1;
        this.f60461c.H(1);
        i(j10, this.f60461c.f3620a, 1);
        long j11 = j10 + 1;
        byte b10 = this.f60461c.f3620a[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        i4.b bVar = eVar.f63710b;
        byte[] bArr = bVar.f63689a;
        if (bArr == null) {
            bVar.f63689a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        i(j11, bVar.f63689a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            this.f60461c.H(2);
            i(j12, this.f60461c.f3620a, 2);
            j12 += 2;
            iE = this.f60461c.E();
        }
        int i11 = iE;
        int[] iArr = bVar.f63692d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar.f63693e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            this.f60461c.H(i12);
            i(j12, this.f60461c.f3620a, i12);
            j12 += (long) i12;
            this.f60461c.L(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = this.f60461c.E();
                iArr4[i13] = this.f60461c.C();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.f60498a - ((int) (j12 - aVar.f60499b));
        }
        u.a aVar2 = aVar.f60500c;
        bVar.b(i11, iArr2, iArr4, aVar2.f72927b, bVar.f63689a, aVar2.f72926a, aVar2.f72928c, aVar2.f72929d);
        long j13 = aVar.f60499b;
        int i14 = (int) (j12 - j13);
        aVar.f60499b = j13 + ((long) i14);
        aVar.f60498a -= i14;
    }

    public void k(i4.e eVar, h0.a aVar) {
        if (eVar.d()) {
            j(eVar, aVar);
        }
        if (!eVar.hasSupplementalData()) {
            eVar.b(aVar.f60498a);
            h(aVar.f60499b, eVar.f63711c, aVar.f60498a);
            return;
        }
        this.f60461c.H(4);
        i(aVar.f60499b, this.f60461c.f3620a, 4);
        int iC = this.f60461c.C();
        aVar.f60499b += 4;
        aVar.f60498a -= 4;
        eVar.b(iC);
        h(aVar.f60499b, eVar.f63711c, iC);
        aVar.f60499b += (long) iC;
        int i10 = aVar.f60498a - iC;
        aVar.f60498a = i10;
        eVar.g(i10);
        h(aVar.f60499b, eVar.f63714f, aVar.f60498a);
    }

    public void l() {
        b(this.f60462d);
        a aVar = new a(0L, this.f60460b);
        this.f60462d = aVar;
        this.f60463e = aVar;
        this.f60464f = aVar;
        this.f60465g = 0L;
        this.f60459a.trim();
    }

    public void m() {
        this.f60463e = this.f60462d;
    }

    public int n(k4.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
        int iG = g(i10);
        a aVar = this.f60464f;
        int i11 = hVar.read(aVar.f60469d.f87254a, aVar.c(this.f60465g), iG);
        if (i11 != -1) {
            f(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void o(a6.t tVar, int i10) {
        while (i10 > 0) {
            int iG = g(i10);
            a aVar = this.f60464f;
            tVar.h(aVar.f60469d.f87254a, aVar.c(this.f60465g), iG);
            i10 -= iG;
            f(iG);
        }
    }
}
