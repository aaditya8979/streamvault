package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw extends tlj {
    private com.bytedance.sdk.openadsdk.core.le.pno pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.yu f14147ra;

    public fkw(Context context) {
        this(context, null);
    }

    private fkw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private fkw(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final com.bytedance.sdk.openadsdk.core.le.pno getTtBuDescTV() {
        return this.pno;
    }

    public final com.bytedance.sdk.openadsdk.core.le.yu getTtBuImg() {
        return this.f14147ra;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.ko.tlj, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final void ouw(Context context) {
        int iOuw = osn.ouw(context, 6.0f);
        setPadding(iOuw, iOuw, iOuw, iOuw);
        com.bytedance.sdk.openadsdk.core.le.lh lhVarFkw = tlj.fkw(context);
        this.ouw = lhVarFkw;
        lhVarFkw.setId(rn.lgp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iOuw2 = osn.ouw(context, 26.0f);
        layoutParams.topMargin = iOuw2;
        this.ouw.setLayoutParams(layoutParams);
        addView(this.ouw);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.f14147ra = yuVar;
        yuVar.setId(rn.eay);
        this.f14147ra.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iOuw2;
        this.f14147ra.setLayoutParams(layoutParams2);
        addView(this.f14147ra);
        View viewPno = tlj.pno(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iOuw3 = osn.ouw(context, 10.0f);
        layoutParams3.leftMargin = iOuw3;
        layoutParams3.topMargin = iOuw3;
        layoutParams3.bottomMargin = iOuw3;
        viewPno.setLayoutParams(layoutParams3);
        addView(viewPno);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        fkwVar.setOrientation(0);
        fkwVar.setGravity(17);
        addView(fkwVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.pno = pnoVar;
        pnoVar.setId(rn.wbf);
        this.pno.setEllipsize(TextUtils.TruncateAt.END);
        this.pno.setMaxLines(1);
        this.pno.setTextColor(-1);
        this.pno.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.pno.setLayoutParams(layoutParams4);
        fkwVar.addView(this.pno);
    }
}
