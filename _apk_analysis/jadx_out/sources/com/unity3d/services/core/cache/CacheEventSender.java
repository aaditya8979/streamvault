package com.unity3d.services.core.cache;

import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.io.Serializable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CacheEventSender.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CacheEventSender implements Serializable {

    @NotNull
    private final IEventSender eventSender;

    public CacheEventSender(@NotNull IEventSender iEventSender) {
        p.k(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final boolean sendEvent(@NotNull CacheEvent cacheEvent, @NotNull Object... objArr) {
        p.k(cacheEvent, "eventId");
        p.k(objArr, "params");
        return this.eventSender.sendEvent(WebViewEventCategory.CACHE, cacheEvent, Arrays.copyOf(objArr, objArr.length));
    }
}
