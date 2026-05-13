package i0;

import bo.a0;
import coil.network.CacheResponse;
import coil.util.Time;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.D8;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CacheStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0003\u0005B\u001d\b\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, d2 = {"Li0/a;", "", "Lokhttp3/Request;", "a", "Lokhttp3/Request;", "b", "()Lokhttp3/Request;", "networkRequest", "Lcoil/network/CacheResponse;", "Lcoil/network/CacheResponse;", "()Lcoil/network/CacheResponse;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "c", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Request networkRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CacheResponse cacheResponse;

    /* JADX INFO: renamed from: i0.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: CacheStrategy.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0014"}, d2 = {"Li0/a$a;", "", "Lokhttp3/Request;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/Response;", "response", "", "c", "Lcoil/network/CacheResponse;", "b", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "a", "", "name", "e", "d", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final Headers a(@NotNull Headers cachedHeaders, @NotNull Headers networkHeaders) {
            Headers.Builder builder = new Headers.Builder();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = cachedHeaders.name(i10);
                String strValue = cachedHeaders.value(i10);
                if ((!a0.J("Warning", strName, true) || !a0.W(strValue, "1", false, 2, null)) && (d(strName) || !e(strName) || networkHeaders.get(strName) == null)) {
                    builder.add(strName, strValue);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strName2 = networkHeaders.name(i11);
                if (!d(strName2) && e(strName2)) {
                    builder.add(strName2, networkHeaders.value(i11));
                }
            }
            return builder.build();
        }

        public final boolean b(@NotNull Request request, @NotNull CacheResponse response) {
            return (request.cacheControl().noStore() || response.a().noStore() || p.f(response.getResponseHeaders().get("Vary"), "*")) ? false : true;
        }

        public final boolean c(@NotNull Request request, @NotNull Response response) {
            return (request.cacheControl().noStore() || response.cacheControl().noStore() || p.f(response.headers().get("Vary"), "*")) ? false : true;
        }

        public final boolean d(String name) {
            return a0.J("Content-Length", name, true) || a0.J("Content-Encoding", name, true) || a0.J("Content-Type", name, true);
        }

        public final boolean e(String name) {
            return (a0.J("Connection", name, true) || a0.J("Keep-Alive", name, true) || a0.J("Proxy-Authenticate", name, true) || a0.J("Proxy-Authorization", name, true) || a0.J("TE", name, true) || a0.J("Trailers", name, true) || a0.J("Transfer-Encoding", name, true) || a0.J("Upgrade", name, true)) ? false : true;
        }
    }

    /* JADX INFO: compiled from: CacheStrategy.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Li0/a$b;", "", "Li0/a;", "b", "", "c", "a", "Lokhttp3/Request;", AdActivity.REQUEST_KEY_EXTRA, "", "d", "Lokhttp3/Request;", "Lcoil/network/CacheResponse;", "Lcoil/network/CacheResponse;", "cacheResponse", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "e", D8.f29122c, InneractiveMediationDefs.GENDER_FEMALE, "lastModifiedString", "g", "expires", "h", "J", "sentRequestMillis", "i", "receivedResponseMillis", "j", DownloadModel.ETAG, "", CampaignEx.JSON_KEY_AD_K, "I", "ageSeconds", "<init>", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Request request;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final CacheResponse cacheResponse;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Date servedDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String servedDateString;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Date lastModified;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String lastModifiedString;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Date expires;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public long sentRequestMillis;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public long receivedResponseMillis;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String etag;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public int ageSeconds;

        public b(@NotNull Request request, @Nullable CacheResponse cacheResponse) {
            this.request = request;
            this.cacheResponse = cacheResponse;
            this.ageSeconds = -1;
            if (cacheResponse != null) {
                this.sentRequestMillis = cacheResponse.getSentRequestAtMillis();
                this.receivedResponseMillis = cacheResponse.getReceivedResponseAtMillis();
                Headers responseHeaders = cacheResponse.getResponseHeaders();
                int size = responseHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strName = responseHeaders.name(i10);
                    if (a0.J(strName, "Date", true)) {
                        this.servedDate = responseHeaders.getDate("Date");
                        this.servedDateString = responseHeaders.value(i10);
                    } else if (a0.J(strName, "Expires", true)) {
                        this.expires = responseHeaders.getDate("Expires");
                    } else if (a0.J(strName, "Last-Modified", true)) {
                        this.lastModified = responseHeaders.getDate("Last-Modified");
                        this.lastModifiedString = responseHeaders.value(i10);
                    } else if (a0.J(strName, Command.HTTP_HEADER_ETAG, true)) {
                        this.etag = responseHeaders.value(i10);
                    } else if (a0.J(strName, "Age", true)) {
                        this.ageSeconds = o0.i.z(responseHeaders.value(i10), -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.servedDate;
            long jMax = date != null ? Math.max(0L, this.receivedResponseMillis - date.getTime()) : 0L;
            int i10 = this.ageSeconds;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + (this.receivedResponseMillis - this.sentRequestMillis) + (Time.f6996a.a() - this.receivedResponseMillis);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final a b() {
            CacheResponse cacheResponse = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.cacheResponse == null) {
                return new a(this.request, cacheResponse, objArr12 == true ? 1 : 0);
            }
            if (this.request.isHttps() && !this.cacheResponse.getIsTls()) {
                return new a(this.request, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            CacheControl cacheControlA = this.cacheResponse.a();
            if (!a.INSTANCE.b(this.request, this.cacheResponse)) {
                return new a(this.request, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (cacheControl.noCache() || d(this.request)) {
                return new a(this.request, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long jA = a();
            long jC = c();
            if (cacheControl.maxAgeSeconds() != -1) {
                jC = Math.min(jC, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
            if (!cacheControlA.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
            }
            if (!cacheControlA.noCache() && jA + millis2 < jC + millis) {
                return new a(objArr7 == true ? 1 : 0, this.cacheResponse, objArr6 == true ? 1 : 0);
            }
            String str = this.etag;
            String str2 = "If-Modified-Since";
            if (str != null) {
                p.h(str);
                str2 = "If-None-Match";
            } else if (this.lastModified != null) {
                str = this.lastModifiedString;
                p.h(str);
            } else {
                if (this.servedDate == null) {
                    return new a(this.request, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                }
                str = this.servedDateString;
                p.h(str);
            }
            return new a(this.request.newBuilder().addHeader(str2, str).build(), this.cacheResponse, objArr5 == true ? 1 : 0);
        }

        public final long c() {
            CacheResponse cacheResponse = this.cacheResponse;
            p.h(cacheResponse);
            if (cacheResponse.a().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.receivedResponseMillis);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.lastModified == null || this.request.url().query() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            long time2 = date3 != null ? date3.getTime() : this.sentRequestMillis;
            Date date4 = this.lastModified;
            p.h(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        public final boolean d(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }
    }

    public a(Request request, CacheResponse cacheResponse) {
        this.networkRequest = request;
        this.cacheResponse = cacheResponse;
    }

    public /* synthetic */ a(Request request, CacheResponse cacheResponse, i iVar) {
        this(request, cacheResponse);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CacheResponse getCacheResponse() {
        return this.cacheResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
