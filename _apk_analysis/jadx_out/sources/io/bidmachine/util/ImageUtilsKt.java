package io.bidmachine.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bn.r;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a&\u0010\r\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0003\u001a\u0012\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0013"}, d2 = {"Ljava/io/File;", "Landroid/graphics/BitmapFactory$Options;", "bitmapFactoryOptions", "Landroid/graphics/Bitmap;", "decodeToBitmap", "decodeToBitmapSafely", "Ljava/io/OutputStream;", "outputStream", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "", "quality", "", "compressSafely", "Lbn/r;", "recycleSafely", "", "downscaleFactor", "createDownscaledBitmapSafely", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class ImageUtilsKt {
    public static final boolean compressSafely(@NotNull Bitmap bitmap, @NotNull OutputStream outputStream, @NotNull Bitmap.CompressFormat compressFormat, int i10) {
        boolean z10;
        p.k(bitmap, "<this>");
        p.k(outputStream, "outputStream");
        p.k(compressFormat, "compressFormat");
        try {
            bitmap.compress(compressFormat, i10, outputStream);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        recycleSafely(bitmap);
        return z10;
    }

    public static /* synthetic */ boolean compressSafely$default(Bitmap bitmap, OutputStream outputStream, Bitmap.CompressFormat compressFormat, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i11 & 4) != 0) {
            i10 = 85;
        }
        return compressSafely(bitmap, outputStream, compressFormat, i10);
    }

    @NotNull
    public static final Bitmap createDownscaledBitmapSafely(@NotNull Bitmap bitmap, double d10) {
        Bitmap bitmapCreateScaledBitmap;
        p.k(bitmap, "<this>");
        if (d10 <= 1.0d) {
            return bitmap;
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) / d10), (int) (((double) bitmap.getHeight()) / d10), true);
        } catch (Throwable unused) {
            bitmapCreateScaledBitmap = null;
        }
        return bitmapCreateScaledBitmap == null ? bitmap : bitmapCreateScaledBitmap;
    }

    @NotNull
    public static final Bitmap decodeToBitmap(@NotNull File file, @NotNull BitmapFactory.Options options) throws Throwable {
        p.k(file, "<this>");
        p.k(options, "bitmapFactoryOptions");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options);
        p.j(bitmapDecodeFile, "decodeFile(path, bitmapFactoryOptions)");
        return bitmapDecodeFile;
    }

    @Nullable
    public static final Bitmap decodeToBitmapSafely(@NotNull File file, @NotNull BitmapFactory.Options options) {
        p.k(file, "<this>");
        p.k(options, "bitmapFactoryOptions");
        if (!FileUtilsKt.hasContent(file)) {
            return null;
        }
        try {
            return decodeToBitmap(file, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void recycleSafely(@NotNull Bitmap bitmap) {
        p.k(bitmap, "<this>");
        try {
            bitmap.recycle();
            r rVar = r.f5635a;
        } catch (Throwable unused) {
        }
    }
}
