package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class ak implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f51313a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f51314b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ak f51315c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f51321i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Sensor f51316d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sensor f51317e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sensor f51318f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f51319g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f51320h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f51322j = new AtomicReference<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f51323k = 999999;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f51324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f51325b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f51326c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f51327d = null;

        public a(long j10) {
            this.f51324a = j10;
        }
    }

    private ak(Context context) {
        this.f51321i = context;
    }

    public static ak a(Context context) {
        if (f51315c == null) {
            synchronized (ak.class) {
                if (f51315c == null) {
                    f51315c = new ak(context);
                }
            }
        }
        if (f51314b) {
            f51315c.c();
        }
        return f51315c;
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f51313a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArr = aVar.f51325b;
        if (fArr != null) {
            float[] fArr2 = aVar.f51326c;
            float[] fArrA = fArr2 != null ? a(objArr, fArr, fArr2) : a(objArr, fArr);
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f51325b;
        } else {
            objArr[0] = Float.valueOf(999999.0f);
            objArr[1] = Float.valueOf(999999.0f);
            objArr[2] = Float.valueOf(999999.0f);
            objArr[4] = f51313a;
        }
        objArr[3] = Long.valueOf(aVar.f51324a);
        float[] fArr3 = aVar.f51327d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f51313a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, new float[3]);
        return new float[]{(((float) Math.toDegrees(r2[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[2])) + 360.0f) % 360.0f};
    }

    private void c() {
        if (this.f51320h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f51321i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f51316d = sensorManager.getDefaultSensor(1);
                this.f51317e = sensorManager.getDefaultSensor(2);
                this.f51318f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f51320h = true;
    }

    private void e() {
        this.f51323k = -1L;
        this.f51319g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f51321i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public void a() {
        if (!f51314b || this.f51319g) {
            return;
        }
        d();
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f51322j.get();
        if (!f51314b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f51316d == null || aVar.f51325b != null) && ((this.f51317e == null || aVar.f51326c != null) && (this.f51318f == null || aVar.f51327d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f51319g = false;
        a(objArr, aVar);
        this.f51322j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f51316d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f51321i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f51316d, 2);
                    Sensor sensor = this.f51317e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f51318f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f51323k = jCurrentTimeMillis;
                        this.f51322j.set(new a(jCurrentTimeMillis));
                        this.f51319g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f51319g;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f51322j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f51325b == null) {
                aVar.f51325b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f51326c == null) {
                aVar.f51326c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f51327d == null) {
            aVar.f51327d = sensorEvent.values;
        }
    }
}
