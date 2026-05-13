package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4733df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f66609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T7 f66610c;

    public C4733df(String str, JSONObject jSONObject, T7 t72) {
        this.f66608a = str;
        this.f66609b = jSONObject;
        this.f66610c = t72;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f66608a + "', additionalParams=" + this.f66609b + ", source=" + this.f66610c + '}';
    }
}
