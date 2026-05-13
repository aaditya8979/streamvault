package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.MediaType;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;

    @Nullable
    private final String contentTypeString;

    @NotNull
    private final BufferedSource source;

    public RealResponseBody(@Nullable String str, long j10, @NotNull BufferedSource bufferedSource) {
        p.k(bufferedSource, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = bufferedSource;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    @Nullable
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // com.applovin.shadow.okhttp3.ResponseBody
    @NotNull
    public BufferedSource source() {
        return this.source;
    }
}
