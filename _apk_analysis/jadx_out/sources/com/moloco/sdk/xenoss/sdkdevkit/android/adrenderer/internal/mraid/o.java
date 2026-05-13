package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    @NotNull
    public static final List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k> a(@NotNull n nVar, @NotNull b0 b0Var, int i10, @NotNull Context context, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar) {
        tn.p.k(nVar, "<this>");
        tn.p.k(b0Var, "mraidFullscreenContentController");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(oVar, "linkHandler");
        k.d dVar = new k.d(b0Var);
        o0 o0VarB = nVar.b();
        return cn.w.r(dVar, o0VarB != null ? new k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(o0VarB, null, bn.k.b(zn.n.e(i10, 0)), context, aVar, w0Var, oVar, null)) : null);
    }
}
