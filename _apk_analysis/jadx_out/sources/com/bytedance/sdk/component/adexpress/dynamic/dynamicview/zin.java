package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class zin extends ra implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private int[] ouw;
    private int qbp;
    private int vt;

    public zin(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f12218ra, this.pno);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.f12215ko).getText())) {
            setMeasuredDimension(0, this.pno);
        } else {
            setMeasuredDimension(this.f12218ra, this.pno);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    @SuppressLint({"SetTextI18n"})
    public final void ouw(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String strOuw = com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.f12215ko.setVisibility(0);
            ((TextView) this.f12215ko).setText("| ".concat(String.valueOf(strOuw)));
            this.f12215ko.measure(-2, -2);
            this.ouw = new int[]{this.f12215ko.getMeasuredWidth() + 1, this.f12215ko.getMeasuredHeight()};
            View view = this.f12215ko;
            int[] iArr = this.ouw;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f12215ko).setGravity(17);
            ((TextView) this.f12215ko).setIncludeFontPadding(false);
            this.vt = ((this.pno - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f12213cf, this.ryl.yu.pno))) / 2) - this.ryl.ouw();
            this.qbp = 0;
            this.f12215ko.setPadding(this.ryl.lh(), this.vt, this.ryl.yu(), this.qbp);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ra, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        ((TextView) this.f12215ko).setText("");
        return true;
    }
}
