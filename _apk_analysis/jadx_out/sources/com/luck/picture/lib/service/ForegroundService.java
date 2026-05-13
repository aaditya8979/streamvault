package com.luck.picture.lib.service;

import ab.l;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import ma.e;

/* JADX INFO: loaded from: classes5.dex */
public class ForegroundService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f35129b = "com.luck.picture.lib." + ForegroundService.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f35130c = false;

    public static void c(Context context) {
        try {
            if (!f35130c && PictureSelectionConfig.e().f35030q0) {
                Intent intent = new Intent(context, (Class<?>) ForegroundService.class);
                if (l.d()) {
                    context.startForegroundService(intent);
                } else {
                    context.startService(intent);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void stopService(Context context) {
        try {
            if (f35130c) {
                context.stopService(new Intent(context, (Class<?>) ForegroundService.class));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final Notification a() {
        int i10 = l.a() ? 4 : 0;
        if (l.d()) {
            NotificationChannel notificationChannel = new NotificationChannel(f35129b, "com.luck.picture.lib", i10);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.canBypassDnd();
            notificationChannel.setBypassDnd(true);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
        return new NotificationCompat.Builder(this, f35129b).setSmallIcon(R$drawable.ps_ic_trans_1px).setContentTitle(b()).setContentText(getString(PictureSelectionConfig.e().f34999b == e.b() ? R$string.ps_use_sound : R$string.ps_use_camera)).setOngoing(true).build();
    }

    public final String b() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(1, a());
    }

    @Override // android.app.Service
    public void onDestroy() {
        f35130c = false;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        f35130c = true;
        return super.onStartCommand(intent, i10, i11);
    }
}
