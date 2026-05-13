package com.mbridge.msdk.config.component.status;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class StatusCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f36347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static e f36348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static d f36349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static a f36350n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36351h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, Object> f36352i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, Object> f36353j = null;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.mbridge.msdk.config.component.base.b bVar) {
        String strC = bVar.c();
        strC.hashCode();
        switch (strC) {
            case "916002":
                String strValueOf = String.valueOf(bVar.b().get("networkType"));
                if (!TextUtils.isEmpty(this.f36351h)) {
                    if (!this.f36351h.equals(strValueOf)) {
                        this.f36351h = strValueOf;
                        a(a(bVar.c(), bVar.b()));
                        break;
                    }
                } else {
                    this.f36351h = strValueOf;
                    break;
                }
                break;
            case "916003":
            case "916004":
            case "916005":
            case "916006":
                a(a(bVar.c(), bVar.b()));
                break;
        }
    }

    private boolean c(String str) {
        Object obj = this.f36352i.get(str);
        if (obj instanceof Map) {
            return String.valueOf(((Map) obj).get(CrashEvent.f52788e)).equals("1");
        }
        return false;
    }

    private boolean d(String str) {
        Object obj;
        Object obj2 = this.f36352i.get(str);
        if (!(obj2 instanceof Map) || (obj = ((Map) obj2).get(CrashEvent.f52788e)) == null) {
            return false;
        }
        String strValueOf = String.valueOf(obj);
        return strValueOf.equals("1") || strValueOf.equals("0");
    }

    private void g() {
        boolean zC = c("916002");
        boolean zC2 = c("916005");
        boolean z10 = c("916004") || c("916003");
        boolean zC3 = c("916006");
        if (zC || zC2 || z10 || zC3) {
            return;
        }
        f36350n = null;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "916001";
        if (map == null) {
            return;
        }
        this.f36353j = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f36352i = map;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        String strValueOf;
        List<String> list;
        super.d();
        Map<String, Object> map = this.f36352i;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (f36350n == null) {
            f36350n = new a() { // from class: com.mbridge.msdk.config.component.status.f
                @Override // com.mbridge.msdk.config.component.status.a
                public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                    this.f36378a.c(bVar);
                }
            };
        }
        if (d("916002")) {
            if (!c("916002")) {
                c cVar = f36347k;
                if (cVar != null) {
                    cVar.b(f36350n);
                    f36347k.d();
                }
                f36347k = null;
            } else if (f36347k == null) {
                c cVar2 = new c();
                f36347k = cVar2;
                cVar2.a(f36350n);
            }
        }
        if (d("916003") || d("916004")) {
            if (c("916003") || c("916004")) {
                b bVar = com.mbridge.msdk.foundation.controller.a.f37356s;
                if (bVar != null) {
                    bVar.a(f36350n);
                }
            } else {
                b bVar2 = com.mbridge.msdk.foundation.controller.a.f37356s;
                if (bVar2 != null) {
                    bVar2.b(f36350n);
                }
            }
        }
        if (d("916005")) {
            if (!c("916005")) {
                e eVar = f36348l;
                if (eVar != null) {
                    eVar.b(f36350n);
                    f36348l.d();
                }
                f36348l = null;
            } else if (f36348l == null) {
                e eVar2 = new e();
                f36348l = eVar2;
                eVar2.a(f36350n);
            }
        }
        if (d("916006")) {
            Map<String, Object> map2 = this.f36353j;
            if (map2 != null) {
                Object obj = map2.get(DownloadModel.FILE_NAME);
                if (obj == null) {
                    obj = "";
                }
                strValueOf = String.valueOf(obj);
                list = (this.f36353j.containsKey("key_list") && (this.f36353j.get("key_list") instanceof List)) ? (List) this.f36353j.get("key_list") : null;
            } else {
                strValueOf = null;
                list = null;
            }
            if (!c("916006")) {
                d dVar = f36349m;
                if (dVar != null) {
                    dVar.b(f36350n);
                }
                f36349m = null;
            } else if (f36349m == null) {
                d dVar2 = new d(strValueOf);
                f36349m = dVar2;
                dVar2.a(list);
                f36349m.a(f36350n);
            }
        }
        g();
    }
}
