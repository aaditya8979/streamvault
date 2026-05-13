package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class tc extends le {
    public tc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.pno += 6;
        if (this.ryl.yu.f12313vh) {
            int iLe = this.ryl.le();
            com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
            com.bytedance.sdk.component.adexpress.le.ouw ouwVar = new com.bytedance.sdk.component.adexpress.le.ouw(context, iLe, raVar.yu.pno, raVar.ra());
            this.f12215ko = ouwVar;
            ouwVar.setMaxLines(1);
        } else {
            TextView textView = new TextView(context);
            this.f12215ko = textView;
            textView.setIncludeFontPadding(false);
        }
        this.f12215ko.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12215ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final String getText() {
        String strFkw = this.ryl.fkw();
        if (TextUtils.isEmpty(strFkw)) {
            if (!com.bytedance.sdk.component.adexpress.yu.vt() && TextUtils.equals(this.mwh.bly.ouw, "text_star")) {
                strFkw = CampaignEx.CLICKMODE_ON;
            }
            if (!com.bytedance.sdk.component.adexpress.yu.vt() && TextUtils.equals(this.mwh.bly.ouw, "score-count")) {
                strFkw = "6870";
            }
        }
        return (TextUtils.equals(this.mwh.bly.ouw, "title") || TextUtils.equals(this.mwh.bly.ouw, "subtitle")) ? strFkw.replace("\n", "") : strFkw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x04ca  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ra() {
        /*
            Method dump skipped, instruction units count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.tc.ra():boolean");
    }
}
