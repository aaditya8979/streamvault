package coil.network;

import bn.g;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.IOException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import o0.i;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: CacheResponse.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\n\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006'"}, d2 = {"Lcoil/network/CacheResponse;", "", "Lokio/BufferedSink;", "sink", "Lbn/r;", "g", "Lokhttp3/CacheControl;", "a", "Lbn/g;", "()Lokhttp3/CacheControl;", UnifiedMediationParams.KEY_CACHE_CONTROL, "Lokhttp3/MediaType;", "b", "()Lokhttp3/MediaType;", "contentType", "", "c", "J", "e", "()J", "sentRequestAtMillis", "d", "receivedResponseAtMillis", "", "Z", InneractiveMediationDefs.GENDER_FEMALE, "()Z", "isTls", "Lokhttp3/Headers;", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "responseHeaders", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class CacheResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g cacheControl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g contentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long sentRequestAtMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long receivedResponseAtMillis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isTls;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Headers responseHeaders;

    public CacheResponse(@NotNull Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.cacheControl = b.a(lazyThreadSafetyMode, new a<CacheControl>() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final CacheControl invoke() {
                return CacheControl.Companion.parse(this.this$0.getResponseHeaders());
            }
        });
        this.contentType = b.a(lazyThreadSafetyMode, new a<MediaType>() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // sn.a
            @Nullable
            public final MediaType invoke() {
                String str = this.this$0.getResponseHeaders().get("Content-Type");
                if (str != null) {
                    return MediaType.Companion.parse(str);
                }
                return null;
            }
        });
        this.sentRequestAtMillis = response.sentRequestAtMillis();
        this.receivedResponseAtMillis = response.receivedResponseAtMillis();
        this.isTls = response.handshake() != null;
        this.responseHeaders = response.headers();
    }

    public CacheResponse(@NotNull BufferedSource bufferedSource) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.cacheControl = b.a(lazyThreadSafetyMode, new a<CacheControl>() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final CacheControl invoke() {
                return CacheControl.Companion.parse(this.this$0.getResponseHeaders());
            }
        });
        this.contentType = b.a(lazyThreadSafetyMode, new a<MediaType>() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // sn.a
            @Nullable
            public final MediaType invoke() {
                String str = this.this$0.getResponseHeaders().get("Content-Type");
                if (str != null) {
                    return MediaType.Companion.parse(str);
                }
                return null;
            }
        });
        this.sentRequestAtMillis = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.receivedResponseAtMillis = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.isTls = Integer.parseInt(bufferedSource.readUtf8LineStrict()) > 0;
        int i10 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        Headers.Builder builder = new Headers.Builder();
        for (int i11 = 0; i11 < i10; i11++) {
            i.b(builder, bufferedSource.readUtf8LineStrict());
        }
        this.responseHeaders = builder.build();
    }

    @NotNull
    public final CacheControl a() {
        return (CacheControl) this.cacheControl.getValue();
    }

    @Nullable
    public final MediaType b() {
        return (MediaType) this.contentType.getValue();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Headers getResponseHeaders() {
        return this.responseHeaders;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    public final void g(@NotNull BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeDecimalLong(this.sentRequestAtMillis).writeByte(10);
        bufferedSink.writeDecimalLong(this.receivedResponseAtMillis).writeByte(10);
        bufferedSink.writeDecimalLong(this.isTls ? 1L : 0L).writeByte(10);
        bufferedSink.writeDecimalLong(this.responseHeaders.size()).writeByte(10);
        int size = this.responseHeaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            bufferedSink.writeUtf8(this.responseHeaders.name(i10)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(i10)).writeByte(10);
        }
    }
}
