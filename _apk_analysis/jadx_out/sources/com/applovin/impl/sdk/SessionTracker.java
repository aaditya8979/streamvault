package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.n7;
import com.applovin.impl.x4;
import com.ironsource.C3978d4;
import com.squareup.picasso.Utils;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes8.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f9903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9904b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9905c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9906d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f9907e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f9908f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicLong f9909g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f9910h = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Date f9911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f9912j;

    public class a extends com.applovin.impl.b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f9907e.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (n7.h()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9916a;

        static {
            int[] iArr = new int[e.values().length];
            f9916a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9916a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9916a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        STARTED(C3978d4.i.f31332d0),
        PAUSED("paused"),
        RESUMED(Utils.VERB_RESUMED);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9921a;

        e(String str) {
            this.f9921a = str;
        }

        public String b() {
            return this.f9921a;
        }
    }

    public SessionTracker(k kVar) {
        this.f9903a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f9906d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f9906d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f9903a.O();
        if (o.a()) {
            this.f9903a.O().a("SessionTracker", "Application Paused");
        }
        this.f9908f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f9905c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f9903a.a(x4.f10849u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f9903a.a(x4.f10865w3)).longValue());
        if (this.f9911i == null || System.currentTimeMillis() - this.f9911i.getTime() >= millis) {
            this.f9903a.F().trackEvent("paused");
            if (zBooleanValue) {
                this.f9911i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f9911i = new Date();
    }

    private void d() {
        this.f9903a.O();
        if (o.a()) {
            this.f9903a.O().a("SessionTracker", "Application Resumed");
        }
        this.f9909g.set(System.currentTimeMillis());
        this.f9910h.addAndGet(this.f9909g.get() - this.f9908f.get());
        boolean zBooleanValue = ((Boolean) this.f9903a.a(x4.f10849u3)).booleanValue();
        long jLongValue = ((Long) this.f9903a.a(x4.f10857v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f9905c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f9912j == null || System.currentTimeMillis() - this.f9912j.getTime() >= millis) {
            this.f9903a.F().trackEvent(Utils.VERB_RESUMED);
            if (zBooleanValue) {
                this.f9912j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f9912j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f9908f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f9909g.get();
    }

    public e getCurrentApplicationState() {
        return this.f9906d.get() ? e.PAUSED : this.f9908f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = d.f9916a[getCurrentApplicationState().ordinal()];
        if (i10 == 1) {
            jN = k.n();
        } else if (i10 == 2) {
            jN = this.f9908f.get();
        } else {
            if (i10 != 3) {
                return -1L;
            }
            jN = this.f9909g.get();
        }
        return jCurrentTimeMillis - jN;
    }

    public int getLastTrimMemoryLevel() {
        return this.f9907e.get();
    }

    public String getSessionId() {
        return this.f9904b;
    }

    public long getTotalBackgroundDurationMillis() {
        return getCurrentApplicationState() == e.PAUSED ? this.f9910h.get() + getCurrentApplicationStateDurationMillis() : this.f9910h.get();
    }

    public boolean isApplicationPaused() {
        return this.f9906d.get();
    }

    public void pauseForClick() {
        this.f9905c.set(true);
    }

    public void resumeForClick() {
        this.f9905c.set(false);
    }
}
