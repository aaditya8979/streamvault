package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29561d;

    public Hb(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "applicationLogger");
        this.f29558a = jSONObject.optInt("server", 3);
        this.f29559b = jSONObject.optInt("publisher", 3);
        this.f29560c = jSONObject.optInt("console", 3);
        this.f29561d = jSONObject.optBoolean("shouldSendPublisherLogsOnUIThread", false);
    }

    public final int a() {
        return this.f29560c;
    }

    public final int b() {
        return this.f29559b;
    }

    public final int c() {
        return this.f29558a;
    }

    public final boolean d() {
        return this.f29561d;
    }
}
