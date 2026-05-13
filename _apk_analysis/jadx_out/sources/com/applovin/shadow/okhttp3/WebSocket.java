package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebSocket.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface WebSocket {

    /* JADX INFO: compiled from: WebSocket.kt */
    public interface Factory {
        @NotNull
        WebSocket newWebSocket(@NotNull Request request, @NotNull WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i10, @Nullable String str);

    long queueSize();

    @NotNull
    Request request();

    boolean send(@NotNull ByteString byteString);

    boolean send(@NotNull String str);
}
