package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.r;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends u implements LocationReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f68146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68147f;

    public r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f68146e = looper;
        this.f68147f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final bn.r a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f68156d, rVar.f68147f, 0.0f, rVar.f68155c, rVar.f68146e);
        return bn.r.f5635a;
    }

    public static final bn.r b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f68155c);
        return bn.r.f5635a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f68154b.hasNecessaryPermissions(this.f68153a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f68153a, "location", "request location updates for " + this.f68156d + " provider", "location manager", new FunctionWithThrowable() { // from class: nh.a
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return r.a(this.f75885a, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f68153a, "location", "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: nh.b
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return r.b(this.f75886a, (LocationManager) obj);
            }
        });
    }
}
