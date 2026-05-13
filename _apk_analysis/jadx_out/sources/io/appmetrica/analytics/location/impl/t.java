package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocationFilter f68148a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Location f68151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f68152e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f68150c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f68149b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f68148a = locationFilter;
    }
}
