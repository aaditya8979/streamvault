package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3933ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f30949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f30950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final N3 f30951c;

    public C3933ad(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "features");
        this.f30949a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.f30950b = jSONObject.has(Ne.f29950m1) ? Integer.valueOf(jSONObject.getInt(Ne.f29950m1)) : null;
        this.f30951c = N3.Second;
    }

    @Nullable
    public final Boolean a() {
        return this.f30949a;
    }

    @Nullable
    public final Integer b() {
        return this.f30950b;
    }

    @NotNull
    public final N3 c() {
        return this.f30951c;
    }
}
