package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i23 extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f90645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SensorManager f90646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sensor f90647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wa2 f90648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f90649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ps2 f90650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceTexture f90651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Surface f90652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f90653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f90654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f90655k;

    public i23(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90645a = new CopyOnWriteArrayList();
        this.f90649e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) ni.a(context.getSystemService("sensor"));
        this.f90646b = sensorManager;
        Sensor defaultSensor = ib3.f90737a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f90647c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        ps2 ps2Var = new ps2();
        this.f90650f = ps2Var;
        g23 g23Var = new g23(this, ps2Var);
        View.OnTouchListener c73Var = new c73(context, g23Var);
        this.f90648d = new wa2(((WindowManager) ni.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), c73Var, g23Var);
        this.f90653i = true;
        setEGLContextClientVersion(2);
        setRenderer(g23Var);
        setOnTouchListener(c73Var);
    }

    public final void a() {
        Surface surface = this.f90652h;
        if (surface != null) {
            Iterator it = this.f90645a.iterator();
            while (it.hasNext()) {
                ((wn0) ((h23) it.next())).f96456a.a((Surface) null);
            }
        }
        SurfaceTexture surfaceTexture = this.f90651g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f90651g = null;
        this.f90652h = null;
    }

    public final void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f90651g;
        Surface surface = this.f90652h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f90651g = surfaceTexture;
        this.f90652h = surface2;
        Iterator it = this.f90645a.iterator();
        while (it.hasNext()) {
            ((wn0) ((h23) it.next())).f96456a.a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public final void b() {
        boolean z10 = this.f90653i && this.f90654j;
        Sensor sensor = this.f90647c;
        if (sensor == null || z10 == this.f90655k) {
            return;
        }
        if (z10) {
            this.f90646b.registerListener(this.f90648d, sensor, 0);
        } else {
            this.f90646b.unregisterListener(this.f90648d);
        }
        this.f90655k = z10;
    }

    public final void b(final SurfaceTexture surfaceTexture) {
        this.f90649e.post(new Runnable() { // from class: bt.p2
            @Override // java.lang.Runnable
            public final void run() {
                this.f6212b.a(surfaceTexture);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f90649e.post(new Runnable() { // from class: bt.o2
            @Override // java.lang.Runnable
            public final void run() {
                this.f6195b.a();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f90654j = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f90654j = true;
        b();
    }

    public void setDefaultStereoMode(int i10) {
        this.f90650f.f93760l = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.f90653i = z10;
        b();
    }
}
