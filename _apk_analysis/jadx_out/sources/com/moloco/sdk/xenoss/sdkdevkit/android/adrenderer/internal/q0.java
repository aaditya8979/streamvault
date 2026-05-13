package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f48510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f48511b;

    public q0(@Nullable Integer num, @NotNull List<String> list) {
        tn.p.k(list, "gradient");
        this.f48510a = num;
        this.f48511b = list;
    }

    @Nullable
    public final Integer a() {
        return this.f48510a;
    }

    @NotNull
    public final List<String> b() {
        return this.f48511b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return tn.p.f(this.f48510a, q0Var.f48510a) && tn.p.f(this.f48511b, q0Var.f48511b);
    }

    public int hashCode() {
        Integer num = this.f48510a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.f48511b.hashCode();
    }

    @NotNull
    public String toString() {
        return "DECBorder(borderWidth=" + this.f48510a + ", gradient=" + this.f48511b + ')';
    }
}
