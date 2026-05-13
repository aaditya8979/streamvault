package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4807gc extends Xn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f66822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4807gc(@NonNull Ua ua2, @NonNull AppMetricaConfig appMetricaConfig) {
        super(ua2);
        String str = appMetricaConfig.apiKey;
        this.f66822b = appMetricaConfig;
    }

    @NonNull
    public final Va a() {
        return this.f66205a.a().a(this.f66822b);
    }
}
