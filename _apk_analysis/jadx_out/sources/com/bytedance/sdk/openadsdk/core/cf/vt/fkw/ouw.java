package com.bytedance.sdk.openadsdk.core.cf.vt.fkw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public class ouw extends com.bytedance.adsdk.ugeno.bly.vt.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.bly.vt.ouw f13555lh;
    private final com.bytedance.adsdk.ugeno.bly.vt.ouw vt;

    public ouw(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.vt = ouwVar;
        addView(ouwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar2 = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.f13555lh = ouwVar2;
        ouwVar2.setBackgroundColor(0);
        addView(ouwVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.bly.vt.ouw getMarkView() {
        return this.f13555lh;
    }

    public com.bytedance.adsdk.ugeno.bly.vt.ouw getVideoView() {
        return this.vt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.ugeno.bly.vt.ouw, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f13555lh.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f13555lh.setOnTouchListener(onTouchListener);
    }
}
