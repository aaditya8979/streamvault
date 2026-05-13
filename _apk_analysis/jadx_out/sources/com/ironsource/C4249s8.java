package com.ironsource;

import com.ironsource.C3978d4;
import com.ironsource.InterfaceC4232r8;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4249s8 implements InterfaceC4232r8, InterfaceC4232r8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private JSONObject f33518a = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private JSONObject f33519b = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private JSONObject f33520c = IronSourceVideoBridge.jsonObjectInit();

    private final Object e(String str) {
        if (this.f33520c.has(str)) {
            return this.f33520c.get(str);
        }
        if (this.f33519b.has(str)) {
            return this.f33519b.get(str);
        }
        if (this.f33518a.has(str)) {
            return this.f33518a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4232r8
    @Nullable
    public JSONObject a(@NotNull String str) {
        tn.p.k(str, "configKey");
        Object objE = e(str);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4232r8.a
    public void a(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "controllerConfig");
        this.f33518a = jSONObject;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C3978d4.a.f31206b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = IronSourceVideoBridge.jsonObjectInit();
        }
        this.f33519b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f33518a.optJSONObject(C3978d4.a.f31207c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = IronSourceVideoBridge.jsonObjectInit();
        }
        this.f33520c = jSONObjectOptJSONObject2;
    }

    @Override // com.ironsource.InterfaceC4232r8
    @Nullable
    public Integer b(@NotNull String str) {
        tn.p.k(str, "configKey");
        Object objE = e(str);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4232r8
    @Nullable
    public Boolean c(@NotNull String str) {
        tn.p.k(str, "configKey");
        Object objE = e(str);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4232r8
    @Nullable
    public String d(@NotNull String str) {
        tn.p.k(str, "configKey");
        Object objE = e(str);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }
}
