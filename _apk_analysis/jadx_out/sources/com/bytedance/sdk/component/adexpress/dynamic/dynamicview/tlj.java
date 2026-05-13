package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public final class tlj extends le {
    public tlj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            ImageView imageView = new ImageView(context);
            this.f12215ko = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f12218ra = this.pno;
        } else {
            this.f12215ko = new TextView(context);
        }
        this.f12215ko.setTag(3);
        addView(this.f12215ko, getWidgetLayoutParams());
        if (dynamicRootView.getRenderRequest() != null) {
            if (dynamicRootView.getRenderRequest().yu && dynamicRootView.getRenderRequest().f12459tc) {
                return;
            }
            this.f12215ko.setVisibility(8);
            setVisibility(8);
        }
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
                ((ImageView) this.f12215ko).setBackground(drawableOuw);
            }
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int iYu = com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_reward_full_feedback");
            if (iYu > 0) {
                ((ImageView) this.f12215ko).setImageResource(iYu);
            }
        }
        return true;
    }
}
