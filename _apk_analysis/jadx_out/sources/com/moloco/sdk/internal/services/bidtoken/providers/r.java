package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class r implements j<q> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47257d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47258e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.a<com.moloco.sdk.internal.ilrd.e> f47259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public q f47260c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public r(@NotNull sn.a<com.moloco.sdk.internal.ilrd.e> aVar) {
        tn.p.k(aVar, "_ilrdService");
        this.f47259b = aVar;
        this.f47260c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47260c = f();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        q qVarF = f();
        boolean z10 = !tn.p.f(qVarF, this.f47260c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "[Ilrd] needsRefresh: " + z10 + ", with current: " + qVarF + ", cached: " + this.f47260c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "IlrdSignalProvider";
    }

    public final q e() {
        return new q("", -1L, -1L, -1, -1, -1, -1, -1);
    }

    public final q f() {
        q qVarF;
        try {
            com.moloco.sdk.internal.ilrd.e eVarInvoke = this.f47259b.invoke();
            return (eVarInvoke == null || (qVarF = eVarInvoke.f()) == null) ? e() : qVarF;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdSignalProvider", "Error retrieving ILRD signal", e10, false, 8, null);
            return e();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q d() {
        return this.f47260c;
    }
}
