package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class e implements j<d> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f47207d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47208e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f47209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public d f47210c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public e(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47209b = context;
        this.f47210c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f47210c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        d dVar = new d(e());
        boolean z10 = !tn.p.f(dVar, this.f47210c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI needsRefresh: " + z10 + ", with adi: " + dVar.a(), false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    public String c() {
        return "ADISignalProvider";
    }

    public final Long e() {
        try {
            return Long.valueOf(this.f47209b.getFilesDir().getTotalSpace());
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ADISignalProvider", "ADI Error", e10, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d d() {
        d dVar = this.f47210c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI providing " + dVar.a(), false, 4, null);
        return dVar;
    }
}
