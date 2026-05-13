package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public final class pno extends Button {
    public pno(Context context) {
        super(context);
        setId(com.bytedance.sdk.openadsdk.utils.rn.f14344gh);
        Context context2 = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, osn.ouw(context2, 48.0f)));
        setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context2, "tt_browser_download_selector"));
        setText(vpp.ouw(context2, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
