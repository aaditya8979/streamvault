package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2709gI extends QO implements InterfaceC2070Qa {
    public static byte[] A0F;
    public static String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public Q8 A04;
    public boolean A05;
    public int A06;
    public Q3 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Q1 A0D;
    public final Q2 A0E;

    static {
        A0V();
    }

    public C2709gI(Context context) {
        this(context, 1, false);
    }

    public C2709gI(Context context, int i10, boolean z10) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new Q1(this);
        this.A0E = new Q2();
        this.A06 = 2;
        A2C(i10);
        A0h(z10);
        A1T(true);
    }

    private final int A04(int i10, QW qw, C2073Qd c2073Qd) {
        if (A0Y() == 0 || i10 == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2B();
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        A0Y(i11, iAbs, true, c2073Qd);
        int iA07 = this.A07.A07 + A07(qw, this.A07, c2073Qd, false);
        if (iA07 < 0) {
            return 0;
        }
        int i12 = iAbs > iA07 ? i11 * iA07 : i10;
        this.A04.A0J(-i12);
        this.A07.A04 = i12;
        return i12;
    }

    private int A05(int i10, QW qw, C2073Qd c2073Qd, boolean z10) {
        int iA07;
        int iA072 = this.A04.A07() - i10;
        if (iA072 <= 0) {
            return 0;
        }
        int i11 = -A04(-iA072, qw, c2073Qd);
        int i12 = i10 + i11;
        if (!z10 || (iA07 = this.A04.A07() - i12) <= 0) {
            return i11;
        }
        this.A04.A0J(iA07);
        return iA07 + i11;
    }

    private int A06(int i10, QW qw, C2073Qd c2073Qd, boolean z10) {
        int iA0A;
        int iA0A2 = i10 - this.A04.A0A();
        if (iA0A2 <= 0) {
            return 0;
        }
        int i11 = -A04(iA0A2, qw, c2073Qd);
        int i12 = i10 + i11;
        if (!z10 || (iA0A = i12 - this.A04.A0A()) <= 0) {
            return i11;
        }
        this.A04.A0J(-iA0A);
        return i11 - iA0A;
    }

    private final int A07(QW qw, Q3 q32, C2073Qd c2073Qd, boolean z10) {
        int i10 = q32.A00;
        if (q32.A07 != Integer.MIN_VALUE) {
            if (q32.A00 < 0) {
                q32.A07 += q32.A00;
            }
            A0e(qw, q32);
        }
        int i11 = q32.A00 + q32.A02;
        Q2 q22 = this.A0E;
        while (true) {
            if ((!q32.A09 && i11 <= 0) || !q32.A05(c2073Qd)) {
                break;
            }
            q22.A00();
            A2F(qw, c2073Qd, q32, q22);
            if (!q22.A01) {
                q32.A06 += q22.A00 * q32.A05;
                if (!q22.A03 || this.A07.A08 != null || !c2073Qd.A07()) {
                    q32.A00 -= q22.A00;
                    i11 -= q22.A00;
                }
                if (q32.A07 != Integer.MIN_VALUE) {
                    q32.A07 += q22.A00;
                    if (q32.A00 < 0) {
                        q32.A07 += q32.A00;
                    }
                    A0e(qw, q32);
                }
                if (z10 && q22.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - q32.A00;
    }

    private int A08(C2073Qd c2073Qd) {
        if (A0Y() == 0) {
            return 0;
        }
        A2B();
        return AbstractC2077Qh.A00(c2073Qd, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(C2073Qd c2073Qd) {
        if (A0Y() != 0) {
            A2B();
            return AbstractC2077Qh.A02(c2073Qd, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        }
        if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        }
        A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
        return 0;
    }

    private int A0B(C2073Qd c2073Qd) {
        if (A0Y() == 0) {
            return 0;
        }
        A2B();
        return AbstractC2077Qh.A01(c2073Qd, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(C2073Qd c2073Qd) {
        if (c2073Qd.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0Y());
    }

    private View A0E() {
        return A0H(A0Y() - 1, -1);
    }

    private View A0F() {
        return A0v(this.A05 ? 0 : A0Y() - 1);
    }

    private View A0G() {
        return A0v(this.A05 ? A0Y() - 1 : 0);
    }

    private final View A0H(int i10, int i11) {
        int i12;
        int i13;
        A2B();
        if ((i11 > i10 ? (byte) 1 : i11 < i10 ? (byte) -1 : (byte) 0) == 0) {
            return A0v(i10);
        }
        if (this.A04.A0F(A0v(i10)) < this.A04.A0A()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        }
        return this.A00 == 0 ? super.A04.A00(i10, i11, i12, i13) : super.A05.A00(i10, i11, i12, i13);
    }

    private final View A0I(int i10, int i11, boolean z10, boolean z11) {
        A2B();
        int i12 = z10 ? 24579 : Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        int i13 = z11 ? Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE : 0;
        int i14 = this.A00;
        if (A0G[5].charAt(29) != 'E') {
            throw new RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        return i14 == 0 ? super.A04.A00(i10, i11, i12, i13) : super.A05.A00(i10, i11, i12, i13);
    }

    private View A0J(QW qw, C2073Qd c2073Qd) {
        return A2A(qw, c2073Qd, 0, A0Y(), c2073Qd.A03());
    }

    private View A0L(QW qw, C2073Qd c2073Qd) {
        return A2A(qw, c2073Qd, A0Y() - 1, -1, c2073Qd.A03());
    }

    private View A0M(QW qw, C2073Qd c2073Qd) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(QW qw, C2073Qd c2073Qd) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(QW qw, C2073Qd c2073Qd) {
        return this.A05 ? A0J(qw, c2073Qd) : A0L(qw, c2073Qd);
    }

    private View A0P(QW qw, C2073Qd c2073Qd) {
        return this.A05 ? A0L(qw, c2073Qd) : A0J(qw, c2073Qd);
    }

    private View A0Q(boolean z10, boolean z11) {
        return this.A05 ? A0I(0, A0Y(), z10, z11) : A0I(A0Y() - 1, -1, z10, z11);
    }

    private View A0R(boolean z10, boolean z11) {
        return this.A05 ? A0I(A0Y() - 1, -1, z10, z11) : A0I(0, A0Y(), z10, z11);
    }

    private final Q3 A0S() {
        return new Q3();
    }

    public static String A0T(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    private void A0U() {
        if (this.A00 == 1 || !A2H()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    private void A0W(int i10, int i11) {
        this.A07.A00 = this.A04.A07() - i11;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i10;
        this.A07.A05 = 1;
        this.A07.A06 = i11;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i10, int i11) {
        this.A07.A00 = i11 - this.A04.A0A();
        this.A07.A01 = i10;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i11;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i10, int i11, boolean z10, C2073Qd c2073Qd) {
        int iA0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c2073Qd);
        this.A07.A05 = i10;
        if (i10 == 1) {
            this.A07.A02 += this.A04.A08();
            View viewA0F = A0F();
            this.A07.A03 = this.A05 ? -1 : 1;
            this.A07.A01 = A0r(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0F);
            iA0A = this.A04.A0C(viewA0F) - this.A04.A07();
        } else {
            View viewA0G = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0r(viewA0G) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0G);
            iA0A = (-this.A04.A0F(viewA0G)) + this.A04.A0A();
        }
        this.A07.A00 = i11;
        if (z10) {
            this.A07.A00 -= iA0A;
        }
        this.A07.A07 = iA0A;
    }

    private void A0Z(Q1 q12) {
        A0W(q12.A01, q12.A00);
    }

    private void A0a(Q1 q12) {
        A0X(q12.A01, q12.A00);
    }

    private void A0b(QW qw, int i10) {
        int iA0Y = A0Y();
        if (i10 < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i10;
        boolean z10 = this.A05;
        if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (!z10) {
            for (int i11 = iA0Y - 1; i11 >= 0; i11--) {
                View viewA0v = A0v(i11);
                if (this.A04.A0F(viewA0v) < iA06 || this.A04.A0H(viewA0v) < iA06) {
                    A0d(qw, iA0Y - 1, i11);
                    return;
                }
            }
            return;
        }
        for (int i12 = 0; i12 < iA0Y; i12++) {
            View viewA0v2 = A0v(i12);
            if (this.A04.A0F(viewA0v2) < iA06 || this.A04.A0H(viewA0v2) < iA06) {
                if (A0G[4].length() == 13) {
                    A0d(qw, 0, i12);
                    return;
                }
                String[] strArr = A0G;
                strArr[6] = "EiwXPaP";
                strArr[2] = "4OvxlWI";
                A0d(qw, 0, i12);
                return;
            }
        }
    }

    private void A0c(QW qw, int i10) {
        if (i10 < 0) {
            return;
        }
        int iA0Y = A0Y();
        if (!this.A05) {
            for (int i11 = 0; i11 < iA0Y; i11++) {
                View viewA0v = A0v(i11);
                if (this.A04.A0C(viewA0v) > i10 || this.A04.A0G(viewA0v) > i10) {
                    A0d(qw, 0, i11);
                    return;
                }
            }
            return;
        }
        for (int i12 = iA0Y - 1; i12 >= 0; i12--) {
            View viewA0v2 = A0v(i12);
            Q8 q82 = this.A04;
            if (A0G[5].charAt(29) != 'E') {
                throw new RuntimeException();
            }
            A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
            if (q82.A0C(viewA0v2) > i10 || this.A04.A0G(viewA0v2) > i10) {
                A0d(qw, iA0Y - 1, i12);
                return;
            }
        }
    }

    private void A0d(QW qw, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                A16(i10, qw);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                A16(i12, qw);
            }
        }
    }

    private void A0e(QW qw, Q3 q32) {
        if (!q32.A0B || q32.A09) {
            return;
        }
        if (q32.A05 == -1) {
            A0b(qw, q32.A07);
        } else {
            A0c(qw, q32.A07);
        }
    }

    private void A0f(QW qw, C2073Qd c2073Qd, int i10, int i11) {
        if (!c2073Qd.A08() || A0Y() == 0 || c2073Qd.A07() || !A24()) {
            return;
        }
        int iA0D = 0;
        int iA0D2 = 0;
        List<AbstractC2076Qg> listA0J = qw.A0J();
        int size = listA0J.size();
        int iA0r = A0r(A0v(0));
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC2076Qg abstractC2076Qg = listA0J.get(i12);
            if (!abstractC2076Qg.A0g()) {
                if (((abstractC2076Qg.A0O() < iA0r) != this.A05 ? (byte) -1 : (byte) 1) == -1) {
                    iA0D += this.A04.A0D(abstractC2076Qg.A0H);
                } else {
                    iA0D2 += this.A04.A0D(abstractC2076Qg.A0H);
                }
            }
        }
        this.A07.A08 = listA0J;
        if (iA0D > 0) {
            A0X(A0r(A0G()), i10);
            this.A07.A02 = iA0D;
            this.A07.A00 = 0;
            this.A07.A04();
            A07(qw, this.A07, c2073Qd, false);
        }
        if (iA0D2 > 0) {
            A0W(A0r(A0F()), i11);
            this.A07.A02 = iA0D2;
            this.A07.A00 = 0;
            this.A07.A04();
            A07(qw, this.A07, c2073Qd, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(QW qw, C2073Qd c2073Qd, Q1 q12) {
        if (A0k(c2073Qd, q12) || A0j(qw, c2073Qd, q12)) {
            return;
        }
        q12.A02();
        q12.A01 = this.A0C ? c2073Qd.A03() - 1 : 0;
    }

    private final void A0h(boolean z10) {
        A20(null);
        if (z10 == this.A0A) {
            return;
        }
        this.A0A = z10;
        A10();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(QW qw, C2073Qd c2073Qd, Q1 q12) {
        if (A0Y() == 0) {
            return false;
        }
        View viewA0u = A0u();
        if (viewA0u != null && q12.A06(viewA0u, c2073Qd)) {
            q12.A05(viewA0u);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        View viewA0O = q12.A02 ? A0O(qw, c2073Qd) : A0P(qw, c2073Qd);
        if (viewA0O == null) {
            return false;
        }
        q12.A04(viewA0O);
        if (!c2073Qd.A07() && A24()) {
            if (this.A04.A0F(viewA0O) >= this.A04.A07() || this.A04.A0C(viewA0O) < this.A04.A0A()) {
                q12.A00 = q12.A02 ? this.A04.A07() : this.A04.A0A();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if ((r8.A04.A07() - r8.A04.A0C(r5)) >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r10.A02 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r1 = r8.A04.A0C(r5) + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r1 = r8.A04.A0F(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0k(com.facebook.ads.redexgen.core.C2073Qd r9, com.facebook.ads.redexgen.core.Q1 r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2709gI.A0k(com.facebook.ads.redexgen.X.Qd, com.facebook.ads.redexgen.X.Q1):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public int A1f(int i10, QW qw, C2073Qd c2073Qd) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i10, qw, c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public int A1g(int i10, QW qw, C2073Qd c2073Qd) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i10, qw, c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final int A1h(C2073Qd c2073Qd) {
        return A08(c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final int A1i(C2073Qd c2073Qd) {
        return A0A(c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final int A1j(C2073Qd c2073Qd) {
        return A0B(c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final int A1k(C2073Qd c2073Qd) {
        return A08(c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final int A1l(C2073Qd c2073Qd) {
        return A0A(c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final int A1m(C2073Qd c2073Qd) {
        return A0B(c2073Qd);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final Parcelable A1n() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0Y() > 0) {
            A2B();
            boolean z10 = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = z10;
            if (z10) {
                View viewA0F = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(viewA0F);
                linearLayoutManager$SavedState.A01 = A0r(viewA0F);
            } else {
                View viewA0G = A0G();
                linearLayoutManager$SavedState.A01 = A0r(viewA0G);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(viewA0G) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final View A1o(int i10) {
        int iA0Y = A0Y();
        if (iA0Y == 0) {
            return null;
        }
        int iA0r = i10 - A0r(A0v(0));
        if (iA0r >= 0 && iA0r < iA0Y) {
            View viewA0v = A0v(iA0r);
            if (A0r(viewA0v) == i10) {
                return viewA0v;
            }
        }
        return super.A1o(i10);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public View A1p(View view, int i10, QW qw, C2073Qd c2073Qd) {
        int iA29;
        A0U();
        if (A0Y() == 0 || (iA29 = A29(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        A2B();
        A2B();
        A0Y(iA29, (int) (this.A04.A0B() * 0.33333334f), false, c2073Qd);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A07(qw, this.A07, c2073Qd, true);
        View viewA0N = iA29 == -1 ? A0N(qw, c2073Qd) : A0M(qw, c2073Qd);
        View viewA0G = iA29 == -1 ? A0G() : A0F();
        if (!viewA0G.hasFocusable()) {
            return viewA0N;
        }
        if (viewA0N == null) {
            return null;
        }
        return viewA0G;
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public QP A1q() {
        return new QP(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public void A1r(int i10) {
        this.A01 = i10;
        this.A02 = Integer.MIN_VALUE;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A10();
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final void A1s(int i10, int i11, C2073Qd c2073Qd, QM qm2) {
        if (this.A00 != 0) {
            i10 = i11;
        }
        if (A0Y() == 0 || i10 == 0) {
            return;
        }
        A2B();
        A0Y(i10 > 0 ? 1 : -1, Math.abs(i10), true, c2073Qd);
        A2G(c2073Qd, this.A07, qm2);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final void A1t(int i10, QM qm2) {
        boolean z10;
        int i11;
        if (this.A03 == null || !this.A03.A01()) {
            A0U();
            z10 = this.A05;
            i11 = this.A01 == -1 ? z10 ? i10 - 1 : 0 : this.A01;
        } else {
            z10 = this.A03.A02;
            i11 = this.A03.A01;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.A06 && i11 >= 0 && i11 < i10; i13++) {
            qm2.A3u(i11, 0);
            i11 += i12;
        }
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final void A1u(Parcelable parcelable) {
        ClassLoader classLoader;
        if ((parcelable instanceof WrappedParcelable) && (classLoader = getClass().getClassLoader()) != null) {
            Parcelable parcelableUnwrap = ((WrappedParcelable) parcelable).unwrap(classLoader);
            if (parcelableUnwrap instanceof LinearLayoutManager$SavedState) {
                this.A03 = (LinearLayoutManager$SavedState) parcelableUnwrap;
                A10();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final void A1v(AccessibilityEvent accessibilityEvent) {
        super.A1v(accessibilityEvent);
        if (A0Y() > 0) {
            accessibilityEvent.setFromIndex(A26());
            if (A0G[1].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A27());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0250  */
    @Override // com.facebook.ads.redexgen.core.QO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A1w(com.facebook.ads.redexgen.core.QW r10, com.facebook.ads.redexgen.core.C2073Qd r11) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2709gI.A1w(com.facebook.ads.redexgen.X.QW, com.facebook.ads.redexgen.X.Qd):void");
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public void A1x(C2073Qd c2073Qd) {
        super.A1x(c2073Qd);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final void A1y(C15766g c15766g, QW qw) {
        super.A1y(c15766g, qw);
        if (this.A09) {
            A1K(qw);
            qw.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public void A1z(C15766g c15766g, C2073Qd c2073Qd, int i10) {
        C2708gH c2708gH = new C2708gH(c15766g.getContext());
        c2708gH.A0A(i10);
        A1N(c2708gH);
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final void A20(String str) {
        if (this.A03 == null) {
            super.A20(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final boolean A21() {
        return (A0a() == 1073741824 || A0k() == 1073741824 || !A1U()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final boolean A22() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public final boolean A23() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.core.QO
    public boolean A24() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A25() {
        View viewA0I = A0I(0, A0Y(), true, false);
        if (viewA0I == null) {
            return -1;
        }
        return A0r(viewA0I);
    }

    public final int A26() {
        View viewA0I = A0I(0, A0Y(), false, true);
        if (viewA0I == null) {
            return -1;
        }
        return A0r(viewA0I);
    }

    public final int A27() {
        View viewA0I = A0I(A0Y() - 1, -1, false, true);
        if (viewA0I == null) {
            return -1;
        }
        return A0r(viewA0I);
    }

    public final int A28() {
        return this.A00;
    }

    public final int A29(int i10) {
        switch (i10) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean zA2H = A2H();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return zA2H ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2H()) ? -1 : 1;
            case 17:
                return this.A00 == 0 ? -1 : Integer.MIN_VALUE;
            case 33:
                return this.A00 == 1 ? -1 : Integer.MIN_VALUE;
            case 66:
                int i11 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    return i11 == 0 ? 1 : Integer.MIN_VALUE;
                }
                break;
            case 130:
                return this.A00 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
        throw new RuntimeException();
    }

    public View A2A(QW qw, C2073Qd c2073Qd, int i10, int i11, int i12) {
        A2B();
        View view = null;
        View view2 = null;
        int iA0A = this.A04.A0A();
        int iA07 = this.A04.A07();
        int i13 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View viewA0v = A0v(i10);
            int iA0r = A0r(viewA0v);
            if (iA0r >= 0 && iA0r < i12) {
                if (((QP) viewA0v.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = viewA0v;
                    }
                } else {
                    if (this.A04.A0F(viewA0v) < iA07 && this.A04.A0C(viewA0v) >= iA0A) {
                        return viewA0v;
                    }
                    if (view2 == null) {
                        view2 = viewA0v;
                    }
                }
            }
            i10 += i13;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2B() {
        if (this.A07 == null) {
            Q3 q3A0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = q3A0S;
        }
        if (this.A04 == null) {
            this.A04 = Q8.A02(this, this.A00);
        }
    }

    public final void A2C(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(A0T(0, 20, 45) + i10);
        }
        A20(null);
        if (i10 == this.A00) {
            return;
        }
        this.A00 = i10;
        this.A04 = null;
        A10();
    }

    public final void A2D(int i10, int i11) {
        this.A01 = i10;
        this.A02 = i11;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A10();
    }

    public void A2E(QW qw, C2073Qd c2073Qd, Q1 q12, int i10) {
    }

    public void A2F(QW qw, C2073Qd c2073Qd, Q3 q32, Q2 q22) {
        int iA0i;
        int iA0E;
        int iA0g;
        int iA0E2;
        View viewA03 = q32.A03(qw);
        if (viewA03 == null) {
            q22.A01 = true;
            return;
        }
        QP qp2 = (QP) viewA03.getLayoutParams();
        if (q32.A08 == null) {
            if (this.A05 == (q32.A05 == -1)) {
                A19(viewA03);
            } else {
                A1B(viewA03, 0);
            }
        } else {
            if (this.A05 == (q32.A05 == -1)) {
                A18(viewA03);
            } else {
                A1A(viewA03, 0);
            }
        }
        A1C(viewA03, 0, 0);
        q22.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2H()) {
                iA0E2 = A0j() - A0h();
                iA0g = iA0E2 - this.A04.A0E(viewA03);
            } else {
                iA0g = A0g();
                iA0E2 = this.A04.A0E(viewA03) + iA0g;
            }
            if (q32.A05 == -1) {
                iA0E = q32.A06;
                iA0i = q32.A06 - q22.A00;
            } else {
                iA0i = q32.A06;
                iA0E = q32.A06 + q22.A00;
            }
        } else {
            iA0i = A0i();
            iA0E = this.A04.A0E(viewA03) + iA0i;
            if (q32.A05 == -1) {
                iA0E2 = q32.A06;
                iA0g = q32.A06 - q22.A00;
            } else {
                iA0g = q32.A06;
                iA0E2 = q32.A06 + q22.A00;
            }
        }
        A1D(viewA03, iA0g, iA0i, iA0E2, iA0E);
        if (qp2.A02() || qp2.A01()) {
            q22.A03 = true;
        }
        q22.A02 = viewA03.hasFocusable();
    }

    public void A2G(C2073Qd c2073Qd, Q3 q32, QM qm2) {
        int i10 = q32.A01;
        if (i10 < 0 || i10 >= c2073Qd.A03()) {
            return;
        }
        qm2.A3u(i10, Math.max(0, q32.A07));
    }

    public final boolean A2H() {
        return A0c() == 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2070Qa
    public final PointF A4y(int i10) {
        if (A0Y() == 0) {
            return null;
        }
        boolean z10 = i10 < A0r(A0v(0));
        boolean z11 = this.A05;
        if (A0G[4].length() == 13) {
            throw new RuntimeException();
        }
        A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
        int i11 = z10 != z11 ? -1 : 1;
        return this.A00 == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }
}
