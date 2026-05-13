package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ex extends le {
    private int ouw;

    public ex(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.ouw = 0;
        com.bytedance.sdk.component.adexpress.le.ex exVar = new com.bytedance.sdk.component.adexpress.le.ex(context, null);
        this.f12215ko = exVar;
        exVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12215ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f12218ra, this.pno);
        layoutParams.topMargin = this.tlj;
        int i10 = this.bly + this.ouw;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public final FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iOuw = (int) ((com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu.pno) * 5.0f) + com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.lh() + com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.ryl.yu())));
        if (this.f12218ra > iOuw && 4 == this.ryl.ra()) {
            this.ouw = (this.f12218ra - iOuw) / 2;
        }
        this.f12218ra = iOuw;
        return new FrameLayout.LayoutParams(this.f12218ra, this.pno);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        DynamicRootView dynamicRootView;
        super.ra();
        double dTlj = this.ryl.tlj();
        if (com.bytedance.sdk.component.adexpress.yu.vt() && (dTlj < 0.0d || dTlj > 5.0d || ((dynamicRootView = this.f12214jg) != null && dynamicRootView.getRenderRequest() != null && this.f12214jg.getRenderRequest().f12453le != 4))) {
            this.f12215ko.setVisibility(8);
            return true;
        }
        if (dTlj < 0.0d || dTlj > 5.0d) {
            dTlj = 5.0d;
        }
        this.f12215ko.setVisibility(0);
        com.bytedance.sdk.component.adexpress.le.ex exVar = (com.bytedance.sdk.component.adexpress.le.ex) this.f12215ko;
        int iLe = this.ryl.le();
        int i10 = (int) this.ryl.yu.pno;
        int iOuw = ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f12213cf, r5.vt())) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f12213cf, this.ryl.ouw())) + ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f12213cf, this.ryl.yu.pno));
        float f10 = i10;
        exVar.ouw = (int) com.bytedance.sdk.component.adexpress.yu.ra.lh(exVar.getContext(), f10);
        exVar.vt = (int) com.bytedance.sdk.component.adexpress.yu.ra.lh(exVar.getContext(), f10);
        exVar.f12357lh = dTlj;
        exVar.yu = iOuw;
        exVar.removeAllViews();
        for (int i11 = 0; i11 < 5; i11++) {
            ImageView starImageView = exVar.getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(iLe, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(exVar.getStarFillDrawable());
            exVar.f12356le.addView(starImageView);
        }
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView2 = exVar.getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(exVar.getStarEmptyDrawable());
            exVar.fkw.addView(starImageView2);
        }
        exVar.addView(exVar.fkw);
        exVar.addView(exVar.f12356le);
        exVar.requestLayout();
        return true;
    }
}
