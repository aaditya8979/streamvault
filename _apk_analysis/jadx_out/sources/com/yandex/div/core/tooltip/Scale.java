package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivTooltipAnimation.kt */
/* JADX INFO: loaded from: classes2.dex */
final class Scale extends Visibility {
    private final float scaleFactor;

    public Scale(float f10) {
        this.scaleFactor = f10;
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onAppear(@Nullable ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues transitionValues, @NotNull TransitionValues transitionValues2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, this.scaleFactor, view.getScaleX()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, this.scaleFactor, view.getScaleY()));
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onDisappear(@Nullable ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues transitionValues, @NotNull TransitionValues transitionValues2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, view.getScaleX(), this.scaleFactor), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), this.scaleFactor));
    }
}
