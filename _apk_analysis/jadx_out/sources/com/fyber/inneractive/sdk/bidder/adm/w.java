package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.network.p0;
import com.squareup.picasso.Utils;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f15826a;

    public w(y yVar) {
        this.f15826a = yVar;
    }

    @Override // com.fyber.inneractive.sdk.network.p0
    public final void a(String str) {
        str.hashCode();
        switch (str) {
            case "sdkInitNetworkRequest":
                com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f16798d;
                dVar.a(this.f15826a.f15831d).f();
                dVar.b(this.f15826a.f15831d).f16814c = System.currentTimeMillis();
                break;
            case "sdkGotServerResponse":
                com.fyber.inneractive.sdk.metrics.d.f16798d.a(this.f15826a.f15831d).h();
                break;
            case "sdkParsedResponse":
                com.fyber.inneractive.sdk.metrics.d.f16798d.a(this.f15826a.f15831d).d();
                break;
            case "sdkRequestEndedButWillBeRetried":
                com.fyber.inneractive.sdk.metrics.i iVarB = com.fyber.inneractive.sdk.metrics.d.f16798d.b(this.f15826a.f15831d);
                iVarB.f16812a.put(new com.fyber.inneractive.sdk.metrics.h(Utils.VERB_RETRYING), Long.valueOf(System.currentTimeMillis() - iVarB.f16814c));
                break;
        }
    }
}
