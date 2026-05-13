package com.mgs.carparking.androidupnp.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* JADX INFO: loaded from: classes9.dex */
public class SystemService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42494c = SystemService.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Binder f42495b = new a();

    public class a extends Binder {
        public a() {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f42495b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        throw null;
    }
}
