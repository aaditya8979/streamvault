package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class i implements j<h> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47220d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47221e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d0 f47222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public h f47223c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public i(@NotNull d0 d0Var) {
        tn.p.k(d0Var, "batteryInfoService");
        this.f47222b = d0Var;
        this.f47223c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47223c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z10 = !tn.p.f(this.f47223c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: needsRefresh: " + z10, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "BInfoSignalProvider";
    }

    public final h e() {
        try {
            h hVar = new h(Integer.valueOf(this.f47222b.b()), Integer.valueOf(this.f47222b.a()), Boolean.valueOf(this.f47222b.c()));
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: blev: " + hVar.b() + ", bst: " + hVar.a() + ", psm: " + hVar.c(), false, 4, null);
            return hVar;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BInfoSignalProvider", "[CBT][BIS]: Error", e10, false, 8, null);
            return new h(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h d() {
        return this.f47223c;
    }
}
