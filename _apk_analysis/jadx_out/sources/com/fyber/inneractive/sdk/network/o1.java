package com.fyber.inneractive.sdk.network;

import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Response f17014g;

    public o1(l lVar, Response response) {
        this.f17014g = response;
        this.f16991d = lVar.f16991d;
        this.f16990c = lVar.f16990c;
        this.f16992e = lVar.f16992e;
        this.f16988a = lVar.f16988a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        Response response = this.f17014g;
        if (response != null) {
            response.close();
        }
    }
}
