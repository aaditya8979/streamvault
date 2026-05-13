package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5215wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q5 f67902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f67905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Gh f67906e;

    public C5215wh(Q5 q52, boolean z10, int i10, HashMap map, Gh gh2) {
        this.f67902a = q52;
        this.f67903b = z10;
        this.f67904c = i10;
        this.f67905d = map;
        this.f67906e = gh2;
    }

    public final String toString() {
        return "ReportToSend(report=" + this.f67902a + ", serviceDataReporterType=" + this.f67904c + ", environment=" + this.f67906e + ", isCrashReport=" + this.f67903b + ", trimmedFields=" + this.f67905d + ')';
    }
}
