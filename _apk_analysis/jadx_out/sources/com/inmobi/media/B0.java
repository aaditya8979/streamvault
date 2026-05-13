package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class B0 implements InterfaceC3724s4 {
    @Override // com.inmobi.media.InterfaceC3724s4
    public final void a(Config config) {
        A0 a02;
        tn.p.k(config, "config");
        if ((config instanceof AdConfig) && (a02 = E0.f25353b) != null) {
            AdConfig adConfig = (AdConfig) config;
            tn.p.k(adConfig, "adConfig");
            if (a02.f25125a.get()) {
                if (adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                a02.f25125a.set(false);
                p000do.l0 l0Var = E0.f25357f;
                if (l0Var != null) {
                    kotlinx.coroutines.d.d(l0Var, new CancellationException("Shutdown"));
                }
                E0.f25357f = null;
                return;
            }
            if (!adConfig.getAdQuality().getEnabled() || a02.f25125a.get()) {
                return;
            }
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(AdConfig.class, "clazz");
            if (((AdConfig) Y3.f26611a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                a02.a();
            }
        }
    }
}
