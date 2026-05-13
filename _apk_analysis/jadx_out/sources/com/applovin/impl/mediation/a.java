package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.n7;

/* JADX INFO: loaded from: classes7.dex */
public class a extends com.applovin.impl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f8847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0147a f8850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c3 f8851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f8852f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0147a {
        void b(c3 c3Var);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.f8848b = kVar.O();
        this.f8847a = kVar.e();
        this.f8849c = n7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8848b.a("AdActivityObserver", "Cancelling...");
        }
        this.f8847a.b(this);
        this.f8850d = null;
        this.f8851e = null;
        this.f8852f = null;
    }

    public void a(c3 c3Var, InterfaceC0147a interfaceC0147a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8848b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.f8850d = interfaceC0147a;
        this.f8851e = c3Var;
        this.f8847a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f8849c) && this.f8851e.y0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8848b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f8850d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8848b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8850d.b(this.f8851e);
            }
            a();
            return;
        }
        if (this.f8852f == null) {
            this.f8852f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8848b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f8852f);
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f8852f)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8848b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f8852f);
            }
            if (this.f8850d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8848b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f8850d.b(this.f8851e);
            }
            a();
        }
    }
}
