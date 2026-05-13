package com.mbridge.msdk.config.component.vc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.ironsource.C3978d4;
import com.ironsource.C4157n2;
import com.mbridge.msdk.config.activity.MBRewardVideoActivity;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class VCCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static ConcurrentHashMap<String, VCCpt> f36413l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f36414h = "1200001";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f36415i = "1200002";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f36416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.vc.model.a f36417k;

    public static class b implements com.mbridge.msdk.config.activity.lifecycle.a, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36418a;

        private b() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a() {
            VCCpt vCCpt;
            if (VCCpt.f36413l == null || VCCpt.f36413l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f36413l.get(this.f36418a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902006", new HashMap()));
            vCCpt.c("onStop");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void a(ViewGroup viewGroup) {
            VCCpt vCCpt;
            if (VCCpt.f36413l == null || VCCpt.f36413l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f36413l.get(this.f36418a)) == null) {
                return;
            }
            Object objB = vCCpt.f35754d.b("sdk_context");
            if (objB instanceof Map) {
                ((Map) objB).put("rootView", viewGroup);
            } else {
                HashMap map = new HashMap();
                map.put("rootView", viewGroup);
                vCCpt.f35754d.a("sdk_context", map);
            }
            vCCpt.a(vCCpt.a("902002", new HashMap()));
            vCCpt.a(vCCpt.a("902003", new HashMap()));
        }

        public void a(String str) {
            this.f36418a = str;
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void b() {
            VCCpt vCCpt;
            if (VCCpt.f36413l == null || VCCpt.f36413l.isEmpty() || (vCCpt = (VCCpt) VCCpt.f36413l.get(this.f36418a)) == null) {
                return;
            }
            vCCpt.a(vCCpt.a("902007", new HashMap()));
            vCCpt.c(C3978d4.i.f31366u0);
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void c() {
            if (VCCpt.f36413l == null || VCCpt.f36413l.isEmpty() || ((VCCpt) VCCpt.f36413l.get(this.f36418a)) == null) {
                return;
            }
            q0.b("RenderViewComponent", "onBackPressed clicked");
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void e() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void f() {
        }

        @Override // com.mbridge.msdk.config.activity.lifecycle.a
        public void onStart() {
        }
    }

    private void a(String str, String str2) {
        a("902008", str, str2);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f35754d;
        if (aVar == null) {
            return;
        }
        Object objB = aVar.b("sdk_context");
        try {
            if (objB instanceof Map) {
                Object obj = ((Map) objB).get("lifecycleListeners");
                if (obj instanceof List) {
                    List<com.mbridge.msdk.config.component.vc.inter.a> list = (List) obj;
                    synchronized (list) {
                        for (com.mbridge.msdk.config.component.vc.inter.a aVar2 : list) {
                            if (aVar2 != null) {
                                aVar2.a(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("RenderViewComponent", th2.getMessage(), th2);
        }
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        Object objB = this.f35754d.b("sdk_context");
        if (objB instanceof Map) {
            ((Map) objB).put("lifecycleListeners", arrayList);
            return;
        }
        HashMap map = new HashMap();
        map.put("lifecycleListeners", arrayList);
        this.f35754d.a("sdk_context", map);
    }

    private void i() {
        a(a("902005", new HashMap()));
        k();
        if (e() == null || !(e().getContext() instanceof Activity)) {
            return;
        }
        ((Activity) e().getContext()).finish();
    }

    private void j() {
        String strA = this.f36417k.a();
        if (TextUtils.isEmpty(strA)) {
            a("1200001", "Input parameter error");
            return;
        }
        byte b10 = -1;
        try {
            int iHashCode = strA.hashCode();
            if (iHashCode != 3529469) {
                if (iHashCode == 94756344 && strA.equals("close")) {
                    b10 = 1;
                }
            } else if (strA.equals(C4157n2.f33013v)) {
                b10 = 0;
            }
            if (b10 == 0) {
                l();
            } else {
                if (b10 != 1) {
                    return;
                }
                i();
            }
        } catch (Exception e10) {
            q0.b("RenderViewComponent", "Error in doRenderTemplateAction", e10);
            a("1200002", "Root view render fail");
        }
    }

    private void k() {
        try {
            Object objB = this.f35754d.b("sdk_context");
            if (objB instanceof Map) {
                Map map = (Map) objB;
                Object obj = map.get("lifecycleListeners");
                if (obj instanceof List) {
                    ((List) obj).clear();
                }
                Object obj2 = map.get("component_cache");
                if (obj2 instanceof Map) {
                    ((Map) obj2).clear();
                }
            }
            ConcurrentHashMap<String, VCCpt> concurrentHashMap = f36413l;
            if (concurrentHashMap != null) {
                concurrentHashMap.remove(this.f36416j);
                if (f36413l.isEmpty()) {
                    f36413l = null;
                }
            }
        } catch (Throwable th2) {
            q0.b("RenderViewComponent", th2.getMessage(), th2);
        }
    }

    private void l() {
        h();
        Intent intent = new Intent(c.n().d(), (Class<?>) MBRewardVideoActivity.class);
        intent.putExtra("hide_status_bar", this.f36417k.c());
        intent.putExtra("modal", this.f36417k.d());
        intent.putExtra("width", this.f36417k.f());
        intent.putExtra("height", this.f36417k.b());
        intent.putExtra("orientation", this.f36417k.e());
        b bVar = new b();
        bVar.a(this.f36416j);
        intent.putExtra("lifecycleCallbackByActivity", bVar);
        try {
            if (c.n() != null && c.n().f() != null) {
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) c.n().f(), intent);
                return;
            }
        } catch (Throwable th2) {
            q0.b("RenderViewComponent", th2.getMessage());
        }
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(c.n().d(), intent);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53141o);
        activity.startActivity(intent);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, g.f53141o);
        context.startActivity(intent);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "902001";
        this.f36417k = new com.mbridge.msdk.config.component.vc.model.a(map);
        f36413l = new ConcurrentHashMap<>();
        String string = UUID.randomUUID().toString();
        this.f36416j = string;
        f36413l.put(string, this);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        j();
    }
}
