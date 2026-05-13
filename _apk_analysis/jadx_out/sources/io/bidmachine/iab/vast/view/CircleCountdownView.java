package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes12.dex */
public class CircleCountdownView extends View implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f69726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f69731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f69732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f69733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f69734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f69735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f69736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f69737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f69738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f69739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Rect f69740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RectF f69741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Paint f69742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f69743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f69744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69745t;

    public CircleCountdownView(@NonNull Context context) {
        super(context);
        this.f69728c = Assets.MAIN_ASSETS_COLOR;
        this.f69729d = Assets.BACKGROUND_COLOR;
        this.f69730e = false;
        this.f69731f = 0.0f;
        this.f69732g = 0.071428575f;
        this.f69733h = new RectF();
        this.f69734i = new RectF();
        this.f69735j = 54.0f;
        this.f69736k = 54.0f;
        this.f69737l = 5.0f;
        this.f69744s = 100.0f;
        a(context);
    }

    public CircleCountdownView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69728c = Assets.MAIN_ASSETS_COLOR;
        this.f69729d = Assets.BACKGROUND_COLOR;
        this.f69730e = false;
        this.f69731f = 0.0f;
        this.f69732g = 0.071428575f;
        this.f69733h = new RectF();
        this.f69734i = new RectF();
        this.f69735j = 54.0f;
        this.f69736k = 54.0f;
        this.f69737l = 5.0f;
        this.f69744s = 100.0f;
        a(context);
    }

    private float a(float f10, boolean z10) {
        float fWidth = this.f69733h.width();
        if (z10) {
            fWidth -= this.f69737l * 2.0f;
        }
        float fSqrt = (float) (((double) (fWidth / 2.0f)) * Math.sqrt(2.0d));
        return fSqrt - ((f10 * fSqrt) * 2.0f);
    }

    private void a() {
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f10 = fMin / 2.0f;
        float width = (getWidth() / 2.0f) - f10;
        float height = (getHeight() / 2.0f) - f10;
        this.f69733h.set(width, height, width + fMin, fMin + height);
        this.f69735j = this.f69733h.centerX();
        this.f69736k = this.f69733h.centerY();
        RectF rectF = this.f69734i;
        RectF rectF2 = this.f69733h;
        float f11 = rectF2.left;
        float f12 = this.f69737l / 2.0f;
        rectF.set(f11 + f12, rectF2.top + f12, rectF2.right - f12, rectF2.bottom - f12);
    }

    private void a(Context context) {
        setLayerType(1, null);
        this.f69737l = Utils.dpToPx(context, 3.0f);
    }

    private void a(Canvas canvas) {
        if (this.f69738m == null) {
            this.f69738m = new Paint(1);
        }
        float f10 = 360.0f - ((this.f69744s * 360.0f) * 0.01f);
        this.f69738m.setColor(this.f69729d);
        this.f69738m.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f69733h, 0.0f, 360.0f, false, this.f69738m);
        this.f69738m.setColor(this.f69728c);
        this.f69738m.setStyle(Paint.Style.STROKE);
        this.f69738m.setStrokeWidth(this.f69737l);
        canvas.drawArc(this.f69734i, 270.0f, f10, false, this.f69738m);
    }

    private void a(Canvas canvas, Bitmap bitmap) {
        if (this.f69742q == null) {
            Paint paint = new Paint(7);
            this.f69742q = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f69742q.setAntiAlias(true);
        }
        if (this.f69740o == null) {
            this.f69740o = new Rect();
        }
        if (this.f69741p == null) {
            this.f69741p = new RectF();
        }
        float fA = a(this.f69731f, this.f69730e);
        float f10 = fA / 2.0f;
        float f11 = this.f69735j - f10;
        float f12 = this.f69736k - f10;
        this.f69740o.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f69741p.set(f11, f12, f11 + fA, fA + f12);
        this.f69742q.setColorFilter(new PorterDuffColorFilter(this.f69728c, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, this.f69740o, this.f69741p, this.f69742q);
        if (this.f69730e) {
            if (this.f69743r == null) {
                Paint paint2 = new Paint(1);
                this.f69743r = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.f69743r.setStrokeWidth(this.f69737l);
            this.f69743r.setColor(this.f69728c);
            canvas.drawArc(this.f69734i, 0.0f, 360.0f, false, this.f69743r);
        }
    }

    private void b(Canvas canvas) {
        if (this.f69739n == null) {
            Paint paint = new Paint(1);
            this.f69739n = paint;
            paint.setAntiAlias(true);
            this.f69739n.setStyle(Paint.Style.FILL);
            this.f69739n.setTextAlign(Paint.Align.CENTER);
        }
        String strValueOf = String.valueOf(this.f69745t);
        this.f69739n.setColor(this.f69728c);
        this.f69739n.setTypeface(Typeface.create(Typeface.DEFAULT, this.f69727b));
        this.f69739n.setTextSize(a(this.f69732g, true));
        canvas.drawText(strValueOf, this.f69735j, this.f69736k - ((this.f69739n.descent() + this.f69739n.ascent()) / 2.0f), this.f69739n);
    }

    public void changePercentage(float f10, int i10) {
        if (this.f69726a == null || f10 == 100.0f) {
            this.f69744s = f10;
            this.f69745t = i10;
            postInvalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getAccentColor() {
        return this.f69728c;
    }

    public int getBackgroundColor() {
        return this.f69729d;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f69745t == 0 && this.f69726a == null) {
            return;
        }
        a(canvas);
        Bitmap bitmap = this.f69726a;
        if (bitmap != null) {
            a(canvas, bitmap);
        } else {
            b(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setColors(int i10, int i11) {
        this.f69728c = i10;
        this.f69729d = i11;
        a();
    }

    public void setImage(@Nullable Bitmap bitmap) {
        this.f69726a = bitmap;
        if (bitmap != null) {
            this.f69744s = 100.0f;
        }
        postInvalidate();
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.f69727b = iabElementStyle.getFontStyle().intValue();
        this.f69728c = iabElementStyle.getStrokeColor().intValue();
        this.f69729d = iabElementStyle.getFillColor().intValue();
        this.f69730e = iabElementStyle.isOutlined().booleanValue();
        this.f69737l = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
        setAlpha(iabElementStyle.getOpacity().floatValue());
        a();
        postInvalidate();
    }
}
