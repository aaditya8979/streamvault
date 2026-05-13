package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.i7;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes.dex */
public class MaxDebuggerUnifiedFlowActivity extends i7 {
    @Override // com.applovin.impl.i7, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }
}
