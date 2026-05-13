package androidx.core.animation;

import android.animation.Animator;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    public final /* synthetic */ l<Animator, r> $onCancel;
    public final /* synthetic */ l<Animator, r> $onEnd;
    public final /* synthetic */ l<Animator, r> $onRepeat;
    public final /* synthetic */ l<Animator, r> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(l<? super Animator, r> lVar, l<? super Animator, r> lVar2, l<? super Animator, r> lVar3, l<? super Animator, r> lVar4) {
        this.$onRepeat = lVar;
        this.$onEnd = lVar2;
        this.$onCancel = lVar3;
        this.$onStart = lVar4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animator) {
        this.$onStart.invoke(animator);
    }
}
