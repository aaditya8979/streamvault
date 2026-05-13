package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.config.m0;
import com.fyber.inneractive.sdk.config.p;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.ignite.l;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.o1;
import com.fyber.inneractive.sdk.util.s1;
import com.fyber.inneractive.sdk.util.y;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.b1;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class InneractiveAdManager implements r {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f16233e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Context f16234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16236c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16237d;

    public enum GdprConsentSource {
        Internal,
        External
    }

    public static void a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (d.f16266a.f16234a == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        w wVar = new w(t.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        if (!TextUtils.isEmpty(str)) {
            wVar.a("message", str);
        }
        wVar.a("init_status", fyberInitStatus.name());
        wVar.a((String) null);
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            gVar.a();
        } else {
            IAlog.f("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.O.A.f19583a = null;
    }

    public static void clearLgpdConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            gVar.b();
        } else {
            IAlog.f("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearUSPrivacyString() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            gVar.c();
        }
    }

    public static void currentAudienceAppliesToCoppa() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("currentAudienceAppliesToCoppa was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (o.f19548a == null) {
            IAlog.f("setCurrentAudienceAppliesToCoppa was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            gVar.f16021j = Boolean.TRUE;
        }
    }

    public static void currentAudienceIsAChild() {
        d.f16266a.f16236c = true;
    }

    public static void destroy() {
        l lVar;
        IAlog.a("InneractiveAdManager:destroy called", new Object[0]);
        if (d.f16266a.f16234a == null) {
            IAlog.a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        d.f16266a.f16234a = null;
        IAConfigManager.removeListener(f16233e);
        f16233e = null;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        iAConfigManager.A.f19583a = null;
        iAConfigManager.f15962h = false;
        try {
            com.fyber.inneractive.sdk.config.cellular.a aVar = iAConfigManager.N;
            if (aVar != null && aVar.f15987a != null) {
                aVar.f15989c.clear();
                aVar.f15987a.a((com.fyber.inneractive.sdk.config.cellular.h) aVar);
                aVar.f15987a.a();
            }
        } catch (Throwable th2) {
            IAlog.a("failed to destroy network watchdog", th2, new Object[0]);
        }
        com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager.E;
        if ((!TextUtils.isEmpty(hVar.f16740l)) && (lVar = hVar.f16744p) != null) {
            lVar.destroy();
            hVar.f16744p = null;
        }
        l0.f19539a.a();
        b0 b0Var = z.f19584a;
        synchronized (b0Var) {
            if (b0Var.f19515c != null) {
                IAlog.a("%sremoving screen state receiver and destroying singleton", IAlog.a(b0Var));
                try {
                    b0Var.f19515c.unregisterReceiver(b0Var.f19516d);
                } catch (Exception unused) {
                }
                b0Var.f19515c = null;
                b0Var.f19516d = null;
                b0Var.f19513a.clear();
            }
        }
        com.fyber.inneractive.sdk.factories.d.f16273a.f16274a.clear();
        com.fyber.inneractive.sdk.factories.b.f16271a.f16272a.clear();
        com.fyber.inneractive.sdk.factories.h.f16275a.f16276a.clear();
        InneractiveAdSpotManager.destroy();
        n.f19543a.clear();
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.f15832h;
        com.fyber.inneractive.sdk.bidder.f fVar = bVar.f15836d;
        if (fVar != null) {
            try {
                o.f19548a.unregisterReceiver(fVar);
            } catch (Exception unused2) {
            }
        }
        bVar.f15836d = null;
        com.fyber.inneractive.sdk.config.cellular.a aVar2 = IAConfigManager.O.N;
        if (aVar2 != null) {
            try {
                aVar2.f15989c.remove(bVar);
            } catch (Throwable th3) {
                IAlog.a("failed to remove network observer", th3, new Object[0]);
            }
        }
        com.fyber.inneractive.sdk.nativead.b.f16935f.a();
    }

    public static String getAppId() {
        return IAConfigManager.O.f15957c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return d.f16266a.f16235b;
    }

    public static Boolean getGdprConsent() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    public static GdprConsentSource getGdprStatusSource() {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar != null) {
            return gVar.f16017f;
        }
        IAlog.f("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.O.f15965k;
    }

    public static String getUserId() {
        return IAConfigManager.O.D.f16018g;
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.O.f15964j;
    }

    public static String getVersion() {
        return "8.4.1";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        String language;
        List<ResolveInfo> listQueryIntentServices;
        String str2;
        if (context == null || str == null) {
            IAlog.b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            a(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, (str == null ? "appid" : GAMConfig.KEY_CONTEXT).concat(" is null"));
            return;
        }
        String str3 = IAConfigManager.O.f15957c;
        boolean z10 = (str3 == null || str3.equalsIgnoreCase(str)) ? false : true;
        String str4 = null;
        if (d.f16266a.f16234a != null && !z10) {
            IAlog.a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        IAlog.f19502c.retainAll(Collections.singleton(IAlog.f19501b));
        int i10 = k.f16070a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
        if (property != null) {
            for (String str5 : property.split(StringUtils.COMMA)) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(str5).newInstance();
                    fMPLogger.initialize(context);
                    IAlog.f19502c.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
        o.f19548a = (Application) context.getApplicationContext();
        b0 b0Var = z.f19584a;
        Context applicationContext = context.getApplicationContext();
        b0Var.getClass();
        IAlog.a("%sinit called", IAlog.a(b0Var));
        b0Var.f19515c = applicationContext;
        b0Var.f19516d = new y(b0Var);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b0Var.f19515c.registerReceiver(b0Var.f19516d, intentFilter);
        Intent intent = new Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(o.f19548a.getPackageName());
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        List<BroadcastReceiver> listAsList = Arrays.asList(new IAMraidKit(), new IAVideoKit(), new com.fyber.inneractive.sdk.dv.g(), new com.fyber.inneractive.sdk.nativead.e());
        for (BroadcastReceiver broadcastReceiver : listAsList) {
            try {
                broadcastReceiver.onReceive(applicationContext2, intent);
            } catch (Throwable unused2) {
                IAlog.f("%sCould not trigger receiver for %s", IAlog.a(com.fyber.inneractive.sdk.b.class), broadcastReceiver);
            }
        }
        if (com.fyber.inneractive.sdk.factories.d.f16273a.f16274a.size() == 0) {
            Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        if (listAsList.size() == 0) {
            IAlog.b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        a aVar = new a(context, onFyberMarketplaceInitializedListener);
        f16233e = aVar;
        IAConfigManager.addListener(aVar);
        if (z10) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.f15957c = str;
            HashMap map = iAConfigManager.f15955a;
            if (map != null) {
                map.clear();
            }
            HashMap map2 = iAConfigManager.f15956b;
            if (map2 != null) {
                map2.clear();
            }
            iAConfigManager.f15959e = null;
            iAConfigManager.f15958d = "";
            IAConfigManager.a();
        } else {
            Context applicationContext3 = context.getApplicationContext();
            IAConfigManager iAConfigManager2 = IAConfigManager.O;
            if (!iAConfigManager2.f15962h) {
                iAConfigManager2.f15976v = new i(context, applicationContext3);
                s1 s1Var = new s1();
                iAConfigManager2.f15979y = s1Var;
                s1Var.f19565c = applicationContext3.getApplicationContext();
                com.fyber.inneractive.sdk.util.r.f19555a.execute(new o1(s1Var));
                com.fyber.inneractive.sdk.network.l0 l0Var = iAConfigManager2.f15973s;
                if (!l0Var.f16996b) {
                    l0Var.f16996b = true;
                    for (int i11 = 0; i11 < 6; i11++) {
                        l0Var.f16998d.submit(l0Var.f16999e);
                    }
                }
                b1.f19591c.getClass();
                iAConfigManager2.D = new com.fyber.inneractive.sdk.config.g();
                s sVar = new s(applicationContext3);
                iAConfigManager2.f15975u = sVar;
                iAConfigManager2.f15977w = new com.fyber.inneractive.sdk.config.t(sVar);
                IAConfigManager.O.f15973s.a(new v0(new p(sVar), sVar.f16143a, sVar.f16147e));
                iAConfigManager2.I.a((Application) applicationContext3.getApplicationContext());
                iAConfigManager2.f15975u.f16145c.add(new x(iAConfigManager2));
                iAConfigManager2.f15980z = new com.fyber.inneractive.sdk.config.global.a();
                IAlog.a("Initializing config manager", new Object[0]);
                IAlog.a("Config manager: lib name = %s", C3978d4.f31183d);
                IAlog.a("Config manager: app version = %s", "8.4.1");
                com.fyber.inneractive.sdk.config.w wVar = u.f16160a;
                if (wVar.f16167a == null) {
                    wVar.f16167a = applicationContext3;
                    new Thread(new m0(applicationContext3, wVar)).start();
                }
                if (!str.matches("[0-9]+")) {
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                    IAlog.b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                    IAlog.b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                }
                iAConfigManager2.f15960f = applicationContext3;
                iAConfigManager2.f15957c = str;
                iAConfigManager2.f15964j = new InneractiveUserConfig();
                iAConfigManager2.f15962h = true;
                x0 x0Var = iAConfigManager2.f15978x;
                x0Var.getClass();
                new com.fyber.inneractive.sdk.config.e(x0Var).a();
                x0Var.f16172c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                com.fyber.inneractive.sdk.cache.session.e eVar = new com.fyber.inneractive.sdk.cache.session.e();
                x0Var.f16170a = eVar;
                com.fyber.inneractive.sdk.cache.session.c cVar = new com.fyber.inneractive.sdk.cache.session.c(eVar);
                ThreadPoolExecutor threadPoolExecutor = com.fyber.inneractive.sdk.util.r.f19555a;
                threadPoolExecutor.execute(cVar);
                iAConfigManager2.B = new v0(new com.fyber.inneractive.sdk.config.b0(iAConfigManager2), iAConfigManager2.f15960f, new com.fyber.inneractive.sdk.config.f());
                threadPoolExecutor.execute(new d0(iAConfigManager2));
                try {
                    language = Locale.getDefault().getLanguage();
                    try {
                        IAlog.a("Available device language: %s", language);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    language = null;
                }
                iAConfigManager2.f15969o = language;
                com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager2.E;
                hVar.f16729a = applicationContext3;
                Intent intent2 = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
                Context context2 = hVar.f16729a;
                if (context2 != null && (listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent2, 0)) != null && listQueryIntentServices.size() > 0) {
                    str4 = listQueryIntentServices.get(0).serviceInfo.packageName;
                }
                hVar.f16740l = str4;
                com.fyber.inneractive.sdk.config.cellular.a aVar2 = new com.fyber.inneractive.sdk.config.cellular.a(iAConfigManager2.f15960f);
                iAConfigManager2.N = aVar2;
                com.fyber.inneractive.sdk.config.cellular.d dVar = aVar2.f15987a;
                if (dVar != null) {
                    try {
                        dVar.a(aVar2);
                    } catch (Throwable th2) {
                        IAlog.a("failed to register network detector", th2, new Object[0]);
                    }
                }
            }
        }
        d.f16266a.f16234a = context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        String string = sharedPreferences.getString("FyberExceptionKey", "empty");
        String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
        String string3 = sharedPreferences.getString("FyberNameKey", "empty");
        String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
        IAlog.a(" name- %s   description - %s exception - %s", string3, string2, string);
        if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
            IAlog.a("Firing Event 999 for %s", string);
            w wVar2 = new w(com.fyber.inneractive.sdk.network.u.IA_UNCAUGHT_EXCEPTION);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception_name", string3);
                str2 = "FyberNameKey";
            } catch (Exception unused5) {
                str2 = "FyberNameKey";
                IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", string3);
            }
            try {
                jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, string2);
            } catch (Exception unused6) {
                IAlog.f("Got exception adding param to json object: %s, %s", UnifiedMediationParams.KEY_DESCRIPTION, string2);
            }
            try {
                jSONObject.put(Z7.f30781e, string);
            } catch (Exception unused7) {
                IAlog.f("Got exception adding param to json object: %s, %s", Z7.f30781e, string);
            }
            wVar2.f17081f.put(jSONObject);
            wVar2.a(string4);
            sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove(str2).apply();
        }
        Thread.setDefaultUncaughtExceptionHandler(new b(sharedPreferences, Thread.getDefaultUncaughtExceptionHandler()));
        IAConfigManager iAConfigManager3 = IAConfigManager.O;
        iAConfigManager3.f15975u.f16145c.remove(d.f16266a);
        iAConfigManager3.f15975u.f16145c.add(d.f16266a);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    public static boolean isCurrentUserAChild() {
        return d.f16266a.f16236c;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        d.f16266a.f16235b = str;
    }

    public static void setGdprConsent(boolean z10) {
        setGdprConsent(z10, GdprConsentSource.Internal);
    }

    public static void setGdprConsent(boolean z10, GdprConsentSource gdprConsentSource) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f19548a == null) {
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f16012a = Boolean.valueOf(z10);
        if (!gVar.a(z10, "IAGDPRBool")) {
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
        gVar.f16017f = gdprConsentSource;
        if (gVar.a("IAGdprSource", gdprConsentSource.name())) {
            return;
        }
        IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
    }

    public static void setGdprConsentString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f19548a == null) {
            IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f16015d = str;
        if (gVar.a("IAGdprConsentData", str)) {
            return;
        }
        IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.O.A.f19583a = onGlobalImpressionDataListener;
    }

    public static void setLgpdConsent(boolean z10) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f19548a == null) {
            IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f16020i = Boolean.valueOf(z10);
        if (gVar.a(z10, "IALgpdConsentStatus")) {
            return;
        }
        IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
    }

    public static void setLogLevel(int i10) {
        IAlog.f19500a = i10;
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.f15967m = inneractiveMediationName;
            iAConfigManager.f15966l = inneractiveMediationName.getKey();
        }
    }

    public static void setMediationName(String str) {
        IAConfigManager.O.f15966l = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.O.f15968n = str;
        }
    }

    public static void setMuteVideo(boolean z10) {
        IAConfigManager.O.f15965k = z10;
    }

    public static void setUSPrivacyString(String str) {
        com.fyber.inneractive.sdk.config.g gVar = IAConfigManager.O.D;
        if (gVar == null) {
            IAlog.f("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f19548a == null) {
            IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        gVar.f16019h = str;
        if (gVar.a("IACCPAConsentData", str)) {
            return;
        }
        IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
    }

    public static void setUseLocation(boolean z10) {
        IAConfigManager.O.getClass();
    }

    public static void setUserId(String str) {
        if (o.f19548a != null) {
            IAConfigManager.O.D.a(str);
        } else {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            IAlog.f("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.O.f15964j = inneractiveUserConfig;
        IAlog.a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z10) {
        IAConfigManager.O.f15971q = z10;
        IAlog.a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z10));
        if (com.fyber.inneractive.sdk.util.s.a() || z10) {
            return;
        }
        IAlog.f("************************************************************************************************************************", new Object[0]);
        IAlog.f("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.f("***  The traffic will be Secured  ", new Object[0]);
        IAlog.f("************************************************************************************************************************", new Object[0]);
    }

    public static boolean wasInitialized() {
        return d.f16266a.f16234a != null;
    }

    public Context getAppContext() {
        return this.f16234a;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public void onGlobalConfigChanged(s sVar, com.fyber.inneractive.sdk.config.o oVar) {
        if (oVar == null || !oVar.a(false, GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT)) {
            return;
        }
        com.fyber.inneractive.sdk.util.r.f19556b.post(new c());
    }
}
