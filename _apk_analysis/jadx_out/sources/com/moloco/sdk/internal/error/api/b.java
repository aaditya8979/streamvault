package com.moloco.sdk.internal.error.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.j;
import com.moloco.sdk.internal.utils.d;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f46016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a f46017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f46018c;

    public b(@NotNull j jVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a aVar) {
        p.k(jVar, "timeProviderService");
        p.k(aVar, "httpClient");
        this.f46016a = jVar;
        this.f46017b = aVar;
        this.f46018c = "ErrorReportingApi";
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(@NotNull String str, @NotNull String str2, @NotNull com.moloco.sdk.internal.error.a aVar) {
        p.k(str, "error");
        p.k(str2, "url");
        p.k(aVar, "errorMetadata");
        String strE = d.e(d.d(str2, str, this.f46016a.invoke()), aVar.a());
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f46018c, "Reporting error: " + str + " to url: " + strE, null, false, 12, null);
        this.f46017b.a(strE);
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(@NotNull Throwable th2) {
        p.k(th2, "error");
        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f46018c, "SDK Crashed", th2, false, 8, null);
    }
}
