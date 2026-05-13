package com.unity3d.ads.adplayer;

import android.view.InputEvent;
import bn.r;
import go.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: compiled from: WebViewContainer.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface WebViewContainer {
    @Nullable
    Object addJavascriptInterface(@NotNull WebViewBridge webViewBridge, @NotNull String str, @NotNull hn.c<? super r> cVar);

    @Nullable
    Object destroy(@NotNull hn.c<? super r> cVar);

    @Nullable
    Object evaluateJavascript(@NotNull HandlerType handlerType, @NotNull JSONArray jSONArray, @NotNull hn.c<? super r> cVar);

    @NotNull
    u<InputEvent> getLastInputEvent();

    @Nullable
    Object loadUrl(@NotNull String str, @NotNull hn.c<? super r> cVar);
}
