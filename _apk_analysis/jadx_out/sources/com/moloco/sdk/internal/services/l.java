package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebViewCompat;
import com.moloco.sdk.internal.client_metrics_data.d;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.recorder.a f47530b;

    public l(@NotNull Context context, @NotNull com.moloco.sdk.acm.recorder.a aVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(aVar, "metricsRecorder");
        this.f47529a = context;
        this.f47530b = aVar;
    }

    @NotNull
    public final Object a() {
        PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(this.f47529a);
        if (currentWebViewPackage == null) {
            b("no_package");
            Result.a aVar = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("No current WebView package exists")));
        }
        try {
            int applicationEnabledSetting = this.f47529a.getPackageManager().getApplicationEnabledSetting(currentWebViewPackage.packageName);
            if (applicationEnabledSetting == 2) {
                b("disabled_by_system");
                Result.a aVar2 = Result.Companion;
                return Result.m7534constructorimpl(kotlin.c.a(new Exception("WebView component is disabled by system")));
            }
            if (applicationEnabledSetting == 3) {
                b("disabled_by_user");
                Result.a aVar3 = Result.Companion;
                return Result.m7534constructorimpl(kotlin.c.a(new Exception("WebView component is disabled by user")));
            }
            if (applicationEnabledSetting != 4) {
                Result.a aVar4 = Result.Companion;
                return Result.m7534constructorimpl(bn.r.f5635a);
            }
            b("disabled_until_used");
            Result.a aVar5 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(new Exception("WebView component is disabled until used")));
        } catch (IllegalArgumentException e10) {
            b("unknown_package");
            Result.a aVar6 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(e10));
        }
    }

    public final void b(String str) {
        this.f47530b.b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.Z.c()).e(d.f45969b.c(), str));
    }
}
