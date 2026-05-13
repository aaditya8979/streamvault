package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3874y4 {
    public static final Pe a() {
        Context context = Ji.f25747a;
        if (context == null) {
            return Pe.f26130a;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            tn.p.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return Pe.f26131b;
                    }
                    Object systemService2 = context.getApplicationContext().getSystemService("wifi");
                    tn.p.i(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    int linkSpeed = ((WifiManager) systemService2).getConnectionInfo().getLinkSpeed();
                    return linkSpeed >= 10 ? Pe.f26133d : linkSpeed >= 2 ? Pe.f26132c : Pe.f26131b;
                }
                tn.p.k(context, GAMConfig.KEY_CONTEXT);
                if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                    return Pe.f26130a;
                }
                Object systemService3 = context.getSystemService("phone");
                tn.p.i(systemService3, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                int networkType = ((TelephonyManager) systemService3).getNetworkType();
                return (networkType == 1 || networkType == 2 || networkType == 4 || networkType == 7 || networkType == 11 || networkType == 16) ? Pe.f26131b : (networkType == 18 || networkType == 20) ? Pe.f26133d : Pe.f26132c;
            }
            return Pe.f26130a;
        } catch (SecurityException unused) {
            return Pe.f26130a;
        }
    }
}
