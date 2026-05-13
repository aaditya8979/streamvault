package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes12.dex */
public final class mq extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f92499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij1 f92500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f92502d;

    public mq(Context context, og0 og0Var, ij1 ij1Var) {
        super(context);
        this.f92499a = og0Var;
        this.f92500b = ij1Var;
        og0Var.getClass();
        this.f92501c = og0.a(context, 0.5f);
        this.f92502d = new Paint();
        a(context);
    }

    public final void a(Context context) {
        this.f92499a.getClass();
        int iA = og0.a(context, 1.0f);
        this.f92502d.setStyle(Paint.Style.STROKE);
        this.f92502d.setStrokeWidth(iA);
        this.f92502d.setColor(SupportMenu.CATEGORY_MASK);
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = this.f92501c;
        canvas.drawRect(f10, f10, getWidth() - this.f92501c, getHeight() - this.f92501c, this.f92502d);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object parent = getParent();
        if (!(parent instanceof View)) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        View view = (View) parent;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        setLeft(0);
        setTop(0);
        setRight(measuredWidth);
        setBottom(measuredHeight);
        super.onLayout(z10, 0, 0, measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f92500b.a(i10, i11);
        super.onMeasure(hj1VarA.f90433a, hj1VarA.f90434b);
    }

    public final void setColor(int i10) {
        if (this.f92502d.getColor() != i10) {
            this.f92502d.setColor(i10);
            requestLayout();
        }
    }
}
