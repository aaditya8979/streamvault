package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.impl.a5;
import com.applovin.impl.c4;
import com.applovin.impl.c6;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f1;
import com.applovin.impl.f7;
import com.applovin.impl.h8;
import com.applovin.impl.i5;
import com.applovin.impl.j1;
import com.applovin.impl.j4;
import com.applovin.impl.k2;
import com.applovin.impl.k3;
import com.applovin.impl.l3;
import com.applovin.impl.l7;
import com.applovin.impl.l8;
import com.applovin.impl.m7;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.p3;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.r1;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t5;
import com.applovin.impl.u0;
import com.applovin.impl.u3;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.w4;
import com.applovin.impl.x4;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z2;
import com.applovin.impl.z4;
import com.applovin.impl.z6;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class k {
    public static k C0;
    public static Context D0;
    private static boolean E0;
    private static final boolean G0;
    private static volatile com.applovin.impl.c H0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f10099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f10101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f10105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f10107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10109h;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private com.applovin.impl.mediation.e f10112i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinSdkSettings f10113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxSegmentCollection f10115k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private List f10116k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f10117l;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f10126p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile AppLovinSdk f10127q;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f10136u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private AppLovinSdkInitializationConfiguration f10138v0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f10144y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private AppLovinSdk.SdkInitializationListener f10146z0;
    private static final Object I0 = new Object();
    private static final long F0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f10111i = new AtomicBoolean();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicReference f10119m = new AtomicReference();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f10121n = new AtomicReference();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicReference f10123o = new AtomicReference();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicReference f10125p = new AtomicReference();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final o f10129r = new o(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.applovin.impl.f f10131s = new com.applovin.impl.f(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final z2 f10133t = new z2(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final r1 f10135u = new r1(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final l7 f10137v = new l7(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final AtomicReference f10139w = new AtomicReference();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicReference f10141x = new AtomicReference();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicReference f10143y = new AtomicReference();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final AtomicReference f10145z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final AtomicReference f10096a0 = new AtomicReference();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final AtomicReference f10098b0 = new AtomicReference();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final AtomicReference f10100c0 = new AtomicReference();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final AtomicReference f10102d0 = new AtomicReference();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final AtomicReference f10104e0 = new AtomicReference();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final AtomicReference f10106f0 = new AtomicReference();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final AtomicReference f10108g0 = new AtomicReference();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final AtomicReference f10110h0 = new AtomicReference();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final AtomicReference f10114j0 = new AtomicReference();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Object f10118l0 = new Object();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f10120m0 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final AtomicBoolean f10122n0 = new AtomicBoolean();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final AtomicBoolean f10124o0 = new AtomicBoolean();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f10128q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f10130r0 = false;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f10132s0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f10134t0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final Object f10140w0 = new Object();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private SdkConfigurationImpl f10142x0 = new SdkConfigurationImpl(this);
    private final i5 A0 = new r6(this, true, "scheduleAdLoadIntegrationError", new Runnable() { // from class: com.applovin.impl.sdk.p0
        @Override // java.lang.Runnable
        public final void run() {
            this.f10340b.K0();
        }
    });
    private final i5 B0 = new r6(this, true, "sdkInit", new Runnable() { // from class: com.applovin.impl.sdk.q0
        @Override // java.lang.Runnable
        public final void run() {
            this.f10343b.L0();
        }
    });

    public class a implements t5.b {
        public a() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            k.this.c(jSONObject);
            if (((Boolean) k.this.a(r3.f9734e8)).booleanValue()) {
                k kVar = k.this;
                kVar.f10112i0 = new com.applovin.impl.mediation.e(kVar);
            }
            k.this.m().a();
            com.applovin.impl.r0.a(jSONObject, zIsValid, k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k.this.D().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(l.J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", zIsValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(k.D0).getAll().size());
            k.this.v0().d(d2.f8003f, CollectionUtils.map("details", jSONObject2.toString()));
            k kVar2 = k.this;
            kVar2.f10116k0 = kVar2.a(jSONObject);
            if (zIsValid) {
                k.this.f10142x0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            k.this.s0().a(jSONObject);
            k.this.b(jSONObject);
            t2.b(((Boolean) k.this.a(x4.f10868w6)).booleanValue());
            t2.a(((Boolean) k.this.a(x4.f10876x6)).booleanValue());
            k.this.P0();
            if (!((Boolean) k.this.a(x4.f10704d3)).booleanValue() || zIsValid || !com.applovin.impl.r0.a(k.o())) {
                k.this.N0();
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.this.S0();
        }
    }

    public class b implements u0.c {
        public b() {
        }

        @Override // com.applovin.impl.u0.c
        public void a(u0.b bVar) {
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            k.this.f10124o0.set(bVar.b());
            if (!bVar.a()) {
                k.this.c("Initializing SDK in MAX environment...");
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            k.this.R0();
            k.this.Q0();
        }
    }

    public class c implements t5.b {
        public c() {
        }

        @Override // com.applovin.impl.t5.b
        public void a(JSONObject jSONObject) {
            k.this.c(jSONObject);
            k.this.f10111i.set(false);
            k.this.N0();
        }
    }

    public class d implements y3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y3 f10150a;

        public d(y3 y3Var) {
            this.f10150a = y3Var;
        }

        @Override // com.applovin.impl.y3.a
        public void a() {
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.this.f10118l0) {
                if (!k.this.f10126p0) {
                    k.this.R0();
                }
            }
            this.f10150a.b(this);
        }

        @Override // com.applovin.impl.y3.a
        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.n0
                @Override // java.lang.Runnable
                public final void run() {
                    n7.c();
                }
            });
            G0 = true;
        } catch (Throwable unused) {
            G0 = false;
        }
    }

    public k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f10126p0 = false;
        C0 = this;
        this.f10113j = appLovinSdkSettings;
        this.f10101d = System.currentTimeMillis();
        this.f10126p0 = true;
        if (!F0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        D0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f10099c = new WeakReference((Activity) context);
        }
    }

    private void A0() {
        Context context = D0;
        o oVarO = O();
        a5 a5VarP0 = p0();
        com.applovin.impl.u0 u0VarX = x();
        a(context);
        m0();
        j();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.f10095a;
        if (str == null || str.length() != 86) {
            o.h("AppLovinSdk", "SDK key provided is invalid (" + this.f10095a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f10097b) && this.f10097b.length() != 36) {
            String str2 = "Axon event key length " + this.f10097b + " is invalid - expected 36";
            if (n7.c(this)) {
                throw new IllegalArgumentException(str2);
            }
            o.h("AppLovinSdk", str2);
        }
        if (u0VarX.l()) {
            String str3 = "Terms Flow has been replaced. " + u0VarX.g();
            if (n7.c(this)) {
                throw new IllegalStateException(str3);
            }
            o.h("AppLovinSdk", str3);
        }
        if (n7.j()) {
            o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!n7.b(this)) {
            o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (n7.m(context)) {
            this.f10113j.setVerboseLogging(true);
        }
        o0().a(x4.f10763k, Boolean.valueOf(this.f10113j.isVerboseLoggingEnabled()));
        w3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        z4 z4Var = z4.f11038c;
        if (TextUtils.isEmpty((String) a5VarP0.a(z4Var, (Object) null, defaultSharedPreferences))) {
            this.f10130r0 = true;
            a5VarP0.b(z4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            a5VarP0.b(z4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        z4 z4Var2 = z4.f11039d;
        if (((Boolean) a5VarP0.a(z4Var2, Boolean.FALSE)).booleanValue()) {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f10132s0 = true;
        } else {
            if (o.a()) {
                oVarO.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            a5VarP0.b(z4Var2, Boolean.TRUE);
            a5VarP0.b(z4.f11055t, Boolean.valueOf(u0VarX.j()));
        }
        z4 z4Var3 = z4.f11040e;
        this.f10105f = ((Long) a5VarP0.a(z4Var3, 0L)).longValue() + 1;
        p0().b(z4Var3, Long.valueOf(this.f10105f));
        z4 z4Var4 = z4.f11041f;
        this.f10107g = (Long) a5VarP0.a(z4Var4, null);
        p0().b(z4Var4, Long.valueOf(F0));
        z4 z4Var5 = z4.f11042g;
        String str4 = (String) a5VarP0.a(z4Var5, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > n7.g(str4)) {
                a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
            }
        } else {
            a5VarP0.b(z4Var5, AppLovinSdk.VERSION);
        }
        v0().d(d2.f8001e, CollectionUtils.map("details", "isInitProviderContextSet=" + E0));
    }

    public static boolean F0() {
        return G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0() {
        if (q0().f()) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        q0().g();
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() {
        d6 d6VarQ0 = q0();
        int i10 = this.f10134t0 + 1;
        this.f10134t0 = i10;
        d6VarQ0.a((i5) new t5(i10, this, new c()), d6.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        if (G0()) {
            k2.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        synchronized (this.f10118l0) {
            boolean zA = com.applovin.impl.r0.a(o());
            if (!G0()) {
                O();
                if (o.a()) {
                    O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                }
            }
            if (!((Boolean) a(x4.f10713e3)).booleanValue() || zA) {
                R0();
            }
            if (((Boolean) a(x4.f10704d3)).booleanValue() && !zA) {
                O();
                if (o.a()) {
                    O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                }
                S0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        Long l10 = (Long) a(x4.f10785m3);
        if (l10.longValue() >= 0 && this.f10111i.compareAndSet(false, true)) {
            h8.a(l10.longValue(), false, this, new Runnable() { // from class: com.applovin.impl.sdk.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10152b.J0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0() {
        if (!G0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f10122n0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!x().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            x().a(u0(), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0() {
        y3 y3VarC0 = c0();
        y3VarC0.a(new d(y3VarC0));
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(x4.f10750i4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (H0 == null) {
            synchronized (I0) {
                if (H0 == null) {
                    H0 = new com.applovin.impl.c(context);
                }
            }
        }
        return H0;
    }

    public static String a(int i10) {
        return a(i10, (List) null);
    }

    public static String a(int i10, List list) {
        String string = o().getResources().getString(i10);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextO = o();
        return a(contextO.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, contextO.getPackageName()), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f10142x0);
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        D0 = context.getApplicationContext();
        E0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f10142x0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        A0();
        this.f10113j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            o.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            o0().a(x4.L3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(x4.f10829s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        d6 d6VarQ0 = q0();
        i5 i5Var = this.A0;
        d6.b bVar = d6.b.CORE;
        d6VarQ0.a(i5Var, bVar);
        q0().a(this.B0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        if (n7.c(this)) {
            throw new IllegalStateException(str);
        }
        HashMap map = new HashMap();
        map.put("details", "admob");
        map.put("error_message", str);
        D().a(d2.S0, "adapterVersionMismatch", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            o.h("AppLovinSdk", (String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", str);
        }
        q0().a(new c6(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f10109h = System.currentTimeMillis();
            com.applovin.impl.r0.c(jSONObject, this);
            com.applovin.impl.r0.b(jSONObject, this);
            com.applovin.impl.r0.a(jSONObject, this);
            l3.f(jSONObject, this);
            l3.d(jSONObject, this);
            l3.e(jSONObject, this);
            l3.g(jSONObject, this);
        }
    }

    private void d() {
        d6 d6VarQ0 = q0();
        int i10 = this.f10134t0 + 1;
        this.f10134t0 = i10;
        d6VarQ0.a((i5) new t5(i10, this, new a()), d6.b.CORE);
    }

    public static long n() {
        return F0;
    }

    public static Context o() {
        return D0;
    }

    public l A() {
        Object lVar = this.A.get();
        if (lVar == null) {
            synchronized (this.A) {
                lVar = this.A.get();
                if (lVar == null) {
                    lVar = new l(this);
                    this.A.set(lVar);
                }
            }
        }
        if (lVar == this.A) {
            lVar = null;
        }
        return (l) lVar;
    }

    public j1 B() {
        Object j1Var = this.D.get();
        if (j1Var == null) {
            synchronized (this.D) {
                j1Var = this.D.get();
                if (j1Var == null) {
                    j1Var = new j1(this);
                    this.D.set(j1Var);
                }
            }
        }
        if (j1Var == this.D) {
            j1Var = null;
        }
        return (j1) j1Var;
    }

    public boolean B0() {
        boolean z10;
        synchronized (this.f10118l0) {
            z10 = this.f10128q0;
        }
        return z10;
    }

    public String C() {
        return this.f10136u0;
    }

    public boolean C0() {
        return this.f10130r0;
    }

    public r1 D() {
        return this.f10135u;
    }

    public boolean D0() {
        boolean z10;
        synchronized (this.f10140w0) {
            z10 = this.f10138v0 != null;
        }
        return z10;
    }

    public String E() {
        return w0().d();
    }

    public boolean E0() {
        boolean z10;
        synchronized (this.f10118l0) {
            z10 = this.f10126p0;
        }
        return z10;
    }

    public EventServiceImpl F() {
        Object eventServiceImpl = this.f10123o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f10123o) {
                eventServiceImpl = this.f10123o.get();
                if (eventServiceImpl == null) {
                    eventServiceImpl = new EventServiceImpl(this);
                    this.f10123o.set(eventServiceImpl);
                }
            }
        }
        if (eventServiceImpl == this.f10123o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    public m G() {
        Object mVar = this.G.get();
        if (mVar == null) {
            synchronized (this.G) {
                mVar = this.G.get();
                if (mVar == null) {
                    mVar = new m(this);
                    this.G.set(mVar);
                }
            }
        }
        if (mVar == this.G) {
            mVar = null;
        }
        return (m) mVar;
    }

    public boolean G0() {
        return StringUtils.containsIgnoreCase(V(), "max");
    }

    public n H() {
        Object nVar = this.I.get();
        if (nVar == null) {
            synchronized (this.I) {
                nVar = this.I.get();
                if (nVar == null) {
                    nVar = new n(this);
                    this.I.set(nVar);
                }
            }
        }
        if (nVar == this.I) {
            nVar = null;
        }
        return (n) nVar;
    }

    public boolean H0() {
        return n7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity I() {
        WeakReference weakReference;
        if (!((Boolean) a(x4.f10882y4)).booleanValue() || (weakReference = this.f10099c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration J() {
        return this.f10138v0;
    }

    public long K() {
        return this.f10101d;
    }

    public Long L() {
        return this.f10107g;
    }

    public long M() {
        return this.f10105f;
    }

    public void M0() {
        b(false);
    }

    public o2 N() {
        Object o2Var = this.X.get();
        if (o2Var == null) {
            synchronized (this.X) {
                o2Var = this.X.get();
                if (o2Var == null) {
                    o2Var = new o2(this);
                    this.X.set(o2Var);
                }
            }
        }
        if (o2Var == this.X) {
            o2Var = null;
        }
        return (o2) o2Var;
    }

    public o O() {
        return this.f10129r;
    }

    public void O0() {
        if (StringUtils.isValidString(this.f10117l)) {
            return;
        }
        this.f10117l = "max";
    }

    public z2 P() {
        return this.f10133t;
    }

    public com.applovin.impl.mediation.d Q() {
        Object dVar = this.f10110h0.get();
        if (dVar == null) {
            synchronized (this.f10110h0) {
                dVar = this.f10110h0.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.mediation.d(this);
                    this.f10110h0.set(dVar);
                }
            }
        }
        if (dVar == this.f10110h0) {
            dVar = null;
        }
        return (com.applovin.impl.mediation.d) dVar;
    }

    public void Q0() {
        t().a();
    }

    public com.applovin.impl.mediation.e R() {
        return this.f10112i0;
    }

    public void R0() {
        synchronized (this.f10118l0) {
            this.f10126p0 = true;
            q0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f S() {
        Object fVar = this.f10100c0.get();
        if (fVar == null) {
            synchronized (this.f10100c0) {
                fVar = this.f10100c0.get();
                if (fVar == null) {
                    fVar = new com.applovin.impl.mediation.f(this);
                    this.f10100c0.set(fVar);
                }
            }
        }
        if (fVar == this.f10100c0) {
            fVar = null;
        }
        return (com.applovin.impl.mediation.f) fVar;
    }

    public com.applovin.impl.mediation.g T() {
        Object gVar = this.f10098b0.get();
        if (gVar == null) {
            synchronized (this.f10098b0) {
                gVar = this.f10098b0.get();
                if (gVar == null) {
                    gVar = new com.applovin.impl.mediation.g(this);
                    this.f10098b0.set(gVar);
                }
            }
        }
        if (gVar == this.f10098b0) {
            gVar = null;
        }
        return (com.applovin.impl.mediation.g) gVar;
    }

    public void T0() {
        o.h("AppLovinSdk", "Resetting SDK state...");
        o0().a();
        o0().e();
        if (this.f10120m0.compareAndSet(true, false)) {
            R0();
        } else {
            this.f10120m0.set(true);
        }
    }

    public p3 U() {
        Object p3Var = this.f10106f0.get();
        if (p3Var == null) {
            synchronized (this.f10106f0) {
                p3Var = this.f10106f0.get();
                if (p3Var == null) {
                    p3Var = new p3(this);
                    this.f10106f0.set(p3Var);
                }
            }
        }
        if (p3Var == this.f10106f0) {
            p3Var = null;
        }
        return (p3) p3Var;
    }

    public void U0() {
        if (StringUtils.isValidString(this.f10136u0)) {
            return;
        }
        this.f10136u0 = "max";
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String V() {
        return this.f10117l;
    }

    public void V0() {
        y().n();
    }

    public void W0() {
        a((Map) null);
    }

    public MediationServiceImpl X() {
        Object mediationServiceImpl = this.f10102d0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f10102d0) {
                mediationServiceImpl = this.f10102d0.get();
                if (mediationServiceImpl == null) {
                    mediationServiceImpl = new MediationServiceImpl(this);
                    this.f10102d0.set(mediationServiceImpl);
                }
            }
        }
        if (mediationServiceImpl == this.f10102d0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    public void X0() {
        if ("admob".equalsIgnoreCase(this.f10117l) && ((Boolean) a(x4.M3)).booleanValue()) {
            String str = (String) a(x4.L3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb2.append(str2);
            sb2.append(".");
            if (str.startsWith(sb2.toString())) {
                return;
            }
            final String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            o.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10089b.b(str3);
                }
            });
        }
    }

    public u3 Y() {
        Object u3Var = this.f10145z.get();
        if (u3Var == null) {
            synchronized (this.f10145z) {
                u3Var = this.f10145z.get();
                if (u3Var == null) {
                    u3Var = new u3(this);
                    this.f10145z.set(u3Var);
                }
            }
        }
        if (u3Var == this.f10145z) {
            u3Var = null;
        }
        return (u3) u3Var;
    }

    public v3 Z() {
        Object v3Var = this.f10104e0.get();
        if (v3Var == null) {
            synchronized (this.f10104e0) {
                v3Var = this.f10104e0.get();
                if (v3Var == null) {
                    v3Var = new v3();
                    this.f10104e0.set(v3Var);
                }
            }
        }
        if (v3Var == this.f10104e0) {
            v3Var = null;
        }
        return (v3) v3Var;
    }

    public Object a(x4 x4Var) {
        return o0().a(x4Var);
    }

    public Object a(z4 z4Var) {
        return a(z4Var, (Object) null);
    }

    public Object a(z4 z4Var, Object obj) {
        return p0().a(z4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a5.a(str, obj, cls, sharedPreferences);
    }

    public void a() {
        String str = (String) p0().a(z4.f11042g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < n7.g(str)) {
                o.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public void a(SharedPreferences sharedPreferences) {
        p0().a(sharedPreferences);
    }

    public void a(Uri uri) {
        B().a(uri);
    }

    public void a(k3 k3Var) {
        if (q0().f()) {
            return;
        }
        List listA = w3.a(this);
        if (listA.size() <= 0 || !S().a().containsAll(listA)) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        q0().g();
        M0();
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.f10127q = appLovinSdk;
    }

    public void a(final AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f10140w0) {
            if (this.f10138v0 == null) {
                this.f10103e = System.currentTimeMillis();
                this.f10138v0 = appLovinSdkInitializationConfiguration;
                this.f10144y0 = sdkInitializationListener;
                this.f10095a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f10097b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.f10117l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f10115k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                n7.a(new Runnable() { // from class: com.applovin.impl.sdk.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10181b.a(appLovinSdkInitializationConfiguration);
                    }
                });
                return;
            }
            o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f10138v0 + ". Ignoring the provided initialization configuration.");
            if (!B0() || sdkInitializationListener == null) {
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10172b.a(sdkInitializationListener);
                }
            });
        }
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        p0().a(str, obj, editor);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(boolean z10) {
        synchronized (this.f10118l0) {
            this.f10126p0 = false;
            this.f10128q0 = z10;
        }
        if (z10) {
            List listA = w3.a(this);
            if (listA.isEmpty()) {
                q0().g();
                M0();
                return;
            }
            Long l10 = (Long) a(r3.f9746o7);
            r6 r6Var = new r6(this, true, "timeoutInitAdapters", new Runnable() { // from class: com.applovin.impl.sdk.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10331b.I0();
                }
            });
            O();
            if (o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + listA + " - timing out in " + l10 + "ms...");
            }
            q0().a(r6Var, d6.b.TIMEOUT, l10.longValue(), true);
        }
    }

    public boolean a(x4 x4Var, MaxAdFormat maxAdFormat) {
        return b(x4Var).contains(maxAdFormat);
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.f10116k0;
        return (list == null || list.size() <= 0 || this.f10116k0.contains(maxAdFormat)) ? false : true;
    }

    public p a0() {
        Object pVar = this.f10108g0.get();
        if (pVar == null) {
            synchronized (this.f10108g0) {
                pVar = this.f10108g0.get();
                if (pVar == null) {
                    pVar = new p(this);
                    this.f10108g0.set(pVar);
                }
            }
        }
        if (pVar == this.f10108g0) {
            pVar = null;
        }
        return (p) pVar;
    }

    public Object b(z4 z4Var) {
        return p0().a(z4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r12.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r15.f10136u0 = (java.lang.String) r13.getValue();
        O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (com.applovin.impl.sdk.o.a() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        O().a("AppLovinSdk", "Detected mediation provider: " + r15.f10136u0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r6.booleanValue() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    public List b(x4 x4Var) {
        return o0().b(x4Var);
    }

    public void b(z4 z4Var, Object obj) {
        p0().b(z4Var, obj);
    }

    public void b(boolean z10) {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (x().i() || (sdkInitializationListener = this.f10144y0) == null) {
            return;
        }
        if (B0()) {
            this.f10144y0 = null;
            this.f10146z0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f10146z0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(x4.f10805p)).booleanValue()) {
                this.f10144y0 = null;
            } else {
                this.f10146z0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", B0());
        JsonUtils.putBoolean(jSONObject, "timeout", z10);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f10124o0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f10103e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f10137v.d(d2.f8011j, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10093b.b(sdkInitializationListener);
            }
        }, Math.max(0L, ((Long) a(x4.f10813q)).longValue()));
    }

    public AppLovinNativeAdService b0() {
        Object appLovinNativeAdService = this.f10121n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f10121n) {
                appLovinNativeAdService = this.f10121n.get();
                if (appLovinNativeAdService == null) {
                    appLovinNativeAdService = new AppLovinNativeAdService(this);
                    this.f10121n.set(appLovinNativeAdService);
                }
            }
        }
        if (appLovinNativeAdService == this.f10121n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    public List c(x4 x4Var) {
        return o0().c(x4Var);
    }

    public void c() {
        synchronized (this.f10118l0) {
            if (!this.f10126p0 && !this.f10128q0) {
                R0();
            }
        }
    }

    public void c(z4 z4Var) {
        p0().b(z4Var);
    }

    public y3 c0() {
        Object y3Var = this.L.get();
        if (y3Var == null) {
            synchronized (this.L) {
                y3Var = this.L.get();
                if (y3Var == null) {
                    y3Var = new y3(o());
                    this.L.set(y3Var);
                }
            }
        }
        if (y3Var == this.L) {
            y3Var = null;
        }
        return (y3) y3Var;
    }

    public c4 d0() {
        Object c4Var = this.W.get();
        if (c4Var == null) {
            synchronized (this.W) {
                c4Var = this.W.get();
                if (c4Var == null) {
                    c4Var = new c4(this);
                    this.W.set(c4Var);
                }
            }
        }
        if (c4Var == this.W) {
            c4Var = null;
        }
        return (c4) c4Var;
    }

    public com.applovin.impl.c e() {
        return a(D0);
    }

    public j4 e0() {
        Object j4Var = this.S.get();
        if (j4Var == null) {
            synchronized (this.S) {
                j4Var = this.S.get();
                if (j4Var == null) {
                    j4Var = new j4(this);
                    this.S.set(j4Var);
                }
            }
        }
        if (j4Var == this.S) {
            j4Var = null;
        }
        return (j4) j4Var;
    }

    public com.applovin.impl.sdk.a f() {
        Object aVar = this.F.get();
        if (aVar == null) {
            synchronized (this.F) {
                aVar = this.F.get();
                if (aVar == null) {
                    aVar = new com.applovin.impl.sdk.a(this);
                    this.F.set(aVar);
                }
            }
        }
        if (aVar == this.F) {
            aVar = null;
        }
        return (com.applovin.impl.sdk.a) aVar;
    }

    public com.applovin.impl.sdk.network.b f0() {
        Object bVar = this.Z.get();
        if (bVar == null) {
            synchronized (this.Z) {
                bVar = this.Z.get();
                if (bVar == null) {
                    bVar = new com.applovin.impl.sdk.network.b(this);
                    this.Z.set(bVar);
                }
            }
        }
        if (bVar == this.Z) {
            bVar = null;
        }
        return (com.applovin.impl.sdk.network.b) bVar;
    }

    public com.applovin.impl.f g() {
        return this.f10131s;
    }

    public PostbackServiceImpl g0() {
        Object postbackServiceImpl = this.Y.get();
        if (postbackServiceImpl == null) {
            synchronized (this.Y) {
                postbackServiceImpl = this.Y.get();
                if (postbackServiceImpl == null) {
                    postbackServiceImpl = new PostbackServiceImpl(this);
                    this.Y.set(postbackServiceImpl);
                }
            }
        }
        if (postbackServiceImpl == this.Y) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    public com.applovin.impl.sdk.d h() {
        Object dVar = this.U.get();
        if (dVar == null) {
            synchronized (this.U) {
                dVar = this.U.get();
                if (dVar == null) {
                    dVar = new com.applovin.impl.sdk.d(this);
                    this.U.set(dVar);
                }
            }
        }
        if (dVar == this.U) {
            dVar = null;
        }
        return (com.applovin.impl.sdk.d) dVar;
    }

    public String h0() {
        return w0().a();
    }

    public e i() {
        Object eVar = this.E.get();
        if (eVar == null) {
            synchronized (this.E) {
                eVar = this.E.get();
                if (eVar == null) {
                    eVar = new e(this);
                    this.E.set(eVar);
                }
            }
        }
        if (eVar == this.E) {
            eVar = null;
        }
        return (e) eVar;
    }

    public String i0() {
        return this.f10095a;
    }

    public com.applovin.impl.j j() {
        Object jVar = this.f10096a0.get();
        if (jVar == null) {
            synchronized (this.f10096a0) {
                jVar = this.f10096a0.get();
                if (jVar == null) {
                    jVar = new com.applovin.impl.j(this);
                    this.f10096a0.set(jVar);
                }
            }
        }
        if (jVar == this.f10096a0) {
            jVar = null;
        }
        return (com.applovin.impl.j) jVar;
    }

    public MaxSegmentCollectionImpl j0() {
        return (MaxSegmentCollectionImpl) this.f10115k;
    }

    public AppLovinAdServiceImpl k() {
        Object appLovinAdServiceImpl = this.f10119m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f10119m) {
                appLovinAdServiceImpl = this.f10119m.get();
                if (appLovinAdServiceImpl == null) {
                    appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                    this.f10119m.set(appLovinAdServiceImpl);
                }
            }
        }
        if (appLovinAdServiceImpl == this.f10119m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    public Map k0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplJ0 = j0();
        if (maxSegmentCollectionImplJ0 == null) {
            return null;
        }
        return maxSegmentCollectionImplJ0.getJsonData();
    }

    public g l() {
        Object gVar = this.J.get();
        if (gVar == null) {
            synchronized (this.J) {
                gVar = this.J.get();
                if (gVar == null) {
                    gVar = new g(this);
                    this.J.set(gVar);
                }
            }
        }
        if (gVar == this.J) {
            gVar = null;
        }
        return (g) gVar;
    }

    public w4 l0() {
        Object w4Var = this.N.get();
        if (w4Var == null) {
            synchronized (this.N) {
                w4Var = this.N.get();
                if (w4Var == null) {
                    w4Var = new w4(this);
                    this.N.set(w4Var);
                }
            }
        }
        if (w4Var == this.N) {
            w4Var = null;
        }
        return (w4) w4Var;
    }

    public h m() {
        Object hVar = this.V.get();
        if (hVar == null) {
            synchronized (this.V) {
                hVar = this.V.get();
                if (hVar == null) {
                    hVar = new h(this);
                    this.V.set(hVar);
                }
            }
        }
        if (hVar == this.V) {
            hVar = null;
        }
        return (h) hVar;
    }

    public SessionTracker m0() {
        Object sessionTracker = this.H.get();
        if (sessionTracker == null) {
            synchronized (this.H) {
                sessionTracker = this.H.get();
                if (sessionTracker == null) {
                    sessionTracker = new SessionTracker(this);
                    this.H.set(sessionTracker);
                }
            }
        }
        if (sessionTracker == this.H) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    public AppLovinSdkSettings n0() {
        return this.f10113j;
    }

    public y4 o0() {
        Object y4Var = this.f10141x.get();
        if (y4Var == null) {
            synchronized (this.f10141x) {
                y4Var = this.f10141x.get();
                if (y4Var == null) {
                    y4Var = new y4(this);
                    this.f10141x.set(y4Var);
                }
            }
        }
        if (y4Var == this.f10141x) {
            y4Var = null;
        }
        return (y4) y4Var;
    }

    public i p() {
        Object iVar = this.O.get();
        if (iVar == null) {
            synchronized (this.O) {
                iVar = this.O.get();
                if (iVar == null) {
                    iVar = new i(this);
                    this.O.set(iVar);
                }
            }
        }
        if (iVar == this.O) {
            iVar = null;
        }
        return (i) iVar;
    }

    public a5 p0() {
        Object a5Var = this.B.get();
        if (a5Var == null) {
            synchronized (this.B) {
                a5Var = this.B.get();
                if (a5Var == null) {
                    a5Var = new a5(this);
                    this.B.set(a5Var);
                }
            }
        }
        if (a5Var == this.B) {
            a5Var = null;
        }
        return (a5) a5Var;
    }

    public String q() {
        return this.f10097b;
    }

    public d6 q0() {
        Object d6Var = this.f10139w.get();
        if (d6Var == null) {
            synchronized (this.f10139w) {
                d6Var = this.f10139w.get();
                if (d6Var == null) {
                    d6Var = new d6(this);
                    this.f10139w.set(d6Var);
                }
            }
        }
        if (d6Var == this.f10139w) {
            d6Var = null;
        }
        return (d6) d6Var;
    }

    public String r() {
        return w0().b();
    }

    public z6 r0() {
        Object z6Var = this.Q.get();
        if (z6Var == null) {
            synchronized (this.Q) {
                z6Var = this.Q.get();
                if (z6Var == null) {
                    z6Var = new z6(this);
                    this.Q.set(z6Var);
                }
            }
        }
        if (z6Var == this.Q) {
            z6Var = null;
        }
        return (z6) z6Var;
    }

    public CmpServiceImpl s() {
        Object cmpServiceImpl = this.f10125p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f10125p) {
                cmpServiceImpl = this.f10125p.get();
                if (cmpServiceImpl == null) {
                    cmpServiceImpl = new CmpServiceImpl(this);
                    this.f10125p.set(cmpServiceImpl);
                }
            }
        }
        if (cmpServiceImpl == this.f10125p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    public f7 s0() {
        Object f7Var = this.f10114j0.get();
        if (f7Var == null) {
            synchronized (this.f10114j0) {
                f7Var = this.f10114j0.get();
                if (f7Var == null) {
                    f7Var = new f7(this);
                    this.f10114j0.set(f7Var);
                }
            }
        }
        if (f7Var == this.f10114j0) {
            f7Var = null;
        }
        return (f7) f7Var;
    }

    public j t() {
        Object jVar = this.M.get();
        if (jVar == null) {
            synchronized (this.M) {
                jVar = this.M.get();
                if (jVar == null) {
                    jVar = new j(this);
                    this.M.set(jVar);
                }
            }
        }
        if (jVar == this.M) {
            jVar = null;
        }
        return (j) jVar;
    }

    public long t0() {
        if (this.f10109h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f10109h;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f10095a + "', enabled=" + this.f10128q0 + ", isFirstSession=" + this.f10130r0 + '}';
    }

    public String u() {
        return w0().c();
    }

    public Activity u0() {
        Activity activityB = a(o()).b();
        return activityB != null ? activityB : I();
    }

    public SdkConfigurationImpl v() {
        return this.f10142x0;
    }

    public l7 v0() {
        return this.f10137v;
    }

    public com.applovin.impl.q0 w() {
        Object q0Var = this.f10143y.get();
        if (q0Var == null) {
            synchronized (this.f10143y) {
                q0Var = this.f10143y.get();
                if (q0Var == null) {
                    q0Var = new com.applovin.impl.q0(this);
                    this.f10143y.set(q0Var);
                }
            }
        }
        if (q0Var == this.f10143y) {
            q0Var = null;
        }
        return (com.applovin.impl.q0) q0Var;
    }

    public m7 w0() {
        Object m7Var = this.C.get();
        if (m7Var == null) {
            synchronized (this.C) {
                m7Var = this.C.get();
                if (m7Var == null) {
                    m7Var = new m7(this);
                    this.C.set(m7Var);
                }
            }
        }
        if (m7Var == this.C) {
            m7Var = null;
        }
        return (m7) m7Var;
    }

    public com.applovin.impl.u0 x() {
        Object u0Var = this.P.get();
        if (u0Var == null) {
            synchronized (this.P) {
                u0Var = this.P.get();
                if (u0Var == null) {
                    u0Var = new com.applovin.impl.u0(this);
                    this.P.set(u0Var);
                }
            }
        }
        if (u0Var == this.P) {
            u0Var = null;
        }
        return (com.applovin.impl.u0) u0Var;
    }

    public l8 x0() {
        Object l8Var = this.K.get();
        if (l8Var == null) {
            synchronized (this.K) {
                l8Var = this.K.get();
                if (l8Var == null) {
                    l8Var = new l8(this);
                    this.K.set(l8Var);
                }
            }
        }
        if (l8Var == this.K) {
            l8Var = null;
        }
        return (l8) l8Var;
    }

    public com.applovin.impl.e1 y() {
        Object e1Var = this.R.get();
        if (e1Var == null) {
            synchronized (this.R) {
                e1Var = this.R.get();
                if (e1Var == null) {
                    e1Var = new com.applovin.impl.e1(this);
                    this.R.set(e1Var);
                }
            }
        }
        if (e1Var == this.R) {
            e1Var = null;
        }
        return (com.applovin.impl.e1) e1Var;
    }

    public AppLovinSdk y0() {
        return this.f10127q;
    }

    public f1 z() {
        Object f1Var = this.T.get();
        if (f1Var == null) {
            synchronized (this.T) {
                f1Var = this.T.get();
                if (f1Var == null) {
                    f1Var = new f1(this);
                    this.T.set(f1Var);
                }
            }
        }
        if (f1Var == this.T) {
            f1Var = null;
        }
        return (f1) f1Var;
    }

    public boolean z0() {
        return this.f10132s0;
    }
}
