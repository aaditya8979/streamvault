package com.applovin.impl.adview;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes7.dex */
public class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f7766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7767b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f7766a = eVarA;
        addView(eVarA);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f7767b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f7766a.setLayoutParams(layoutParams2);
        this.f7766a.a(i10);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f7766a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f7766a.getLayoutParams();
        removeView(this.f7766a);
        e eVarA = e.a(aVar, getContext());
        this.f7766a = eVarA;
        addView(eVarA);
        this.f7766a.setLayoutParams(layoutParams);
        this.f7766a.a(this.f7767b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53127a, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
