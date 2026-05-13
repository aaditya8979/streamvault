package coil.fetch;

import a0.k;
import a0.l;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.internal.AssetHelper;
import b0.a;
import bn.d;
import bn.g;
import bn.r;
import bo.a0;
import bo.d0;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.network.CacheResponse;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import d0.i;
import j0.j;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: HttpUriFetcher.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0002\u0003$B=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020#\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0'\u0012\u0006\u00100\u001a\u00020\u0018¢\u0006\u0004\b6\u00107J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J.\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\u001b\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u0012*\u00020\u000bH\u0002J\f\u0010\u001c\u001a\u00020\u001b*\u00020\u000bH\u0002J\f\u0010\u001e\u001a\u00020\u001b*\u00020\u001dH\u0002J\f\u0010 \u001a\u00020\u001f*\u00020\u0010H\u0002J\f\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u00100\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u00101R\u0014\u00105\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcoil/fetch/HttpUriFetcher;", "Ld0/i;", "Ld0/h;", "a", "(Lhn/c;)Ljava/lang/Object;", "", "url", "Lokhttp3/MediaType;", "contentType", InneractiveMediationDefs.GENDER_FEMALE, "(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;", "Lb0/a$c;", "i", "snapshot", "Lokhttp3/Request;", AdActivity.REQUEST_KEY_EXTRA, "Lokhttp3/Response;", "response", "Lcoil/network/CacheResponse;", "cacheResponse", "o", "h", "c", "(Lokhttp3/Request;Lhn/c;)Ljava/lang/Object;", "", "g", CampaignEx.JSON_KEY_AD_K, "La0/k;", InneractiveMediationDefs.GENDER_MALE, "Lokhttp3/ResponseBody;", "n", "Lcoil/decode/DataSource;", "l", "j", "Ljava/lang/String;", "Lj0/j;", "b", "Lj0/j;", "options", "Lbn/g;", "Lokhttp3/Call$Factory;", "Lbn/g;", "callFactory", "Lb0/a;", "d", "diskCache", "e", "Z", "respectCacheHeaders", "()Ljava/lang/String;", "diskCacheKey", "Lokio/FileSystem;", "()Lokio/FileSystem;", "fileSystem", "<init>", "(Ljava/lang/String;Lj0/j;Lbn/g;Lbn/g;Z)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class HttpUriFetcher implements i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final CacheControl f6924g = new CacheControl.Builder().noCache().noStore().build();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final CacheControl f6925h = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<Call.Factory> callFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g<a> diskCache;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean respectCacheHeaders;

    /* JADX INFO: compiled from: HttpUriFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcoil/fetch/HttpUriFetcher$b;", "Ld0/i$a;", "Landroid/net/Uri;", "data", "Lj0/j;", "options", "Lcoil/ImageLoader;", "imageLoader", "Ld0/i;", "b", "", "c", "Lbn/g;", "Lokhttp3/Call$Factory;", "a", "Lbn/g;", "callFactory", "Lb0/a;", "diskCache", "Z", "respectCacheHeaders", "<init>", "(Lbn/g;Lbn/g;Z)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements i.a<Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g<Call.Factory> callFactory;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g<a> diskCache;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean respectCacheHeaders;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull g<? extends Call.Factory> gVar, @NotNull g<? extends a> gVar2, boolean z10) {
            this.callFactory = gVar;
            this.diskCache = gVar2;
            this.respectCacheHeaders = z10;
        }

        @Override // d0.i.a
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@NotNull Uri data, @NotNull j options, @NotNull ImageLoader imageLoader) {
            if (c(data)) {
                return new HttpUriFetcher(data.toString(), options, this.callFactory, this.diskCache, this.respectCacheHeaders);
            }
            return null;
        }

        public final boolean c(Uri data) {
            return p.f(data.getScheme(), "http") || p.f(data.getScheme(), "https");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpUriFetcher(@NotNull String str, @NotNull j jVar, @NotNull g<? extends Call.Factory> gVar, @NotNull g<? extends a> gVar2, boolean z10) {
        this.url = str;
        this.options = jVar;
        this.callFactory = gVar;
        this.diskCache = gVar2;
        this.respectCacheHeaders = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0127 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d0.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull hn.c<? super d0.h> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.a(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(okhttp3.Request r5, hn.c<? super okhttp3.Response> r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = (coil.fetch.HttpUriFetcher$executeNetworkRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = new coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.c.b(r6)
            boolean r6 = o0.i.s()
            if (r6 == 0) goto L5d
            j0.j r6 = r4.options
            coil.request.CachePolicy r6 = r6.getNetworkCachePolicy()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            bn.g<okhttp3.Call$Factory> r6 = r4.callFactory
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = r5.execute()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            bn.g<okhttp3.Call$Factory> r6 = r4.callFactory
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.label = r3
            java.lang.Object r6 = o0.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L75:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto L92
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto L8c
            o0.i.d(r6)
        L8c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.c(okhttp3.Request, hn.c):java.lang.Object");
    }

    public final String d() {
        String diskCacheKey = this.options.getDiskCacheKey();
        return diskCacheKey == null ? this.url : diskCacheKey;
    }

    public final FileSystem e() {
        a value = this.diskCache.getValue();
        p.h(value);
        return value.getFileSystem();
    }

    @VisibleForTesting
    @Nullable
    public final String f(@NotNull String url, @Nullable MediaType contentType) {
        String strK;
        String string = contentType != null ? contentType.toString() : null;
        if ((string == null || a0.W(string, AssetHelper.DEFAULT_MIME_TYPE, false, 2, null)) && (strK = o0.i.k(MimeTypeMap.getSingleton(), url)) != null) {
            return strK;
        }
        if (string != null) {
            return d0.l1(string, ';', null, 2, null);
        }
        return null;
    }

    public final boolean g(Request request, Response response) {
        return this.options.getDiskCachePolicy().getWriteEnabled() && (!this.respectCacheHeaders || i0.a.INSTANCE.c(request, response));
    }

    public final Request h() {
        Request.Builder builderHeaders = new Request.Builder().url(this.url).headers(this.options.getHeaders());
        for (Map.Entry<Class<?>, Object> entry : this.options.getTags().a().entrySet()) {
            Class<?> key = entry.getKey();
            p.i(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builderHeaders.tag(key, entry.getValue());
        }
        boolean readEnabled = this.options.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.options.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            builderHeaders.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                builderHeaders.cacheControl(f6925h);
            }
        } else if (this.options.getDiskCachePolicy().getWriteEnabled()) {
            builderHeaders.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            builderHeaders.cacheControl(f6924g);
        }
        return builderHeaders.build();
    }

    public final a.c i() {
        a value;
        if (!this.options.getDiskCachePolicy().getReadEnabled() || (value = this.diskCache.getValue()) == null) {
            return null;
        }
        return value.get(d());
    }

    public final ResponseBody j(Response response) {
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            return responseBodyBody;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    public final CacheResponse k(a.c cVar) throws Throwable {
        CacheResponse cacheResponse;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(e().source(cVar.getMetadata()));
            try {
                cacheResponse = new CacheResponse(bufferedSourceBuffer);
                th = null;
            } catch (Throwable th2) {
                th = th2;
                cacheResponse = null;
            }
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        d.a(th, th3);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            p.h(cacheResponse);
            return cacheResponse;
        } catch (IOException unused) {
            return null;
        }
    }

    public final DataSource l(Response response) {
        return response.networkResponse() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    public final k m(a.c cVar) {
        return l.c(cVar.getData(), e(), d(), cVar);
    }

    public final k n(ResponseBody responseBody) {
        return l.a(responseBody.source(), this.options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String());
    }

    public final a.c o(a.c snapshot, Request request, Response response, CacheResponse cacheResponse) {
        a.b bVarA;
        r rVar;
        Long lValueOf;
        r rVar2;
        Throwable th2 = null;
        if (!g(request, response)) {
            if (snapshot != null) {
                o0.i.d(snapshot);
            }
            return null;
        }
        if (snapshot != null) {
            bVarA = snapshot.v();
        } else {
            a value = this.diskCache.getValue();
            bVarA = value != null ? value.a(d()) : null;
        }
        try {
            if (bVarA == null) {
                return null;
            }
            try {
                if (response.code() != 304 || cacheResponse == null) {
                    BufferedSink bufferedSinkBuffer = Okio.buffer(e().sink(bVarA.getMetadata(), false));
                    try {
                        new CacheResponse(response).g(bufferedSinkBuffer);
                        rVar = r.f5635a;
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                        rVar = null;
                    }
                    if (bufferedSinkBuffer != null) {
                        try {
                            bufferedSinkBuffer.close();
                        } catch (Throwable th4) {
                            if (th == null) {
                                th = th4;
                            } else {
                                d.a(th, th4);
                            }
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    p.h(rVar);
                    BufferedSink bufferedSinkBuffer2 = Okio.buffer(e().sink(bVarA.getData(), false));
                    try {
                        ResponseBody responseBodyBody = response.body();
                        p.h(responseBodyBody);
                        lValueOf = Long.valueOf(responseBodyBody.source().readAll(bufferedSinkBuffer2));
                    } catch (Throwable th5) {
                        th2 = th5;
                        lValueOf = null;
                    }
                    if (bufferedSinkBuffer2 != null) {
                        try {
                            bufferedSinkBuffer2.close();
                        } catch (Throwable th6) {
                            if (th2 == null) {
                                th2 = th6;
                            } else {
                                d.a(th2, th6);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    p.h(lValueOf);
                } else {
                    Response responseBuild = response.newBuilder().headers(i0.a.INSTANCE.a(cacheResponse.getResponseHeaders(), response.headers())).build();
                    BufferedSink bufferedSinkBuffer3 = Okio.buffer(e().sink(bVarA.getMetadata(), false));
                    try {
                        new CacheResponse(responseBuild).g(bufferedSinkBuffer3);
                        rVar2 = r.f5635a;
                    } catch (Throwable th7) {
                        th2 = th7;
                        rVar2 = null;
                    }
                    if (bufferedSinkBuffer3 != null) {
                        try {
                            bufferedSinkBuffer3.close();
                        } catch (Throwable th8) {
                            if (th2 == null) {
                                th2 = th8;
                            } else {
                                d.a(th2, th8);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    p.h(rVar2);
                }
                return bVarA.a();
            } catch (Exception e10) {
                o0.i.a(bVarA);
                throw e10;
            }
        } finally {
            o0.i.d(response);
        }
    }
}
