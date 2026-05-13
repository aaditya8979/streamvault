package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2490ch {
    public final int[] A00(View view, int i10, int i11) {
        QP qp2 = (QP) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), qp2.width), ViewGroup.getChildMeasureSpec(i11, view.getPaddingTop() + view.getPaddingBottom(), qp2.height));
        return new int[]{view.getMeasuredWidth() + qp2.leftMargin + qp2.rightMargin, view.getMeasuredHeight() + qp2.bottomMargin + qp2.topMargin};
    }
}
