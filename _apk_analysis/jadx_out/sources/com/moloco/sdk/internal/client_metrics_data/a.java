package com.moloco.sdk.internal.client_metrics_data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0555a f45936c = new C0555a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45937d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f45938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public AtomicBoolean f45939b;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.client_metrics_data.a$a, reason: collision with other inner class name */
    public static final class C0555a {
        public C0555a() {
        }

        public /* synthetic */ C0555a(i iVar) {
            this();
        }
    }

    public a(@NotNull com.moloco.sdk.acm.recorder.a aVar) {
        p.k(aVar, "metricsRecorder");
        this.f45938a = aVar;
        this.f45939b = new AtomicBoolean(false);
    }

    public final void a() {
        this.f45939b.set(false);
    }

    public final void b(@NotNull AdFormatType adFormatType) {
        p.k(adFormatType, "adType");
        if (this.f45939b.compareAndSet(false, true)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "AcmClickDeduper", "Deduped click logged", null, false, 12, null);
            com.moloco.sdk.acm.recorder.a aVar = this.f45938a;
            com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(b.E.c());
            String strC = d.f45970c.c();
            String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
            p.j(lowerCase, "toLowerCase(...)");
            aVar.b(bVar.e(strC, lowerCase));
        }
        this.f45939b.set(true);
    }
}
