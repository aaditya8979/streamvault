package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.impl.d2;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3978d4;
import com.ironsource.Q6;
import com.safedk.android.internal.partials.AppLovinNetworkBridge;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f8165g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f8167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f8168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d2.b f8169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f8170d = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8171e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f8164f = (int) TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f8166h = new Object();

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: com.applovin.impl.e2$a$a, reason: collision with other inner class name */
        public class C0143a implements Thread.UncaughtExceptionHandler {
            public C0143a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                e2.this.f8167a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    e2.this.f8167a.O().a("HealthEventsReporter", "Caught unhandled exception", th2);
                }
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) e2.this.f8167a.a(x4.S)).intValue());
            thread.setUncaughtExceptionHandler(new C0143a());
            return thread;
        }
    }

    public e2(com.applovin.impl.sdk.k kVar, d2.b bVar) {
        this.f8167a = kVar;
        this.f8168b = kVar.O();
        this.f8169c = bVar;
        a();
    }

    private URL a(d2 d2Var, Map map) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb2.append("?");
        Iterator it = b(d2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb2.append(strEncode);
            sb2.append("=");
            sb2.append(strEncode2);
            if (it.hasNext()) {
                sb2.append(C3978d4.j.f31381c);
            }
        }
        return new URL(sb2.toString());
    }

    private JSONObject a(d2 d2Var, double d10, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (d2Var == d2.L0 || d2Var == d2.K0 || d2Var == d2.f7996b1 || d2Var == d2.Z0) {
            if (((Boolean) this.f8167a.a(x4.f10794n4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(n8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", n8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", n8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f8167a.A().K());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapN = this.f8167a.A().N();
        JsonUtils.putObject(jSONObject2, "platform", mapN.get("platform"));
        JsonUtils.putObject(jSONObject2, Q6.F, mapN.get(Q6.F));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapN.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapN.get("brand"));
        JsonUtils.putObject(jSONObject2, "model", mapN.get("model"));
        JsonUtils.putObject(jSONObject2, "brand_name", mapN.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", mapN.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", mapN.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapN.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f8167a.v().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f8167a.h0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.f8167a.u());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.f8167a.r()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(j.b()));
        Map mapG = this.f8167a.A().G();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapG.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f8167a.a(x4.L3));
        JsonUtils.putObject(jSONObject2, "app_version", mapG.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", mapG.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(mapG.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapG.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, Q6.f30268u, this.f8167a.a(x4.f10837t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f8167a.V());
        SessionTracker sessionTrackerM0 = this.f8167a.m0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerM0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerM0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerM0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.k.n()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", d2Var.b());
            JsonUtils.putDouble(jSONObject3, ActivityChooserModel.ATTRIBUTE_WEIGHT, d10);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    private void a() {
        if (f8165g != null) {
            return;
        }
        synchronized (f8166h) {
            if (f8165g != null) {
                return;
            }
            f8165g = Executors.newFixedThreadPool(1, new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(d2 d2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8168b.a("HealthEventsReporter", "Reporting " + d2Var.b() + " with extra parameters collection " + list);
        }
        if (this.f8169c != d2Var.a()) {
            l1.a("Health event " + d2Var.b() + " category: " + d2Var.a() + " does not match the reporter category: " + this.f8169c, new Object[0]);
        }
        c(d2Var, list);
        d(d2Var, list);
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object objA = this.f8167a.H().a();
        Long lC = this.f8167a.H().c();
        boolean z10 = objA instanceof com.applovin.impl.sdk.ad.b;
        String string = VastTagName.ERROR;
        if (z10) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) objA).getAdIdNumber()));
            if (lC != null) {
                string = lC.toString();
            }
            map.put("fs_ad_memory_usage", string);
            return;
        }
        if (!(objA instanceof y2)) {
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
            map.put("fs_ad_memory_usage", "None");
        } else {
            y2 y2Var = (y2) objA;
            map.put("fs_ad_network", y2Var.getNetworkName());
            map.put("fs_ad_creative_id", y2Var.getCreativeId());
            if (lC != null) {
                string = lC.toString();
            }
            map.put("fs_ad_memory_usage", string);
        }
    }

    private boolean a(d2 d2Var, long j10) {
        Long l10 = (Long) this.f8170d.get(d2Var);
        return System.currentTimeMillis() - (l10 != null ? l10.longValue() : -1L) < j10;
    }

    private Map b(d2 d2Var, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", d2Var.b());
        if (d2Var == d2.L0 || d2Var == d2.K0 || d2Var == d2.f7996b1 || d2Var == d2.Z0) {
            if (((Boolean) this.f8167a.a(x4.f10794n4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(n8.d()), map2);
                CollectionUtils.putStringIfValid("wvv", n8.c(), map2);
                CollectionUtils.putStringIfValid("wvpn", n8.b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f8167a.A().K(), map2);
        }
        Map mapN = this.f8167a.A().N();
        map2.put("platform", String.valueOf(mapN.get("platform")));
        map2.put("country_code", String.valueOf(mapN.get("country_code")));
        map2.put("cc", this.f8167a.v().getCountryCode());
        map2.put("applovin_random_token", this.f8167a.h0());
        map2.put("compass_random_token", this.f8167a.u());
        map2.put("model", Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put(Q6.F, Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", j.b(), map2);
        map2.put(Q6.f30268u, (String) this.f8167a.a(x4.f10837t));
        b(map2);
        a(map2);
        if (map != null) {
            map2.putAll(c(d2Var, map));
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, d2 d2Var, JSONObject jSONObject) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = jSONObject.toString().getBytes("UTF-8");
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int i10 = f8164f;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("AppLovin-Event-Type", d2Var.b());
            OutputStream outputStreamUrlConnectionGetOutputStream = AppLovinNetworkBridge.urlConnectionGetOutputStream(httpURLConnection);
            outputStreamUrlConnectionGetOutputStream.write(bytes);
            outputStreamUrlConnectionGetOutputStream.close();
            int iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            if (com.applovin.impl.sdk.o.a()) {
                this.f8168b.a("HealthEventsReporter", d2Var.b() + " reported with code " + iHttpUrlConnectionGetResponseCode);
            }
            this.f8170d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
            n7.a(httpURLConnection, this.f8167a);
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8168b.d("HealthEventsReporter", "Failed to report " + d2Var.b(), th);
                }
            } finally {
                n7.a(httpURLConnection2, this.f8167a);
            }
        }
    }

    private void b(Map map) {
        PackageInfo packageInfoA = n7.a(com.applovin.impl.sdk.k.o(), 0);
        map.put("package_name", com.applovin.impl.sdk.k.o().getPackageName());
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", String.valueOf(packageInfoA != null ? packageInfoA.versionCode : 0));
    }

    private Map c(d2 d2Var, Map map) {
        HashMap map2 = new HashMap(map);
        if (d2Var == d2.P0) {
            map2.remove("details");
        }
        return map2;
    }

    private void c(d2 d2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        if (d2Var.a() == d2.b.AD || d2Var.a() == d2.b.MEDIATED_AD || d2Var.a() == d2.b.USER_SESSION || !n7.a(((Integer) this.f8167a.a(x4.B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(d2Var, map).openConnection();
                try {
                    int i10 = f8164f;
                    httpURLConnection.setConnectTimeout(i10);
                    httpURLConnection.setReadTimeout(i10);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", d2Var.b());
                    int iHttpUrlConnectionGetResponseCode = AppLovinNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8168b.a("HealthEventsReporter", d2Var.b() + " reported with code " + iHttpUrlConnectionGetResponseCode + " and extra parameters " + map);
                    }
                    this.f8170d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f8168b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters " + map, th2);
                        }
                        n7.a(httpURLConnection, this.f8167a);
                    } finally {
                        n7.a(httpURLConnection, this.f8167a);
                    }
                }
            } catch (Throwable th4) {
                httpURLConnection = null;
                th2 = th4;
            }
        }
    }

    private void d(final d2 d2Var, List list) {
        final String str = (String) this.f8167a.a(x4.C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dA = d2Var.a(this.f8167a);
        if (n7.a(dA)) {
            if (((Boolean) this.f8167a.a(x4.I)).booleanValue()) {
                a(str, d2Var, a(d2Var, dA, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final JSONObject jSONObjectA = a(d2Var, dA, Collections.singletonList((Map) it.next()));
                f8165g.execute(new Runnable() { // from class: com.applovin.impl.x9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10899b.a(str, d2Var, jSONObjectA);
                    }
                });
            }
        }
    }

    public void a(d2 d2Var, String str) {
        a(d2Var, str, new HashMap());
    }

    public void a(d2 d2Var, String str, Map map) {
        map.put("source", str);
        d(d2Var, map);
    }

    public void a(d2 d2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f8171e.add(str2)) {
            map.put("source", str);
            a(d2Var, str, map);
        }
    }

    public void a(final d2 d2Var, final List list, long j10) {
        if (a(d2Var, j10)) {
            return;
        }
        try {
            if (n7.i()) {
                f8165g.execute(new Runnable() { // from class: com.applovin.impl.w9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10645b.b(d2Var, list);
                    }
                });
            } else {
                b(d2Var, list);
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8168b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters collection " + list, th2);
            }
        }
    }

    public void a(d2 d2Var, Map map, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(d2Var, arrayList, j10);
    }

    public void d(d2 d2Var, Map map) {
        a(d2Var, map, 0L);
    }
}
