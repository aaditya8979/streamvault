package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class Vj implements InterfaceC3724s4 {
    @Override // com.inmobi.media.InterfaceC3724s4
    public final void a(Config config) {
        tn.p.k(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfigB = Wj.b();
            Wj.f26555g = new C3516jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetConfig().isImageEnabled(), telemetryConfigB.getAssetConfig().isGifEnabled(), telemetryConfigB.getAssetConfig().isVideoEnabled(), telemetryConfigB.isGeneralEventsDisabled(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), cn.f0.g1(Wj.f26551c));
            C3416fk c3416fk = Wj.f26557i;
            if (c3416fk != null) {
                TelemetryConfig telemetryConfigB2 = Wj.b();
                tn.p.k(telemetryConfigB2, "telemetryConfig");
                c3416fk.f27178a = telemetryConfigB2;
            }
        }
    }
}
