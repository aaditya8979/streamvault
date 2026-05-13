package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes5.dex */
public class h8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f8427f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f8430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8431d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f8432e;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: com.applovin.impl.h8$a$a, reason: collision with other inner class name */
        public class C0145a implements AppLovinBroadcastManager.Receiver {
            public C0145a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                h8.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!h8.this.f8429b.m0().isApplicationPaused() || h8.this.f8428a) {
                h8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0145a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private h8(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f8432e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j10);
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f8428a = z10;
        this.f8429b = kVar;
        this.f8430c = runnable;
        f8427f.add(this);
        timer.schedule(b(), j10);
    }

    public static h8 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new h8(j10, z10, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f8430c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f8431d) {
            this.f8432e.cancel();
            this.f8430c = null;
            f8427f.remove(this);
        }
    }
}
