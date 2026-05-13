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

/* JADX INFO: loaded from: classes5.dex */
public class m1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f8750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f8751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f8752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8753e;

    public interface a {
        void a();

        void b();
    }

    public m1(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f8749a = kVar;
        f0 f0Var = new f0();
        this.f8750b = f0Var;
        this.f8751c = f0Var.a(1);
        this.f8752d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f8749a.n0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f8750b.b(this);
        this.f8750b.b(this, this.f8751c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f8749a.O());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f8750b.b(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8750b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f8753e;
            float f11 = (f10 * 0.5f) + (fMax * 0.5f);
            this.f8753e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f8752d.a();
            } else {
                if (f10 <= -0.8f || f11 >= -0.8f) {
                    return;
                }
                this.f8752d.b();
            }
        }
    }
}
