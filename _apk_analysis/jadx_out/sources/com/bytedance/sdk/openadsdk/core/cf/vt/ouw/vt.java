package com.bytedance.sdk.openadsdk.core.cf.vt.ouw;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.yu;
import com.bytedance.adsdk.vt.le;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class vt extends le {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public yu f13570lh;

    public vt(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.adsdk.vt.le, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.f13570lh;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // com.bytedance.adsdk.vt.le, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.f13570lh;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
