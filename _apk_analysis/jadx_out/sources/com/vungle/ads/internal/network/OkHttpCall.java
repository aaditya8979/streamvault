package com.vungle.ads.internal.network;

import androidx.core.app.NotificationCompat;
import bn.r;
import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.squareup.picasso.Utils;
import com.vungle.ads.internal.network.converters.Converter;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: OkHttpCall.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u001c\u001d\u001eB'\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0010\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall;", "T", "Lcom/vungle/ads/internal/network/Call;", "Lokhttp3/Response;", "rawResp", "Lcom/vungle/ads/internal/network/Response;", "parseResponse", "Lokhttp3/ResponseBody;", "body", "buffer", "Lcom/vungle/ads/internal/network/Callback;", "callback", "Lbn/r;", "enqueue", "execute", "cancel", "", "isCanceled", "Lokhttp3/Call;", "rawCall", "Lokhttp3/Call;", "Lcom/vungle/ads/internal/network/converters/Converter;", "responseConverter", "Lcom/vungle/ads/internal/network/converters/Converter;", Utils.VERB_CANCELED, "Z", "<init>", "(Lokhttp3/Call;Lcom/vungle/ads/internal/network/converters/Converter;)V", VastTagName.COMPANION, "ExceptionCatchingResponseBody", "NoContentResponseBody", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class OkHttpCall<T> implements Call<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;

    @NotNull
    private final okhttp3.Call rawCall;

    @NotNull
    private final Converter<ResponseBody, T> responseConverter;

    /* JADX INFO: compiled from: OkHttpCall.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$Companion;", "", "", "t", "Lbn/r;", "throwIfFatal", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable th2) throws Throwable {
            if ((th2 instanceof ThreadDeath) || (th2 instanceof LinkageError)) {
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\n\u001a\u00020\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$ExceptionCatchingResponseBody;", "Lokhttp3/ResponseBody;", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSource;", "source", "Lbn/r;", "close", "throwIfCaught", "delegate", "Lokhttp3/ResponseBody;", "delegateSource", "Lokio/BufferedSource;", "Ljava/io/IOException;", "thrownException", "Ljava/io/IOException;", "getThrownException", "()Ljava/io/IOException;", "setThrownException", "(Ljava/io/IOException;)V", "<init>", "(Lokhttp3/ResponseBody;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class ExceptionCatchingResponseBody extends ResponseBody {

        @NotNull
        private final ResponseBody delegate;

        @NotNull
        private final BufferedSource delegateSource;

        @Nullable
        private IOException thrownException;

        public ExceptionCatchingResponseBody(@NotNull ResponseBody responseBody) {
            p.k(responseBody, "delegate");
            this.delegate = responseBody;
            this.delegateSource = Okio.buffer(new ForwardingSource(LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(responseBody)) { // from class: com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(@NotNull Buffer sink, long byteCount) throws IOException {
                    p.k(sink, "sink");
                    try {
                        return super.read(sink, byteCount);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.setThrownException(e10);
                        throw e10;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        @Nullable
        /* JADX INFO: renamed from: contentType */
        public MediaType getContentType() {
            return this.delegate.getContentType();
        }

        @Nullable
        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(@Nullable IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // okhttp3.ResponseBody
        @NotNull
        /* JADX INFO: renamed from: source, reason: from getter */
        public BufferedSource getDelegateSource() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: compiled from: OkHttpCall.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/network/OkHttpCall$NoContentResponseBody;", "Lokhttp3/ResponseBody;", "contentType", "Lokhttp3/MediaType;", "contentLength", "", "(Lokhttp3/MediaType;J)V", "source", "Lokio/BufferedSource;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;

        @Nullable
        private final MediaType contentType;

        public NoContentResponseBody(@Nullable MediaType mediaType, long j10) {
            this.contentType = mediaType;
            this.contentLength = j10;
        }

        @Override // okhttp3.ResponseBody
        /* JADX INFO: renamed from: contentLength, reason: from getter */
        public long getContentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        @Nullable
        /* JADX INFO: renamed from: contentType, reason: from getter */
        public MediaType getContentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        @NotNull
        /* JADX INFO: renamed from: source */
        public BufferedSource getDelegateSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(@NotNull okhttp3.Call call, @NotNull Converter<ResponseBody, T> converter) {
        p.k(call, "rawCall");
        p.k(converter, "responseConverter");
        this.rawCall = call;
        this.responseConverter = converter;
    }

    private final ResponseBody buffer(ResponseBody body) throws IOException {
        Buffer buffer = new Buffer();
        LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(body).readAll(buffer);
        return ResponseBody.Companion.create(buffer, body.getContentType(), body.getContentLength());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Response<T> parseResponse(okhttp3.Response rawResp) throws IOException {
        ResponseBody responseBodyOkhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(rawResp);
        if (responseBodyOkhttp3Response_body == null) {
            return null;
        }
        okhttp3.Response responseBuild = rawResp.newBuilder().body(new NoContentResponseBody(responseBodyOkhttp3Response_body.getContentType(), responseBodyOkhttp3Response_body.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode >= 200 && iCode < 300) {
            if (iCode == 204 || iCode == 205) {
                responseBodyOkhttp3Response_body.close();
                return Response.INSTANCE.success(null, responseBuild);
            }
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(responseBodyOkhttp3Response_body);
            try {
                return Response.INSTANCE.success(this.responseConverter.convert(exceptionCatchingResponseBody), responseBuild);
            } catch (Throwable th2) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw th2;
            }
        }
        try {
            Response<T> responseError = Response.INSTANCE.error(buffer(responseBodyOkhttp3Response_body), responseBuild);
            on.b.a(responseBodyOkhttp3Response_body, null);
            return responseError;
        } finally {
        }
    }

    @Override // com.vungle.ads.internal.network.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
            r rVar = r.f5635a;
        }
        call.cancel();
    }

    @Override // com.vungle.ads.internal.network.Call
    public void enqueue(@NotNull final Callback<T> callback) {
        okhttp3.Call call;
        p.k(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            call = this.rawCall;
            r rVar = r.f5635a;
        }
        if (this.canceled) {
            call.cancel();
        }
        LiftoffMonetizeNetworkBridge.okhttp3CallEnqueue(call, new okhttp3.Callback(this) { // from class: com.vungle.ads.internal.network.OkHttpCall.enqueue.2
            public final /* synthetic */ OkHttpCall<T> this$0;

            {
                this.this$0 = this;
            }

            private final void callFailure(Throwable th2) throws Throwable {
                try {
                    callback.onFailure(this.this$0, th2);
                } catch (Throwable th3) {
                    OkHttpCall.INSTANCE.throwIfFatal(th3);
                    Logger.INSTANCE.e(OkHttpCall.TAG, "Cannot pass failure to callback", th3);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(@NotNull okhttp3.Call call2, @NotNull IOException iOException) throws Throwable {
                p.k(call2, NotificationCompat.CATEGORY_CALL);
                p.k(iOException, "e");
                callFailure(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull okhttp3.Call call2, @NotNull okhttp3.Response response) throws Throwable {
                p.k(call2, NotificationCompat.CATEGORY_CALL);
                p.k(response, "response");
                try {
                    try {
                        callback.onResponse(this.this$0, this.this$0.parseResponse(response));
                    } catch (Throwable th2) {
                        OkHttpCall.INSTANCE.throwIfFatal(th2);
                        Logger.INSTANCE.e(OkHttpCall.TAG, "Cannot pass response to callback", th2);
                    }
                } catch (Throwable th3) {
                    Logger.INSTANCE.e(OkHttpCall.TAG, "[enqueue] Failed to parse response: " + th3.getLocalizedMessage());
                    OkHttpCall.INSTANCE.throwIfFatal(th3);
                    callFailure(th3);
                }
            }
        });
    }

    @Override // com.vungle.ads.internal.network.Call
    @Nullable
    public Response<T> execute() {
        okhttp3.Call call;
        Object objM7534constructorimpl;
        synchronized (this) {
            call = this.rawCall;
            r rVar = r.f5635a;
        }
        if (this.canceled) {
            call.cancel();
        }
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(parseResponse(LiftoffMonetizeNetworkBridge.okhttp3CallExecute(call)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "[execute] Failed to parse response:  " + thM7537exceptionOrNullimpl.getLocalizedMessage());
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (Response) objM7534constructorimpl;
    }

    @Override // com.vungle.ads.internal.network.Call
    public boolean isCanceled() {
        boolean zIsCanceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            zIsCanceled = this.rawCall.isCanceled();
        }
        return zIsCanceled;
    }
}
