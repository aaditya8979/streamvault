package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.internal.services.init.i;
import gl.a0;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static final boolean a(int i10) {
        a0.a aVar = a0.f62457d;
        return i10 == aVar.U().e0() || i10 == aVar.K().e0() || i10 < 400 || i10 >= 500;
    }

    public static final boolean b(@NotNull g0.a<Init$SDKInitResponse, i> aVar) {
        p.k(aVar, "<this>");
        if (aVar.a() instanceof i.b) {
            return a(((i.b) aVar.a()).a());
        }
        return true;
    }
}
