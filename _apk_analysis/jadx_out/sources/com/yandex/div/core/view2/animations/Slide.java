package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import bn.r;
import com.yandex.div.R$id;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import vn.c;

/* JADX INFO: compiled from: Slide.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Slide extends OutlineAwareVisibility {
    private final int distance;

    @NotNull
    private final SlideCalculator slideCalculator;
    private final int slideEdge;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Slide$Companion$calculatorLeft$1 calculatorLeft = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorLeft$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup viewGroup, @NotNull View view, int i10) {
            return view.getTranslationX() - Slide.Companion.exactValueBy(i10, view.getRight());
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorTop$1 calculatorTop = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorTop$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup viewGroup, @NotNull View view, int i10) {
            return view.getTranslationY() - Slide.Companion.exactValueBy(i10, view.getBottom());
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorRight$1 calculatorRight = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorRight$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup viewGroup, @NotNull View view, int i10) {
            return view.getTranslationX() + Slide.Companion.exactValueBy(i10, viewGroup.getWidth() - view.getLeft());
        }
    };

    @NotNull
    private static final Slide$Companion$calculatorBottom$1 calculatorBottom = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorBottom$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup viewGroup, @NotNull View view, int i10) {
            return view.getTranslationY() + Slide.Companion.exactValueBy(i10, viewGroup.getHeight() - view.getTop());
        }
    };

    /* JADX INFO: compiled from: Slide.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int exactValueBy(int i10, int i11) {
            return i10 == -1 ? i11 : i10;
        }
    }

    /* JADX INFO: compiled from: Slide.kt */
    public static abstract class HorizontalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneY(@NotNull ViewGroup viewGroup, @NotNull View view, int i10) {
            return view.getTranslationY();
        }
    }

    /* JADX INFO: compiled from: Slide.kt */
    public interface SlideCalculator {
        float getGoneX(@NotNull ViewGroup viewGroup, @NotNull View view, int i10);

        float getGoneY(@NotNull ViewGroup viewGroup, @NotNull View view, int i10);
    }

    /* JADX INFO: compiled from: Slide.kt */
    public static final class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        @NotNull
        private final View movingView;

        @NotNull
        private final View originalView;
        private float pausedX;
        private float pausedY;
        private final int startX;
        private final int startY;
        private final float terminalX;
        private final float terminalY;

        @Nullable
        private int[] transitionPosition;

        public TransitionPositionListener(@NotNull View view, @NotNull View view2, int i10, int i11, float f10, float f11) {
            this.originalView = view;
            this.movingView = view2;
            this.terminalX = f10;
            this.terminalY = f11;
            this.startX = i10 - c.d(view2.getTranslationX());
            this.startY = i11 - c.d(view2.getTranslationY());
            int i12 = R$id.div_transition_position;
            Object tag = view.getTag(i12);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.transitionPosition = iArr;
            if (iArr != null) {
                view.setTag(i12, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
            if (this.transitionPosition == null) {
                this.transitionPosition = new int[]{this.startX + c.d(this.movingView.getTranslationX()), this.startY + c.d(this.movingView.getTranslationY())};
            }
            this.originalView.setTag(R$id.div_transition_position, this.transitionPosition);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@NotNull Animator animator) {
            this.pausedX = this.movingView.getTranslationX();
            this.pausedY = this.movingView.getTranslationY();
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@NotNull Animator animator) {
            this.movingView.setTranslationX(this.pausedX);
            this.movingView.setTranslationY(this.pausedY);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NotNull Transition transition) {
            this.movingView.setTranslationX(this.terminalX);
            this.movingView.setTranslationY(this.terminalY);
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NotNull Transition transition) {
        }
    }

    /* JADX INFO: compiled from: Slide.kt */
    public static abstract class VerticalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        public float getGoneX(@NotNull ViewGroup viewGroup, @NotNull View view, int i10) {
            return view.getTranslationX();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Slide() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public Slide(int i10, int i11) {
        this.distance = i10;
        this.slideEdge = i11;
        this.slideCalculator = i11 != 3 ? i11 != 5 ? i11 != 48 ? calculatorBottom : calculatorTop : calculatorRight : calculatorLeft;
    }

    public /* synthetic */ Slide(int i10, int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? -1 : i10, (i12 & 2) != 0 ? 80 : i11);
    }

    private final Animator createTranslateAnimator(View view, Transition transition, TransitionValues transitionValues, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = transitionValues.view.getTag(R$id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f14 = (r4[0] - i10) + translationX;
            f15 = (r4[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int iD = i10 + c.d(f14 - translationX);
        int iD2 = i11 + c.d(f15 - translationY);
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12) {
            if (f15 == f13) {
                return null;
            }
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(transitionValues.view, view, iD, iD2, translationX, translationY);
        transition.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(transitionPositionListener);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NotNull final TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Slide.captureEndValues.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(int[] iArr) {
                invoke2(iArr);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull int[] iArr) {
                transitionValues.values.put("yandex:slide:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NotNull final TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Slide.captureStartValues.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(int[] iArr) {
                invoke2(iArr);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull int[] iArr) {
                transitionValues.values.put("yandex:slide:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NotNull ViewGroup viewGroup, @NotNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        Object obj = transitionValues2.values.get("yandex:slide:screenPosition");
        p.i(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, iArr), this, transitionValues2, iArr[0], iArr[1], this.slideCalculator.getGoneX(viewGroup, view, this.distance), this.slideCalculator.getGoneY(viewGroup, view, this.distance), view.getTranslationX(), view.getTranslationY(), getInterpolator());
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NotNull ViewGroup viewGroup, @NotNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        Object obj = transitionValues.values.get("yandex:slide:screenPosition");
        p.i(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return createTranslateAnimator(UtilsKt.getViewForAnimate(this, view, viewGroup, transitionValues, "yandex:slide:screenPosition"), this, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.slideCalculator.getGoneX(viewGroup, view, this.distance), this.slideCalculator.getGoneY(viewGroup, view, this.distance), getInterpolator());
    }
}
