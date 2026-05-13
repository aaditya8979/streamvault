package com.inmobi.ads;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: loaded from: classes11.dex */
public final class AdMetaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f25069b;

    public AdMetaInfo(@NotNull String str, @Nullable JSONObject jSONObject) {
        p.k(str, "creativeID");
        this.f25068a = str;
        this.f25069b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f25069b;
        if (jSONObject != null) {
            return jSONObject.optDouble("buyerPrice");
        }
        return 0.0d;
    }

    @NotNull
    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f25069b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Nullable
    public final String getBidKeyword() {
        JSONObject jSONObject = this.f25069b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    @NotNull
    public final String getCreativeID() {
        return this.f25068a;
    }
}
