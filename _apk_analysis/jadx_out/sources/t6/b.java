package t6;

import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import f6.x;
import i6.b0;
import i6.k;
import i6.l;
import i6.m;
import i6.p;
import i6.y;
import java.io.IOException;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f85035h = new p() { // from class: t6.a
        @Override // i6.p
        public final k[] createExtractors() {
            return b.f();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f85036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f85037b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1061b f85040e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85038c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85039d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85041f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85042g = -1;

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class a implements InterfaceC1061b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int[] f85043m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f85044n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f85045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f85046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t6.c f85047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f85048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f85049e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a0 f85050f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f85051g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final com.google.android.exoplayer2.m f85052h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f85053i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f85054j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f85055k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f85056l;

        public a(m mVar, b0 b0Var, t6.c cVar) throws ParserException {
            this.f85045a = mVar;
            this.f85046b = b0Var;
            this.f85047c = cVar;
            int iMax = Math.max(1, cVar.f85067c / 10);
            this.f85051g = iMax;
            a0 a0Var = new a0(cVar.f85071g);
            a0Var.v();
            int iV = a0Var.v();
            this.f85048d = iV;
            int i10 = cVar.f85066b;
            int i11 = (((cVar.f85069e - (i10 * 4)) * 8) / (cVar.f85070f * i10)) + 1;
            if (iV == i11) {
                int iL = m0.l(iMax, iV);
                this.f85049e = new byte[cVar.f85069e * iL];
                this.f85050f = new a0(iL * f(iV, i10));
                int i12 = ((cVar.f85067c * cVar.f85069e) * 8) / iV;
                this.f85052h = new m.b().e0("audio/raw").G(i12).Z(i12).W(f(iMax, i10)).H(cVar.f85066b).f0(cVar.f85067c).Y(2).E();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected frames per block: " + i11 + "; got: " + iV, null);
        }

        public static int f(int i10, int i11) {
            return i10 * 2 * i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // t6.b.InterfaceC1061b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(i6.l r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f85051g
                int r1 = r6.f85055k
                int r1 = r6.d(r1)
                int r0 = r0 - r1
                int r1 = r6.f85048d
                int r0 = s7.m0.l(r0, r1)
                t6.c r1 = r6.f85047c
                int r1 = r1.f85069e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f85053i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f85049e
                int r5 = r6.f85053i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f85053i
                int r4 = r4 + r3
                r6.f85053i = r4
                goto L1e
            L3e:
                int r7 = r6.f85053i
                t6.c r8 = r6.f85047c
                int r8 = r8.f85069e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f85049e
                s7.a0 r9 = r6.f85050f
                r6.b(r8, r7, r9)
                int r8 = r6.f85053i
                t6.c r9 = r6.f85047c
                int r9 = r9.f85069e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f85053i = r8
                s7.a0 r7 = r6.f85050f
                int r7 = r7.f()
                i6.b0 r8 = r6.f85046b
                s7.a0 r9 = r6.f85050f
                r8.e(r9, r7)
                int r8 = r6.f85055k
                int r8 = r8 + r7
                r6.f85055k = r8
                int r7 = r6.d(r8)
                int r8 = r6.f85051g
                if (r7 < r8) goto L75
                r6.g(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f85055k
                int r7 = r6.d(r7)
                if (r7 <= 0) goto L82
                r6.g(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: t6.b.a.a(i6.l, long):boolean");
        }

        public final void b(byte[] bArr, int i10, a0 a0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f85047c.f85066b; i12++) {
                    c(bArr, i11, i12, a0Var.d());
                }
            }
            int iE = e(this.f85048d * i10);
            a0Var.P(0);
            a0Var.O(iE);
        }

        public final void c(byte[] bArr, int i10, int i11, byte[] bArr2) {
            t6.c cVar = this.f85047c;
            int i12 = cVar.f85069e;
            int i13 = cVar.f85066b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iP = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f85044n[iMin];
            int i18 = ((i10 * this.f85048d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iP & 255);
            bArr2[i18 + 1] = (byte) (iP >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
                int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                iP = m0.p(iP + i22, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iP & 255);
                bArr2[i18 + 1] = (byte) (iP >> 8);
                int i23 = iMin + f85043m[i21];
                int[] iArr = f85044n;
                iMin = m0.p(i23, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        public final int d(int i10) {
            return i10 / (this.f85047c.f85066b * 2);
        }

        public final int e(int i10) {
            return f(i10, this.f85047c.f85066b);
        }

        public final void g(int i10) {
            long jF0 = this.f85054j + m0.F0(this.f85056l, 1000000L, this.f85047c.f85067c);
            int iE = e(i10);
            this.f85046b.c(jF0, 1, iE, this.f85055k - iE, null);
            this.f85056l += (long) i10;
            this.f85055k -= iE;
        }

        @Override // t6.b.InterfaceC1061b
        public void init(int i10, long j10) {
            this.f85045a.h(new e(this.f85047c, this.f85048d, i10, j10));
            this.f85046b.b(this.f85052h);
        }

        @Override // t6.b.InterfaceC1061b
        public void reset(long j10) {
            this.f85053i = 0;
            this.f85054j = j10;
            this.f85055k = 0;
            this.f85056l = 0L;
        }
    }

    /* JADX INFO: renamed from: t6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WavExtractor.java */
    public interface InterfaceC1061b {
        boolean a(l lVar, long j10) throws IOException;

        void init(int i10, long j10) throws ParserException;

        void reset(long j10);
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class c implements InterfaceC1061b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i6.m f85057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f85058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t6.c f85059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.android.exoplayer2.m f85060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f85061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f85062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f85063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f85064h;

        public c(i6.m mVar, b0 b0Var, t6.c cVar, String str, int i10) throws ParserException {
            this.f85057a = mVar;
            this.f85058b = b0Var;
            this.f85059c = cVar;
            int i11 = (cVar.f85066b * cVar.f85070f) / 8;
            if (cVar.f85069e == i11) {
                int i12 = cVar.f85067c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f85061e = iMax;
                this.f85060d = new m.b().e0(str).G(i13).Z(i13).W(iMax).H(cVar.f85066b).f0(cVar.f85067c).Y(i10).E();
                return;
            }
            throw ParserException.createForMalformedContainer("Expected block size: " + i11 + "; got: " + cVar.f85069e, null);
        }

        @Override // t6.b.InterfaceC1061b
        public boolean a(l lVar, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f85063g) < (i11 = this.f85061e)) {
                int iF = this.f85058b.f(lVar, (int) Math.min(i11 - i10, j11), true);
                if (iF == -1) {
                    j11 = 0;
                } else {
                    this.f85063g += iF;
                    j11 -= (long) iF;
                }
            }
            int i12 = this.f85059c.f85069e;
            int i13 = this.f85063g / i12;
            if (i13 > 0) {
                long jF0 = this.f85062f + m0.F0(this.f85064h, 1000000L, r1.f85067c);
                int i14 = i13 * i12;
                int i15 = this.f85063g - i14;
                this.f85058b.c(jF0, 1, i14, i15, null);
                this.f85064h += (long) i13;
                this.f85063g = i15;
            }
            return j11 <= 0;
        }

        @Override // t6.b.InterfaceC1061b
        public void init(int i10, long j10) {
            this.f85057a.h(new e(this.f85059c, 1, i10, j10));
            this.f85058b.b(this.f85060d);
        }

        @Override // t6.b.InterfaceC1061b
        public void reset(long j10) {
            this.f85062f = j10;
            this.f85063g = 0;
            this.f85064h = 0L;
        }
    }

    public static /* synthetic */ k[] f() {
        return new k[]{new b()};
    }

    @Override // i6.k
    public void a(i6.m mVar) {
        this.f85036a = mVar;
        this.f85037b = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        e();
        int i10 = this.f85038c;
        if (i10 == 0) {
            g(lVar);
            return 0;
        }
        if (i10 == 1) {
            i(lVar);
            return 0;
        }
        if (i10 == 2) {
            h(lVar);
            return 0;
        }
        if (i10 == 3) {
            k(lVar);
            return 0;
        }
        if (i10 == 4) {
            return j(lVar);
        }
        throw new IllegalStateException();
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        return d.a(lVar);
    }

    public final void e() {
        s7.a.i(this.f85037b);
        m0.j(this.f85036a);
    }

    public final void g(l lVar) throws IOException {
        s7.a.g(lVar.getPosition() == 0);
        int i10 = this.f85041f;
        if (i10 != -1) {
            lVar.skipFully(i10);
            this.f85038c = 4;
        } else {
            if (!d.a(lVar)) {
                throw ParserException.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            lVar.skipFully((int) (lVar.getPeekPosition() - lVar.getPosition()));
            this.f85038c = 1;
        }
    }

    public final void h(l lVar) throws IOException {
        t6.c cVarB = d.b(lVar);
        int i10 = cVarB.f85065a;
        if (i10 == 17) {
            this.f85040e = new a(this.f85036a, this.f85037b, cVarB);
        } else if (i10 == 6) {
            this.f85040e = new c(this.f85036a, this.f85037b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f85040e = new c(this.f85036a, this.f85037b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = x.a(i10, cVarB.f85070f);
            if (iA == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Unsupported WAV format type: " + cVarB.f85065a);
            }
            this.f85040e = new c(this.f85036a, this.f85037b, cVarB, "audio/raw", iA);
        }
        this.f85038c = 3;
    }

    public final void i(l lVar) throws IOException {
        this.f85039d = d.c(lVar);
        this.f85038c = 2;
    }

    public final int j(l lVar) throws IOException {
        s7.a.g(this.f85042g != -1);
        return ((InterfaceC1061b) s7.a.e(this.f85040e)).a(lVar, this.f85042g - lVar.getPosition()) ? -1 : 0;
    }

    public final void k(l lVar) throws IOException {
        Pair<Long, Long> pairE = d.e(lVar);
        this.f85041f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f85039d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f85042g = ((long) this.f85041f) + jLongValue;
        long length = lVar.getLength();
        if (length != -1 && this.f85042g > length) {
            q.i("WavExtractor", "Data exceeds input length: " + this.f85042g + ", " + length);
            this.f85042g = length;
        }
        ((InterfaceC1061b) s7.a.e(this.f85040e)).init(this.f85041f, this.f85042g);
        this.f85038c = 4;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        this.f85038c = j10 == 0 ? 0 : 4;
        InterfaceC1061b interfaceC1061b = this.f85040e;
        if (interfaceC1061b != null) {
            interfaceC1061b.reset(j11);
        }
    }
}
