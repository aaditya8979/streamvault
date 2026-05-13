package com.ironsource;

import android.os.Bundle;
import com.ironsource.C3978d4;
import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.Uf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4352y9 implements Cb, InterfaceC4016f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f34431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Db f34432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final U<InterstitialAd> f34433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4137m2 f34434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4287uc f34435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f34436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC3974d0<InterstitialAd> f34437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Uf.c f34438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Executor f34439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C4122l5 f34440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Uf f34441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private W1 f34442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f34443m;

    /* JADX INFO: renamed from: com.ironsource.y9$a */
    public static final class a implements Uf.a {
        public a() {
        }

        @Override // com.ironsource.Uf.a
        public void a() {
            C4352y9.this.a(C4365z5.f34494a.s());
        }
    }

    public C4352y9(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull Db db2, @NotNull U<InterstitialAd> u10, @NotNull InterfaceC4137m2 interfaceC4137m2, @NotNull InterfaceC4287uc interfaceC4287uc, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull InterfaceC3974d0<InterstitialAd> interfaceC3974d0, @NotNull Uf.c cVar, @NotNull Executor executor) {
        tn.p.k(interstitialAdRequest, "adRequest");
        tn.p.k(db2, "loadTaskConfig");
        tn.p.k(u10, "adLoadTaskListener");
        tn.p.k(interfaceC4137m2, "auctionResponseFetcher");
        tn.p.k(interfaceC4287uc, "networkLoadApi");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(interfaceC3974d0, "adObjectFactory");
        tn.p.k(cVar, "timerFactory");
        tn.p.k(executor, "taskFinishedExecutor");
        this.f34431a = interstitialAdRequest;
        this.f34432b = db2;
        this.f34433c = u10;
        this.f34434d = interfaceC4137m2;
        this.f34435e = interfaceC4287uc;
        this.f34436f = interfaceC4209q1;
        this.f34437g = interfaceC3974d0;
        this.f34438h = cVar;
        this.f34439i = executor;
    }

    public /* synthetic */ C4352y9(InterstitialAdRequest interstitialAdRequest, Db db2, U u10, InterfaceC4137m2 interfaceC4137m2, InterfaceC4287uc interfaceC4287uc, InterfaceC4209q1 interfaceC4209q1, InterfaceC3974d0 interfaceC3974d0, Uf.c cVar, Executor executor, int i10, tn.i iVar) {
        this(interstitialAdRequest, db2, u10, interfaceC4137m2, interfaceC4287uc, interfaceC4209q1, interfaceC3974d0, (i10 & 128) != 0 ? new Uf.d() : cVar, (i10 & 256) != 0 ? V7.f30593a.c() : executor);
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f30543a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC4082j1.c.f31994a.a(new C4136m1.l(str + "=" + strValueOf)).a(this.f34436f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4352y9 c4352y9, O9 o92) {
        tn.p.k(c4352y9, "this$0");
        tn.p.k(o92, "$adInstance");
        if (c4352y9.f34443m) {
            return;
        }
        c4352y9.f34443m = true;
        Uf uf2 = c4352y9.f34441k;
        if (uf2 != null) {
            uf2.cancel();
        }
        C4122l5 c4122l5 = c4352y9.f34440j;
        if (c4122l5 == null) {
            tn.p.C("taskStartedTime");
            c4122l5 = null;
        }
        InterfaceC4082j1.c.f31994a.a(new C4136m1.f(C4122l5.a(c4122l5))).a(c4352y9.f34436f);
        W1 w12 = c4352y9.f34442l;
        if (w12 != null) {
            w12.c("onAdInstanceDidLoad");
        }
        InterfaceC3974d0<InterstitialAd> interfaceC3974d0 = c4352y9.f34437g;
        W1 w13 = c4352y9.f34442l;
        tn.p.h(w13);
        c4352y9.f34433c.a(interfaceC3974d0.a(o92, w13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4352y9 c4352y9, IronSourceError ironSourceError) {
        tn.p.k(c4352y9, "this$0");
        tn.p.k(ironSourceError, "$error");
        if (c4352y9.f34443m) {
            return;
        }
        c4352y9.f34443m = true;
        Uf uf2 = c4352y9.f34441k;
        if (uf2 != null) {
            uf2.cancel();
        }
        InterfaceC4082j1.c.a aVar = InterfaceC4082j1.c.f31994a;
        C4136m1.j jVar = new C4136m1.j(ironSourceError.getErrorCode());
        C4136m1.k kVar = new C4136m1.k(ironSourceError.getErrorMessage());
        C4122l5 c4122l5 = c4352y9.f34440j;
        if (c4122l5 == null) {
            tn.p.C("taskStartedTime");
            c4122l5 = null;
        }
        aVar.a(jVar, kVar, new C4136m1.f(C4122l5.a(c4122l5))).a(c4352y9.f34436f);
        W1 w12 = c4352y9.f34442l;
        if (w12 != null) {
            w12.a("onAdInstanceDidFailToLoad");
        }
        c4352y9.f34433c.b(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4016f6
    public void a(@NotNull final O9 o92) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        this.f34439i.execute(new Runnable() { // from class: com.ironsource.ym
            @Override // java.lang.Runnable
            public final void run() {
                C4352y9.a(this.f34478b, o92);
            }
        });
    }

    public final void a(@NotNull final IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        this.f34439i.execute(new Runnable() { // from class: com.ironsource.xm
            @Override // java.lang.Runnable
            public final void run() {
                C4352y9.a(this.f34407b, ironSourceError);
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
        this.f34440j = new C4122l5();
        this.f34436f.a(new C4136m1.s(this.f34432b.f()), new C4136m1.n(this.f34432b.g().b()), new C4136m1.b(this.f34431a.getAdId$mediationsdk_release()));
        InterfaceC4082j1.c.f31994a.a().a(this.f34436f);
        a(this.f34431a.getExtraParams());
        long jH = this.f34432b.h();
        Uf.c cVar = this.f34438h;
        Uf.b bVar = new Uf.b();
        bVar.b(jH);
        bn.r rVar = bn.r.f5635a;
        Uf ufA = cVar.a(bVar);
        this.f34441k = ufA;
        if (ufA != null) {
            ufA.a(new a());
        }
        Object objA = this.f34434d.a();
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
        InterfaceC4209q1 interfaceC4209q1 = this.f34436f;
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
        EnumC4200p9 enumC4200p9G = this.f34432b.g();
        C3998e6 c3998e6 = new C3998e6();
        c3998e6.a(this);
        O9 o9A = new P9(this.f34431a.getProviderName$mediationsdk_release().value(), c3998e6).a(enumC4200p9G.b(EnumC4200p9.Bidder)).b(this.f34432b.i()).a(this.f34431a.getAdId$mediationsdk_release()).a(kotlin.collections.a.q(new C4167nc().a(), U5.f30543a.a(this.f34431a.getExtraParams()))).a();
        InterfaceC4209q1 interfaceC4209q12 = this.f34436f;
        String strE = o9A.e();
        tn.p.j(strE, "adInstance.id");
        interfaceC4209q12.a(new C4136m1.b(strE));
        C4321wc c4321wc = new C4321wc(c4083j2, this.f34432b.j());
        this.f34442l = new W1(new C4182o9(this.f34431a.getInstanceId(), enumC4200p9G.b(), c4083j2.a()), new com.ironsource.mediationsdk.d(), c4083j2.c());
        InterfaceC4082j1.d.f32003a.c().a(this.f34436f);
        InterfaceC4287uc interfaceC4287uc = this.f34435e;
        tn.p.j(o9A, C3978d4.i.f31356p0);
        interfaceC4287uc.a(o9A, c4321wc);
    }
}
