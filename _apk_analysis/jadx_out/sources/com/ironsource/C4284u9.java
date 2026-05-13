package com.ironsource;

import com.ironsource.C3978d4;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4284u9 implements InterfaceC3974d0<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f34199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f34200b;

    public C4284u9(@NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull Executor executor) {
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(executor, "callbackExecutor");
        this.f34199a = interfaceC4209q1;
        this.f34200b = executor;
    }

    @Override // com.ironsource.InterfaceC3974d0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd a(@NotNull O9 o92, @NotNull W1 w12) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(w12, "auctionDataReporter");
        return new InterstitialAd(new C4318w9(o92, new C3956c0(new Bc()), w12, this.f34199a, null, null, null, null, C4301v9.f34254a, 240, null));
    }
}
