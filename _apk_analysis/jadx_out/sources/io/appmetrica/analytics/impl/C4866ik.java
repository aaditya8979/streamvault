package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.AppMetricaService;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4866ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66991a;

    public C4866ik(String str) {
        this.f66991a = str;
    }

    public final String toString() {
        return "ServiceDescription(packageName='" + this.f66991a + "', serviceScheme='appmetrica', serviceClass=" + AppMetricaService.class + ')';
    }
}
