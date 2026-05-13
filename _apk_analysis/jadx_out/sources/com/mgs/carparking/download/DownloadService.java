package com.mgs.carparking.download;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import ec.b;
import ed.k0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<String, Object> f43867b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f43868c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xb.a f43869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f43870e;

    public class a extends Binder {
        public a() {
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.f43868c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        b.a("DownloadService onCreate");
        this.f43870e = k0.a();
        this.f43869d = xb.a.a();
    }
}
