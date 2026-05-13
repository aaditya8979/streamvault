package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
public final class b implements j<com.moloco.sdk.internal.services.bidtoken.providers.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47198d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47199e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.m f47200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public com.moloco.sdk.internal.services.bidtoken.providers.a f47201c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public b(@NotNull com.moloco.sdk.internal.services.m mVar) {
        tn.p.k(mVar, "accessibilityInfoService");
        this.f47200b = mVar;
        this.f47201c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47201c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        com.moloco.sdk.internal.services.bidtoken.providers.a aVarE = e();
        boolean z10 = !tn.p.f(aVarE, this.f47201c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] needsRefresh: " + z10 + ", with current: " + aVarE + ", cached: " + this.f47201c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "AcSignalProvider";
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.a e() {
        try {
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(Boolean.valueOf(this.f47200b.c()), Boolean.valueOf(this.f47200b.b()), Boolean.valueOf(this.f47200b.a()), Float.valueOf(this.f47200b.getFontScale()));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AcSignalProvider", "[CBT] ACS Error", e10, false, 8, null);
            return new com.moloco.sdk.internal.services.bidtoken.providers.a(null, null, null, null, 15, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.moloco.sdk.internal.services.bidtoken.providers.a d() {
        return this.f47201c;
    }
}
