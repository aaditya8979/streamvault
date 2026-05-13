package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Mb implements Lb, InterfaceC4946lm, LocationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qb f65583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationClient f65584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5169ul f65585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5268yk f65586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f65587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f65588g;

    public Mb(@NotNull Context context, @NotNull Qb qb2, @NotNull LocationClient locationClient) {
        this.f65582a = context;
        this.f65583b = qb2;
        this.f65584c = locationClient;
        Vb vb2 = new Vb();
        this.f65585d = new C5169ul(new C4903k5(vb2, C5009oa.k().p().getAskForPermissionStrategy()));
        this.f65586e = C5009oa.k().p();
        ((Tb) qb2).a(vb2, true);
        ((Tb) qb2).a(locationClient, true);
        this.f65587f = locationClient.getLastKnownExtractorProviderFactory();
        this.f65588g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(@Nullable Location location) {
        this.f65584c.updateUserLocation(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4946lm
    public final void a(@NotNull C4817gm c4817gm) {
        C4746e3 c4746e3 = c4817gm.f66869x;
        if (c4746e3 != null) {
            long j10 = c4746e3.f66649a;
            this.f65584c.updateCacheArguments(new CacheArguments(j10, ((long) 2) * j10));
        }
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(@NotNull Object obj) {
        ((Tb) this.f65583b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(boolean z10) {
        ((Tb) this.f65583b).a(z10);
    }

    @NotNull
    public final C5169ul b() {
        return this.f65585d;
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void b(@NotNull Object obj) {
        ((Tb) this.f65583b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f65587f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f65588g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f65585d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return this.f65584c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return this.f65584c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void init() {
        this.f65584c.init(this.f65582a, this.f65585d, C5009oa.I.f67421d.b(), this.f65586e.e());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerF = this.f65586e.f();
        if (moduleLocationSourcesServiceControllerF != null) {
            moduleLocationSourcesServiceControllerF.init();
        } else {
            LocationClient locationClient = this.f65584c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f65584c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Tb) this.f65583b).a(this.f65586e.g());
        C5009oa.I.f67438u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((Tb) this.f65583b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f65584c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f65584c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f65584c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f65584c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.f65584c.updateLocationFilter(locationFilter);
    }
}
