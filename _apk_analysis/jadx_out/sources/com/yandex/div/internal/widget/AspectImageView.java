package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import tn.t;
import zn.n;

/* JADX INFO: compiled from: AspectImageView.kt */
/* JADX INFO: loaded from: classes8.dex */
public class AspectImageView extends AppCompatImageView implements AspectView {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {t.f(new MutablePropertyReference1Impl(AspectImageView.class, "gravity", "getGravity()I", 0)), t.f(new MutablePropertyReference1Impl(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)), t.f(new MutablePropertyReference1Impl(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0))};

    @NotNull
    private final wn.d aspectRatio$delegate;

    @NotNull
    private final wn.d gravity$delegate;

    @NotNull
    private final wn.d imageScale$delegate;
    private boolean isMatrixInvalidated;

    @NotNull
    private final Matrix transformMatrix;

    /* JADX INFO: compiled from: AspectImageView.kt */
    public enum Scale {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* JADX INFO: compiled from: AspectImageView.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Scale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.gravity$delegate = ViewsKt.appearanceAffecting$default(0, null, 2, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
        this.imageScale$delegate = ViewsKt.dimensionAffecting$default(Scale.NO_SCALE, null, 2, null);
        this.transformMatrix = new Matrix();
        this.isMatrixInvalidated = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public /* synthetic */ AspectImageView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void applyAspectRatio(int i10, int i11) {
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        boolean zCanResizeWidth = canResizeWidth(i10);
        boolean zCanResizeHeight = canResizeHeight(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!zCanResizeWidth && !zCanResizeHeight) {
            measuredHeight = vn.c.d(measuredWidth / aspectRatio);
        } else if (!zCanResizeWidth && zCanResizeHeight) {
            measuredHeight = vn.c.d(measuredWidth / aspectRatio);
        } else if (zCanResizeWidth && !zCanResizeHeight) {
            measuredWidth = vn.c.d(measuredHeight * aspectRatio);
        } else if (zCanResizeWidth && zCanResizeHeight) {
            measuredHeight = vn.c.d(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    private final void updateMatrix(int i10, int i11) {
        float fMin;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float fE = n.e((i10 - getPaddingLeft()) - getPaddingRight(), 0);
        float fE2 = n.e((i11 - getPaddingTop()) - getPaddingBottom(), 0);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(getGravity(), ViewCompat.getLayoutDirection(this));
        Scale imageScale = getImageScale();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i12 = iArr[imageScale.ordinal()];
        if (i12 == 1) {
            fMin = 1.0f;
        } else if (i12 == 2) {
            fMin = Math.min(fE / intrinsicWidth, fE2 / intrinsicHeight);
        } else if (i12 == 3) {
            fMin = Math.max(fE / intrinsicWidth, fE2 / intrinsicHeight);
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fMin = fE / intrinsicWidth;
        }
        float f10 = iArr[getImageScale().ordinal()] == 4 ? fE2 / intrinsicHeight : fMin;
        int i13 = absoluteGravity & 7;
        float f11 = 0.0f;
        float f12 = i13 != 1 ? i13 != 5 ? 0.0f : fE - (intrinsicWidth * fMin) : (fE - (intrinsicWidth * fMin)) / 2;
        int i14 = absoluteGravity & 112;
        if (i14 == 16) {
            f11 = (fE2 - (intrinsicHeight * f10)) / 2;
        } else if (i14 == 80) {
            f11 = fE2 - (intrinsicHeight * f10);
        }
        Matrix matrix = this.transformMatrix;
        matrix.reset();
        matrix.postScale(fMin, f10);
        matrix.postTranslate(f12, f11);
        setImageMatrix(this.transformMatrix);
    }

    public boolean canResizeHeight(int i10) {
        return View.MeasureSpec.getMode(i10) != 1073741824;
    }

    public boolean canResizeWidth(int i10) {
        return View.MeasureSpec.getMode(i10) != 1073741824;
    }

    public final float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    public final int getGravity() {
        return ((Number) this.gravity$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    @NotNull
    public final Scale getImageScale() {
        return (Scale) this.imageScale$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        if ((getImageMatrix() == null || p.f(getImageMatrix(), this.transformMatrix)) && this.isMatrixInvalidated && getWidth() > 0 && getHeight() > 0) {
            updateMatrix(getWidth(), getHeight());
            this.isMatrixInvalidated = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.isMatrixInvalidated = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        applyAspectRatio(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.isMatrixInvalidated = true;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f10) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f10));
    }

    public final void setGravity(int i10) {
        this.gravity$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setImageScale(@NotNull Scale scale) {
        this.imageScale$delegate.setValue(this, $$delegatedProperties[2], scale);
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
    }
}
