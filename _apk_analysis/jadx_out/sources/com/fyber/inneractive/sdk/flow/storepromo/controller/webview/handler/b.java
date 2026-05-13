package com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a f16563a;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a aVar) {
        this.f16563a = aVar;
    }

    public final void a(String str, HashMap map, g1 g1Var) {
        str.getClass();
        switch (str) {
            case "onClick":
                String str2 = (String) map.get("clickAction");
                if (str2 != null && !str2.isEmpty()) {
                    try {
                        this.f16563a.a(Integer.parseInt(str2), g1Var);
                    } catch (NumberFormatException e10) {
                        IAlog.b("WebviewCommandHandlerBase: handleClick: exception: %s" + e10, new Object[0]);
                    }
                    break;
                } else {
                    IAlog.a("WebviewCommandHandlerBase: handleClick: no click action in params for click cmd", new Object[0]);
                    break;
                }
                break;
            case "onError":
                this.f16563a.a(map);
                break;
            case "DOMLoaded":
                this.f16563a.a();
                break;
            default:
                IAlog.f("Sent unknown command: %s", str);
                break;
        }
        this.f16563a.b();
    }
}
