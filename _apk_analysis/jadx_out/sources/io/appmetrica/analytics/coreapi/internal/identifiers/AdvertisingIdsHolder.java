package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class AdvertisingIdsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f64653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f64654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f64655c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f64653a = adTrackingInfoResult;
        this.f64654b = adTrackingInfoResult2;
        this.f64655c = adTrackingInfoResult3;
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f64653a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f64654b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f64655c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f64653a + ", mHuawei=" + this.f64654b + ", yandex=" + this.f64655c + '}';
    }
}
