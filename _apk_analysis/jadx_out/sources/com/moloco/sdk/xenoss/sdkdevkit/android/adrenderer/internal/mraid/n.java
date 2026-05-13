package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final o0 f48423a;

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public n(@Nullable o0 o0Var) {
        this.f48423a = o0Var;
    }

    public /* synthetic */ n(o0 o0Var, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : o0Var);
    }

    @NotNull
    public final n a(@Nullable o0 o0Var) {
        return new n(o0Var);
    }

    @Nullable
    public final o0 b() {
        return this.f48423a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && tn.p.f(this.f48423a, ((n) obj).f48423a);
    }

    public int hashCode() {
        o0 o0Var = this.f48423a;
        if (o0Var == null) {
            return 0;
        }
        return o0Var.hashCode();
    }

    @NotNull
    public String toString() {
        return "MraidAdData(dec=" + this.f48423a + ')';
    }
}
