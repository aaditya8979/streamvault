package com.unity3d.ads.adplayer;

import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.i0;
import p000do.l0;
import tn.p;

/* JADX INFO: compiled from: AdPlayerScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AdPlayerScope implements l0 {
    private final /* synthetic */ l0 $$delegate_0;

    @NotNull
    private final h0 defaultDispatcher;

    @NotNull
    private final i0 sdkErrorHandler;

    public AdPlayerScope(@NotNull h0 h0Var, @NotNull i0 i0Var) {
        p.k(h0Var, "defaultDispatcher");
        p.k(i0Var, "sdkErrorHandler");
        this.defaultDispatcher = h0Var;
        this.sdkErrorHandler = i0Var;
        this.$$delegate_0 = d.a(h0Var.plus(i0Var));
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
