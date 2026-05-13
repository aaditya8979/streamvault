package io.appmetrica.analytics.impl;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractServiceC5123t0 extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M1 f67709a;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        M1 m12 = this.f67709a;
        if (m12 == null) {
            tn.p.C("serviceDelegate");
            m12 = null;
        }
        return m12.a(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M1 m12 = this.f67709a;
        if (m12 == null) {
            tn.p.C("serviceDelegate");
            m12 = null;
        }
        m12.a(configuration);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (this.f67709a == null) {
            this.f67709a = new M1(this, new C5148u0(this));
        }
        M1 m12 = this.f67709a;
        if (m12 == null) {
            tn.p.C("serviceDelegate");
            m12 = null;
        }
        m12.b();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        M1 m12 = this.f67709a;
        if (m12 == null) {
            tn.p.C("serviceDelegate");
            m12 = null;
        }
        m12.c();
    }

    @Override // android.app.Service
    public void onRebind(@NotNull Intent intent) {
        super.onRebind(intent);
        M1 m12 = this.f67709a;
        if (m12 == null) {
            tn.p.C("serviceDelegate");
            m12 = null;
        }
        m12.b(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@NotNull Intent intent, int i10, int i11) {
        M1 m12 = this.f67709a;
        if (m12 == null) {
            tn.p.C("serviceDelegate");
            m12 = null;
        }
        return m12.a(intent, i10, i11);
    }

    @Override // android.app.Service
    public boolean onUnbind(@NotNull Intent intent) {
        M1 m12 = this.f67709a;
        if (m12 == null) {
            tn.p.C("serviceDelegate");
            m12 = null;
        }
        return m12.c(intent);
    }
}
