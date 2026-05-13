package yads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes7.dex */
public final class wa2 implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f96322a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f96323b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f96324c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f96325d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Display f96326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final va2[] f96327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f96328g;

    public wa2(Display display, va2... va2VarArr) {
        this.f96326e = display;
        this.f96327f = va2VarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f96322a, sensorEvent.values);
        float[] fArr = this.f96322a;
        int rotation = this.f96326e.getRotation();
        if (rotation != 0) {
            int i10 = 130;
            int i11 = 129;
            if (rotation == 1) {
                i10 = 2;
            } else if (rotation == 2) {
                i11 = 130;
                i10 = 129;
            } else {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i11 = 1;
            }
            float[] fArr2 = this.f96323b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f96323b, i10, i11, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f96322a, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, this.f96323b);
        SensorManager.getOrientation(this.f96323b, this.f96325d);
        float f10 = this.f96325d[2];
        Matrix.rotateM(this.f96322a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f96322a;
        if (!this.f96328g) {
            tx0.a(this.f96324c, fArr3);
            this.f96328g = true;
        }
        float[] fArr4 = this.f96323b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f96323b, 0, this.f96324c, 0);
        float[] fArr5 = this.f96322a;
        for (va2 va2Var : this.f96327f) {
            va2Var.a(fArr5, f10);
        }
    }
}
