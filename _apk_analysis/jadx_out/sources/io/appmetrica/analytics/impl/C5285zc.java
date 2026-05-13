package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5285zc extends J2 {
    public C5285zc(Context context, Cf cf2, ReporterConfig reporterConfig, C5241xi c5241xi, N9 n92) {
        this(context, c5241xi, new Gh(cf2, new CounterConfiguration(reporterConfig), new E8(new C5119sl(LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), n92, C4696c4.l().n(), new Sn(), new Fg(), new C5204w6(), new C4718d0(), new Ke(n92));
    }

    public C5285zc(Context context, C5241xi c5241xi, Gh gh2, N9 n92, C5104s6 c5104s6, Sn sn2, Fg fg2, C5204w6 c5204w6, C4718d0 c4718d0, Ke ke2) {
        super(context, c5241xi, gh2, n92, c5104s6, sn2, fg2, c5204w6, c4718d0, ke2);
        C4696c4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.J2
    public final String j() {
        return "[ManualReporter]";
    }
}
