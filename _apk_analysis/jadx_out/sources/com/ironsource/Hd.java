package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f29562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f29563b;

    public Hd(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull String str2) {
        tn.p.k(jSONObject, "features");
        tn.p.k(str, "nameKey");
        tn.p.k(str2, "amountKey");
        this.f29562a = jSONObject.has(str) ? jSONObject.getString(str) : null;
        this.f29563b = jSONObject.has(str2) ? Integer.valueOf(jSONObject.getInt(str2)) : null;
    }

    @Nullable
    public final Integer a() {
        return this.f29563b;
    }

    @Nullable
    public final String b() {
        return this.f29562a;
    }
}
