package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.p;
import i6.b0;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import r7.b;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes9.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.b f22403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f22405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f22406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f22407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f22408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22409g;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f22410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f22411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public r7.a f22412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f22413d;

        public a(long j10, int i10) {
            c(j10, i10);
        }

        public a a() {
            this.f22412c = null;
            a aVar = this.f22413d;
            this.f22413d = null;
            return aVar;
        }

        public void b(r7.a aVar, a aVar2) {
            this.f22412c = aVar;
            this.f22413d = aVar2;
        }

        public void c(long j10, int i10) {
            s7.a.g(this.f22412c == null);
            this.f22410a = j10;
            this.f22411b = j10 + ((long) i10);
        }

        public int d(long j10) {
            return ((int) (j10 - this.f22410a)) + this.f22412c.f78732b;
        }

        @Override // r7.b.a
        public r7.a getAllocation() {
            return (r7.a) s7.a.e(this.f22412c);
        }

        @Override // r7.b.a
        @Nullable
        public b.a next() {
            a aVar = this.f22413d;
            if (aVar == null || aVar.f22412c == null) {
                return null;
            }
            return aVar;
        }
    }

    public o(r7.b bVar) {
        this.f22403a = bVar;
        int individualAllocationLength = bVar.getIndividualAllocationLength();
        this.f22404b = individualAllocationLength;
        this.f22405c = new a0(32);
        a aVar = new a(0L, individualAllocationLength);
        this.f22406d = aVar;
        this.f22407e = aVar;
        this.f22408f = aVar;
    }

    public static a c(a aVar, long j10) {
        while (j10 >= aVar.f22411b) {
            aVar = aVar.f22413d;
        }
        return aVar;
    }

    public static a h(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a aVarC = c(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVarC.f22411b - j10));
            byteBuffer.put(aVarC.f22412c.f78731a, aVarC.d(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarC.f22411b) {
                aVarC = aVarC.f22413d;
            }
        }
        return aVarC;
    }

    public static a i(a aVar, long j10, byte[] bArr, int i10) {
        a aVarC = c(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (aVarC.f22411b - j10));
            System.arraycopy(aVarC.f22412c.f78731a, aVarC.d(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == aVarC.f22411b) {
                aVarC = aVarC.f22413d;
            }
        }
        return aVarC;
    }

    public static a j(a aVar, DecoderInputBuffer decoderInputBuffer, p.b bVar, a0 a0Var) {
        long j10 = bVar.f22441b;
        int iJ = 1;
        a0Var.L(1);
        a aVarI = i(aVar, j10, a0Var.d(), 1);
        long j11 = j10 + 1;
        byte b10 = a0Var.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        g6.c cVar = decoderInputBuffer.f21429c;
        byte[] bArr = cVar.f62084a;
        if (bArr == null) {
            cVar.f62084a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarI2 = i(aVarI, j11, cVar.f62084a, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            a0Var.L(2);
            aVarI2 = i(aVarI2, j12, a0Var.d(), 2);
            j12 += 2;
            iJ = a0Var.J();
        }
        int i11 = iJ;
        int[] iArr = cVar.f62087d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f62088e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            a0Var.L(i12);
            aVarI2 = i(aVarI2, j12, a0Var.d(), i12);
            j12 += (long) i12;
            a0Var.P(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = a0Var.J();
                iArr4[i13] = a0Var.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f22440a - ((int) (j12 - bVar.f22441b));
        }
        b0.a aVar2 = (b0.a) m0.j(bVar.f22442c);
        cVar.c(i11, iArr2, iArr4, aVar2.f63841b, cVar.f62084a, aVar2.f63840a, aVar2.f63842c, aVar2.f63843d);
        long j13 = bVar.f22441b;
        int i14 = (int) (j12 - j13);
        bVar.f22441b = j13 + ((long) i14);
        bVar.f22440a -= i14;
        return aVarI2;
    }

    public static a k(a aVar, DecoderInputBuffer decoderInputBuffer, p.b bVar, a0 a0Var) {
        if (decoderInputBuffer.o()) {
            aVar = j(aVar, decoderInputBuffer, bVar, a0Var);
        }
        if (!decoderInputBuffer.e()) {
            decoderInputBuffer.m(bVar.f22440a);
            return h(aVar, bVar.f22441b, decoderInputBuffer.f21430d, bVar.f22440a);
        }
        a0Var.L(4);
        a aVarI = i(aVar, bVar.f22441b, a0Var.d(), 4);
        int iH = a0Var.H();
        bVar.f22441b += 4;
        bVar.f22440a -= 4;
        decoderInputBuffer.m(iH);
        a aVarH = h(aVarI, bVar.f22441b, decoderInputBuffer.f21430d, iH);
        bVar.f22441b += (long) iH;
        int i10 = bVar.f22440a - iH;
        bVar.f22440a = i10;
        decoderInputBuffer.q(i10);
        return h(aVarH, bVar.f22441b, decoderInputBuffer.f21433g, bVar.f22440a);
    }

    public final void a(a aVar) {
        if (aVar.f22412c == null) {
            return;
        }
        this.f22403a.b(aVar);
        aVar.a();
    }

    public void b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f22406d;
            if (j10 < aVar.f22411b) {
                break;
            }
            this.f22403a.a(aVar.f22412c);
            this.f22406d = this.f22406d.a();
        }
        if (this.f22407e.f22410a < aVar.f22410a) {
            this.f22407e = aVar;
        }
    }

    public long d() {
        return this.f22409g;
    }

    public void e(DecoderInputBuffer decoderInputBuffer, p.b bVar) {
        k(this.f22407e, decoderInputBuffer, bVar, this.f22405c);
    }

    public final void f(int i10) {
        long j10 = this.f22409g + ((long) i10);
        this.f22409g = j10;
        a aVar = this.f22408f;
        if (j10 == aVar.f22411b) {
            this.f22408f = aVar.f22413d;
        }
    }

    public final int g(int i10) {
        a aVar = this.f22408f;
        if (aVar.f22412c == null) {
            aVar.b(this.f22403a.allocate(), new a(this.f22408f.f22411b, this.f22404b));
        }
        return Math.min(i10, (int) (this.f22408f.f22411b - this.f22409g));
    }

    public void l(DecoderInputBuffer decoderInputBuffer, p.b bVar) {
        this.f22407e = k(this.f22407e, decoderInputBuffer, bVar, this.f22405c);
    }

    public void m() {
        a(this.f22406d);
        this.f22406d.c(0L, this.f22404b);
        a aVar = this.f22406d;
        this.f22407e = aVar;
        this.f22408f = aVar;
        this.f22409g = 0L;
        this.f22403a.trim();
    }

    public void n() {
        this.f22407e = this.f22406d;
    }

    public int o(r7.f fVar, int i10, boolean z10) throws IOException {
        int iG = g(i10);
        a aVar = this.f22408f;
        int i11 = fVar.read(aVar.f22412c.f78731a, aVar.d(this.f22409g), iG);
        if (i11 != -1) {
            f(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void p(a0 a0Var, int i10) {
        while (i10 > 0) {
            int iG = g(i10);
            a aVar = this.f22408f;
            a0Var.j(aVar.f22412c.f78731a, aVar.d(this.f22409g), iG);
            i10 -= iG;
            f(iG);
        }
    }
}
