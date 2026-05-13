package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import bn.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
public final class k {
    @NotNull
    public static final j d(@Nullable Boolean bool, int i10, @Nullable t tVar) {
        if (p.f(bool, Boolean.FALSE)) {
            tVar = null;
        } else if (p.f(bool, Boolean.TRUE)) {
            tVar = new t.b(((long) i10) * 1000);
        } else if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new h(tVar);
    }

    public static final int f(zn.i iVar, int i10) {
        return s.a(zn.n.c((((double) (zn.n.e(iVar.g() - iVar.f(), 0) * i10)) / 100.0d) / ((double) 1000), 0.0d));
    }

    public static final long g(long j10) {
        return j10 / 1000;
    }

    public static final d.a h(int i10) {
        return i10 == 0 ? d.a.C0683a.f50484a : new d.a.b(i10, null);
    }

    public static final boolean i(kotlinx.coroutines.g gVar) {
        return gVar == null || gVar.isCancelled() || gVar.d();
    }
}
