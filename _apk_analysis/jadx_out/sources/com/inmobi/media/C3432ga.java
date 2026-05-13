package com.inmobi.media;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3432ga implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3432ga f27216a = new C3432ga();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        tn.p.k(chain, "chain");
        EnumC3273a6 enumC3273a6A = Re.a();
        if (enumC3273a6A != null) {
            new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(enumC3273a6A.f26759a).message(enumC3273a6A.toString()).body(ResponseBody.create((MediaType) null, "")).build();
        }
        Response responseProceed = chain.proceed(chain.request());
        tn.p.j(responseProceed, "proceed(...)");
        return responseProceed;
    }
}
