package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g0 f48150a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, i0> f48151b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48152c = 8;

    public final int a(@NotNull i0 i0Var) {
        tn.p.k(i0Var, "wv");
        int iHashCode = i0Var.hashCode();
        f48151b.put(Integer.valueOf(iHashCode), i0Var);
        return iHashCode;
    }

    public final void c(int i10) {
        f48151b.remove(Integer.valueOf(i10));
    }
}
