package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4998o extends A7 implements ActivityLifecycleRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f67385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile EnumC4973n f67386b = EnumC4973n.f67313d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5059qa f67387c = new C5059qa(true);

    @NonNull
    @AnyThread
    public final EnumC4973n a() {
        return this.f67386b;
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f67387c.f67572a.get(activityEvent);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }

    @AnyThread
    public final synchronized void a(@NonNull Application application) {
        if (this.f67385a == null) {
            this.f67385a = application;
        }
        b();
    }

    @AnyThread
    public final synchronized void a(@NonNull Context context) {
        if (this.f67385a == null) {
            try {
                this.f67385a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC4973n enumC4973n = this.f67386b;
        EnumC4973n enumC4973n2 = EnumC4973n.f67311b;
        if (enumC4973n != enumC4973n2 && !this.f67387c.f67572a.isEmpty()) {
            if (this.f67385a == null) {
                this.f67386b = EnumC4973n.f67312c;
            } else {
                this.f67386b = enumC4973n2;
                this.f67385a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.f67386b == EnumC4973n.f67311b && this.f67387c.f67572a.isEmpty()) {
            this.f67386b = EnumC4973n.f67313d;
            Application application = this.f67385a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a(activity, ActivityEvent.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        a(activity, ActivityEvent.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(@NonNull Activity activity) {
        a(activity, ActivityEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(@NonNull Activity activity) {
        a(activity, ActivityEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        a(activity, ActivityEvent.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        a(activity, ActivityEvent.STOPPED);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0006 A[Catch: all -> 0x001d, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000a, B:9:0x000e, B:10:0x0018, B:6:0x0006), top: B:16:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @androidx.annotation.AnyThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void registerListener(@androidx.annotation.NonNull io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener r5, @androidx.annotation.NonNull io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent... r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 == 0) goto L6
            int r0 = r6.length     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto La
        L6:
            io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent[] r6 = io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.values()     // Catch: java.lang.Throwable -> L1d
        La:
            int r0 = r6.length     // Catch: java.lang.Throwable -> L1d
            r1 = 0
        Lc:
            if (r1 >= r0) goto L18
            r2 = r6[r1]     // Catch: java.lang.Throwable -> L1d
            io.appmetrica.analytics.impl.qa r3 = r4.f67387c     // Catch: java.lang.Throwable -> L1d
            r3.a(r2, r5)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            goto Lc
        L18:
            r4.b()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return
        L1d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4998o.registerListener(io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0006 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000a, B:9:0x000e, B:11:0x001c, B:13:0x0022, B:15:0x0028, B:17:0x002c, B:18:0x0031, B:19:0x0036, B:20:0x0039, B:6:0x0006), top: B:26:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @androidx.annotation.AnyThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void unregisterListener(@androidx.annotation.NonNull io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener r7, @androidx.annotation.NonNull io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent... r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r8 == 0) goto L6
            int r0 = r8.length     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto La
        L6:
            io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent[] r8 = io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent.values()     // Catch: java.lang.Throwable -> L3e
        La:
            int r0 = r8.length     // Catch: java.lang.Throwable -> L3e
            r1 = 0
        Lc:
            if (r1 >= r0) goto L39
            r2 = r8[r1]     // Catch: java.lang.Throwable -> L3e
            io.appmetrica.analytics.impl.qa r3 = r6.f67387c     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r4 = r3.f67572a     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L36
            boolean r5 = r4.remove(r7)     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L36
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L31
            boolean r5 = r3.f67573b     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L31
            java.util.HashMap r3 = r3.f67572a     // Catch: java.lang.Throwable -> L3e
            r3.remove(r2)     // Catch: java.lang.Throwable -> L3e
        L31:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3e
        L36:
            int r1 = r1 + 1
            goto Lc
        L39:
            r6.c()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return
        L3e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4998o.unregisterListener(io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener, io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent[]):void");
    }
}
