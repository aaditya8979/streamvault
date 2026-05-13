package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class u implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f68153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f68154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f68155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f68156d;

    public u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.f68153a = context;
        this.f68154b = permissionResolutionStrategy;
        this.f68155c = locationListener;
        this.f68156d = str;
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f68156d);
    }

    @NotNull
    public final Context a() {
        return this.f68153a;
    }

    @NotNull
    public final LocationListener b() {
        return this.f68155c;
    }

    @NotNull
    public final PermissionResolutionStrategy c() {
        return this.f68154b;
    }

    @NotNull
    public final String d() {
        return this.f68156d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f68154b.hasNecessaryPermissions(this.f68153a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f68153a, "location", "getting last known location for provider " + this.f68156d, "location manager", new FunctionWithThrowable() { // from class: nh.c
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return u.a(this.f75887a, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.f68155c.onLocationChanged(location);
            }
        }
    }
}
