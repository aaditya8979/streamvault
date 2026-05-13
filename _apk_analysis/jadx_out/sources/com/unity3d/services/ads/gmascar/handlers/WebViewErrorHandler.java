package com.unity3d.services.ads.gmascar.handlers;

import af.c;
import af.l;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* JADX INFO: loaded from: classes4.dex */
public class WebViewErrorHandler implements c<l> {
    private final IEventSender _eventSender;

    public WebViewErrorHandler() {
        this(SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public WebViewErrorHandler(IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    @Override // af.c
    public void handleError(l lVar) {
        this._eventSender.sendEvent(WebViewEventCategory.valueOf(lVar.getDomain()), lVar.getErrorCategory(), lVar.getErrorArguments());
    }
}
