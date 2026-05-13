package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C3924a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30885a = "NETWORK_TYPE_WIFI";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f30886b = "NETWORK_TYPE_VPN";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30887c = "NETWORK_TYPE_ETHERNET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f30888d = "NETWORK_TYPE_UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f30889e = "notReachable";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30890f = "PHONE_TYPE_NONE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f30891g = "NETWORK_TYPE_GPRS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f30892h = "NETWORK_TYPE_EDGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f30893i = "NETWORK_TYPE_UMTS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f30894j = "NETWORK_TYPE_CDMA";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f30895k = "NETWORK_TYPE_EVDO_0";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f30896l = "NETWORK_TYPE_EVDO_A";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f30897m = "NETWORK_TYPE_1xRTT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f30898n = "NETWORK_TYPE_HSDPA";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f30899o = "NETWORK_TYPE_HSUPA";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f30900p = "NETWORK_TYPE_HSPA";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f30901q = "NETWORK_TYPE_IDEN";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f30902r = "NETWORK_TYPE_EVDO_B";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f30903s = "NETWORK_TYPE_LTE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f30904t = "NETWORK_TYPE_EHRPD";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f30905u = "NETWORK_TYPE_HSPAP";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f30906v = "NETWORK_TYPE_GSM";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f30907w = "NETWORK_TYPE_TD_SCDMA";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f30908x = "NETWORK_TYPE_IWLAN";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f30909y = "NETWORK_TYPE_LTE_CA";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f30910z = "NETWORK_TYPE_NR";

    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    @Nullable
    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            return null;
        }
    }

    private static String a(int i10) {
        switch (i10) {
            case 0:
                return f30890f;
            case 1:
                return f30891g;
            case 2:
                return f30892h;
            case 3:
                return f30893i;
            case 4:
                return f30894j;
            case 5:
                return f30895k;
            case 6:
                return f30896l;
            case 7:
                return f30897m;
            case 8:
                return f30898n;
            case 9:
                return f30899o;
            case 10:
                return f30900p;
            case 11:
                return f30901q;
            case 12:
                return f30902r;
            case 13:
                return f30903s;
            case 14:
                return f30904t;
            case 15:
                return f30905u;
            case 16:
                return f30906v;
            case 17:
                return f30907w;
            case 18:
                return f30908x;
            case 19:
                return f30909y;
            case 20:
                return f30910z;
            default:
                return f30888d;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return c(context);
            }
            return networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? Z3.f30762a : c(context);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return IronSourceVideoBridge.jsonObjectInit();
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObjectJsonObjectInit.put(Y3.f30693a, networkCapabilities.toString());
                    jSONObjectJsonObjectInit.put(Y3.f30694b, networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObjectJsonObjectInit.put(Y3.f30695c, networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObjectJsonObjectInit.put("hasVPN", e(context));
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    @SuppressLint({"MissingPermission"})
    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return Z3.f30766e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return Z3.f30769h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return Z3.f30770i;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return Z3.f30765d;
                }
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "";
    }

    private static String c(Context context) {
        String strA = Z3.a(context);
        return TextUtils.isEmpty(strA) ? "none" : strA;
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkA = a(connectivityManager);
            if (networkA == null) {
                return f30889e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
                if (networkCapabilities == null) {
                    return f30888d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f30885a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th2) {
                C4228r4.d().a(th2);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th2);
            }
        }
        return f30888d;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }
}
