package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes.dex */
public class bly extends le {
    public bly(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            this.f12215ko = new ImageView(context);
        } else {
            this.f12215ko = new com.bytedance.sdk.component.adexpress.le.bly(context);
        }
        this.f12215ko.setTag(3);
        addView(this.f12215ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
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
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            Drawable drawableOuw = com.bytedance.sdk.component.adexpress.yu.lh.ouw(getContext(), this.ryl);
            if (drawableOuw != null) {
                this.f12215ko.setBackground(drawableOuw);
            }
            int iYu = com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_close_btn");
            if (iYu > 0) {
                ((ImageView) this.f12215ko).setImageResource(iYu);
            }
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f12213cf, this.ryl.yu.vt);
        View view = this.f12215ko;
        if (view instanceof com.bytedance.sdk.component.adexpress.le.bly) {
            ((com.bytedance.sdk.component.adexpress.le.bly) view).setRadius((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f12213cf, this.ryl.yu.ouw));
            ((com.bytedance.sdk.component.adexpress.le.bly) this.f12215ko).setStrokeWidth(iOuw);
            ((com.bytedance.sdk.component.adexpress.le.bly) this.f12215ko).setStrokeColor(this.ryl.cf());
            ((com.bytedance.sdk.component.adexpress.le.bly) this.f12215ko).setBgColor(this.ryl.mwh());
            ((com.bytedance.sdk.component.adexpress.le.bly) this.f12215ko).setDislikeColor(this.ryl.le());
            ((com.bytedance.sdk.component.adexpress.le.bly) this.f12215ko).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f12213cf, 1.0f));
        }
        return true;
    }
}
