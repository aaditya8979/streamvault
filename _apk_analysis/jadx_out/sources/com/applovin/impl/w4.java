package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class w4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f10617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Sensor f10618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Sensor f10619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f10621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f10622h;

    public w4(com.applovin.impl.sdk.k kVar) {
        this.f10620f = kVar;
        f0 f0Var = new f0();
        this.f10617c = f0Var;
        this.f10618d = f0Var.a(9);
        this.f10619e = f0Var.a(4);
        this.f10615a = ((Integer) kVar.a(x4.f10741h4)).intValue();
        this.f10616b = ((Float) kVar.a(x4.f10732g4)).floatValue();
    }

    public float a() {
        if (this.f10621g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f10622h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f10620f.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f10617c.b(this);
        if (((Boolean) this.f10620f.o0().a(x4.f10714e4)).booleanValue()) {
            this.f10617c.b(this, this.f10618d, (int) TimeUnit.MILLISECONDS.toMicros(this.f10615a), this.f10620f.O());
        }
        if (((Boolean) this.f10620f.o0().a(x4.f10723f4)).booleanValue()) {
            this.f10617c.b(this, this.f10619e, (int) TimeUnit.MILLISECONDS.toMicros(this.f10615a), this.f10620f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10617c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f10621g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f10622h * this.f10616b;
            this.f10622h = f10;
            this.f10622h = f10 + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }
}
