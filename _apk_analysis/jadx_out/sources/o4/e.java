package o4;

import a6.k0;
import a6.m;
import a6.n;
import a6.q;
import a6.t;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.drm.DrmInitData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import k4.h;
import k4.i;
import k4.k;
import k4.r;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes9.dex */
public class e implements k4.g {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final k f76044b0 = new k() { // from class: o4.d
        @Override // k4.k
        public final k4.g[] createExtractors() {
            return e.t();
        }
    };

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f76045c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f76046d0 = k0.c0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f76047e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final UUID f76048f0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public long B;
    public n C;
    public n D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4.c f76049a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public i f76050a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f76051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<c> f76052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f76053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f76054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f76055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f76056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f76057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f76058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f76059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f76060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f76061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f76062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f76063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f76064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f76065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f76066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f76067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f76068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f76069t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f76070u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f76071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f76072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f76073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f76074y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f76075z;

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public final class b implements o4.b {
        public b() {
        }

        @Override // o4.b
        public void a(int i10, int i11, h hVar) throws InterruptedException, IOException {
            e.this.g(i10, i11, hVar);
        }

        @Override // o4.b
        public void endMasterElement(int i10) throws ParserException {
            e.this.j(i10);
        }

        @Override // o4.b
        public void floatElement(int i10, double d10) throws ParserException {
            e.this.m(i10, d10);
        }

        @Override // o4.b
        public int getElementType(int i10) {
            return e.this.o(i10);
        }

        @Override // o4.b
        public void integerElement(int i10, long j10) throws ParserException {
            e.this.q(i10, j10);
        }

        @Override // o4.b
        public boolean isLevel1Element(int i10) {
            return e.this.s(i10);
        }

        @Override // o4.b
        public void startMasterElement(int i10, long j10, long j11) throws ParserException {
            e.this.z(i10, j10, j11);
        }

        @Override // o4.b
        public void stringElement(int i10, String str) throws ParserException {
            e.this.A(i10, str);
        }
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class c {
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public long P;
        public long Q;

        @Nullable
        public d R;
        public boolean S;
        public boolean T;
        public String U;
        public u V;
        public int W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f76077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f76078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f76079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f76081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f76082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f76083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f76084h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public u.a f76085i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f76086j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DrmInitData f76087k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f76088l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f76089m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f76090n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f76091o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f76092p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f76093q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f76094r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f76095s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f76096t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public byte[] f76097u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f76098v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f76099w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f76100x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f76101y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f76102z;

        public c() {
            this.f76088l = -1;
            this.f76089m = -1;
            this.f76090n = -1;
            this.f76091o = -1;
            this.f76092p = 0;
            this.f76093q = -1;
            this.f76094r = 0.0f;
            this.f76095s = 0.0f;
            this.f76096t = 0.0f;
            this.f76097u = null;
            this.f76098v = -1;
            this.f76099w = false;
            this.f76100x = -1;
            this.f76101y = -1;
            this.f76102z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 1;
            this.N = -1;
            this.O = 8000;
            this.P = 0L;
            this.Q = 0L;
            this.T = true;
            this.U = "eng";
        }

        public static Pair<String, List<byte[]>> e(t tVar) throws ParserException {
            try {
                tVar.M(16);
                long jO = tVar.o();
                if (jO == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jO == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jO != 826496599) {
                    m.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArr = tVar.f3620a;
                for (int iC = tVar.c() + 20; iC < bArr.length - 4; iC++) {
                    if (bArr[iC] == 0 && bArr[iC + 1] == 0 && bArr[iC + 2] == 1 && bArr[iC + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, iC, bArr.length)));
                    }
                }
                throw new ParserException("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        public static boolean f(t tVar) throws ParserException {
            try {
                int iQ = tVar.q();
                if (iQ == 1) {
                    return true;
                }
                if (iQ != 65534) {
                    return false;
                }
                tVar.L(24);
                if (tVar.r() == e.f76048f0.getMostSignificantBits()) {
                    if (tVar.r() == e.f76048f0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        public static List<byte[]> g(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if (i10 != -1) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if (i11 != -1) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + i11;
                if (bArr[i17] != 1) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        @Nullable
        public final byte[] b() {
            if (this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.C * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.K + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) this.A);
            byteBufferOrder.putShort((short) this.B);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0350  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x0352  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x035a  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(k4.i r43, int r44) throws com.google.android.exoplayer.ParserException {
            /*
                Method dump skipped, instruction units count: 1482
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.e.c.c(k4.i, int):void");
        }

        public void d() {
            d dVar = this.R;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void h() {
            d dVar = this.R;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f76103a = new byte[10];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f76104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f76105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f76106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f76107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f76108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f76109g;

        public void a(c cVar) {
            if (this.f76105c > 0) {
                cVar.V.c(this.f76106d, this.f76107e, this.f76108f, this.f76109g, cVar.f76085i);
                this.f76105c = 0;
            }
        }

        public void b() {
            this.f76104b = false;
            this.f76105c = 0;
        }

        public void c(c cVar, long j10, int i10, int i11, int i12) {
            if (this.f76104b) {
                int i13 = this.f76105c;
                int i14 = i13 + 1;
                this.f76105c = i14;
                if (i13 == 0) {
                    this.f76106d = j10;
                    this.f76107e = i10;
                    this.f76108f = 0;
                }
                this.f76108f += i11;
                this.f76109g = i12;
                if (i14 >= 16) {
                    a(cVar);
                }
            }
        }

        public void d(h hVar) throws InterruptedException, IOException {
            if (this.f76104b) {
                return;
            }
            hVar.peekFully(this.f76103a, 0, 10);
            hVar.resetPeekPosition();
            if (g4.a.i(this.f76103a) == 0) {
                return;
            }
            this.f76104b = true;
        }
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(new o4.a(), i10);
    }

    public e(o4.c cVar, int i10) {
        this.f76066q = -1L;
        this.f76067r = -9223372036854775807L;
        this.f76068s = -9223372036854775807L;
        this.f76069t = -9223372036854775807L;
        this.f76075z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f76049a = cVar;
        cVar.b(new b());
        this.f76053d = (i10 & 1) == 0;
        this.f76051b = new g();
        this.f76052c = new SparseArray<>();
        this.f76056g = new t(4);
        this.f76057h = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f76058i = new t(4);
        this.f76054e = new t(q.f3596a);
        this.f76055f = new t(4);
        this.f76059j = new t();
        this.f76060k = new t();
        this.f76061l = new t(8);
        this.f76062m = new t();
        this.f76063n = new t();
    }

    public static int[] k(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static byte[] n(long j10, String str, long j11) {
        a6.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) (i10 * 3600)) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) (i11 * 60)) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return k0.c0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    public static boolean r(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    public static /* synthetic */ k4.g[] t() {
        return new k4.g[]{new e()};
    }

    public static void y(String str, long j10, byte[] bArr) {
        byte[] bArrN;
        int i10;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArrN = n(j10, "%01d:%02d:%02d:%02d", 10000L);
            i10 = 21;
        } else {
            if (!str.equals("S_TEXT/UTF8")) {
                throw new IllegalArgumentException();
            }
            bArrN = n(j10, "%02d:%02d:%02d,%03d", 1000L);
            i10 = 19;
        }
        System.arraycopy(bArrN, 0, bArr, i10, bArrN.length);
    }

    @CallSuper
    public void A(int i10, String str) throws ParserException {
        if (i10 == 134) {
            this.f76070u.f76078b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                this.f76070u.f76077a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                this.f76070u.U = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw new ParserException("DocType " + str + " not supported");
    }

    public final int B(h hVar, c cVar, int i10) throws InterruptedException, IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f76078b)) {
            C(hVar, f76045c0, i10);
            return l();
        }
        if ("S_TEXT/ASS".equals(cVar.f76078b)) {
            C(hVar, f76047e0, i10);
            return l();
        }
        u uVar = cVar.V;
        if (!this.U) {
            if (cVar.f76083g) {
                this.O &= -1073741825;
                if (!this.V) {
                    hVar.readFully(this.f76056g.f3620a, 0, 1);
                    this.R++;
                    byte b10 = this.f76056g.f3620a[0];
                    if ((b10 & 128) == 128) {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                    this.Y = b10;
                    this.V = true;
                }
                byte b11 = this.Y;
                if ((b11 & 1) == 1) {
                    boolean z10 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        hVar.readFully(this.f76061l.f3620a, 0, 8);
                        this.R += 8;
                        this.Z = true;
                        t tVar = this.f76056g;
                        tVar.f3620a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        tVar.L(0);
                        uVar.a(this.f76056g, 1);
                        this.S++;
                        this.f76061l.L(0);
                        uVar.a(this.f76061l, 8);
                        this.S += 8;
                    }
                    if (z10) {
                        if (!this.W) {
                            hVar.readFully(this.f76056g.f3620a, 0, 1);
                            this.R++;
                            this.f76056g.L(0);
                            this.X = this.f76056g.y();
                            this.W = true;
                        }
                        int i12 = this.X * 4;
                        this.f76056g.H(i12);
                        hVar.readFully(this.f76056g.f3620a, 0, i12);
                        this.R += i12;
                        short s10 = (short) ((this.X / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f76064o;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f76064o = ByteBuffer.allocate(i13);
                        }
                        this.f76064o.position(0);
                        this.f76064o.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.X;
                            if (i14 >= i11) {
                                break;
                            }
                            int iC = this.f76056g.C();
                            if (i14 % 2 == 0) {
                                this.f76064o.putShort((short) (iC - i15));
                            } else {
                                this.f76064o.putInt(iC - i15);
                            }
                            i14++;
                            i15 = iC;
                        }
                        int i16 = (i10 - this.R) - i15;
                        if (i11 % 2 == 1) {
                            this.f76064o.putInt(i16);
                        } else {
                            this.f76064o.putShort((short) i16);
                            this.f76064o.putInt(0);
                        }
                        this.f76062m.J(this.f76064o.array(), i13);
                        uVar.a(this.f76062m, i13);
                        this.S += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f76084h;
                if (bArr != null) {
                    this.f76059j.J(bArr, bArr.length);
                }
            }
            if (cVar.f76082f > 0) {
                this.O |= 268435456;
                this.f76063n.G();
                this.f76056g.H(4);
                t tVar2 = this.f76056g;
                byte[] bArr2 = tVar2.f3620a;
                bArr2[0] = (byte) ((i10 >> 24) & 255);
                bArr2[1] = (byte) ((i10 >> 16) & 255);
                bArr2[2] = (byte) ((i10 >> 8) & 255);
                bArr2[3] = (byte) (i10 & 255);
                uVar.a(tVar2, 4);
                this.S += 4;
            }
            this.U = true;
        }
        int iD = i10 + this.f76059j.d();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f76078b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f76078b)) {
            if (cVar.R != null) {
                a6.a.f(this.f76059j.d() == 0);
                cVar.R.d(hVar);
            }
            while (true) {
                int i17 = this.R;
                if (i17 >= iD) {
                    break;
                }
                int iD2 = D(hVar, uVar, iD - i17);
                this.R += iD2;
                this.S += iD2;
            }
        } else {
            byte[] bArr3 = this.f76055f.f3620a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i18 = cVar.W;
            int i19 = 4 - i18;
            while (this.R < iD) {
                int i20 = this.T;
                if (i20 == 0) {
                    E(hVar, bArr3, i19, i18);
                    this.R += i18;
                    this.f76055f.L(0);
                    this.T = this.f76055f.C();
                    this.f76054e.L(0);
                    uVar.a(this.f76054e, 4);
                    this.S += 4;
                } else {
                    int iD3 = D(hVar, uVar, i20);
                    this.R += iD3;
                    this.S += iD3;
                    this.T -= iD3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f76078b)) {
            this.f76057h.L(0);
            uVar.a(this.f76057h, 4);
            this.S += 4;
        }
        return l();
    }

    public final void C(h hVar, byte[] bArr, int i10) throws InterruptedException, IOException {
        int length = bArr.length + i10;
        if (this.f76060k.b() < length) {
            this.f76060k.f3620a = Arrays.copyOf(bArr, length + i10);
        } else {
            System.arraycopy(bArr, 0, this.f76060k.f3620a, 0, bArr.length);
        }
        hVar.readFully(this.f76060k.f3620a, bArr.length, i10);
        this.f76060k.H(length);
    }

    public final int D(h hVar, u uVar, int i10) throws InterruptedException, IOException {
        int iA = this.f76059j.a();
        if (iA <= 0) {
            return uVar.b(hVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        uVar.a(this.f76059j, iMin);
        return iMin;
    }

    public final void E(h hVar, byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int iMin = Math.min(i11, this.f76059j.a());
        hVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f76059j.h(bArr, i10, iMin);
        }
    }

    @Override // k4.g
    public final boolean a(h hVar) throws InterruptedException, IOException {
        return new f().b(hVar);
    }

    @Override // k4.g
    public final void b(i iVar) {
        this.f76050a0 = iVar;
    }

    @Override // k4.g
    public final int c(h hVar, r rVar) throws InterruptedException, IOException {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f76049a.a(hVar);
            if (zA && u(rVar, hVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f76052c.size(); i10++) {
            this.f76052c.valueAt(i10).d();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        throw new com.google.android.exoplayer.ParserException("EBML lacing sample size out of range.");
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(int r22, int r23, k4.h r24) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.e.g(int, int, k4.h):void");
    }

    public final s h() {
        n nVar;
        n nVar2;
        int i10;
        if (this.f76066q == -1 || this.f76069t == -9223372036854775807L || (nVar = this.C) == null || nVar.c() == 0 || (nVar2 = this.D) == null || nVar2.c() != this.C.c()) {
            this.C = null;
            this.D = null;
            return new s.b(this.f76069t);
        }
        int iC = this.C.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            jArrCopyOf3[i12] = this.C.b(i12);
            jArrCopyOf[i12] = this.f76066q + this.D.b(i12);
        }
        while (true) {
            i10 = iC - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        iArrCopyOf[i10] = (int) ((this.f76066q + this.f76065p) - jArrCopyOf[i10]);
        long j10 = this.f76069t - jArrCopyOf3[i10];
        jArrCopyOf2[i10] = j10;
        if (j10 <= 0) {
            m.h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        this.C = null;
        this.D = null;
        return new k4.b(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    public final void i(c cVar, long j10, int i10, int i11, int i12) {
        d dVar = cVar.R;
        if (dVar != null) {
            dVar.c(cVar, j10, i10, i11, i12);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f76078b) || "S_TEXT/ASS".equals(cVar.f76078b)) {
                if (this.K > 1) {
                    m.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        m.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        y(cVar.f76078b, j11, this.f76060k.f3620a);
                        u uVar = cVar.V;
                        t tVar = this.f76060k;
                        uVar.a(tVar, tVar.d());
                        i11 += this.f76060k.d();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    i10 &= -268435457;
                } else {
                    int iD = this.f76063n.d();
                    cVar.V.a(this.f76063n, iD);
                    i11 += iD;
                }
            }
            cVar.V.c(j10, i10, i11, i12, cVar.f76085i);
        }
        this.F = true;
    }

    @CallSuper
    public void j(int i10) throws ParserException {
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            c cVar = this.f76052c.get(this.M);
            for (int i13 = 0; i13 < this.K; i13++) {
                long j10 = ((long) ((cVar.f76081e * i13) / 1000)) + this.H;
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                i11 -= i15;
                i(cVar, j10, i14, i15, i11);
            }
            this.G = 0;
            return;
        }
        if (i10 == 174) {
            if (r(this.f76070u.f76078b)) {
                c cVar2 = this.f76070u;
                cVar2.c(this.f76050a0, cVar2.f76079c);
                SparseArray<c> sparseArray = this.f76052c;
                c cVar3 = this.f76070u;
                sparseArray.put(cVar3.f76079c, cVar3);
            }
            this.f76070u = null;
            return;
        }
        if (i10 == 19899) {
            int i16 = this.f76072w;
            if (i16 != -1) {
                long j11 = this.f76073x;
                if (j11 != -1) {
                    if (i16 == 475249515) {
                        this.f76075z = j11;
                        return;
                    }
                    return;
                }
            }
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        }
        if (i10 == 25152) {
            c cVar4 = this.f76070u;
            if (cVar4.f76083g) {
                if (cVar4.f76085i == null) {
                    throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                }
                cVar4.f76087k = new DrmInitData(new DrmInitData.SchemeData(e4.k.f60167a, "video/webm", this.f76070u.f76085i.f72927b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            c cVar5 = this.f76070u;
            if (cVar5.f76083g && cVar5.f76084h != null) {
                throw new ParserException("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f76067r == -9223372036854775807L) {
                this.f76067r = 1000000L;
            }
            long j12 = this.f76068s;
            if (j12 != -9223372036854775807L) {
                this.f76069t = x(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f76052c.size() == 0) {
                throw new ParserException("No valid tracks were found");
            }
            this.f76050a0.endTracks();
        } else if (i10 == 475249515 && !this.f76071v) {
            this.f76050a0.c(h());
            this.f76071v = true;
        }
    }

    public final int l() {
        int i10 = this.S;
        w();
        return i10;
    }

    @CallSuper
    public void m(int i10, double d10) throws ParserException {
        if (i10 == 181) {
            this.f76070u.O = (int) d10;
        }
        if (i10 == 17545) {
            this.f76068s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                this.f76070u.C = (float) d10;
                break;
            case 21970:
                this.f76070u.D = (float) d10;
                break;
            case 21971:
                this.f76070u.E = (float) d10;
                break;
            case 21972:
                this.f76070u.F = (float) d10;
                break;
            case 21973:
                this.f76070u.G = (float) d10;
                break;
            case 21974:
                this.f76070u.H = (float) d10;
                break;
            case 21975:
                this.f76070u.I = (float) d10;
                break;
            case 21976:
                this.f76070u.J = (float) d10;
                break;
            case 21977:
                this.f76070u.K = (float) d10;
                break;
            case 21978:
                this.f76070u.L = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        this.f76070u.f76094r = (float) d10;
                        break;
                    case 30324:
                        this.f76070u.f76095s = (float) d10;
                        break;
                    case 30325:
                        this.f76070u.f76096t = (float) d10;
                        break;
                }
                break;
        }
    }

    @CallSuper
    public int o(int i10) {
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void p(c cVar, int i10, h hVar, int i11) throws InterruptedException, IOException {
        if (i10 != 4 || !"V_VP9".equals(cVar.f76078b)) {
            hVar.skipFully(i11);
        } else {
            this.f76063n.H(i11);
            hVar.readFully(this.f76063n.f3620a, 0, i11);
        }
    }

    @CallSuper
    public void q(int i10, long j10) throws ParserException {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw new ParserException("ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw new ParserException("ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                this.f76070u.f76080d = (int) j10;
                return;
            case 136:
                this.f76070u.T = j10 == 1;
                return;
            case 155:
                this.I = x(j10);
                return;
            case 159:
                this.f76070u.M = (int) j10;
                return;
            case 176:
                this.f76070u.f76088l = (int) j10;
                return;
            case 179:
                this.C.a(x(j10));
                return;
            case 186:
                this.f76070u.f76089m = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                this.f76070u.f76079c = (int) j10;
                return;
            case 231:
                this.B = x(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                this.D.a(j10);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw new ParserException("ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw new ParserException("DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw new ParserException("EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw new ParserException("ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw new ParserException("AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                this.f76073x = j10 + this.f76066q;
                return;
            case 21432:
                int i11 = (int) j10;
                if (i11 == 0) {
                    this.f76070u.f76098v = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f76070u.f76098v = 2;
                    return;
                } else if (i11 == 3) {
                    this.f76070u.f76098v = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f76070u.f76098v = 3;
                    return;
                }
            case 21680:
                this.f76070u.f76090n = (int) j10;
                return;
            case 21682:
                this.f76070u.f76092p = (int) j10;
                return;
            case 21690:
                this.f76070u.f76091o = (int) j10;
                return;
            case 21930:
                this.f76070u.S = j10 == 1;
                return;
            case 21998:
                this.f76070u.f76082f = (int) j10;
                return;
            case 22186:
                this.f76070u.P = j10;
                return;
            case 22203:
                this.f76070u.Q = j10;
                return;
            case 25188:
                this.f76070u.N = (int) j10;
                return;
            case 30321:
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f76070u.f76093q = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f76070u.f76093q = 1;
                    return;
                } else if (i12 == 2) {
                    this.f76070u.f76093q = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f76070u.f76093q = 3;
                    return;
                }
            case 2352003:
                this.f76070u.f76081e = (int) j10;
                return;
            case 2807729:
                this.f76067r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f76070u.f76102z = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f76070u.f76102z = 1;
                            return;
                        }
                    case 21946:
                        int i14 = (int) j10;
                        if (i14 != 1) {
                            if (i14 == 16) {
                                this.f76070u.f76101y = 6;
                                return;
                            } else if (i14 == 18) {
                                this.f76070u.f76101y = 7;
                                return;
                            } else if (i14 != 6 && i14 != 7) {
                                return;
                            }
                        }
                        this.f76070u.f76101y = 3;
                        return;
                    case 21947:
                        c cVar = this.f76070u;
                        cVar.f76099w = true;
                        int i15 = (int) j10;
                        if (i15 == 1) {
                            cVar.f76100x = 1;
                            return;
                        }
                        if (i15 == 9) {
                            cVar.f76100x = 6;
                            return;
                        } else {
                            if (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) {
                                cVar.f76100x = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.f76070u.A = (int) j10;
                        return;
                    case 21949:
                        this.f76070u.B = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // k4.g
    public final void release() {
    }

    @CallSuper
    public boolean s(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    @Override // k4.g
    @CallSuper
    public void seek(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f76049a.reset();
        this.f76051b.e();
        w();
        for (int i10 = 0; i10 < this.f76052c.size(); i10++) {
            this.f76052c.valueAt(i10).h();
        }
    }

    public final boolean u(r rVar, long j10) {
        if (this.f76074y) {
            this.A = j10;
            rVar.f72918a = this.f76075z;
            this.f76074y = false;
            return true;
        }
        if (this.f76071v) {
            long j11 = this.A;
            if (j11 != -1) {
                rVar.f72918a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    public final void v(h hVar, int i10) throws InterruptedException, IOException {
        if (this.f76056g.d() >= i10) {
            return;
        }
        if (this.f76056g.b() < i10) {
            t tVar = this.f76056g;
            byte[] bArr = tVar.f3620a;
            tVar.J(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10)), this.f76056g.d());
        }
        t tVar2 = this.f76056g;
        hVar.readFully(tVar2.f3620a, tVar2.d(), i10 - this.f76056g.d());
        this.f76056g.K(i10);
    }

    public final void w() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f76059j.G();
    }

    public final long x(long j10) throws ParserException {
        long j11 = this.f76067r;
        if (j11 != -9223372036854775807L) {
            return k0.y0(j10, j11, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    @CallSuper
    public void z(int i10, long j10, long j11) throws ParserException {
        if (i10 == 160) {
            this.Q = false;
            return;
        }
        if (i10 == 174) {
            this.f76070u = new c();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f76072w = -1;
            this.f76073x = -1L;
            return;
        }
        if (i10 == 20533) {
            this.f76070u.f76083g = true;
            return;
        }
        if (i10 == 21968) {
            this.f76070u.f76099w = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f76066q;
            if (j12 != -1 && j12 != j10) {
                throw new ParserException("Multiple Segment elements not supported");
            }
            this.f76066q = j10;
            this.f76065p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new n();
            this.D = new n();
        } else if (i10 == 524531317 && !this.f76071v) {
            if (this.f76053d && this.f76075z != -1) {
                this.f76074y = true;
            } else {
                this.f76050a0.c(new s.b(this.f76069t));
                this.f76071v = true;
            }
        }
    }
}
