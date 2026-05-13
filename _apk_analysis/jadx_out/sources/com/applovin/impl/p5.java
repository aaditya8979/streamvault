package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.c5;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p5 extends i5 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static JSONObject f9531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f9532k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map f9533l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a3 f9534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f9535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f9536i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    public static class c implements c5.a, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f9537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f9538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f9539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f9540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Collection f9541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f9543g;

        private c(int i10, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f9539c = i10;
            this.f9537a = bVar;
            this.f9542f = kVar;
            this.f9543g = kVar.O();
            this.f9538b = new Object();
            this.f9541e = new ArrayList(i10);
            this.f9540d = new AtomicBoolean();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<c5> arrayList;
            synchronized (this.f9538b) {
                arrayList = new ArrayList(this.f9541e);
            }
            JSONArray jSONArray = new JSONArray();
            for (c5 c5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    d5 d5VarF = c5Var.f();
                    jSONObject.put("name", d5VarF.c());
                    jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, d5VarF.b());
                    jSONObject.put("adapter_version", c5Var.a());
                    jSONObject.put("sdk_version", c5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = c5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", c5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", c5Var.b());
                    jSONObject2.put("is_cached", c5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9543g.a("TaskCollectSignals", "Collected signal from " + d5VarF);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9543g.a("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                    this.f9542f.D().a("TaskCollectSignals", "createSignalsData", e10);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f9537a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.c5.a
        public void a(c5 c5Var) {
            boolean z10;
            synchronized (this.f9538b) {
                this.f9541e.add(c5Var);
                int i10 = this.f9539c - 1;
                this.f9539c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f9540d.compareAndSet(false, true)) {
                if (n7.i() && ((Boolean) this.f9542f.a(x4.P)).booleanValue()) {
                    this.f9542f.q0().a((i5) new r6(this.f9542f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.kd
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8628b.a();
                        }
                    }), d6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9540d.compareAndSet(false, true)) {
                a();
            }
        }
    }

    public p5(a3 a3Var, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f9534g = a3Var;
        this.f9535h = context;
        this.f9536i = bVar;
    }

    private void a(final d5 d5Var, final c5.a aVar) {
        if (d5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.jd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8575b.b(d5Var, aVar);
                }
            });
        } else {
            this.f8505a.X().collectSignal(d5Var, this.f9535h, aVar);
        }
    }

    private void a(String str, Throwable th2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f8507c.a(this.f8506b, "No signals collected: " + str, th2);
        }
        b bVar = this.f9536i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f9536i, this.f8505a);
        this.f8505a.q0().a(new r6(this.f8505a, "timeoutCollectSignal", cVar), d6.b.TIMEOUT, ((Long) this.f8505a.a(r3.f9762w7)).longValue());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new d5(this.f9534g, jSONArray.getJSONObject(i10), jSONObject, this.f8505a), cVar);
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (f9532k) {
            f9531j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f9533l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e10) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e10);
            kVar.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d5 d5Var, c5.a aVar) {
        this.f8505a.X().collectSignal(d5Var, this.f9535h, aVar);
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f9533l.get(this.f9534g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f9534g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f9532k) {
                jSONArray = JsonUtils.getJSONArray(f9531j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f9533l.size() > 0) {
                    b(jSONArray, f9531j);
                    return;
                } else {
                    a(jSONArray, f9531j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f8507c.k(this.f8506b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f8505a.a(z4.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f9533l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e10) {
            a("Failed to wait for signals", e10);
            this.f8505a.D().a("TaskCollectSignals", "waitForSignals", e10);
        } catch (JSONException e11) {
            a("Failed to parse signals JSON", e11);
            this.f8505a.D().a("TaskCollectSignals", "parseSignalsJSON", e11);
        } catch (Throwable th2) {
            a("Failed to collect signals", th2);
            this.f8505a.D().a("TaskCollectSignals", "collectSignals", th2);
        }
    }
}
