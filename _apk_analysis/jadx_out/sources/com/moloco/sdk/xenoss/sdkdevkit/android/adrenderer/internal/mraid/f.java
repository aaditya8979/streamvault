package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f48352a = new f();

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final float b(float f10, @NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return f10 / a(context);
    }

    public final int c(float f10, @NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return (int) (b(f10, context) + 0.5f);
    }
}
