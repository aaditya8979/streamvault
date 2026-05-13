package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AdPlayerError.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class LoadWebViewError extends AdPlayerError {

    @NotNull
    private final List<WebViewClientError> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(@NotNull List<WebViewClientError> list) {
        super("AdPlayer was not able to load the webview.", null);
        p.k(list, "errors");
        this.errors = list;
    }

    @NotNull
    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
