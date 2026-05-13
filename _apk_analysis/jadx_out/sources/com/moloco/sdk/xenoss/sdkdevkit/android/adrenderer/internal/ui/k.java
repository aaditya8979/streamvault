package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k {
    public static final int a(int i10, @NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }
}
