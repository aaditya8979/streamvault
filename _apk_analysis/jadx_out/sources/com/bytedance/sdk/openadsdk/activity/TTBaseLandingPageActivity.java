package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long ouw;
    private long vt;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(g.f53147u, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j10 = this.ouw;
        if (j10 > 0) {
            com.bytedance.sdk.openadsdk.utils.fkw.ouw(j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.vt > 0) {
            this.ouw += SystemClock.elapsedRealtime() - this.vt;
            this.vt = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        WeakReference<vpp> weakReference = com.bytedance.sdk.openadsdk.utils.fkw.ouw;
        boolean z10 = true;
        if (weakReference == null || weakReference.get() == null) {
            z10 = false;
        } else {
            com.bytedance.sdk.openadsdk.utils.fkw.f14316lh = true;
        }
        if (z10) {
            this.vt = SystemClock.elapsedRealtime();
        }
    }
}
