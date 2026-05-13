package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w0 f48983a;

    public f(@NotNull w0 w0Var) {
        tn.p.k(w0Var, "externalLinkHandler");
        this.f48983a = w0Var;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void a(@NotNull String str) {
        tn.p.k(str, "url");
        this.f48983a.a(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void b(@Nullable String str) {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o
    public void c(@Nullable String str) {
    }
}
