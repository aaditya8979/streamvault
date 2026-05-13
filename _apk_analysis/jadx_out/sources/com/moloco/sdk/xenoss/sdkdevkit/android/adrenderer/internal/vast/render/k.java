package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f50553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f50554c;

    public k(@NotNull j jVar, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar) {
        tn.p.k(jVar, "resource");
        this.f50553b = jVar;
        this.f50554c = rVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r
    public void destroy() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar = this.f50554c;
        if (rVar != null) {
            rVar.destroy();
        }
    }

    @NotNull
    public final j l() {
        return this.f50553b;
    }
}
