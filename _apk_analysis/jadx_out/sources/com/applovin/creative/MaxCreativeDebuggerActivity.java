package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.c1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class MaxCreativeDebuggerActivity extends c1 {
    @Override // com.applovin.impl.c1, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }
}
