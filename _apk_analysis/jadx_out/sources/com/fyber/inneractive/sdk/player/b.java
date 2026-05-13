package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f17094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f17095b;

    public b(t0 t0Var) {
        this.f17094a = t0Var;
    }

    public final a a() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        UnitDisplayType unitDisplayType;
        if (this.f17095b == null) {
            Application application = com.fyber.inneractive.sdk.util.o.f19548a;
            t0 t0Var2 = this.f17094a;
            com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var2.f16696b;
            s0 s0Var = t0Var2.f16698d;
            InneractiveAdRequest inneractiveAdRequest = t0Var2.f16695a;
            com.fyber.inneractive.sdk.measurement.e eVar = null;
            if (s0Var != null) {
                Boolean boolC = ((com.fyber.inneractive.sdk.config.global.features.l) t0Var2.f16697c.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c(com.ironsource.mediationsdk.metadata.a.f32685j);
                boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
                IAlog.a("OMSDK AB %s", String.valueOf(zBooleanValue));
                if (zBooleanValue && (t0Var = ((r0) this.f17094a.f16698d).f16098f) != null && ((unitDisplayType = t0Var.f16158j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                    eVar = IAConfigManager.O.K;
                }
            }
            this.f17095b = new n(application, gVar, s0Var, inneractiveAdRequest, t0Var2, eVar);
        }
        return this.f17095b;
    }
}
