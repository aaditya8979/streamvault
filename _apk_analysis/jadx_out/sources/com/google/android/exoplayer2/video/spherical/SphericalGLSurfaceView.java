package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.AnyThread;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.video.spherical.a;
import com.google.android.exoplayer2.video.spherical.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import s7.m0;
import t7.i;
import u7.h;

/* JADX INFO: loaded from: classes2.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f22962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SensorManager f22963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Sensor f22964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.video.spherical.a f22965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f22966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.exoplayer2.video.spherical.b f22967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f22968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f22969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Surface f22970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22973m;

    @VisibleForTesting
    public final class a implements GLSurfaceView.Renderer, b.a, a.InterfaceC0306a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f22974b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float[] f22977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float[] f22978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float[] f22979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f22980h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f22981i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f22975c = new float[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f22976d = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f22982j = new float[16];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final float[] f22983k = new float[16];

        public a(h hVar) {
            float[] fArr = new float[16];
            this.f22977e = fArr;
            float[] fArr2 = new float[16];
            this.f22978f = fArr2;
            float[] fArr3 = new float[16];
            this.f22979g = fArr3;
            this.f22974b = hVar;
            GlUtil.j(fArr);
            GlUtil.j(fArr2);
            GlUtil.j(fArr3);
            this.f22981i = 3.1415927f;
        }

        public final float a(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        @AnyThread
        public final void b() {
            Matrix.setRotateM(this.f22978f, 0, -this.f22980h, (float) Math.cos(this.f22981i), (float) Math.sin(this.f22981i), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f22983k, 0, this.f22977e, 0, this.f22979g, 0);
                Matrix.multiplyMM(this.f22982j, 0, this.f22978f, 0, this.f22983k, 0);
            }
            Matrix.multiplyMM(this.f22976d, 0, this.f22975c, 0, this.f22982j, 0);
            this.f22974b.c(this.f22976d, false);
        }

        @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0306a
        @BinderThread
        public synchronized void onOrientationChange(float[] fArr, float f10) {
            float[] fArr2 = this.f22977e;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f22981i = -f10;
            b();
        }

        @Override // com.google.android.exoplayer2.video.spherical.b.a
        @UiThread
        public synchronized void onScrollChange(PointF pointF) {
            this.f22980h = pointF.y;
            b();
            Matrix.setRotateM(this.f22979g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // com.google.android.exoplayer2.video.spherical.b.a
        @UiThread
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f22975c, 0, a(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.g(this.f22974b.d());
        }
    }

    public interface b {
        void onVideoSurfaceCreated(Surface surface);

        void onVideoSurfaceDestroyed(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public SphericalGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22962b = new CopyOnWriteArrayList<>();
        this.f22966f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) s7.a.e(context.getSystemService("sensor"));
        this.f22963c = sensorManager;
        Sensor defaultSensor = m0.f79487a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f22964d = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        h hVar = new h();
        this.f22968h = hVar;
        a aVar = new a(hVar);
        com.google.android.exoplayer2.video.spherical.b bVar = new com.google.android.exoplayer2.video.spherical.b(context, aVar, 25.0f);
        this.f22967g = bVar;
        this.f22965e = new com.google.android.exoplayer2.video.spherical.a(((WindowManager) s7.a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), bVar, aVar);
        this.f22971k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        Surface surface = this.f22970j;
        if (surface != null) {
            Iterator<b> it = this.f22962b.iterator();
            while (it.hasNext()) {
                it.next().onVideoSurfaceDestroyed(surface);
            }
        }
        h(this.f22969i, surface);
        this.f22969i = null;
        this.f22970j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f22969i;
        Surface surface = this.f22970j;
        Surface surface2 = new Surface(surfaceTexture);
        this.f22969i = surfaceTexture;
        this.f22970j = surface2;
        Iterator<b> it = this.f22962b.iterator();
        while (it.hasNext()) {
            it.next().onVideoSurfaceCreated(surface2);
        }
        h(surfaceTexture2, surface);
    }

    public static void h(@Nullable SurfaceTexture surfaceTexture, @Nullable Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public void d(b bVar) {
        this.f22962b.add(bVar);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void g(final SurfaceTexture surfaceTexture) {
        this.f22966f.post(new Runnable() { // from class: u7.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f85594b.f(surfaceTexture);
            }
        });
    }

    public u7.a getCameraMotionListener() {
        return this.f22968h;
    }

    public i getVideoFrameMetadataListener() {
        return this.f22968h;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f22970j;
    }

    public void i(b bVar) {
        this.f22962b.remove(bVar);
    }

    public final void j() {
        boolean z10 = this.f22971k && this.f22972l;
        Sensor sensor = this.f22964d;
        if (sensor == null || z10 == this.f22973m) {
            return;
        }
        if (z10) {
            this.f22963c.registerListener(this.f22965e, sensor, 0);
        } else {
            this.f22963c.unregisterListener(this.f22965e);
        }
        this.f22973m = z10;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22966f.post(new Runnable() { // from class: u7.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f85596b.e();
            }
        });
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f22972l = false;
        j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f22972l = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f22968h.f(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f22971k = z10;
        j();
    }
}
