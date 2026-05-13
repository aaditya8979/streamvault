package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextDrawable.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class TextDrawable extends Drawable {

    @NotNull
    private final RectF rect = new RectF();

    @NotNull
    private TextDrawDelegate textDrawDelegate;

    @NotNull
    private final SliderTextStyle textStyle;

    public TextDrawable(@NotNull SliderTextStyle sliderTextStyle) {
        this.textStyle = sliderTextStyle;
        this.textDrawDelegate = new TextDrawDelegate(sliderTextStyle);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        this.rect.set(getBounds());
        this.textDrawDelegate.draw(canvas, this.rect.centerX(), this.rect.centerY());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.textStyle.getFontSize() + Math.abs(this.textStyle.getOffsetY()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.rect.width() + Math.abs(this.textStyle.getOffsetX()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setText(@NotNull String str) {
        this.textDrawDelegate.setText(str);
        invalidateSelf();
    }
}
