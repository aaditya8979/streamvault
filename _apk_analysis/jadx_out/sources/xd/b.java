package xd;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.ColorInt;

/* JADX INFO: compiled from: WaterDropView.java */
/* JADX INFO: loaded from: classes12.dex */
public class b extends View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f86903h = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xd.a f86904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xd.a f86905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Path f86906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f86907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86909g;

    /* JADX INFO: compiled from: WaterDropView.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
            b.this.postInvalidate();
        }
    }

    public b(Context context) {
        super(context);
        this.f86904b = new xd.a();
        this.f86905c = new xd.a();
        this.f86906d = new Path();
        Paint paint = new Paint();
        this.f86907e = paint;
        paint.setColor(-7829368);
        this.f86907e.setAntiAlias(true);
        this.f86907e.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = this.f86907e;
        int iC = se.b.c(1.0f);
        f86903h = iC;
        paint2.setStrokeWidth(iC);
        Paint paint3 = this.f86907e;
        int i10 = f86903h;
        paint3.setShadowLayer(i10, i10 / 2.0f, i10, -1728053248);
        setLayerType(1, null);
        int i11 = f86903h * 4;
        setPadding(i11, i11, i11, i11);
        this.f86907e.setColor(-7829368);
        int iC2 = se.b.c(20.0f);
        this.f86908f = iC2;
        this.f86909g = iC2 / 5;
        xd.a aVar = this.f86904b;
        aVar.f86902c = iC2;
        xd.a aVar2 = this.f86905c;
        aVar2.f86902c = iC2;
        int i12 = f86903h;
        aVar.f86900a = i12 + iC2;
        aVar.f86901b = i12 + iC2;
        aVar2.f86900a = i12 + iC2;
        aVar2.f86901b = i12 + iC2;
    }

    public ValueAnimator a() {
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.001f).setDuration(180L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addUpdateListener(new a());
        return duration;
    }

    public void b() {
        this.f86906d.reset();
        Path path = this.f86906d;
        xd.a aVar = this.f86904b;
        path.addCircle(aVar.f86900a, aVar.f86901b, aVar.f86902c, Path.Direction.CCW);
        if (this.f86905c.f86901b > this.f86904b.f86901b + se.b.c(1.0f)) {
            Path path2 = this.f86906d;
            xd.a aVar2 = this.f86905c;
            path2.addCircle(aVar2.f86900a, aVar2.f86901b, aVar2.f86902c, Path.Direction.CCW);
            double angle = getAngle();
            xd.a aVar3 = this.f86904b;
            float fCos = (float) (((double) aVar3.f86900a) - (((double) aVar3.f86902c) * Math.cos(angle)));
            xd.a aVar4 = this.f86904b;
            float fSin = (float) (((double) aVar4.f86901b) + (((double) aVar4.f86902c) * Math.sin(angle)));
            xd.a aVar5 = this.f86904b;
            float fCos2 = (float) (((double) aVar5.f86900a) + (((double) aVar5.f86902c) * Math.cos(angle)));
            xd.a aVar6 = this.f86905c;
            float fCos3 = (float) (((double) aVar6.f86900a) - (((double) aVar6.f86902c) * Math.cos(angle)));
            xd.a aVar7 = this.f86905c;
            float fSin2 = (float) (((double) aVar7.f86901b) + (((double) aVar7.f86902c) * Math.sin(angle)));
            xd.a aVar8 = this.f86905c;
            float fCos4 = (float) (((double) aVar8.f86900a) + (((double) aVar8.f86902c) * Math.cos(angle)));
            Path path3 = this.f86906d;
            xd.a aVar9 = this.f86904b;
            path3.moveTo(aVar9.f86900a, aVar9.f86901b);
            this.f86906d.lineTo(fCos, fSin);
            Path path4 = this.f86906d;
            xd.a aVar10 = this.f86905c;
            path4.quadTo(aVar10.f86900a - aVar10.f86902c, (aVar10.f86901b + this.f86904b.f86901b) / 2.0f, fCos3, fSin2);
            this.f86906d.lineTo(fCos4, fSin2);
            Path path5 = this.f86906d;
            xd.a aVar11 = this.f86905c;
            path5.quadTo(aVar11.f86900a + aVar11.f86902c, (aVar11.f86901b + fSin) / 2.0f, fCos2, fSin);
        }
        this.f86906d.close();
    }

    public void c(float f10) {
        int i10 = this.f86908f;
        float f11 = (float) (((double) i10) - ((((double) f10) * 0.25d) * ((double) i10)));
        float f12 = ((this.f86909g - i10) * f10) + i10;
        float f13 = f10 * 4.0f * i10;
        xd.a aVar = this.f86904b;
        aVar.f86902c = f11;
        xd.a aVar2 = this.f86905c;
        aVar2.f86902c = f12;
        aVar2.f86901b = aVar.f86901b + f13;
    }

    public void d(int i10) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i11 = this.f86908f;
        if (i10 < (i11 * 2) + paddingTop + paddingBottom) {
            xd.a aVar = this.f86904b;
            aVar.f86902c = i11;
            xd.a aVar2 = this.f86905c;
            aVar2.f86902c = i11;
            aVar2.f86901b = aVar.f86901b;
            return;
        }
        float fPow = (float) (((double) (i11 - this.f86909g)) * (1.0d - Math.pow(100.0d, (-Math.max(0.0f, r4 - r3)) / se.b.c(200.0f))));
        xd.a aVar3 = this.f86904b;
        int i12 = this.f86908f;
        aVar3.f86902c = i12 - (fPow / 4.0f);
        xd.a aVar4 = this.f86905c;
        float f10 = i12 - fPow;
        aVar4.f86902c = f10;
        aVar4.f86901b = ((i10 - paddingTop) - paddingBottom) - f10;
    }

    public void e(int i10, int i11) {
    }

    public double getAngle() {
        if (this.f86905c.f86902c > this.f86904b.f86902c) {
            return 0.0d;
        }
        return Math.asin((r3 - r1) / (r0.f86901b - r2.f86901b));
    }

    public xd.a getBottomCircle() {
        return this.f86905c;
    }

    public int getIndicatorColor() {
        return this.f86907e.getColor();
    }

    public int getMaxCircleRadius() {
        return this.f86908f;
    }

    public xd.a getTopCircle() {
        return this.f86904b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        canvas.save();
        float f10 = height;
        float f11 = this.f86904b.f86902c;
        float f12 = paddingTop;
        float f13 = paddingBottom;
        if (f10 <= (f11 * 2.0f) + f12 + f13) {
            canvas.translate(paddingLeft, (f10 - (f11 * 2.0f)) - f13);
            xd.a aVar = this.f86904b;
            canvas.drawCircle(aVar.f86900a, aVar.f86901b, aVar.f86902c, this.f86907e);
        } else {
            canvas.translate(paddingLeft, f12);
            b();
            canvas.drawPath(this.f86906d, this.f86907e);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d(getHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f86908f;
        int i13 = f86903h;
        xd.a aVar = this.f86905c;
        super.setMeasuredDimension(((i12 + i13) * 2) + getPaddingLeft() + getPaddingRight(), View.resolveSize(((int) Math.ceil(aVar.f86901b + aVar.f86902c + (i13 * 2))) + getPaddingTop() + getPaddingBottom(), i11));
    }

    public void setIndicatorColor(@ColorInt int i10) {
        this.f86907e.setColor(i10);
    }
}
