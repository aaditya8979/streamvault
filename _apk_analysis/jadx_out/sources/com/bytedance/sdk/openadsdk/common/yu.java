package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public final class yu extends mwh {
    public yu(@NonNull Context context) {
        super(context);
        this.vt = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.mwh, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.openadsdk.common.mwh, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.mwh
    public final void ouw() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.yu.1
            @Override // java.lang.Runnable
            public final void run() {
                yu yuVar = yu.this;
                if (yuVar.ouw != null) {
                    yuVar.setVisibility(0);
                }
            }
        });
    }

    public final void ouw(vpp vppVar, String str, int i10, String str2, long j10, boolean z10, int i11, long j11) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar, str, i10, str2, SystemClock.elapsedRealtime() - j10, z10, i11, j11);
            super.vt();
        }
    }
}
