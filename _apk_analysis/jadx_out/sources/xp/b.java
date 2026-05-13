package xp;

import android.content.Context;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: CacheInterceptor.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f87073a;

    public b(Context context) {
        this.f87073a = context;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (tp.b.a(this.f87073a)) {
            return chain.proceed(request).newBuilder().removeHeader("Pragma").removeHeader("Cache-Control").header("Cache-Control", "public, max-age=60").build();
        }
        return chain.proceed(request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build()).newBuilder().removeHeader("Pragma").removeHeader("Cache-Control").header("Cache-Control", "public, only-if-cached, max-stale=259200").build();
    }
}
