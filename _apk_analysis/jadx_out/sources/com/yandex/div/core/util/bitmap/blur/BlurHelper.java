package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BlurHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface BlurHelper {
    @NotNull
    Bitmap blurBitmap(@NotNull Bitmap bitmap, float f10);

    @NotNull
    Bitmap blurShadow(@NotNull Bitmap bitmap, float f10);

    float getBitmapScale(float f10);

    float getCoercedBlurRadius(float f10);

    void release();
}
