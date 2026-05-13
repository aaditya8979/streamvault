package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC4165na;
import com.ironsource.InterfaceC4145ma;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.lifecycle.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b f32217m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f32218n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f32219o = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32220a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32221b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32222c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32223d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC4165na f32224e = EnumC4165na.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<InterfaceC4145ma> f32225f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f32226g = new Runnable() { // from class: com.ironsource.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            this.f32233b.f();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f32227h = new Runnable() { // from class: com.ironsource.lifecycle.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f32234b.g();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f32228i = new Runnable() { // from class: com.ironsource.lifecycle.e
        @Override // java.lang.Runnable
        public final void run() {
            this.f32235b.h();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f32229j = new Runnable() { // from class: com.ironsource.lifecycle.f
        @Override // java.lang.Runnable
        public final void run() {
            this.f32236b.i();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f32230k = new Runnable() { // from class: com.ironsource.lifecycle.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f32237b.j();
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a.InterfaceC0393a f32231l = new a();

    public class a implements a.InterfaceC0393a {
        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0393a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0393a
        public void b(Activity activity) {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0393a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }
    }

    private void a() {
        if (this.f32221b == 0) {
            this.f32222c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f32227h);
            this.f32224e = EnumC4165na.PAUSED;
        }
    }

    private void b() {
        if (this.f32220a == 0 && this.f32222c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f32228i);
            this.f32223d = true;
            this.f32224e = EnumC4165na.STOPPED;
        }
    }

    public static b d() {
        return f32217m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC4145ma> it = this.f32225f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC4145ma> it = this.f32225f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC4145ma> it = this.f32225f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC4145ma> it = this.f32225f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void a(Activity activity) {
        int i10 = this.f32221b - 1;
        this.f32221b = i10;
        if (i10 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f32226g, 700L);
        }
    }

    public void a(Context context) {
        Application application;
        if (!f32218n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(InterfaceC4145ma interfaceC4145ma) {
        if (!IronsourceLifecycleProvider.a() || interfaceC4145ma == null || this.f32225f.contains(interfaceC4145ma)) {
            return;
        }
        this.f32225f.add(interfaceC4145ma);
    }

    public void b(Activity activity) {
        int i10 = this.f32221b + 1;
        this.f32221b = i10;
        if (i10 == 1) {
            if (!this.f32222c) {
                IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f32226g);
                return;
            }
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f32229j);
            this.f32222c = false;
            this.f32224e = EnumC4165na.RESUMED;
        }
    }

    public void b(InterfaceC4145ma interfaceC4145ma) {
        if (this.f32225f.contains(interfaceC4145ma)) {
            this.f32225f.remove(interfaceC4145ma);
        }
    }

    public EnumC4165na c() {
        return this.f32224e;
    }

    public void c(Activity activity) {
        int i10 = this.f32220a + 1;
        this.f32220a = i10;
        if (i10 == 1 && this.f32223d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f32230k);
            this.f32223d = false;
            this.f32224e = EnumC4165na.STARTED;
        }
    }

    public void d(Activity activity) {
        this.f32220a--;
        b();
    }

    public boolean e() {
        return this.f32224e == EnumC4165na.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a aVarA = com.ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.f32231l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }
}
