package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: WebSocketListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int i10, @NotNull String str) {
        p.k(webSocket, "webSocket");
        p.k(str, "reason");
    }

    public void onClosing(@NotNull WebSocket webSocket, int i10, @NotNull String str) {
        p.k(webSocket, "webSocket");
        p.k(str, "reason");
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable th2, @Nullable Response response) {
        p.k(webSocket, "webSocket");
        p.k(th2, "t");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString byteString) {
        p.k(webSocket, "webSocket");
        p.k(byteString, "bytes");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String str) {
        p.k(webSocket, "webSocket");
        p.k(str, "text");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        p.k(webSocket, "webSocket");
        p.k(response, "response");
    }
}
