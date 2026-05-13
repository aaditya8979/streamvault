package com.ironsource;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class Pe {
    private static final String A = "mcc";
    private static final String B = "mnc";
    private static final String C = "icc";
    private static final String D = "mCar";
    private static final String E = "tz";
    private static final String F = "tzOff";
    private static final String G = "rvManual";
    private static final String H = "ts";
    private static final String I = "android";
    private static final String J = "impression";
    private static final String K = "placementId";
    private static final String L = "=";
    private static final String M = "&";
    public static String N = "";
    public static String O = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f30152a = "https://i-sdk.mediation.unity3d.com/sdk/v";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30153b = "?request=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30154c = "platform";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30155d = "applicationKey";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30156e = "applicationUserId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30157f = "sdkVersion";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30158g = "pluginType";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30159h = "pluginVersion";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30160i = "plugin_fw_v";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30161j = "advId";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30162k = "auid";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f30163l = "isDemandOnly";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f30164m = "serr";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f30165n = "appVer";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f30166o = "osVer";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f30167p = "devModel";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f30168q = "devMake";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f30169r = "connType";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f30170s = "rawConnType";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f30171t = "mt";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f30172u = "fs";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f30173v = "coppa";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f30174w = "dff";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f30175x = "browserUserAgent";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f30176y = "deviceLang";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f30177z = "bundleId";

    public static String a() {
        return N;
    }

    public static String a(Context context, String str, String str2, String str3, String str4, boolean z10, List<Pair<String, String>> list, boolean z11) throws UnsupportedEncodingException {
        List<String> list2;
        B7 b7I = Lb.U().i();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("platform", "android"));
        arrayList.add(new Pair("applicationKey", str));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new Pair("applicationUserId", str2));
        }
        arrayList.add(new Pair("sdkVersion", LevelPlay.getSdkVersion()));
        if (z10) {
            arrayList.add(new Pair(G, "1"));
        }
        if (!IronSourceUtils.g()) {
            arrayList.add(new Pair(f30164m, "0"));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            arrayList.add(new Pair(f30158g, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            arrayList.add(new Pair(f30159h, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            arrayList.add(new Pair(f30160i, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(new Pair(f30161j, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            arrayList.add(new Pair("mt", str4));
        }
        String strB = C1.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            arrayList.add(new Pair(f30165n, strB));
        }
        arrayList.add(new Pair(f30166o, Build.VERSION.SDK_INT + ""));
        arrayList.add(new Pair(f30168q, Build.MANUFACTURER));
        arrayList.add(new Pair(f30167p, Build.MODEL));
        arrayList.add(new Pair("fs", (IronSourceUtils.c(context) ? 1 : 0) + ""));
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C4201pa.b().c();
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f32677b)) {
            arrayList.add(new Pair(f30173v, concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f32677b).get(0)));
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f32681f)) {
            String str5 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f32681f).get(0);
            if (!TextUtils.isEmpty(str5) && str5.equalsIgnoreCase(com.ironsource.mediationsdk.metadata.a.f32685j)) {
                arrayList.add(new Pair("ts", "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f32679d)) {
            String str6 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f32679d).get(0);
            if (!TextUtils.isEmpty(str6) && str6.equalsIgnoreCase("true")) {
                arrayList.add(new Pair(f30174w, "1"));
            }
        }
        if (concurrentHashMapC.containsKey(com.ironsource.mediationsdk.metadata.a.f32680e) && (list2 = concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f32680e)) != null) {
            arrayList.add(new Pair(com.ironsource.mediationsdk.metadata.a.f32680e, list2.get(0)));
        }
        String strA = IronSourceUtils.a(context);
        if (!TextUtils.isEmpty(strA)) {
            arrayList.add(new Pair(f30169r, strA));
        }
        String strD = C3924a4.d(context);
        if (!TextUtils.isEmpty(strD)) {
            arrayList.add(new Pair(f30170s, strD));
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        String strS = b7I.s();
        if (strS.length() != 0) {
            arrayList.add(new Pair(f30175x, strS));
        }
        String str7 = null;
        try {
            str7 = b7I.c(context) + "-" + b7I.A(context);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        if (str7 != null && str7.length() != 0) {
            arrayList.add(new Pair(f30176y, str7));
        }
        arrayList.add(new Pair("bundleId", context.getPackageName()));
        arrayList.add(new Pair("mcc", "" + Z3.b(context)));
        arrayList.add(new Pair("mnc", "" + Z3.c(context)));
        String strG = b7I.G(context);
        if (!TextUtils.isEmpty(strG)) {
            arrayList.add(new Pair("icc", strG));
        }
        String strU = b7I.u(context);
        if (!TextUtils.isEmpty(strU)) {
            arrayList.add(new Pair(D, strU));
        }
        String strD2 = b7I.d();
        if (!TextUtils.isEmpty(strD2)) {
            arrayList.add(new Pair("tz", strD2));
        }
        arrayList.add(new Pair(F, "" + b7I.m()));
        String strD3 = b7I.d(context);
        if (!TextUtils.isEmpty(strD3)) {
            arrayList.add(new Pair("auid", strD3));
        }
        if (z11) {
            arrayList.add(new Pair("isDemandOnly", "1"));
        }
        arrayList.add(new Pair(Q6.f30236j0, String.valueOf(C4099k0.a())));
        String strA2 = a(arrayList);
        N = strA2;
        return a(LevelPlay.getSdkVersion()) + URLEncoder.encode(N9.e(C4196p5.b().c(), strA2), "UTF-8");
    }

    private static String a(String str) {
        return f30152a + str + f30153b;
    }

    public static String a(String str, boolean z10, int i10) throws UnsupportedEncodingException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("impression", Boolean.toString(z10)));
        arrayList.add(new Pair("placementId", Integer.toString(i10)));
        return str + "&" + a(arrayList);
    }

    private static String a(List<Pair<String, String>> list) throws UnsupportedEncodingException {
        String str = "";
        for (Pair<String, String> pair : list) {
            if (str.length() > 0) {
                str = str + "&";
            }
            str = str + ((String) pair.first) + "=" + URLEncoder.encode((String) pair.second, "UTF-8");
        }
        return str;
    }

    public static String b() {
        return O;
    }

    private static void b(String str) {
        f30152a = str;
    }

    public static void c(String str) {
        O = str;
    }
}
