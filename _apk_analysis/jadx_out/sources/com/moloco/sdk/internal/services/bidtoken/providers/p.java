package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.j0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class p implements j<o> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f47244e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47245f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j0 f47246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.f f47247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public o f47248d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public p(@NotNull j0 j0Var, @NotNull com.moloco.sdk.internal.services.f fVar) {
        tn.p.k(j0Var, "deviceInfoService");
        tn.p.k(fVar, "screenInfoService");
        this.f47246b = j0Var;
        this.f47247c = fVar;
        this.f47248d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47248d = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        o oVarE = e();
        boolean z10 = !tn.p.f(oVarE, this.f47248d);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP needsRefresh: " + z10 + ", with current: " + oVarE + ", cached: " + this.f47248d, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "DSignalProvider";
    }

    public final o e() {
        try {
            return new o(this.f47247c.b(), this.f47246b.c(), this.f47246b.d());
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP Error", e10, false, 8, null);
            return new o(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public o d() {
        return this.f47248d;
    }
}
