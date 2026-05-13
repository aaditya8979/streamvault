package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class H4 implements InterfaceC3724s4 {
    @Override // com.inmobi.media.InterfaceC3724s4
    public final void a(Config config) {
        tn.p.k(config, "config");
        synchronized (this) {
            K4 k42 = K4.f25792a;
            tn.p.j("K4", "access$getTAG$p(...)");
            K4 k43 = K4.f25792a;
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(SignalsConfig.class, "clazz");
            C3476i4 c3476i42 = Y3.f26611a;
            K4.f25796e = X5.a(((SignalsConfig) c3476i42.a(SignalsConfig.class)).getAK());
            Context context = Ji.f25747a;
            if (context != null) {
                tn.p.j("K4", "TAG");
                ConcurrentHashMap concurrentHashMap = Ea.f25372b;
                Ea eaA = Da.a(context, "c_data_store");
                Context context2 = Ji.f25747a;
                int i10 = 1;
                if (context2 != null) {
                    Ea eaA2 = Da.a(context2, "c_data_store");
                    tn.p.k("akv", "key");
                    i10 = eaA2.f25373a.getInt("akv", 1);
                }
                tn.p.k(SignalsConfig.class, "clazz");
                if (((SignalsConfig) c3476i42.a(SignalsConfig.class)).getAKV() != i10) {
                    tn.p.j("K4", "TAG");
                    tn.p.k(SignalsConfig.class, "clazz");
                    eaA.a("akv", ((SignalsConfig) c3476i42.a(SignalsConfig.class)).getAKV(), false);
                    k43.f();
                }
            }
            bn.r rVar = bn.r.f5635a;
        }
    }
}
