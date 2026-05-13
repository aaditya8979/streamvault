package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class I3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f29587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Integer f29588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final N3 f29589c;

    public I3(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "features");
        this.f29587a = jSONObject.has("enabled") ? Boolean.valueOf(jSONObject.getBoolean("enabled")) : null;
        this.f29588b = jSONObject.has(Ne.f29946l1) ? Integer.valueOf(jSONObject.getInt(Ne.f29946l1)) : null;
        this.f29589c = jSONObject.has(Ne.f29954n1) ? N3.f29877c.a(jSONObject.optString(Ne.f29954n1)) : null;
    }

    @Nullable
    public final Boolean a() {
        return this.f29587a;
    }

    @Nullable
    public final Integer b() {
        return this.f29588b;
    }

    @Nullable
    public final N3 c() {
        return this.f29589c;
    }
}
