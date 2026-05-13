package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public final class jg extends le {
    public jg(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        ImageView imageView = new ImageView(context);
        this.f12215ko = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            this.pno = Math.max(dynamicRootView.getLogoUnionHeight(), this.pno);
        }
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
            ((ImageView) this.f12215ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        DynamicRootView dynamicRootView = this.f12214jg;
        if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || TextUtils.isEmpty(this.f12214jg.getRenderRequest().ksc)) {
            setVisibility(8);
        } else {
            String str = this.f12214jg.getRenderRequest().ksc;
            if (str.equals("logo")) {
                ((ImageView) this.f12215ko).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_ad_logo"));
            } else {
                com.bytedance.sdk.component.fkw.tlj tljVarFkw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu.ouw(str).ouw(this.f12218ra).vt(this.pno).yu(this.f12218ra).fkw(this.pno);
                String str2 = this.f12214jg.getRenderRequest().tlj;
                if (!TextUtils.isEmpty(str2)) {
                    tljVarFkw.vt(str2);
                }
                tljVarFkw.ouw((ImageView) this.f12215ko);
            }
        }
        ((ImageView) this.f12215ko).setColorFilter(this.ryl.le(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
