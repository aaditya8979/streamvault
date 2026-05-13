package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f10065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f10066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f10067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f10068e = new AtomicLong(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f10069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10071h;

    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f10065b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f10068e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f10069f) {
                h.this.f10067d.postDelayed(this, h.this.f10071h);
                return;
            }
            h.this.f10065b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", h.this.f10064a.z0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f10064a.D().d(d2.F0, map);
        }
    }

    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f10065b.get() != b.MONITORING) {
                return;
            }
            h.this.f10068e.set(System.currentTimeMillis());
            h.this.f10066c.postDelayed(this, h.this.f10070g);
        }
    }

    public h(k kVar) {
        this.f10064a = kVar;
        this.f10065b = new AtomicReference(n7.c(kVar) ^ true ? b.IDLE : b.INELIGIBLE);
        this.f10066c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f10067d = new Handler(handlerThread.getLooper());
    }

    private void b() {
        if (androidx.compose.animation.core.a.a(this.f10065b, b.MONITORING, b.IDLE)) {
            this.f10066c.removeCallbacksAndMessages(null);
            this.f10067d.removeCallbacksAndMessages(null);
        }
    }

    private void c() {
        if (!(((Boolean) this.f10064a.a(x4.f10725f6)).booleanValue() && this.f10064a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) && androidx.compose.animation.core.a.a(this.f10065b, b.IDLE, b.MONITORING)) {
            this.f10066c.post(new d());
            this.f10067d.postDelayed(new c(), this.f10071h / 2);
        }
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f10069f = ((Long) this.f10064a.a(x4.f10698c6)).longValue();
        this.f10070g = ((Long) this.f10064a.a(x4.f10707d6)).longValue();
        this.f10071h = ((Long) this.f10064a.a(x4.f10716e6)).longValue();
        if (((Boolean) this.f10064a.a(x4.f10725f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f10065b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f10064a.a(x4.f10689b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }
}
