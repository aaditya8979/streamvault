package com.yandex.div.core.util.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.yandex.div.core.util.bitmap.blur.BlurHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BitmapEffectHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class BitmapEffectHelper implements BlurHelper {
    @NotNull
    public final Bitmap mirrorBitmap(@NotNull Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmapCreateBitmap.setDensity(160);
        return bitmapCreateBitmap;
    }
}
