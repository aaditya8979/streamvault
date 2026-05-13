package com.yandex.div.internal.widget.indicator;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: IndicatorParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class IndicatorParams$Style {

    @NotNull
    private final IndicatorParams$Shape activeShape;

    @NotNull
    private final IndicatorParams$Animation animation;

    @NotNull
    private final IndicatorParams$Shape inactiveShape;

    @NotNull
    private final IndicatorParams$ItemPlacement itemsPlacement;

    @NotNull
    private final IndicatorParams$Shape minimumShape;

    public IndicatorParams$Style(@NotNull IndicatorParams$Animation indicatorParams$Animation, @NotNull IndicatorParams$Shape indicatorParams$Shape, @NotNull IndicatorParams$Shape indicatorParams$Shape2, @NotNull IndicatorParams$Shape indicatorParams$Shape3, @NotNull IndicatorParams$ItemPlacement indicatorParams$ItemPlacement) {
        this.animation = indicatorParams$Animation;
        this.activeShape = indicatorParams$Shape;
        this.inactiveShape = indicatorParams$Shape2;
        this.minimumShape = indicatorParams$Shape3;
        this.itemsPlacement = indicatorParams$ItemPlacement;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorParams$Style)) {
            return false;
        }
        IndicatorParams$Style indicatorParams$Style = (IndicatorParams$Style) obj;
        return this.animation == indicatorParams$Style.animation && p.f(this.activeShape, indicatorParams$Style.activeShape) && p.f(this.inactiveShape, indicatorParams$Style.inactiveShape) && p.f(this.minimumShape, indicatorParams$Style.minimumShape) && p.f(this.itemsPlacement, indicatorParams$Style.itemsPlacement);
    }

    @NotNull
    public final IndicatorParams$Shape getActiveShape() {
        return this.activeShape;
    }

    @NotNull
    public final IndicatorParams$Animation getAnimation() {
        return this.animation;
    }

    @NotNull
    public final IndicatorParams$Shape getInactiveShape() {
        return this.inactiveShape;
    }

    @NotNull
    public final IndicatorParams$ItemPlacement getItemsPlacement() {
        return this.itemsPlacement;
    }

    @NotNull
    public final IndicatorParams$Shape getMinimumShape() {
        return this.minimumShape;
    }

    public int hashCode() {
        return (((((((this.animation.hashCode() * 31) + this.activeShape.hashCode()) * 31) + this.inactiveShape.hashCode()) * 31) + this.minimumShape.hashCode()) * 31) + this.itemsPlacement.hashCode();
    }

    @NotNull
    public String toString() {
        return "Style(animation=" + this.animation + ", activeShape=" + this.activeShape + ", inactiveShape=" + this.inactiveShape + ", minimumShape=" + this.minimumShape + ", itemsPlacement=" + this.itemsPlacement + ')';
    }
}
