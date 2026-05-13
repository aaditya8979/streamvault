package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C15776h extends AbstractC2690fy {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public Q8 A00;
    public Q8 A01;

    private int A00(QO qo2, View view, Q8 q82) {
        return (q82.A0F(view) + (q82.A0D(view) / 2)) - (qo2.A1V() ? q82.A0A() + (q82.A0B() / 2) : q82.A06() / 2);
    }

    private View A01(QO qo2, Q8 q82) {
        int iA0Y = qo2.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        int iA0A = qo2.A1V() ? q82.A0A() + (q82.A0B() / 2) : q82.A06() / 2;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iA0Y; i11++) {
            View viewA0v = qo2.A0v(i11);
            int iAbs = Math.abs((q82.A0F(viewA0v) + (q82.A0D(viewA0v) / 2)) - iA0A);
            if (iAbs < i10) {
                i10 = iAbs;
                String[] strArr = A02;
                if (strArr[0].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = viewA0v;
            }
        }
        return view;
    }

    private View A02(QO qo2, Q8 q82) {
        int iA0Y = qo2.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        int i10 = Integer.MAX_VALUE;
        if (A02[7].charAt(21) == '9') {
            throw new RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int i11 = 0; i11 < iA0Y; i11++) {
            View viewA0v = qo2.A0v(i11);
            int iA0F = q82.A0F(viewA0v);
            if (iA0F < i10) {
                i10 = iA0F;
                view = viewA0v;
            }
        }
        return view;
    }

    private Q8 A03(QO qo2) {
        if (this.A00 == null || this.A00.A02 != qo2) {
            this.A00 = Q8.A00(qo2);
        }
        return this.A00;
    }

    private Q8 A04(QO qo2) {
        if (this.A01 == null || this.A01.A02 != qo2) {
            this.A01 = Q8.A01(qo2);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.AbstractC2690fy
    public final int A0C(QO qo2, int i10, int i11) {
        int iA0r;
        PointF pointFA4y;
        int iA0b = qo2.A0b();
        if (iA0b == 0) {
            return -1;
        }
        View viewA02 = null;
        if (qo2.A23()) {
            viewA02 = A02(qo2, A04(qo2));
        } else if (qo2.A22()) {
            viewA02 = A02(qo2, A03(qo2));
        }
        if (viewA02 == null || (iA0r = qo2.A0r(viewA02)) == -1) {
            return -1;
        }
        boolean z10 = qo2.A22() ? i10 > 0 : i11 > 0;
        boolean z11 = false;
        if ((qo2 instanceof InterfaceC2070Qa) && (pointFA4y = ((InterfaceC2070Qa) qo2).A4y(iA0b - 1)) != null) {
            z11 = pointFA4y.x < 0.0f || pointFA4y.y < 0.0f;
        }
        return z11 ? z10 ? iA0r - 1 : iA0r : z10 ? iA0r + 1 : iA0r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2690fy
    public final View A0D(QO qo2) {
        if (qo2.A23()) {
            return A01(qo2, A04(qo2));
        }
        if (!qo2.A22()) {
            return null;
        }
        View viewA01 = A01(qo2, A03(qo2));
        if (A02[4].charAt(24) != 'v') {
            throw new RuntimeException();
        }
        A02[5] = "ku3zp";
        return viewA01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2690fy
    public final C2708gH A0E(QO qo2) {
        if (!(qo2 instanceof InterfaceC2070Qa)) {
            return null;
        }
        final Context context = super.A00.getContext();
        return new C2708gH(context) { // from class: com.facebook.ads.redexgen.X.6i
            @Override // com.facebook.ads.redexgen.core.C2708gH, com.facebook.ads.redexgen.core.AbstractC2071Qb
            public final void A0I(View view, C2073Qd c2073Qd, QZ qz) {
                int[] iArrA0H = this.A00.A0H(((AbstractC2690fy) this.A00).A00.getLayoutManager(), view);
                int i10 = iArrA0H[0];
                int i11 = iArrA0H[1];
                int iA0M = A0M(Math.max(Math.abs(i10), Math.abs(i11)));
                if (iA0M > 0) {
                    qz.A04(i10, i11, iA0M, ((C2708gH) this).A04);
                }
            }

            @Override // com.facebook.ads.redexgen.core.C2708gH
            public final float A0J(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // com.facebook.ads.redexgen.core.C2708gH
            public final int A0L(int i10) {
                return Math.min(100, super.A0L(i10));
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2690fy
    public final int[] A0H(QO qo2, View view) {
        int[] iArr = new int[2];
        if (qo2.A22()) {
            iArr[0] = A00(qo2, view, A03(qo2));
        } else {
            iArr[0] = 0;
        }
        if (qo2.A23()) {
            iArr[1] = A00(qo2, view, A04(qo2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
