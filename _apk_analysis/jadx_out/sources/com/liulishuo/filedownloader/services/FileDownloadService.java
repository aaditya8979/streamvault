package com.liulishuo.filedownloader.services;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import ba.a;
import com.yk.e.util.AdLog;
import da.b;
import ga.g;
import ga.i;
import ga.j;
import ia.c;
import ia.d;
import ia.e;
import ia.f;
import java.lang.ref.WeakReference;
import y9.c0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"Registered"})
public class FileDownloadService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f34711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f34712c;

    public static class SeparateProcessService extends FileDownloadService {
    }

    public static class SharedMainProcessService extends FileDownloadService {
    }

    public final void a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (intent.getBooleanExtra("is_foreground", false)) {
                i iVarH = a.j().h();
                if (iVarH.f() && Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel(iVarH.c(), iVarH.d(), 2);
                    NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                    if (notificationManager == null) {
                        return;
                    } else {
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                if (Build.VERSION.SDK_INT < 29) {
                    startForeground(iVarH.e(), iVarH.b(this));
                }
                if (d.f64033a) {
                    d.a(this, "run service foreground with config: %s", iVarH);
                }
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f34711b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c.b(this);
        try {
            f.T(e.a().f64034a);
            f.U(e.a().f64035b);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
        g gVar = new g();
        if (e.a().f64037d) {
            this.f34711b = new ga.e(new WeakReference(this), gVar);
        } else {
            this.f34711b = new ga.d(new WeakReference(this), gVar);
        }
        c0.a();
        c0 c0Var = new c0((b) this.f34711b);
        this.f34712c = c0Var;
        c0Var.d();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f34712c.e();
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f34711b.c(intent, i10, i11);
        a(intent);
        return 1;
    }
}
