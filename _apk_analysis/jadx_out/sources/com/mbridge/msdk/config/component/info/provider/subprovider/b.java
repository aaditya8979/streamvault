package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: NetworkStatusProvider.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f35999c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f36000d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f36001e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f36003b = new a();

    /* JADX INFO: compiled from: NetworkStatusProvider.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b.this.f36002a.getSystemService("connectivity");
                if (connectivityManager != null && b.this.a()) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(17);
                    int i10 = (networkInfo == null || !networkInfo.isConnected()) ? 0 : 1;
                    b.f36001e = i10;
                    if (i10 == 0) {
                        b.f36001e = b.this.f() ? 2 : 0;
                    }
                    if (activeNetworkInfo == null) {
                        b.f35999c = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        b.f35999c = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) b.this.f36002a.getSystemService("phone");
                    if (telephonyManager == null) {
                        b.f35999c = 0;
                        return;
                    }
                    int dataNetworkType = telephonyManager.getDataNetworkType();
                    b.f35999c = b.this.a(dataNetworkType);
                    b.f36000d = String.valueOf(dataNetworkType);
                }
            } catch (Throwable th2) {
                q0.b("NetworkStatusProvider", th2.getMessage());
                b.f35999c = 0;
                b.f36000d = "";
                b.f36001e = 0;
            }
        }
    }

    public b(Context context) {
        if (context != null) {
            this.f36002a = context;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public boolean a() {
        try {
            return this.f36002a.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f36002a.getPackageName()) == 0;
        } catch (Exception e10) {
            q0.b("NetworkStatusProvider", e10.getMessage());
            return false;
        }
    }

    public void b() {
        try {
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(this.f36003b);
            }
        } catch (Throwable th2) {
            q0.b("NetworkStatusProvider", th2.getMessage());
        }
    }

    public int c() {
        return f35999c;
    }

    public String d() {
        return f36000d;
    }

    public int e() {
        return f36001e;
    }

    public boolean f() {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = Y1.f30690f;
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Throwable th2) {
            q0.b("NetworkStatusProvider", th2.getMessage());
            return false;
        }
    }
}
