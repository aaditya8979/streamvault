package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import bn.r;
import io.ktor.client.plugins.HttpTimeoutKt;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import zk.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final r a(long j10, g0 g0Var) {
        p.k(g0Var, "$this$timeout");
        g0Var.f(Long.valueOf(j10));
        return r.f5635a;
    }

    public static final void b(@NotNull cl.d dVar, final long j10) {
        p.k(dVar, "<this>");
        HttpTimeoutKt.o(dVar, new l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.b
            @Override // sn.l
            public final Object invoke(Object obj) {
                return c.a(j10, (g0) obj);
            }
        });
    }
}
