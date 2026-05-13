package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class z {
    @NotNull
    public static final y a(@NotNull Context context, @NotNull l0 l0Var, boolean z10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "scope");
        return new g(context, l0Var, z10);
    }
}
