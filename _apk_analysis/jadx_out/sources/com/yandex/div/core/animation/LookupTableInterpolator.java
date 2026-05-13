package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import cn.r;
import org.jetbrains.annotations.NotNull;
import zn.n;

/* JADX INFO: compiled from: LookupTableInterpolator.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    private final float stepSize;

    @NotNull
    private final float[] values;

    public LookupTableInterpolator(@NotNull float[] fArr) {
        this.values = fArr;
        this.stepSize = 1.0f / r.Z(fArr);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int iJ = n.j((int) (r.Z(this.values) * f10), this.values.length - 2);
        float f11 = this.stepSize;
        float f12 = (f10 - (iJ * f11)) / f11;
        float[] fArr = this.values;
        float f13 = fArr[iJ];
        return f13 + (f12 * (fArr[iJ + 1] - f13));
    }
}
