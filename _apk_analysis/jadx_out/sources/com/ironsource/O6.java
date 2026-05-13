package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3978d4;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public class O6 implements Runnable {
    public static final String M = "sdkVersion";
    public static final String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private Context K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30045a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30046b = "bundleId";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30047c = Z7.L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30048d = "isLimitAdTrackingEnabled";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30049e = "appKey";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f30050f = "deviceOS";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f30051g = "osVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f30052h = "connectionType";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f30053i = "rawConnectionType";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f30054j = "language";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f30055k = "deviceOEM";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f30056l = "deviceModel";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f30057m = C3978d4.j.f31411r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f30058n = C3949bb.f31043r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f30059o = C3949bb.f31044s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f30060p = "battery";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f30061q = "gmtMinutesOffset";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f30062r = "appVersion";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f30063s = JsonStorageKeyNames.SESSION_ID_KEY;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f30064t = "pluginType";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f30065u = "pluginVersion";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f30066v = "plugin_fw_v";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f30067w = C3949bb.f31046u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f30068x = C3949bb.f31045t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f30069y = Q6.f30210a1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f30070z = C3949bb.f31048w;
    private final String A = "mcc";
    private final String B = "mnc";
    private final String C = "icc";
    private final String D = "tz";
    private final String E = "auid";
    private final String F = "userLat";
    private final String G = "publisherAPI";
    private final String H = "missingDependencies";
    private final String I = "missingManifest";
    private final String J = "other";
    private final B7 L = Lb.U().i();

    private O6() {
    }

    public O6(Context context) {
        this.K = context.getApplicationContext();
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? "missingDependencies" : !C3925a5.f30911a.b() ? "publisherAPI" : !this.L.g(this.K) ? "missingManifest" : Boolean.parseBoolean(str) ? "userLat" : "other";
    }

    private Map<String, Object> a() {
        String str;
        boolean z10;
        HashMap map = new HashMap();
        map.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.d());
        String strE = e();
        if (!TextUtils.isEmpty(strE)) {
            map.put("bundleId", strE);
            String strB = C1.b(this.K, strE);
            if (!TextUtils.isEmpty(strB)) {
                map.put("appVersion", strB);
            }
        }
        map.put("appKey", c());
        String strI = this.L.I(this.K);
        String strB2 = this.L.b(this.K);
        boolean z11 = false;
        if (TextUtils.isEmpty(strI)) {
            String strM = this.L.M(this.K);
            str = !TextUtils.isEmpty(strM) ? IronSourceConstants.TYPE_UUID : "";
            z10 = true;
            strI = strM;
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z10 = false;
        }
        if (!TextUtils.isEmpty(strI)) {
            map.put(Z7.L, strI);
            map.put(C3949bb.f31045t, str);
        }
        if (!TextUtils.isEmpty(strB2)) {
            z11 = Boolean.parseBoolean(strB2);
            map.put("isLimitAdTrackingEnabled", Boolean.valueOf(z11));
        }
        if (z10 || z11) {
            map.put(N, a(strB2));
        }
        map.put("deviceOS", h());
        if (!TextUtils.isEmpty(b())) {
            map.put("osVersion", b());
        }
        String strA = IronSourceUtils.a(this.K);
        if (!TextUtils.isEmpty(strA)) {
            map.put("connectionType", strA);
        }
        String strD = C3924a4.d(this.K);
        if (!TextUtils.isEmpty(strD)) {
            map.put("rawConnectionType", strD);
        }
        map.put("sdkVersion", r());
        String strL = l();
        if (!TextUtils.isEmpty(strL)) {
            map.put("language", strL);
        }
        String strG = g();
        if (!TextUtils.isEmpty(strG)) {
            map.put("deviceOEM", strG);
        }
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            map.put("deviceModel", strF);
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            map.put(C3978d4.j.f31411r, strN);
        }
        map.put(C3949bb.f31044s, Long.valueOf(k()));
        map.put(C3949bb.f31043r, Long.valueOf(i()));
        map.put("battery", Integer.valueOf(d()));
        int iJ = j();
        if (a(iJ)) {
            map.put("gmtMinutesOffset", Integer.valueOf(iJ));
        }
        String strP = p();
        if (!TextUtils.isEmpty(strP)) {
            map.put("pluginType", strP);
        }
        String strQ = q();
        if (!TextUtils.isEmpty(strQ)) {
            map.put("pluginVersion", strQ);
        }
        String strO = o();
        if (!TextUtils.isEmpty(strO)) {
            map.put("plugin_fw_v", strO);
        }
        String strValueOf = String.valueOf(this.L.p());
        if (!TextUtils.isEmpty(strValueOf)) {
            map.put(C3949bb.f31046u, strValueOf);
        }
        String strM2 = m();
        if (!TextUtils.isEmpty(strM2)) {
            map.put(Q6.f30210a1, strM2);
        }
        String strValueOf2 = String.valueOf(IronSourceUtils.c(this.K));
        if (!TextUtils.isEmpty(strValueOf2)) {
            map.put(C3949bb.f31048w, strValueOf2);
        }
        String strD2 = this.L.d(this.K);
        if (!TextUtils.isEmpty(strD2)) {
            map.put("auid", strD2);
        }
        map.put("mcc", Integer.valueOf(Z3.b(this.K)));
        map.put("mnc", Integer.valueOf(Z3.c(this.K)));
        String strG2 = this.L.G(this.K);
        if (!TextUtils.isEmpty(strG2)) {
            map.put("icc", strG2);
        }
        String strD3 = this.L.d();
        if (!TextUtils.isEmpty(strD3)) {
            map.put("tz", strD3);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + map);
        return map;
    }

    private boolean a(int i10) {
        return i10 <= P && i10 >= Q && i10 % 15 == 0;
    }

    private String b() {
        try {
            String str = Build.VERSION.RELEASE;
            return "" + Build.VERSION.SDK_INT + "(" + str + ")";
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return "";
        }
    }

    private String c() {
        return com.ironsource.mediationsdk.r.m().n();
    }

    private int d() {
        try {
            Intent intentRegisterReceiver = this.K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f30045a + ":getBatteryLevel()", e10);
            return -1;
        }
    }

    private String e() {
        try {
            return this.K.getPackageName();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return "";
        }
    }

    private String h() {
        return C3978d4.f31183d;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f30045a + ":getGmtMinutesOffset()", e10);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return "";
        }
    }

    private String m() {
        return com.ironsource.mediationsdk.r.m().p();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.K.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            return !networkOperatorName.equals("") ? networkOperatorName : "";
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.f30045a + ":getMobileCarrier()", e10);
            return "";
        }
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e10);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e10);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e10);
            return "";
        }
    }

    private String r() {
        return LevelPlay.getSdkVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            N6.a().a(a());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e10);
        }
    }
}
