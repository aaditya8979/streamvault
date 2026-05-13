package yads;

import android.util.SparseArray;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import yads.mq0;
import yads.zi1;

/* JADX INFO: loaded from: classes4.dex */
public final class zi1 implements mq0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f97585c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f97586d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f97587e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f97588f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final UUID f97589g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Map f97590h0;
    public long A;
    public long B;
    public kh1 C;
    public kh1 D;
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
    public final tl0 f97591a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f97592a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb3 f97593b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public pq0 f97594b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f97595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f97596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jb2 f97597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f97598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f97599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jb2 f97600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jb2 f97601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jb2 f97602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jb2 f97603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jb2 f97604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f97605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jb2 f97606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f97607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f97608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f97609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f97610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f97611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f97612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public yi1 f97613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f97614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f97615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f97616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f97617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f97618z;

    static {
        new rq0() { // from class: bt.dd
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return zi1.a();
            }
        };
        f97585c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f97586d0 = ib3.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f97587e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f97588f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f97589g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        wi1.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        wi1.a(BaseTransientBottomBar.ANIMATION_FADE_DURATION, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f97590h0 = Collections.unmodifiableMap(map);
    }

    public zi1() {
        this(new jd0(), 0);
    }

    public zi1(jd0 jd0Var, int i10) {
        this.f97609q = -1L;
        this.f97610r = -9223372036854775807L;
        this.f97611s = -9223372036854775807L;
        this.f97612t = -9223372036854775807L;
        this.f97618z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f97591a = jd0Var;
        jd0Var.a(new xi1(this));
        this.f97596d = (i10 & 1) == 0;
        this.f97593b = new wb3();
        this.f97595c = new SparseArray();
        this.f97599g = new jb2(4);
        this.f97600h = new jb2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f97601i = new jb2(4);
        this.f97597e = new jb2(dy1.f89024a);
        this.f97598f = new jb2(4);
        this.f97602j = new jb2();
        this.f97603k = new jb2();
        this.f97604l = new jb2(8);
        this.f97605m = new jb2();
        this.f97606n = new jb2();
        this.L = new int[1];
    }

    public static byte[] a(String str, long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            throw new IllegalArgumentException();
        }
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return ib3.c(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    public static mq0[] a() {
        return new mq0[]{new zi1(new jd0(), 0)};
    }

    public final int a(ld0 ld0Var, yi1 yi1Var, int i10, boolean z10) throws ob2, EOFException, InterruptedIOException {
        int iA;
        int iA2;
        int i11;
        if ("S_TEXT/UTF8".equals(yi1Var.f97155b)) {
            a(ld0Var, f97585c0, i10);
            int i12 = this.T;
            b();
            return i12;
        }
        if ("S_TEXT/ASS".equals(yi1Var.f97155b)) {
            a(ld0Var, f97587e0, i10);
            int i13 = this.T;
            b();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(yi1Var.f97155b)) {
            a(ld0Var, f97588f0, i10);
            int i14 = this.T;
            b();
            return i14;
        }
        m73 m73Var = yi1Var.X;
        if (!this.V) {
            if (yi1Var.f97161h) {
                this.O &= -1073741825;
                if (!this.W) {
                    ld0Var.a(this.f97599g.f91147a, 0, 1, false);
                    this.S++;
                    byte b10 = this.f97599g.f91147a[0];
                    if ((b10 & 128) == 128) {
                        throw new ob2("Extension bit is set in signal byte", null, true, 1);
                    }
                    this.Z = b10;
                    this.W = true;
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z11 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f97592a0) {
                        ld0Var.a(this.f97604l.f91147a, 0, 8, false);
                        this.S += 8;
                        this.f97592a0 = true;
                        jb2 jb2Var = this.f97599g;
                        jb2Var.f91147a[0] = (byte) ((z11 ? 128 : 0) | 8);
                        jb2Var.e(0);
                        m73Var.a(1, this.f97599g);
                        this.T++;
                        this.f97604l.e(0);
                        m73Var.a(8, this.f97604l);
                        this.T += 8;
                    }
                    if (z11) {
                        if (!this.X) {
                            ld0Var.a(this.f97599g.f91147a, 0, 1, false);
                            this.S++;
                            this.f97599g.e(0);
                            this.Y = this.f97599g.m();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        this.f97599g.c(i15);
                        ld0Var.a(this.f97599g.f91147a, 0, i15, false);
                        this.S += i15;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f97607o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f97607o = ByteBuffer.allocate(i16);
                        }
                        this.f97607o.position(0);
                        this.f97607o.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int iP = this.f97599g.p();
                            if (i17 % 2 == 0) {
                                this.f97607o.putShort((short) (iP - i18));
                            } else {
                                this.f97607o.putInt(iP - i18);
                            }
                            i17++;
                            i18 = iP;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.f97607o.putInt(i19);
                        } else {
                            this.f97607o.putShort((short) i19);
                            this.f97607o.putInt(0);
                        }
                        jb2 jb2Var2 = this.f97605m;
                        jb2Var2.f91147a = this.f97607o.array();
                        jb2Var2.f91149c = i16;
                        jb2Var2.f91148b = 0;
                        m73Var.a(i16, this.f97605m);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = yi1Var.f97162i;
                if (bArr != null) {
                    jb2 jb2Var3 = this.f97602j;
                    int length = bArr.length;
                    jb2Var3.f91147a = bArr;
                    jb2Var3.f91149c = length;
                    jb2Var3.f91148b = 0;
                }
            }
            if (!"A_OPUS".equals(yi1Var.f97155b) ? yi1Var.f97159f > 0 : z10) {
                this.O |= 268435456;
                this.f97606n.c(0);
                int i20 = (this.f97602j.f91149c + i10) - this.S;
                this.f97599g.c(4);
                jb2 jb2Var4 = this.f97599g;
                byte[] bArr2 = jb2Var4.f91147a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                m73Var.a(4, jb2Var4);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + this.f97602j.f91149c;
        if (!"V_MPEG4/ISO/AVC".equals(yi1Var.f97155b) && !"V_MPEGH/ISO/HEVC".equals(yi1Var.f97155b)) {
            z83 z83Var = yi1Var.T;
            if (z83Var != null) {
                if (this.f97602j.f91149c != 0) {
                    throw new IllegalStateException();
                }
                z83Var.a(ld0Var);
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                jb2 jb2Var5 = this.f97602j;
                int i24 = jb2Var5.f91149c - jb2Var5.f91148b;
                if (i24 > 0) {
                    iA2 = Math.min(i23, i24);
                    m73Var.a(iA2, this.f97602j);
                } else {
                    iA2 = m73Var.a(ld0Var, i23, false);
                }
                this.S += iA2;
                this.T += iA2;
            }
        } else {
            byte[] bArr3 = this.f97598f.f91147a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i25 = yi1Var.Y;
            int i26 = 4 - i25;
            while (this.S < i21) {
                int i27 = this.U;
                if (i27 == 0) {
                    jb2 jb2Var6 = this.f97602j;
                    int iMin = Math.min(i25, jb2Var6.f91149c - jb2Var6.f91148b);
                    ld0Var.a(bArr3, i26 + iMin, i25 - iMin, false);
                    if (iMin > 0) {
                        this.f97602j.a(bArr3, i26, iMin);
                    }
                    this.S += i25;
                    this.f97598f.e(0);
                    this.U = this.f97598f.p();
                    this.f97597e.e(0);
                    m73Var.a(4, this.f97597e);
                    this.T += 4;
                } else {
                    jb2 jb2Var7 = this.f97602j;
                    int i28 = jb2Var7.f91149c - jb2Var7.f91148b;
                    if (i28 > 0) {
                        iA = Math.min(i27, i28);
                        m73Var.a(iA, this.f97602j);
                    } else {
                        iA = m73Var.a(ld0Var, i27, false);
                    }
                    this.S += iA;
                    this.T += iA;
                    this.U -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(yi1Var.f97155b)) {
            this.f97600h.e(0);
            m73Var.a(4, this.f97600h);
            this.T += 4;
        }
        int i29 = this.T;
        b();
        return i29;
    }

    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            ld0 ld0Var = (ld0) nq0Var;
            zA = ((jd0) this.f97591a).a(ld0Var);
            if (zA) {
                long j10 = ld0Var.f91938d;
                if (this.f97617y) {
                    this.A = j10;
                    gg2Var.f89980a = this.f97618z;
                    this.f97617y = false;
                } else if (this.f97614v) {
                    long j11 = this.A;
                    if (j11 != -1) {
                        gg2Var.f89980a = j11;
                        this.A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f97595c.size(); i10++) {
            yi1 yi1Var = (yi1) this.f97595c.valueAt(i10);
            yi1Var.X.getClass();
            z83 z83Var = yi1Var.T;
            if (z83Var != null) {
                m73 m73Var = yi1Var.X;
                l73 l73Var = yi1Var.f97163j;
                if (z83Var.f97427c > 0) {
                    m73Var.a(z83Var.f97428d, z83Var.f97429e, z83Var.f97430f, z83Var.f97431g, l73Var);
                    z83Var.f97427c = 0;
                }
            }
        }
        return -1;
    }

    public final long a(long j10) throws ob2 {
        long j11 = this.f97610r;
        if (j11 != -9223372036854775807L) {
            return ib3.a(j10, j11, 1000L);
        }
        throw new ob2("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    public final void a(int i10) {
        if (this.f97613u != null) {
            return;
        }
        throw new ob2("Element " + i10 + " must be in a TrackEntry", null, true, 1);
    }

    public final void a(ld0 ld0Var, int i10) {
        jb2 jb2Var = this.f97599g;
        if (jb2Var.f91149c >= i10) {
            return;
        }
        byte[] bArr = jb2Var.f91147a;
        if (bArr.length < i10) {
            jb2Var.a(Math.max(bArr.length * 2, i10));
        }
        jb2 jb2Var2 = this.f97599g;
        byte[] bArr2 = jb2Var2.f91147a;
        int i11 = jb2Var2.f91149c;
        ld0Var.a(bArr2, i11, i10 - i11, false);
        this.f97599g.d(i10);
    }

    public final void a(ld0 ld0Var, byte[] bArr, int i10) throws EOFException, InterruptedIOException {
        int length = bArr.length + i10;
        jb2 jb2Var = this.f97603k;
        byte[] bArr2 = jb2Var.f91147a;
        if (bArr2.length < length) {
            jb2Var.a(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ld0Var.a(this.f97603k.f91147a, bArr.length, i10, false);
        this.f97603k.e(0);
        this.f97603k.d(length);
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f97594b0 = pq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.yi1 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zi1.a(yads.yi1, long, int, int, int):void");
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        t13 t13Var = new t13();
        ld0 ld0Var = (ld0) nq0Var;
        long j10 = ld0Var.f91937c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        ld0Var.b(t13Var.f95047a.f91147a, 0, 4, false);
        t13Var.f95048b = 4;
        for (long jN = t13Var.f95047a.n(); jN != 440786851; jN = ((jN << 8) & (-256)) | ((long) (t13Var.f95047a.f91147a[0] & 255))) {
            int i11 = t13Var.f95048b + 1;
            t13Var.f95048b = i11;
            if (i11 == i10) {
                return false;
            }
            ld0Var.b(t13Var.f95047a.f91147a, 0, 1, false);
        }
        long jA = t13Var.a(ld0Var);
        long j12 = t13Var.f95048b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + jA >= j10) {
            return false;
        }
        while (true) {
            long j13 = t13Var.f95048b;
            long j14 = j12 + jA;
            if (j13 >= j14) {
                return j13 == j14;
            }
            if (t13Var.a(ld0Var) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = t13Var.a(ld0Var);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                int i12 = (int) jA2;
                ld0Var.a(false, i12);
                t13Var.f95048b += i12;
            }
        }
    }

    public final void b() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f97592a0 = false;
        this.f97602j.c(0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0a78  */
    /* JADX WARN: Type inference failed for: r2v0, types: [yads.pq0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r23) {
        /*
            Method dump skipped, instruction units count: 3300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zi1.b(int):void");
    }

    @Override // yads.mq0
    public final void release() {
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ((jd0) this.f97591a).a();
        wb3 wb3Var = this.f97593b;
        wb3Var.f96333b = 0;
        wb3Var.f96334c = 0;
        b();
        for (int i10 = 0; i10 < this.f97595c.size(); i10++) {
            z83 z83Var = ((yi1) this.f97595c.valueAt(i10)).T;
            if (z83Var != null) {
                z83Var.f97426b = false;
                z83Var.f97427c = 0;
            }
        }
    }
}
