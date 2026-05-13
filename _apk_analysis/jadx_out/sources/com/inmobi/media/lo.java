package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class lo extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27588a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f27588a = true;
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53135i, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
