package com.moloco.sdk.internal.error;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.config.a f46019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.error.api.a f46020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f46021c;

    public c(@NotNull com.moloco.sdk.internal.services.config.a aVar, @NotNull com.moloco.sdk.internal.error.api.a aVar2) {
        p.k(aVar, "configService");
        p.k(aVar2, "errorReportingApi");
        this.f46019a = aVar;
        this.f46020b = aVar2;
        this.f46021c = "ErrorReportingServiceImpl";
    }

    @Override // com.moloco.sdk.internal.error.b
    public void a(@NotNull String str, @NotNull a aVar) {
        p.k(str, "error");
        p.k(aVar, "errorMetadata");
        if (this.f46019a.a("ReportSDKError")) {
            String strB = this.f46019a.b("ReportSDKError");
            if (strB == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f46021c, "Error reporting is enabled but with invalid url", null, false, 12, null);
                return;
            } else {
                this.f46020b.a(str, strB, aVar);
                return;
            }
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.f46021c, "Error reporting is disabled. Tried to report error: " + str, null, false, 12, null);
    }
}
