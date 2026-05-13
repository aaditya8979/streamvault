package com.bytedance.sdk.openadsdk.lh;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes12.dex */
public final class ra extends LinearLayout {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final tlj f14174lh;
    private final FilterWord ouw;
    private pno vt;

    public ra(Context context, FilterWord filterWord, tlj tljVar) {
        super(context);
        setOrientation(1);
        this.ouw = filterWord;
        this.f14174lh = tljVar;
        String name = filterWord.getName();
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = osn.ouw(getContext(), 12.0f);
        layoutParams.gravity = 17;
        pnoVar.setGravity(17);
        pnoVar.setText(name);
        pnoVar.setTextColor(Color.argb(85, 22, 24, 35));
        pnoVar.setTextSize(tljVar.fkw() ? 14 : 10);
        addView(pnoVar, layoutParams);
        this.vt = new pno(getContext(), tljVar);
        new LinearLayout.LayoutParams(-1, -2);
        this.vt.ouw(filterWord.getOptions());
        addView(this.vt);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
