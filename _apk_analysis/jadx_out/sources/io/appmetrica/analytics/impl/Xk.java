package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.C4859ic;

/* JADX INFO: loaded from: classes9.dex */
public final class Xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4998o f66182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4979n5 f66183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f66184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f66185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5048q f66186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4948m f66187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f66188g;

    public Xk(C4998o c4998o, C4948m c4948m) {
        this(c4998o, c4948m, new C4979n5(), new C5048q());
    }

    public Xk(C4998o c4998o, C4948m c4948m, C4979n5 c4979n5, C5048q c5048q) {
        this.f66188g = false;
        this.f66182a = c4998o;
        this.f66187f = c4948m;
        this.f66183b = c4979n5;
        this.f66186e = c5048q;
        this.f66184c = new ActivityLifecycleListener() { // from class: mh.w
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f74303a.a(activity, activityEvent);
            }
        };
        this.f66185d = new ActivityLifecycleListener() { // from class: mh.x
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                this.f74305a.b(activity, activityEvent);
            }
        };
    }

    public final synchronized EnumC4973n a() {
        if (!this.f66188g) {
            this.f66182a.registerListener(this.f66184c, ActivityEvent.RESUMED);
            this.f66182a.registerListener(this.f66185d, ActivityEvent.PAUSED);
            this.f66188g = true;
        }
        return this.f66182a.f67386b;
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C4979n5 c4979n5 = this.f66183b;
            InterfaceC4680be interfaceC4680be = new InterfaceC4680be() { // from class: mh.y
                @Override // io.appmetrica.analytics.impl.InterfaceC4680be
                public final void consume(Object obj) {
                    this.f74306a.a(activity, (C4859ic) obj);
                }
            };
            c4979n5.getClass();
            C4696c4.l().f66453c.a().execute(new RunnableC4954m5(c4979n5, interfaceC4680be));
        }
    }

    public final void a(Activity activity, C4859ic c4859ic) {
        if (this.f66188g && this.f66186e.a(activity, EnumC5023p.RESUMED)) {
            c4859ic.a(activity);
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C4979n5 c4979n5 = this.f66183b;
            InterfaceC4680be interfaceC4680be = new InterfaceC4680be() { // from class: mh.v
                @Override // io.appmetrica.analytics.impl.InterfaceC4680be
                public final void consume(Object obj) {
                    this.f74301a.b(activity, (C4859ic) obj);
                }
            };
            c4979n5.getClass();
            C4696c4.l().f66453c.a().execute(new RunnableC4954m5(c4979n5, interfaceC4680be));
        }
    }

    public final void b(Activity activity, C4859ic c4859ic) {
        if (this.f66188g && this.f66186e.a(activity, EnumC5023p.PAUSED)) {
            c4859ic.b(activity);
        }
    }
}
