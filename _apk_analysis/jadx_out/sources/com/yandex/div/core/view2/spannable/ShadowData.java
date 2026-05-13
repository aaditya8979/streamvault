package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShadowData.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ShadowData {
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    public ShadowData(@Px float f10, @Px float f11, @Px float f12, @ColorInt int i10) {
        this.offsetX = f10;
        this.offsetY = f11;
        this.radius = f12;
        this.color = i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowData)) {
            return false;
        }
        ShadowData shadowData = (ShadowData) obj;
        return Float.compare(this.offsetX, shadowData.offsetX) == 0 && Float.compare(this.offsetY, shadowData.offsetY) == 0 && Float.compare(this.radius, shadowData.radius) == 0 && this.color == shadowData.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.offsetX) * 31) + Float.hashCode(this.offsetY)) * 31) + Float.hashCode(this.radius)) * 31) + Integer.hashCode(this.color);
    }

    @NotNull
    public String toString() {
        return "ShadowData(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", radius=" + this.radius + ", color=" + this.color + ')';
    }
}
