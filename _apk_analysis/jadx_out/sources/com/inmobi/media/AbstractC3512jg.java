package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3512jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gi f27410a;

    static {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(TelemetryConfig.class, "clazz");
        f27410a = new Gi(((double) 1) - ((TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(String str, Map map) {
        tn.p.k(str, "eventType");
        tn.p.k(map, "keyValueMap");
        if (tn.p.f(str, "PingDBMaxLimitReached")) {
            Wj wj2 = Wj.f26549a;
            Wj.b(str, map, EnumC3287ak.f26805a);
            return;
        }
        if (f27410a.a()) {
            double d10 = 1;
            C3476i4 c3476i4 = Y3.f26611a;
            tn.p.k(TelemetryConfig.class, "clazz");
            C3476i4 c3476i42 = Y3.f26611a;
            double pingSamplingFactor = d10 - ((TelemetryConfig) c3476i42.a(TelemetryConfig.class)).getPingSamplingFactor();
            tn.p.k(TelemetryConfig.class, "clazz");
            map.put("samplingRate", Integer.valueOf((int) ((d10 - ((TelemetryConfig) c3476i42.a(TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * ((double) 100))));
            Wj wj3 = Wj.f26549a;
            Wj.b(str, map, EnumC3287ak.f26805a);
        }
    }
}
