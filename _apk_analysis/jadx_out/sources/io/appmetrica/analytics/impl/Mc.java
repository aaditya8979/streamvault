package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Mc implements InterfaceC5121sn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f65590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f65591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f65592d;

    public Mc(@NotNull Context context) {
        this.f65589a = context;
        this.f65590b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(C5009oa.k().j(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f65591c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f65592d = new CachedDataProvider.CachedData(millis, millis * ((long) 2), "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5121sn
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized Lc a() {
        Lc lc2;
        lc2 = (Lc) this.f65592d.getData();
        if (lc2 == null || this.f65592d.shouldUpdateData()) {
            lc2 = new Lc(this.f65590b.hasNecessaryPermissions(this.f65589a) ? this.f65591c.getNetworkType() : "unknown");
            this.f65592d.setData(lc2);
        }
        return lc2;
    }
}
