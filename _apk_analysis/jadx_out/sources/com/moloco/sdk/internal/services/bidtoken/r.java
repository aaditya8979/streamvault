package com.moloco.sdk.internal.services.bidtoken;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import cn.f0;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.internal.MolocoLogger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class r implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.j f47290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final s f47291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.encryption.a f47292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.bidtoken.providers.m f47293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f47294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f47295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public String f47296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public h f47297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final mo.a f47298j;

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.ClientBidTokenServiceImpl", f = "ClientBidTokenService.kt", l = {191}, m = "bidToken-BWLJW6A")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f47303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f47304f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f47306h;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47304f = obj;
            this.f47306h |= Integer.MIN_VALUE;
            Object objA = r.this.a(null, null, null, this);
            return objA == in.a.g() ? objA : Result.m7533boximpl(objA);
        }
    }

    public r(@NotNull com.moloco.sdk.internal.services.j jVar, @NotNull s sVar, @NotNull com.moloco.sdk.internal.services.encryption.a aVar, @NotNull com.moloco.sdk.internal.services.bidtoken.providers.m mVar) {
        tn.p.k(jVar, "timeProviderService");
        tn.p.k(sVar, "clientBidTokenBuilder");
        tn.p.k(aVar, "encryptionService");
        tn.p.k(mVar, "signalProvider");
        this.f47290b = jVar;
        this.f47291c = sVar;
        this.f47292d = aVar;
        this.f47293e = mVar;
        this.f47294f = "ClientBidTokenServiceImpl";
        this.f47295g = "";
        this.f47296h = "";
        this.f47297i = g.a();
        this.f47298j = mo.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.u
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.recorder.a r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull com.moloco.sdk.internal.services.bidtoken.h r14, @org.jetbrains.annotations.NotNull hn.c<? super kotlin.Result<java.lang.String>> r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.r.a(com.moloco.sdk.acm.recorder.a, java.lang.String, com.moloco.sdk.internal.services.bidtoken.h, hn.c):java.lang.Object");
    }

    public final String b(String str, com.moloco.sdk.acm.recorder.a aVar) {
        Exception exc;
        String str2;
        MolocoLogger molocoLogger;
        byte[] bArrEncode;
        if (str.length() == 0) {
            aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45966y.c()).e(com.moloco.sdk.internal.client_metrics_data.d.f45971d.c(), "failure").e(com.moloco.sdk.internal.client_metrics_data.d.f45969b.c(), "empty_public_key"));
            return "";
        }
        com.moloco.sdk.acm.e eVarC = aVar.c(com.moloco.sdk.internal.client_metrics_data.e.f45992o.c());
        try {
            long jA = this.f47290b.a();
            str2 = "rsa";
            try {
                byte[] bArrA = this.f47292d.a(str);
                String str3 = "update_signal_state";
                try {
                    this.f47293e.a();
                    str3 = "provide_signal";
                    BidToken$ClientBidTokenComponents bidToken$ClientBidTokenComponentsA = this.f47291c.a(this.f47293e.d(), this.f47297i);
                    molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.debugBuildLog$default(molocoLogger, this.f47294f, "BidToken Component: " + bidToken$ClientBidTokenComponentsA, false, 4, null);
                    bArrEncode = Base64.encode(bidToken$ClientBidTokenComponentsA.toByteArray(), 0);
                } catch (Exception e10) {
                    exc = e10;
                    str2 = str3;
                }
                try {
                    com.moloco.sdk.internal.services.encryption.a aVar2 = this.f47292d;
                    tn.p.h(bArrEncode);
                    byte[] bArrEncode2 = Base64.encode(aVar2.a(bArrEncode), 0);
                    s sVar = this.f47291c;
                    tn.p.h(bArrEncode2);
                    String strEncodeToString = Base64.encodeToString(sVar.a(bArrEncode2, bArrA), 0);
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    aVar.a(eVarC.f(dVar.c(), "success"));
                    aVar.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45966y.c()).e(dVar.c(), "success"));
                    MolocoLogger.info$default(molocoLogger, this.f47294f, "Client bid token build time: " + (this.f47290b.a() - jA) + " ms", null, false, 12, null);
                    return "v2:" + strEncodeToString;
                } catch (Exception e11) {
                    exc = e11;
                    str2 = "aes";
                    String simpleName = exc.getClass().getSimpleName();
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    MolocoLogger.warn$default(molocoLogger2, this.f47294f, "Client bid token build failed: " + simpleName, exc, false, 8, null);
                    com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45966y.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
                    com.moloco.sdk.acm.b bVarE = bVar.e(dVar2.c(), "failure");
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
                    com.moloco.sdk.acm.b bVarE2 = bVarE.e(dVar3.c(), simpleName);
                    if (str2.length() > 0) {
                        bVarE2.e(com.moloco.sdk.internal.client_metrics_data.d.f45974g.c(), str2);
                    }
                    MolocoLogger.debugBuildLog$default(molocoLogger2, this.f47294f, "Recording metric failure: " + bVarE2.c() + ", tags: " + f0.D0(bVarE2.b(), StringUtils.COMMA, null, null, 0, null, null, 62, null), false, 4, null);
                    aVar.b(bVarE2);
                    aVar.a(eVarC.f(dVar2.c(), "failure").f(dVar3.c(), simpleName));
                    return "";
                }
            } catch (Exception e12) {
                exc = e12;
            }
        } catch (Exception e13) {
            exc = e13;
            str2 = "";
        }
    }

    public final boolean c(h hVar) {
        h hVar2 = this.f47297i;
        this.f47297i = hVar;
        boolean z10 = !tn.p.f(hVar2, hVar);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47294f, z10 ? "config updated" : "config didn't change", false, 4, null);
        return z10;
    }

    public final boolean d(String str, h hVar) {
        if (!tn.p.f(this.f47295g, str)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47294f, "rp changed, needs refresh", false, 4, null);
            return true;
        }
        if (c(hVar)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47294f, "config changed, needs refresh", false, 4, null);
            return true;
        }
        if (this.f47296h.length() == 0) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47294f, "cached bidToken is empty, needs refresh", false, 4, null);
            return true;
        }
        if (this.f47293e.b()) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47294f, "signal provider updated, needs refresh", false, 4, null);
            return true;
        }
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f47294f, "Bid token doesn't need refresh", false, 4, null);
        return false;
    }
}
