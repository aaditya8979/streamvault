package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f49000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f49001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.acm.recorder.a f49002g;

    public l(boolean z10, boolean z11, boolean z12, boolean z13, @Nullable String str, @Nullable String str2, @Nullable com.moloco.sdk.acm.recorder.a aVar) {
        this.f48996a = z10;
        this.f48997b = z11;
        this.f48998c = z12;
        this.f48999d = z13;
        this.f49000e = str;
        this.f49001f = str2;
        this.f49002g = aVar;
    }

    @NotNull
    public final o a(@NotNull w0 w0Var, @Nullable g gVar) {
        tn.p.k(w0Var, "externalLinkHandler");
        return ((this.f48996a || this.f48998c || this.f48997b) && gVar != null) ? new e(gVar, w0Var, this.f48996a, this.f48997b, this.f48998c, this.f48999d, this.f49000e, this.f49001f, this.f49002g) : new f(w0Var);
    }
}
