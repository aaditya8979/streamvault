package com.ironsource;

import com.ironsource.Q1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4226r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final W0 f33380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f33381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.ironsource.mediationsdk.e f33382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3994e2 f33383d;

    /* JADX INFO: renamed from: com.ironsource.r2$a */
    public static final class a implements Q1.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4243s2 f33385b;

        public a(InterfaceC4243s2 interfaceC4243s2) {
            this.f33385b = interfaceC4243s2;
        }

        @Override // com.ironsource.Q1.d
        public void a(@NotNull Q1 q12) {
            tn.p.k(q12, "auction");
            C4226r2.this.b(q12, this.f33385b);
        }

        @Override // com.ironsource.Q1.d
        public void a(@NotNull Q1 q12, @NotNull String str) {
            tn.p.k(q12, "auction");
            tn.p.k(str, "error");
            C4226r2.this.b(q12, this.f33385b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r2$b */
    public static final class b implements S1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4243s2 f33386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q1 f33387b;

        public b(InterfaceC4243s2 interfaceC4243s2, Q1 q12) {
            this.f33386a = interfaceC4243s2;
            this.f33387b = q12;
        }

        @Override // com.ironsource.S1
        public void a(int i10, @Nullable String str, int i11, @NotNull String str2, long j10) {
            tn.p.k(str2, IronSourceConstants.AUCTION_FALLBACK);
            this.f33386a.a(i10, str, i11, str2, j10);
        }

        @Override // com.ironsource.S1
        public void a(@NotNull List<C4157n2> list, @NotNull String str, @Nullable C4157n2 c4157n2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, int i10, long j10, int i11, @Nullable String str2) {
            tn.p.k(list, "newWaterfall");
            tn.p.k(str, "auctionId");
            this.f33386a.a(list, this.f33387b.c(), str, c4157n2, jSONObject, jSONObject2, i10, j10, i11, str2);
        }
    }

    public C4226r2(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0) {
        tn.p.k(w02, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        this.f33380a = w02;
        this.f33381b = abstractC4309w0;
        C4193p2 c4193p2E = abstractC4309w0.e();
        String strD = IronSourceUtils.d();
        tn.p.j(strD, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(c4193p2E, strD));
        this.f33382c = eVar;
        this.f33383d = new C3994e2(w02, eVar);
    }

    private final com.ironsource.mediationsdk.i a(Q1 q12, int i10) {
        com.ironsource.mediationsdk.i iVar = new com.ironsource.mediationsdk.i(this.f33381b.b().a());
        iVar.b(IronSourceUtils.g());
        iVar.a(q12.d().a());
        iVar.a(q12.d().b());
        iVar.a(this.f33380a.h());
        iVar.a(i10);
        iVar.a(this.f33380a.k());
        Hf hfG = this.f33381b.b().g();
        iVar.e(hfG != null ? hfG.b() : false);
        iVar.a(this.f33381b.b().d());
        InterfaceC4048h2 interfaceC4048h2I = this.f33380a.i();
        if (interfaceC4048h2I != null) {
            interfaceC4048h2I.a(iVar);
        }
        return iVar;
    }

    private final String a() {
        return C4173o0.a(this.f33380a, (String) null, (String) null, 2, (Object) null);
    }

    private final String a(String str) {
        return C4173o0.a(this.f33380a, str, (String) null, 2, (Object) null);
    }

    private final void a(Q1 q12, InterfaceC4243s2 interfaceC4243s2) {
        if (q12.f()) {
            q12.a(new a(interfaceC4243s2));
        } else {
            b(q12, interfaceC4243s2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Q1 q12, InterfaceC4243s2 interfaceC4243s2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) q12.d().c())));
        if (!q12.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.f33380a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC4243s2.a(A0.e(this.f33381b.b().a()), "no available ad to load");
        } else {
            this.f33380a.e().b().b(q12.d().c().toString());
            this.f33382c.a(ContextProvider.getInstance().getApplicationContext(), a(q12, this.f33380a.f()), new b(interfaceC4243s2, q12));
        }
    }

    public void a(@NotNull InterfaceC4243s2 interfaceC4243s2) {
        tn.p.k(interfaceC4243s2, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.f33380a.e().b().a(this.f33381b.b().d());
        a(new Q1(this.f33380a, this.f33381b), interfaceC4243s2);
    }

    @NotNull
    public final C3994e2 b() {
        return this.f33383d;
    }
}
