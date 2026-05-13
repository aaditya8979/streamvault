package com.inmobi.media;

import com.vungle.ads.internal.ui.AdActivity;
import java.util.Objects;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class G2 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G2 f25511a = new G2();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        tn.p.k(chain, "chain");
        Request request = chain.request();
        String str = H2.f25565a;
        tn.p.j(str, "access$getTAG$p(...)");
        Objects.toString(request);
        try {
            Response responseProceed = chain.proceed(request);
            tn.p.j(str, "access$getTAG$p(...)");
            Objects.toString(responseProceed);
            tn.p.h(request);
            tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
            tn.p.j(str, "access$getTAG$p(...)");
            Objects.toString(request);
            Objects.toString(responseProceed);
            tn.p.h(responseProceed);
            return responseProceed;
        } catch (Exception e10) {
            String str2 = H2.f25565a;
            Objects.toString(request);
            tn.p.h(request);
            tn.p.k(request, AdActivity.REQUEST_KEY_EXTRA);
            throw e10;
        }
    }
}
