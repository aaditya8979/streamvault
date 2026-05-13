package com.google.android.exoplayer.render;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.exoplayer.render.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import e4.u0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class RenderSurfaceView extends SurfaceView implements com.google.android.exoplayer.render.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.InterfaceC0287a f20374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c5.a f20375d;

    public static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<SurfaceHolder> f20376a;

        public b(SurfaceHolder surfaceHolder) {
            this.f20376a = new WeakReference<>(surfaceHolder);
        }

        @Override // com.google.android.exoplayer.render.a.b
        public void a(u0 u0Var) {
            if (u0Var == null || this.f20376a.get() == null) {
                return;
            }
            u0Var.a0(this.f20376a.get());
        }
    }

    public class c implements SurfaceHolder.Callback {
        public c() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            Log.d("RenderSurfaceView", "surfaceChanged : width = " + i11 + " height = " + i12);
            if (RenderSurfaceView.this.f20374c != null) {
                RenderSurfaceView.this.f20374c.b(new b(surfaceHolder), i10, i11, i12);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Log.d("RenderSurfaceView", "<---surfaceCreated---->");
            if (RenderSurfaceView.this.f20374c != null) {
                RenderSurfaceView.this.f20374c.c(new b(surfaceHolder), 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Log.d("RenderSurfaceView", "***surfaceDestroyed***");
            if (RenderSurfaceView.this.f20374c != null) {
                RenderSurfaceView.this.f20374c.a(new b(surfaceHolder));
            }
        }
    }

    public RenderSurfaceView(Context context) {
        this(context, null);
    }

    public RenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20373b = "RenderSurfaceView";
        this.f20375d = new c5.a();
        getHolder().addCallback(new c());
        a(480, 270);
    }

    @Override // com.google.android.exoplayer.render.a
    public void a(int i10, int i11) {
        this.f20375d.j(i10, i11);
        f(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer.render.a
    public void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f20375d.i(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer.render.a
    public void c(int i10) {
        this.f20375d.f(i10);
        requestLayout();
    }

    @Override // com.google.android.exoplayer.render.a
    public void d(int i10) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void f(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        getHolder().setFixedSize(i10, i11);
    }

    @Override // com.google.android.exoplayer.render.a
    public View getRenderView() {
        return this;
    }

    @Override // com.google.android.exoplayer.render.a
    public int getResizeMode() {
        return this.f20375d.e();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("RenderSurfaceView", "onSurfaceViewAttachedToWindow");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("RenderSurfaceView", "onSurfaceViewDetachedFromWindow");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f20375d.a(i10, i11);
        setMeasuredDimension(this.f20375d.d(), this.f20375d.c());
    }

    @Override // com.google.android.exoplayer.render.a
    public void setPixelWidthHeightRatio(float f10) {
        this.f20375d.g(f10);
    }

    @Override // com.google.android.exoplayer.render.a
    public void setRenderCallback(a.InterfaceC0287a interfaceC0287a) {
        this.f20374c = interfaceC0287a;
    }

    public void setVideoRotation(int i10) {
        Log.e("RenderSurfaceView", "surface view not support rotation ... ");
    }
}
