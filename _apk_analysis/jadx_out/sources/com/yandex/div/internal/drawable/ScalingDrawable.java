package com.yandex.div.internal.drawable;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScalingDrawable.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ScalingDrawable extends Drawable {
    private boolean isDirtyRect;

    @Nullable
    private Bitmap originalBitmap;

    @Nullable
    private Picture originalPicture;
    private float xTranslate;
    private float yTranslate;

    @NotNull
    private ScaleType customScaleType = ScaleType.NO_SCALE;

    @NotNull
    private AlignmentHorizontal alignmentHorizontal = AlignmentHorizontal.LEFT;

    @NotNull
    private AlignmentVertical alignmentVertical = AlignmentVertical.TOP;

    @NotNull
    private final Paint paint = new Paint(3);

    @NotNull
    private Matrix thumbTransformMatrix = new Matrix();
    private float xScale = 1.0f;
    private float yScale = 1.0f;

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public enum AlignmentHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public enum AlignmentVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public enum ScaleType {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* JADX INFO: compiled from: ScalingDrawable.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.NO_SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlignmentHorizontal.values().length];
            try {
                iArr2[AlignmentHorizontal.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlignmentHorizontal.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AlignmentVertical.values().length];
            try {
                iArr3[AlignmentVertical.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AlignmentVertical.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final void reset() {
        this.isDirtyRect = true;
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.drawable.ScalingDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect rect) {
        super.onBoundsChange(rect);
        reset();
    }

    public final void setAlignmentHorizontal(@NotNull AlignmentHorizontal alignmentHorizontal) {
        this.alignmentHorizontal = alignmentHorizontal;
    }

    public final void setAlignmentVertical(@NotNull AlignmentVertical alignmentVertical) {
        this.alignmentVertical = alignmentVertical;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    public final void setBitmap(@NotNull Bitmap bitmap) {
        this.originalBitmap = bitmap;
        this.originalPicture = null;
        reset();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setCustomScaleType(@NotNull ScaleType scaleType) {
        this.customScaleType = scaleType;
    }

    public final void setPicture(@NotNull Picture picture) {
        this.originalPicture = picture;
        this.originalBitmap = null;
        reset();
    }
}
