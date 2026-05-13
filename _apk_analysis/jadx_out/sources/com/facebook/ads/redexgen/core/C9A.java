package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9A implements InterfaceC3054mM, GY, InterfaceC1768Eg<C3052mK>, InterfaceC1772Ek, InterfaceC1723Cn {
    public static byte[] A0e;
    public static String[] A0f = {"o2fAJH6DTExx5HfWJCXs", "", "TsjJo55j6Kq128TfeQrvBtnORCvXohBg", "QpymssT", "p1Azi7mByqrjPk9ZTQVOCdIp8WANOiZ", "P8K3es9juVbjT7QsA9zjw4fZ7CWDxkC3", "f2TCNbDOQ", "8xae32DDfRwM"};
    public static final C3206or A0g;
    public static final Map<String, String> A0h;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC3055mN A06;
    public C1718Ci A07;
    public InterfaceC1836Gw A08;
    public IcyHeaders A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public C1717Ch[] A0K;
    public C3046mE[] A0L;
    public final long A0M;
    public final Uri A0N;
    public final Handler A0O;
    public final C3W A0P;
    public final InterfaceC3141nl A0Q;
    public final C9P A0R;
    public final C9U A0S;
    public final CW A0T;
    public final InterfaceC1711Cb A0U;
    public final InterfaceC1716Cg A0V;
    public final EO A0W;
    public final InterfaceC1765Ed A0X;
    public final C3009lc A0Y;
    public final Runnable A0Z;
    public final Runnable A0a;
    public final String A0b;
    public final boolean A0c;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"})
    public final boolean A0d;

    static {
        A0I();
        A0h = A0D();
        A0g = new C2D().A0y(A0B(161, 3, 77)).A11(A0B(144, 17, 79)).A14();
    }

    public C9A(Uri uri, InterfaceC3141nl interfaceC3141nl, InterfaceC1711Cb interfaceC1711Cb, C9U c9u, C9P c9p, InterfaceC1765Ed interfaceC1765Ed, CW cw, InterfaceC1716Cg interfaceC1716Cg, EO eo2, String str, int i10, InterfaceExecutorC1787Ez interfaceExecutorC1787Ez) {
        this.A0N = uri;
        this.A0Q = interfaceC3141nl;
        this.A0S = c9u;
        this.A0R = c9p;
        this.A0X = interfaceC1765Ed;
        this.A0T = cw;
        this.A0V = interfaceC1716Cg;
        this.A0W = eo2;
        this.A0b = str;
        this.A0M = i10;
        this.A0Y = interfaceExecutorC1787Ez != null ? new C3009lc(interfaceExecutorC1787Ez) : new C3009lc(A0B(13, 29, 83));
        this.A0U = interfaceC1711Cb;
        this.A0P = new C3W();
        this.A0Z = new Runnable() { // from class: com.facebook.ads.redexgen.X.Ce
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0F();
            }
        };
        this.A0a = new Runnable() { // from class: com.facebook.ads.redexgen.X.Cf
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0b();
            }
        };
        this.A0O = AbstractC15184a.A0Y();
        this.A0K = new C1717Ch[0];
        this.A0L = new C3046mE[0];
        this.A05 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0d = MetaExoPlayerUpgradeConfig.A03(EnumC2805i2.A0d) || MetaExoPlayerUpgradeConfig.A03(EnumC2805i2.A0e) || MetaExoPlayerUpgradeConfig.A03(EnumC2805i2.A1f);
        this.A0c = MetaExoPlayerUpgradeConfig.A03(EnumC2805i2.A0g);
    }

    private int A00() {
        int iA0P = 0;
        for (C3046mE c3046mE : this.A0L) {
            iA0P += c3046mE.A0P();
        }
        return iA0P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long A03(boolean r8) {
        /*
            r7 = this;
            r1 = -9223372036854775808
            r5 = 0
        L3:
            com.facebook.ads.redexgen.X.mE[] r0 = r7.A0L
            int r0 = r0.length
            if (r5 >= r0) goto L4b
            if (r8 != 0) goto L36
            com.facebook.ads.redexgen.X.Ci r0 = r7.A07
            java.lang.Object r6 = com.facebook.ads.redexgen.core.C3M.A01(r0)
            java.lang.String[] r4 = com.facebook.ads.redexgen.core.C9A.A0f
            r0 = 6
            r3 = r4[r0]
            r0 = 7
            r0 = r4[r0]
            int r3 = r3.length()
            int r0 = r0.length()
            if (r3 == r0) goto L45
            java.lang.String[] r4 = com.facebook.ads.redexgen.core.C9A.A0f
            java.lang.String r3 = "FDopTuaFs"
            r0 = 6
            r4[r0] = r3
            java.lang.String r3 = "ze95XzERDUjm"
            r0 = 7
            r4[r0] = r3
            com.facebook.ads.redexgen.X.Ci r6 = (com.facebook.ads.redexgen.core.C1718Ci) r6
            boolean[] r0 = r6.A01
            boolean r0 = r0[r5]
            if (r0 == 0) goto L42
        L36:
            com.facebook.ads.redexgen.X.mE[] r0 = r7.A0L
            r0 = r0[r5]
            long r3 = r0.A0T()
            long r1 = java.lang.Math.max(r1, r3)
        L42:
            int r5 = r5 + 1
            goto L3
        L45:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9A.A03(boolean):long");
    }

    private C3046mE A06(C1717Ch c1717Ch) {
        int length = this.A0L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c1717Ch.equals(this.A0K[i10])) {
                return this.A0L[i10];
            }
        }
        C3046mE c3046mEA0B = C3046mE.A0B(this.A0W, this.A0S, this.A0R);
        c3046mEA0B.A0d(this);
        C1717Ch[] c1717ChArr = (C1717Ch[]) Arrays.copyOf(this.A0K, length + 1);
        c1717ChArr[length] = c1717Ch;
        this.A0K = (C1717Ch[]) AbstractC15184a.A1H(c1717ChArr);
        C3046mE[] c3046mEArr = (C3046mE[]) Arrays.copyOf(this.A0L, length + 1);
        c3046mEArr[length] = c3046mEA0B;
        this.A0L = (C3046mE[]) AbstractC15184a.A1H(c3046mEArr);
        return c3046mEA0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1768Eg
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C1769Eh AE0(C3052mK c3052mK, long j10, long j11, IOException iOException, int i10) {
        C1769Eh c1769EhA01;
        C16369b c16369b = c3052mK.A08;
        CE ce2 = new CE(c3052mK.A05, c3052mK.A01, c16369b.A01(), c16369b.A02(), j10, j11, c16369b.A00());
        long jA8m = this.A0X.A8m(new C1764Ec(ce2, new CG(1, -1, null, 0, null, AbstractC15184a.A0P(c3052mK.A00), AbstractC15184a.A0P(this.A03)), iOException, i10));
        if (jA8m == -9223372036854775807L) {
            c1769EhA01 = C3009lc.A06;
        } else {
            int iA00 = A00();
            c1769EhA01 = A0U(c3052mK, iA00) ? C3009lc.A01(iA00 > this.A02, jA8m) : C3009lc.A05;
        }
        this.A0T.A07(ce2, 1, -1, null, 0, null, c3052mK.A00, this.A03, iOException, !c1769EhA01.A02());
        return c1769EhA01;
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static Map<String, String> A0D() {
        HashMap map = new HashMap();
        map.put(A0B(1, 12, 34), A0B(0, 1, 63));
        return Collections.unmodifiableMap(map);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private void A0E() {
        C3M.A08(this.A0G);
        C3M.A01(this.A07);
        C3M.A01(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        if (this.A0H || this.A0G) {
            return;
        }
        boolean z10 = this.A0I;
        String[] strArr = A0f;
        if (strArr[1].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "grMxxjGjFdBhxw9MDZtvFg4OZy35nlzN";
        strArr2[5] = "E38rNlujzeckGRbn7d7aukKxtTtuF9Uw";
        if (!z10 || this.A08 == null) {
            return;
        }
        for (C3046mE c3046mE : this.A0L) {
            if (c3046mE.A0U() == null) {
                return;
            }
        }
        this.A0P.A02();
        int length = this.A0L.length;
        C3172oH[] c3172oHArr = new C3172oH[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            C3206or c3206orA14 = (C3206or) C3M.A01(this.A0L[i10].A0U());
            String str = c3206orA14.A0W;
            boolean zA0C = AbstractC14732h.A0C(str);
            boolean z11 = zA0C || AbstractC14732h.A0F(str);
            zArr[i10] = z11;
            this.A0A |= z11;
            IcyHeaders icyHeaders = this.A09;
            if (icyHeaders != null) {
                if (zA0C || this.A0K[i10].A01) {
                    Metadata metadata = c3206orA14.A0P;
                    C2D c2dA0v = c3206orA14.A07().A0v(metadata == null ? new Metadata(icyHeaders) : metadata.A05(icyHeaders));
                    if (A0f[0].length() != 20) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0f;
                    strArr3[2] = "WsODqr3j7Qd6qKAaI5Z8JETVOkriGcMH";
                    strArr3[5] = "rCf1buyjz0YjJBdswvkAeWhqIr4TjJn3";
                    c3206orA14 = c2dA0v.A14();
                }
                if (zA0C && c3206orA14.A04 == -1 && c3206orA14.A0D == -1 && icyHeaders.A00 != -1) {
                    c3206orA14 = c3206orA14.A07().A0a(icyHeaders.A00).A14();
                }
            }
            c3172oHArr[i10] = new C3172oH(c3206orA14);
        }
        this.A07 = new C1718Ci(new C3043mA(c3172oHArr), zArr);
        this.A0G = true;
        ((InterfaceC3055mN) C3M.A01(this.A06)).AEk(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G() {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Cd
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0c();
            }
        });
    }

    private void A0H() {
        C3052mK c3052mK = new C3052mK(this, this.A0N, this.A0Q, this.A0U, this, this.A0P);
        if (this.A0G) {
            C3M.A08(A0S());
            if (this.A03 != -9223372036854775807L && this.A05 >= this.A03) {
                this.A0D = true;
                this.A05 = -9223372036854775807L;
                return;
            }
            c3052mK.A04(((InterfaceC1836Gw) C3M.A01(this.A08)).A8t(this.A05).A00.A00, this.A05);
            for (C3046mE c3046mE : this.A0L) {
                c3046mE.A0b(this.A05);
            }
            this.A05 = -9223372036854775807L;
        }
        this.A02 = A00();
        this.A0T.A06(new CE(c3052mK.A05, c3052mK.A01, this.A0Y.A08(c3052mK, this, this.A0X.A8R(this.A00))), 1, -1, null, 0, null, c3052mK.A00, this.A03, 0);
    }

    public static void A0I() {
        A0e = new byte[]{-76, -81, -55, -33, -109, -77, -53, -38, -57, -86, -57, -38, -57, -29, 6, -8, -5, -4, 9, -47, -25, 9, 6, -2, 9, -4, 10, 10, 0, 13, -4, -28, -4, -5, 0, -8, -25, -4, 9, 0, 6, -5, -62, -27, -41, -38, -33, -28, -35, -106, -36, -33, -28, -33, -23, -34, -37, -38, -106, -40, -37, -36, -27, -24, -37, -106, -26, -24, -37, -26, -41, -24, -41, -22, -33, -27, -28, -106, -33, -23, -106, ExifInterface.MARKER_EOI, -27, -29, -26, -30, -37, -22, -37, -92, -49, -14, -28, -25, -20, -15, -22, -93, -23, -20, -15, -20, -10, -21, -24, -25, -93, -27, -24, -23, -14, -11, -24, -93, -13, -11, -24, -13, -28, -11, -28, -9, -20, -14, -15, -93, -20, -10, -93, -26, -14, -16, -13, -17, -24, -9, -24, -79, -93, -40, -43, -52, -67, -93, -12, 3, 3, -1, -4, -10, -12, 7, -4, 2, 1, -62, 11, -64, -4, -10, 12, -6, -12, 10, 47, 54, 45, 45};
    }

    private final void A0J() throws IOException {
        this.A0Y.A0B(this.A0X.A8R(this.A00));
    }

    private void A0K(int i10) {
        A0E();
        boolean[] zArr = this.A07.A03;
        if (zArr[i10]) {
            return;
        }
        C3206or c3206orA08 = this.A07.A00.A05(i10).A08(0);
        this.A0T.A03(AbstractC14732h.A01(c3206orA08.A0W), c3206orA08, 0, null, this.A04);
        zArr[i10] = true;
    }

    private void A0L(int i10) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (this.A0F && zArr[i10]) {
            if (this.A0L[i10].A0g(false)) {
                return;
            }
            this.A05 = 0L;
            this.A0F = false;
            this.A0E = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C3046mE c3046mE : this.A0L) {
                c3046mE.A0Z();
            }
            ((InterfaceC3055mN) C3M.A01(this.A06)).ACs(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1768Eg
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final void ADz(C3052mK c3052mK, long j10, long j11) {
        if (this.A03 == -9223372036854775807L && this.A08 != null) {
            boolean zAAa = this.A08.AAa();
            long jA03 = A03(true);
            String[] strArr = A0f;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[6] = "VBgm4XD5c";
            strArr2[7] = "eM9hzsMViOdm";
            this.A03 = jA03 == Long.MIN_VALUE ? 0L : 10000 + jA03;
            this.A0V.AFH(this.A03, zAAa, this.A0C);
        }
        C16369b c16369b = c3052mK.A08;
        this.A0T.A08(new CE(c3052mK.A05, c3052mK.A01, c16369b.A01(), c16369b.A02(), j10, j11, c16369b.A00()), 1, -1, null, 0, null, c3052mK.A00, this.A03, c3052mK, null);
        this.A0D = true;
        ((InterfaceC3055mN) C3M.A01(this.A06)).ACs(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1768Eg
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final void AE3(C3052mK c3052mK, long j10, long j11, int i10) {
        C16369b c16369b = c3052mK.A08;
        this.A0T.A06(i10 == 0 ? new CE(c3052mK.A05, c3052mK.A01, j10) : new CE(c3052mK.A05, c3052mK.A01, c16369b.A01(), c16369b.A02(), j10, j11, c16369b.A00()), 1, -1, null, 0, null, c3052mK.A00, this.A03, i10);
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[6] = "RSQzFltms";
        strArr2[7] = "MablvJN0SXK9";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1768Eg
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final void ADx(C3052mK c3052mK, long j10, long j11, boolean z10) {
        C16369b c16369b = c3052mK.A08;
        this.A0T.A05(new CE(c3052mK.A05, c3052mK.A01, c16369b.A01(), c16369b.A02(), j10, j11, c16369b.A00()), 1, -1, null, 0, null, c3052mK.A00, this.A03);
        if (z10) {
            return;
        }
        for (C3046mE c3046mE : this.A0L) {
            c3046mE.A0Z();
        }
        if (this.A01 > 0) {
            ((InterfaceC3055mN) C3M.A01(this.A06)).ACs(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0R, reason: merged with bridge method [inline-methods] */
    public void A0e(InterfaceC1836Gw interfaceC1836Gw) {
        this.A08 = interfaceC1836Gw;
        this.A03 = interfaceC1836Gw.A7l();
        this.A0C = !this.A0B && interfaceC1836Gw.A7l() == -9223372036854775807L;
        this.A00 = this.A0C ? 7 : 1;
        this.A0V.AFH(this.A03, interfaceC1836Gw.AAa(), this.A0C);
        if (this.A0G) {
            return;
        }
        A0F();
    }

    private boolean A0S() {
        return this.A05 != -9223372036854775807L;
    }

    private boolean A0T() {
        return this.A0E || A0S();
    }

    private boolean A0U(C3052mK c3052mK, int i10) {
        if (this.A0B || !(this.A08 == null || this.A08.A7l() == -9223372036854775807L)) {
            this.A02 = i10;
            return true;
        }
        if (this.A0G && !A0T()) {
            this.A0F = true;
            return false;
        }
        this.A0E = this.A0G;
        this.A04 = 0L;
        this.A02 = 0;
        for (C3046mE c3046mE : this.A0L) {
            c3046mE.A0Z();
        }
        c3052mK.A04(0L, 0L);
        return true;
    }

    private boolean A0V(boolean[] zArr, long j10) {
        int length = this.A0L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.A0L[i10].A0f(j10, false) && (zArr[i10] || !this.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int A0X(int i10, long j10) {
        if (A0T()) {
            return 0;
        }
        A0K(i10);
        C3046mE c3046mE = this.A0L[i10];
        int iA0Q = c3046mE.A0Q(j10, this.A0D);
        c3046mE.A0a(iA0Q);
        if (iA0Q == 0) {
            A0L(i10);
        }
        return iA0Q;
    }

    public final int A0Y(int i10, C6N c6n, C3128nY c3128nY, int i11) {
        if (A0T()) {
            return -3;
        }
        A0K(i10);
        int iA0R = this.A0L[i10].A0R(c6n, c3128nY, i11, this.A0D);
        if (iA0R == -3) {
            A0L(i10);
        }
        return iA0R;
    }

    public final H1 A0Z() {
        return A06(new C1717Ch(0, true));
    }

    public final void A0a() {
        if (this.A0G) {
            for (C3046mE c3046mE : this.A0L) {
                c3046mE.A0X();
            }
        }
        this.A0Y.A0C(this);
        this.A0O.removeCallbacksAndMessages(null);
        this.A06 = null;
        this.A0H = true;
    }

    public final /* synthetic */ void A0b() {
        if (this.A0H) {
            return;
        }
        ((InterfaceC3055mN) C3M.A01(this.A06)).ACs(this);
    }

    public final /* synthetic */ void A0c() {
        this.A0B = true;
    }

    public final void A0d(int i10) throws IOException {
        this.A0L[i10].A0W();
        A0J();
    }

    public final boolean A0f(int i10) {
        return !A0T() && this.A0L[i10].A0g(this.A0D);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4k(long j10) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final boolean A54(long j10) {
        if (this.A0D || this.A0Y.A0D() || this.A0F) {
            return false;
        }
        if (this.A0G && this.A01 == 0) {
            return false;
        }
        boolean zA04 = this.A0P.A04();
        if (this.A0Y.A0E()) {
            return zA04;
        }
        A0H();
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void A5s(long j10, boolean z10) {
        A0E();
        if (A0S()) {
            return;
        }
        boolean[] zArr = this.A07.A01;
        int length = this.A0L.length;
        for (int i10 = 0; i10 < length; i10++) {
            C3046mE[] c3046mEArr = this.A0L;
            String[] strArr = A0f;
            if (strArr[6].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0f[0] = "xFMIvf7swbs88yH1ASsn";
            c3046mEArr[i10].A0c(j10, z10, zArr[i10]);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GY
    public final void A6G() {
        this.A0I = true;
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long A6j(long j10, C7I c7i) {
        A0E();
        if (!this.A08.AAa()) {
            return 0L;
        }
        C1835Gv c1835GvA8t = this.A08.A8t(j10);
        long j11 = c1835GvA8t.A00.A01;
        String[] strArr = A0f;
        if (strArr[6].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "A6SKS5Ejxr3dBguC5asmpR7Eo1U8ekaX";
        strArr2[5] = "H67kjT3j1V6FB1MougrbLEHHMAKkStlF";
        return c7i.A00(j10, j11, c1835GvA8t.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Added in D9949576 for unstall buffer")
    public final long A6y(long j10) {
        if (!this.A0d || this.A0G) {
            return this.A0D ? this.A03 - j10 : A70() - j10;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A70() {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9A.A70():long");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long A8T() {
        return A70();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final C3043mA A9E() {
        A0E();
        return this.A07.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void ABt() throws IOException {
        A0J();
        if (!this.A0D || this.A0G) {
            return;
        }
        if (!this.A0c) {
            throw C14742i.A01(A0B(42, 48, 50), null);
        }
        throw C14742i.A01(A0B(90, 54, 63) + (this.A0N != null ? this.A0N.toString() : A0B(164, 4, 125)), null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1772Ek
    public final void AE4() {
        for (C3046mE c3046mE : this.A0L) {
            c3046mE.A0Y();
        }
        this.A0U.AGr();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1723Cn
    public final void AFb(C3206or c3206or) {
        this.A0O.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void AGL(InterfaceC3055mN interfaceC3055mN, long j10) {
        this.A06 = interfaceC3055mN;
        this.A0P.A04();
        A0H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long AGg() {
        if (!this.A0E) {
            return -9223372036854775807L;
        }
        boolean z10 = this.A0D;
        if (A0f[0].length() == 20) {
            String[] strArr = A0f;
            strArr[1] = "";
            strArr[4] = "OLDtf0M6xpFiQAaUF2mFzXoKXa03XjZ";
            if (!z10 && A00() <= this.A02) {
                return -9223372036854775807L;
            }
            this.A0E = false;
            long j10 = this.A04;
            if (A0f[0].length() == 20) {
                String[] strArr2 = A0f;
                strArr2[6] = "30bUCuPdV";
                strArr2[7] = "qvk1tPvPLdJz";
                return j10;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final void AGm(long j10) {
    }

    @Override // com.facebook.ads.redexgen.core.GY
    public final void AIN(final InterfaceC1836Gw interfaceC1836Gw) {
        this.A0O.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.Cc
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0e(interfaceC1836Gw);
            }
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    public final long AIO(@MetaExoPlayerCustomization long j10, boolean z10) {
        A0E();
        boolean[] zArr = this.A07.A02;
        if (!this.A08.AAa()) {
            j10 = 0;
        }
        int i10 = 0;
        this.A0E = false;
        this.A04 = j10;
        if (A0S()) {
            this.A05 = j10;
            return j10;
        }
        if (this.A00 != 7 && A0V(zArr, j10)) {
            return j10;
        }
        this.A0F = false;
        this.A05 = j10;
        this.A0D = false;
        if (this.A0Y.A0E()) {
            C3046mE[] c3046mEArr = this.A0L;
            int length = c3046mEArr.length;
            while (i10 < length) {
                c3046mEArr[i10].A0V();
                String[] strArr = A0f;
                if (strArr[6].length() == strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0f;
                strArr2[2] = "OrOS7Vhjp4VBbz175mMxq2SuFvjpl5bQ";
                strArr2[5] = "EAKZg7yj0ctHJiN4FHg90oFZJxg2ecfG";
                i10++;
            }
            this.A0Y.A09();
            return j10;
        }
        this.A0Y.A0A();
        C3046mE[] c3046mEArr2 = this.A0L;
        int length2 = c3046mEArr2.length;
        while (i10 < length2) {
            c3046mEArr2[i10].A0Z();
            String[] strArr3 = A0f;
            if (strArr3[2].charAt(7) != strArr3[5].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0f;
            strArr4[6] = "p5drqiHAR";
            strArr4[7] = "h8TdfbRbJweW";
            i10++;
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC3054mM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AIP(com.facebook.ads.redexgen.core.InterfaceC3016lj[] r15, boolean[] r16, com.facebook.ads.redexgen.core.InterfaceC1727Cr[] r17, boolean[] r18, long r19) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9A.AIP(com.facebook.ads.redexgen.X.lj[], boolean[], com.facebook.ads.redexgen.X.Cr[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AIs(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.core.GY
    public final H1 AJh(int i10, int i11) {
        return A06(new C1717Ch(i10, false));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1731Cv
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AJq(byte b10) {
    }
}
