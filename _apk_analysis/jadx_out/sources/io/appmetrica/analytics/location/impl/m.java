package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends SynchronizedDataCache {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f68133d = 200;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f68134e = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f68136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f68131b = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f68132c = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<String> f68135f = Arrays.asList("gps", "network");

    public m() {
        l lVar = new l(f68132c);
        long j10 = f68131b;
        this(lVar, j10, 2 * j10);
    }

    public m(l lVar, long j10, long j11) {
        super(j10, j11, "location");
        this.f68136a = lVar;
    }

    public static boolean a(@Nullable Location location, @Nullable Location location2, long j10, long j11) {
        if (location2 == null) {
            return true;
        }
        if (location == null) {
            return false;
        }
        long time = location.getTime() - location2.getTime();
        boolean z10 = time > j10;
        boolean z11 = time < (-j10);
        boolean z12 = time > 0;
        if (z10) {
            return true;
        }
        if (z11) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z13 = accuracy > 0;
        boolean z14 = accuracy < 0;
        boolean z15 = ((long) accuracy) > j11;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        boolean zEquals = provider == null ? provider2 == null : provider.equals(provider2);
        if (z14) {
            return true;
        }
        if (!z12 || z13) {
            return z12 && !z15 && zEquals;
        }
        return true;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean shouldUpdate(@NonNull Location location) {
        return f68135f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || a(location, (Location) this.mCachedData.getData(), this.f68136a.f68130a, 200L));
    }
}
