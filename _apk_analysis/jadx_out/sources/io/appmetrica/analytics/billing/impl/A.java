package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64443b;

    public A(int i10, int i11) {
        this.f64442a = i10;
        this.f64443b = i11;
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }

    public final String toString() {
        return "ServiceSideBillingConfig(sendFrequencySeconds=" + this.f64442a + ", firstCollectingInappMaxAgeSeconds=" + this.f64443b + ')';
    }
}
