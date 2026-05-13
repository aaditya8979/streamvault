package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class O9 implements InterfaceC3724s4 {
    @Override // com.inmobi.media.InterfaceC3724s4
    public final void a(Config config) {
        tn.p.k(config, "config");
        if (config instanceof CrashConfig) {
            La la2 = P9.f26120d;
            CrashConfig crashConfig = (CrashConfig) config;
            la2.getClass();
            tn.p.k(crashConfig, "crashConfig");
            la2.f25863a = crashConfig;
            R9 r92 = la2.f25865c;
            r92.getClass();
            tn.p.k(crashConfig, "config");
            r92.f26237a.f25543a = crashConfig.getCrashConfig().getSamplingPercent();
            r92.f26238b.f25543a = crashConfig.getCatchConfig().getSamplingPercent();
            r92.f26239c.f25543a = crashConfig.getANRConfig().getWatchdog().getSamplingPercent();
            r92.f26240d.f25543a = crashConfig.getANRConfig().getAppExitReason().getSamplingPercent();
            C3552l6 c3552l6 = la2.f25864b;
            if (c3552l6 != null) {
                C3325c6 eventConfig = crashConfig.getEventConfig();
                tn.p.k(eventConfig, "eventConfig");
                c3552l6.f27544j = eventConfig;
            }
            C3775u5 c3775u5 = P9.f26119c;
            if (c3775u5 != null) {
                tn.p.k(crashConfig, "crashConfig");
                c3775u5.f28225a = crashConfig;
            }
        }
    }
}
