package com.bytedance.adsdk.ugeno.ouw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw extends AnimatorListenerAdapter {
    private com.bytedance.adsdk.ugeno.ouw.ouw.ouw bly;
    private lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Context f11744le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public vt f11745lh;
    public ValueAnimator ouw;
    private int pno = 1;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f11746ra;
    public String vt;
    private com.bytedance.adsdk.ugeno.vt.lh yu;

    public ouw(Context context, com.bytedance.adsdk.ugeno.vt.lh lhVar, lh lhVar2) {
        this.yu = lhVar;
        this.fkw = lhVar2;
        this.f11744le = context;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.ValueAnimator lh() {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.ouw.ouw.lh():android.animation.ValueAnimator");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        vt vtVar = this.f11745lh;
        if (vtVar != null) {
            vtVar.vt();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        vt vtVar = this.f11745lh;
        if (vtVar != null) {
            vtVar.ouw();
        }
    }

    public final void ouw() {
        ValueAnimator valueAnimator = this.ouw;
        if (valueAnimator == null || this.pno == 0 || this.f11746ra == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public final void ouw(int i10, int i11) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ouw(i10, i11);
        }
    }

    public final void ouw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.ouw(canvas);
        }
    }

    public final void vt() {
        ValueAnimator valueAnimator = this.ouw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void vt(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ouw.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.vt(canvas);
        }
    }
}
