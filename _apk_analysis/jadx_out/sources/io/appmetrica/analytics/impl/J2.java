package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class J2 implements Ea {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashSet f65390n = new HashSet(Arrays.asList(1, 13));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final H2 f65391o = new H2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gh f65393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final PublicLogger f65394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Sn f65395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Fg f65396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final C5204w6 f65397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4718d0 f65398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5241xi f65399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5035pb f65400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Df f65401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N9 f65402k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Ke f65403l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C4818gn f65404m;

    public J2(Context context, C5241xi c5241xi, Gh gh2, N9 n92, C5104s6 c5104s6, Sn sn2, Fg fg2, C5204w6 c5204w6, C4718d0 c4718d0, Ke ke2) {
        Context applicationContext = context.getApplicationContext();
        this.f65392a = applicationContext;
        this.f65399h = c5241xi;
        this.f65393b = gh2;
        this.f65402k = n92;
        this.f65395d = sn2;
        this.f65396e = fg2;
        this.f65397f = c5204w6;
        this.f65398g = c4718d0;
        this.f65403l = ke2;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(gh2.b().getApiKey());
        this.f65394c = orCreatePublicLogger;
        if (Z2.a(gh2.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f65401j = c5104s6;
        this.f65404m = new C4818gn(applicationContext);
    }

    public final Rn a(Throwable th2) {
        Throwable th3;
        StackTraceElement[] stackTrace;
        if (th2 == null) {
            stackTrace = null;
            th3 = null;
        } else if (th2 instanceof O1) {
            stackTrace = th2.getStackTrace();
            th3 = null;
        } else {
            th3 = th2;
            stackTrace = null;
        }
        return Un.a(th3, new V(null, null, this.f65401j.a()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f65402k.f65633b.a(), (Boolean) this.f65402k.f65634c.a());
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.Va
    public final void a(@NonNull Rn rn2) {
        C5241xi c5241xi = this.f65399h;
        C5215wh c5215whA = c5241xi.a(rn2, this.f65393b);
        Gh gh2 = c5215whA.f67906e;
        Ql ql2 = c5241xi.f67957e;
        if (ql2 != null) {
            gh2.f65350b.setUuid(((Pl) ql2).g());
        } else {
            gh2.getClass();
        }
        c5241xi.f67955c.b(c5215whA);
        this.f65394c.info("Unhandled exception received: " + rn2, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Sa, io.appmetrica.analytics.impl.InterfaceC4795g0
    public final void a(@NonNull V v10) {
        C4692c0 c4692c0 = new C4692c0(v10, (String) this.f65402k.f65633b.a(), (Boolean) this.f65402k.f65634c.a());
        C5241xi c5241xi = this.f65399h;
        byte[] byteArray = MessageNano.toByteArray(this.f65398g.fromModel(c4692c0));
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, "", 5968, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        String str = null;
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        PublicLogger publicLogger2 = this.f65394c;
        StringBuilder sb2 = new StringBuilder("ANR was reported ");
        C5246xn c5246xn = v10.f66016a;
        if (c5246xn != null) {
            str = "Thread[name=" + c5246xn.f67987a + ",tid={" + c5246xn.f67989c + ", priority=" + c5246xn.f67988b + ", group=" + c5246xn.f67990d + "}] at " + cn.f0.D0(c5246xn.f67992f, "\n", null, null, 0, null, null, 62, null);
        }
        sb2.append(str);
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f65394c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f65394c.info("Put error environment pair <%s, %s>", str, str2);
        Gh gh2 = this.f65393b;
        synchronized (gh2) {
            E8 e82 = gh2.f65283c;
            e82.f65189b.b(e82.f65188a, str, str2);
        }
    }

    public final void a(Map<String, String> map) {
        if (mo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str) {
        C5241xi c5241xi = this.f65399h;
        Q5 q5A = Q5.a(str);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(q5A, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void b(@NonNull String str, @Nullable String str2) {
        this.f65394c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(str2, str, 1, 0, publicLogger);
        n32.f65799l = EnumC4983n9.JS;
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    public final void b(Map<String, String> map) {
        if (mo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final boolean b() {
        return this.f65393b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f65394c.info("Clear app environment", new Object[0]);
        C5241xi c5241xi = this.f65399h;
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        Q5 q5N = N3.n();
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str = gh2.f65286f;
        }
        c5241xi.a(new C5215wh(q5N, false, 1, null, new Gh(cf2, counterConfiguration, e82, str)));
    }

    public final void d(String str) {
        if (this.f65393b.f()) {
            return;
        }
        this.f65399h.f67956d.c();
        C5035pb c5035pb = this.f65400i;
        c5035pb.f67516a.removeCallbacks(c5035pb.f67518c, c5035pb.f67517b.f65393b.f65350b.getApiKey());
        this.f65393b.f65285e = true;
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", str, 3, 0, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    public final void e(String str) {
        this.f65399h.f67956d.b();
        C5035pb c5035pb = this.f65400i;
        C5035pb.a(c5035pb.f67516a, c5035pb.f67517b, c5035pb.f67518c);
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", str, 6400, 0, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        this.f65393b.f65285e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        C5088rf c5088rf;
        C5241xi c5241xi = this.f65399h;
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        C5188vf c5188vf = gh2.f65284d;
        synchronized (gh2) {
            str = gh2.f65286f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(gh2.f65350b.getApiKey());
        Set set = AbstractC5232x9.f67933a;
        JSONObject jSONObject = new JSONObject();
        if (c5188vf != null && (c5088rf = c5188vf.f67835a) != null) {
            try {
                jSONObject.put("preloadInfo", c5088rf.c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(string, "", 6144, 0, orCreatePublicLogger);
        n32.c(str);
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f65394c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f65394c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f65394c.info("Put app environment: <%s, %s>", str, str2);
        C5241xi c5241xi = this.f65399h;
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        Q5 q5B = N3.b(str, str2);
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str3 = gh2.f65286f;
        }
        c5241xi.a(new C5215wh(q5B, false, 1, null, new Gh(cf2, counterConfiguration, e82, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z10) {
        String str;
        C5241xi c5241xi = this.f65399h;
        E e10 = new E(adRevenue, z10, this.f65404m, this.f65394c);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        N3 n3A = N3.a(LoggerStorage.getOrCreatePublicLogger(gh2.f65350b.getApiKey()), e10);
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str = gh2.f65286f;
        }
        c5241xi.a(new C5215wh(n3A, false, 1, null, new Gh(cf2, counterConfiguration, e82, str)));
        this.f65394c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC4832hb.b(adRevenue.payload) + ", autoCollected=" + z10 + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArrB;
        C4743e0 c4743e0 = new C4743e0(new C4769f0(this, map));
        C4959ma c4959ma = new C4959ma();
        C5104s6 c5104s6 = C4696c4.l().f66451a;
        Thread threadA = c4743e0.a();
        Map mapC = null;
        try {
            stackTraceElementArrB = c4743e0.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        C5246xn c5246xn = (C5246xn) c4959ma.apply(threadA, stackTraceElementArrB);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Cn());
        try {
            mapC = c4743e0.c();
        } catch (SecurityException unused3) {
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != threadA && thread != null) {
                arrayList.add((C5246xn) c4959ma.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c5246xn, arrayList, c5104s6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.f65394c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C5241xi c5241xi = this.f65399h;
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        for (Ei ei2 : eCommerceEvent.toProto()) {
            N3 n32 = new N3(LoggerStorage.getOrCreatePublicLogger(gh2.f65350b.getApiKey()));
            EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
            n32.f65791d = 41000;
            n32.f65789b = n32.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ei2.f65200a)));
            n32.f65794g = ei2.f65201b.getBytesTruncated();
            Cf cf2 = new Cf(gh2.f65349a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
            E8 e82 = gh2.f65283c;
            synchronized (gh2) {
                str = gh2.f65286f;
            }
            c5241xi.a(new C5215wh(n32, false, 1, null, new Gh(cf2, counterConfiguration, e82, str)));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        Rn rnA;
        Ke ke2 = this.f65403l;
        if (pluginErrorDetails != null) {
            rnA = ke2.a(pluginErrorDetails);
        } else {
            ke2.getClass();
            rnA = null;
        }
        Eg eg2 = new Eg(str, rnA);
        C5241xi c5241xi = this.f65399h;
        byte[] byteArray = MessageNano.toByteArray(this.f65396e.fromModel(eg2));
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str, 5896, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        this.f65394c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        Rn rnA;
        Ke ke2 = this.f65403l;
        if (pluginErrorDetails != null) {
            rnA = ke2.a(pluginErrorDetails);
        } else {
            ke2.getClass();
            rnA = null;
        }
        C5179v6 c5179v6 = new C5179v6(new Eg(str2, rnA), str);
        C5241xi c5241xi = this.f65399h;
        byte[] byteArray = MessageNano.toByteArray(this.f65397f.fromModel(c5179v6));
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str2, 5896, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        this.f65394c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        C5179v6 c5179v6 = new C5179v6(new Eg(str2, a(th2)), str);
        C5241xi c5241xi = this.f65399h;
        byte[] byteArray = MessageNano.toByteArray(this.f65397f.fromModel(c5179v6));
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str2, 5896, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        this.f65394c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, @Nullable Throwable th2) {
        Eg eg2 = new Eg(str, a(th2));
        C5241xi c5241xi = this.f65399h;
        byte[] byteArray = MessageNano.toByteArray(this.f65396e.fromModel(eg2));
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str, 5892, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        this.f65394c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        EnumC4983n9 enumC4983n9;
        if (f65390n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i10 = F8.f65243a[moduleEvent.getCategory().ordinal()];
        if (i10 == 1) {
            enumC4983n9 = EnumC4983n9.NATIVE;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC4983n9 = EnumC4983n9.SYSTEM;
        }
        n32.f65799l = enumC4983n9;
        n32.f65790c = AbstractC4832hb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            n32.f65803p = moduleEvent.getExtras();
        }
        this.f65399h.a(n32, this.f65393b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.f65394c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", str, 1, 0, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.f65394c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(str2, str, 1, 0, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        c5241xi.a(new N3("", str, 1, 0, publicLogger), this.f65393b, 1, map);
        PublicLogger publicLogger2 = this.f65394c;
        StringBuilder sb2 = new StringBuilder("Event received: ");
        sb2.append(WrapUtils.wrapToTag(str));
        sb2.append(". With value: ");
        sb2.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb2.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        Oi oi2 = I2.f65348a;
        oi2.getClass();
        ro roVarA = oi2.a(revenue);
        if (!roVarA.f67631a) {
            this.f65394c.warning("Passed revenue is not valid. Reason: " + roVarA.f67632b, new Object[0]);
            return;
        }
        C5241xi c5241xi = this.f65399h;
        Pi pi2 = new Pi(revenue, this.f65394c);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        N3 n3A = N3.a(LoggerStorage.getOrCreatePublicLogger(gh2.f65350b.getApiKey()), pi2);
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str = gh2.f65286f;
        }
        c5241xi.a(new C5215wh(n3A, false, 1, null, new Gh(cf2, counterConfiguration, e82, str)));
        this.f65394c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + com.ironsource.Z7.f30794r + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Rn rnA = this.f65403l.a(pluginErrorDetails);
        C5241xi c5241xi = this.f65399h;
        Hn hn2 = rnA.f65845a;
        String str = hn2 != null ? (String) WrapUtils.getOrDefault(hn2.f65340a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f65395d.fromModel(rnA));
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3(byteArray, str, 5891, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
        this.f65394c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th2) {
        Rn rnA = Un.a(th2, new V(null, null, this.f65401j.a()), null, (String) this.f65402k.f65633b.a(), (Boolean) this.f65402k.f65634c.a());
        C5241xi c5241xi = this.f65399h;
        c5241xi.a(c5241xi.a(rnA, this.f65393b));
        this.f65394c.info("Unhandled exception received: " + rnA, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C4767eo c4767eo = new C4767eo(C4767eo.f66714c);
        Iterator<UserProfileUpdate<? extends InterfaceC4793fo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC4793fo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.f65394c);
            userProfileUpdatePatcher.a(c4767eo);
        }
        C4896jo c4896jo = new C4896jo();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c4767eo.f66715a.size(); i10++) {
            SparseArray sparseArray = c4767eo.f66715a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i10))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C4819go) it2.next());
            }
        }
        c4896jo.f67076a = (C4819go[]) arrayList.toArray(new C4819go[arrayList.size()]);
        ro roVarA = f65391o.a(c4896jo);
        if (!roVarA.f67631a) {
            this.f65394c.warning("UserInfo wasn't sent because " + roVarA.f67632b, new Object[0]);
            return;
        }
        C5241xi c5241xi = this.f65399h;
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        Q5 q5A = N3.a(c4896jo);
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str = gh2.f65286f;
        }
        c5241xi.a(new C5215wh(q5A, false, 1, null, new Gh(cf2, counterConfiguration, e82, str)));
        this.f65394c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.f65394c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f65394c.info("Send event buffer", new Object[0]);
        C5241xi c5241xi = this.f65399h;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        N3 n32 = new N3("", "", 256, 0, publicLogger);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f65393b.f65350b.setDataSendingEnabled(z10);
        this.f65394c.info("Updated data sending enabled: %s", Boolean.valueOf(z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, @Nullable byte[] bArr) {
        C5241xi c5241xi = this.f65399h;
        PublicLogger publicLogger = this.f65394c;
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        n32.f65803p = Collections.singletonMap(str, bArr);
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        c5241xi.a(C5241xi.a(n32, gh2), gh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(@Nullable String str) {
        String str2;
        C5241xi c5241xi = this.f65399h;
        Gh gh2 = this.f65393b;
        c5241xi.getClass();
        N3 n32 = new N3(LoggerStorage.getOrCreatePublicLogger(gh2.f65350b.getApiKey()));
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        n32.f65791d = 40962;
        n32.c(str);
        n32.f65789b = n32.e(str);
        Cf cf2 = new Cf(gh2.f65349a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(gh2.f65350b);
        E8 e82 = gh2.f65283c;
        synchronized (gh2) {
            str2 = gh2.f65286f;
        }
        c5241xi.a(new C5215wh(n32, false, 1, null, new Gh(cf2, counterConfiguration, e82, str2)));
        this.f65394c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }
}
