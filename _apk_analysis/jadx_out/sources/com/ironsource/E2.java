package com.ironsource;

import com.ironsource.C3978d4;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class E2 implements D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f29227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f29228b;

    public E2(@NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull Executor executor) {
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(executor, "callbackExecutor");
        this.f29227a = interfaceC4209q1;
        this.f29228b = executor;
    }

    @Override // com.ironsource.D2
    @NotNull
    public BannerAdView a(@NotNull O9 o92, @NotNull C4107k8 c4107k8, @NotNull W1 w12) {
        tn.p.k(o92, C3978d4.i.f31356p0);
        tn.p.k(c4107k8, "adContainer");
        tn.p.k(w12, "auctionDataReporter");
        return new BannerAdView(new P2(o92, c4107k8, w12, this.f29227a, null, null, null, null, 240, null));
    }
}
