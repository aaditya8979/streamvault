package io.appmetrica.analytics.impl;

import android.content.Context;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.U;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class U implements Ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f65957b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FutureTask f65964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J f65965j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f65968m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65958c = "advertising identifiers collecting is forbidden by client configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65959d = "advertising identifiers collecting is forbidden by startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65960e = "advertising identifiers collecting is forbidden by unknown reason";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N f65961f = new N(new Ag(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final N f65962g = new N(new Ag("huawei"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f65963h = new N(new Ag("yandex"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f65966k = new AdvertisingIdsHolder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public G f65967l = new G(4, 4, 4);

    public U(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull C4817gm c4817gm) {
        this.f65956a = context;
        this.f65957b = iCommonExecutor;
        this.f65965j = new J(c4817gm);
    }

    public static final Void a(boolean z10, G g10, U u10, Hi hi2) {
        if (!z10 && tn.p.f(g10, u10.f65967l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u10.f65966k;
        AdTrackingInfoResult adTrackingInfoResultA = u10.a(g10.f65262a, new Q(u10));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultA.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            adTrackingInfoResultA = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultA.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA2 = u10.a(g10.f65263b, new S(u10));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultA2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            adTrackingInfoResultA2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultA2.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA3 = u10.a(g10.f65264c, new T(u10, hi2));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultA3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            adTrackingInfoResultA3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultA3.mErrorExplanation);
        }
        u10.f65966k = new AdvertisingIdsHolder(adTrackingInfoResultA, adTrackingInfoResultA2, adTrackingInfoResultA3);
        return null;
    }

    public static final Void e(U u10) {
        u10.f65966k = new AdvertisingIdsHolder(u10.a(u10.f65967l.f65262a, new Q(u10)), u10.a(u10.f65967l.f65263b, new S(u10)), u10.a(u10.f65967l.f65264c, new T(u10, new Yd())));
        return null;
    }

    public final AdTrackingInfoResult a(int i10, sn.a aVar) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (AdTrackingInfoResult) aVar.invoke();
        }
        if (i11 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f65958c);
        }
        if (i11 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f65959d);
        }
        if (i11 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f65960e);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final synchronized AdvertisingIdsHolder a() {
        return a(new Yd());
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final synchronized AdvertisingIdsHolder a(@NotNull Hi hi2) {
        try {
            a(hi2, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f65966k;
    }

    public final FutureTask a(final Hi hi2, final boolean z10) {
        final G gA = this.f65965j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: mh.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z10, gA, this, hi2);
            }
        });
        this.f65964i = futureTask;
        this.f65957b.execute(futureTask);
        FutureTask futureTask2 = this.f65964i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        tn.p.C(ToolBar.REFRESH);
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Ba, io.appmetrica.analytics.impl.InterfaceC4946lm
    public final synchronized void a(@NotNull C4817gm c4817gm) {
        this.f65965j.a(c4817gm);
        a((Hi) new Yd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void b(boolean z10) {
        this.f65968m = true;
        this.f65965j.f65383b.update(z10);
        a((Hi) new Yd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void c(boolean z10) {
        if (!this.f65968m) {
            b(z10);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ba
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f65964i;
        if (futureTask == null) {
            tn.p.C(ToolBar.REFRESH);
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f65966k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers(@NotNull Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final synchronized void init() {
        if (this.f65964i == null) {
            this.f65967l = this.f65965j.a();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: mh.s
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return U.e(this.f74296b);
                }
            });
            this.f65964i = futureTask;
            this.f65957b.execute(futureTask);
        }
    }
}
