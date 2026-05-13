package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Vb implements PermissionStrategy, LocationControllerObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Ub f66034b = new Ub();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f66035c = cn.w.p("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f66036a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        if (f66035c.contains(str)) {
            return !this.f66036a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f66036a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f66036a = false;
    }

    @NotNull
    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f66036a + ", locationPermissions=" + f66035c + ')';
    }
}
