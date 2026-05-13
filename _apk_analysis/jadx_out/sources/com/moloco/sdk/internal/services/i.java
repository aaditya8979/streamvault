package com.moloco.sdk.internal.services;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class i implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f47421a;

    public i(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f47421a = context;
    }

    @Override // com.moloco.sdk.internal.services.f
    @NotNull
    public e a() {
        com.moloco.sdk.common_adapter_internal.b bVarInvoke = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y.a(this.f47421a).invoke();
        float fE = bVarInvoke.e();
        return new e(bVarInvoke.f(), fE, bVarInvoke.c(), bVarInvoke.b(), bVarInvoke.d(), bVarInvoke.a(), this.f47421a.getResources().getDisplayMetrics().xdpi, this.f47421a.getResources().getDisplayMetrics().ydpi);
    }

    @Override // com.moloco.sdk.internal.services.f
    @NotNull
    public H b() {
        int i10 = this.f47421a.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? H.f47101a : H.f47103c : H.f47102b;
    }

    @Override // com.moloco.sdk.internal.services.f
    @NotNull
    public e invoke() {
        return a();
    }
}
