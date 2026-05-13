package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public final class tlj extends ra {
    public long ouw;
    public long vt;

    public tlj(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ra, com.bytedance.sdk.openadsdk.core.le.ra, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final long getDisplayDuration() {
        if (this.ouw == 0) {
            return 0L;
        }
        if (this.vt == 0) {
            this.vt = SystemClock.elapsedRealtime();
        }
        return this.vt - this.ouw;
    }

    public final void lh() {
        setVisibility(8);
        if (this.ouw != 0) {
            this.vt = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.widget.ra, com.bytedance.sdk.openadsdk.core.le.ra, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ra
    public final boolean ouw() {
        return false;
    }
}
