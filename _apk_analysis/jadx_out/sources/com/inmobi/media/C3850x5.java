package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.inmobi.media.C3850x5;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3978d4;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3850x5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f28486d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f28488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I1 f28489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pair f28491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f28492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f28493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f28494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile boolean f28495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static volatile long f28496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bn.g f28497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final bn.g f28498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final bn.g f28499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final JSONArray f28500r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28484b = {tn.t.i(new PropertyReference1Impl(C3850x5.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0)), tn.t.i(new PropertyReference1Impl(C3850x5.class, "curDeviceVolume", "getCurDeviceVolume()I", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3850x5 f28483a = new C3850x5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f28485c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28487e = C3850x5.class.getSimpleName();

    static {
        int i10 = 15;
        f28488f = new I1(i10, new sn.a() { // from class: n9.cc
            @Override // sn.a
            public final Object invoke() {
                return Integer.valueOf(C3850x5.A());
            }
        }, 12);
        f28489g = new I1(i10, new sn.a() { // from class: n9.dc
            @Override // sn.a
            public final Object invoke() {
                return Integer.valueOf(C3850x5.b());
            }
        }, 8);
        String str = Build.VERSION.RELEASE;
        tn.p.j(str, "RELEASE");
        f28490h = str;
        int i11 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        f28491i = new Pair("d-api-lev", sb2.toString());
        String str2 = Build.MANUFACTURER;
        tn.p.j(str2, "MANUFACTURER");
        f28492j = str2;
        String str3 = Build.MODEL;
        tn.p.j(str3, "MODEL");
        f28493k = str3;
        String str4 = Build.HARDWARE;
        tn.p.j(str4, "HARDWARE");
        f28494l = str4;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f28497o = kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: n9.ec
            @Override // sn.a
            public final Object invoke() {
                return C3850x5.B();
            }
        });
        f28498p = kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: n9.fc
            @Override // sn.a
            public final Object invoke() {
                return Boolean.valueOf(C3850x5.c());
            }
        });
        bn.g gVarA = kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: n9.gc
            @Override // sn.a
            public final Object invoke() {
                return C3850x5.a();
            }
        });
        f28499q = gVarA;
        f28500r = (JSONArray) gVarA.getValue();
    }

    public static final int A() {
        Context context = Ji.f25747a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    public static final C3800v5 B() {
        String str;
        f28483a.getClass();
        try {
            Context context = Ji.f25747a;
            if (context == null) {
                return new C3800v5(null, false);
            }
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = packageManager.getApplicationEnabledSetting("com.android.vending") >= 2;
            try {
                str = packageManager.getPackageInfo("com.android.vending", 0).versionName;
                if (str == null) {
                    str = "";
                }
            } catch (Exception unused) {
                str = null;
            }
            return new C3800v5(str, z10);
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            return new C3800v5(null, false);
        }
    }

    public static void C() {
        Runnable runnable = new Runnable() { // from class: n9.yb
            @Override // java.lang.Runnable
            public final void run() {
                C3850x5.D();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void D() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            f28485c = availableBytes / ((long) 1048576);
        } catch (Exception e10) {
            AbstractC3481i9.a(e10);
        }
    }

    public static void E() {
        Runnable runnable = new Runnable() { // from class: n9.bc
            @Override // java.lang.Runnable
            public final void run() {
                C3850x5.F();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void F() {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        tn.p.i(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3978d4.a.f31215k);
        tn.p.i(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        tn.p.j(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            try {
                UUID uuidFromString = UUID.fromString(String.valueOf(storageVolume.getUuid()));
                tn.p.h(uuidFromString);
                if (storageVolume.getState().equals("mounted")) {
                    try {
                        freeBytes += storageStatsManager.getFreeBytes(uuidFromString);
                    } catch (Exception e10) {
                        L2 l22 = new L2(e10);
                        bn.g gVar = P9.f26117a;
                        P9.a(l22);
                    }
                }
            } catch (Exception unused) {
            }
        }
        f28485c = freeBytes / ((long) 1048576);
    }

    public static void G() {
        Runnable runnable = new Runnable() { // from class: n9.hc
            @Override // java.lang.Runnable
            public final void run() {
                C3850x5.H();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void H() {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        tn.p.i(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3978d4.a.f31215k);
        tn.p.i(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        tn.p.j(storageVolumes, "getStorageVolumes(...)");
        long freeBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    freeBytes += storageStatsManager.getFreeBytes(storageUuid);
                } catch (Exception e10) {
                    L2 l22 = new L2(e10);
                    bn.g gVar = P9.f26117a;
                    P9.a(l22);
                }
            }
        }
        f28485c = freeBytes / ((long) 1048576);
    }

    public static void I() {
        Runnable runnable = new Runnable() { // from class: n9.ac
            @Override // java.lang.Runnable
            public final void run() {
                C3850x5.J();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void J() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            float blockCountLong2 = (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(blockCountLong / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            f28486d = sb2.toString();
        } catch (Exception e10) {
            AbstractC3481i9.a(e10);
        }
    }

    public static void K() {
        Runnable runnable = new Runnable() { // from class: n9.zb
            @Override // java.lang.Runnable
            public final void run() {
                C3850x5.L();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void L() {
        UUID uuidFromString;
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        tn.p.i(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3978d4.a.f31215k);
        tn.p.i(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        tn.p.j(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            String uuid = storageVolume.getUuid();
            if (uuid == null) {
                uuidFromString = StorageManager.UUID_DEFAULT;
                tn.p.h(uuidFromString);
            } else {
                try {
                    uuidFromString = UUID.fromString(uuid);
                    tn.p.h(uuidFromString);
                } catch (Exception unused) {
                }
            }
            if (storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManager.getTotalBytes(uuidFromString);
                } catch (Exception e10) {
                    L2 l22 = new L2(e10);
                    bn.g gVar = P9.f26117a;
                    P9.a(l22);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(totalBytes / ((long) 1048576));
        f28486d = sb2.toString();
    }

    public static void M() {
        Runnable runnable = new Runnable() { // from class: n9.ic
            @Override // java.lang.Runnable
            public final void run() {
                C3850x5.N();
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void N() {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("storagestats");
        tn.p.i(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
        Object systemService2 = context.getSystemService(C3978d4.a.f31215k);
        tn.p.i(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        List<StorageVolume> storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        tn.p.j(storageVolumes, "getStorageVolumes(...)");
        long totalBytes = 0;
        for (StorageVolume storageVolume : storageVolumes) {
            UUID storageUuid = storageVolume.getStorageUuid();
            if (storageUuid != null && storageVolume.getState().equals("mounted")) {
                try {
                    totalBytes += storageStatsManager.getTotalBytes(storageUuid);
                } catch (Exception e10) {
                    L2 l22 = new L2(e10);
                    bn.g gVar = P9.f26117a;
                    P9.a(l22);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(totalBytes / ((long) 1048576));
        f28486d = sb2.toString();
    }

    public static final JSONArray a() {
        f28483a.getClass();
        Context context = Ji.f25747a;
        if (context != null) {
            try {
                C3476i4 c3476i4 = Y3.f26611a;
                tn.p.k(SignalsConfig.class, "clazz");
                SignalsConfig signalsConfig = (SignalsConfig) Y3.f26611a.a(SignalsConfig.class);
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "boot_time");
                tn.p.k("bt", "key");
                JSONArray jSONArray = new JSONArray(eaA.f25373a.getString("bt", "[]"));
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                Long lValueOf = jSONArray.length() > 0 ? Long.valueOf(jSONArray.optLong(jSONArray.length() - 1, 0L)) : null;
                if (lValueOf != null) {
                    if (Math.abs(lValueOf.longValue() - jCurrentTimeMillis) <= ((long) signalsConfig.getBts().getThreshold()) * 1000) {
                        return jSONArray;
                    }
                }
                jSONArray.put(jCurrentTimeMillis);
                while (jSONArray.length() > 0 && jSONArray.length() > signalsConfig.getBts().getMaxEntries()) {
                    jSONArray.remove(0);
                }
                eaA.a("bt", jSONArray.toString(), true);
                return jSONArray;
            } catch (Exception e10) {
                bn.g gVar = P9.f26117a;
                AbstractC3481i9.a(e10);
            }
        }
        return new JSONArray();
    }

    public static final int b() {
        Context context = Ji.f25747a;
        Object systemService = context != null ? context.getSystemService("audio") : null;
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 15;
    }

    public static final boolean c() {
        f28483a.getClass();
        try {
            String str = Build.FINGERPRINT;
            tn.p.j(str, "FINGERPRINT");
            Locale locale = Locale.ROOT;
            tn.p.j(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase = str.toLowerCase(locale);
            tn.p.j(lowerCase, "toLowerCase(...)");
            String str2 = Build.MODEL;
            tn.p.j(str2, "MODEL");
            tn.p.j(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase2 = str2.toLowerCase(locale);
            tn.p.j(lowerCase2, "toLowerCase(...)");
            String str3 = Build.MANUFACTURER;
            tn.p.j(str3, "MANUFACTURER");
            tn.p.j(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase3 = str3.toLowerCase(locale);
            tn.p.j(lowerCase3, "toLowerCase(...)");
            String str4 = Build.BRAND;
            tn.p.j(str4, "BRAND");
            tn.p.j(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase4 = str4.toLowerCase(locale);
            tn.p.j(lowerCase4, "toLowerCase(...)");
            String str5 = Build.DEVICE;
            tn.p.j(str5, "DEVICE");
            tn.p.j(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase5 = str5.toLowerCase(locale);
            tn.p.j(lowerCase5, "toLowerCase(...)");
            String str6 = Build.HARDWARE;
            tn.p.j(str6, "HARDWARE");
            tn.p.j(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase6 = str6.toLowerCase(locale);
            tn.p.j(lowerCase6, "toLowerCase(...)");
            String str7 = Build.PRODUCT;
            tn.p.j(str7, "PRODUCT");
            tn.p.j(locale, NativeAdContent.ViewTag.ROOT);
            String lowerCase7 = str7.toLowerCase(locale);
            tn.p.j(lowerCase7, "toLowerCase(...)");
            if (bo.a0.W(lowerCase, "generic", false, 2, null) || bo.a0.W(lowerCase, "unknown", false, 2, null) || bo.d0.c0(lowerCase2, "google_sdk", false, 2, null) || bo.d0.c0(lowerCase2, "emu", false, 2, null) || bo.d0.c0(lowerCase2, "Android SDK built for x86", false, 2, null) || bo.d0.c0(lowerCase3, "Genymotion", false, 2, null) || bo.d0.c0(lowerCase7, "sdk", false, 2, null) || bo.d0.c0(lowerCase7, "vbox86p", false, 2, null) || bo.d0.c0(lowerCase7, "emu", false, 2, null) || tn.p.f(lowerCase6, "goldfish") || tn.p.f(lowerCase6, "ranchu") || tn.p.f(lowerCase6, "vbox86p") || bo.d0.c0(lowerCase6, "nox", false, 2, null)) {
                return true;
            }
            if (bo.a0.W(lowerCase4, "generic", false, 2, null)) {
                if (bo.a0.W(lowerCase5, "generic", false, 2, null)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Pair d() {
        Context context = Ji.f25747a;
        if (context == null) {
            return null;
        }
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? new Pair("d-airplane-m", "1") : new Pair("d-airplane-m", "0");
    }

    public static Pair e() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            G();
        } else if (i10 >= 26) {
            E();
        } else {
            C();
        }
        long j10 = f28485c;
        if (j10 != -1) {
            return new Pair("d-av-disk", String.valueOf(j10));
        }
        return null;
    }

    public static Pair f() {
        Context context = Ji.f25747a;
        Integer numValueOf = null;
        if (context == null) {
            return null;
        }
        if (F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            numValueOf = Integer.valueOf((int) ((r0.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / r0.getIntExtra("scale", -1)));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(numValueOf);
        return new Pair("d-bat-lev", sb2.toString());
    }

    public static Pair g() {
        Context context = Ji.f25747a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("power");
        tn.p.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode() ? new Pair("d-bat-sav", "1") : new Pair("d-bat-sav", "0");
    }

    public static Pair h() {
        String str;
        int i10 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            str = "0";
        } else {
            if (i10 != 32) {
                return null;
            }
            str = "1";
        }
        return new Pair("d-drk-m", str);
    }

    public static Pair i() {
        Context context = Ji.f25747a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("notification");
        tn.p.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return new Pair("d-dnd", (currentInterruptionFilter == 2 || currentInterruptionFilter == 3 || currentInterruptionFilter == 4) ? "1" : "0");
        } catch (Exception unused) {
            return null;
        }
    }

    public static Pair j() {
        ArrayList arrayList = new ArrayList();
        Context context = Ji.f25747a;
        if (context == null) {
            return null;
        }
        Object systemService = context.getSystemService("input_method");
        tn.p.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        tn.p.j(enabledInputMethodList, "getEnabledInputMethodList(...)");
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            tn.p.j(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
            for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                if (tn.p.f(inputMethodSubtype.getMode(), "keyboard")) {
                    String languageTag = inputMethodSubtype.getLanguageTag();
                    tn.p.j(languageTag, "getLanguageTag(...)");
                    String language = languageTag.length() > 0 ? Locale.forLanguageTag(inputMethodSubtype.getLanguageTag()).getLanguage() : new Locale(inputMethodSubtype.getLocale()).getLanguage();
                    tn.p.h(language);
                    if (language.length() > 0) {
                        arrayList.add(language);
                    }
                }
            }
        }
        return new Pair("d-key-lang", new JSONArray((Collection) arrayList).toString());
    }

    public static String k() {
        String strValueOf;
        Context context = Ji.f25747a;
        if (context == null || !Kf.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return "";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            tn.p.j(C3850x5.class.getSimpleName(), "getSimpleName(...)");
            e10.toString();
        }
        if (activeNetworkInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = activeNetworkInfo.getType();
            int subtype = activeNetworkInfo.getSubtype();
            if (type != 0) {
                if (type != 1) {
                    strValueOf = String.valueOf(type);
                }
                return "1";
            }
            strValueOf = type + ImpressionLog.Q + subtype;
            return strValueOf;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (!networkCapabilities.hasTransport(0)) {
            if (!networkCapabilities.hasTransport(1)) {
                strValueOf = networkCapabilities.hasTransport(2) ? com.ironsource.Gc.f29437e : networkCapabilities.hasTransport(3) ? "9" : networkCapabilities.hasTransport(4) ? "17" : networkCapabilities.hasTransport(5) ? "10" : networkCapabilities.hasTransport(6) ? "11" : "8";
            }
            return "1";
        }
        strValueOf = "0|" + activeNetworkInfo.getSubtype();
        return strValueOf;
    }

    public static int l() {
        String strK = k();
        if (bo.a0.W(strK, "0", false, 2, null)) {
            return 0;
        }
        return bo.a0.W(strK, "1", false, 2, null) ? 1 : 2;
    }

    public static final String m() {
        f28483a.getClass();
        int iL = l();
        return iL != 0 ? iL != 1 ? "NIL" : "wifi" : com.ironsource.Q6.Q0;
    }

    public static HashMap n() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(SignalsConfig.class, "clazz");
        boolean enabled = ((SignalsConfig) Y3.f26611a.a(SignalsConfig.class)).getBts().getEnabled();
        HashMap map = new HashMap();
        if (enabled) {
            map.put("d-t1", f28500r.toString());
            return map;
        }
        tn.p.j(f28487e, "TAG");
        return map;
    }

    public static Pair o() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            M();
        } else if (i10 >= 26) {
            K();
        } else {
            I();
        }
        String str = f28486d;
        if (str != null) {
            return new Pair("d-tot-disk", str);
        }
        return null;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean q() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean s() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean t() {
        return Build.VERSION.SDK_INT >= 36;
    }

    public static boolean u() {
        return true;
    }

    public static boolean v() {
        return true;
    }

    public static boolean w() {
        return true;
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean z() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public final int a(Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        I1 i12 = f28489g;
        KProperty[] kPropertyArr = f28484b;
        int iIntValue = ((Number) i12.getValue(this, kPropertyArr[1])).intValue();
        int iIntValue2 = ((Number) f28488f.getValue(this, kPropertyArr[0])).intValue();
        if (iIntValue2 > 0) {
            return (iIntValue * 100) / iIntValue2;
        }
        tn.p.j(C3850x5.class.getSimpleName(), "getSimpleName(...)");
        return 0;
    }

    public final HashMap a(boolean z10) {
        HashMap map = new HashMap();
        try {
            map.putAll(b(z10));
            map.putAll(n());
            return map;
        } catch (Exception e10) {
            tn.p.j(C3850x5.class.getSimpleName(), "getSimpleName(...)");
            e10.getMessage();
            return map;
        }
    }

    public final HashMap b(boolean z10) {
        int iAvailableProcessors;
        HashMap map = new HashMap();
        map.put("os-v", f28490h);
        map.put("d-brand-name", Build.BRAND);
        map.put("d-manufacturer-name", f28492j);
        map.put("d-model-name", f28493k);
        map.put("d-nettype-raw", k());
        String string = Locale.getDefault().toString();
        tn.p.j(string, "toString(...)");
        map.put("d-localization", string);
        String language = Locale.getDefault().getLanguage();
        tn.p.j(language, "getLanguage(...)");
        map.put("d-language", language);
        map.put("d-devicemachinehw", f28494l);
        if (System.currentTimeMillis() >= f28496n) {
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(SignalsConfig.class, "clazz");
            SignalsConfig signalsConfig = (SignalsConfig) Y3.f26611a.a(SignalsConfig.class);
            f28496n = (((long) signalsConfig.getLowMemoryFreq()) * 1000) + System.currentTimeMillis();
            p000do.i.d(A9.f25147c, null, null, new C3825w5(null), 3, null);
        }
        map.put("d-lowmem", String.valueOf(f28495m));
        try {
            iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
            iAvailableProcessors = 0;
        }
        map.put("d-pcount", String.valueOf(iAvailableProcessors));
        map.put("d-emu", String.valueOf(((Boolean) f28498p.getValue()).booleanValue()));
        bn.g gVar2 = f28497o;
        map.put("d-ps-disabled", String.valueOf(((C3800v5) gVar2.getValue()).f28325a));
        String str = ((C3800v5) gVar2.getValue()).f28326b;
        if (str == null) {
            str = "N/A";
        }
        map.put("d-ps-v", str);
        map.put("d-media-volume", String.valueOf(a(Ji.f25747a, z10)));
        return map;
    }
}
