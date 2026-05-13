package ed;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: OkHttp3Util.java */
/* JADX INFO: loaded from: classes10.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61095a = 120;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static OkHttpClient f61096b;

    /* JADX INFO: compiled from: OkHttp3Util.java */
    public static class a implements Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f61097b;

        public a(b bVar) {
            this.f61097b = bVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            this.f61097b.a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            this.f61097b.b(response);
        }
    }

    /* JADX INFO: compiled from: OkHttp3Util.java */
    public interface b {
        void a(IOException iOException);

        void b(Response response);
    }

    public static void a(String str, b bVar) {
        f61096b.newCall(new Request.Builder().url(str).get().build()).enqueue(new a(bVar));
    }

    public static synchronized OkHttpClient b() {
        if (f61096b == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            long j10 = f61095a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f61096b = builder.readTimeout(j10, timeUnit).connectTimeout(f61095a, timeUnit).writeTimeout(f61095a, timeUnit).retryOnConnectionFailure(true).addNetworkInterceptor(new u()).build();
        }
        return f61096b;
    }
}
