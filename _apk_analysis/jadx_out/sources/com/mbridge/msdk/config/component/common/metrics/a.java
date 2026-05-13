package com.mbridge.msdk.config.component.common.metrics;

import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: ComponentMetrics.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f35877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f35878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f35879c;

    /* JADX INFO: compiled from: ComponentMetrics.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35880a = new a();
    }

    private a() {
    }

    public static a a() {
        return b.f35880a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    private x b() {
        if (this.f35878b == null) {
            this.f35878b = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new f() { // from class: com.mbridge.msdk.config.component.common.metrics.c
                @Override // com.mbridge.msdk.tracker.f
                public final boolean a(e eVar) {
                    return a.a(eVar);
                }
            }).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().f37831d, 0)).a();
        }
        return this.f35878b;
    }

    private m c() {
        try {
            m mVar = this.f35877a;
            if (mVar == null) {
                m mVarB = m.b("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), b());
                this.f35877a = mVarB;
                if (mVarB != null) {
                    JSONObject jSONObject = this.f35879c;
                    if (jSONObject != null) {
                        mVarB.a(jSONObject);
                    }
                    this.f35877a.h();
                }
            } else {
                JSONObject jSONObject2 = this.f35879c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e10) {
            q0.b("ComponentMetrics", e10.getMessage());
        }
        return this.f35877a;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.f35878b = xVar;
            m mVar = this.f35877a;
            if (mVar != null) {
                mVar.a("metrics_component", com.mbridge.msdk.foundation.controller.c.n().d(), xVar);
            }
        }
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String strValueOf = String.valueOf(map.get("key"));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(strValueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th2) {
                q0.b("ComponentMetrics", th2.getMessage(), th2);
            }
        }
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.f35879c = new JSONObject(map);
            } catch (Exception e10) {
                q0.b("ComponentMetrics", e10.getMessage());
            }
        }
    }

    public void d() {
        if (this.f35877a == null) {
            this.f35877a = c();
        }
        this.f35877a.a();
    }
}
