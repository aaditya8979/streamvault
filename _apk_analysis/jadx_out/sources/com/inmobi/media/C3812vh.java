package com.inmobi.media;

import com.inmobi.media.C3812vh;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3812vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3271a4 f28371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bn.g f28372b;

    public C3812vh(C3271a4 c3271a4) {
        tn.p.k(c3271a4, "configDao");
        this.f28371a = c3271a4;
        this.f28372b = kotlin.b.b(new sn.a() { // from class: n9.qb
            @Override // sn.a
            public final Object invoke() {
                return C3812vh.a();
            }
        });
    }

    public static final Bh a() {
        return new Bh((C3779u9) He.f25607b.getValue());
    }

    public static final ArrayList a(C3812vh c3812vh) {
        C3575m4 c3575m4;
        C3575m4 c3575m42;
        C3575m4 c3575m43;
        C3575m4 c3575m44;
        C3575m4 c3575m45;
        ArrayList arrayList = new ArrayList();
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(RootConfig.class, "clazz");
        C3476i4 c3476i42 = Y3.f26611a;
        RootConfig rootConfig = (RootConfig) c3476i42.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            tn.p.k(RootConfig.class, "clazz");
            RootConfig rootConfig2 = (RootConfig) c3476i42.a(RootConfig.class);
            if (tn.p.f(RootConfig.class, RootConfig.class)) {
                c3575m45 = new C3575m4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                tn.p.k(RootConfig.class, "clazz");
                Config configA = c3476i42.a(RootConfig.class);
                c3575m45 = new C3575m4(rootConfig2.getUrlForType(configA.getType()), configA);
            }
            arrayList.add(c3575m45);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            tn.p.k(RootConfig.class, "clazz");
            RootConfig rootConfig3 = (RootConfig) c3476i42.a(RootConfig.class);
            if (tn.p.f(AdConfig.class, RootConfig.class)) {
                c3575m44 = new C3575m4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                tn.p.k(AdConfig.class, "clazz");
                Config configA2 = c3476i42.a(AdConfig.class);
                c3575m44 = new C3575m4(rootConfig3.getUrlForType(configA2.getType()), configA2);
            }
            arrayList.add(c3575m44);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            tn.p.k(RootConfig.class, "clazz");
            RootConfig rootConfig4 = (RootConfig) c3476i42.a(RootConfig.class);
            if (tn.p.f(TelemetryConfig.class, RootConfig.class)) {
                c3575m43 = new C3575m4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                tn.p.k(TelemetryConfig.class, "clazz");
                Config configA3 = c3476i42.a(TelemetryConfig.class);
                c3575m43 = new C3575m4(rootConfig4.getUrlForType(configA3.getType()), configA3);
            }
            arrayList.add(c3575m43);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            tn.p.k(RootConfig.class, "clazz");
            RootConfig rootConfig5 = (RootConfig) c3476i42.a(RootConfig.class);
            if (tn.p.f(SignalsConfig.class, RootConfig.class)) {
                c3575m42 = new C3575m4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                tn.p.k(SignalsConfig.class, "clazz");
                Config configA4 = c3476i42.a(SignalsConfig.class);
                c3575m42 = new C3575m4(rootConfig5.getUrlForType(configA4.getType()), configA4);
            }
            arrayList.add(c3575m42);
        }
        if (a(rootConfig, CrashConfig.class)) {
            tn.p.k(RootConfig.class, "clazz");
            RootConfig rootConfig6 = (RootConfig) c3476i42.a(RootConfig.class);
            if (tn.p.f(CrashConfig.class, RootConfig.class)) {
                c3575m4 = new C3575m4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                tn.p.k(CrashConfig.class, "clazz");
                Config configA5 = c3476i42.a(CrashConfig.class);
                c3575m4 = new C3575m4(rootConfig6.getUrlForType(configA5.getType()), configA5);
            }
            arrayList.add(c3575m4);
        }
        return arrayList;
    }

    public static boolean a(RootConfig rootConfig, Class cls) {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(cls, "clazz");
        Config configA = Y3.f26611a.a(cls);
        return configA == null || System.currentTimeMillis() - configA.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(AbstractC3749t4.a(cls));
    }
}
