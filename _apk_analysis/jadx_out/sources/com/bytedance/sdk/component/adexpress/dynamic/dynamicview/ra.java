package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class ra extends le {
    public ra(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.ouw ouwVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ouw(context);
        this.f12215ko = ouwVar;
        ouwVar.setTag(Integer.valueOf(getClickArea()));
        addView(this.f12215ko, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.yu.vt() || !"fillButton".equals(this.mwh.bly.ouw)) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.f12215ko).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.f12215ko).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        int i10 = widgetLayoutParams.width;
        int i11 = this.ryl.yu.f12290gh;
        widgetLayoutParams.width = i10 - (i11 * 2);
        widgetLayoutParams.height -= i11 * 2;
        widgetLayoutParams.topMargin += i11;
        int i12 = widgetLayoutParams.leftMargin + i11;
        widgetLayoutParams.leftMargin = i12;
        widgetLayoutParams.setMarginStart(i12);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
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
    public boolean ra() {
        super.ra();
        if (TextUtils.equals("download-progress-button", this.mwh.bly.ouw) && TextUtils.isEmpty(this.ryl.pno())) {
            this.f12215ko.setVisibility(4);
            return true;
        }
        this.f12215ko.setTextAlignment(this.ryl.ra());
        ((TextView) this.f12215ko).setText(this.ryl.pno());
        ((TextView) this.f12215ko).setTextColor(this.ryl.le());
        ((TextView) this.f12215ko).setTextSize(this.ryl.yu.pno);
        ((TextView) this.f12215ko).setGravity(17);
        ((TextView) this.f12215ko).setIncludeFontPadding(false);
        if ("fillButton".equals(this.mwh.bly.ouw)) {
            this.f12215ko.setPadding(0, 0, 0, 0);
        } else {
            this.f12215ko.setPadding(this.ryl.lh(), this.ryl.vt(), this.ryl.yu(), this.ryl.ouw());
        }
        return true;
    }
}
