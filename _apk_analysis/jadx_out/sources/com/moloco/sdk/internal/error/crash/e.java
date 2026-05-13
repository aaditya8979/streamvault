package com.moloco.sdk.internal.error.crash;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<com.moloco.sdk.internal.error.crash.filters.a> f46027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.error.api.a f46028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f46029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f46030d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull List<? extends com.moloco.sdk.internal.error.crash.filters.a> list, @NotNull com.moloco.sdk.internal.error.api.a aVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2) {
        p.k(list, "exceptionFilters");
        p.k(aVar, "errorReporter");
        p.k(aVar2, "metricsRecorder");
        this.f46027a = list;
        this.f46028b = aVar;
        this.f46029c = aVar2;
        this.f46030d = "CrashHandlerService";
    }

    @Override // com.moloco.sdk.internal.error.crash.d
    public void a(@NotNull Throwable th2) {
        p.k(th2, "crash");
        if (!b(th2)) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f46030d, "App Crashed", null, false, 12, null);
        } else {
            this.f46029c.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.F.c()));
            this.f46028b.a(th2);
        }
    }

    public final boolean b(Throwable th2) {
        Iterator<com.moloco.sdk.internal.error.crash.filters.a> it = this.f46027a.iterator();
        while (it.hasNext()) {
            if (it.next().a(th2)) {
                return true;
            }
        }
        return false;
    }
}
