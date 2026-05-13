package com.unity3d.services.store;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: StoreWebViewEventSender.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class StoreWebViewEventSender {

    @NotNull
    private final IEventSender eventSender;

    public StoreWebViewEventSender(@NotNull IEventSender iEventSender) {
        p.k(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final void send(@NotNull StoreEvent storeEvent, @NotNull Object... objArr) {
        p.k(storeEvent, "event");
        p.k(objArr, "params");
        this.eventSender.sendEvent(WebViewEventCategory.STORE, storeEvent, Arrays.copyOf(objArr, objArr.length));
    }
}
