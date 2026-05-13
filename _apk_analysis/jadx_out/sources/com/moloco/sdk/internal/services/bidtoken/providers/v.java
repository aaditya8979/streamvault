package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class v implements j<u> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47272d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47273e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.b f47274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public u f47275c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public v(@NotNull com.moloco.sdk.internal.services.b bVar) {
        tn.p.k(bVar, "networkInfoService");
        this.f47274b = bVar;
        this.f47275c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47275c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        u uVarE = e();
        boolean z10 = !tn.p.f(uVarE, this.f47275c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS needsRefresh: " + z10 + ", with nis: " + uVarE + ", cached: " + this.f47275c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "NISignalProvider";
    }

    public final u e() {
        try {
            u uVar = new u(this.f47274b.d(), this.f47274b.b(), Boolean.valueOf(this.f47274b.a()), this.f47274b.c());
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS providing " + uVar, false, 4, null);
            return uVar;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NISignalProvider", "[CBT] NIS Error", e10, false, 8, null);
            return new u(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public u d() {
        return this.f47275c;
    }
}
