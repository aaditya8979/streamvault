package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Px;
import com.yandex.div.internal.Assert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CircleDrawable.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CircleDrawable extends Drawable {

    @NotNull
    private final Paint mainPaint;

    @NotNull
    private final Params params;

    @NotNull
    private final RectF rect;

    @Nullable
    private final Paint strokePaint;

    /* JADX INFO: compiled from: CircleDrawable.kt */
    public static final class Params {
        private final int color;
        private final float radius;

        @Nullable
        private final Integer strokeColor;

        @Nullable
        private final Float strokeWidth;

        public Params(@Px float f10, int i10, @Nullable Integer num, @Nullable Float f11) {
            this.radius = f10;
            this.color = i10;
            this.strokeColor = num;
            this.strokeWidth = f11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return Float.compare(this.radius, params.radius) == 0 && this.color == params.color && p.f(this.strokeColor, params.strokeColor) && p.f(this.strokeWidth, params.strokeWidth);
        }

        public final int getColor() {
            return this.color;
        }

        public final float getRadius() {
            return this.radius;
        }

        @Nullable
        public final Integer getStrokeColor() {
            return this.strokeColor;
        }

        @Nullable
        public final Float getStrokeWidth() {
            return this.strokeWidth;
        }

        public int hashCode() {
            int iHashCode = ((Float.hashCode(this.radius) * 31) + Integer.hashCode(this.color)) * 31;
            Integer num = this.strokeColor;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f10 = this.strokeWidth;
            return iHashCode2 + (f10 != null ? f10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Params(radius=" + this.radius + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }
    }

    public CircleDrawable(@NotNull Params params) {
        Paint paint;
        this.params = params;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(params.getColor());
        this.mainPaint = paint2;
        if (params.getStrokeColor() == null || params.getStrokeWidth() == null) {
            paint = null;
        } else {
            paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(params.getStrokeColor().intValue());
            paint.setStrokeWidth(params.getStrokeWidth().floatValue());
        }
        this.strokePaint = paint;
        float f10 = 2;
        RectF rectF = new RectF(0.0f, 0.0f, params.getRadius() * f10, params.getRadius() * f10);
        this.rect = rectF;
        Rect rect = new Rect();
        rectF.roundOut(rect);
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        this.mainPaint.setColor(this.params.getColor());
        this.rect.set(getBounds());
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.mainPaint);
        if (this.strokePaint != null) {
            canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.params.getRadius(), this.strokePaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return ((int) this.params.getRadius()) * 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Assert.fail("Setting alpha is not implemented");
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Assert.fail("Setting color filter is not implemented");
    }
}
