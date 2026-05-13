package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.impl.c4;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.k7;
import com.applovin.impl.m7;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.o0;
import com.applovin.impl.o5;
import com.applovin.impl.q0;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3978d4;
import com.ironsource.Q6;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f10153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f10154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicReference f10155l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReference f10156m = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f10159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10160d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f10162f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10164h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f10161e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f10163g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference f10165i = new AtomicReference();

    public class a implements o5.a {
        public a() {
        }

        @Override // com.applovin.impl.o5.a
        public void a(v.a aVar) {
            l.f10155l.set(aVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10168b;

        public b(String str, int i10) {
            this.f10167a = str;
            this.f10168b = i10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10169a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10170b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f10171c = null;
    }

    public interface d {
        String a(ContentResolver contentResolver, String str);
    }

    public l(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f10157a = kVar;
        this.f10158b = kVar.O();
        this.f10159c = k.o();
        this.f10160d = D();
        this.f10162f = C();
    }

    private String B() {
        AudioManager audioManager = (AudioManager) this.f10159c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (com.applovin.impl.o0.e()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb2.append(audioDeviceInfo.getType());
                sb2.append(StringUtils.COMMA);
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb2.append(3);
                sb2.append(StringUtils.COMMA);
            }
            if (audioManager.isBluetoothScoOn()) {
                sb2.append(7);
                sb2.append(StringUtils.COMMA);
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb2.append(8);
            }
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string) && o.a()) {
            this.f10158b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private Map C() {
        HashMap map = new HashMap();
        PackageManager packageManager = this.f10159c.getPackageManager();
        ApplicationInfo applicationInfo = this.f10159c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        int i10 = com.applovin.impl.o0.h() ? 134238224 : 20560;
        PackageInfo packageInfoA = n7.a(this.f10159c, 0);
        PackageInfo packageInfoA2 = n7.a(this.f10159c, i10);
        String strA = a(applicationInfo.packageName, packageManager, this.f10157a);
        String strA2 = a(applicationInfo.packageName, packageManager);
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfoA != null ? packageInfoA.versionCode : -1));
        map.put("installer_name", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(strA));
        map.put("originating_name", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(strA2));
        map.put("tg", m7.a(this.f10157a));
        map.put("debug", Boolean.valueOf(n7.c(this.f10157a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(k.n()));
        map.put("session_id", this.f10157a.m0().getSessionId());
        map.put("j8", Boolean.valueOf(k.F0()));
        map.put("app_info_flags", Integer.valueOf(applicationInfo.flags));
        map.put("last_update_ms", Long.valueOf(packageInfoA != null ? packageInfoA.lastUpdateTime : 0L));
        List listD = d(packageInfoA2);
        if (!CollectionUtils.isEmpty(listD)) {
            map.put("signing_info", listD);
        }
        List listA = a(packageInfoA2);
        if (!CollectionUtils.isEmpty(listA)) {
            map.put("instrumentation", listA);
        }
        if (com.applovin.impl.o0.d()) {
            map.put("install_location", Integer.valueOf(packageInfoA != null ? packageInfoA.installLocation : 0));
            map.put("split_names", packageInfoA != null ? packageInfoA.splitNames : Collections.emptyList());
        }
        if (((Boolean) this.f10157a.a(x4.L4)).booleanValue()) {
            Map mapC = c(packageInfoA2);
            if (CollectionUtils.isEmpty(mapC)) {
                map.put("req_p", mapC);
            }
            List listB = b(packageInfoA2);
            if (CollectionUtils.isEmpty(listB)) {
                map.put("req_f", listB);
            }
        }
        k kVar = this.f10157a;
        z4 z4Var = z4.f11043h;
        Long l10 = (Long) kVar.a(z4Var);
        if (l10 != null) {
            map.put("ia_v2", l10);
        } else {
            this.f10157a.b(z4Var, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f10157a.e0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.j.b(), map);
        map.put("api_did", this.f10157a.a(x4.f10718f));
        map.put("first_install_v3_ms", packageInfoA != null ? Long.valueOf(packageInfoA.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f10157a.L(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f10157a.M()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (com.applovin.impl.o0.f()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f10157a.H0()) {
            map.put("unity_version", n7.a(this.f10157a.n0()));
        }
        List listI = i();
        if (!CollectionUtils.isEmpty(listI)) {
            map.put("application_start_info", listI);
        }
        List listG = g();
        if (!CollectionUtils.isEmpty(listG)) {
            map.put("application_exit_info", listG);
        }
        if (com.applovin.impl.o0.g()) {
            map.put("instant_app", Boolean.valueOf(packageManager.isInstantApp()));
        }
        return map;
    }

    private Map D() {
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(com.applovin.impl.v.a()));
        map.put(CommonUrlParts.LOCALE, Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put(Q6.F, Build.VERSION.RELEASE);
        map.put("platform", A());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(E()));
        map.put("gy", Boolean.valueOf(u()));
        map.put("country_code", n());
        map.put("mcc", y());
        map.put("mnc", z());
        map.put(Q6.Q0, l());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f10159c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", T());
        map.put("supported_abis", O());
        map.put("type", Build.TYPE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        DisplayMetrics displayMetrics = this.f10159c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            o0.b bVarA = com.applovin.impl.o0.a(this.f10159c, this.f10157a);
            if (bVarA != null) {
                map.put("tl_cr", Integer.valueOf(bVarA.c()));
                map.put("tr_cr", Integer.valueOf(bVarA.d()));
                map.put("bl_cr", Integer.valueOf(bVarA.a()));
                map.put("br_cr", Integer.valueOf(bVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(k()));
        map.put("tbalsi_ms", Long.valueOf(this.f10157a.K() - k.n()));
        CollectionUtils.putStringIfValid("process_name", n7.c(this.f10159c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", n7.i(this.f10159c), map);
        try {
            PackageInfo packageInfo = this.f10159c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put("ps_version", packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put("ps_version", "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", k7.a(this.f10159c), map);
        a(map);
        return map;
    }

    private double E() {
        return Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONArray F() {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.F():org.json.JSONArray");
    }

    public static String J() {
        return f10154k;
    }

    private Map L() {
        return n7.a(a((Map) null, true, false));
    }

    private JSONArray O() {
        if (com.applovin.impl.o0.d()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean P() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Boolean Q() {
        if (com.applovin.impl.o0.i()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty(n7.a("/proc/net/tcp", Collections.singletonList(":69A2"), this.f10157a)));
    }

    private boolean R() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.o0.f() && (connectivityManager = (ConnectivityManager) this.f10159c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th2) {
                this.f10157a.O();
                if (o.a()) {
                    this.f10157a.O().a("DataCollector", "Unable to collect constrained network info.", th2);
                }
            }
        }
        return false;
    }

    private boolean S() {
        boolean z10 = this.f10159c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f10159c.getPackageManager();
        return z10 && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    private Boolean T() {
        if (com.applovin.impl.o0.g()) {
            return Boolean.valueOf(this.f10159c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        this.f10165i.set(s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        Map mapY = Y();
        List listX = X();
        synchronized (this.f10163g) {
            if (mapY != null) {
                try {
                    this.f10162f.putAll(mapY);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (listX != null) {
                this.f10162f.put("dl", listX);
            }
        }
    }

    private List X() {
        List listC = this.f10157a.c(x4.H4);
        if (CollectionUtils.isEmpty(listC)) {
            return null;
        }
        return n7.a("/proc/self/maps", listC, this.f10157a);
    }

    private Map Y() {
        boolean z10;
        int i10;
        Throwable th2;
        if (!((Boolean) this.f10157a.a(x4.G4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            z10 = false;
            i10 = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
                        String string = stackTraceElement.toString();
                        if (!z10 && string.contains("de.robv.android.xposed")) {
                            z10 = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i10++;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f10157a.D().b("DataCollector", "collectHookingSignals", th2);
                }
            }
        } catch (Throwable th4) {
            z10 = false;
            i10 = 0;
            th2 = th4;
        }
        map.put("xpd", Boolean.valueOf(z10));
        map.put("zi_count", Integer.valueOf(i10));
        CollectionUtils.putBooleanIfValid("fpd", Q(), map);
        return map;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i10) {
        InputStream traceInputStream;
        String line;
        if (this.f10157a.c(x4.D4).contains(Integer.toString(i10))) {
            return null;
        }
        Integer num = (Integer) this.f10157a.a(x4.C4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
        } catch (Throwable th2) {
            this.f10157a.O();
            if (o.a()) {
                this.f10157a.O().a("DataCollector", "Failed to obtain trace input stream from application exit info", th2);
            }
            this.f10157a.D().b("DataCollector", "getTraceInputStream", th2);
            traceInputStream = null;
        }
        if (traceInputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
            for (int i11 = 0; i11 < num.intValue() && (line = bufferedReader.readLine()) != null; i11++) {
                try {
                    sb2.append(line);
                    sb2.append('\n');
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th3) {
            this.f10157a.O();
            if (o.a()) {
                this.f10157a.O().a("DataCollector", "Failed to read stack trace from input stream", th3);
            }
            this.f10157a.D().b("DataCollector", "readStackTraceFromInputStream", th3);
        }
        return sb2.toString();
    }

    private String a(d dVar, ContentResolver contentResolver, String str) {
        try {
            return dVar.a(contentResolver, str);
        } catch (Throwable th2) {
            this.f10157a.D().a("DataCollector", "retrieveSystemSettingValue", th2, CollectionUtils.hashMap("details", str));
            return null;
        }
    }

    private String a(String str, PackageManager packageManager) {
        if (!com.applovin.impl.o0.b()) {
            return null;
        }
        try {
            return packageManager.getInstallSourceInfo(str).getOriginatingPackageName();
        } catch (Throwable th2) {
            this.f10157a.D().b("DataCollector", "getOriginatingName", th2);
            return null;
        }
    }

    private static String a(String str, PackageManager packageManager, k kVar) {
        try {
            return (((Boolean) kVar.a(x4.f10874x4)).booleanValue() && com.applovin.impl.o0.b()) ? packageManager.getInstallSourceInfo(str).getInstallingPackageName() : packageManager.getInstallerPackageName(str);
        } catch (Throwable th2) {
            kVar.D().b("DataCollector", "getInstallerName", th2);
            return null;
        }
    }

    private List a(PackageInfo packageInfo) {
        InstrumentationInfo[] instrumentationInfoArr;
        if (packageInfo == null || (instrumentationInfoArr = packageInfo.instrumentation) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InstrumentationInfo instrumentationInfo : instrumentationInfoArr) {
            HashMap map = new HashMap();
            map.put("name", instrumentationInfo.name);
            map.put("hp", Boolean.valueOf(instrumentationInfo.handleProfiling));
            map.put("ft", Boolean.valueOf(instrumentationInfo.functionalTest));
            map.put("t_pa", instrumentationInfo.targetPackage);
            if (com.applovin.impl.o0.g()) {
                map.put("t_pr", instrumentationInfo.targetProcesses);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private List a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                arrayList.add(com.applovin.impl.sdk.utils.StringUtils.toHexString(messageDigest.digest()));
            }
        } catch (Throwable th2) {
            this.f10157a.D().b("DataCollector", "parseSignatures", th2);
        }
        return arrayList;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(5);
        map.put("action", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(intent.getAction()));
        map.put("data", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.emptyList());
        return map;
    }

    private Map a(Map map, boolean z10) {
        v.a aVarF;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointB = com.applovin.impl.o0.b(this.f10159c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        DisplayMetrics displayMetrics = this.f10159c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.x, 2.0d) + Math.pow(pointB.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f10159c)));
        if (((Boolean) this.f10157a.a(x4.E4)).booleanValue()) {
            String strB = n7.b(this.f10159c);
            Map mapA = com.applovin.impl.o0.a(strB);
            if (mapA != null) {
                map2.put("display_cutout_insets", mapA);
            }
            Map mapC = com.applovin.impl.o0.c(strB);
            if (mapC != null) {
                map2.put("status_bar_insets", mapC);
            }
            Map mapB = com.applovin.impl.o0.b(strB);
            if (mapB != null) {
                map2.put("nav_bar_insets", mapB);
            }
        }
        if (z10) {
            aVarF = (v.a) f10155l.get();
            if (aVarF != null) {
                Z();
            } else if (n7.i()) {
                aVarF = new v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) f10156m.get();
        if (((Boolean) this.f10157a.a(x4.f10889z3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f10167a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f10168b));
        }
        Boolean boolB = com.applovin.impl.p0.b().b(this.f10159c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = com.applovin.impl.p0.c().b(this.f10159c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = com.applovin.impl.p0.a().b(this.f10159c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f10157a.a(x4.O3)).booleanValue()) {
            c cVarJ = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarJ.f10169a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarJ.f10170b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarJ.f10171c, map2);
        }
        if (((Boolean) this.f10157a.a(x4.W3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f10157a.m0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f10157a.a(x4.Z3)).booleanValue()) {
            map2.put(ImpressionLog.C, Boolean.valueOf(P()));
        }
        Float fS = z10 ? (Float) this.f10165i.get() : s();
        if (fS != null) {
            map2.put("volume", fS);
        }
        CollectionUtils.putBooleanIfValid("ma", w(), map2);
        CollectionUtils.putBooleanIfValid("spo", x(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f10157a.m0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f10157a.m0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f10157a.m0().getAppEnteredBackgroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("abd_ms", Long.valueOf(this.f10157a.m0().getTotalBackgroundDurationMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f10159c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e10) {
            if (o.a()) {
                this.f10158b.a("DataCollector", "Unable to collect screen brightness", e10);
            }
        }
        if (((Boolean) this.f10157a.a(x4.f10696c4)).booleanValue() && n7.d(this.f10157a)) {
            n8.a(this.f10157a);
            String strA2 = n8.a();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA2)) {
                map2.put(Q6.f30218d0, strA2);
            }
        }
        if (((Boolean) this.f10157a.a(x4.f10794n4)).booleanValue()) {
            n8.b(this.f10157a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(n8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", n8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", n8.b(), map2);
        }
        if (((Boolean) this.f10157a.a(x4.Q3)).booleanValue()) {
            try {
                map2.put(Q6.U0, Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th2) {
                map2.put(Q6.U0, -1);
                map2.put("tds", -1);
                if (o.a()) {
                    this.f10158b.a("DataCollector", "Unable to collect total & free space.", th2);
                }
            }
        }
        if (((Boolean) this.f10157a.a(x4.R3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) this.f10159c.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY));
            if (memoryInfoA != null) {
                map2.put("fm", Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f10157a.a(x4.S3)).booleanValue() && com.applovin.impl.o0.a("android.permission.READ_PHONE_STATE", this.f10159c) && com.applovin.impl.o0.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f10159c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f10157a.a(x4.P3)).booleanValue()) {
            String strB2 = B();
            if (!TextUtils.isEmpty(strB2)) {
                map2.put("so", strB2);
            }
        }
        map2.put(BrandSafetyEvent.aw, n7.b(this.f10159c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.f10157a.a(x4.T3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(n7.k()));
        }
        if (com.applovin.impl.o0.d() && (powerManager = (PowerManager) this.f10159c.getSystemService("power")) != null) {
            map2.put(Q6.Z0, Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f10157a.a(x4.f10714e4)).booleanValue() && this.f10157a.l0() != null) {
            map2.put("da", Float.valueOf(this.f10157a.l0().a()));
        }
        if (((Boolean) this.f10157a.a(x4.f10723f4)).booleanValue() && this.f10157a.l0() != null) {
            map2.put("dm", Float.valueOf(this.f10157a.l0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f10157a.p().c()));
        map2.put("network", com.applovin.impl.r0.g(this.f10157a));
        String strQ = q();
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strQ)) {
            map2.put("kb", strQ);
        }
        Map mapR = r();
        if (!CollectionUtils.isEmpty(mapR)) {
            map2.put("ds", mapR);
        }
        return map2;
    }

    private Map a(JSONObject jSONObject, d dVar) {
        ContentResolver contentResolver = this.f10159c.getContentResolver();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject, next, null);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(string)) {
                map.put(next, com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(a(dVar, contentResolver, string)));
            }
        }
        return map;
    }

    private Map a(boolean z10) {
        Map map;
        synchronized (this.f10161e) {
            map = CollectionUtils.map(this.f10160d);
        }
        return a(map, z10);
    }

    public static void a(b bVar) {
        f10156m.set(bVar);
    }

    public static void a(v.a aVar) {
        f10155l.set(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i10, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i10), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f10157a.D().d(d2.G0, mapHashMap);
    }

    public static void a(String str, k kVar) {
        String strA = a(k.o().getApplicationInfo().packageName, k.o().getPackageManager(), kVar);
        List listC = kVar.c(x4.X6);
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(strA) || listC.contains(strA)) {
            f10153j = str;
        }
    }

    private void a(Map map) {
        JSONArray jSONArrayF;
        if (((Boolean) this.f10157a.a(x4.U3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f10157a.a(x4.V3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(t()));
        }
        if (((Boolean) this.f10157a.a(x4.f10696c4)).booleanValue() && n7.d(this.f10157a)) {
            n8.a(this.f10157a);
        }
        if (((Boolean) this.f10157a.a(x4.f10794n4)).booleanValue()) {
            n8.b(this.f10157a);
        }
        if (((Boolean) this.f10157a.a(x4.f10687b4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f10157a.a(x4.X3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(R()));
        }
        map.put("is_pc", Boolean.valueOf(S()));
        if (((Boolean) this.f10157a.a(x4.f10810p4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", K(), map);
        }
        if (((Boolean) this.f10157a.a(x4.K6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", o(), map);
        }
        if (!((Boolean) this.f10157a.a(x4.L6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayF = F()) == null || jSONArrayF.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayF);
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private void a0() {
        this.f10157a.q0().a((i5) new r6(this.f10157a, "collectPostInitAppInfo", new Runnable() { // from class: com.applovin.impl.sdk.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10391b.W();
            }
        }), d6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f10159c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private List b(PackageInfo packageInfo) {
        FeatureInfo[] featureInfoArr;
        if (packageInfo == null || (featureInfoArr = packageInfo.reqFeatures) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : featureInfoArr) {
            arrayList.add(featureInfo.name);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strI = I();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strI)) {
                this.f10157a.O();
                if (o.a()) {
                    this.f10157a.O().a("DataCollector", "Successfully retrieved bid token");
                }
                t2.a(appLovinBidTokenCollectionListener, strI);
                return;
            }
            this.f10157a.O();
            if (o.a()) {
                this.f10157a.O().b("DataCollector", "Empty bid token");
            }
            t2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th2) {
            if (o.a()) {
                this.f10158b.a("DataCollector", "Failed to collect bid token", th2);
            }
            this.f10157a.D().a("DataCollector", "collectBidToken", th2);
            t2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private void b(final String str, final int i10, final String str2) {
        this.f10157a.q0().a((i5) new r6(this.f10157a, "reportAppExitInfoStackTrace", new Runnable() { // from class: com.applovin.impl.sdk.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10354b.a(str, i10, str2);
            }
        }), d6.b.OTHER);
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
            for (int i11 = 9; i11 >= 0; i11--) {
                cArr[i10] = (char) (cArr[i10] ^ iArr[i11]);
            }
        }
        return new String(cArr);
    }

    private Map c(PackageInfo packageInfo) {
        HashMap map = null;
        if (packageInfo == null) {
            return null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && iArr != null && strArr.length != 0 && strArr.length == iArr.length) {
            map = new HashMap();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                CollectionUtils.putIntegerIfValid(strArr[i10], Integer.valueOf(iArr[i10]), map);
            }
        }
        return map;
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i10 = 0; i10 < 9; i10++) {
            if (new File(c(strArr[i10])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long d() {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    private List d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        if (com.applovin.impl.o0.h()) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                return a(signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory());
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return a(signatureArr);
            }
        }
        return null;
    }

    private List g() {
        ActivityManager activityManager;
        if (!com.applovin.impl.o0.b()) {
            return null;
        }
        Integer num = (Integer) this.f10157a.a(x4.A4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f10159c.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)) == null) {
            return null;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(((Boolean) this.f10157a.a(x4.B4)).booleanValue() ? this.f10159c.getPackageName() : null, 0, num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            HashMap map = new HashMap(13);
            int reason = applicationExitInfo.getReason();
            map.put("reason", Integer.valueOf(reason));
            String description = applicationExitInfo.getDescription();
            CollectionUtils.putStringIfValid(UnifiedMediationParams.KEY_DESCRIPTION, description, map);
            map.put("timestamp", Long.valueOf(applicationExitInfo.getTimestamp()));
            map.put("status", Integer.valueOf(applicationExitInfo.getStatus()));
            map.put("importance", Integer.valueOf(applicationExitInfo.getImportance()));
            map.put("pss", Long.valueOf(applicationExitInfo.getPss()));
            map.put("rss", Long.valueOf(applicationExitInfo.getRss()));
            CollectionUtils.putStringIfValid("process_name", applicationExitInfo.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationExitInfo.getPid()));
            map.put("ruid", Integer.valueOf(applicationExitInfo.getRealUid()));
            map.put("puid", Integer.valueOf(applicationExitInfo.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationExitInfo.getDefiningUid()));
            String strA = a(applicationExitInfo, reason);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                map.put(Z7.f30781e, strA);
                b(strA, reason, description);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f10159c);
        return orientation == 1 ? C3978d4.i.D : orientation == 2 ? C3978d4.i.C : "none";
    }

    private List i() {
        ActivityManager activityManager;
        if (!com.applovin.impl.o0.c()) {
            return null;
        }
        Integer num = (Integer) this.f10157a.a(x4.f10890z4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f10159c.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)) == null) {
            return null;
        }
        List<ApplicationStartInfo> historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        for (ApplicationStartInfo applicationStartInfo : historicalProcessStartReasons) {
            HashMap map = new HashMap(11);
            map.put("reason", Integer.valueOf(applicationStartInfo.getReason()));
            map.put("startup_state", Integer.valueOf(applicationStartInfo.getStartupState()));
            map.put("start_type", Integer.valueOf(applicationStartInfo.getStartType()));
            map.put("was_force_stopped", Boolean.valueOf(applicationStartInfo.wasForceStopped()));
            map.put("startup_timestamps", applicationStartInfo.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfo.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationStartInfo.getPid()));
            map.put("ruid", Integer.valueOf(applicationStartInfo.getRealUid()));
            map.put("puid", Integer.valueOf(applicationStartInfo.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationStartInfo.getDefiningUid()));
            map.put("launch_mode", Integer.valueOf(applicationStartInfo.getLaunchMode()));
            map.put("intent", a(applicationStartInfo.getIntent()));
            arrayList.add(map);
        }
        return arrayList;
    }

    private c j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f10159c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f10170b = -1;
        } else {
            cVar.f10170b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f10169a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f10171c = Boolean.valueOf(Settings.Global.getInt(this.f10159c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private long k() {
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l10 = (Long) this.f10157a.a(x4.F4);
        return (jCurrentTimeMillis / l10.longValue()) * l10.longValue();
    }

    private String l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10159c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f10158b.a("DataCollector", "Unable to collect carrier", th2);
            return "";
        }
    }

    private String n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10159c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://"));
        ResolveInfo resolveInfoResolveActivity = this.f10159c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f10154k = activityInfo.packageName;
        }
        return f10154k;
    }

    private String q() {
        if (!com.applovin.impl.o0.f()) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            LocaleList locales = this.f10159c.getResources().getConfiguration().getLocales();
            for (int i10 = 0; i10 < locales.size(); i10++) {
                sb2.append(locales.get(i10));
                sb2.append(StringUtils.COMMA);
            }
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == ',') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Map r() {
        HashMap map = new HashMap();
        JSONObject jSONObjectDeserialize = JsonUtils.deserialize((String) this.f10157a.a(x4.I4));
        if (JsonUtils.isValid(jSONObjectDeserialize)) {
            map.putAll(a(jSONObjectDeserialize, new d() { // from class: com.applovin.impl.sdk.v0
                @Override // com.applovin.impl.sdk.l.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.System.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize2 = JsonUtils.deserialize((String) this.f10157a.a(x4.J4));
        if (JsonUtils.isValid(jSONObjectDeserialize2)) {
            map.putAll(a(jSONObjectDeserialize2, new d() { // from class: com.applovin.impl.sdk.w0
                @Override // com.applovin.impl.sdk.l.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.Secure.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize3 = JsonUtils.deserialize((String) this.f10157a.a(x4.K4));
        if (JsonUtils.isValid(jSONObjectDeserialize3)) {
            map.putAll(a(jSONObjectDeserialize3, new d() { // from class: com.applovin.impl.sdk.x0
                @Override // com.applovin.impl.sdk.l.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.Global.getString(contentResolver, str);
                }
            }));
        }
        return map;
    }

    private Float s() {
        Float f10 = (Float) this.f10157a.a(x4.f10679a4);
        Float fB = this.f10157a.p().b();
        if (fB != null) {
            return Float.valueOf(fB.floatValue() * f10.floatValue());
        }
        return null;
    }

    private float t() {
        try {
            return Settings.System.getFloat(this.f10159c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e10) {
            if (!o.a()) {
                return -1.0f;
            }
            this.f10158b.a("DataCollector", "Error collecting font scale", e10);
            return -1.0f;
        }
    }

    private boolean u() {
        SensorManager sensorManager = (SensorManager) this.f10159c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map v() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.f10157a.r0().g(), map);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.f10157a.r0().j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f10157a.r0().c(), map);
        return map;
    }

    private Boolean w() {
        AudioManager audioManager = (AudioManager) this.f10159c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean x() {
        AudioManager audioManager = (AudioManager) this.f10159c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10159c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f10158b.a("DataCollector", "Unable to collect mobile country code", th2);
            return "";
        }
    }

    private String z() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f10159c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th2) {
            if (!o.a()) {
                return "";
            }
            this.f10158b.a("DataCollector", "Unable to collect mobile network code", th2);
            return "";
        }
    }

    public String A() {
        return AppLovinSdkUtils.isFireOS(this.f10159c) ? "fireos" : "android";
    }

    public Map G() {
        Map map;
        synchronized (this.f10163g) {
            map = CollectionUtils.map(this.f10162f);
        }
        String str = com.applovin.impl.sdk.utils.StringUtils.isValidString(f10153j) ? f10153j : this.f10159c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", com.applovin.impl.sdk.utils.StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f10157a.C0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f10157a.z0()));
        map.put("test_ads", Boolean.valueOf(this.f10164h));
        map.put("test_mode", Integer.valueOf(this.f10157a.s0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f10157a.n0().isMuted()));
        if (((Boolean) this.f10157a.a(x4.A3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f10157a.w0().e(), map);
        }
        if (((Boolean) this.f10157a.a(x4.D3)).booleanValue()) {
            map.put("compass_random_token", this.f10157a.u());
        }
        if (((Boolean) this.f10157a.a(x4.F3)).booleanValue()) {
            map.put("applovin_random_token", this.f10157a.h0());
        }
        if (((Boolean) this.f10157a.a(x4.J3)).booleanValue()) {
            map.put("art", this.f10157a.r());
        }
        map.putAll(v());
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f10157a.p0().a(z4.T, null), map);
        return map;
    }

    public b H() {
        return (b) f10156m.get();
    }

    public String I() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(L()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f10157a.a(x4.f10787m5)).booleanValue() ? u4.b(strEncodeToString, n7.a(this.f10157a), u4.a.a(((Integer) this.f10157a.a(x4.f10795n5)).intValue()), this.f10157a.i0(), this.f10157a) : strEncodeToString;
    }

    public String K() {
        ActivityManager activityManager = (ActivityManager) this.f10159c.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map M() {
        Map map;
        synchronized (this.f10163g) {
            map = CollectionUtils.map(this.f10162f);
        }
        return map;
    }

    public Map N() {
        Map map;
        synchronized (this.f10161e) {
            map = CollectionUtils.map(this.f10160d);
        }
        return map;
    }

    public boolean U() {
        return this.f10164h;
    }

    public void Z() {
        d6 d6VarQ0 = this.f10157a.q0();
        o5 o5Var = new o5(this.f10157a, new a());
        d6.b bVar = d6.b.OTHER;
        d6VarQ0.a((i5) o5Var, bVar);
        this.f10157a.q0().a((i5) new r6(this.f10157a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10389b.V();
            }
        }), bVar);
    }

    public Map a(Map map, boolean z10, boolean z11) {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z10);
        Map mapG = G();
        Map mapM = m();
        Map mapK0 = this.f10157a.k0();
        if (z11) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapG);
            if (mapM != null) {
                map2.put("connection_info", mapM);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapK0)) {
                map2.put("segments", mapK0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapG);
            if (mapM != null) {
                map2.putAll(mapM);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapK0)) {
                map2.putAll(mapK0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f10157a.V(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f10157a.C(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f10157a.a(x4.L3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f10157a.t0()), map2);
        if (!((Boolean) this.f10157a.a(x4.f10769k5)).booleanValue()) {
            map2.put("sdk_key", this.f10157a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f10157a.q(), map2);
        map2.putAll(e());
        map2.put(ImpressionLog.f51754x, UUID.randomUUID().toString());
        return map2;
    }

    public void a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f10157a.q0().a((i5) new r6(this.f10157a, ((Boolean) this.f10157a.a(x4.N3)).booleanValue(), "DataCollector", new Runnable() { // from class: com.applovin.impl.sdk.a1
            @Override // java.lang.Runnable
            public final void run() {
                this.f9931b.b(appLovinBidTokenCollectionListener);
            }
        }), d6.b.CORE);
    }

    public void b0() {
        synchronized (this.f10161e) {
            a(this.f10160d);
        }
        a0();
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sc", this.f10157a.a(x4.f10772l));
        map.put("sc2", this.f10157a.a(x4.f10781m));
        map.put("sc3", this.f10157a.a(x4.f10789n));
        map.put("server_installed_at", this.f10157a.a(x4.f10797o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f10157a.a(z4.H), map);
        return map;
    }

    public v.a f() {
        v.a aVarB = com.applovin.impl.v.b(this.f10159c);
        if (aVarB == null) {
            return new v.a();
        }
        if (((Boolean) this.f10157a.a(x4.f10881y3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f10157a.a(x4.f10873x3)).booleanValue()) {
                aVarB.a("");
            }
            f10155l.set(aVarB);
        } else {
            aVarB = new v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f10157a.J() != null ? this.f10157a.J().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds != null) {
            String strA = aVarB.a();
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(strA)) {
                this.f10164h = testDeviceAdvertisingIds.contains(strA);
            }
            b bVarH = H();
            String str = bVarH != null ? bVarH.f10167a : null;
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
                this.f10164h = testDeviceAdvertisingIds.contains(str) | this.f10164h;
            }
        } else {
            this.f10164h = false;
        }
        return aVarB;
    }

    public Map m() {
        HashMap map = new HashMap();
        c4 c4VarD0 = this.f10157a.d0();
        Deque dequeB = c4VarD0.b();
        if (!CollectionUtils.isEmpty(dequeB)) {
            map.put("network_throughput_info", dequeB);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", c4VarD0.a(), map);
        q0.d dVarA = this.f10157a.w().a();
        if (dVarA != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarA.c()));
            map.put("lrm_url", dVarA.d());
            map.put("lrm_ct_ms", String.valueOf(dVarA.a()));
            map.put("lrm_rs", String.valueOf(dVarA.b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public Map p() {
        return a(false);
    }
}
