package u4;

import a6.k0;
import a6.t;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import g4.p;
import java.io.IOException;
import k4.g;
import k4.h;
import k4.i;
import k4.k;
import k4.r;
import k4.u;

/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f85445f = new k() { // from class: u4.a
        @Override // k4.k
        public final g[] createExtractors() {
            return b.f();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f85446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f85447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1067b f85448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85449d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85450e = -1;

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class a implements InterfaceC1067b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int[] f85451m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f85452n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f85453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f85454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u4.c f85455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f85456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f85457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t f85458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f85459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Format f85460h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f85461i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f85462j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f85463k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f85464l;

        public a(i iVar, u uVar, u4.c cVar) throws ParserException {
            this.f85453a = iVar;
            this.f85454b = uVar;
            this.f85455c = cVar;
            int iMax = Math.max(1, cVar.f85475c / 10);
            this.f85459g = iMax;
            t tVar = new t(cVar.f85479g);
            tVar.q();
            int iQ = tVar.q();
            this.f85456d = iQ;
            int i10 = cVar.f85474b;
            int i11 = (((cVar.f85477e - (i10 * 4)) * 8) / (cVar.f85478f * i10)) + 1;
            if (iQ == i11) {
                int iK = k0.k(iMax, iQ);
                this.f85457e = new byte[cVar.f85477e * iK];
                this.f85458f = new t(iK * f(iQ, i10));
                this.f85460h = Format.p(null, "audio/raw", null, ((cVar.f85475c * cVar.f85477e) * 8) / iQ, f(iMax, i10), cVar.f85474b, cVar.f85475c, 2, null, null, 0, null);
                return;
            }
            throw new ParserException("Expected frames per block: " + i11 + "; got: " + iQ);
        }

        public static int f(int i10, int i11) {
            return i10 * 2 * i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // u4.b.InterfaceC1067b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(k4.h r7, long r8) throws java.lang.InterruptedException, java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f85459g
                int r1 = r6.f85463k
                int r1 = r6.d(r1)
                int r0 = r0 - r1
                int r1 = r6.f85456d
                int r0 = a6.k0.k(r0, r1)
                u4.c r1 = r6.f85455c
                int r1 = r1.f85477e
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
                int r3 = r6.f85461i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f85457e
                int r5 = r6.f85461i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f85461i
                int r4 = r4 + r3
                r6.f85461i = r4
                goto L1e
            L3e:
                int r7 = r6.f85461i
                u4.c r8 = r6.f85455c
                int r8 = r8.f85477e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f85457e
                a6.t r9 = r6.f85458f
                r6.b(r8, r7, r9)
                int r8 = r6.f85461i
                u4.c r9 = r6.f85455c
                int r9 = r9.f85477e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f85461i = r8
                a6.t r7 = r6.f85458f
                int r7 = r7.d()
                k4.u r8 = r6.f85454b
                a6.t r9 = r6.f85458f
                r8.a(r9, r7)
                int r8 = r6.f85463k
                int r8 = r8 + r7
                r6.f85463k = r8
                int r7 = r6.d(r8)
                int r8 = r6.f85459g
                if (r7 < r8) goto L75
                r6.g(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f85463k
                int r7 = r6.d(r7)
                if (r7 <= 0) goto L82
                r6.g(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u4.b.a.a(k4.h, long):boolean");
        }

        public final void b(byte[] bArr, int i10, t tVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f85455c.f85474b; i12++) {
                    c(bArr, i11, i12, tVar.f3620a);
                }
            }
            tVar.H(e(this.f85456d * i10));
        }

        public final void c(byte[] bArr, int i10, int i11, byte[] bArr2) {
            u4.c cVar = this.f85455c;
            int i12 = cVar.f85477e;
            int i13 = cVar.f85474b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iQ = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f85452n[iMin];
            int i18 = ((i10 * this.f85456d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iQ & 255);
            bArr2[i18 + 1] = (byte) (iQ >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
                int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                iQ = k0.q(iQ + i22, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iQ & 255);
                bArr2[i18 + 1] = (byte) (iQ >> 8);
                int i23 = iMin + f85451m[i21];
                int[] iArr = f85452n;
                iMin = k0.q(i23, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        public final int d(int i10) {
            return i10 / (this.f85455c.f85474b * 2);
        }

        public final int e(int i10) {
            return f(i10, this.f85455c.f85474b);
        }

        public final void g(int i10) {
            long jY0 = this.f85462j + k0.y0(this.f85464l, 1000000L, this.f85455c.f85475c);
            int iE = e(i10);
            this.f85454b.c(jY0, 1, iE, this.f85463k - iE, null);
            this.f85464l += (long) i10;
            this.f85463k -= iE;
        }

        @Override // u4.b.InterfaceC1067b
        public void init(int i10, long j10) {
            this.f85453a.c(new e(this.f85455c, this.f85456d, i10, j10));
            this.f85454b.d(this.f85460h);
        }

        @Override // u4.b.InterfaceC1067b
        public void reset(long j10) {
            this.f85461i = 0;
            this.f85462j = j10;
            this.f85463k = 0;
            this.f85464l = 0L;
        }
    }

    /* JADX INFO: renamed from: u4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WavExtractor.java */
    public interface InterfaceC1067b {
        boolean a(h hVar, long j10) throws InterruptedException, IOException;

        void init(int i10, long j10) throws ParserException;

        void reset(long j10);
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class c implements InterfaceC1067b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f85465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f85466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u4.c f85467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Format f85468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f85469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f85470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f85471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f85472h;

        public c(i iVar, u uVar, u4.c cVar, String str, int i10) throws ParserException {
            this.f85465a = iVar;
            this.f85466b = uVar;
            this.f85467c = cVar;
            int i11 = (cVar.f85474b * cVar.f85478f) / 8;
            if (cVar.f85477e == i11) {
                int iMax = Math.max(i11, (cVar.f85475c * i11) / 10);
                this.f85469e = iMax;
                int i12 = cVar.f85475c;
                this.f85468d = Format.p(null, str, null, i11 * i12 * 8, iMax, cVar.f85474b, i12, i10, null, null, 0, null);
                return;
            }
            throw new ParserException("Expected block size: " + i11 + "; got: " + cVar.f85477e);
        }

        @Override // u4.b.InterfaceC1067b
        public boolean a(h hVar, long j10) throws InterruptedException, IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f85471g) < (i11 = this.f85469e)) {
                int iB = this.f85466b.b(hVar, (int) Math.min(i11 - i10, j11), true);
                if (iB == -1) {
                    j11 = 0;
                } else {
                    this.f85471g += iB;
                    j11 -= (long) iB;
                }
            }
            int i12 = this.f85467c.f85477e;
            int i13 = this.f85471g / i12;
            if (i13 > 0) {
                long jY0 = this.f85470f + k0.y0(this.f85472h, 1000000L, r1.f85475c);
                int i14 = i13 * i12;
                int i15 = this.f85471g - i14;
                this.f85466b.c(jY0, 1, i14, i15, null);
                this.f85472h += (long) i13;
                this.f85471g = i15;
            }
            return j11 <= 0;
        }

        @Override // u4.b.InterfaceC1067b
        public void init(int i10, long j10) {
            this.f85465a.c(new e(this.f85467c, 1, i10, j10));
            this.f85466b.d(this.f85468d);
        }

        @Override // u4.b.InterfaceC1067b
        public void reset(long j10) {
            this.f85470f = j10;
            this.f85471g = 0;
            this.f85472h = 0L;
        }
    }

    public static /* synthetic */ g[] f() {
        return new g[]{new b()};
    }

    @Override // k4.g
    public boolean a(h hVar) throws InterruptedException, IOException {
        return d.a(hVar) != null;
    }

    @Override // k4.g
    public void b(i iVar) {
        this.f85446a = iVar;
        this.f85447b = iVar.track(0, 1);
        iVar.endTracks();
    }

    @Override // k4.g
    public int c(h hVar, r rVar) throws InterruptedException, IOException {
        e();
        if (this.f85448c == null) {
            u4.c cVarA = d.a(hVar);
            if (cVarA == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            int i10 = cVarA.f85473a;
            if (i10 == 17) {
                this.f85448c = new a(this.f85446a, this.f85447b, cVarA);
            } else if (i10 == 6) {
                this.f85448c = new c(this.f85446a, this.f85447b, cVarA, "audio/g711-alaw", -1);
            } else if (i10 == 7) {
                this.f85448c = new c(this.f85446a, this.f85447b, cVarA, "audio/g711-mlaw", -1);
            } else {
                int iA = p.a(i10, cVarA.f85478f);
                if (iA == 0) {
                    throw new ParserException("Unsupported WAV format type: " + cVarA.f85473a);
                }
                this.f85448c = new c(this.f85446a, this.f85447b, cVarA, "audio/raw", iA);
            }
        }
        if (this.f85449d == -1) {
            Pair<Long, Long> pairB = d.b(hVar);
            this.f85449d = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.f85450e = jLongValue;
            this.f85448c.init(this.f85449d, jLongValue);
        } else if (hVar.getPosition() == 0) {
            hVar.skipFully(this.f85449d);
        }
        a6.a.f(this.f85450e != -1);
        return this.f85448c.a(hVar, this.f85450e - hVar.getPosition()) ? -1 : 0;
    }

    public final void e() {
        a6.a.h(this.f85447b);
        k0.i(this.f85446a);
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        InterfaceC1067b interfaceC1067b = this.f85448c;
        if (interfaceC1067b != null) {
            interfaceC1067b.reset(j11);
        }
    }
}
