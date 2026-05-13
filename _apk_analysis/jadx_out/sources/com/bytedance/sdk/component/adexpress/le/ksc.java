package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.vt.bly;
import com.bytedance.adsdk.vt.le;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ksc extends LinearLayout {
    private LinearLayout fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.adsdk.vt.le f12363le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private TextView f12364lh;
    private TextView ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.tlj f12365ra;
    private com.bytedance.sdk.component.utils.ex vt;
    private ouw yu;

    public interface ouw {
    }

    public ksc(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar) {
        super(context);
        this.f12365ra = tljVar;
        setClipChildren(false);
        addView(view);
        this.fkw = (LinearLayout) findViewById(2097610722);
        this.ouw = (TextView) findViewById(2097610719);
        this.f12364lh = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.vt.le leVar = (com.bytedance.adsdk.vt.le) findViewById(2097610706);
        this.f12363le = leVar;
        leVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.f12363le.setImageAssetsFolder("images/");
        this.f12363le.ouw(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final TextView getTopTextView() {
        return this.ouw;
    }

    public final LinearLayout getWriggleLayout() {
        return this.fkw;
    }

    public final View getWriggleProgressIv() {
        return this.f12363le;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.vt == null) {
                getContext().getApplicationContext();
                this.vt = new com.bytedance.sdk.component.utils.ex();
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.le.ksc.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.vt.le leVar = this.f12363le;
            if (leVar != null) {
                leVar.vt.add(le.yu.PLAY_OPTION);
                com.bytedance.adsdk.vt.bly blyVar = leVar.ouw;
                blyVar.f11932ra.clear();
                blyVar.vt.cancel();
                if (blyVar.isVisible()) {
                    return;
                }
                blyVar.f11928le = bly.vt.NONE;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
    }

    public final void setOnShakeViewListener(ouw ouwVar) {
        this.yu = ouwVar;
    }

    public final void setShakeText(String str) {
        this.f12364lh.setText(str);
    }
}
