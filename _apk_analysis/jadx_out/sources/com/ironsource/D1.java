package com.ironsource;

import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final HashSet<String> f28897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f28898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f28899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f28900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f28901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f28902g;

    public D1(@NotNull JSONObject jSONObject) throws JSONException {
        tn.p.k(jSONObject, "applicationCrashReporterSettings");
        this.f28896a = jSONObject.optBoolean("enabled", false);
        List<String> listB = C4127la.b(jSONObject.optJSONArray("keysToInclude"));
        this.f28897b = listB != null ? cn.f0.e1(listB) : null;
        String strOptString = jSONObject.optString("reporterURL");
        tn.p.j(strOptString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f28898c = strOptString;
        String strOptString2 = jSONObject.optString("reporterKeyword");
        tn.p.j(strOptString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f28899d = strOptString2;
        this.f28900e = jSONObject.optBoolean("includeANR", false);
        this.f28901f = jSONObject.optInt("timeout", 5000);
        this.f28902g = jSONObject.optBoolean("setIgnoreDebugger", false);
    }

    public final int a() {
        return this.f28901f;
    }

    @Nullable
    public final HashSet<String> b() {
        return this.f28897b;
    }

    @NotNull
    public final String c() {
        return this.f28899d;
    }

    @NotNull
    public final String d() {
        return this.f28898c;
    }

    public final boolean e() {
        return this.f28900e;
    }

    public final boolean f() {
        return this.f28896a;
    }

    public final boolean g() {
        return this.f28902g;
    }
}
