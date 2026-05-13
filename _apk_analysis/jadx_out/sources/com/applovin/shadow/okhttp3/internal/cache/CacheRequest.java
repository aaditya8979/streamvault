package com.applovin.shadow.okhttp3.internal.cache;

import com.applovin.shadow.okio.Sink;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CacheRequest.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface CacheRequest {
    void abort();

    @NotNull
    Sink body() throws IOException;
}
