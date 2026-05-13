package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import cn.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.n;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    @NotNull
    public static final List<k> a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, @NotNull w0 w0Var, @NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar2, boolean z10, @Nullable Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, @NotNull o oVar) {
        p.k(aVar, "<this>");
        p.k(w0Var, "externalLinkHandler");
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar2, "customUserEventBuilderService");
        p.k(oVar, "linkHandler");
        k.c cVar = new k.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e(aVar.g(), 0, z10, bool, i10, z11, z12, context, aVar2, w0Var, oVar));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVarC = aVar.c();
        k.a aVar3 = cVarC != null ? new k.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c(cVarC, bn.k.b(n.e(i11, 0)), context, aVar2, w0Var, z10, oVar, null)) : null;
        o0 o0VarD = aVar.d();
        return w.r(cVar, aVar3, o0VarD != null ? new k.b(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(o0VarD, aVar.g().d(), bn.k.b(n.e(i12, 0)), context, aVar2, w0Var, oVar, null)) : null);
    }
}
