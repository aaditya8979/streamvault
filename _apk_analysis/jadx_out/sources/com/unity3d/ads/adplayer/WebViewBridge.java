package com.unity3d.ads.adplayer;

import bn.r;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import go.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebViewBridge.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface WebViewBridge {
    @NotNull
    p<Invocation> getOnInvocation();

    void handleCallback(@NotNull String str, @NotNull String str2, @NotNull String str3);

    void handleInvocation(@NotNull String str);

    @Nullable
    Object request(@NotNull String str, @NotNull String str2, @NotNull Object[] objArr, @NotNull hn.c<? super Object[]> cVar);

    @Nullable
    Object sendEvent(@NotNull WebViewEvent webViewEvent, @NotNull hn.c<? super r> cVar);
}
