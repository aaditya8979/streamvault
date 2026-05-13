package com.bytedance.sdk.openadsdk.component.reward.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class bly extends com.bytedance.sdk.openadsdk.core.le.lh {
    private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;

    public bly(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        super(ouwVar.hun);
        this.ouw = ouwVar;
        if (ouwVar.f13261gh != null || Build.VERSION.SDK_INT < 35) {
            return;
        }
        setFitsSystemWindows(true);
    }

    private static void ouw(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutPno;
        vtVar.ouw(this);
        if (this.ouw.ouw != 1 && (rFEndCardBackUpLayoutPno = vtVar.pno()) != null) {
            addView(rFEndCardBackUpLayoutPno, new FrameLayout.LayoutParams(-1, -1));
        }
        ouw(vtVar.bly(), this);
        ouw(vtVar.tlj(), this);
    }
}
