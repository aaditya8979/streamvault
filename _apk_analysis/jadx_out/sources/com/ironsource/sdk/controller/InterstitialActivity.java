package com.ironsource.sdk.controller;

import android.os.Bundle;
import android.view.MotionEvent;
import com.ironsource.C3978d4;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes3.dex */
public class InterstitialActivity extends ControllerActivity {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f33562s = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f53132f, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f33562s, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f33562s, C3978d4.i.f31364t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f33562s, C3978d4.i.f31366u0);
    }
}
