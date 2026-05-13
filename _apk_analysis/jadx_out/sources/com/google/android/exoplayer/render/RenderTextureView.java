package com.google.android.exoplayer.render;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer.render.a;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import e4.u0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class RenderTextureView extends TextureView implements com.google.android.exoplayer.render.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.InterfaceC0287a f20379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c5.a f20380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SurfaceTexture f20381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f20383g;

    public static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<Surface> f20384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<RenderTextureView> f20385b;

        public b(RenderTextureView renderTextureView, SurfaceTexture surfaceTexture) {
            this.f20385b = new WeakReference<>(renderTextureView);
            this.f20384a = new WeakReference<>(new Surface(surfaceTexture));
        }

        @Override // com.google.android.exoplayer.render.a.b
        public void a(u0 u0Var) {
            RenderTextureView renderTextureViewB = b();
            if (u0Var == null || this.f20384a == null || renderTextureViewB == null) {
                return;
            }
            SurfaceTexture ownSurfaceTexture = renderTextureViewB.getOwnSurfaceTexture();
            SurfaceTexture surfaceTexture = renderTextureViewB.getSurfaceTexture();
            boolean z10 = false;
            boolean zIsReleased = (ownSurfaceTexture == null || Build.VERSION.SDK_INT < 26) ? false : ownSurfaceTexture.isReleased();
            if (ownSurfaceTexture != null && !zIsReleased) {
                z10 = true;
            }
            if (!renderTextureViewB.g() || !z10) {
                Surface surface = this.f20384a.get();
                if (surface != null) {
                    u0Var.Z(surface);
                    renderTextureViewB.setSurface(surface);
                    Log.d("RenderTextureView", "****bindSurface****");
                    return;
                }
                return;
            }
            if (!ownSurfaceTexture.equals(surfaceTexture)) {
                renderTextureViewB.setSurfaceTexture(ownSurfaceTexture);
                Log.d("RenderTextureView", "****setSurfaceTexture****");
                return;
            }
            Surface surface2 = renderTextureViewB.getSurface();
            if (surface2 != null) {
                surface2.release();
            }
            Surface surface3 = new Surface(ownSurfaceTexture);
            u0Var.Z(surface3);
            renderTextureViewB.setSurface(surface3);
            Log.d("RenderTextureView", "****bindSurface****");
        }

        public RenderTextureView b() {
            WeakReference<RenderTextureView> weakReference = this.f20385b;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    public class c implements TextureView.SurfaceTextureListener {
        public c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            Log.d("RenderTextureView", "<---onSurfaceTextureAvailable---> : width = " + i10 + " height = " + i11);
            if (RenderTextureView.this.f20379c != null) {
                RenderTextureView.this.f20379c.c(new b(RenderTextureView.this, surfaceTexture), i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            Log.d("RenderTextureView", "***onSurfaceTextureDestroyed***");
            if (RenderTextureView.this.f20379c != null) {
                RenderTextureView.this.f20379c.a(new b(RenderTextureView.this, surfaceTexture));
            }
            return !RenderTextureView.this.f20382f;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            Log.d("RenderTextureView", "onSurfaceTextureSizeChanged : width = " + i10 + " height = " + i11);
            if (RenderTextureView.this.f20379c != null) {
                RenderTextureView.this.f20379c.b(new b(RenderTextureView.this, surfaceTexture), 0, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public RenderTextureView(Context context) {
        this(context, null);
    }

    public RenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20378b = "RenderTextureView";
        this.f20380d = new c5.a();
        setSurfaceTextureListener(new c());
        a(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // com.google.android.exoplayer.render.a
    public void a(int i10, int i11) {
        Log.d("RenderTextureView", "onUpdateVideoSize : videoWidth = " + i10 + " videoHeight = " + i11);
        this.f20380d.j(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer.render.a
    public void b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f20380d.i(i10, i11);
        requestLayout();
    }

    @Override // com.google.android.exoplayer.render.a
    public void c(int i10) {
        this.f20380d.f(i10);
        requestLayout();
    }

    @Override // com.google.android.exoplayer.render.a
    public void d(int i10) {
        this.f20380d.b(i10, this);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean g() {
        return this.f20382f;
    }

    public SurfaceTexture getOwnSurfaceTexture() {
        return this.f20381e;
    }

    @Override // com.google.android.exoplayer.render.a
    public View getRenderView() {
        return this;
    }

    @Override // com.google.android.exoplayer.render.a
    public int getResizeMode() {
        return this.f20380d.e();
    }

    public Surface getSurface() {
        return this.f20383g;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("RenderTextureView", "onTextureViewAttachedToWindow");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("RenderTextureView", "onTextureViewDetachedFromWindow");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.f20380d.a(i10, i11);
        setMeasuredDimension(this.f20380d.d(), this.f20380d.c());
    }

    @Override // com.google.android.exoplayer.render.a
    public void setPixelWidthHeightRatio(float f10) {
        this.f20380d.g(f10);
    }

    @Override // com.google.android.exoplayer.render.a
    public void setRenderCallback(a.InterfaceC0287a interfaceC0287a) {
        this.f20379c = interfaceC0287a;
    }

    public void setSurface(Surface surface) {
        this.f20383g = surface;
    }

    public void setTakeOverSurfaceTexture(boolean z10) {
        this.f20382f = z10;
    }

    public void setVideoRotation(int i10) {
        this.f20380d.h(i10);
        setRotation(i10);
    }
}
