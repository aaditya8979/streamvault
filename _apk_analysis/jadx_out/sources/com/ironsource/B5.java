package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class B5 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f28840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Rd f28841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f28842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSourceError f28843d;

    public B5(@NotNull RewardedAdRequest rewardedAdRequest, @NotNull Rd rd2, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull IronSourceError ironSourceError) {
        tn.p.k(rewardedAdRequest, "adRequest");
        tn.p.k(rd2, "adLoadTaskListener");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(ironSourceError, "error");
        this.f28840a = rewardedAdRequest;
        this.f28841b = rd2;
        this.f28842c = interfaceC4209q1;
        this.f28843d = ironSourceError;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f28843d;
    }

    @Override // com.ironsource.Cb
    public void start() {
        C4314w5 c4314w5 = new C4314w5(this.f28842c, this.f28840a.getAdId$mediationsdk_release(), this.f28840a.getProviderName$mediationsdk_release());
        c4314w5.a();
        c4314w5.a(this.f28843d);
        this.f28841b.b(this.f28843d);
    }
}
