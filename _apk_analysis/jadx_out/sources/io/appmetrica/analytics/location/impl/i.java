package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationFilter f68116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheArguments f68117b;

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f68116a = locationFilter;
        this.f68117b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tn.p.f(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return tn.p.f(this.f68116a, iVar.f68116a) && tn.p.f(this.f68117b, iVar.f68117b);
    }

    public final int hashCode() {
        return this.f68117b.hashCode() + (this.f68116a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f68116a + ", cacheArguments=" + this.f68117b + ')';
    }
}
