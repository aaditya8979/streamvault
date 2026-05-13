package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f25887a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Kj f25888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f25889c;

    public static void a() {
        tn.p.j("Lj", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        C3850x5.f28483a.getClass();
        if (C3850x5.w()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (C3850x5.p()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f25887a.clear();
    }

    public static void a(Context context, Intent intent) {
        tn.p.j("Lj", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            tn.p.j("Lj", "TAG");
            intent.getAction();
            boolean zIsDeviceIdleMode = false;
            if (tn.p.f("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != f25889c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            zIsDeviceIdleMode = true;
                        }
                        f25889c = zIsDeviceIdleMode;
                        tn.p.j("Lj", "TAG");
                        ((C3857xc) Ji.f25751e.getValue()).b(new I2(10, 4, f25889c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (bo.a0.J("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                Object systemService2 = context.getSystemService("power");
                PowerManager powerManager = systemService2 instanceof PowerManager ? (PowerManager) systemService2 : null;
                if (powerManager != null) {
                    C3850x5.f28483a.getClass();
                    if (C3850x5.w()) {
                        zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
                    }
                }
                if (zIsDeviceIdleMode != f25889c) {
                    C3850x5.f28483a.getClass();
                    if (C3850x5.w()) {
                        tn.p.j("Lj", "TAG");
                        ((C3857xc) Ji.f25751e.getValue()).b(new I2(11, 4, String.valueOf(zIsDeviceIdleMode)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (tn.p.f("android.intent.action.USER_PRESENT", intent.getAction())) {
                tn.p.j("Lj", "TAG");
                ((C3857xc) Ji.f25751e.getValue()).b(new I2(100, 6, (String) null));
                return;
            }
            if (tn.p.f("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                tn.p.j("Lj", "TAG");
                ((C3857xc) Ji.f25751e.getValue()).b(new I2(1, 6, (String) null));
                Iterator it = f25887a.entrySet().iterator();
                while (it.hasNext()) {
                    b((String) ((Map.Entry) it.next()).getKey());
                }
                f25887a.clear();
                f25888b = null;
                return;
            }
            if (!tn.p.f("android.intent.action.REBOOT", intent.getAction())) {
                tn.p.j("Lj", "TAG");
                ((C3857xc) Ji.f25751e.getValue()).b(new I2(99, 4, intent.getAction()));
                return;
            }
            tn.p.j("Lj", "TAG");
            ((C3857xc) Ji.f25751e.getValue()).b(new I2(2, 6, (String) null));
            Iterator it2 = f25887a.entrySet().iterator();
            while (it2.hasNext()) {
                b((String) ((Map.Entry) it2.next()).getKey());
            }
            f25887a.clear();
            f25888b = null;
        } catch (Exception unused) {
        }
    }

    public static void a(String str) {
        Context context = Ji.f25747a;
        if (context != null) {
            C3850x5.f28483a.getClass();
            if (!C3850x5.p() || !tn.p.f("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                ConcurrentHashMap concurrentHashMap = f25887a;
                if (concurrentHashMap.get(str) == null) {
                    Jj jj2 = new Jj();
                    concurrentHashMap.put(str, jj2);
                    F3.a(context, jj2, new IntentFilter(str));
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                Kj kj2 = new Kj();
                f25888b = kj2;
                connectivityManager.registerDefaultNetworkCallback(kj2);
            }
        }
    }

    public static void b() {
        tn.p.j("Lj", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        C3850x5.f28483a.getClass();
        if (C3850x5.w()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (C3850x5.p()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(String str) {
        Context context = Ji.f25747a;
        if (context != null) {
            C3850x5.f28483a.getClass();
            if (!C3850x5.p() || !tn.p.f("SYSTEM_CONNECTIVITY_CHANGE", str) || f25888b == null) {
                ConcurrentHashMap concurrentHashMap = f25887a;
                if (concurrentHashMap.get(str) != null) {
                    context.unregisterReceiver((BroadcastReceiver) concurrentHashMap.get(str));
                    concurrentHashMap.remove(str);
                    return;
                }
                return;
            }
            Object systemService = context.getSystemService("connectivity");
            ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                Kj kj2 = f25888b;
                tn.p.h(kj2);
                connectivityManager.unregisterNetworkCallback(kj2);
                f25888b = null;
            }
        }
    }
}
