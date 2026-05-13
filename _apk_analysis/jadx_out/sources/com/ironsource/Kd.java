package com.ironsource;

import com.ironsource.C3978d4;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Kd implements InterfaceC3974d0<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f29733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f29734b;

    public Kd(@NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull Executor executor) {
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(executor, "callbackExecutor");
        this.f29733a = interfaceC4209q1;
        this.f29734b = executor;
    }

    @Override // com.ironsource.InterfaceC3974d0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd a(@NotNull O9 o92, @NotNull W1 w12) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(w12, "auctionDataReporter");
        return new RewardedAd(new Nd(o92, new C3956c0(new Bc()), w12, this.f29733a, null, null, null, null, Ld.f29803a, 240, null));
    }
}
