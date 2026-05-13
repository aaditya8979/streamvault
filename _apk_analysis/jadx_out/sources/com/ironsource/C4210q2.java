package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4210q2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4210q2 extends wg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final W0 f33290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC4309w0 f33291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final C4226r2 f33292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Vc f33293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC4243s2 f33294i;

    /* JADX INFO: renamed from: com.ironsource.q2$a */
    public static final class a implements InterfaceC4243s2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D f33296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xg f33297c;

        public a(D d10, xg xgVar) {
            this.f33296b = d10;
            this.f33297c = xgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4210q2 c4210q2, D d10, xg xgVar, int i10, String str, int i11, String str2, long j10) {
            tn.p.k(c4210q2, "this$0");
            tn.p.k(d10, "$adInstanceFactory");
            tn.p.k(xgVar, "$waterfallFetcherListener");
            tn.p.k(str2, "$auctionFallback");
            c4210q2.f33294i = null;
            c4210q2.a(d10, xgVar, i10, str, i11, str2, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4210q2 c4210q2, D d10, xg xgVar, List list, Map map, String str, C4157n2 c4157n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
            tn.p.k(c4210q2, "this$0");
            tn.p.k(d10, "$adInstanceFactory");
            tn.p.k(xgVar, "$waterfallFetcherListener");
            tn.p.k(list, "$newWaterfall");
            tn.p.k(map, "$adInstancePayloads");
            tn.p.k(str, "$auctionId");
            c4210q2.f33294i = null;
            c4210q2.a(d10, xgVar, list, map, str, c4157n2, jSONObject, jSONObject2, i10, j10, i11, str2);
        }

        @Override // com.ironsource.InterfaceC4243s2
        public void a(int i10, @NotNull String str) {
            tn.p.k(str, "errorReason");
            this.f33297c.a(i10, str);
        }

        @Override // com.ironsource.InterfaceC4243s2
        public void a(final int i10, @Nullable final String str, final int i11, @NotNull final String str2, final long j10) {
            tn.p.k(str2, IronSourceConstants.AUCTION_FALLBACK);
            W0 w02 = C4210q2.this.f33290e;
            final C4210q2 c4210q2 = C4210q2.this;
            final D d10 = this.f33296b;
            final xg xgVar = this.f33297c;
            w02.a(new Runnable() { // from class: com.ironsource.ql
                @Override // java.lang.Runnable
                public final void run() {
                    C4210q2.a.a(c4210q2, d10, xgVar, i10, str, i11, str2, j10);
                }
            });
        }

        @Override // com.ironsource.InterfaceC4243s2
        public void a(@NotNull final List<C4157n2> list, @NotNull final Map<String, H> map, @NotNull final String str, @Nullable final C4157n2 c4157n2, @Nullable final JSONObject jSONObject, @Nullable final JSONObject jSONObject2, final int i10, final long j10, final int i11, @Nullable final String str2) {
            tn.p.k(list, "newWaterfall");
            tn.p.k(map, "adInstancePayloads");
            tn.p.k(str, "auctionId");
            W0 w02 = C4210q2.this.f33290e;
            final C4210q2 c4210q2 = C4210q2.this;
            final D d10 = this.f33296b;
            final xg xgVar = this.f33297c;
            w02.a(new Runnable() { // from class: com.ironsource.pl
                @Override // java.lang.Runnable
                public final void run() {
                    C4210q2.a.a(c4210q2, d10, xgVar, list, map, str, c4157n2, jSONObject, jSONObject2, i10, j10, i11, str2);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4210q2(@NotNull W0 w02, @NotNull AbstractC4309w0 abstractC4309w0) {
        super(w02, abstractC4309w0);
        tn.p.k(w02, "adTools");
        tn.p.k(abstractC4309w0, "adUnitData");
        this.f33290e = w02;
        this.f33291f = abstractC4309w0;
        C4226r2 c4226r2 = new C4226r2(w02, abstractC4309w0);
        this.f33292g = c4226r2;
        this.f33293h = c4226r2.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(D d10, xg xgVar, int i10, String str, int i11, String str2, long j10) {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33290e, "Auction failed (error " + i10 + " - " + str + ")", (String) null, 2, (Object) null));
        boolean zN = this.f33291f.e().n();
        String strA = Y1.f30685a.a(zN);
        C4101k2 c4101k2 = new C4101k2(strA, null, null, i11, str2);
        E5 e5E = this.f33290e.e();
        e5E.a(new U1(c4101k2));
        e5E.b().a(j10, i10, str);
        if (zN) {
            a(d10, xgVar, i11, str2, strA);
        } else {
            a(xgVar);
        }
    }

    private final void a(D d10, xg xgVar, int i10, String str, String str2) {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33290e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Ec(this.f33290e, this.f33291f).a(xgVar, i10, str, str2, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(D d10, xg xgVar, List<C4157n2> list, Map<String, H> map, String str, C4157n2 c4157n2, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.verbose(C4173o0.a(this.f33290e, (String) null, (String) null, 3, (Object) null));
        C4101k2 c4101k2 = new C4101k2(str, jSONObject, c4157n2, i10, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f33290e.e().h().a(i11, str2);
        }
        a(jSONObject2);
        yg ygVarA = a(list, map, c4101k2, d10);
        this.f33290e.e().a(new U1(c4101k2));
        this.f33290e.e().b().a(j10, this.f33291f.v() + ";wtf=" + ygVarA.c());
        this.f33290e.e().b().c(ygVarA.d());
        a(ygVarA, xgVar);
    }

    private final void a(xg xgVar) {
        xgVar.a(509, "Mediation No fill");
    }

    private final void a(yg ygVar, xg xgVar) {
        this.f33290e.h().a(ygVar);
        xgVar.a(ygVar);
    }

    private final void a(JSONObject jSONObject) {
        int i10;
        try {
            if (jSONObject == null) {
                this.f33291f.b(false);
                IronLog.INTERNAL.verbose(C4173o0.a(this.f33290e, "loading configuration from auction response is null, using the following: " + this.f33291f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has("parallelLoad") && (i10 = jSONObject.getInt("parallelLoad")) > 0) {
                    this.f33291f.a(i10);
                }
                if (jSONObject.has("bidderExclusive")) {
                    this.f33291f.a(jSONObject.getBoolean("bidderExclusive"));
                }
                this.f33291f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.f32411z, false));
            } catch (JSONException e10) {
                C4228r4.d().a(e10);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f33291f.b().a() + " Error: " + e10.getMessage());
                ironLog.verbose(C4173o0.a(this.f33290e, this.f33291f.v(), (String) null, 2, (Object) null));
            }
        } finally {
            IronLog.INTERNAL.verbose(C4173o0.a(this.f33290e, this.f33291f.v(), (String) null, 2, (Object) null));
        }
    }

    @Override // com.ironsource.wg
    @NotNull
    public Vc a() {
        return this.f33293h;
    }

    @Override // com.ironsource.wg
    public void a(@NotNull D d10, @NotNull xg xgVar) {
        tn.p.k(d10, "adInstanceFactory");
        tn.p.k(xgVar, "waterfallFetcherListener");
        a aVar = new a(d10, xgVar);
        this.f33292g.a(aVar);
        this.f33294i = aVar;
    }
}
