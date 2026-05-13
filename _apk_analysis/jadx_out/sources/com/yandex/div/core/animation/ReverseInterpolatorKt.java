package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReverseInterpolator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ReverseInterpolatorKt {
    @NotNull
    public static final Interpolator reversed(@NotNull Interpolator interpolator) {
        return new ReverseInterpolator(interpolator);
    }
}
