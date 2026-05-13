package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class B8 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25204a;

    public B8(long j10) {
        this.f25204a = j10;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        tn.p.k(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        ResponseBody responseBodyOkhttp3Response_body = InMobiNetworkBridge.okhttp3Response_body(responseProceed);
        long jContentLength = responseBodyOkhttp3Response_body != null ? responseBodyOkhttp3Response_body.contentLength() : 0L;
        if (jContentLength <= this.f25204a) {
            tn.p.h(responseProceed);
            return responseProceed;
        }
        responseProceed.close();
        throw new C3278ab("Image size exceeds limit: " + jContentLength + " Bytes");
    }
}
