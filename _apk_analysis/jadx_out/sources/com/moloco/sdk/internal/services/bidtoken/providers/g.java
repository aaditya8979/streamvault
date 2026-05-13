package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class g implements j<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47213d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47214e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b0 f47215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public f f47216c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public g(@NotNull b0 b0Var) {
        tn.p.k(b0Var, "audioService");
        this.f47215b = b0Var;
        this.f47216c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47216c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        f fVarE = e();
        boolean z10 = !tn.p.f(fVarE, this.f47216c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] needsRefresh: " + z10 + ", with current: " + fVarE + ", cached: " + this.f47216c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "AudSignalProvider";
    }

    public final f e() {
        try {
            return new f(this.f47215b.a(), Integer.valueOf(this.f47215b.b()));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] AS Error", e10, false, 8, null);
            return new f(null, null, 3, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f d() {
        return this.f47216c;
    }
}
