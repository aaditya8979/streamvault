package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.publisher.MolocoAdError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MolocoAdError f45934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f45935b;

    public c0(@NotNull MolocoAdError molocoAdError, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        tn.p.k(molocoAdError, "molocoAdError");
        tn.p.k(cVar, "subErrorType");
        this.f45934a = molocoAdError;
        this.f45935b = cVar;
    }

    @NotNull
    public final MolocoAdError a() {
        return this.f45934a;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.f45935b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return tn.p.f(this.f45934a, c0Var.f45934a) && tn.p.f(this.f45935b, c0Var.f45935b);
    }

    public int hashCode() {
        return (this.f45934a.hashCode() * 31) + this.f45935b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.f45934a + ", subErrorType=" + this.f45935b + ')';
    }
}
