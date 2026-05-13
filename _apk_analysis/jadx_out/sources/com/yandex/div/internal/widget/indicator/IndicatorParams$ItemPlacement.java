package com.yandex.div.internal.widget.indicator;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IndicatorParams.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface IndicatorParams$ItemPlacement {

    /* JADX INFO: compiled from: IndicatorParams.kt */
    public static final class Default implements IndicatorParams$ItemPlacement {
        private final float spaceBetweenCenters;

        public Default(float f10) {
            this.spaceBetweenCenters = f10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Default) && Float.compare(this.spaceBetweenCenters, ((Default) obj).spaceBetweenCenters) == 0;
        }

        public final float getSpaceBetweenCenters() {
            return this.spaceBetweenCenters;
        }

        public int hashCode() {
            return Float.hashCode(this.spaceBetweenCenters);
        }

        @NotNull
        public String toString() {
            return "Default(spaceBetweenCenters=" + this.spaceBetweenCenters + ')';
        }
    }

    /* JADX INFO: compiled from: IndicatorParams.kt */
    public static final class Stretch implements IndicatorParams$ItemPlacement {
        private final float itemSpacing;
        private final int maxVisibleItems;

        public Stretch(float f10, int i10) {
            this.itemSpacing = f10;
            this.maxVisibleItems = i10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stretch)) {
                return false;
            }
            Stretch stretch = (Stretch) obj;
            return Float.compare(this.itemSpacing, stretch.itemSpacing) == 0 && this.maxVisibleItems == stretch.maxVisibleItems;
        }

        public final float getItemSpacing() {
            return this.itemSpacing;
        }

        public final int getMaxVisibleItems() {
            return this.maxVisibleItems;
        }

        public int hashCode() {
            return (Float.hashCode(this.itemSpacing) * 31) + Integer.hashCode(this.maxVisibleItems);
        }

        @NotNull
        public String toString() {
            return "Stretch(itemSpacing=" + this.itemSpacing + ", maxVisibleItems=" + this.maxVisibleItems + ')';
        }
    }
}
