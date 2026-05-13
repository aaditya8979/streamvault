package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class tlj extends yu {
    public ouw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public float f12204le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private float f12205ra;

    public class ouw {
        public View ouw;

        public ouw(View view) {
            this.ouw = view;
        }
    }

    public tlj(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        int i10;
        String str;
        View view = this.yu;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw)) {
            this.yu = (View) this.yu.getParent();
        }
        this.yu.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "alpha", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        this.fkw = new ouw(this.yu);
        final int i11 = this.yu.getLayoutParams().height;
        this.f12204le = i11;
        this.f12205ra = this.yu.getLayoutParams().width;
        if ("left".equals(this.vt.qbp) || "right".equals(this.vt.qbp)) {
            i10 = (int) this.f12205ra;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.fkw, str, 0, i10).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        arrayList.add(ouw(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.tlj.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ouw ouwVar = tlj.this.fkw;
                int i12 = i11;
                if (!"top".equals(tlj.this.vt.qbp)) {
                    ViewGroup.LayoutParams layoutParams = ouwVar.ouw.getLayoutParams();
                    layoutParams.height = i12;
                    ouwVar.ouw.setLayoutParams(layoutParams);
                    ouwVar.ouw.requestLayout();
                    return;
                }
                if (tlj.this.yu instanceof ViewGroup) {
                    for (int i13 = 0; i13 < ((ViewGroup) tlj.this.yu).getChildCount(); i13++) {
                        ((ViewGroup) tlj.this.yu).getChildAt(i13).setTranslationY(i12 - tlj.this.f12204le);
                    }
                }
                tlj tljVar = tlj.this;
                tljVar.yu.setTranslationY(tljVar.f12204le - i12);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator, boolean z10) {
            }
        });
        return arrayList;
    }
}
