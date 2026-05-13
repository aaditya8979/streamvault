package yp;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.goldze.mvvmhabit.http.interceptor.logging.Level;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: LoggingInterceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public class c implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f98010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f98011b;

    /* JADX INFO: compiled from: LoggingInterceptor.java */
    public static class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static String f98012h = "LoggingI";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f98013a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f98015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f98016d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public yp.b f98019g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98014b = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Level f98017e = Level.BASIC;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Headers.Builder f98018f = new Headers.Builder();

        public b b(String str, String str2) {
            this.f98018f.set(str, str2);
            return this;
        }

        public c c() {
            return new c(this);
        }

        public Headers d() {
            return this.f98018f.build();
        }

        public Level e() {
            return this.f98017e;
        }

        public yp.b f() {
            return this.f98019g;
        }

        public String g(boolean z10) {
            return z10 ? TextUtils.isEmpty(this.f98015c) ? f98012h : this.f98015c : TextUtils.isEmpty(this.f98016d) ? f98012h : this.f98016d;
        }

        public int getType() {
            return this.f98014b;
        }

        public b h(int i10) {
            this.f98014b = i10;
            return this;
        }

        public b i(boolean z10) {
            this.f98013a = z10;
            return this;
        }

        public b j(String str) {
            this.f98015c = str;
            return this;
        }

        public b k(String str) {
            this.f98016d = str;
            return this;
        }

        public b l(Level level) {
            this.f98017e = level;
            return this;
        }
    }

    public c(b bVar) {
        this.f98011b = bVar;
        this.f98010a = bVar.f98013a;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        if (this.f98010a) {
            this.f98011b.l(Level.BASIC);
        } else {
            this.f98011b.l(Level.NONE);
        }
        Request request = chain.request();
        if (this.f98011b.d().size() > 0) {
            Headers headers = request.headers();
            Request.Builder builderNewBuilder = request.newBuilder();
            builderNewBuilder.headers(this.f98011b.d());
            for (String str : headers.names()) {
                builderNewBuilder.addHeader(str, headers.get(str));
            }
            request = builderNewBuilder.build();
        }
        MediaType mediaTypeContentType = request.body() != null ? request.body().contentType() : null;
        String strSubtype = mediaTypeContentType != null ? mediaTypeContentType.subtype() : null;
        if (strSubtype == null || !(strSubtype.contains("json") || strSubtype.contains("xml") || strSubtype.contains("plain") || strSubtype.contains(CreativeInfo.f52467al))) {
            if (this.f98010a) {
                d.h(this.f98011b, request);
            }
        } else if (this.f98010a) {
            d.j(this.f98011b, request);
        }
        long jNanoTime = System.nanoTime();
        Response responseProceed = chain.proceed(request);
        List<String> listEncodedPathSegments = responseProceed.request().url().encodedPathSegments();
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        String string = responseProceed.headers().toString();
        int iCode = responseProceed.code();
        boolean zIsSuccessful = responseProceed.isSuccessful();
        ResponseBody responseBodyBody = responseProceed.body();
        MediaType mediaTypeContentType2 = responseBodyBody.contentType();
        String strSubtype2 = mediaTypeContentType2 != null ? mediaTypeContentType2.subtype() : null;
        if (strSubtype2 == null || !(strSubtype2.contains("json") || strSubtype2.contains("xml") || strSubtype2.contains("plain") || strSubtype2.contains(CreativeInfo.f52467al))) {
            if (this.f98010a) {
                d.i(this.f98011b, millis, zIsSuccessful, iCode, string, listEncodedPathSegments);
            }
            return responseProceed;
        }
        String strC = d.c(zp.a.a(responseBodyBody.string()));
        if (this.f98010a) {
            d.k(this.f98011b, millis, zIsSuccessful, iCode, string, strC, listEncodedPathSegments);
        }
        return responseProceed.newBuilder().body(ResponseBody.create(mediaTypeContentType2, strC)).build();
    }
}
