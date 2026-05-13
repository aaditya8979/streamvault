package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import bn.g;
import cn.r;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: RadialGradientDrawable.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class RadialGradientDrawable extends Drawable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private Center centerX;

    @NotNull
    private Center centerY;

    @NotNull
    private int[] colors;

    @NotNull
    private Radius radius;

    @NotNull
    private final Paint paint = new Paint();

    @NotNull
    private RectF rect = new RectF();

    /* JADX INFO: compiled from: RadialGradientDrawable.kt */
    public static abstract class Center {

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Fixed extends Center {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Relative extends Center {
            private final float value;

            public Relative(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && Float.compare(this.value, ((Relative) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Relative(value=" + this.value + ')';
            }
        }

        private Center() {
        }

        public /* synthetic */ Center(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: RadialGradientDrawable.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                try {
                    iArr[Radius.Relative.Type.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Radius.Relative.Type.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distTo(float f10, float f11, float f12, float f13) {
            double d10 = 2;
            return (float) Math.sqrt(((float) Math.pow(f10 - f12, d10)) + ((float) Math.pow(f11 - f13, d10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToHorizontalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToVerticalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        private static final Float[] createRadialGradient$lambda$0(g<Float[]> gVar) {
            return gVar.getValue();
        }

        private static final Float[] createRadialGradient$lambda$1(g<Float[]> gVar) {
            return gVar.getValue();
        }

        private static final float createRadialGradient$value(Center center, int i10) {
            if (center instanceof Center.Fixed) {
                return ((Center.Fixed) center).getValue();
            }
            if (center instanceof Center.Relative) {
                return ((Center.Relative) center).getValue() * i10;
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        public final RadialGradient createRadialGradient(@NotNull Radius radius, @NotNull Center center, @NotNull Center center2, @NotNull int[] iArr, int i10, int i11) {
            float fFloatValue;
            final float fCreateRadialGradient$value = createRadialGradient$value(center, i10);
            final float fCreateRadialGradient$value2 = createRadialGradient$value(center2, i11);
            final float f10 = i10;
            final float f11 = i11;
            final float f12 = 0.0f;
            final float f13 = 0.0f;
            g gVarB = b.b(new a<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final Float[] invoke() {
                    return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f12, f13)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f10, f13)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f10, f11)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f12, f11))};
                }
            });
            final float f14 = 0.0f;
            g gVarB2 = b.b(new a<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // sn.a
                @NotNull
                public final Float[] invoke() {
                    return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(fCreateRadialGradient$value, f12)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(fCreateRadialGradient$value, f10)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(fCreateRadialGradient$value2, f11)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(fCreateRadialGradient$value2, f14))};
                }
            });
            if (radius instanceof Radius.Fixed) {
                fFloatValue = ((Radius.Fixed) radius).getValue();
            } else {
                if (!(radius instanceof Radius.Relative)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i12 = WhenMappings.$EnumSwitchMapping$0[((Radius.Relative) radius).getType().ordinal()];
                if (i12 == 1) {
                    Float fT0 = r.t0(createRadialGradient$lambda$0(gVarB));
                    p.h(fT0);
                    fFloatValue = fT0.floatValue();
                } else if (i12 == 2) {
                    Float fS0 = r.s0(createRadialGradient$lambda$0(gVarB));
                    p.h(fS0);
                    fFloatValue = fS0.floatValue();
                } else if (i12 == 3) {
                    Float fT02 = r.t0(createRadialGradient$lambda$1(gVarB2));
                    p.h(fT02);
                    fFloatValue = fT02.floatValue();
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Float fS02 = r.s0(createRadialGradient$lambda$1(gVarB2));
                    p.h(fS02);
                    fFloatValue = fS02.floatValue();
                }
            }
            if (fFloatValue <= 0.0f) {
                fFloatValue = 0.01f;
            }
            return new RadialGradient(fCreateRadialGradient$value, fCreateRadialGradient$value2, fFloatValue, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    /* JADX INFO: compiled from: RadialGradientDrawable.kt */
    public static abstract class Radius {

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Fixed extends Radius {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            @NotNull
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Relative extends Radius {

            @NotNull
            private final Type type;

            /* JADX INFO: compiled from: RadialGradientDrawable.kt */
            public enum Type {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            public Relative(@NotNull Type type) {
                super(null);
                this.type = type;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && this.type == ((Relative) obj).type;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @NotNull
            public String toString() {
                return "Relative(type=" + this.type + ')';
            }
        }

        private Radius() {
        }

        public /* synthetic */ Radius(i iVar) {
            this();
        }
    }

    public RadialGradientDrawable(@NotNull Radius radius, @NotNull Center center, @NotNull Center center2, @NotNull int[] iArr) {
        this.radius = radius;
        this.centerX = center;
        this.centerY = center2;
        this.colors = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect rect) {
        super.onBoundsChange(rect);
        this.paint.setShader(Companion.createRadialGradient(this.radius, this.centerX, this.centerY, this.colors, rect.width(), rect.height()));
        this.rect.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
