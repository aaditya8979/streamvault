package o6;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import i6.b0;
import i6.c0;
import i6.k;
import i6.l;
import i6.m;
import i6.p;
import i6.y;
import i6.z;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import s7.a0;
import s7.m0;
import s7.q;
import s7.r;
import s7.v;

/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public class e implements k {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final p f76205c0 = new p() { // from class: o6.d
        @Override // i6.p
        public final k[] createExtractors() {
            return e.z();
        }
    };

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f76206d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f76207e0 = m0.h0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f76208f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f76209g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final UUID f76210h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Map<String, Integer> f76211i0;
    public long A;
    public long B;

    @Nullable
    public r C;

    @Nullable
    public r D;
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
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o6.c f76212a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f76213a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f76214b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public m f76215b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<c> f76216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f76217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f76218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f76219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f76220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f76221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f76222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f76223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a0 f76224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f76225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a0 f76226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f76227n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f76228o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f76229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f76230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f76231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f76232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f76233t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public c f76234u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f76235v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f76236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f76237x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f76238y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f76239z;

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public final class b implements o6.b {
        public b() {
        }

        @Override // o6.b
        public void a(int i10, int i11, l lVar) throws IOException {
            e.this.k(i10, i11, lVar);
        }

        @Override // o6.b
        public void endMasterElement(int i10) throws ParserException {
            e.this.n(i10);
        }

        @Override // o6.b
        public void floatElement(int i10, double d10) throws ParserException {
            e.this.q(i10, d10);
        }

        @Override // o6.b
        public int getElementType(int i10) {
            return e.this.t(i10);
        }

        @Override // o6.b
        public void integerElement(int i10, long j10) throws ParserException {
            e.this.w(i10, j10);
        }

        @Override // o6.b
        public boolean isLevel1Element(int i10) {
            return e.this.y(i10);
        }

        @Override // o6.b
        public void startMasterElement(int i10, long j10, long j11) throws ParserException {
            e.this.F(i10, j10, j11);
        }

        @Override // o6.b
        public void stringElement(int i10, String str) throws ParserException {
            e.this.G(i10, str);
        }
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class c {
        public byte[] N;
        public c0 T;
        public boolean U;
        public b0 X;
        public int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f76241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f76242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f76243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f76245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f76246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f76247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f76248h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f76249i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b0.a f76250j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f76251k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DrmInitData f76252l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f76253m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f76254n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f76255o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f76256p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f76257q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f76258r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f76259s = 0.0f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f76260t = 0.0f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f76261u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f76262v = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f76263w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f76264x = false;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f76265y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f76266z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        public String W = "eng";

        public static Pair<String, List<byte[]>> k(a0 a0Var) throws ParserException {
            try {
                a0Var.Q(16);
                long jT = a0Var.t();
                if (jT == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jT == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jT != 826496599) {
                    q.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrD = a0Var.d();
                for (int iE = a0Var.e() + 20; iE < bArrD.length - 4; iE++) {
                    if (bArrD[iE] == 0 && bArrD[iE + 1] == 0 && bArrD[iE + 2] == 1 && bArrD[iE + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrD, iE, bArrD.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        public static boolean l(a0 a0Var) throws ParserException {
            try {
                int iV = a0Var.v();
                if (iV == 1) {
                    return true;
                }
                if (iV != 65534) {
                    return false;
                }
                a0Var.P(24);
                if (a0Var.w() == e.f76210h0.getMostSignificantBits()) {
                    if (a0Var.w() == e.f76210h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        public static List<byte[]> m(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        public final void f() {
            s7.a.e(this.X);
        }

        public final byte[] g(String str) throws ParserException {
            byte[] bArr = this.f76251k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        public final byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0417  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x0430  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0432  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0451  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x055a  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(i6.m r20, int r21) throws com.google.android.exoplayer2.ParserException {
            /*
                Method dump skipped, instruction units count: 1648
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o6.e.c.i(i6.m, int):void");
        }

        public void j() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.a(this.X, this.f76250j);
            }
        }

        public void n() {
            c0 c0Var = this.T;
            if (c0Var != null) {
                c0Var.b();
            }
        }

        public final boolean o(boolean z10) {
            return "A_OPUS".equals(this.f76242b) ? z10 : this.f76246f > 0;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", Integer.valueOf(BaseTransientBottomBar.ANIMATION_FADE_DURATION));
        map.put("htc_video_rotA-270", 270);
        f76211i0 = Collections.unmodifiableMap(map);
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(new o6.a(), i10);
    }

    public e(o6.c cVar, int i10) {
        this.f76230q = -1L;
        this.f76231r = -9223372036854775807L;
        this.f76232s = -9223372036854775807L;
        this.f76233t = -9223372036854775807L;
        this.f76239z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f76212a = cVar;
        cVar.b(new b());
        this.f76217d = (i10 & 1) == 0;
        this.f76214b = new g();
        this.f76216c = new SparseArray<>();
        this.f76220g = new a0(4);
        this.f76221h = new a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f76222i = new a0(4);
        this.f76218e = new a0(v.f79531a);
        this.f76219f = new a0(4);
        this.f76223j = new a0();
        this.f76224k = new a0();
        this.f76225l = new a0(8);
        this.f76226m = new a0();
        this.f76227n = new a0();
        this.L = new int[1];
    }

    public static void E(String str, long j10, byte[] bArr) {
        byte[] bArrR;
        int i10;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                bArrR = r(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrR = r(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrR = r(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrR, 0, bArr, i10, bArrR.length);
    }

    public static int[] o(@Nullable int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static byte[] r(long j10, String str, long j11) {
        s7.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((((long) i10) * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((((long) i11) * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return m0.h0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    public static boolean x(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    public static /* synthetic */ k[] z() {
        return new k[]{new e()};
    }

    public final boolean A(y yVar, long j10) {
        if (this.f76238y) {
            this.A = j10;
            yVar.f63944a = this.f76239z;
            this.f76238y = false;
            return true;
        }
        if (this.f76235v) {
            long j11 = this.A;
            if (j11 != -1) {
                yVar.f63944a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    public final void B(l lVar, int i10) throws IOException {
        if (this.f76220g.f() >= i10) {
            return;
        }
        if (this.f76220g.b() < i10) {
            a0 a0Var = this.f76220g;
            a0Var.c(Math.max(a0Var.b() * 2, i10));
        }
        lVar.readFully(this.f76220g.d(), this.f76220g.f(), i10 - this.f76220g.f());
        this.f76220g.O(i10);
    }

    public final void C() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f76213a0 = false;
        this.f76223j.L(0);
    }

    public final long D(long j10) throws ParserException {
        long j11 = this.f76231r;
        if (j11 != -9223372036854775807L) {
            return m0.F0(j10, j11, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @CallSuper
    public void F(int i10, long j10, long j11) throws ParserException {
        j();
        if (i10 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i10 == 174) {
            this.f76234u = new c();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f76236w = -1;
            this.f76237x = -1L;
            return;
        }
        if (i10 == 20533) {
            s(i10).f76248h = true;
            return;
        }
        if (i10 == 21968) {
            s(i10).f76264x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f76230q;
            if (j12 != -1 && j12 != j10) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.f76230q = j10;
            this.f76229p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new r();
            this.D = new r();
        } else if (i10 == 524531317 && !this.f76235v) {
            if (this.f76217d && this.f76239z != -1) {
                this.f76238y = true;
            } else {
                this.f76215b0.h(new z.b(this.f76233t));
                this.f76235v = true;
            }
        }
    }

    @CallSuper
    public void G(int i10, String str) throws ParserException {
        if (i10 == 134) {
            s(i10).f76242b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                s(i10).f76241a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                s(i10).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    public final int H(l lVar, c cVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f76242b)) {
            I(lVar, f76206d0, i10);
            return p();
        }
        if ("S_TEXT/ASS".equals(cVar.f76242b)) {
            I(lVar, f76208f0, i10);
            return p();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f76242b)) {
            I(lVar, f76209g0, i10);
            return p();
        }
        b0 b0Var = cVar.X;
        if (!this.V) {
            if (cVar.f76248h) {
                this.O &= -1073741825;
                if (!this.W) {
                    lVar.readFully(this.f76220g.d(), 0, 1);
                    this.S++;
                    if ((this.f76220g.d()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.Z = this.f76220g.d()[0];
                    this.W = true;
                }
                byte b10 = this.Z;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f76213a0) {
                        lVar.readFully(this.f76225l.d(), 0, 8);
                        this.S += 8;
                        this.f76213a0 = true;
                        this.f76220g.d()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f76220g.P(0);
                        b0Var.a(this.f76220g, 1, 1);
                        this.T++;
                        this.f76225l.P(0);
                        b0Var.a(this.f76225l, 8, 1);
                        this.T += 8;
                    }
                    if (z11) {
                        if (!this.X) {
                            lVar.readFully(this.f76220g.d(), 0, 1);
                            this.S++;
                            this.f76220g.P(0);
                            this.Y = this.f76220g.D();
                            this.X = true;
                        }
                        int i12 = this.Y * 4;
                        this.f76220g.L(i12);
                        lVar.readFully(this.f76220g.d(), 0, i12);
                        this.S += i12;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f76228o;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f76228o = ByteBuffer.allocate(i13);
                        }
                        this.f76228o.position(0);
                        this.f76228o.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i14 >= i11) {
                                break;
                            }
                            int iH = this.f76220g.H();
                            if (i14 % 2 == 0) {
                                this.f76228o.putShort((short) (iH - i15));
                            } else {
                                this.f76228o.putInt(iH - i15);
                            }
                            i14++;
                            i15 = iH;
                        }
                        int i16 = (i10 - this.S) - i15;
                        if (i11 % 2 == 1) {
                            this.f76228o.putInt(i16);
                        } else {
                            this.f76228o.putShort((short) i16);
                            this.f76228o.putInt(0);
                        }
                        this.f76226m.N(this.f76228o.array(), i13);
                        b0Var.a(this.f76226m, i13, 1);
                        this.T += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f76249i;
                if (bArr != null) {
                    this.f76223j.N(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.O |= 268435456;
                this.f76227n.L(0);
                int iF = (this.f76223j.f() + i10) - this.S;
                this.f76220g.L(4);
                this.f76220g.d()[0] = (byte) ((iF >> 24) & 255);
                this.f76220g.d()[1] = (byte) ((iF >> 16) & 255);
                this.f76220g.d()[2] = (byte) ((iF >> 8) & 255);
                this.f76220g.d()[3] = (byte) (iF & 255);
                b0Var.a(this.f76220g, 4, 2);
                this.T += 4;
            }
            this.V = true;
        }
        int iF2 = i10 + this.f76223j.f();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f76242b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f76242b)) {
            if (cVar.T != null) {
                s7.a.g(this.f76223j.f() == 0);
                cVar.T.d(lVar);
            }
            while (true) {
                int i17 = this.S;
                if (i17 >= iF2) {
                    break;
                }
                int iJ = J(lVar, b0Var, iF2 - i17);
                this.S += iJ;
                this.T += iJ;
            }
        } else {
            byte[] bArrD = this.f76219f.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i18 = cVar.Y;
            int i19 = 4 - i18;
            while (this.S < iF2) {
                int i20 = this.U;
                if (i20 == 0) {
                    K(lVar, bArrD, i19, i18);
                    this.S += i18;
                    this.f76219f.P(0);
                    this.U = this.f76219f.H();
                    this.f76218e.P(0);
                    b0Var.e(this.f76218e, 4);
                    this.T += 4;
                } else {
                    int iJ2 = J(lVar, b0Var, i20);
                    this.S += iJ2;
                    this.T += iJ2;
                    this.U -= iJ2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f76242b)) {
            this.f76221h.P(0);
            b0Var.e(this.f76221h, 4);
            this.T += 4;
        }
        return p();
    }

    public final void I(l lVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f76224k.b() < length) {
            this.f76224k.M(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f76224k.d(), 0, bArr.length);
        }
        lVar.readFully(this.f76224k.d(), bArr.length, i10);
        this.f76224k.P(0);
        this.f76224k.O(length);
    }

    public final int J(l lVar, b0 b0Var, int i10) throws IOException {
        int iA = this.f76223j.a();
        if (iA <= 0) {
            return b0Var.f(lVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        b0Var.e(this.f76223j, iMin);
        return iMin;
    }

    public final void K(l lVar, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f76223j.a());
        lVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f76223j.j(bArr, i10, iMin);
        }
    }

    @Override // i6.k
    public final void a(m mVar) {
        this.f76215b0 = mVar;
    }

    @Override // i6.k
    public final int b(l lVar, y yVar) throws IOException {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f76212a.a(lVar);
            if (zA && A(yVar, lVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f76216c.size(); i10++) {
            c cVarValueAt = this.f76216c.valueAt(i10);
            cVarValueAt.f();
            cVarValueAt.j();
        }
        return -1;
    }

    @Override // i6.k
    public final boolean c(l lVar) throws IOException {
        return new f().b(lVar);
    }

    public final void h(int i10) throws ParserException {
        if (this.C == null || this.D == null) {
            throw ParserException.createForMalformedContainer("Element " + i10 + " must be in a Cues", null);
        }
    }

    public final void i(int i10) throws ParserException {
        if (this.f76234u != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i10 + " must be in a TrackEntry", null);
    }

    public final void j() {
        s7.a.i(this.f76215b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x023d, code lost:
    
        throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
     */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r22, int r23, i6.l r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.e.k(int, int, i6.l):void");
    }

    public final z l(@Nullable r rVar, @Nullable r rVar2) {
        int i10;
        if (this.f76230q == -1 || this.f76233t == -9223372036854775807L || rVar == null || rVar.c() == 0 || rVar2 == null || rVar2.c() != rVar.c()) {
            return new z.b(this.f76233t);
        }
        int iC = rVar.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            jArrCopyOf3[i12] = rVar.b(i12);
            jArrCopyOf[i12] = this.f76230q + rVar2.b(i12);
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
        iArrCopyOf[i10] = (int) ((this.f76230q + this.f76229p) - jArrCopyOf[i10]);
        long j10 = this.f76233t - jArrCopyOf3[i10];
        jArrCopyOf2[i10] = j10;
        if (j10 <= 0) {
            q.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        return new i6.c(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    public final void m(c cVar, long j10, int i10, int i11, int i12) {
        c0 c0Var = cVar.T;
        if (c0Var != null) {
            c0Var.c(cVar.X, j10, i10, i11, i12, cVar.f76250j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f76242b) || "S_TEXT/ASS".equals(cVar.f76242b) || "S_TEXT/WEBVTT".equals(cVar.f76242b)) {
                if (this.K > 1) {
                    q.i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        q.i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        E(cVar.f76242b, j11, this.f76224k.d());
                        int iE = this.f76224k.e();
                        while (true) {
                            if (iE >= this.f76224k.f()) {
                                break;
                            }
                            if (this.f76224k.d()[iE] == 0) {
                                this.f76224k.O(iE);
                                break;
                            }
                            iE++;
                        }
                        b0 b0Var = cVar.X;
                        a0 a0Var = this.f76224k;
                        b0Var.e(a0Var, a0Var.f());
                        i11 += this.f76224k.f();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    this.f76227n.L(0);
                } else {
                    int iF = this.f76227n.f();
                    cVar.X.a(this.f76227n, iF, 2);
                    i11 += iF;
                }
            }
            cVar.X.c(j10, i10, i11, i12, cVar.f76250j);
        }
        this.F = true;
    }

    @CallSuper
    public void n(int i10) throws ParserException {
        j();
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            c cVar = this.f76216c.get(this.M);
            cVar.f();
            if (this.R > 0 && "A_OPUS".equals(cVar.f76242b)) {
                this.f76227n.M(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            int i13 = 0;
            while (i13 < this.K) {
                long j10 = this.H + ((long) ((cVar.f76245e * i13) / 1000));
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                int i16 = i11 - i15;
                m(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.G = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) s7.a.i(this.f76234u);
            String str = cVar2.f76242b;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (x(str)) {
                cVar2.i(this.f76215b0, cVar2.f76243c);
                this.f76216c.put(cVar2.f76243c, cVar2);
            }
            this.f76234u = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f76236w;
            if (i17 != -1) {
                long j11 = this.f76237x;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f76239z = j11;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            i(i10);
            c cVar3 = this.f76234u;
            if (cVar3.f76248h) {
                if (cVar3.f76250j == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f76252l = new DrmInitData(new DrmInitData.SchemeData(d6.c.f59581a, "video/webm", this.f76234u.f76250j.f63841b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            i(i10);
            c cVar4 = this.f76234u;
            if (cVar4.f76248h && cVar4.f76249i != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f76231r == -9223372036854775807L) {
                this.f76231r = 1000000L;
            }
            long j12 = this.f76232s;
            if (j12 != -9223372036854775807L) {
                this.f76233t = D(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f76216c.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.f76215b0.endTracks();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f76235v) {
                this.f76215b0.h(l(this.C, this.D));
                this.f76235v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    public final int p() {
        int i10 = this.T;
        C();
        return i10;
    }

    @CallSuper
    public void q(int i10, double d10) throws ParserException {
        if (i10 == 181) {
            s(i10).Q = (int) d10;
        }
        if (i10 == 17545) {
            this.f76232s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                s(i10).D = (float) d10;
                break;
            case 21970:
                s(i10).E = (float) d10;
                break;
            case 21971:
                s(i10).F = (float) d10;
                break;
            case 21972:
                s(i10).G = (float) d10;
                break;
            case 21973:
                s(i10).H = (float) d10;
                break;
            case 21974:
                s(i10).I = (float) d10;
                break;
            case 21975:
                s(i10).J = (float) d10;
                break;
            case 21976:
                s(i10).K = (float) d10;
                break;
            case 21977:
                s(i10).L = (float) d10;
                break;
            case 21978:
                s(i10).M = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        s(i10).f76259s = (float) d10;
                        break;
                    case 30324:
                        s(i10).f76260t = (float) d10;
                        break;
                    case 30325:
                        s(i10).f76261u = (float) d10;
                        break;
                }
                break;
        }
    }

    @Override // i6.k
    public final void release() {
    }

    public c s(int i10) throws ParserException {
        i(i10);
        return this.f76234u;
    }

    @Override // i6.k
    @CallSuper
    public void seek(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f76212a.reset();
        this.f76214b.e();
        C();
        for (int i10 = 0; i10 < this.f76216c.size(); i10++) {
            this.f76216c.valueAt(i10).n();
        }
    }

    @CallSuper
    public int t(int i10) {
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
            case 16871:
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
            case 30114:
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
            case 16868:
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
            case 16877:
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

    public void u(c cVar, l lVar, int i10) throws IOException {
        if (cVar.f76247g != 1685485123 && cVar.f76247g != 1685480259) {
            lVar.skipFully(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        lVar.readFully(bArr, 0, i10);
    }

    public void v(c cVar, int i10, l lVar, int i11) throws IOException {
        if (i10 != 4 || !"V_VP9".equals(cVar.f76242b)) {
            lVar.skipFully(i11);
        } else {
            this.f76227n.L(i11);
            lVar.readFully(this.f76227n.d(), 0, i11);
        }
    }

    @CallSuper
    public void w(int i10, long j10) throws ParserException {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                s(i10).f76244d = (int) j10;
                return;
            case 136:
                s(i10).V = j10 == 1;
                return;
            case 155:
                this.I = D(j10);
                return;
            case 159:
                s(i10).O = (int) j10;
                return;
            case 176:
                s(i10).f76253m = (int) j10;
                return;
            case 179:
                h(i10);
                this.C.a(D(j10));
                return;
            case 186:
                s(i10).f76254n = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                s(i10).f76243c = (int) j10;
                return;
            case 231:
                this.B = D(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                h(i10);
                this.D.a(j10);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                s(i10).f76247g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f76237x = j10 + this.f76230q;
                return;
            case 21432:
                int i11 = (int) j10;
                i(i10);
                if (i11 == 0) {
                    this.f76234u.f76263w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f76234u.f76263w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f76234u.f76263w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f76234u.f76263w = 3;
                    return;
                }
            case 21680:
                s(i10).f76255o = (int) j10;
                return;
            case 21682:
                s(i10).f76257q = (int) j10;
                return;
            case 21690:
                s(i10).f76256p = (int) j10;
                return;
            case 21930:
                s(i10).U = j10 == 1;
                return;
            case 21998:
                s(i10).f76246f = (int) j10;
                return;
            case 22186:
                s(i10).R = j10;
                return;
            case 22203:
                s(i10).S = j10;
                return;
            case 25188:
                s(i10).P = (int) j10;
                return;
            case 30114:
                this.R = j10;
                return;
            case 30321:
                i(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f76234u.f76258r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f76234u.f76258r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f76234u.f76258r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f76234u.f76258r = 3;
                    return;
                }
            case 2352003:
                s(i10).f76245e = (int) j10;
                return;
            case 2807729:
                this.f76231r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        i(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f76234u.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f76234u.A = 1;
                            return;
                        }
                    case 21946:
                        i(i10);
                        int iC = t7.c.c((int) j10);
                        if (iC != -1) {
                            this.f76234u.f76266z = iC;
                            return;
                        }
                        return;
                    case 21947:
                        i(i10);
                        this.f76234u.f76264x = true;
                        int iB = t7.c.b((int) j10);
                        if (iB != -1) {
                            this.f76234u.f76265y = iB;
                            return;
                        }
                        return;
                    case 21948:
                        s(i10).B = (int) j10;
                        return;
                    case 21949:
                        s(i10).C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public boolean y(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }
}
