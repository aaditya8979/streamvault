package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes3.dex */
public final class er extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f89355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f89356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f89357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f89358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f89359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f89360f;

    public er(Context context, og0 og0Var) {
        super(context);
        og0Var.getClass();
        this.f89355a = og0.a(context, 34.0f);
        float fA = og0.a(context, 3.0f);
        this.f89356b = fA;
        float fA2 = og0.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f89357c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fA);
        paint2.setAntiAlias(true);
        this.f89358d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(fA2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f89359e = paint3;
        this.f89360f = 40.0f;
        a();
    }

    public final void a() {
        this.f89358d.setColor(kl3.a(SupportMenu.CATEGORY_MASK, this.f89360f));
        this.f89357c.setColor(kl3.a(-1, this.f89360f));
        this.f89359e.setColor(kl3.a(SupportMenu.CATEGORY_MASK, this.f89360f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = 2;
        float f11 = this.f89355a / f10;
        canvas.drawCircle(f11, f11, f11, this.f89357c);
        canvas.drawCircle(f11, f11, f11 - (this.f89356b / f10), this.f89358d);
        float f12 = this.f89355a / f10;
        canvas.drawText("!", f12, f12 - ((this.f89359e.ascent() + this.f89359e.descent()) / f10), this.f89359e);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) this.f89355a;
        setMeasuredDimension(i12, i12);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        this.f89360f = z10 ? 0.0f : 40.0f;
        a();
        invalidate();
    }
}
