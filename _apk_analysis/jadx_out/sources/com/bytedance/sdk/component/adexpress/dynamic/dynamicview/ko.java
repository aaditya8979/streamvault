package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ko extends le {
    public String ouw;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.pno vt;

    public ko(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, String str) {
        super(context, dynamicRootView, pnoVar);
        this.ouw = str;
        this.vt = pnoVar;
        com.bytedance.sdk.component.adexpress.le.tlj lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.le.tlj getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar == null || pnoVar.bly == null || this.f12213cf == null || TextUtils.isEmpty(this.ouw)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.mwh.bly.f12282lh;
        String str = leVar != null ? leVar.f12316wp : "";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = this.ouw + "static/lotties/" + str + ".json";
        com.bytedance.sdk.component.adexpress.le.tlj tljVar = new com.bytedance.sdk.component.adexpress.le.tlj(this.f12213cf);
        tljVar.setImageLottieTosPath(str2);
        tljVar.yu();
        return tljVar;
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
}
