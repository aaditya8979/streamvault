package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15093r extends G2 {
    public static byte[] A0U;
    public static String[] A0V = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public UZ A01;
    public AbstractC2259Xm A02;
    public AbstractC2363ae A03;
    public InterfaceC2488cf A04;
    public C2526dI A05;
    public EnumC2545db A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final View A0H;
    public final R6 A0I;
    public final InterfaceC2487ce A0J;
    public final EG A0K;
    public final E1 A0L;
    public final C15003i A0M;
    public final DX A0N;
    public final DV A0O;
    public final DR A0P;
    public final DP A0Q;
    public final DN A0R;
    public final DM A0S;
    public final C1732Cw A0T;

    static {
        A0G();
    }

    public C15093r(C2529dL c2529dL, YY yy, US us2, AbstractC2804hy abstractC2804hy, SF sf2, InterfaceC2260Xn interfaceC2260Xn) {
        super(c2529dL, yy, us2, abstractC2804hy, sf2, interfaceC2260Xn);
        this.A0I = new FO(this);
        this.A0R = new DN() { // from class: com.facebook.ads.redexgen.X.4G
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.A0E = true;
                this.A00.A03.A1I(r32);
            }
        };
        this.A0Q = new DP() { // from class: com.facebook.ads.redexgen.X.4F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DQ dq2) {
                this.A00.A0F = true;
                this.A00.A0c();
            }
        };
        this.A0P = new DR() { // from class: com.facebook.ads.redexgen.X.4E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Y c3y) {
            }
        };
        this.A0S = new DM() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3Q c3q) {
                this.A00.A0Q(c3q);
                this.A00.A0P(c3q);
                this.A00.A03.A1J(c3q, this.A00.A00);
            }
        };
        this.A0N = new DX() { // from class: com.facebook.ads.redexgen.X.3t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC2152Tf
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C14953d c14953d) {
                this.A00.A0O(c14953d, this.A00.A0L.getState() != EnumC2599eU.A06, false);
            }
        };
        this.A0O = new C15103s(this);
        boolean z10 = false;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0C = false;
        this.A0A = false;
        this.A00 = 0;
        this.A07 = false;
        this.A09 = false;
        this.A01 = UZ.A0c;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A0J = new FN(this);
        this.A0L = new E1(super.A04);
        this.A0L.setFunnelLoggingHandler(super.A06);
        this.A0L.getEventBus().A03(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
        this.A0B = abstractC2804hy.A1k();
        this.A0M = new C15003i(super.A04, super.A05, this.A0L, super.A02.A25(), 0, 0, super.A02.A20().A0U(), null, null);
        if (U7.A1v(super.A04)) {
            this.A0K = new EG(super.A04, super.A05, this.A0L, super.A02.A25(), super.A02.A20().A0U(), this.A0M, null);
        } else {
            this.A0K = null;
        }
        this.A05 = new C2526dI(super.A04, super.A0A, super.A02.A1A(), interfaceC2260Xn);
        if (A0j()) {
            this.A0H = new D0(super.A04, super.A06);
        } else {
            this.A0H = new D1(super.A04, super.A06);
        }
        int iA02 = (super.A02.A1Z() || A0j()) ? A02(super.A02) * 1000 : -1;
        if (A0j()) {
            this.A0T = new C1732Cw(super.A04, iA02, C1732Cw.A0D);
        } else {
            this.A0T = new C1732Cw(super.A04, iA02);
        }
        if ((this.A0B && !super.A02.A1i()) || super.A02.A1a()) {
            this.A0T.setVisibility(8);
        }
        if (super.A02.A20().A0U()) {
            this.A0T.setShouldClearAnimationWhenVideoCompleted(false);
        }
        A0F();
        this.A0L.setVideoURI(super.A03.A0T(super.A02.A20().A0H().A09()));
        A0D();
        int iA04 = super.A02.A20().A0H().A04();
        if (U7.A2J(super.A04)) {
            this.A0C = iA04 == 0;
        } else {
            this.A0C = iA04 <= 0;
        }
        if (super.A02.A20().A0S() && super.A02.A20().A0H().A03() > 0) {
            z10 = true;
        }
        this.A08 = z10;
        XP.A0K(this, super.A02.A1z().A01().A08(true));
        if (U7.A2D(super.A04) || super.A02.A1Z()) {
            super.A08.setProgressSpinnerInvisible(true);
        }
        if (super.A02.A1l()) {
            super.A04.A0F().ADt();
        }
    }

    private float A00() {
        float fA04 = super.A02.A20().A0H().A04();
        boolean zEquals = super.A0A.A8d().equals(AdPlacementType.REWARDED_VIDEO.toString());
        if (fA04 != -1.0f || !zEquals || !super.A02.A1e()) {
            return !this.A0B ? Math.min(1000.0f * fA04, this.A0L.getDuration()) : 1000.0f * fA04;
        }
        float duration = this.A0L.getDuration();
        if (duration > 0.0f) {
            return duration;
        }
        return 0.0f;
    }

    private int A01(int i10, int i11, int i12) {
        int i13 = 0;
        if (this.A0B) {
            int i14 = this.A00;
            if (A0V[4].charAt(26) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[0] = "";
            strArr[1] = "GEJnt8SXHB7Z";
            i13 = i12 * i14;
        }
        return (i11 - i13) - (i10 / 1000);
    }

    public static int A02(AbstractC2804hy abstractC2804hy) {
        if (abstractC2804hy.A0v().equals(A0A(18, 14, 49))) {
            return abstractC2804hy.A20().A0H().A03();
        }
        if (abstractC2804hy.A0v().equals(A0A(6, 12, 112))) {
            return abstractC2804hy.A20().A0H().A04();
        }
        String[] strArr = A0V;
        if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[0] = "";
        strArr2[1] = "oU1GMCkqMMy1";
        return 0;
    }

    private AbstractC2363ae A06(int i10) {
        C2366ah c2366ahA0N = new C2366ah(super.A04, super.A05, super.A09, super.A02, this.A0L, super.A0B, super.A07).A0K(super.A08.getToolbarHeight()).A0R(super.A08).A0J(i10).A0L(this.A0H).A0T(this.A0T).A0Q(this.A02).A0N(super.A06);
        if (super.A02.A20().A0S() && U7.A1Y(super.A04) && super.A02.A20().A0L() != null) {
            c2366ahA0N.A0P(getPackageInstallListener());
        }
        c2366ahA0N.A0M(MI.A00(super.A04, super.A05, A0A(0, 0, 98), WQ.A00(super.A02.A20().A0J().A05()), new HashMap(), super.A02.A21()));
        return AbstractC2364af.A00(c2366ahA0N.A0W(), null, true);
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0U, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    private void A0B() {
        if (super.A02.A20().A0K().A03()) {
            return;
        }
        this.A02 = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 0, super.A02.A1t(), super.A02.A1j());
        this.A02.setFullscreen(true);
        this.A02.A0A(super.A02.A1z().A01(), KE.A05(super.A02));
        this.A02.setPageDetails(super.A02.A23(), super.A02.A25(), 0, super.A02.A24());
        this.A02.setPageDetailsVisible(false);
        this.A02.setToolbarListener(new C1799Fl(this));
        if (super.A02.A2K()) {
            this.A02.setOnClickListener(new ViewOnClickListenerC2482cZ(this));
        }
    }

    private void A0C() {
        this.A0L.postDelayed(new C1790Fc(this), U7.A0O(super.A04));
    }

    private void A0D() {
        this.A0L.postDelayed(new C1789Fb(this), U7.A0P(super.A04));
    }

    private void A0E() {
        this.A0C = true;
        super.A08.A07();
        if (this.A03 != null) {
            this.A03.A1E();
        }
    }

    private void A0F() {
        this.A0L.A0i(this.A0T);
        if (this.A0H instanceof InterfaceC2546dc) {
            this.A0L.A0i((InterfaceC2546dc) this.A0H);
        }
        if (!TextUtils.isEmpty(super.A02.A20().A0H().A08())) {
            C14812p c14812p = new C14812p(super.A04, A0j());
            this.A0L.A0i(c14812p);
            c14812p.setImage(super.A02.A20().A0H().A08());
        }
        if (!A0j()) {
            C2R c2r = new C2R(super.A04, true, super.A06);
            this.A0L.A0i(c2r);
            this.A0L.A0i(new D4(c2r, EnumC2560dr.A02, true));
        }
        this.A0L.A0i(new C2Y(super.A04));
    }

    public static void A0G() {
        A0U = new byte[]{23, 63, 41, 47, 63, 17, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 61, ExifInterface.START_CODE, 56, 46, 61, 43, ExifInterface.START_CODE, 43, 16, 57, 38, 43, ExifInterface.START_CODE, 32, 49, 41, 43, 50};
    }

    private void A0H(UZ uz) {
        new C2172Ua(super.A02.A25(), super.A04.A0A()).A04(uz, null);
        super.A09.A4b(super.A0A.A6d());
        this.A05.A05();
        if (this.A03 instanceof C15475d) {
            ((C15475d) this.A03).A1Y();
        }
        if (super.A02.A1i()) {
            return;
        }
        this.A0G.postDelayed(new RunnableC2484cb(this), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(UZ uz) {
        if (this.A07) {
            A0H(uz);
        } else {
            this.A09 = true;
            this.A01 = uz;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(C14953d c14953d, boolean z10, boolean z11) {
        if (this.A04 != null) {
            if (z10) {
                super.A04.A0F().ADu();
            }
            super.A04.A0F().ADr();
            this.A04.AHo();
            return;
        }
        if (this.A0D) {
            return;
        }
        if (!z10 && this.A08 && this.A0B) {
            this.A00++;
            this.A0L.A0h(EnumC2545db.A02, 20);
            return;
        }
        if (!this.A0C) {
            A0E();
        }
        if (z10 || this.A00 >= super.A02.A20().A0G()) {
            this.A0D = true;
            if (this.A03 != null) {
                this.A03.A1H(c14953d);
            }
        } else {
            this.A0L.A0h(EnumC2545db.A02, 32);
        }
        if (this.A00 == 0) {
            A0S(z10, z11);
        }
        this.A00++;
        String[] strArr = A0V;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[0] = "";
        strArr2[1] = "mBWwcFSbVIKH";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(C3Q c3q) {
        if (this.A0L.getState() == EnumC2599eU.A02 && U7.A1Z(super.A04)) {
            this.A0L.postDelayed(new FZ(this, c3q), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(C3Q c3q) {
        int iA00 = c3q.A00();
        int iA02 = super.A02.A20().A0H().A02();
        int iA01 = A01(iA00, iA02, super.A02.A20().A0H().A05());
        if (iA02 >= 0 && iA01 <= 0 && !super.A01 && this.A03 != null && this.A03.A1L()) {
            super.A01 = true;
            super.A08.setToolbarActionMode(8);
        }
        if (this.A08) {
            int iA012 = A01(iA00, super.A02.A20().A0H().A03(), super.A02.A20().A0H().A05());
            AbstractC2804hy abstractC2804hy = super.A02;
            if (A0V[6].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[0] = "";
            strArr[1] = "CRWrhlQnYLwh";
            if (!KE.A05(abstractC2804hy)) {
                boolean zA1l = super.A02.A1l();
                String strA0A = A0A(0, 0, 98);
                if (zA1l || super.A02.A1j() || super.A02.A1Z() || iA012 <= 0) {
                    super.A08.setToolbarActionMessage(strA0A);
                } else {
                    super.A08.setToolbarActionMessage(super.A02.A24().A02().replace(A0A(0, 6, 50), String.valueOf(iA012)));
                }
            }
            if (iA012 <= 0) {
                A0T(false, false);
            }
        }
        float fA00 = A00();
        float duration = iA00;
        if (this.A0B) {
            duration += this.A0L.getDuration() * this.A00;
        }
        float f10 = (!super.A02.A1e() || fA00 > 0.0f) ? duration / fA00 : 1.0f;
        boolean zA1j = super.A02.A1j();
        if (A0V[5].charAt(8) != 'f') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[7] = "BY5kACpHY7KFfLoLkWPFyXHXe8tQ4ZYS";
        strArr2[2] = "FXqF0wWRYQoNHbRw7kiC8WRpThpP8Fmr";
        if (zA1j) {
            int i10 = fA00 - duration > 0.0f ? ((int) (fA00 - duration)) / 1000 : 0;
            AbstractC2259Xm abstractC2259Xm = super.A08;
            String[] strArr3 = A0V;
            if (strArr3[7].charAt(8) != strArr3[2].charAt(8)) {
                abstractC2259Xm.A09(100.0f * f10, i10);
            } else {
                A0V[3] = "ksHgyK5pJeiIhpnbSmOLRLGEWkwS8h7S";
                abstractC2259Xm.A09(100.0f * f10, i10);
            }
        } else {
            super.A08.setProgress(100.0f * f10);
        }
        if (f10 < 1.0f || this.A0C) {
            return;
        }
        A0E();
        super.A08.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(String str) {
        int currentPositionInMillis = 0;
        int duration = 0;
        if (this.A0L != null) {
            currentPositionInMillis = this.A0L.getCurrentPositionInMillis();
            duration = this.A0L.getDuration();
            this.A0L.A0e(3);
        }
        super.A04.A0F().A3S(str);
        if (U7.A1a(super.A04)) {
            A0O(new C14953d(currentPositionInMillis, duration), false, true);
        } else {
            super.A09.A4b(super.A0A.A7t());
            super.A09.A4b(super.A0A.A7o());
        }
    }

    private void A0S(boolean z10, boolean z11) {
        super.A08.setToolbarActionMessage(A0A(0, 0, 98));
        A0T(z10, z11);
        super.A08.setToolbarActionMode(getCloseButtonStyle());
    }

    private synchronized void A0T(boolean z10, boolean z11) {
        if (this.A04 != null) {
            this.A08 = false;
            return;
        }
        if (this.A08 && !z10 && !z11) {
            super.A09.A4b(super.A0A.A6d());
            this.A05.A05();
            this.A08 = false;
            if (this.A03 != null) {
                this.A03.A1C();
            }
            return;
        }
        this.A08 = false;
    }

    private int getCloseButtonStyle() {
        if (this.A03 != null) {
            return this.A03.getCloseButtonStyle();
        }
        return 0;
    }

    private InterfaceC2242Wv getPackageInstallListener() {
        return new FP(this);
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final AbstractC2259Xm A0b() {
        AbstractC2259Xm c2011Nr;
        if (A0j()) {
            c2011Nr = new C2011Nr(super.A04, super.A09, super.A06, 1);
            A0B();
            if (super.A02.A2K()) {
                c2011Nr.setOnTouchListener(new ViewOnTouchListenerC2486cd(this));
            }
        } else {
            c2011Nr = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 1, super.A02.A1t(), super.A02.A1j());
        }
        if (super.A02.A2K()) {
            c2011Nr.setOnClickListener(new ViewOnClickListenerC2481cY(this));
        }
        return c2011Nr;
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0e() {
        if (this.A03 == null) {
            super.A06.A04(UZ.A0Z, null);
            return;
        }
        super.A06.A04(UZ.A0Y, null);
        ME meA1A = this.A03.A1A(A0A(32, 4, 60));
        if (super.A02.A2D() || meA1A == ME.A09 || meA1A == ME.A06) {
            return;
        }
        A0d();
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0f() {
        XP.A0J(this.A03);
        this.A0L.setVisibility(4);
        if (super.A02.A1f()) {
            return;
        }
        A0k();
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final void A0h(R0 r02) {
        FrameLayout.LayoutParams layoutParams;
        r02.A0A(this.A0I);
        this.A03 = A06(r02.A05().getResources().getConfiguration().orientation);
        this.A03.setAccidentalClickCappingListener(new MF() { // from class: com.facebook.ads.redexgen.X.Fq
            @Override // com.facebook.ads.redexgen.core.MF
            public final void ACB() {
                this.A00.A0l();
            }
        });
        addView(this.A03, G2.A0E);
        boolean z10 = false;
        if (A0j()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(G2.A0G, G2.A0F, 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, super.A08.getToolbarHeight());
        }
        addView(super.A08, layoutParams);
        if (this.A02 != null) {
            addView(this.A02, new FrameLayout.LayoutParams(-1, this.A02.getToolbarHeight()));
            XP.A0F(this.A02);
        }
        XP.A0F(this.A03);
        XP.A0F(super.A08);
        if (super.A02.A1f() && (this.A03 instanceof C15475d)) {
            ((C15475d) this.A03).setVideoAdViewListener(this.A0J);
        }
        AbstractC2363ae abstractC2363ae = this.A03;
        if (A0V[6].length() == 22) {
            throw new RuntimeException();
        }
        A0V[5] = "wo0V9GMefx8z7FmkoRuQRU6XLmQOOAjz";
        if (abstractC2363ae != null && this.A03.A1M()) {
            z10 = true;
        }
        setUpFullscreenMode(z10);
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final boolean A0i() {
        if (this.A03 != null) {
            boolean zA1N = this.A03.A1N(this.A08);
            String[] strArr = A0V;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0V[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (zA1N) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.G2
    public final boolean A0j() {
        return super.A02.A1m() || super.A02.A1o();
    }

    public final void A0k() {
        this.A0L.setVisibility(0);
        XP.A0J(super.A08);
        this.A0L.setVolume(super.A02.A20().A0H().A0A() ? 0.0f : 1.0f);
        if (A0j()) {
            AbstractC2363ae abstractC2363ae = this.A03;
            if (A0V[3].charAt(17) == 'M') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[7] = "EZroGEyqYXPxT1OpX1Zo9PGFXXX4LGG2";
            strArr[2] = "A8BrNBzgYOoIkIhiYkC2R6mbpOJkqkYa";
            if (abstractC2363ae instanceof C15475d) {
                ((C15475d) this.A03).A1Z(getResources().getConfiguration().orientation);
                ((C15475d) this.A03).A1X();
            }
        }
        this.A0L.A0h(EnumC2545db.A02, 20);
        if (this.A03 != null && this.A08) {
            this.A03.A1D();
        }
        if (this.A03 != null && !this.A0C) {
            this.A03.A1F();
        }
        A0C();
    }

    public final /* synthetic */ void A0l() {
        A0d();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void AEV(boolean z10) {
        this.A07 = false;
        if (this.A0L.getVisibility() == 0 && !this.A0L.A0q()) {
            this.A06 = this.A0L.getVideoStartReason();
            this.A0A = z10;
            this.A0L.A0l(false, 13);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void AF0(boolean z10) {
        this.A07 = true;
        if (this.A09) {
            this.A09 = false;
            A0H(this.A01);
        }
        if (this.A0L.getVisibility() != 0 || this.A0L.A0r() || this.A0D || this.A0L.getState() == EnumC2599eU.A06 || this.A06 == null) {
            return;
        }
        if (!this.A0A || z10) {
            this.A0L.A0h(this.A06, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.core.G2, com.facebook.ads.redexgen.core.InterfaceC2261Xo
    public final void onDestroy() {
        super.onDestroy();
        if (U7.A1u(super.A04)) {
            super.A04.A0B().AJj(this.A0L);
        }
        if (this.A03 != null) {
            this.A03.A1B();
        }
        if (this.A0L != null) {
            if (!this.A0D) {
                this.A0L.A0g(EnumC2537dT.A05);
            }
            this.A0L.getEventBus().A04(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
            this.A0L.A0Z();
        }
        if (this.A0K != null) {
            this.A0K.A07();
        }
        C15003i c15003i = this.A0M;
        if (A0V[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0V[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c15003i.A0p();
        this.A0G.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(C2526dI c2526dI) {
        this.A05 = c2526dI;
    }

    public void setVideoLeadingPlayableAdListener(InterfaceC2488cf interfaceC2488cf) {
        this.A04 = interfaceC2488cf;
    }
}
