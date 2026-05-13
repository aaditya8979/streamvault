package com.inmobi.media;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes9.dex */
public final class Xb implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        tn.p.k(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.isRedirect()) {
            tn.p.h(responseProceed);
            tn.p.k(responseProceed, "<this>");
            String strHeader = responseProceed.isRedirect() ? responseProceed.header("Location") : null;
            if (strHeader != null) {
                tn.p.k(strHeader, "<this>");
                try {
                    new URL(strHeader);
                } catch (MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new MalformedURLException("Invalid URL in Location header: " + strHeader);
        }
        tn.p.h(responseProceed);
        return responseProceed;
    }
}
