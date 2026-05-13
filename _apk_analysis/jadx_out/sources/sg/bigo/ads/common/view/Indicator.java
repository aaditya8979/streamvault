package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes5.dex */
public class Indicator extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f82560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f82561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f82562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f82563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f82564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f82565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f82566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f82567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f82568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f82569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f82570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f82571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f82572m;

    public Indicator(Context context) {
        this(context, null);
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f82561b = 0;
        this.f82566g = -2130706433;
        float fA = e.a(getContext(), 2);
        this.f82565f = fA;
        this.f82568i = -1;
        this.f82567h = 8.0f * fA;
        this.f82569j = fA * 2.0f;
        this.f82564e = 0;
        this.f82570k = 0.0f;
        this.f82571l = 0;
    }

    public static float a(int i10, float f10, float f11, float f12) {
        float f13 = i10 - 1;
        return (f11 * 2.0f * f13) + (f10 * f13) + f12;
    }

    private void a() {
        Paint paint = new Paint();
        this.f82562c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f82562c.setColor(this.f82566g);
        this.f82562c.setAntiAlias(true);
        this.f82562c.setStrokeWidth(3.0f);
        Paint paint2 = new Paint(this.f82562c);
        this.f82563d = paint2;
        paint2.setColor(this.f82568i);
    }

    private void a(Canvas canvas) {
        float f10;
        if (this.f82564e <= 0) {
            return;
        }
        canvas.translate(((((canvas.getWidth() - getPaddingLeft()) - getPaddingRight()) - a(this.f82564e, this.f82569j, this.f82565f, this.f82567h)) / 2.0f) + getPaddingLeft() + this.f82565f, (((canvas.getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) + getPaddingTop());
        a();
        float f11 = -this.f82565f;
        for (int i10 = 0; i10 < this.f82564e; i10++) {
            if (i10 == this.f82571l) {
                float f12 = this.f82565f;
                canvas.drawCircle(f11 + f12, 0.0f, f12, this.f82562c);
                float f13 = this.f82567h + f11;
                float f14 = this.f82565f;
                canvas.drawCircle(f13 - f14, 0.0f, f14, this.f82562c);
                float f15 = (this.f82569j * this.f82570k) + f11;
                float f16 = this.f82565f;
                RectF rectF = new RectF(f15, -f16, this.f82567h + f15, f16);
                float f17 = this.f82565f;
                canvas.drawRoundRect(rectF, f17, f17, this.f82563d);
                f10 = this.f82567h;
            } else {
                float f18 = this.f82565f;
                canvas.drawCircle(f11 + f18, 0.0f, f18, this.f82562c);
                f10 = this.f82565f * 2.0f;
            }
            f11 = f11 + f10 + this.f82569j;
        }
    }

    public final void a(float f10, int i10) {
        if (i10 == this.f82571l) {
            this.f82570k = (-f10) * 2.0f;
            invalidate();
        }
    }

    public final void a(int i10) {
        if (this.f82571l != i10) {
            this.f82571l = i10;
            this.f82570k = 0.0f;
            invalidate();
        }
    }

    public float getDistance() {
        return this.f82569j;
    }

    public float getLengthSelected() {
        return this.f82567h;
    }

    public float getRadius() {
        return this.f82565f;
    }

    public int getType() {
        return this.f82561b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f82561b != 1) {
            a(canvas);
            return;
        }
        if (this.f82572m > 0.0f) {
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            float f10 = this.f82572m;
            canvas.translate(((width - f10) / 2.0f) + this.f82565f, height / 2.0f);
            a();
            float f11 = this.f82565f;
            RectF rectF = new RectF(0.0f, -f11, f10, f11);
            float f12 = this.f82565f;
            canvas.drawRoundRect(rectF, f12, f12, this.f82562c);
            float f13 = (f10 - this.f82567h) * this.f82560a;
            float f14 = this.f82565f;
            RectF rectF2 = new RectF(f13, -f14, this.f82567h + f13, f14);
            float f15 = this.f82565f;
            canvas.drawRoundRect(rectF2, f15, f15, this.f82563d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        float f10 = this.f82565f * 2.0f;
        int i12 = this.f82564e;
        float paddingLeft = (f10 * (i12 - 1)) + (this.f82569j * (i12 - 1)) + this.f82567h + getPaddingLeft() + getPaddingRight();
        float paddingTop = (this.f82565f * 2.0f) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, (int) paddingTop);
            return;
        }
        if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, (int) paddingTop);
        } else {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        }
    }

    public void setColor(int i10) {
        if (this.f82566g != i10) {
            this.f82566g = i10;
            invalidate();
        }
    }

    public void setColorSelected(int i10) {
        if (this.f82568i != i10) {
            this.f82568i = i10;
            invalidate();
        }
    }

    public void setLineLength(float f10) {
        if (this.f82572m != f10) {
            this.f82572m = f10;
            requestLayout();
            invalidate();
        }
    }

    public void setNum(int i10) {
        if (this.f82564e != i10) {
            sg.bigo.ads.common.t.a.a("Indicator", "onMeasure, setNum=".concat(String.valueOf(i10)));
            this.f82564e = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setRadius(float f10) {
        if (f10 != this.f82565f) {
            this.f82565f = f10;
            this.f82567h = 8.0f * f10;
            this.f82569j = f10 * 2.0f;
            requestLayout();
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f82561b != i10) {
            this.f82561b = i10;
            invalidate();
        }
    }
}
