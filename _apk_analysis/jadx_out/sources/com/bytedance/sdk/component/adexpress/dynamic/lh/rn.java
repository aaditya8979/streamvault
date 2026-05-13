package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.zin;

/* JADX INFO: loaded from: classes12.dex */
public final class rn implements ra {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw f12264lh;
    private zin ouw;
    private Context vt;
    private com.bytedance.sdk.component.adexpress.dynamic.yu.ra yu;

    public rn(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        this.vt = context;
        this.f12264lh = fkwVar;
        this.yu = raVar;
        this.ouw = new zin(this.vt);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, 120.0f));
        layoutParams.gravity = 17;
        this.ouw.setLayoutParams(layoutParams);
        this.ouw.setClipChildren(false);
        this.ouw.setGuideText(this.yu.yu.f12315vm);
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar2 = this.f12264lh;
        if (fkwVar2 != null) {
            this.ouw.setOnClickListener((View.OnClickListener) fkwVar2.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        zin zinVar = this.ouw;
        if (zinVar != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(zinVar.ouw, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(zinVar.vt, "scaleX", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(zinVar.vt, "scaleY", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(zinVar.f12416lh, "alpha", 0.0f, 1.0f);
            zinVar.f12415le.setDuration(300L);
            zinVar.f12415le.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(zinVar.ouw, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.yu.ra.ouw(zinVar.getContext(), 90.0f));
            objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(zinVar.getContext(), 90.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.le.zin.2
                public AnonymousClass2() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zin.this.f12416lh.getLayoutParams();
                    layoutParams.width = num.intValue();
                    zin.this.f12416lh.setLayoutParams(layoutParams);
                }
            });
            valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(zinVar.vt, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.yu.ra.ouw(zinVar.getContext(), 90.0f));
            objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
            zinVar.f12417ra.setDuration(1500L);
            zinVar.f12417ra.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(zinVar.ouw, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(zinVar.f12416lh, "alpha", 1.0f, 0.0f);
            ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(zinVar.vt, "alpha", 1.0f, 0.0f);
            zinVar.fkw.setDuration(50L);
            zinVar.fkw.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
            zinVar.yu.playSequentially(zinVar.f12415le, zinVar.f12417ra, zinVar.fkw);
            zinVar.yu.start();
            zinVar.yu.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.le.zin.3

                /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.le.zin$3$1 */
                public class AnonymousClass1 implements Runnable {
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zin.this.yu.start();
                    }
                }

                public AnonymousClass3() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    zin.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.le.zin.3.1
                        public AnonymousClass1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zin.this.yu.start();
                        }
                    }, 200L);
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        zin zinVar = this.ouw;
        if (zinVar != null) {
            try {
                AnimatorSet animatorSet = zinVar.yu;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = zinVar.f12415le;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                AnimatorSet animatorSet3 = zinVar.f12417ra;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                AnimatorSet animatorSet4 = zinVar.fkw;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
