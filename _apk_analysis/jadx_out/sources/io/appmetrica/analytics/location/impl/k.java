package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f68120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f68121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f68122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f68123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f68124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f68125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f68126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f68127h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f68128i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Location f68129j;

    public k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull p pVar) {
        this.f68120a = context;
        this.f68122c = pVar;
        this.f68121b = permissionExtractor;
        this.f68123d = iHandlerExecutor;
        this.f68124e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f68125f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    @Nullable
    public final synchronized Location a() {
        return (Location) this.f68122c.f68140b.getData();
    }

    public final synchronized void a(@Nullable Location location) {
        if (location != null) {
            this.f68129j = location;
        }
    }

    @AnyThread
    public final void a(@NonNull i iVar) {
        this.f68123d.execute(new j(this, iVar));
    }

    @AnyThread
    public final synchronized void a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f68120a, this.f68121b, this.f68123d, this.f68124e);
        this.f68127h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f68126g) {
            extractor.updateLastKnownLocation();
        }
    }

    @AnyThread
    public final synchronized void a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f68120a, this.f68121b, this.f68123d, this.f68124e);
        LocationReceiver locationReceiver2 = (LocationReceiver) this.f68128i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
        if (this.f68126g) {
            if (locationReceiver2 != null) {
                locationReceiver2.stopLocationUpdates();
            }
            locationReceiver.startLocationUpdates();
        }
    }

    @Nullable
    public final synchronized Location b() {
        return this.f68129j;
    }

    @AnyThread
    public final synchronized void b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f68127h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    @AnyThread
    public final synchronized void b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f68128i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f68126g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    @Nullable
    public final synchronized Location c() {
        Location locationA;
        locationA = this.f68129j;
        if (locationA == null) {
            locationA = a();
        }
        return locationA;
    }

    public final synchronized void d() {
        this.f68125f.startUpdates();
        Iterator it = this.f68128i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).startLocationUpdates();
        }
        updateLastKnown();
    }

    public final synchronized void e() {
        this.f68125f.stopUpdates();
        Iterator it = this.f68128i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f68126g) {
            this.f68126g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f68126g) {
            this.f68126g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f68127h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }
}
