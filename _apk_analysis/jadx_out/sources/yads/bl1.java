package yads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bl1 extends mk1 {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int[] f88041p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static boolean f88042q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static boolean f88043r1;
    public final Context G0;
    public final uh3 H0;
    public final cj3 I0;
    public final long J0;
    public final int K0;
    public final boolean L0;
    public zk1 M0;
    public boolean N0;
    public boolean O0;
    public Surface P0;
    public hd2 Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public long X0;
    public long Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f88044a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f88045b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f88046c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f88047d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f88048e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f88049f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f88050g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f88051h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f88052i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f88053j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public oj3 f88054k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f88055l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f88056m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public al1 f88057n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public nh3 f88058o1;

    public bl1(Context context, ee0 ee0Var, ok1 ok1Var, boolean z10, Handler handler, wn0 wn0Var) {
        super(2, ee0Var, ok1Var, z10, 30.0f);
        this.J0 = 5000L;
        this.K0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new uh3(applicationContext);
        this.I0 = new cj3(handler, wn0Var);
        this.L0 = B();
        this.X0 = -9223372036854775807L;
        this.f88050g1 = -1;
        this.f88051h1 = -1;
        this.f88053j1 = -1.0f;
        this.S0 = 1;
        this.f88056m1 = 0;
        A();
    }

    public static boolean B() {
        return pk2.f93625g.Z0().equals(ib3.f90739c);
    }

    public static boolean C() {
        int i10 = ib3.f90737a;
        if (i10 <= 28) {
            cl1 cl1Var = pk2.f93625g;
            String strR = cl1Var.r();
            String str = ib3.f90738b;
            if (strR.equals(str) || cl1Var.I().equals(str) || cl1Var.K().equals(str) || cl1Var.J().equals(str) || cl1Var.Q0().equals(str) || cl1Var.P0().equals(str) || cl1Var.d1().equals(str) || cl1Var.e1().equals(str)) {
                return true;
            }
        }
        if (i10 <= 27 && pk2.f93625g.w0().equals(ib3.f90738b)) {
            return true;
        }
        if (i10 > 26) {
            return false;
        }
        cl1 cl1Var2 = pk2.f93625g;
        String strA = cl1Var2.a();
        String str2 = ib3.f90738b;
        if (!strA.equals(str2) && !cl1Var2.b().equals(str2) && !cl1Var2.c().equals(str2) && !cl1Var2.d().equals(str2) && !cl1Var2.e().equals(str2) && !cl1Var2.f().equals(str2) && !cl1Var2.g().equals(str2) && !cl1Var2.h().equals(str2) && !cl1Var2.i().equals(str2) && !cl1Var2.j().equals(str2) && !cl1Var2.k().equals(str2) && !cl1Var2.l().equals(str2) && !cl1Var2.m().equals(str2) && !cl1Var2.s().equals(str2) && !cl1Var2.t().equals(str2) && !cl1Var2.u().equals(str2) && !cl1Var2.v().equals(str2) && !cl1Var2.w().equals(str2) && !cl1Var2.y().equals(str2) && !cl1Var2.z().equals(str2) && !cl1Var2.A().equals(str2) && !cl1Var2.B().equals(str2) && !cl1Var2.C().equals(str2) && !cl1Var2.D().equals(str2) && !cl1Var2.E().equals(str2) && !cl1Var2.F().equals(str2) && !cl1Var2.G().equals(str2) && !cl1Var2.H().equals(str2) && !cl1Var2.L().equals(str2) && !cl1Var2.M().equals(str2) && !cl1Var2.N().equals(str2) && !cl1Var2.O().equals(str2) && !cl1Var2.P().equals(str2) && !cl1Var2.Q().equals(str2) && !cl1Var2.R().equals(str2) && !cl1Var2.S().equals(str2) && !cl1Var2.T().equals(str2) && !cl1Var2.U().equals(str2) && !cl1Var2.V().equals(str2) && !cl1Var2.W().equals(str2) && !cl1Var2.X().equals(str2) && !cl1Var2.Y().equals(str2) && !cl1Var2.Z().equals(str2) && !cl1Var2.a0().equals(str2) && !cl1Var2.b0().equals(str2) && !cl1Var2.c0().equals(str2) && !cl1Var2.d0().equals(str2) && !cl1Var2.e0().equals(str2) && !cl1Var2.f0().equals(str2) && !cl1Var2.g0().equals(str2) && !cl1Var2.h0().equals(str2) && !cl1Var2.i0().equals(str2) && !cl1Var2.j0().equals(str2) && !cl1Var2.k0().equals(str2) && !cl1Var2.l0().equals(str2) && !cl1Var2.m0().equals(str2) && !cl1Var2.n0().equals(str2) && !cl1Var2.o0().equals(str2) && !cl1Var2.p0().equals(str2) && !cl1Var2.q0().equals(str2) && !cl1Var2.r0().equals(str2) && !cl1Var2.s0().equals(str2) && !cl1Var2.t0().equals(str2) && !cl1Var2.u0().equals(str2) && !cl1Var2.v0().equals(str2) && !cl1Var2.x0().equals(str2) && !cl1Var2.y0().equals(str2) && !cl1Var2.z0().equals(str2) && !cl1Var2.A0().equals(str2) && !cl1Var2.B0().equals(str2) && !cl1Var2.C0().equals(str2) && !cl1Var2.D0().equals(str2) && !cl1Var2.E0().equals(str2) && !cl1Var2.F0().equals(str2) && !cl1Var2.H0().equals(str2) && !cl1Var2.I0().equals(str2) && !cl1Var2.K0().equals(str2) && !cl1Var2.L0().equals(str2) && !cl1Var2.M0().equals(str2) && !cl1Var2.N0().equals(str2) && !cl1Var2.O0().equals(str2) && !cl1Var2.R0().equals(str2) && !cl1Var2.S0().equals(str2) && !cl1Var2.T0().equals(str2) && !cl1Var2.U0().equals(str2) && !cl1Var2.V0().equals(str2) && !cl1Var2.W0().equals(str2) && !cl1Var2.X0().equals(str2) && !cl1Var2.Y0().equals(str2) && !cl1Var2.a1().equals(str2) && !cl1Var2.b1().equals(str2) && !cl1Var2.f1().equals(str2) && !cl1Var2.g1().equals(str2) && !cl1Var2.h1().equals(str2) && !cl1Var2.i1().equals(str2) && !cl1Var2.j1().equals(str2) && !cl1Var2.k1().equals(str2) && !cl1Var2.l1().equals(str2) && !cl1Var2.m1().equals(str2) && !cl1Var2.n1().equals(str2) && !cl1Var2.o1().equals(str2) && !cl1Var2.p1().equals(str2) && !cl1Var2.q1().equals(str2) && !cl1Var2.r1().equals(str2) && !cl1Var2.s1().equals(str2) && !cl1Var2.t1().equals(str2) && !cl1Var2.u1().equals(str2) && !cl1Var2.v1().equals(str2) && !cl1Var2.w1().equals(str2) && !cl1Var2.x1().equals(str2) && !cl1Var2.y1().equals(str2) && !cl1Var2.z1().equals(str2) && !cl1Var2.A1().equals(str2) && !cl1Var2.B1().equals(str2) && !cl1Var2.C1().equals(str2) && !cl1Var2.D1().equals(str2) && !cl1Var2.E1().equals(str2) && !cl1Var2.G1().equals(str2) && !cl1Var2.H1().equals(str2) && !cl1Var2.I1().equals(str2) && !cl1Var2.F1().equals(str2) && !cl1Var2.J1().equals(str2) && !cl1Var2.K1().equals(str2) && !cl1Var2.L1().equals(str2) && !cl1Var2.M1().equals(str2) && !cl1Var2.N1().equals(str2) && !cl1Var2.O1().equals(str2) && !cl1Var2.P1().equals(str2) && !cl1Var2.Q1().equals(str2) && !cl1Var2.R1().equals(str2) && !cl1Var2.S1().equals(str2) && !cl1Var2.T1().equals(str2) && !cl1Var2.U1().equals(str2) && !cl1Var2.V1().equals(str2) && !cl1Var2.W1().equals(str2) && !cl1Var2.X1().equals(str2) && !cl1Var2.Y1().equals(str2) && !cl1Var2.Z1().equals(str2) && !cl1Var2.a2().equals(str2) && !cl1Var2.b2().equals(str2)) {
            String strN = cl1Var2.n();
            String str3 = ib3.f90740d;
            if (!strN.equals(str3) && !cl1Var2.o().equals(str3) && !cl1Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    public static int a(mx0 mx0Var, ik1 ik1Var) {
        int i10;
        int i11;
        int iIntValue;
        int i12 = mx0Var.f92615r;
        int i13 = mx0Var.f92616s;
        if (i12 == -1 || i13 == -1) {
            return -1;
        }
        String str = mx0Var.f92610m;
        if ("video/dolby-vision".equals(str)) {
            Pair pairB = wk1.b(mx0Var);
            str = (pairB == null || !((iIntValue = ((Integer) pairB.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        i10 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i11 = i13 * i12;
                i10 = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i11 = i13 * i12;
                break;
            case "video/avc":
                cl1 cl1Var = pk2.f93625g;
                String strX = cl1Var.x();
                String str2 = ib3.f90740d;
                if (!strX.equals(str2) && (!cl1Var.q().equals(ib3.f90739c) || (!cl1Var.J0().equals(str2) && (!cl1Var.p().equals(str2) || !ik1Var.f90866f)))) {
                    i11 = ((i13 + 15) / 16) * ((i12 + 15) / 16) * 256;
                    i10 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static p51 a(ok1 ok1Var, mx0 mx0Var, boolean z10, boolean z11) {
        String str = mx0Var.f92610m;
        if (str == null) {
            m51 m51Var = p51.f93439c;
            return sm2.f94878f;
        }
        List decoderInfos = ok1Var.getDecoderInfos(str, z10, z11);
        String strA = wk1.a(mx0Var);
        if (strA == null) {
            return p51.a((Collection) decoderInfos);
        }
        List decoderInfos2 = ok1Var.getDecoderInfos(strA, z10, z11);
        m51 m51Var2 = p51.f93439c;
        return new l51().a(decoderInfos).a(decoderInfos2).a();
    }

    public static int b(mx0 mx0Var, ik1 ik1Var) {
        if (mx0Var.f92611n == -1) {
            return a(mx0Var, ik1Var);
        }
        int size = mx0Var.f92612o.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) mx0Var.f92612o.get(i10)).length;
        }
        return mx0Var.f92611n + length;
    }

    public static boolean b(String str) {
        if (str.startsWith(pk2.f93625g.c1())) {
            return false;
        }
        synchronized (bl1.class) {
            if (!f88042q1) {
                f88043r1 = C();
                f88042q1 = true;
            }
        }
        return f88043r1;
    }

    public final void A() {
        this.f88054k1 = null;
    }

    public final void D() {
        int i10 = this.f88050g1;
        if (i10 == -1 && this.f88051h1 == -1) {
            return;
        }
        oj3 oj3Var = this.f88054k1;
        if (oj3Var != null && oj3Var.f93238b == i10 && oj3Var.f93239c == this.f88051h1 && oj3Var.f93240d == this.f88052i1 && oj3Var.f93241e == this.f88053j1) {
            return;
        }
        oj3 oj3Var2 = new oj3(this.f88050g1, this.f88051h1, this.f88052i1, this.f88053j1);
        this.f88054k1 = oj3Var2;
        this.I0.b(oj3Var2);
    }

    @Override // yads.mk1
    public final float a(float f10, mx0[] mx0VarArr) {
        float fMax = -1.0f;
        for (mx0 mx0Var : mx0VarArr) {
            float f11 = mx0Var.f92617t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // yads.mk1
    public final int a(ok1 ok1Var, mx0 mx0Var) {
        boolean z10;
        int i10 = 0;
        if (!"video".equals(ht1.c(mx0Var.f92610m))) {
            return ro.a(0, 0, 0);
        }
        boolean z11 = mx0Var.f92613p != null;
        p51 p51VarA = a(ok1Var, mx0Var, z11, false);
        if (z11 && p51VarA.isEmpty()) {
            p51VarA = a(ok1Var, mx0Var, false, false);
        }
        if (p51VarA.isEmpty()) {
            return ro.a(1, 0, 0);
        }
        int i11 = mx0Var.F;
        if (i11 != 0 && i11 != 2) {
            return ro.a(2, 0, 0);
        }
        ik1 ik1Var = (ik1) p51VarA.get(0);
        boolean zA = ik1Var.a(mx0Var);
        if (zA) {
            z10 = true;
        } else {
            for (int i12 = 1; i12 < p51VarA.size(); i12++) {
                ik1 ik1Var2 = (ik1) p51VarA.get(i12);
                if (ik1Var2.a(mx0Var)) {
                    z10 = false;
                    zA = true;
                    ik1Var = ik1Var2;
                    break;
                }
            }
            z10 = true;
        }
        int i13 = zA ? 4 : 3;
        int i14 = ik1Var.b(mx0Var) ? 16 : 8;
        int i15 = ik1Var.f90867g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (zA) {
            p51 p51VarA2 = a(ok1Var, mx0Var, z11, true);
            if (!p51VarA2.isEmpty()) {
                ik1 ik1Var3 = (ik1) wk1.a(p51VarA2, mx0Var).get(0);
                if (ik1Var3.a(mx0Var) && ik1Var3.b(mx0Var)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // yads.mk1
    public final ArrayList a(ok1 ok1Var, mx0 mx0Var, boolean z10) {
        return wk1.a(a(ok1Var, mx0Var, z10, this.f88055l1), mx0Var);
    }

    @Override // yads.mk1
    public final ak1 a(ik1 ik1Var, mx0 mx0Var, MediaCrypto mediaCrypto, float f10) {
        zk1 zk1Var;
        Point point;
        int i10;
        int[] iArr;
        boolean z10;
        int i11;
        int i12;
        int i13;
        Pair pairB;
        int iA;
        hd2 hd2Var = this.Q0;
        if (hd2Var != null && hd2Var.f90363b != ik1Var.f90866f) {
            if (this.P0 == hd2Var) {
                this.P0 = null;
            }
            hd2Var.release();
            this.Q0 = null;
        }
        String str = ik1Var.f90863c;
        mx0[] mx0VarArr = this.f94542i;
        mx0VarArr.getClass();
        int iMax = mx0Var.f92615r;
        int iMax2 = mx0Var.f92616s;
        int iB = b(mx0Var, ik1Var);
        if (mx0VarArr.length == 1) {
            if (iB != -1 && (iA = a(mx0Var, ik1Var)) != -1) {
                iB = Math.min((int) (iB * 1.5f), iA);
            }
            zk1Var = new zk1(iMax, iMax2, iB);
        } else {
            int length = mx0VarArr.length;
            boolean z11 = false;
            for (int i14 = 0; i14 < length; i14++) {
                mx0 mx0Var2 = mx0VarArr[i14];
                if (mx0Var.f92622y != null && mx0Var2.f92622y == null) {
                    lx0 lx0Var = new lx0(mx0Var2);
                    lx0Var.f92160w = mx0Var.f92622y;
                    mx0Var2 = new mx0(lx0Var);
                }
                if (ik1Var.a(mx0Var, mx0Var2).f96043d != 0) {
                    int i15 = mx0Var2.f92615r;
                    z11 |= i15 == -1 || mx0Var2.f92616s == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, mx0Var2.f92616s);
                    iB = Math.max(iB, b(mx0Var2, ik1Var));
                }
            }
            if (z11) {
                ih1.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                int i16 = mx0Var.f92616s;
                int i17 = mx0Var.f92615r;
                boolean z12 = i16 > i17;
                int i18 = z12 ? i16 : i17;
                if (z12) {
                    i16 = i17;
                }
                float f11 = i16 / i18;
                int[] iArr2 = f88041p1;
                int i19 = 0;
                for (int i20 = 9; i19 < i20; i20 = 9) {
                    int i21 = iArr2[i19];
                    int i22 = (int) (i21 * f11);
                    if (i21 <= i18 || i22 <= i16) {
                        break;
                    }
                    int i23 = i16;
                    float f12 = f11;
                    if (ib3.f90737a >= 21) {
                        int i24 = z12 ? i22 : i21;
                        if (!z12) {
                            i21 = i22;
                        }
                        point = ik1Var.a(i24, i21);
                        i10 = i18;
                        iArr = iArr2;
                        if (ik1Var.a(point.x, point.y, mx0Var.f92617t)) {
                            break;
                        }
                        i19++;
                        i16 = i23;
                        f11 = f12;
                        i18 = i10;
                        iArr2 = iArr;
                    } else {
                        i10 = i18;
                        iArr = iArr2;
                        try {
                            int i25 = ((i21 + 15) / 16) * 16;
                            int i26 = ((i22 + 15) / 16) * 16;
                            if (i25 * i26 <= wk1.a()) {
                                int i27 = z12 ? i26 : i25;
                                if (!z12) {
                                    i25 = i26;
                                }
                                point = new Point(i27, i25);
                            } else {
                                i19++;
                                i16 = i23;
                                f11 = f12;
                                i18 = i10;
                                iArr2 = iArr;
                            }
                        } catch (rk1 unused) {
                            point = null;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    lx0 lx0Var2 = new lx0(mx0Var);
                    lx0Var2.f92153p = iMax;
                    lx0Var2.f92154q = iMax2;
                    iB = Math.max(iB, a(new mx0(lx0Var2), ik1Var));
                    ih1.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                }
            }
            zk1Var = new zk1(iMax, iMax2, iB);
        }
        this.M0 = zk1Var;
        boolean z13 = this.L0;
        int i28 = this.f88055l1 ? this.f88056m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", mx0Var.f92615r);
        mediaFormat.setInteger("height", mx0Var.f92616s);
        List list = mx0Var.f92612o;
        for (int i29 = 0; i29 < list.size(); i29++) {
            mediaFormat.setByteBuffer(mg2.a("csd-", i29), ByteBuffer.wrap((byte[]) list.get(i29)));
        }
        float f13 = mx0Var.f92617t;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        ql1.a(mediaFormat, "rotation-degrees", mx0Var.f92618u);
        mx mxVar = mx0Var.f92622y;
        if (mxVar != null) {
            ql1.a(mediaFormat, "color-transfer", mxVar.f92596d);
            ql1.a(mediaFormat, "color-standard", mxVar.f92594b);
            ql1.a(mediaFormat, "color-range", mxVar.f92595c);
            byte[] bArr = mxVar.f92597e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(mx0Var.f92610m) && (pairB = wk1.b(mx0Var)) != null) {
            ql1.a(mediaFormat, Scopes.PROFILE, ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", zk1Var.f97645a);
        mediaFormat.setInteger("max-height", zk1Var.f97646b);
        ql1.a(mediaFormat, "max-input-size", zk1Var.f97647c);
        if (ib3.f90737a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z13) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            i11 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
            i11 = 0;
        }
        if (i28 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i28);
        }
        if (this.P0 == null) {
            if (!b(ik1Var)) {
                throw new IllegalStateException();
            }
            if (this.Q0 == null) {
                Context context = this.G0;
                boolean z14 = ik1Var.f90866f;
                int i30 = hd2.f90361e;
                if (z14) {
                    synchronized (hd2.class) {
                        if (hd2.f90362f) {
                            i12 = 1;
                        } else {
                            hd2.f90361e = sz0.a(context) ? sz0.c() ? 1 : 2 : i11;
                            i12 = 1;
                            hd2.f90362f = true;
                        }
                        i13 = hd2.f90361e != 0 ? i12 : i11;
                    }
                    if (i13 == 0) {
                        throw new IllegalStateException();
                    }
                }
                this.Q0 = new gd2().a(z14 ? hd2.f90361e : i11);
            }
            this.P0 = this.Q0;
        }
        return new ak1(ik1Var, mediaFormat, mx0Var, this.P0, mediaCrypto);
    }

    @Override // yads.mk1
    public final hk1 a(IllegalStateException illegalStateException, ik1 ik1Var) {
        return new yk1(illegalStateException, ik1Var, this.P0);
    }

    @Override // yads.mk1
    public final va0 a(ik1 ik1Var, mx0 mx0Var, mx0 mx0Var2) {
        va0 va0VarA = ik1Var.a(mx0Var, mx0Var2);
        int i10 = va0VarA.f96044e;
        int i11 = mx0Var2.f92615r;
        zk1 zk1Var = this.M0;
        if (i11 > zk1Var.f97645a || mx0Var2.f92616s > zk1Var.f97646b) {
            i10 |= 256;
        }
        if (b(mx0Var2, ik1Var) > this.M0.f97647c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new va0(ik1Var.f90861a, mx0Var, mx0Var2, i12 != 0 ? 0 : va0VarA.f96043d, i12);
    }

    @Override // yads.mk1
    public final va0 a(nx0 nx0Var) {
        va0 va0VarA = super.a(nx0Var);
        this.I0.a(nx0Var.f93035b, va0VarA);
        return va0VarA;
    }

    @Override // yads.mk1, yads.ro
    public final void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
        uh3 uh3Var = this.H0;
        uh3Var.f95658i = f10;
        uh3Var.f95662m = 0L;
        uh3Var.f95665p = -1L;
        uh3Var.f95663n = -1L;
        uh3Var.a(false);
    }

    @Override // yads.mk1
    public final void a(long j10) {
        super.a(j10);
        if (this.f88055l1) {
            return;
        }
        this.f88045b1--;
    }

    @Override // yads.mk1, yads.ro
    public final void a(long j10, boolean z10) {
        super.a(j10, z10);
        z();
        uh3 uh3Var = this.H0;
        uh3Var.f95662m = 0L;
        uh3Var.f95665p = -1L;
        uh3Var.f95663n = -1L;
        this.f88046c1 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.f88044a1 = 0;
        if (z10) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        } else {
            this.X0 = -9223372036854775807L;
        }
    }

    @Override // yads.mk1
    public final void a(Exception exc) {
        ih1.b("MediaCodecVideoRenderer", ih1.a("Video codec error", exc));
        this.I0.b(exc);
    }

    @Override // yads.mk1
    public final void a(String str) {
        this.I0.a(str);
    }

    @Override // yads.mk1
    public final void a(String str, long j10, long j11) {
        this.I0.a(str, j10, j11);
        this.N0 = b(str);
        ik1 ik1Var = this.R;
        ik1Var.getClass();
        this.O0 = ik1Var.a();
        if (ib3.f90737a < 23 || !this.f88055l1) {
            return;
        }
        dk1 dk1Var = this.K;
        dk1Var.getClass();
        this.f88057n1 = new al1(this, dk1Var);
    }

    @Override // yads.mk1
    public final void a(mx0 mx0Var, MediaFormat mediaFormat) {
        dk1 dk1Var = this.K;
        if (dk1Var != null) {
            dk1Var.setVideoScalingMode(this.S0);
        }
        if (this.f88055l1) {
            this.f88050g1 = mx0Var.f92615r;
            this.f88051h1 = mx0Var.f92616s;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f88050g1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f88051h1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = mx0Var.f92619v;
        this.f88053j1 = f10;
        if (ib3.f90737a >= 21) {
            int i10 = mx0Var.f92618u;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f88050g1;
                this.f88050g1 = this.f88051h1;
                this.f88051h1 = i11;
                this.f88053j1 = 1.0f / f10;
            }
        } else {
            this.f88052i1 = mx0Var.f92618u;
        }
        uh3 uh3Var = this.H0;
        uh3Var.f95655f = mx0Var.f92617t;
        kv0 kv0Var = uh3Var.f95650a;
        jv0 jv0Var = kv0Var.f91756a;
        jv0Var.f91382d = 0L;
        jv0Var.f91383e = 0L;
        jv0Var.f91384f = 0L;
        jv0Var.f91386h = 0;
        Arrays.fill(jv0Var.f91385g, false);
        jv0 jv0Var2 = kv0Var.f91757b;
        jv0Var2.f91382d = 0L;
        jv0Var2.f91383e = 0L;
        jv0Var2.f91384f = 0L;
        jv0Var2.f91386h = 0;
        Arrays.fill(jv0Var2.f91385g, false);
        kv0Var.f91758c = false;
        kv0Var.f91759d = -9223372036854775807L;
        kv0Var.f91760e = 0;
        uh3Var.b();
    }

    @Override // yads.mk1
    public final void a(sa0 sa0Var) {
        if (this.O0) {
            ByteBuffer byteBuffer = sa0Var.f94752g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    dk1 dk1Var = this.K;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    dk1Var.a(bundle);
                }
            }
        }
    }

    @Override // yads.ro
    public final void a(boolean z10) {
        this.B0 = new pa0();
        mn2 mn2Var = this.f94537d;
        mn2Var.getClass();
        boolean z11 = mn2Var.f92468a;
        if (z11 && this.f88056m1 == 0) {
            throw new IllegalStateException();
        }
        if (this.f88055l1 != z11) {
            this.f88055l1 = z11;
            u();
        }
        this.I0.b(this.B0);
        this.U0 = z10;
        this.V0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    @Override // yads.mk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r31, long r33, yads.dk1 r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, yads.mx0 r44) {
        /*
            Method dump skipped, instruction units count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bl1.a(long, long, yads.dk1, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, yads.mx0):boolean");
    }

    @Override // yads.mk1
    public final boolean a(ik1 ik1Var) {
        return this.P0 != null || b(ik1Var);
    }

    @Override // yads.mk1
    public final void b(sa0 sa0Var) {
        boolean z10 = this.f88055l1;
        if (!z10) {
            this.f88045b1++;
        }
        if (ib3.f90737a >= 23 || !z10) {
            return;
        }
        long j10 = sa0Var.f94751f;
        b(j10);
        D();
        this.B0.f93504e++;
        this.V0 = true;
        if (!this.T0) {
            this.T0 = true;
            this.I0.a(this.P0);
            this.R0 = true;
        }
        a(j10);
    }

    public final boolean b(ik1 ik1Var) {
        boolean z10;
        if (ib3.f90737a < 23 || this.f88055l1 || b(ik1Var.f90861a)) {
            return false;
        }
        if (ik1Var.f90866f) {
            Context context = this.G0;
            synchronized (hd2.class) {
                if (!hd2.f90362f) {
                    hd2.f90361e = sz0.a(context) ? sz0.c() ? 1 : 2 : 0;
                    hd2.f90362f = true;
                }
                z10 = hd2.f90361e != 0;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void c(long j10) {
        pa0 pa0Var = this.B0;
        pa0Var.f93510k += j10;
        pa0Var.f93511l++;
        this.f88048e1 += j10;
        this.f88049f1++;
    }

    @Override // yads.ro
    public final String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // yads.mk1, yads.ro
    public final boolean g() {
        hd2 hd2Var;
        if (super.g() && (this.T0 || (((hd2Var = this.Q0) != null && this.P0 == hd2Var) || this.K == null || this.f88055l1))) {
            this.X0 = -9223372036854775807L;
            return true;
        }
        if (this.X0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.X0) {
            return true;
        }
        this.X0 = -9223372036854775807L;
        return false;
    }

    @Override // yads.ro
    public final void h() {
        this.f88054k1 = null;
        z();
        this.R0 = false;
        this.f88057n1 = null;
        try {
            this.B = null;
            this.C0 = -9223372036854775807L;
            this.D0 = -9223372036854775807L;
            this.E0 = 0;
            p();
        } finally {
            this.I0.a(this.B0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.ro, yads.af2
    public final void handleMessage(int i10, Object obj) {
        boolean z10;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f88058o1 = (nh3) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f88056m1 != iIntValue) {
                    this.f88056m1 = iIntValue;
                    if (this.f88055l1) {
                        u();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.S0 = iIntValue2;
                dk1 dk1Var = this.K;
                if (dk1Var != null) {
                    dk1Var.setVideoScalingMode(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 != 5) {
                return;
            }
            uh3 uh3Var = this.H0;
            int iIntValue3 = ((Integer) obj).intValue();
            if (uh3Var.f95659j == iIntValue3) {
                return;
            }
            uh3Var.f95659j = iIntValue3;
            uh3Var.a(true);
            return;
        }
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = surface;
        if (surface == null) {
            hd2 hd2Var = this.Q0;
            if (hd2Var != null) {
                surface2 = hd2Var;
            } else {
                ik1 ik1Var = this.R;
                surface2 = surface;
                if (ik1Var != null) {
                    surface2 = surface;
                    if (b(ik1Var)) {
                        Context context = this.G0;
                        boolean z11 = ik1Var.f90866f;
                        int i11 = hd2.f90361e;
                        if (z11) {
                            synchronized (hd2.class) {
                                if (!hd2.f90362f) {
                                    hd2.f90361e = sz0.a(context) ? sz0.c() ? 1 : 2 : 0;
                                    hd2.f90362f = true;
                                }
                                z10 = hd2.f90361e != 0;
                            }
                            if (!z10) {
                                throw new IllegalStateException();
                            }
                        }
                        hd2 hd2VarA = new gd2().a(z11 ? hd2.f90361e : 0);
                        this.Q0 = hd2VarA;
                        surface2 = hd2VarA;
                    }
                }
            }
        }
        if (this.P0 == surface2) {
            if (surface2 == null || surface2 == this.Q0) {
                return;
            }
            oj3 oj3Var = this.f88054k1;
            if (oj3Var != null) {
                this.I0.b(oj3Var);
            }
            if (this.R0) {
                this.I0.a(this.P0);
                return;
            }
            return;
        }
        this.P0 = surface2;
        uh3 uh3Var2 = this.H0;
        uh3Var2.getClass();
        Surface surface3 = surface2 instanceof hd2 ? null : surface2;
        Surface surface4 = uh3Var2.f95654e;
        if (surface4 != surface3) {
            if (ib3.f90737a >= 30 && surface4 != null && uh3Var2.f95659j != Integer.MIN_VALUE && uh3Var2.f95657h != 0.0f) {
                uh3Var2.f95657h = 0.0f;
                oh3.a(surface4, 0.0f);
            }
            uh3Var2.f95654e = surface3;
            uh3Var2.a(true);
        }
        this.R0 = false;
        int i12 = this.f94540g;
        dk1 dk1Var2 = this.K;
        if (dk1Var2 != null) {
            if (ib3.f90737a < 23 || surface2 == null || this.N0) {
                u();
                r();
            } else {
                dk1Var2.a(surface2);
            }
        }
        if (surface2 == null || surface2 == this.Q0) {
            this.f88054k1 = null;
            z();
            return;
        }
        oj3 oj3Var2 = this.f88054k1;
        if (oj3Var2 != null) {
            this.I0.b(oj3Var2);
        }
        z();
        if (i12 == 2) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.ro
    public final void i() {
        try {
            try {
                this.f92392m0 = false;
                this.f92407u.b();
                this.f92405t.b();
                this.f92391l0 = false;
                this.f92390k0 = false;
                u();
            } finally {
                mk0.a(this.E, null);
                this.E = null;
            }
        } finally {
            hd2 hd2Var = this.Q0;
            if (hd2Var != null) {
                if (this.P0 == hd2Var) {
                    this.P0 = null;
                }
                hd2Var.release();
                this.Q0 = null;
            }
        }
    }

    @Override // yads.ro
    public final void j() {
        this.Z0 = 0;
        this.Y0 = SystemClock.elapsedRealtime();
        this.f88047d1 = SystemClock.elapsedRealtime() * 1000;
        this.f88048e1 = 0L;
        this.f88049f1 = 0;
        this.H0.a();
    }

    @Override // yads.ro
    public final void k() {
        Surface surface;
        this.X0 = -9223372036854775807L;
        if (this.Z0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.a(this.Z0, jElapsedRealtime - this.Y0);
            this.Z0 = 0;
            this.Y0 = jElapsedRealtime;
        }
        int i10 = this.f88049f1;
        if (i10 != 0) {
            this.I0.c(i10, this.f88048e1);
            this.f88048e1 = 0L;
            this.f88049f1 = 0;
        }
        uh3 uh3Var = this.H0;
        uh3Var.f95653d = false;
        qh3 qh3Var = uh3Var.f95651b;
        if (qh3Var != null) {
            qh3Var.a();
            th3 th3Var = uh3Var.f95652c;
            th3Var.getClass();
            th3Var.f95236c.sendEmptyMessage(2);
        }
        if (ib3.f90737a < 30 || (surface = uh3Var.f95654e) == null || uh3Var.f95659j == Integer.MIN_VALUE || uh3Var.f95657h == 0.0f) {
            return;
        }
        uh3Var.f95657h = 0.0f;
        oh3.a(surface, 0.0f);
    }

    @Override // yads.mk1
    public final boolean q() {
        return this.f88055l1 && ib3.f90737a < 23;
    }

    @Override // yads.mk1
    public final void s() {
        z();
    }

    @Override // yads.mk1
    public final void w() {
        super.w();
        this.f88045b1 = 0;
    }

    public final void z() {
        dk1 dk1Var;
        this.T0 = false;
        if (ib3.f90737a < 23 || !this.f88055l1 || (dk1Var = this.K) == null) {
            return;
        }
        this.f88057n1 = new al1(this, dk1Var);
    }
}
