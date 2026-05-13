package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.l0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class MaxDebuggerCmpNetworksListActivity extends l0 {
    @Override // com.applovin.impl.l0, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }
}
