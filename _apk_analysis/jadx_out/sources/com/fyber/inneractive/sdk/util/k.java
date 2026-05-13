package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.ironsource.Z7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends o {
    public static String i() {
        try {
            return ((TelephonyManager) o.f19548a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String j() {
        return Build.MANUFACTURER + Z7.f30794r + Build.MODEL;
    }

    public static int k() {
        try {
            if (o.a("android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) o.f19548a.getSystemService("phone")).getDataNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String l() {
        try {
            return o.f19548a.getPackageManager().getPackageInfo(o.f19548a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean m() {
        boolean z10 = (o.f19548a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.e("This device has a tablet resolution? %s", Boolean.valueOf(z10));
        return z10;
    }

    public static boolean n() {
        TelephonyManager telephonyManager = (TelephonyManager) o.f19548a.getSystemService("phone");
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
