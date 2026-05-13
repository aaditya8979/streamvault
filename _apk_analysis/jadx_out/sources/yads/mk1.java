package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mk1 extends ro {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public pn0 A0;
    public mx0 B;
    public pa0 B0;
    public mx0 C;
    public long C0;
    public mk0 D;
    public long D0;
    public mk0 E;
    public int E0;
    public MediaCrypto F;
    public boolean G;
    public final long H;
    public float I;
    public float J;
    public dk1 K;
    public mx0 L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public lk1 Q;
    public ik1 R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f92380a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f92381b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f92382c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ir f92383d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f92384e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f92385f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f92386g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ByteBuffer f92387h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f92388i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f92389j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f92390k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f92391l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f92392m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bk1 f92393n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f92394n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ok1 f92395o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f92396o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f92397p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92398p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f92399q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f92400q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sa0 f92401r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f92402r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sa0 f92403s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f92404s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sa0 f92405t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f92406t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final yo f92407u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f92408u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n63 f92409v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f92410v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f92411w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f92412w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MediaCodec.BufferInfo f92413x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f92414x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long[] f92415y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f92416y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long[] f92417z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f92418z0;

    public mk1(int i10, ee0 ee0Var, ok1 ok1Var, boolean z10, float f10) {
        super(i10);
        this.f92393n = ee0Var;
        this.f92395o = (ok1) ni.a(ok1Var);
        this.f92397p = z10;
        this.f92399q = f10;
        this.f92401r = sa0.d();
        this.f92403s = new sa0(0);
        this.f92405t = new sa0(2);
        yo yoVar = new yo();
        this.f92407u = yoVar;
        this.f92409v = new n63();
        this.f92411w = new ArrayList();
        this.f92413x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f92415y = new long[10];
        this.f92417z = new long[10];
        this.A = new long[10];
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        yoVar.c(0);
        yoVar.f94749d.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f92396o0 = 0;
        this.f92385f0 = -1;
        this.f92386g0 = -1;
        this.f92384e0 = -9223372036854775807L;
        this.f92408u0 = -9223372036854775807L;
        this.f92410v0 = -9223372036854775807L;
        this.f92398p0 = 0;
        this.f92400q0 = 0;
    }

    public abstract float a(float f10, mx0[] mx0VarArr);

    @Override // yads.ro
    public final int a(mx0 mx0Var) throws pn0 {
        try {
            return a(this.f92395o, mx0Var);
        } catch (rk1 e10) {
            throw a(4002, mx0Var, (Exception) e10, false);
        }
    }

    public abstract int a(ok1 ok1Var, mx0 mx0Var);

    public abstract ArrayList a(ok1 ok1Var, mx0 mx0Var, boolean z10);

    public abstract ak1 a(ik1 ik1Var, mx0 mx0Var, MediaCrypto mediaCrypto, float f10);

    public hk1 a(IllegalStateException illegalStateException, ik1 ik1Var) {
        return new hk1(illegalStateException, ik1Var);
    }

    public final ux0 a(mk0 mk0Var) throws pn0 {
        k20 k20VarD = mk0Var.d();
        if (k20VarD == null || (k20VarD instanceof ux0)) {
            return (ux0) k20VarD;
        }
        throw a(6001, this.B, (Exception) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + k20VarD), false);
    }

    public abstract va0 a(ik1 ik1Var, mx0 mx0Var, mx0 mx0Var2);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r12 != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yads.va0 a(yads.nx0 r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mk1.a(yads.nx0):yads.va0");
    }

    @Override // yads.ro
    public void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
    }

    public void a(long j10) {
        while (true) {
            int i10 = this.E0;
            if (i10 == 0 || j10 < this.A[0]) {
                return;
            }
            long[] jArr = this.f92415y;
            this.C0 = jArr[0];
            this.D0 = this.f92417z[0];
            int i11 = i10 - 1;
            this.E0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f92417z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            s();
        }
    }

    @Override // yads.ro
    public final void a(long j10, long j11) throws pn0 {
        boolean z10 = false;
        if (this.f92418z0) {
            this.f92418z0 = false;
            t();
        }
        pn0 pn0Var = this.A0;
        if (pn0Var != null) {
            this.A0 = null;
            throw pn0Var;
        }
        try {
            if (this.f92414x0) {
                v();
                return;
            }
            if (this.B != null || c(2)) {
                r();
                if (this.f92390k0) {
                    d73.a("bypassRender");
                    while (b(j10, j11)) {
                    }
                    d73.a();
                } else if (this.K != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    d73.a("drainAndFeed");
                    while (c(j10, j11) && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                    }
                    while (n() && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                    }
                    d73.a();
                } else {
                    pa0 pa0Var = this.B0;
                    int i10 = pa0Var.f93503d;
                    ns2 ns2Var = this.f94541h;
                    ns2Var.getClass();
                    pa0Var.f93503d = i10 + ns2Var.a(j10 - this.f94543j);
                    c(1);
                }
                synchronized (this.B0) {
                }
            }
        } catch (IllegalStateException e10) {
            int i11 = ib3.f90737a;
            if (i11 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            a(e10);
            if (i11 >= 21 && (e10 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e10).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                u();
            }
            throw a(4003, this.B, a(e10, this.R), z10);
        }
    }

    @Override // yads.ro
    public void a(long j10, boolean z10) {
        int i10;
        this.f92412w0 = false;
        this.f92414x0 = false;
        this.f92418z0 = false;
        if (this.f92390k0) {
            this.f92407u.b();
            this.f92405t.b();
            this.f92391l0 = false;
        } else if (p()) {
            r();
        }
        n63 n63Var = this.f92409v;
        synchronized (n63Var) {
            i10 = n63Var.f92759d;
        }
        if (i10 > 0) {
            this.f92416y0 = true;
        }
        this.f92409v.a();
        int i11 = this.E0;
        if (i11 != 0) {
            int i12 = i11 - 1;
            this.D0 = this.f92417z[i12];
            this.C0 = this.f92415y[i12];
            this.E0 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.media.MediaCrypto r12, boolean r13) throws yads.lk1 {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mk1.a(android.media.MediaCrypto, boolean):void");
    }

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j10, long j11);

    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.ik1 r18, android.media.MediaCrypto r19) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mk1.a(yads.ik1, android.media.MediaCrypto):void");
    }

    public abstract void a(mx0 mx0Var, MediaFormat mediaFormat);

    public void a(sa0 sa0Var) {
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        if (this.D0 == -9223372036854775807L) {
            if (this.C0 != -9223372036854775807L) {
                throw new IllegalStateException();
            }
            this.C0 = j10;
            this.D0 = j11;
            return;
        }
        int i10 = this.E0;
        if (i10 == this.f92417z.length) {
            ih1.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f92417z[this.E0 - 1]);
        } else {
            this.E0 = i10 + 1;
        }
        long[] jArr = this.f92415y;
        int i11 = this.E0 - 1;
        jArr[i11] = j10;
        this.f92417z[i11] = j11;
        this.A[i11] = this.f92408u0;
    }

    public abstract boolean a(long j10, long j11, dk1 dk1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, mx0 mx0Var);

    public boolean a(ik1 ik1Var) {
        return true;
    }

    public final List b(boolean z10) {
        ArrayList arrayListA = a(this.f92395o, this.B, z10);
        if (arrayListA.isEmpty() && z10) {
            arrayListA = a(this.f92395o, this.B, false);
            if (!arrayListA.isEmpty()) {
                ih1.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f92610m + ", but no secure decoder available. Trying to proceed with " + arrayListA + ".");
            }
        }
        return arrayListA;
    }

    public final void b(long j10) {
        Object objA;
        n63 n63Var = this.f92409v;
        synchronized (n63Var) {
            objA = n63Var.a(j10, true);
        }
        mx0 mx0Var = (mx0) objA;
        if (mx0Var == null && this.N) {
            mx0Var = (mx0) this.f92409v.c();
        }
        if (mx0Var != null) {
            this.C = mx0Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    public abstract void b(sa0 sa0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public final boolean b(long j10, long j11) {
        boolean z10;
        if (!(!this.f92414x0)) {
            throw new IllegalStateException();
        }
        yo yoVar = this.f92407u;
        int i10 = yoVar.f97258k;
        if (i10 <= 0) {
            z10 = 0;
        } else {
            if (!a(j10, j11, null, yoVar.f94749d, this.f92386g0, 0, i10, yoVar.f94751f, yoVar.b(Integer.MIN_VALUE), this.f92407u.b(4), this.C)) {
                return false;
            }
            a(this.f92407u.f97257j);
            this.f92407u.b();
            z10 = 0;
        }
        if (this.f92412w0) {
            this.f92414x0 = true;
            return z10;
        }
        if (this.f92391l0) {
            if (!this.f92407u.a(this.f92405t)) {
                throw new IllegalStateException();
            }
            this.f92391l0 = z10;
        }
        if (this.f92392m0) {
            yo yoVar2 = this.f92407u;
            if (yoVar2.f97258k > 0) {
                return true;
            }
            this.f92392m0 = z10;
            yoVar2.b();
            this.f92405t.b();
            this.f92391l0 = z10;
            this.f92390k0 = z10;
            this.f92392m0 = z10;
            r();
            if (!this.f92390k0) {
                return z10;
            }
        }
        if (!(!this.f92412w0)) {
            throw new IllegalStateException();
        }
        nx0 nx0Var = this.f94536c;
        nx0Var.f93034a = null;
        nx0Var.f93035b = null;
        this.f92405t.b();
        while (true) {
            this.f92405t.b();
            int iA = a(nx0Var, this.f92405t, (int) z10);
            if (iA == -5) {
                a(nx0Var);
                break;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.f92405t.b(4)) {
                    this.f92412w0 = true;
                    break;
                }
                if (this.f92416y0) {
                    mx0 mx0Var = this.B;
                    mx0Var.getClass();
                    this.C = mx0Var;
                    a(mx0Var, (MediaFormat) null);
                    this.f92416y0 = z10;
                }
                this.f92405t.c();
                if (!this.f92407u.a(this.f92405t)) {
                    this.f92391l0 = true;
                    break;
                }
            }
        }
        yo yoVar3 = this.f92407u;
        if (yoVar3.f97258k > 0) {
            yoVar3.c();
        }
        if (this.f92407u.f97258k > 0 || this.f92412w0 || this.f92392m0) {
            return true;
        }
        return z10;
    }

    public boolean b(mx0 mx0Var) {
        return false;
    }

    public final boolean c(int i10) throws pn0 {
        nx0 nx0Var = this.f94536c;
        nx0Var.f93034a = null;
        nx0Var.f93035b = null;
        this.f92401r.b();
        int iA = a(nx0Var, this.f92401r, i10 | 4);
        if (iA == -5) {
            a(nx0Var);
            return true;
        }
        if (iA != -4 || !this.f92401r.b(4)) {
            return false;
        }
        this.f92412w0 = true;
        t();
        return false;
    }

    public final boolean c(long j10, long j11) throws pn0 {
        boolean z10;
        boolean z11;
        boolean zA;
        int iA;
        boolean z12;
        if (this.f92386g0 < 0) {
            if (this.X && this.f92404s0) {
                try {
                    iA = this.K.a(this.f92413x);
                } catch (IllegalStateException unused) {
                    t();
                    if (this.f92414x0) {
                        u();
                    }
                    return false;
                }
            } else {
                iA = this.K.a(this.f92413x);
            }
            if (iA < 0) {
                if (iA != -2) {
                    if (this.f92382c0 && (this.f92412w0 || this.f92398p0 == 2)) {
                        t();
                    }
                    return false;
                }
                this.f92406t0 = true;
                MediaFormat mediaFormatA = this.K.a();
                if (this.S != 0 && mediaFormatA.getInteger("width") == 32 && mediaFormatA.getInteger("height") == 32) {
                    this.f92381b0 = true;
                } else {
                    if (this.Z) {
                        mediaFormatA.setInteger("channel-count", 1);
                    }
                    this.M = mediaFormatA;
                    this.N = true;
                }
                return true;
            }
            if (this.f92381b0) {
                this.f92381b0 = false;
                this.K.a(false, iA);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f92413x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                t();
                return false;
            }
            this.f92386g0 = iA;
            ByteBuffer byteBufferB = this.K.b(iA);
            this.f92387h0 = byteBufferB;
            if (byteBufferB != null) {
                byteBufferB.position(this.f92413x.offset);
                ByteBuffer byteBuffer = this.f92387h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f92413x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f92413x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f92408u0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            long j13 = this.f92413x.presentationTimeUs;
            int size = this.f92411w.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z12 = false;
                    break;
                }
                if (((Long) this.f92411w.get(i10)).longValue() == j13) {
                    this.f92411w.remove(i10);
                    z12 = true;
                    break;
                }
                i10++;
            }
            this.f92388i0 = z12;
            long j14 = this.f92410v0;
            long j15 = this.f92413x.presentationTimeUs;
            this.f92389j0 = j14 == j15;
            b(j15);
        }
        if (this.X && this.f92404s0) {
            try {
                dk1 dk1Var = this.K;
                ByteBuffer byteBuffer2 = this.f92387h0;
                int i11 = this.f92386g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f92413x;
                z10 = false;
                z11 = true;
                try {
                    zA = a(j10, j11, dk1Var, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f92388i0, this.f92389j0, this.C);
                } catch (IllegalStateException unused2) {
                    t();
                    if (this.f92414x0) {
                        u();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = true;
            dk1 dk1Var2 = this.K;
            ByteBuffer byteBuffer3 = this.f92387h0;
            int i12 = this.f92386g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f92413x;
            zA = a(j10, j11, dk1Var2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f92388i0, this.f92389j0, this.C);
        }
        if (zA) {
            a(this.f92413x.presentationTimeUs);
            boolean z13 = (this.f92413x.flags & 4) != 0 ? z11 : z10;
            this.f92386g0 = -1;
            this.f92387h0 = null;
            if (!z13) {
                return z11;
            }
            t();
        }
        return z10;
    }

    public final boolean c(mx0 mx0Var) {
        if (ib3.f90737a >= 23 && this.K != null && this.f92400q0 != 3 && this.f94540g != 0) {
            float f10 = this.J;
            mx0[] mx0VarArr = this.f94542i;
            mx0VarArr.getClass();
            float fA = a(f10, mx0VarArr);
            float f11 = this.O;
            if (f11 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                if (this.f92402r0) {
                    this.f92398p0 = 1;
                    this.f92400q0 = 3;
                    return false;
                }
                u();
                r();
                return false;
            }
            if (f11 == -1.0f && fA <= this.f92399q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.K.a(bundle);
            this.O = fA;
        }
        return true;
    }

    @Override // yads.ro
    public boolean f() {
        return this.f92414x0;
    }

    @Override // yads.ro
    public boolean g() {
        boolean zIsReady;
        if (this.B != null) {
            if (e()) {
                zIsReady = this.f94545l;
            } else {
                ns2 ns2Var = this.f94541h;
                ns2Var.getClass();
                zIsReady = ns2Var.isReady();
            }
            if (zIsReady || this.f92386g0 >= 0 || (this.f92384e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f92384e0)) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.ro
    public final int l() {
        return 8;
    }

    public final boolean m() throws pn0 {
        if (this.f92402r0) {
            this.f92398p0 = 1;
            if (this.U || this.W) {
                this.f92400q0 = 3;
                return false;
            }
            this.f92400q0 = 2;
        } else {
            y();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() throws yads.pn0 {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mk1.n():boolean");
    }

    public final void o() {
        try {
            this.K.flush();
        } finally {
            w();
        }
    }

    public final boolean p() {
        if (this.K == null) {
            return false;
        }
        int i10 = this.f92400q0;
        if (i10 == 3 || this.U || ((this.V && !this.f92406t0) || (this.W && this.f92404s0))) {
            u();
            return true;
        }
        if (i10 == 2) {
            int i11 = ib3.f90737a;
            if (i11 < 23) {
                throw new IllegalStateException();
            }
            if (i11 >= 23) {
                try {
                    y();
                } catch (pn0 e10) {
                    ih1.d("MediaCodecRenderer", ih1.a("Failed to update the DRM session, releasing the codec instead.", e10));
                    u();
                    return true;
                }
            }
        }
        o();
        return false;
    }

    public boolean q() {
        return false;
    }

    public final void r() {
        mx0 mx0Var;
        if (this.K != null || this.f92390k0 || (mx0Var = this.B) == null) {
            return;
        }
        if (this.E == null && b(mx0Var)) {
            mx0 mx0Var2 = this.B;
            this.f92392m0 = false;
            this.f92407u.b();
            this.f92405t.b();
            this.f92391l0 = false;
            this.f92390k0 = false;
            String str = mx0Var2.f92610m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f92407u.f97259l = 32;
            } else {
                this.f92407u.f97259l = 1;
            }
            this.f92390k0 = true;
            return;
        }
        mk0 mk0Var = this.E;
        mk0.a(this.D, mk0Var);
        this.D = mk0Var;
        String str2 = this.B.f92610m;
        if (mk0Var != null) {
            if (this.F == null) {
                ux0 ux0VarA = a(mk0Var);
                if (ux0VarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(ux0VarA.f95863a, ux0VarA.f95864b);
                        this.F = mediaCrypto;
                        this.G = !ux0VarA.f95865c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e10) {
                        throw a(6006, this.B, e10, false);
                    }
                } else if (this.D.c() == null) {
                    return;
                }
            }
            if (ux0.f95862d) {
                int state = this.D.getState();
                if (state == 1) {
                    lk0 lk0VarC = this.D.c();
                    lk0VarC.getClass();
                    throw a(lk0VarC.f92009b, this.B, (Exception) lk0VarC, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (lk1 e11) {
            throw a(4001, this.B, e11, false);
        }
    }

    public abstract void s();

    public final void t() throws pn0 {
        int i10 = this.f92400q0;
        if (i10 == 1) {
            o();
            return;
        }
        if (i10 == 2) {
            o();
            y();
        } else if (i10 != 3) {
            this.f92414x0 = true;
            v();
        } else {
            u();
            r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        try {
            dk1 dk1Var = this.K;
            if (dk1Var != null) {
                dk1Var.release();
                this.B0.f93501b++;
                a(this.R.f90861a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void v() {
    }

    public void w() {
        this.f92385f0 = -1;
        this.f92403s.f94749d = null;
        this.f92386g0 = -1;
        this.f92387h0 = null;
        this.f92384e0 = -9223372036854775807L;
        this.f92404s0 = false;
        this.f92402r0 = false;
        this.f92380a0 = false;
        this.f92381b0 = false;
        this.f92388i0 = false;
        this.f92389j0 = false;
        this.f92411w.clear();
        this.f92408u0 = -9223372036854775807L;
        this.f92410v0 = -9223372036854775807L;
        ir irVar = this.f92383d0;
        if (irVar != null) {
            irVar.f90954a = 0L;
            irVar.f90955b = 0L;
            irVar.f90956c = false;
        }
        this.f92398p0 = 0;
        this.f92400q0 = 0;
        this.f92396o0 = this.f92394n0 ? 1 : 0;
    }

    public final void x() {
        w();
        this.A0 = null;
        this.f92383d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f92406t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f92382c0 = false;
        this.f92394n0 = false;
        this.f92396o0 = 0;
        this.G = false;
    }

    public final void y() throws pn0 {
        try {
            this.F.setMediaDrmSession(a(this.E).f95864b);
            mk0 mk0Var = this.E;
            mk0.a(this.D, mk0Var);
            this.D = mk0Var;
            this.f92398p0 = 0;
            this.f92400q0 = 0;
        } catch (MediaCryptoException e10) {
            throw a(6006, this.B, (Exception) e10, false);
        }
    }
}
