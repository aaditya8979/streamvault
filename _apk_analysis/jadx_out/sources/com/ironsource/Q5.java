package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONObject f30207a;

    public Q5(@Nullable JSONObject jSONObject) {
        this.f30207a = jSONObject;
    }

    @Nullable
    public final Boolean a(@NotNull String str) {
        tn.p.k(str, "key");
        JSONObject jSONObject = this.f30207a;
        Object objOpt = jSONObject != null ? jSONObject.opt(str) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    @Nullable
    public final Integer b(@NotNull String str) {
        tn.p.k(str, "key");
        JSONObject jSONObject = this.f30207a;
        Object objOpt = jSONObject != null ? jSONObject.opt(str) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    @Nullable
    public final String c(@NotNull String str) {
        tn.p.k(str, "key");
        JSONObject jSONObject = this.f30207a;
        Object objOpt = jSONObject != null ? jSONObject.opt(str) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }
}
