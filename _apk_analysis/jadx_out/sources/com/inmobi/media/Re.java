package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Re {
    public static EnumC3273a6 a() {
        EnumC3273a6 enumC3273a6A;
        Context context = Ji.f25747a;
        if (context == null) {
            return EnumC3273a6.f26748h;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            tn.p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            enumC3273a6A = a((ConnectivityManager) systemService);
        } catch (Exception e10) {
            tn.p.j("Re", "TAG");
            e10.getMessage();
            enumC3273a6A = EnumC3273a6.f26752l;
        }
        if (enumC3273a6A != null) {
            return enumC3273a6A;
        }
        if (b()) {
            return EnumC3273a6.f26749i;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inmobi.media.EnumC3273a6 a(android.net.ConnectivityManager r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Re.a(android.net.ConnectivityManager):com.inmobi.media.a6");
    }

    public static boolean b() {
        Context context = Ji.f25747a;
        if (context == null) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
        } catch (Exception e10) {
            tn.p.j("Re", "TAG");
            e10.getMessage();
        }
        return false;
    }
}
