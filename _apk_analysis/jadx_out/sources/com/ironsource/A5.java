package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class A5 implements Cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f28725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final A9 f28726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4209q1 f28727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSourceError f28728d;

    public A5(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull A9 a92, @NotNull InterfaceC4209q1 interfaceC4209q1, @NotNull IronSourceError ironSourceError) {
        tn.p.k(interstitialAdRequest, "adRequest");
        tn.p.k(a92, "adLoadTaskListener");
        tn.p.k(interfaceC4209q1, "analytics");
        tn.p.k(ironSourceError, "error");
        this.f28725a = interstitialAdRequest;
        this.f28726b = a92;
        this.f28727c = interfaceC4209q1;
        this.f28728d = ironSourceError;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f28728d;
    }

    @Override // com.ironsource.Cb
    public void start() {
        C4314w5 c4314w5 = new C4314w5(this.f28727c, this.f28725a.getAdId$mediationsdk_release(), this.f28725a.getProviderName$mediationsdk_release());
        c4314w5.a();
        c4314w5.a(this.f28728d);
        this.f28726b.b(this.f28728d);
    }
}
