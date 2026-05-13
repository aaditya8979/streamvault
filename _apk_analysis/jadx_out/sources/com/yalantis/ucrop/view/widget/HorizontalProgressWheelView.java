package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;

/* JADX INFO: loaded from: classes6.dex */
public class HorizontalProgressWheelView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f53904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f53905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f53906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f53907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f53908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f53912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f53913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f53914l;

    public interface a {
        void a();

        void b();

        void c(float f10, float f11);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f53904b = new Rect();
        a();
    }

    public final void a() {
        this.f53914l = ContextCompat.getColor(getContext(), R$color.ucrop_color_widget_rotate_mid_line);
        this.f53909g = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_width_horizontal_wheel_progress_line);
        this.f53910h = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_height_horizontal_wheel_progress_line);
        this.f53911i = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f53907e = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f53907e.setStrokeWidth(this.f53909g);
        this.f53907e.setColor(getResources().getColor(R$color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f53907e);
        this.f53908f = paint2;
        paint2.setColor(this.f53914l);
        this.f53908f.setStrokeCap(Paint.Cap.ROUND);
        this.f53908f.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_width_middle_wheel_progress_line));
    }

    public final void b(MotionEvent motionEvent, float f10) {
        this.f53913k -= f10;
        postInvalidate();
        this.f53906d = motionEvent.getX();
        a aVar = this.f53905c;
        if (aVar != null) {
            aVar.c(-f10, this.f53913k);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f53904b);
        int iWidth = this.f53904b.width() / (this.f53909g + this.f53911i);
        float f10 = this.f53913k % (r2 + r1);
        for (int i10 = 0; i10 < iWidth; i10++) {
            int i11 = iWidth / 4;
            if (i10 < i11) {
                this.f53907e.setAlpha((int) ((i10 / i11) * 255.0f));
            } else if (i10 > (iWidth * 3) / 4) {
                this.f53907e.setAlpha((int) (((iWidth - i10) / i11) * 255.0f));
            } else {
                this.f53907e.setAlpha(255);
            }
            float f11 = -f10;
            Rect rect = this.f53904b;
            float f12 = rect.left + f11 + ((this.f53909g + this.f53911i) * i10);
            float fCenterY = rect.centerY() - (this.f53910h / 4.0f);
            Rect rect2 = this.f53904b;
            canvas.drawLine(f12, fCenterY, f11 + rect2.left + ((this.f53909g + this.f53911i) * i10), rect2.centerY() + (this.f53910h / 4.0f), this.f53907e);
        }
        canvas.drawLine(this.f53904b.centerX(), this.f53904b.centerY() - (this.f53910h / 2.0f), this.f53904b.centerX(), (this.f53910h / 2.0f) + this.f53904b.centerY(), this.f53908f);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f53906d = motionEvent.getX();
        } else if (action == 1) {
            a aVar = this.f53905c;
            if (aVar != null) {
                this.f53912j = false;
                aVar.a();
            }
        } else if (action == 2) {
            float x10 = motionEvent.getX() - this.f53906d;
            if (x10 != 0.0f) {
                if (!this.f53912j) {
                    this.f53912j = true;
                    a aVar2 = this.f53905c;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                }
                b(motionEvent, x10);
            }
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int i10) {
        this.f53914l = i10;
        this.f53908f.setColor(i10);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f53905c = aVar;
    }
}
