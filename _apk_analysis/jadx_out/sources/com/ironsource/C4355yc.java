package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4355yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f34452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f34454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f34455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f34456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final JSONObject f34457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Map<String, JSONObject> f34458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f34459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f34460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f34461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private C4355yc f34462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final bn.g f34463l;

    /* JADX INFO: renamed from: com.ironsource.yc$a */
    public static final class a extends Lambda implements sn.a<NetworkSettings> {
        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() {
            String strJ = C4355yc.this.j();
            String strL = C4355yc.this.l();
            String strH = C4355yc.this.h();
            String strK = C4355yc.this.k();
            JSONObject jSONObjectC = C4355yc.this.c();
            C4355yc c4355yc = C4355yc.this.f34462k;
            JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC, c4355yc != null ? c4355yc.c() : null);
            JSONObject jSONObjectM = C4355yc.this.m();
            C4355yc c4355yc2 = C4355yc.this.f34462k;
            JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectM, c4355yc2 != null ? c4355yc2.m() : null);
            JSONObject jSONObjectE = C4355yc.this.e();
            C4355yc c4355yc3 = C4355yc.this.f34462k;
            JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectE, c4355yc3 != null ? c4355yc3.e() : null);
            JSONObject jSONObjectD = C4355yc.this.d();
            C4355yc c4355yc4 = C4355yc.this.f34462k;
            JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectD, c4355yc4 != null ? c4355yc4.d() : null);
            JSONObject jSONObjectG = C4355yc.this.g();
            C4355yc c4355yc5 = C4355yc.this.f34462k;
            NetworkSettings networkSettings = new NetworkSettings(strJ, strL, strH, strK, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4, IronSourceUtils.b(jSONObjectG, c4355yc5 != null ? c4355yc5.g() : null));
            networkSettings.setIsMultipleInstances(C4355yc.this.o());
            networkSettings.setSubProviderId(C4355yc.this.n());
            networkSettings.setAdSourceNameForEvents(C4355yc.this.b());
            return networkSettings;
        }
    }

    public C4355yc(@NotNull String str, @NotNull JSONObject jSONObject) {
        tn.p.k(str, "providerName");
        tn.p.k(jSONObject, "networkSettings");
        this.f34452a = str;
        this.f34453b = str;
        String strOptString = jSONObject.optString("providerLoadName", str);
        tn.p.j(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.f34454c = strOptString;
        String strOptString2 = jSONObject.optString("providerDefaultInstance", strOptString);
        tn.p.j(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f34455d = strOptString2;
        Object objOpt = jSONObject.opt("providerNetworkKey");
        this.f34456e = objOpt instanceof String ? (String) objOpt : null;
        this.f34457f = jSONObject.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C4324wf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str2 = (String) obj;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str2) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = IronSourceVideoBridge.jsonObjectInit();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.f34458g = linkedHashMap;
        String strOptString3 = jSONObject.optString("spId", "0");
        tn.p.j(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f34459h = strOptString3;
        String strOptString4 = jSONObject.optString("adSourceName");
        tn.p.j(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f34460i = strOptString4;
        this.f34461j = jSONObject.optBoolean("mpis", false);
        this.f34463l = kotlin.b.b(new a());
    }

    @NotNull
    public final Map<String, JSONObject> a() {
        return this.f34458g;
    }

    @NotNull
    public final String b() {
        return this.f34460i;
    }

    public final void b(@Nullable C4355yc c4355yc) {
        this.f34462k = c4355yc;
    }

    @Nullable
    public final JSONObject c() {
        return this.f34457f;
    }

    @NotNull
    public final JSONObject d() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f34458g.get("banner"), this.f34457f);
        tn.p.j(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final JSONObject e() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f34458g.get("interstitial"), this.f34457f);
        tn.p.j(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final NetworkSettings f() {
        return (NetworkSettings) this.f34463l.getValue();
    }

    @NotNull
    public final JSONObject g() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f34458g.get("nativeAd"), this.f34457f);
        tn.p.j(jSONObjectB, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final String h() {
        return this.f34455d;
    }

    @NotNull
    public final String i() {
        return this.f34453b;
    }

    @NotNull
    public final String j() {
        return this.f34452a;
    }

    @Nullable
    public final String k() {
        return this.f34456e;
    }

    @NotNull
    public final String l() {
        return this.f34454c;
    }

    @NotNull
    public final JSONObject m() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.f34458g.get("rewarded"), this.f34457f);
        tn.p.j(jSONObjectB, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectB;
    }

    @NotNull
    public final String n() {
        return this.f34459h;
    }

    public final boolean o() {
        return this.f34461j;
    }
}
