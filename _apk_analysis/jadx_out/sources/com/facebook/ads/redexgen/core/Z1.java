package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Z1 extends ViewGroup {
    public static String[] A01 = {"NZkFYUXBqTyLE0uJAv5x9NXUc2VI7sJS", "uR57PzkU", "rJSYxMTue9BrtOECqhcg2GfuYah", "YyZf9NPrzEzMWmx1W7C7iqaeo0zUpAtl", "DTiQjOeLHS2Pt5vxV6oLe4amAnidYBVC", "lHnCa3run773rLwZ2hjgCXNXpXLX76yu", "KbQZcAmLw4PS1PAelm", "IRe5OrXcLx0wSVTSjdWVVTt7WICaTRCE"};
    public static final int A02 = (int) (AbstractC2232Wl.A02 * 8.0f);
    public int A00;

    public Z1(C2529dL c2529dL) {
        super(c2529dL);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i16 = paddingLeft + measuredWidth;
            if (A01[4].charAt(29) != 'B') {
                throw new RuntimeException();
            }
            A01[4] = "OfxBdDbwWwaKkhkWo9ENaAyC2bgPxB1w";
            if (i16 > i14) {
                paddingLeft = getPaddingLeft();
                paddingTop += this.A00;
            }
            childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
            paddingLeft += A02 + measuredWidth;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int iMax = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        int i12 = getChildCount() > 0 ? 1 : 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = childAt.getMeasuredWidth();
            iMax = Math.max(iMax, childAt.getMeasuredHeight() + A02);
            if (paddingLeft + measuredWidth > size) {
                i12++;
                paddingLeft = getPaddingLeft();
            }
            int i14 = A02 + measuredWidth;
            String[] strArr = A01;
            if (strArr[5].charAt(28) != strArr[0].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "n9Mm7W7nMoMcqU3dmLdt8wDmLs9m7g2q";
            strArr2[0] = "514SZhPsQ7DKXYFFbCEhDr5q0ZnH7KeP";
            paddingLeft += i14;
        }
        this.A00 = iMax;
        setMeasuredDimension(size, (this.A00 * i12) + A02);
    }
}
