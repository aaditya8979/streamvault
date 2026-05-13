package com.mbridge.msdk.config.component.model;

import android.text.TextUtils;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.impl.A2;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ModelCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f36270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f36271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f36272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36273l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f36274m;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strValueOf = String.valueOf(ModelCpt.this.f36274m);
            Map<String, Object> mapD = (strValueOf.startsWith("SELECT") || strValueOf.startsWith("select")) ? com.mbridge.msdk.config.component.database.a.a().d(strValueOf) : (strValueOf.startsWith("DELETE") || strValueOf.startsWith("delete")) ? com.mbridge.msdk.config.component.database.a.a().a(strValueOf) : com.mbridge.msdk.config.component.database.a.a().c(strValueOf);
            Object obj = mapD.get("code");
            if ((obj instanceof Integer ? ((Integer) obj).intValue() : 0) == 1) {
                ModelCpt.this.a(true, "", mapD.get("data"));
            } else {
                ModelCpt.this.a(false, String.valueOf(mapD.get("reason")), (Object) null);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ModelCpt.this.f36271j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        com.mbridge.msdk.config.component.common.util.b.a(c.n().d()).b(str, String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, String str, Object obj) {
        HashMap map = new HashMap();
        map.put("result", Integer.valueOf(z10 ? 1 : 2));
        map.put("code", "");
        map.put("reason", str);
        if (obj != null) {
            map.put("data", obj);
        }
        a(a("914002", map));
    }

    private void g() {
        if (TextUtils.isEmpty(this.f36274m)) {
            return;
        }
        a aVar = new a();
        if (this.f36273l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    private void h() {
        Map<String, Object> map = this.f36270i;
        if (map == null || this.f35754d == null || this.f36271j == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = (String) map.get(C3978d4.j.D);
        if (TextUtils.isEmpty(str)) {
            a(false, "Scope name is empty", (Object) null);
            return;
        }
        String str2 = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : this.f36271j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !C3978d4.j.D.equals(entry.getKey())) {
                    try {
                        String key = entry.getKey();
                        String str3 = str + "." + key;
                        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = com.mbridge.msdk.config.global.a.a(this.f35754d, str3);
                        if (aVarA == null) {
                            continue;
                        } else if (aVarA.a(str3, key, entry.getValue()).intValue() == 1) {
                            z10 = true;
                        }
                    } catch (Exception e10) {
                        str2 = "Failed to modify data in scope: " + e10.getMessage();
                        q0.b("ModelModifierComponent", str2);
                    }
                }
            }
            a(z10, str2, (Object) null);
            return;
        }
    }

    private void i() {
        Map<String, Object> map;
        if (this.f36270i == null || this.f35754d == null || (map = this.f36271j) == null) {
            a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = "";
        while (true) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    try {
                        z10 = this.f35754d.a(entry.getKey(), entry.getValue()).intValue() == 1;
                        if (!z10) {
                            str = "Failed to modify data";
                        }
                    } catch (Exception e10) {
                        str = "Failed to modify data without scope: " + e10.getMessage();
                        q0.b("ModelModifierComponent", str);
                    }
                }
            }
            a(z10, str, (Object) null);
            return;
        }
    }

    private void j() {
        b bVar = new b();
        if (this.f36273l == 1) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "914001";
        this.f36270i = map;
        if (map.isEmpty()) {
            q0.b("ModelModifierComponent", "Config parameters is null");
            return;
        }
        this.f36269h = map.containsKey(C3978d4.j.D) ? "withScope" : "withoutScope";
        Object obj = map.get("modifier_config");
        if (obj instanceof Map) {
            this.f36271j = (Map) obj;
        }
        Object obj2 = map.get("type");
        if (obj2 != null) {
            this.f36272k = String.valueOf(obj2);
        }
        Object obj3 = map.get(A2.f64965g);
        if (obj3 != null) {
            this.f36273l = Integer.parseInt(String.valueOf(obj3));
        }
        Object obj4 = map.get("expression");
        if (obj4 != null) {
            this.f36274m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        try {
            if ("db".equals(this.f36272k)) {
                g();
            } else if ("user_default".equals(this.f36272k)) {
                j();
            } else if (this.f36269h.equals("withScope")) {
                h();
            } else {
                i();
            }
        } catch (Exception e10) {
            q0.b("ModelModifierComponent", "Error during execution: " + e10.getMessage());
            a(false, "Execution failed: " + e10.getMessage(), (Object) null);
        }
    }
}
