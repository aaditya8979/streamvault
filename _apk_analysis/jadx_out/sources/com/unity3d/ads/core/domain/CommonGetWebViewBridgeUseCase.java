package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.log.Logger;
import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.l0;
import p000do.w0;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CommonGetWebViewBridgeUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonGetWebViewBridgeUseCase implements GetWebViewBridgeUseCase {

    @NotNull
    private final h0 dispatcher;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonGetWebViewBridgeUseCase(@NotNull h0 h0Var, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Logger logger) {
        p.k(h0Var, "dispatcher");
        p.k(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.k(logger, "logger");
        this.dispatcher = h0Var;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
    }

    public /* synthetic */ CommonGetWebViewBridgeUseCase(h0 h0Var, SendDiagnosticEvent sendDiagnosticEvent, Logger logger, int i10, i iVar) {
        this((i10 & 1) != 0 ? w0.a() : h0Var, sendDiagnosticEvent, logger);
    }

    @Override // com.unity3d.ads.core.domain.GetWebViewBridgeUseCase
    @NotNull
    public WebViewBridge invoke(@NotNull AndroidWebViewContainer androidWebViewContainer, @NotNull l0 l0Var) {
        p.k(androidWebViewContainer, "webViewContainer");
        p.k(l0Var, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, androidWebViewContainer, l0Var, this.sendDiagnosticEvent, this.logger);
    }
}
