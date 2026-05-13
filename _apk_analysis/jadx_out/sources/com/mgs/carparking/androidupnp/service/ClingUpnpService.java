package com.mgs.carparking.androidupnp.service;

import android.content.Intent;
import android.os.IBinder;
import br.b;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import qr.e;
import yr.c;

/* JADX INFO: loaded from: classes3.dex */
public class ClingUpnpService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f42492d = null;

    public class a extends AndroidUpnpServiceImpl.b {
        public a() {
            super();
        }

        public ClingUpnpService b() {
            return ClingUpnpService.this;
        }

        @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl.b, cr.c
        public /* bridge */ /* synthetic */ b get() {
            return super.get();
        }

        @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl.b, cr.c
        public /* bridge */ /* synthetic */ c getRegistry() {
            return super.getRegistry();
        }
    }

    public hr.b c() {
        return this.f76823b.b();
    }

    public c d() {
        return this.f76823b.getRegistry();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f76824c;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f76824c = new a();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
