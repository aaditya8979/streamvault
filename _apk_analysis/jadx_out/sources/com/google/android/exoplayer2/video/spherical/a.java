package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.annotation.BinderThread;
import com.vungle.ads.internal.protos.Sdk;
import u7.c;

/* JADX INFO: compiled from: OrientationListener.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f22985b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f22986c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f22987d = new float[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f22988e = new float[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Display f22989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0306a[] f22990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22991h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OrientationListener.java */
    public interface InterfaceC0306a {
        void onOrientationChange(float[] fArr, float f10);
    }

    public a(Display display, InterfaceC0306a... interfaceC0306aArr) {
        this.f22989f = display;
        this.f22990g = interfaceC0306aArr;
    }

    public static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, this.f22986c);
        SensorManager.getOrientation(this.f22986c, this.f22988e);
        return this.f22988e[2];
    }

    public final void b(float[] fArr, float f10) {
        for (InterfaceC0306a interfaceC0306a : this.f22990g) {
            interfaceC0306a.onOrientationChange(fArr, f10);
        }
    }

    public final void c(float[] fArr) {
        if (!this.f22991h) {
            c.a(this.f22987d, fArr);
            this.f22991h = true;
        }
        float[] fArr2 = this.f22986c;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f22986c, 0, this.f22987d, 0);
    }

    public final void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 130;
            int i12 = 129;
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
                i11 = 129;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i12 = 1;
            }
            float[] fArr2 = this.f22986c;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f22986c, i11, i12, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    @BinderThread
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f22985b, sensorEvent.values);
        d(this.f22985b, this.f22989f.getRotation());
        float fA = a(this.f22985b);
        e(this.f22985b);
        c(this.f22985b);
        b(this.f22985b, fA);
    }
}
