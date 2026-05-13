package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4190p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f33175a;

    public C4190p(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "adFormatAuctionSettings");
        this.f33175a = jSONObject.has("isLoadWhileShow") ? Boolean.valueOf(jSONObject.optBoolean("isLoadWhileShow")) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.f33175a;
    }
}
