package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.o1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class MaxCreativeDebuggerDisplayedAdActivity extends o1 {
    @Override // com.applovin.impl.o1, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53127a, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }
}
