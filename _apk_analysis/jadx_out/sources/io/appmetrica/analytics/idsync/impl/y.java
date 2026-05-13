package io.appmetrica.analytics.idsync.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f64938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f64939g;

    public y(String str, boolean z10, String str2, boolean z11, int i10, byte[] bArr, Map map) {
        this.f64933a = str;
        this.f64934b = z10;
        this.f64935c = str2;
        this.f64936d = z11;
        this.f64937e = i10;
        this.f64938f = bArr;
        this.f64939g = map;
    }

    public final String toString() {
        return "RequestResult(type='" + this.f64933a + "', isCompleted=" + this.f64934b + ", url=" + this.f64935c + ", responseCodeIsValid=" + this.f64936d + ", responseCode=" + this.f64937e + ", responseBody=" + this.f64938f + ", responseHeaders=" + this.f64939g + ')';
    }
}
