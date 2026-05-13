package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes2.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f82617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f82618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f82619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f82620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f82621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f82622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f82623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RectF f82624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f82625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f82626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f82627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RectF f82628l;

    public RoundedFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundedFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f82622f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedFrameLayout);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_radius, 0.0f);
            this.f82617a = dimension;
            this.f82618b = dimension;
            this.f82619c = dimension;
            this.f82620d = dimension;
            if (dimension == 0.0f) {
                this.f82617a = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topLeftRadius, 0.0f);
                this.f82618b = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_topRightRadius, 0.0f);
                this.f82619c = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomLeftRadius, 0.0f);
                this.f82620d = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_bottomRightRadius, 0.0f);
            }
            this.f82625i = typedArrayObtainStyledAttributes.getColor(R.styleable.RoundedFrameLayout_bigo_ad_shadowColor, Color.parseColor("#00FFFFFF"));
            this.f82626j = typedArrayObtainStyledAttributes.getDimension(R.styleable.RoundedFrameLayout_bigo_ad_shadowRadius, -1.0f);
            a();
        } catch (Exception unused) {
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void a() {
        if (this.f82626j > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.f82627k = paint;
            paint.setShadowLayer(this.f82626j, 0.0f, 0.0f, this.f82625i);
        }
    }

    private Path getPath() {
        Path path = new Path();
        float f10 = this.f82617a;
        float f11 = this.f82618b;
        float f12 = this.f82620d;
        float f13 = this.f82619c;
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        RectF rectF = this.f82628l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    public final void a(float f10, float f11, float f12, float f13) {
        this.f82617a = f10;
        this.f82618b = f11;
        this.f82619c = f12;
        this.f82620d = f13;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f82627k != null) {
            float f10 = this.f82626j;
            RectF rectF = new RectF(f10, f10, getWidth() - this.f82626j, getHeight() - this.f82626j);
            this.f82628l = rectF;
            float f11 = this.f82617a;
            canvas.drawRoundRect(rectF, f11, f11, this.f82627k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.f82623g;
        float f12 = this.f82621e;
        RectF rectF2 = this.f82624h;
        if (paint != null && rectF2 != null && f12 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f82622f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f12);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f13 = this.f82617a;
                canvas.drawRoundRect(rectF2, f13, f13, paint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadiusBottomLeft() {
        return this.f82619c;
    }

    public float getCornerRadiusBottomRight() {
        return this.f82620d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f82617a;
    }

    public float getCornerRadiusTopRight() {
        return this.f82618b;
    }

    public void setCornerRadius(float f10) {
        a(f10, f10, f10, f10);
    }

    public void setShadowColor(@ColorInt int i10) {
        this.f82625i = i10;
        invalidate();
    }

    public void setShadowRadius(float f10) {
        boolean z10 = this.f82627k == null;
        this.f82626j = f10;
        if (z10) {
            a();
        }
        invalidate();
    }

    public void setStrokeColor(@ColorInt int i10) {
        this.f82622f = i10;
        if (this.f82623g == null) {
            this.f82623g = new Paint();
        }
        if (this.f82624h == null) {
            this.f82624h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.f82621e = f10;
        if (this.f82623g == null) {
            this.f82623g = new Paint();
        }
        if (this.f82624h == null) {
            this.f82624h = new RectF();
        }
        invalidate();
    }
}
