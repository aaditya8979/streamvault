package com.yandex.div.core.view2.spannable;

import androidx.annotation.ColorInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: MaskData.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class MaskData {

    /* JADX INFO: compiled from: MaskData.kt */
    public static final class Particles extends MaskData {
        private final int color;
        private final float density;
        private final boolean isAnimated;
        private final boolean isEnabled;
        private final float particleSize;

        public Particles(@ColorInt int i10, float f10, boolean z10, boolean z11, float f11) {
            super(null);
            this.color = i10;
            this.density = f10;
            this.isAnimated = z10;
            this.isEnabled = z11;
            this.particleSize = f11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Particles)) {
                return false;
            }
            Particles particles = (Particles) obj;
            return this.color == particles.color && Float.compare(this.density, particles.density) == 0 && this.isAnimated == particles.isAnimated && this.isEnabled == particles.isEnabled && Float.compare(this.particleSize, particles.particleSize) == 0;
        }

        public final int getColor() {
            return this.color;
        }

        public final float getDensity() {
            return this.density;
        }

        public final float getParticleSize() {
            return this.particleSize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.color) * 31) + Float.hashCode(this.density)) * 31;
            boolean z10 = this.isAnimated;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            int i10 = (iHashCode + r12) * 31;
            boolean z11 = this.isEnabled;
            return ((i10 + (z11 ? 1 : z11)) * 31) + Float.hashCode(this.particleSize);
        }

        public final boolean isAnimated() {
            return this.isAnimated;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "Particles(color=" + this.color + ", density=" + this.density + ", isAnimated=" + this.isAnimated + ", isEnabled=" + this.isEnabled + ", particleSize=" + this.particleSize + ')';
        }
    }

    /* JADX INFO: compiled from: MaskData.kt */
    public static final class Solid extends MaskData {
        private final int color;
        private final boolean isEnabled;

        public Solid(@ColorInt int i10, boolean z10) {
            super(null);
            this.color = i10;
            this.isEnabled = z10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Solid)) {
                return false;
            }
            Solid solid = (Solid) obj;
            return this.color == solid.color && this.isEnabled == solid.isEnabled;
        }

        public final int getColor() {
            return this.color;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.color) * 31;
            boolean z10 = this.isEnabled;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "Solid(color=" + this.color + ", isEnabled=" + this.isEnabled + ')';
        }
    }

    private MaskData() {
    }

    public /* synthetic */ MaskData(i iVar) {
        this();
    }
}
