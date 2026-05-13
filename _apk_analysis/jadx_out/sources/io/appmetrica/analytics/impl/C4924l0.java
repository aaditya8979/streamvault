package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4924l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f67173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67174b;

    public C4924l0(List list, boolean z10) {
        this.f67173a = list;
        this.f67174b = z10;
    }

    public final String toString() {
        return "AppMetricaConfigExtension(autoCollectedDataSubscribers=" + this.f67173a + ", needClearEnvironment=" + this.f67174b + ')';
    }
}
