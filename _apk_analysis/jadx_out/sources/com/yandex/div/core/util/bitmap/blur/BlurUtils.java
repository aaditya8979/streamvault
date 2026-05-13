package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BlurUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BlurUtils {

    @NotNull
    public static final BlurUtils INSTANCE = new BlurUtils();

    private BlurUtils() {
    }

    public final boolean isBlurParamsValid(@NotNull Bitmap bitmap, float f10) {
        return !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && f10 > 0.0f;
    }
}
