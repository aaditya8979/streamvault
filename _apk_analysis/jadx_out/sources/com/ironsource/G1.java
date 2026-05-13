package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f29349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f29350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f29354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f29355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f29356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f29357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f29358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<Integer> f29359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<Integer> f29360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<Integer> f29361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final List<Integer> f29362n;

    public G1(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "applicationEvents");
        String strOptString = jSONObject.optString("abt");
        tn.p.j(strOptString, "it");
        this.f29349a = strOptString.length() <= 0 ? null : strOptString;
        this.f29350b = jSONObject.optBoolean("sendUltraEvents", false);
        this.f29351c = jSONObject.optBoolean("sendEventsToggle", false);
        this.f29352d = jSONObject.optBoolean("eventsCompression", false);
        this.f29353e = jSONObject.optInt("eventsCompressionLevel", -1);
        String strOptString2 = jSONObject.optString("serverEventsURL");
        tn.p.j(strOptString2, "applicationEvents.optStr…(SERVER_EVENTS_URL_FIELD)");
        this.f29354f = strOptString2;
        String strOptString3 = jSONObject.optString("serverEventsType");
        tn.p.j(strOptString3, "applicationEvents.optString(SERVER_EVENTS_TYPE)");
        this.f29355g = strOptString3;
        this.f29356h = jSONObject.optInt("backupThreshold", -1);
        this.f29357i = jSONObject.optInt("maxNumberOfEvents", -1);
        this.f29358j = jSONObject.optInt("maxEventsPerBatch", 5000);
        this.f29359k = a(jSONObject, "optOut");
        this.f29360l = a(jSONObject, "optIn");
        this.f29361m = a(jSONObject, "triggerEvents");
        this.f29362n = a(jSONObject, "nonConnectivityEvents");
    }

    private final List<Integer> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return cn.w.m();
        }
        zn.i iVarV = zn.n.v(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(cn.x.x(iVarV, 10));
        Iterator<Integer> it = iVarV.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.getInt(((cn.k0) it).nextInt())));
        }
        return arrayList;
    }

    @Nullable
    public final String a() {
        return this.f29349a;
    }

    public final int b() {
        return this.f29356h;
    }

    public final boolean c() {
        return this.f29352d;
    }

    public final int d() {
        return this.f29353e;
    }

    @NotNull
    public final String e() {
        return this.f29355g;
    }

    public final int f() {
        return this.f29358j;
    }

    public final int g() {
        return this.f29357i;
    }

    @NotNull
    public final List<Integer> h() {
        return this.f29362n;
    }

    @NotNull
    public final List<Integer> i() {
        return this.f29360l;
    }

    @NotNull
    public final List<Integer> j() {
        return this.f29359k;
    }

    public final boolean k() {
        return this.f29351c;
    }

    public final boolean l() {
        return this.f29350b;
    }

    @NotNull
    public final String m() {
        return this.f29354f;
    }

    @NotNull
    public final List<Integer> n() {
        return this.f29361m;
    }
}
