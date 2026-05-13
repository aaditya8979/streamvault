package com.ironsource;

import android.os.Bundle;
import com.ironsource.C3978d4;
import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.Uf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Pd implements Cb, InterfaceC4016f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f30138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Db f30139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final U<RewardedAd> f30140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4137m2 f30141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4287uc f30142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f30143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC3974d0<RewardedAd> f30144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Uf.c f30145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Executor f30146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C4122l5 f30147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Uf f30148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private W1 f30149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30150m;

    public static final class a implements Uf.a {
        public a() {
        }

        @Override // com.ironsource.Uf.a
        public void a() {
            Pd.this.a(C4365z5.f34494a.s());
        }
    }

    public Pd(@NotNull RewardedAdRequest rewardedAdRequest, @NotNull Db db2, @NotNull U<RewardedAd> u10, @NotNull InterfaceC4137m2 interfaceC4137m2, @NotNull InterfaceC4287uc interfaceC4287uc, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull InterfaceC3974d0<RewardedAd> interfaceC3974d0, @NotNull Uf.c cVar, @NotNull Executor executor) {
        tn.p.k(rewardedAdRequest, "adRequest");
        tn.p.k(db2, "loadTaskConfig");
        tn.p.k(u10, "adLoadTaskListener");
        tn.p.k(interfaceC4137m2, "auctionResponseFetcher");
        tn.p.k(interfaceC4287uc, "networkLoadApi");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(interfaceC3974d0, "adObjectFactory");
        tn.p.k(cVar, "timerFactory");
        tn.p.k(executor, "taskFinishedExecutor");
        this.f30138a = rewardedAdRequest;
        this.f30139b = db2;
        this.f30140c = u10;
        this.f30141d = interfaceC4137m2;
        this.f30142e = interfaceC4287uc;
        this.f30143f = interfaceC4209q1;
        this.f30144g = interfaceC3974d0;
        this.f30145h = cVar;
        this.f30146i = executor;
    }

    public /* synthetic */ Pd(RewardedAdRequest rewardedAdRequest, Db db2, U u10, InterfaceC4137m2 interfaceC4137m2, InterfaceC4287uc interfaceC4287uc, InterfaceC4209q1 interfaceC4209q1, InterfaceC3974d0 interfaceC3974d0, Uf.c cVar, Executor executor, int i10, tn.i iVar) {
        this(rewardedAdRequest, db2, u10, interfaceC4137m2, interfaceC4287uc, interfaceC4209q1, interfaceC3974d0, (i10 & 128) != 0 ? new Uf.d() : cVar, (i10 & 256) != 0 ? V7.f30593a.c() : executor);
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f30543a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC4082j1.c.f31994a.a(new C4136m1.l(str + "=" + strValueOf)).a(this.f30143f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Pd pd2, O9 o92) {
        tn.p.k(pd2, "this$0");
        tn.p.k(o92, "$adInstance");
        if (pd2.f30150m) {
            return;
        }
        pd2.f30150m = true;
        Uf uf2 = pd2.f30148k;
        if (uf2 != null) {
            uf2.cancel();
        }
        C4122l5 c4122l5 = pd2.f30147j;
        if (c4122l5 == null) {
            tn.p.C("taskStartedTime");
            c4122l5 = null;
        }
        InterfaceC4082j1.c.f31994a.a(new C4136m1.f(C4122l5.a(c4122l5))).a(pd2.f30143f);
        W1 w12 = pd2.f30149l;
        if (w12 != null) {
            w12.c("onAdInstanceLoadSuccess");
        }
        InterfaceC3974d0<RewardedAd> interfaceC3974d0 = pd2.f30144g;
        W1 w13 = pd2.f30149l;
        tn.p.h(w13);
        pd2.f30140c.a(interfaceC3974d0.a(o92, w13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Pd pd2, IronSourceError ironSourceError) {
        tn.p.k(pd2, "this$0");
        tn.p.k(ironSourceError, "$error");
        if (pd2.f30150m) {
            return;
        }
        pd2.f30150m = true;
        Uf uf2 = pd2.f30148k;
        if (uf2 != null) {
            uf2.cancel();
        }
        InterfaceC4082j1.c.a aVar = InterfaceC4082j1.c.f31994a;
        C4136m1.j jVar = new C4136m1.j(ironSourceError.getErrorCode());
        C4136m1.k kVar = new C4136m1.k(ironSourceError.getErrorMessage());
        C4122l5 c4122l5 = pd2.f30147j;
        if (c4122l5 == null) {
            tn.p.C("taskStartedTime");
            c4122l5 = null;
        }
        aVar.a(jVar, kVar, new C4136m1.f(C4122l5.a(c4122l5))).a(pd2.f30143f);
        W1 w12 = pd2.f30149l;
        if (w12 != null) {
            w12.a("onAdInstanceLoadFail");
        }
        pd2.f30140c.b(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4016f6
    public void a(@NotNull final O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        this.f30146i.execute(new Runnable() { // from class: com.ironsource.xi
            @Override // java.lang.Runnable
            public final void run() {
                Pd.a(this.f34402b, o92);
            }
        });
    }

    public final void a(@NotNull final IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        this.f30146i.execute(new Runnable() { // from class: com.ironsource.wi
            @Override // java.lang.Runnable
            public final void run() {
                Pd.a(this.f34357b, ironSourceError);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4016f6
    public void a(@NotNull String str) {
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        a(C4365z5.f34494a.c(str));
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f30147j = new C4122l5();
        this.f30143f.a(new C4136m1.s(this.f30139b.f()), new C4136m1.n(this.f30139b.g().b()), new C4136m1.b(this.f30138a.getAdId$mediationsdk_release()));
        InterfaceC4082j1.c.f31994a.a().a(this.f30143f);
        a(this.f30138a.getExtraParams());
        long jH = this.f30139b.h();
        Uf.c cVar = this.f30145h;
        Uf.b bVar = new Uf.b();
        bVar.b(jH);
        bn.r rVar = bn.r.f5635a;
        Uf ufA = cVar.a(bVar);
        this.f30148k = ufA;
        if (ufA != null) {
            ufA.a(new a());
        }
        Object objA = this.f30141d.a();
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
        if (thM7537exceptionOrNullimpl != null) {
            tn.p.i(thM7537exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((C4018f8) thM7537exceptionOrNullimpl).a());
            objA = null;
        }
        C4083j2 c4083j2 = (C4083j2) objA;
        if (c4083j2 == null) {
            return;
        }
        InterfaceC4209q1 interfaceC4209q1 = this.f30143f;
        String strB = c4083j2.b();
        if (strB != null) {
            interfaceC4209q1.a(new C4136m1.d(strB));
        }
        JSONObject jSONObjectF = c4083j2.f();
        if (jSONObjectF != null) {
            interfaceC4209q1.a(new C4136m1.m(jSONObjectF));
        }
        String strA = c4083j2.a();
        if (strA != null) {
            interfaceC4209q1.a(new C4136m1.g(strA));
        }
        EnumC4200p9 enumC4200p9G = this.f30139b.g();
        C3998e6 c3998e6 = new C3998e6();
        c3998e6.a(this);
        O9 o9A = new P9(this.f30138a.getProviderName$mediationsdk_release().value(), c3998e6).a(enumC4200p9G.b(EnumC4200p9.Bidder)).b(this.f30139b.i()).c().a(this.f30138a.getAdId$mediationsdk_release()).a(kotlin.collections.a.q(new C4167nc().a(), U5.f30543a.a(this.f30138a.getExtraParams()))).a();
        InterfaceC4209q1 interfaceC4209q12 = this.f30143f;
        String strE = o9A.e();
        tn.p.j(strE, "adInstance.id");
        interfaceC4209q12.a(new C4136m1.b(strE));
        C4321wc c4321wc = new C4321wc(c4083j2, this.f30139b.j());
        this.f30149l = new W1(new C4182o9(this.f30138a.getInstanceId(), enumC4200p9G.b(), c4083j2.a()), new com.ironsource.mediationsdk.d(), c4083j2.c());
        InterfaceC4082j1.d.f32003a.c().a(this.f30143f);
        InterfaceC4287uc interfaceC4287uc = this.f30142e;
        tn.p.j(o9A, C3978d4.i.f31356p0);
        interfaceC4287uc.a(o9A, c4321wc);
    }
}
