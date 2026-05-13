package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.ouw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class tlj {
    public Paint fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11663le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11664lh;
    public AnimatorSet ouw = new AnimatorSet();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ouw f11665ra;
    public View vt;
    public int yu;

    public tlj(View view, ouw ouwVar) {
        this.vt = view;
        this.f11665ra = ouwVar;
        Paint paint = new Paint();
        this.fkw = paint;
        paint.setAntiAlias(true);
    }

    public final void ouw() {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        List<ouw.C0176ouw> list = this.f11665ra.f11644lh;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (ouw.C0176ouw c0176ouw : list) {
            if (c0176ouw != null) {
                objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0176ouw.ouw);
                if (TextUtils.equals(c0176ouw.fkw, "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0176ouw.fkw, "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0176ouw.fkw);
                }
                objectAnimator.setStartDelay(c0176ouw.yu);
                objectAnimator.setTarget(this.vt);
                if (TextUtils.equals(c0176ouw.fkw, "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0176ouw.f11645le, (int) c0176ouw.f11647ra);
                    Log.d("UGenAnimation", "playAnimation: from = " + c0176ouw.f11645le + "; to=" + c0176ouw.f11647ra);
                } else {
                    objectAnimator.setFloatValues(c0176ouw.f11645le, c0176ouw.f11647ra);
                }
                int i10 = (int) this.f11665ra.vt;
                if (i10 != 0) {
                    objectAnimator.setRepeatCount(i10);
                } else {
                    objectAnimator.setRepeatCount((int) c0176ouw.vt);
                }
                if (TextUtils.equals(c0176ouw.fkw, "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String str = this.f11665ra.f11643le;
                if (TextUtils.isEmpty(str)) {
                    str = c0176ouw.f11646lh;
                }
                if (TextUtils.equals(str, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                float[] fArr = c0176ouw.pno;
                if (fArr != null && fArr.length > 0) {
                    objectAnimator.setFloatValues(fArr);
                }
                if (TextUtils.equals(c0176ouw.fkw, "rotationX")) {
                    this.vt.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.tlj.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            tlj.this.vt.setPivotX(r0.getWidth() / 2.0f);
                            tlj.this.vt.setPivotY(r0.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0176ouw.fkw, "ripple")) {
                    this.f11663le = c0176ouw.tlj;
                }
                String str2 = c0176ouw.bly;
                str2.hashCode();
                switch (str2) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        long j10 = this.f11665ra.yu;
        if (j10 != 0) {
            this.ouw.setDuration(j10);
        }
        this.ouw.setStartDelay(this.f11665ra.fkw);
        if (TextUtils.equals(this.f11665ra.ouw, "sequentially")) {
            this.ouw.playSequentially(arrayList);
        } else {
            this.ouw.playTogether(arrayList);
        }
        this.ouw.start();
    }
}
