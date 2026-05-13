package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3749t4 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class a(String str) {
        tn.p.k(str, "configType");
        switch (str.hashCode()) {
            case -60641721:
                if (str.equals("crashReporting")) {
                    return CrashConfig.class;
                }
                break;
            case 96432:
                if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return AdConfig.class;
                }
                break;
            case 3506402:
                if (str.equals("root")) {
                    return RootConfig.class;
                }
                break;
            case 780346297:
                if (str.equals("telemetry")) {
                    return TelemetryConfig.class;
                }
                break;
            case 2088265419:
                if (str.equals("signals")) {
                    return SignalsConfig.class;
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + str);
    }

    public static final String a(Class cls) {
        tn.p.k(cls, "clazz");
        if (tn.p.f(cls, RootConfig.class)) {
            return "root";
        }
        if (tn.p.f(cls, AdConfig.class)) {
            return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        }
        if (tn.p.f(cls, TelemetryConfig.class)) {
            return "telemetry";
        }
        if (tn.p.f(cls, SignalsConfig.class)) {
            return "signals";
        }
        if (tn.p.f(cls, CrashConfig.class)) {
            return "crashReporting";
        }
        throw new IllegalArgumentException("Type: " + cls);
    }
}
