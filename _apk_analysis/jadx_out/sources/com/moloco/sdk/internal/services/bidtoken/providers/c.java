package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class c implements j<com.moloco.sdk.internal.services.o> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47202d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47203e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.p f47204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public com.moloco.sdk.internal.services.o f47205c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public c(@NotNull com.moloco.sdk.internal.services.p pVar) {
        tn.p.k(pVar, "advertisingService");
        this.f47204b = pVar;
        this.f47205c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47205c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z10 = !tn.p.f(this.f47205c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: needsRefresh: " + z10, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "AdvertisingSignalProvider";
    }

    public final com.moloco.sdk.internal.services.o e() {
        com.moloco.sdk.internal.services.o oVarA = this.f47204b.a();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AdvertisingSignalProvider", "[CBT][ASP]: adData: " + oVarA, false, 4, null);
        return oVarA;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.o d() {
        return e();
    }
}
