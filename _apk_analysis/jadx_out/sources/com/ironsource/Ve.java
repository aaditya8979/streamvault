package com.ironsource;

import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private We f30603a;

    public Ve(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "config");
        this.f30603a = We.f30636b.a(jSONObject.optInt(C3978d4.a.f31224t, We.CurrentlyLoadedAds.b()));
    }

    @NotNull
    public final We a() {
        return this.f30603a;
    }
}
