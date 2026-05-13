package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC4925l1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f67175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67176b;

    public RunnableC4925l1(C5149u1 c5149u1, ExternalAttribution externalAttribution) {
        this.f67176b = c5149u1;
        this.f67175a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67176b).a(this.f67175a);
    }
}
