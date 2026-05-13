package xp;

import java.io.IOException;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: BaseInterceptor.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f87072a;

    public a(Map<String, String> map) {
        this.f87072a = map;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        Map<String, String> map = this.f87072a;
        if (map != null && map.size() > 0) {
            for (String str : this.f87072a.keySet()) {
                builderNewBuilder.addHeader(str, this.f87072a.get(str)).build();
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
