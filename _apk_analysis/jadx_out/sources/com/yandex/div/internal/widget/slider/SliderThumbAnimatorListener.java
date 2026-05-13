package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: SliderThumbAnimatorListener.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SliderThumbAnimatorListener implements Animator.AnimatorListener {
    private boolean hasCanceled;

    @NotNull
    private final l<Boolean, r> onAnimationEnd;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderThumbAnimatorListener(@NotNull l<? super Boolean, r> lVar) {
        this.onAnimationEnd = lVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animator) {
        this.hasCanceled = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animator) {
        this.onAnimationEnd.invoke(Boolean.valueOf(this.hasCanceled));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animator) {
        this.hasCanceled = false;
    }
}
