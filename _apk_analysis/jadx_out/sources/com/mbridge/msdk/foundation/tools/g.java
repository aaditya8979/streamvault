package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.c;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSameDiTool.java */
/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f38094a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f38095b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f38096c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f38097d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f38098e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f38099f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f38100g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f38101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f38102i;

    /* JADX INFO: compiled from: BaseSameDiTool.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38103a;

        public a(Context context) {
            this.f38103a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f38103a);
                    g.a(advertisingIdInfo.getId());
                    g.f38097d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f38103a, advertisingIdInfo.getId(), g.f38097d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f38103a);
                        g.a(bVarA.a());
                        g.f38097d = bVarA.b() ? 1 : 0;
                        g.b(this.f38103a, bVarA.a(), g.f38097d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th2) {
                    q0.b("DomainSameDiTool", th2.getMessage());
                }
            }
        }
    }

    public static int a() {
        return f38097d;
    }

    public static void a(int i10) {
        f38097d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static void a(String str) {
        f38095b = k0.b(str);
        f38094a = str;
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f38099f) {
            return f38098e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f38100g = string2;
                    f38098e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("DomainSameDiTool", th2.getMessage());
        }
        f38099f = true;
        return f38098e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static boolean b(Context context) {
        try {
        } catch (Exception unused) {
            f38101h = false;
        }
        if (f38102i) {
            return f38101h;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            f38101h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
        } else {
            f38101h = true;
        }
        f38102i = true;
        return f38101h;
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f38095b) ? "" : f38095b;
        }
        if (!TextUtils.isEmpty(f38095b)) {
            return (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() || f38097d == 0) ? f38095b : "";
        }
        if (!f38096c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f38096c = true;
        }
        return "";
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f38094a) ? "" : f38094a;
        }
        if (!TextUtils.isEmpty(f38094a)) {
            return (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() || f38097d == 0) ? f38094a : "";
        }
        m0.k();
        if (!f38096c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f38096c = true;
        }
        return TextUtils.isEmpty(f38094a) ? "" : f38094a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f38100g) && !f38099f) {
            b();
        }
        return f38100g;
    }
}
