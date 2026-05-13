package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReverseInterpolator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ReverseInterpolator implements Interpolator {

    @NotNull
    private final Interpolator base;

    public ReverseInterpolator(@NotNull Interpolator interpolator) {
        this.base = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.base.getInterpolation(1.0f - f10);
    }
}
