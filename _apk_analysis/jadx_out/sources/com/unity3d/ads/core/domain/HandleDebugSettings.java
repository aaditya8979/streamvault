package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import com.unity3d.ads.core.log.LogLevel;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HandleDebugSettings.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class HandleDebugSettings {

    @NotNull
    private final Logger logger;

    public HandleDebugSettings(@NotNull Logger logger) {
        p.k(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(@NotNull NativeConfigurationOuterClass.DebugSettings debugSettings) {
        p.k(debugSettings, "debugSettings");
        if (debugSettings.getEnableTracing()) {
            this.logger.setLogLevel(LogLevel.TRACE);
        }
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
