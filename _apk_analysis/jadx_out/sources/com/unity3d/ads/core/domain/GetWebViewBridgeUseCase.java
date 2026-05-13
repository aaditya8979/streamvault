package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: compiled from: GetWebViewBridgeUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface GetWebViewBridgeUseCase {
    @NotNull
    WebViewBridge invoke(@NotNull AndroidWebViewContainer androidWebViewContainer, @NotNull l0 l0Var);
}
