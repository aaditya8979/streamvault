package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f17025a;

    public r(s sVar) {
        this.f17025a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d.f16798d.a(this.f17025a.f17006d).f();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f16798d.a(this.f17025a.f17006d).g();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f16798d.a(this.f17025a.f17006d).d();
                break;
        }
    }
}
