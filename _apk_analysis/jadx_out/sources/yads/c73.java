package yads;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public final class c73 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, va2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b73 f88383c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GestureDetector f88385e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f88381a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f88382b = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f88384d = 25.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile float f88386f = 3.1415927f;

    public c73(Context context, g23 g23Var) {
        this.f88383c = g23Var;
        this.f88385e = new GestureDetector(context, this);
    }

    @Override // yads.va2
    public final void a(float[] fArr, float f10) {
        this.f88386f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f88381a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f88381a.x) / this.f88384d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f88381a;
        float f12 = (y10 - pointF.y) / this.f88384d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f88386f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f88382b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        b73 b73Var = this.f88383c;
        PointF pointF3 = this.f88382b;
        g23 g23Var = (g23) b73Var;
        synchronized (g23Var) {
            float f14 = pointF3.y;
            g23Var.f89790g = f14;
            Matrix.setRotateM(g23Var.f89788e, 0, -f14, (float) Math.cos(g23Var.f89791h), (float) Math.sin(g23Var.f89791h), 0.0f);
            Matrix.setRotateM(g23Var.f89789f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((g23) this.f88383c).a(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f88385e.onTouchEvent(motionEvent);
    }
}
