package com.yandex.div.core.view2.divs;

import android.R;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import bn.r;
import cn.f0;
import cn.w;
import cn.x;
import com.yandex.div.R$drawable;
import com.yandex.div.R$id;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: DivBackgroundBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DivBackgroundBinder {

    @NotNull
    private final DivImageLoader imageLoader;

    /* JADX INFO: compiled from: DivBackgroundBinder.kt */
    public static abstract class DivBackgroundState {

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class Image extends DivBackgroundState {
            private final double alpha;

            @NotNull
            private final DivAlignmentHorizontal contentAlignmentHorizontal;

            @NotNull
            private final DivAlignmentVertical contentAlignmentVertical;

            @Nullable
            private final List<Filter> filters;

            @NotNull
            private final Uri imageUrl;
            private final boolean isVectorCompatible;
            private final boolean preloadRequired;

            @NotNull
            private final DivImageScale scale;

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public static abstract class Filter {

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Blur extends Filter {

                    @NotNull
                    private final DivFilter.a div;
                    private final int radius;

                    public Blur(int i10, @NotNull DivFilter.a aVar) {
                        super(null);
                        this.radius = i10;
                        this.div = aVar;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Blur)) {
                            return false;
                        }
                        Blur blur = (Blur) obj;
                        return this.radius == blur.radius && p.f(this.div, blur.div);
                    }

                    @NotNull
                    public final DivFilter.a getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return (Integer.hashCode(this.radius) * 31) + this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Blur(radius=" + this.radius + ", div=" + this.div + ')';
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class RtlMirror extends Filter {

                    @NotNull
                    private final DivFilter.c div;

                    public RtlMirror(@NotNull DivFilter.c cVar) {
                        super(null);
                        this.div = cVar;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof RtlMirror) && p.f(this.div, ((RtlMirror) obj).div);
                    }

                    @NotNull
                    public final DivFilter.c getDiv() {
                        return this.div;
                    }

                    public int hashCode() {
                        return this.div.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "RtlMirror(div=" + this.div + ')';
                    }
                }

                private Filter() {
                }

                public /* synthetic */ Filter(i iVar) {
                    this();
                }

                @NotNull
                public final DivFilter toDiv() {
                    if (this instanceof Blur) {
                        return ((Blur) this).getDiv();
                    }
                    if (this instanceof RtlMirror) {
                        return ((RtlMirror) this).getDiv();
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[DivImageScale.values().length];
                    try {
                        iArr[DivImageScale.FILL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DivImageScale.FIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DivImageScale.STRETCH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                    try {
                        iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[DivAlignmentVertical.values().length];
                    try {
                        iArr3[DivAlignmentVertical.CENTER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Image(double d10, @NotNull DivAlignmentHorizontal divAlignmentHorizontal, @NotNull DivAlignmentVertical divAlignmentVertical, @NotNull Uri uri, boolean z10, @NotNull DivImageScale divImageScale, @Nullable List<? extends Filter> list, boolean z11) {
                super(null);
                this.alpha = d10;
                this.contentAlignmentHorizontal = divAlignmentHorizontal;
                this.contentAlignmentVertical = divAlignmentVertical;
                this.imageUrl = uri;
                this.preloadRequired = z10;
                this.scale = divImageScale;
                this.filters = list;
                this.isVectorCompatible = z11;
            }

            private final ScalingDrawable.AlignmentHorizontal toHorizontalAlignment(DivAlignmentHorizontal divAlignmentHorizontal, boolean z10) {
                int i10 = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
                if (i10 == 1) {
                    return ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i10 == 2) {
                    return ScalingDrawable.AlignmentHorizontal.CENTER;
                }
                if (i10 == 3) {
                    return ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                if (i10 == 4) {
                    return z10 ? ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i10 == 5) {
                    return z10 ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                throw new NoWhenBranchMatchedException();
            }

            private final ScalingDrawable.ScaleType toScaleType(DivImageScale divImageScale) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[divImageScale.ordinal()];
                return i10 != 1 ? i10 != 2 ? i10 != 3 ? ScalingDrawable.ScaleType.NO_SCALE : ScalingDrawable.ScaleType.STRETCH : ScalingDrawable.ScaleType.FIT : ScalingDrawable.ScaleType.FILL;
            }

            private final ScalingDrawable.AlignmentVertical toVerticalAlignment(DivAlignmentVertical divAlignmentVertical) {
                int i10 = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
                return i10 != 1 ? i10 != 2 ? ScalingDrawable.AlignmentVertical.TOP : ScalingDrawable.AlignmentVertical.BOTTOM : ScalingDrawable.AlignmentVertical.CENTER;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Double.compare(this.alpha, image.alpha) == 0 && this.contentAlignmentHorizontal == image.contentAlignmentHorizontal && this.contentAlignmentVertical == image.contentAlignmentVertical && p.f(this.imageUrl, image.imageUrl) && this.preloadRequired == image.preloadRequired && this.scale == image.scale && p.f(this.filters, image.filters) && this.isVectorCompatible == image.isVectorCompatible;
            }

            @NotNull
            public final Drawable getDivImageBackground(@NotNull final BindingContext bindingContext, @NotNull final View view, @NotNull DivImageLoader divImageLoader) {
                final ScalingDrawable scalingDrawable = new ScalingDrawable();
                scalingDrawable.setAlpha((int) (this.alpha * ((double) 255)));
                scalingDrawable.setCustomScaleType(toScaleType(this.scale));
                scalingDrawable.setAlignmentHorizontal(toHorizontalAlignment(this.contentAlignmentHorizontal, ViewsKt.isLayoutRtl(view)));
                scalingDrawable.setAlignmentVertical(toVerticalAlignment(this.contentAlignmentVertical));
                String string = this.imageUrl.toString();
                final Div2View divView = bindingContext.getDivView();
                bindingContext.getDivView().addLoadReference(divImageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
                        if (this.isVectorCompatible()) {
                            scalingDrawable.setPicture(pictureDrawable.getPicture());
                        } else {
                            onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, this.getImageUrl(), null, 2, null));
                        }
                    }

                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        ArrayList arrayList;
                        View view2 = view;
                        BindingContext bindingContext2 = bindingContext;
                        Bitmap bitmap = cachedBitmap.getBitmap();
                        List<DivBackgroundBinder.DivBackgroundState.Image.Filter> filters = this.getFilters();
                        if (filters != null) {
                            arrayList = new ArrayList(x.x(filters, 10));
                            Iterator<T> it = filters.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((DivBackgroundBinder.DivBackgroundState.Image.Filter) it.next()).toDiv());
                            }
                        } else {
                            arrayList = null;
                        }
                        final ScalingDrawable scalingDrawable2 = scalingDrawable;
                        BaseDivViewExtensionsKt.applyBitmapFilters(view2, bindingContext2, bitmap, arrayList, new l<Bitmap, r>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2
                            {
                                super(1);
                            }

                            @Override // sn.l
                            public /* bridge */ /* synthetic */ r invoke(Bitmap bitmap2) {
                                invoke2(bitmap2);
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Bitmap bitmap2) {
                                scalingDrawable2.setBitmap(bitmap2);
                            }
                        });
                    }
                }), view);
                return scalingDrawable;
            }

            @Nullable
            public final List<Filter> getFilters() {
                return this.filters;
            }

            @NotNull
            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v7, types: [int] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v2 */
            public int hashCode() {
                int iHashCode = ((((((Double.hashCode(this.alpha) * 31) + this.contentAlignmentHorizontal.hashCode()) * 31) + this.contentAlignmentVertical.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
                boolean z10 = this.preloadRequired;
                ?? r12 = z10;
                if (z10) {
                    r12 = 1;
                }
                int iHashCode2 = (((iHashCode + r12) * 31) + this.scale.hashCode()) * 31;
                List<Filter> list = this.filters;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                boolean z11 = this.isVectorCompatible;
                return iHashCode3 + (z11 ? 1 : z11);
            }

            public final boolean isVectorCompatible() {
                return this.isVectorCompatible;
            }

            @NotNull
            public String toString() {
                return "Image(alpha=" + this.alpha + ", contentAlignmentHorizontal=" + this.contentAlignmentHorizontal + ", contentAlignmentVertical=" + this.contentAlignmentVertical + ", imageUrl=" + this.imageUrl + ", preloadRequired=" + this.preloadRequired + ", scale=" + this.scale + ", filters=" + this.filters + ", isVectorCompatible=" + this.isVectorCompatible + ')';
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class LinearGradient extends DivBackgroundState {
            private final int angle;

            @NotNull
            private final Colormap colormap;

            public LinearGradient(int i10, @NotNull Colormap colormap) {
                super(null);
                this.angle = i10;
                this.colormap = colormap;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LinearGradient)) {
                    return false;
                }
                LinearGradient linearGradient = (LinearGradient) obj;
                return this.angle == linearGradient.angle && p.f(this.colormap, linearGradient.colormap);
            }

            public final int getAngle() {
                return this.angle;
            }

            @NotNull
            public final Colormap getColormap() {
                return this.colormap;
            }

            public int hashCode() {
                return (Integer.hashCode(this.angle) * 31) + this.colormap.hashCode();
            }

            @NotNull
            public String toString() {
                return "LinearGradient(angle=" + this.angle + ", colormap=" + this.colormap + ')';
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class NinePatch extends DivBackgroundState {

            @NotNull
            private final Uri imageUrl;

            @NotNull
            private final Rect insets;

            public NinePatch(@NotNull Uri uri, @NotNull Rect rect) {
                super(null);
                this.imageUrl = uri;
                this.insets = rect;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NinePatch)) {
                    return false;
                }
                NinePatch ninePatch = (NinePatch) obj;
                return p.f(this.imageUrl, ninePatch.imageUrl) && p.f(this.insets, ninePatch.insets);
            }

            @NotNull
            public final Rect getInsets() {
                return this.insets;
            }

            @NotNull
            public final Drawable getNinePatchDrawable(@NotNull final Div2View div2View, @NotNull View view, @NotNull DivImageLoader divImageLoader) {
                final NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                div2View.addLoadReference(divImageLoader.loadImage(this.imageUrl.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$NinePatch$getNinePatchDrawable$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                        NinePatchDrawable ninePatchDrawable2 = ninePatchDrawable;
                        DivBackgroundBinder.DivBackgroundState.NinePatch ninePatch = this;
                        ninePatchDrawable2.setBottom(ninePatch.getInsets().bottom);
                        ninePatchDrawable2.setLeft(ninePatch.getInsets().left);
                        ninePatchDrawable2.setRight(ninePatch.getInsets().right);
                        ninePatchDrawable2.setTop(ninePatch.getInsets().top);
                        ninePatchDrawable2.setBitmap(cachedBitmap.getBitmap());
                    }
                }), view);
                return ninePatchDrawable;
            }

            public int hashCode() {
                return (this.imageUrl.hashCode() * 31) + this.insets.hashCode();
            }

            @NotNull
            public String toString() {
                return "NinePatch(imageUrl=" + this.imageUrl + ", insets=" + this.insets + ')';
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class RadialGradient extends DivBackgroundState {

            @NotNull
            private final Center centerX;

            @NotNull
            private final Center centerY;

            @NotNull
            private final List<Integer> colors;

            @NotNull
            private final Radius radius;

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public static abstract class Center {

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Fixed extends Center {
                    private final float valuePx;

                    public Fixed(float f10) {
                        super(null);
                        this.valuePx = f10;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
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

                @NotNull
                public final RadialGradientDrawable.Center toRadialGradientDrawableCenter() {
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Center.Fixed(((Fixed) this).getValuePx());
                    }
                    if (this instanceof Relative) {
                        return new RadialGradientDrawable.Center.Relative(((Relative) this).getValue());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public static abstract class Radius {

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Fixed extends Radius {
                    private final float valuePx;

                    public Fixed(float f10) {
                        super(null);
                        this.valuePx = f10;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    @NotNull
                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Relative extends Radius {

                    @NotNull
                    private final DivRadialGradientRelativeRadius.Value value;

                    public Relative(@NotNull DivRadialGradientRelativeRadius.Value value) {
                        super(null);
                        this.value = value;
                    }

                    public boolean equals(@Nullable Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && this.value == ((Relative) obj).value;
                    }

                    @NotNull
                    public final DivRadialGradientRelativeRadius.Value getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    @NotNull
                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DivRadialGradientRelativeRadius.Value.values().length];
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                private Radius() {
                }

                public /* synthetic */ Radius(i iVar) {
                    this();
                }

                @NotNull
                public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius() {
                    RadialGradientDrawable.Radius.Relative.Type type;
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Radius.Fixed(((Fixed) this).getValuePx());
                    }
                    if (!(this instanceof Relative)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = WhenMappings.$EnumSwitchMapping$0[((Relative) this).getValue().ordinal()];
                    if (i10 == 1) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
                    } else if (i10 == 2) {
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
                    } else if (i10 == 3) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
                    } else {
                        if (i10 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
                    }
                    return new RadialGradientDrawable.Radius.Relative(type);
                }
            }

            public RadialGradient(@NotNull Center center, @NotNull Center center2, @NotNull List<Integer> list, @NotNull Radius radius) {
                super(null);
                this.centerX = center;
                this.centerY = center2;
                this.colors = list;
                this.radius = radius;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RadialGradient)) {
                    return false;
                }
                RadialGradient radialGradient = (RadialGradient) obj;
                return p.f(this.centerX, radialGradient.centerX) && p.f(this.centerY, radialGradient.centerY) && p.f(this.colors, radialGradient.colors) && p.f(this.radius, radialGradient.radius);
            }

            @NotNull
            public final Center getCenterX() {
                return this.centerX;
            }

            @NotNull
            public final Center getCenterY() {
                return this.centerY;
            }

            @NotNull
            public final List<Integer> getColors() {
                return this.colors;
            }

            @NotNull
            public final Radius getRadius() {
                return this.radius;
            }

            public int hashCode() {
                return (((((this.centerX.hashCode() * 31) + this.centerY.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.radius.hashCode();
            }

            @NotNull
            public String toString() {
                return "RadialGradient(centerX=" + this.centerX + ", centerY=" + this.centerY + ", colors=" + this.colors + ", radius=" + this.radius + ')';
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class Solid extends DivBackgroundState {
            private final int color;

            public Solid(int i10) {
                super(null);
                this.color = i10;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Solid) && this.color == ((Solid) obj).color;
            }

            public final int getColor() {
                return this.color;
            }

            public int hashCode() {
                return Integer.hashCode(this.color);
            }

            @NotNull
            public String toString() {
                return "Solid(color=" + this.color + ')';
            }
        }

        private DivBackgroundState() {
        }

        public /* synthetic */ DivBackgroundState(i iVar) {
            this();
        }

        @NotNull
        public final Drawable toDrawable(@NotNull BindingContext bindingContext, @NotNull View view, @NotNull DivImageLoader divImageLoader) {
            if (this instanceof Image) {
                return ((Image) this).getDivImageBackground(bindingContext, view, divImageLoader);
            }
            if (this instanceof NinePatch) {
                return ((NinePatch) this).getNinePatchDrawable(bindingContext.getDivView(), view, divImageLoader);
            }
            if (this instanceof Solid) {
                return new ColorDrawable(((Solid) this).getColor());
            }
            if (this instanceof LinearGradient) {
                return new LinearGradientDrawable(r4.getAngle(), ((LinearGradient) this).getColormap());
            }
            if (!(this instanceof RadialGradient)) {
                throw new NoWhenBranchMatchedException();
            }
            RadialGradient radialGradient = (RadialGradient) this;
            return new RadialGradientDrawable(radialGradient.getRadius().toRadialGradientDrawableRadius(), radialGradient.getCenterX().toRadialGradientDrawableCenter(), radialGradient.getCenterY().toRadialGradientDrawableCenter(), f0.f1(radialGradient.getColors()));
        }
    }

    public DivBackgroundBinder(@NotNull DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    private void addBackgroundSubscriptions(List<? extends DivBackground> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, l<Object, r> lVar) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ExpressionSubscribersKt.observeBackground(expressionSubscriber, (DivBackground) it.next(), expressionResolver, lVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDefaultBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends DivBackground> list) {
        List<? extends DivBackgroundState> listM;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            listM = new ArrayList<>(x.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(toBackgroundState((DivBackground) it.next(), bindingContext.getDivView(), displayMetrics, expressionResolver));
            }
        } else {
            listM = w.m();
        }
        if ((p.f(getDefaultBackgroundList(view), listM) && p.f(getAdditionalLayer(view), drawable)) ? false : true) {
            updateBackground(view, toDrawable(listM, bindingContext, view, drawable));
            setDefaultBackgroundList(view, listM);
            setFocusedBackgroundList(view, null);
            setAdditionalLayer(view, drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyFocusedBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends DivBackground> list, List<? extends DivBackground> list2) {
        List<? extends DivBackgroundState> listM;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            listM = new ArrayList<>(x.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(toBackgroundState((DivBackground) it.next(), divView, displayMetrics, expressionResolver));
            }
        } else {
            listM = w.m();
        }
        List<? extends DivBackgroundState> arrayList = new ArrayList<>(x.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(toBackgroundState((DivBackground) it2.next(), divView, displayMetrics, expressionResolver));
        }
        if ((p.f(getDefaultBackgroundList(view), listM) && p.f(getFocusedBackgroundList(view), arrayList) && p.f(getAdditionalLayer(view), drawable)) ? false : true) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_focused}, toDrawable(arrayList, bindingContext, view, drawable));
            if (list != null || drawable != null) {
                stateListDrawable.addState(StateSet.WILD_CARD, toDrawable(listM, bindingContext, view, drawable));
            }
            updateBackground(view, stateListDrawable);
            setDefaultBackgroundList(view, listM);
            setFocusedBackgroundList(view, arrayList);
            setAdditionalLayer(view, drawable);
        }
    }

    private void bindDefaultBackground(final BindingContext bindingContext, final View view, final Drawable drawable, final List<? extends DivBackground> list, List<? extends DivBackground> list2, ExpressionSubscriber expressionSubscriber) {
        boolean z10;
        List<? extends DivBackground> listM = list == null ? w.m() : list;
        List<? extends DivBackground> listM2 = list2 == null ? w.m() : list2;
        Drawable additionalLayer = getAdditionalLayer(view);
        boolean z11 = true;
        if (listM.size() != listM2.size()) {
            z10 = false;
            break;
        }
        int i10 = 0;
        for (Object obj : listM) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            if (!DivDataExtensionsKt.equalsToConstant((DivBackground) obj, listM2.get(i10))) {
                z10 = false;
                break;
            }
            i10 = i11;
        }
        z10 = true;
        if (z10 && p.f(drawable, additionalLayer)) {
            return;
        }
        applyDefaultBackground(view, bindingContext, drawable, list);
        if (!listM.isEmpty()) {
            Iterator<T> it = listM.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((DivBackground) it.next())) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z11) {
            return;
        }
        addBackgroundSubscriptions(list, bindingContext.getExpressionResolver(), expressionSubscriber, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindDefaultBackground$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Object obj2) {
                invoke2(obj2);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Object obj2) {
                this.this$0.applyDefaultBackground(view, bindingContext, drawable, list);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void bindFocusBackground(final com.yandex.div.core.view2.BindingContext r16, final android.view.View r17, final android.graphics.drawable.Drawable r18, final java.util.List<? extends com.yandex.div2.DivBackground> r19, java.util.List<? extends com.yandex.div2.DivBackground> r20, final java.util.List<? extends com.yandex.div2.DivBackground> r21, java.util.List<? extends com.yandex.div2.DivBackground> r22, com.yandex.div.internal.core.ExpressionSubscriber r23) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivBackgroundBinder.bindFocusBackground(com.yandex.div.core.view2.BindingContext, android.view.View, android.graphics.drawable.Drawable, java.util.List, java.util.List, java.util.List, java.util.List, com.yandex.div.internal.core.ExpressionSubscriber):void");
    }

    private Drawable getAdditionalLayer(View view) {
        Object tag = view.getTag(R$id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getDefaultBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_default_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getFocusedBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_focused_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private boolean isVectorCompatible(DivImageBackground divImageBackground, ExpressionResolver expressionResolver) {
        if (divImageBackground.f55731a.evaluate(expressionResolver).doubleValue() == 1.0d) {
            List<DivFilter> list = divImageBackground.f55734d;
            if (list == null || list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void setAdditionalLayer(View view, Drawable drawable) {
        view.setTag(R$id.div_additional_background_layer_tag, drawable);
    }

    private void setDefaultBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_default_background_list_tag, list);
    }

    private void setFocusedBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_focused_background_list_tag, list);
    }

    private DivBackgroundState.Image.Filter toBackgroundState(DivFilter divFilter, ExpressionResolver expressionResolver) {
        int i10;
        if (!(divFilter instanceof DivFilter.a)) {
            if (divFilter instanceof DivFilter.c) {
                return new DivBackgroundState.Image.Filter.RtlMirror((DivFilter.c) divFilter);
            }
            throw new NoWhenBranchMatchedException();
        }
        DivFilter.a aVar = (DivFilter.a) divFilter;
        long jLongValue = aVar.c().f54674a.evaluate(expressionResolver).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new DivBackgroundState.Image.Filter.Blur(i10, aVar);
    }

    private DivBackgroundState.RadialGradient.Center toBackgroundState(DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
            return new DivBackgroundState.RadialGradient.Center.Fixed(BaseDivViewExtensionsKt.toPxF(bVar.c().f56599b.evaluate(expressionResolver).longValue(), bVar.c().f56598a.evaluate(expressionResolver), displayMetrics));
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return new DivBackgroundState.RadialGradient.Center.Relative((float) ((DivRadialGradientCenter.c) divRadialGradientCenter).c().f56623a.evaluate(expressionResolver).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState.RadialGradient.Radius toBackgroundState(DivRadialGradientRadius divRadialGradientRadius, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            return new DivBackgroundState.RadialGradient.Radius.Fixed(BaseDivViewExtensionsKt.toPxF(((DivRadialGradientRadius.b) divRadialGradientRadius).c(), displayMetrics, expressionResolver));
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
            return new DivBackgroundState.RadialGradient.Radius.Relative(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f56630a.evaluate(expressionResolver));
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState toBackgroundState(DivBackground divBackground, Div2View div2View, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        List<Integer> listM;
        int i14;
        if (divBackground instanceof DivBackground.c) {
            DivBackground.c cVar = (DivBackground.c) divBackground;
            long jLongValue = cVar.c().f56183a.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i14 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i14 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.LinearGradient(i14, ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(cVar.c(), expressionResolver), div2View));
        }
        if (divBackground instanceof DivBackground.e) {
            DivBackground.e eVar = (DivBackground.e) divBackground;
            DivBackgroundState.RadialGradient.Center backgroundState = toBackgroundState(eVar.c().f56575a, displayMetrics, expressionResolver);
            DivBackgroundState.RadialGradient.Center backgroundState2 = toBackgroundState(eVar.c().f56576b, displayMetrics, expressionResolver);
            ExpressionList<Integer> expressionList = eVar.c().f56578d;
            if (expressionList == null || (listM = expressionList.evaluate(expressionResolver)) == null) {
                listM = w.m();
            }
            return new DivBackgroundState.RadialGradient(backgroundState, backgroundState2, listM, toBackgroundState(eVar.c().f56579e, displayMetrics, expressionResolver));
        }
        if (divBackground instanceof DivBackground.b) {
            DivBackground.b bVar = (DivBackground.b) divBackground;
            double dDoubleValue = bVar.c().f55731a.evaluate(expressionResolver).doubleValue();
            DivAlignmentHorizontal divAlignmentHorizontalEvaluate = bVar.c().f55732b.evaluate(expressionResolver);
            DivAlignmentVertical divAlignmentVerticalEvaluate = bVar.c().f55733c.evaluate(expressionResolver);
            Uri uriEvaluate = bVar.c().f55735e.evaluate(expressionResolver);
            boolean zBooleanValue = bVar.c().f55736f.evaluate(expressionResolver).booleanValue();
            DivImageScale divImageScaleEvaluate = bVar.c().f55737g.evaluate(expressionResolver);
            List<DivFilter> list = bVar.c().f55734d;
            if (list != null) {
                arrayList = new ArrayList(x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(toBackgroundState((DivFilter) it.next(), expressionResolver));
                }
            } else {
                arrayList = null;
            }
            return new DivBackgroundState.Image(dDoubleValue, divAlignmentHorizontalEvaluate, divAlignmentVerticalEvaluate, uriEvaluate, zBooleanValue, divImageScaleEvaluate, arrayList, isVectorCompatible(bVar.c(), expressionResolver));
        }
        if (divBackground instanceof DivBackground.f) {
            return new DivBackgroundState.Solid(((DivBackground.f) divBackground).c().f57151a.evaluate(expressionResolver).intValue());
        }
        if (!(divBackground instanceof DivBackground.d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivBackground.d dVar = (DivBackground.d) divBackground;
        Uri uriEvaluate2 = dVar.c().f56222a.evaluate(expressionResolver);
        long jLongValue2 = dVar.c().f56223b.f54123b.evaluate(expressionResolver).longValue();
        long j11 = jLongValue2 >> 31;
        if (j11 == 0 || j11 == -1) {
            i10 = (int) jLongValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
            }
            i10 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue3 = dVar.c().f56223b.f54125d.evaluate(expressionResolver).longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i11 = (int) jLongValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
            }
            i11 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue4 = dVar.c().f56223b.f54124c.evaluate(expressionResolver).longValue();
        long j13 = jLongValue4 >> 31;
        if (j13 == 0 || j13 == -1) {
            i12 = (int) jLongValue4;
        } else {
            KAssert kAssert4 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue4 + "' to Int");
            }
            i12 = jLongValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue5 = dVar.c().f56223b.f54122a.evaluate(expressionResolver).longValue();
        long j14 = jLongValue5 >> 31;
        if (j14 == 0 || j14 == -1) {
            i13 = (int) jLongValue5;
        } else {
            KAssert kAssert5 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue5 + "' to Int");
            }
            i13 = jLongValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new DivBackgroundState.NinePatch(uriEvaluate2, new Rect(i10, i11, i12, i13));
    }

    private Drawable toDrawable(List<? extends DivBackgroundState> list, BindingContext bindingContext, View view, Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        if (list == null) {
            if (drawable != null) {
                return new LayerDrawable(new Drawable[]{drawable});
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Drawable drawableMutate = ((DivBackgroundState) it.next()).toDrawable(bindingContext, view, this.imageLoader).mutate();
            if (drawableMutate != null) {
                arrayList.add(drawableMutate);
            }
        }
        List listJ1 = f0.j1(arrayList);
        if (drawable != null) {
            listJ1.add(drawable);
        }
        if (!listJ1.isEmpty()) {
            return new LayerDrawable((Drawable[]) listJ1.toArray(new Drawable[0]));
        }
        return null;
    }

    private void updateBackground(View view, Drawable drawable) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R$drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = ContextCompat.getDrawable(view.getContext(), R$drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z10) {
            Drawable background2 = view.getBackground();
            p.i(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            p.i(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R$drawable.native_animation_background);
        }
    }

    public void bindBackground(@NotNull BindingContext bindingContext, @NotNull View view, @Nullable List<? extends DivBackground> list, @Nullable List<? extends DivBackground> list2, @Nullable List<? extends DivBackground> list3, @Nullable List<? extends DivBackground> list4, @NotNull ExpressionSubscriber expressionSubscriber, @Nullable Drawable drawable) {
        if (list3 == null) {
            bindDefaultBackground(bindingContext, view, drawable, list, list2, expressionSubscriber);
        } else {
            bindFocusBackground(bindingContext, view, drawable, list, list2, list3, list4, expressionSubscriber);
        }
    }
}
