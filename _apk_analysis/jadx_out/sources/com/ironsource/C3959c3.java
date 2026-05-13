package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C3978d4;
import com.ironsource.C4136m1;
import com.ironsource.InterfaceC4082j1;
import com.ironsource.Uf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3959c3 implements Cb, A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BannerAdRequest f31097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AdSize f31098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4137m2 f31099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Db f31100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4287uc f31101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f31102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final U<BannerAdView> f31103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final D2 f31104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final Uf.c f31105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Executor f31106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C4122l5 f31107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private Uf f31108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private W1 f31109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f31110n;

    /* JADX INFO: renamed from: com.ironsource.c3$a */
    public static final class a implements Uf.a {
        public a() {
        }

        @Override // com.ironsource.Uf.a
        public void a() {
            C3959c3.this.a(C4365z5.f34494a.s());
        }
    }

    public C3959c3(@NotNull BannerAdRequest bannerAdRequest, @NotNull AdSize adSize, @NotNull InterfaceC4137m2 interfaceC4137m2, @NotNull Db db2, @NotNull InterfaceC4287uc interfaceC4287uc, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull U<BannerAdView> u10, @NotNull D2 d22, @NotNull Uf.c cVar, @NotNull Executor executor) {
        tn.p.k(bannerAdRequest, "adRequest");
        tn.p.k(adSize, "size");
        tn.p.k(interfaceC4137m2, "auctionResponseFetcher");
        tn.p.k(db2, "loadTaskConfig");
        tn.p.k(interfaceC4287uc, "networkLoadApi");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(u10, "adLoadTaskListener");
        tn.p.k(d22, "adLayoutFactory");
        tn.p.k(cVar, "timerFactory");
        tn.p.k(executor, "taskFinishedExecutor");
        this.f31097a = bannerAdRequest;
        this.f31098b = adSize;
        this.f31099c = interfaceC4137m2;
        this.f31100d = db2;
        this.f31101e = interfaceC4287uc;
        this.f31102f = interfaceC4209q1;
        this.f31103g = u10;
        this.f31104h = d22;
        this.f31105i = cVar;
        this.f31106j = executor;
    }

    public /* synthetic */ C3959c3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC4137m2 interfaceC4137m2, Db db2, InterfaceC4287uc interfaceC4287uc, InterfaceC4209q1 interfaceC4209q1, U u10, D2 d22, Uf.c cVar, Executor executor, int i10, tn.i iVar) {
        this(bannerAdRequest, adSize, interfaceC4137m2, db2, interfaceC4287uc, interfaceC4209q1, u10, d22, (i10 & 256) != 0 ? new Uf.d() : cVar, (i10 & 512) != 0 ? V7.f30593a.c() : executor);
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = U5.f30543a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC4082j1.c.f31994a.a(new C4136m1.l(str + "=" + strValueOf)).a(this.f31102f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3959c3 c3959c3, O9 o92, C4107k8 c4107k8) {
        tn.p.k(c3959c3, "this$0");
        tn.p.k(o92, "$adInstance");
        tn.p.k(c4107k8, "$adContainer");
        if (c3959c3.f31110n) {
            return;
        }
        c3959c3.f31110n = true;
        Uf uf2 = c3959c3.f31108l;
        if (uf2 != null) {
            uf2.cancel();
        }
        C4122l5 c4122l5 = c3959c3.f31107k;
        if (c4122l5 == null) {
            tn.p.C("taskStartedTime");
            c4122l5 = null;
        }
        InterfaceC4082j1.c.f31994a.a(new C4136m1.f(C4122l5.a(c4122l5))).a(c3959c3.f31102f);
        W1 w12 = c3959c3.f31109m;
        if (w12 != null) {
            w12.c("onBannerLoadSuccess");
        }
        D2 d22 = c3959c3.f31104h;
        W1 w13 = c3959c3.f31109m;
        tn.p.h(w13);
        c3959c3.f31103g.a(d22.a(o92, c4107k8, w13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3959c3 c3959c3, IronSourceError ironSourceError) {
        tn.p.k(c3959c3, "this$0");
        tn.p.k(ironSourceError, "$error");
        if (c3959c3.f31110n) {
            return;
        }
        c3959c3.f31110n = true;
        Uf uf2 = c3959c3.f31108l;
        if (uf2 != null) {
            uf2.cancel();
        }
        InterfaceC4082j1.c.a aVar = InterfaceC4082j1.c.f31994a;
        C4136m1.j jVar = new C4136m1.j(ironSourceError.getErrorCode());
        C4136m1.k kVar = new C4136m1.k(ironSourceError.getErrorMessage());
        C4122l5 c4122l5 = c3959c3.f31107k;
        if (c4122l5 == null) {
            tn.p.C("taskStartedTime");
            c4122l5 = null;
        }
        aVar.a(jVar, kVar, new C4136m1.f(C4122l5.a(c4122l5))).a(c3959c3.f31102f);
        W1 w12 = c3959c3.f31109m;
        if (w12 != null) {
            w12.a("onBannerLoadFail");
        }
        c3959c3.f31103g.b(ironSourceError);
    }

    public final void a(@NotNull final IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        this.f31106j.execute(new Runnable() { // from class: com.ironsource.zj
            @Override // java.lang.Runnable
            public final void run() {
                C3959c3.a(this.f34569b, ironSourceError);
            }
        });
    }

    @Override // com.ironsource.A2
    public void onBannerLoadFail(@NotNull String str) {
        tn.p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
        a(C4365z5.f34494a.c(str));
    }

    @Override // com.ironsource.A2
    public void onBannerLoadSuccess(@NotNull final O9 o92, @NotNull final C4107k8 c4107k8) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(c4107k8, "adContainer");
        this.f31106j.execute(new Runnable() { // from class: com.ironsource.ak
            @Override // java.lang.Runnable
            public final void run() {
                C3959c3.a(this.f31003b, o92, c4107k8);
            }
        });
    }

    @Override // com.ironsource.Cb
    public void start() {
        this.f31107k = new C4122l5();
        this.f31102f.a(new C4136m1.s(this.f31100d.f()), new C4136m1.n(this.f31100d.g().b()), new C4136m1.c(this.f31098b), new C4136m1.b(this.f31097a.getAdId$mediationsdk_release()));
        InterfaceC4082j1.c.f31994a.a().a(this.f31102f);
        a(this.f31097a.getExtraParams());
        long jH = this.f31100d.h();
        Uf.c cVar = this.f31105i;
        Uf.b bVar = new Uf.b();
        bVar.b(jH);
        bn.r rVar = bn.r.f5635a;
        Uf ufA = cVar.a(bVar);
        this.f31108l = ufA;
        if (ufA != null) {
            ufA.a(new a());
        }
        Object objA = this.f31099c.a();
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
        InterfaceC4209q1 interfaceC4209q1 = this.f31102f;
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
        EnumC4200p9 enumC4200p9G = this.f31100d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C4072i8 c4072i8 = new C4072i8(AdapterUtils.dpToPixels(applicationContext, this.f31098b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f31098b.getHeight()), this.f31098b.getSizeDescription());
        Jc jc2 = new Jc();
        jc2.a(this);
        O9 o9A = new P9(this.f31097a.getProviderName$mediationsdk_release().value(), jc2).a(enumC4200p9G.b(EnumC4200p9.Bidder)).a(c4072i8).b(this.f31100d.i()).a(this.f31097a.getAdId$mediationsdk_release()).a(kotlin.collections.a.q(new C4167nc().a(), U5.f30543a.a(this.f31097a.getExtraParams()))).a();
        C4321wc c4321wc = new C4321wc(c4083j2, this.f31100d.j());
        this.f31109m = new W1(new C4182o9(this.f31097a.getInstanceId(), enumC4200p9G.b(), c4083j2.a()), new com.ironsource.mediationsdk.d(), c4083j2.c());
        InterfaceC4082j1.d.f32003a.c().a(this.f31102f);
        InterfaceC4287uc interfaceC4287uc = this.f31101e;
        tn.p.j(o9A, C3978d4.i.f31356p0);
        interfaceC4287uc.a(o9A, c4321wc);
    }
}
