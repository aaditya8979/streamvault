package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes7.dex */
public final class M5 extends BaseRequestConfig.DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C4817gm f65562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SdkEnvironmentProvider f65563b;

    public M5(@NonNull C4817gm c4817gm, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c4817gm.c(), c4817gm.a(), c4817gm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f65562a = c4817gm;
        this.f65563b = sdkEnvironmentProvider;
    }
}
