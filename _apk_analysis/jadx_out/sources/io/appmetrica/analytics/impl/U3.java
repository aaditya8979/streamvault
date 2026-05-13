package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f65975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f65976b;

    public U3(Bm bm2, U u10) {
        this.f65975a = bm2;
        this.f65976b = u10;
    }

    public final T3 a(HashMap map) {
        AdvertisingIdsHolder advertisingIdsHolderA;
        C4817gm c4817gmE = this.f65975a.e();
        U u10 = this.f65976b;
        synchronized (u10) {
            advertisingIdsHolderA = u10.a(new Yd());
        }
        return new T3(T3.a(c4817gmE.f66849d), T3.a(c4817gmE.f66846a), T3.a(c4817gmE.f66847b), T3.a(c4817gmE.f66855j), T3.a(c4817gmE.f66854i), T3.a(AbstractC4832hb.a(Gm.a(c4817gmE.f66856k))), T3.a(AbstractC4832hb.a(map)), new IdentifiersResult(advertisingIdsHolderA.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderA.getGoogle().mStatus, advertisingIdsHolderA.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderA.getHuawei().mStatus, advertisingIdsHolderA.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getYandex().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getYandex().mAdTrackingInfo.advId, advertisingIdsHolderA.getYandex().mStatus, advertisingIdsHolderA.getYandex().mErrorExplanation), T3.a(AbstractC4832hb.a(c4817gmE.f66853h)), Jn.a(), c4817gmE.f66860o + ((long) c4817gmE.f66871z.f65166a), T3.a(c4817gmE.f66859n.f67261f), new Bundle());
    }
}
