package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class p implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d0 f50929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n f50930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final n f50931c;

    public p(@NotNull d0 d0Var, @NotNull n nVar, @NotNull n nVar2) {
        tn.p.k(d0Var, "vastOptions");
        tn.p.k(nVar, "mraidOptions");
        tn.p.k(nVar2, "staticOptions");
        this.f50929a = d0Var;
        this.f50930b = nVar;
        this.f50931c = nVar2;
    }

    @NotNull
    public final n a() {
        return this.f50930b;
    }

    @NotNull
    public final n b() {
        return this.f50931c;
    }

    @NotNull
    public final d0 c() {
        return this.f50929a;
    }
}
