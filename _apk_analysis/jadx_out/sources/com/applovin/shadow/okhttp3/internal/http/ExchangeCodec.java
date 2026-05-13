package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExchangeCodec.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface ExchangeCodec {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* JADX INFO: compiled from: ExchangeCodec.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    @NotNull
    Sink createRequestBody(@NotNull Request request, long j10) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    @NotNull
    RealConnection getConnection();

    @NotNull
    Source openResponseBodySource(@NotNull Response response) throws IOException;

    @Nullable
    Response.Builder readResponseHeaders(boolean z10) throws IOException;

    long reportedContentLength(@NotNull Response response) throws IOException;

    @NotNull
    Headers trailers() throws IOException;

    void writeRequestHeaders(@NotNull Request request) throws IOException;
}
