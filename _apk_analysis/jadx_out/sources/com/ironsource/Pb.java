package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdViewBinder f30136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private AdapterNativeAdData f30137b;

    @Nullable
    public final AdapterNativeAdData a() {
        return this.f30137b;
    }

    public final void a(@Nullable AdapterNativeAdData adapterNativeAdData) {
        this.f30137b = adapterNativeAdData;
    }

    public final void a(@Nullable AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f30136a = adapterNativeAdViewBinder;
    }

    @Nullable
    public final AdapterNativeAdViewBinder b() {
        return this.f30136a;
    }
}
