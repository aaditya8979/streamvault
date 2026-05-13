package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import okhttp3.Dispatcher;

/* JADX INFO: renamed from: com.inmobi.media.if, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class Cif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3779u9 f27353a;

    public Cif(AdConfig.PingsV2Config pingsV2Config) {
        tn.p.k(pingsV2Config, "pingsConfig");
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(pingsV2Config.getMaxBatchSize().getHigh());
        bn.r rVar = bn.r.f5635a;
        this.f27353a = C3729s9.a(null, dispatcher, null, new C3666pk(pingsV2Config.getConnectTimeout(), pingsV2Config.getReadTimeout(), pingsV2Config.getCallTimeout()), 5);
    }
}
