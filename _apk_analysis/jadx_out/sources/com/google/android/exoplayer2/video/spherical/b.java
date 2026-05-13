package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.google.android.exoplayer2.video.spherical.a;

/* JADX INFO: compiled from: TouchTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, a.InterfaceC0306a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f22994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f22995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetector f22996f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f22992b = new PointF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f22993c = new PointF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile float f22997g = 3.1415927f;

    /* JADX INFO: compiled from: TouchTracker.java */
    public interface a {
        void onScrollChange(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public b(Context context, a aVar, float f10) {
        this.f22994d = aVar;
        this.f22995e = f10;
        this.f22996f = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f22992b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0306a
    @BinderThread
    public void onOrientationChange(float[] fArr, float f10) {
        this.f22997g = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f22992b.x) / this.f22995e;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f22992b;
        float f12 = (y10 - pointF.y) / this.f22995e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f22997g;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f22993c;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f22994d.onScrollChange(this.f22993c);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f22994d.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f22996f.onTouchEvent(motionEvent);
    }
}
