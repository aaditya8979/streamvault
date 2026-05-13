package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class R9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gi f26237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gi f26238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gi f26239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gi f26240d;

    public R9(CrashConfig crashConfig) {
        tn.p.k(crashConfig, "config");
        this.f26237a = new Gi(crashConfig.getCrashConfig().getSamplingPercent());
        this.f26238b = new Gi(crashConfig.getCatchConfig().getSamplingPercent());
        this.f26239c = new Gi(crashConfig.getANRConfig().getWatchdog().getSamplingPercent());
        this.f26240d = new Gi(crashConfig.getANRConfig().getAppExitReason().getSamplingPercent());
    }
}
