package com.safedk.android.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.Z7;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52924a = "LifecycleManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f52925b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f52926c = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f52927h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet<WeakReference<Activity>> f52928d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<WeakReference<Activity>> f52929e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52930f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52931g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<a> f52932i = Collections.newSetFromMap(new ConcurrentHashMap());

    private b() {
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder("{ ");
        synchronized (this.f52928d) {
            Iterator<WeakReference<Activity>> it = this.f52928d.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().get()).append(Z7.f30794r);
            }
        }
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e);
        return sb2.toString();
    }

    private void a(boolean z10) {
        this.f52931g = z10;
    }

    private boolean a(a aVar) {
        Logger.d(f52924a, "listenersContainsType started, listener is " + aVar.getClass());
        ArrayList arrayList = new ArrayList();
        if (this.f52932i != null) {
            Logger.d(f52924a, "listenersContainsType iteration listener is " + aVar.getClass());
            Iterator<a> it = this.f52932i.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getClass().getCanonicalName());
            }
        }
        return arrayList.contains(aVar.getClass().getCanonicalName());
    }

    private void b() {
        Logger.d(f52924a, "Identified background");
        a(true);
        for (a aVar : this.f52932i) {
            Logger.d(f52924a, "notifyBackground to " + aVar.getClass().getCanonicalName());
            aVar.g();
        }
    }

    private void c() {
        Logger.d(f52924a, "Identified foreground");
        a(false);
        Iterator<a> it = this.f52932i.iterator();
        while (it.hasNext()) {
            it.next().h();
        }
    }

    public static synchronized b getInstance() {
        if (f52925b == null) {
            f52925b = new b();
        }
        return f52925b;
    }

    public static void setActiveMode(boolean z10) {
        f52927h = z10;
        Logger.d(f52924a, "setting active mode to " + z10);
    }

    public void AddActivity(Activity activity) {
        this.f52928d.add(new WeakReference<>(activity));
        if (BrandSafetyUtils.d(activity.getClass())) {
            return;
        }
        this.f52929e.add(new WeakReference<>(activity));
    }

    public synchronized void clearBackgroundForegroundListeners() {
        Logger.d(f52924a, "Clearing Background Foreground listeners collection");
        this.f52932i = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public ArrayList<WeakReference<Activity>> getAppActivities() {
        return this.f52929e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.app.Activity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public Activity getForegroundActivity() {
        ?? r02;
        Throwable th2;
        ?? r32;
        String str = null;
        try {
            if (this.f52928d.size() > 0) {
                synchronized (this.f52928d) {
                    try {
                        r02 = (Activity) ((WeakReference) this.f52928d.toArray()[this.f52928d.size() - 1]).get();
                    } catch (Throwable th3) {
                        th2 = th3;
                        r32 = 0;
                    }
                    try {
                        if (r02 != 0) {
                            try {
                                str = f52924a;
                                Logger.d(f52924a, "getForegroundActivity Foreground activity is " + r02);
                            } catch (Throwable th4) {
                                th = th4;
                                r02 = r02;
                                Logger.e(f52924a, "Exception in getForegroundActivity : " + th.getMessage(), th);
                                new CrashReporter().caughtException(th);
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        r32 = r02;
                        while (true) {
                            try {
                                try {
                                    throw th2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    r02 = r32;
                                    Logger.e(f52924a, "Exception in getForegroundActivity : " + th.getMessage(), th);
                                    new CrashReporter().caughtException(th);
                                    return r02;
                                }
                            } catch (Throwable th7) {
                                th2 = th7;
                            }
                        }
                    }
                }
            } else {
                Logger.d(f52924a, "No foreground activity found");
                r02 = 0;
            }
        } catch (Throwable th8) {
            th = th8;
            r02 = str;
        }
        return r02;
    }

    public boolean isInBackground() {
        return this.f52931g;
    }

    public synchronized boolean isInterstitialActivity(Context context) {
        boolean z10 = false;
        synchronized (this) {
            if (this.f52930f != 0) {
                if (this.f52930f == System.identityHashCode(context)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (f52927h) {
            Logger.d(f52924a, "onActivityCreated " + activity.toString());
            if (BrandSafetyUtils.d(activity.getClass())) {
                return;
            }
            this.f52929e.add(new WeakReference<>(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (f52927h) {
            Logger.d(f52924a, "onActivityDestroyed " + activity.toString());
            if (BrandSafetyUtils.d(activity.getClass())) {
                SafeDK.getInstance().a(activity.toString());
            } else {
                removeActivity(activity, this.f52929e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        try {
            if (f52927h) {
                Logger.d(f52924a, "onActivityPaused " + activity.toString());
                if (BrandSafetyUtils.d(activity.getClass())) {
                    SafeDK.getInstance().b(activity);
                } else {
                    SafeDK.getInstance().e(activity);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f52924a, "onActivityPaused failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            if (f52927h) {
                Logger.d(f52924a, "onActivityResumed " + activity.toString() + ", isActive=" + f52927h + ", foregroundActivities=" + a());
                boolean zA = false;
                if (BrandSafetyUtils.d(activity.getClass())) {
                    this.f52930f = System.identityHashCode(activity);
                    zA = SafeDK.getInstance().a(activity);
                } else {
                    SafeDK.getInstance().d(activity);
                }
                if (!zA || BrandSafetyUtils.c(activity.getClass())) {
                    SafeDK.getInstance().c(activity);
                }
            }
        } catch (Throwable th2) {
            Logger.e(f52924a, "onActivityResumed failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (f52927h) {
            Logger.d(f52924a, "onActivitySaveInstanceState " + activity.toString());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (f52927h) {
                Logger.d(f52924a, "onActivityStarted " + activity.toString());
                synchronized (this.f52928d) {
                    this.f52928d.add(new WeakReference<>(activity));
                }
                if (this.f52928d.size() == 1) {
                    c();
                }
            }
        } catch (Throwable th2) {
            Logger.e(f52924a, "onActivityStarted failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        try {
            if (f52927h) {
                Logger.d(f52924a, "onActivityStopped " + activity.toString());
                synchronized (this.f52928d) {
                    removeActivity(activity, this.f52928d);
                }
                Logger.d(f52924a, "onActivityStopped foregroundActivities=" + a());
                if (this.f52928d.size() == 0) {
                    b();
                }
            }
        } catch (Throwable th2) {
            Logger.e(f52924a, "onActivityStopped failed", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public synchronized void registerBackgroundForegroundListener(a aVar) {
        try {
            if (f52927h && !this.f52932i.contains(aVar) && !a(aVar)) {
                Logger.d(f52924a, "Adding " + aVar.getClass() + " to listen to BG FG events");
                this.f52932i.add(aVar);
                if (isInBackground()) {
                    aVar.g();
                } else {
                    aVar.h();
                }
            }
        } catch (Throwable th2) {
            Logger.e(f52924a, "Failed to add listener to BG/FG events", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r5.remove(r0);
        r0.clear();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void removeActivity(android.app.Activity r4, java.util.Collection<java.lang.ref.WeakReference<android.app.Activity>> r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L1f
        L5:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L1f
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> L1f
            if (r2 != r4) goto L5
            r5.remove(r0)     // Catch: java.lang.Throwable -> L1f
            r0.clear()     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r3)
            return
        L1f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.internal.b.removeActivity(android.app.Activity, java.util.Collection):void");
    }
}
