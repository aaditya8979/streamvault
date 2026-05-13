package com.mbridge.msdk.config.component.eac;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class EacCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.eac.model.a f35966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f35967i;

    private void a(Iterable<?> iterable, int i10) {
        int i11 = 0;
        for (Object obj : iterable) {
            Object objA = this.f35967i.a(this.f35966h.b(), this.f35754d);
            if (!(objA instanceof Integer) || ((Integer) objA).intValue() == 1) {
                Object objA2 = this.f35967i.a(this.f35966h.a(), this.f35754d);
                if ((objA2 instanceof Integer) && ((Integer) objA2).intValue() == 1) {
                    break;
                }
                HashMap map = new HashMap();
                map.put("count", i10 + "");
                if (obj != null) {
                    map.put("value", obj);
                }
                if (obj instanceof Map.Entry) {
                    map.put("key", ((Map.Entry) obj).getKey().toString());
                } else {
                    map.put("key", i11 + "");
                }
                a(a("921002", map));
            }
            i11++;
        }
        HashMap map2 = new HashMap();
        map2.put("count", Integer.valueOf(i10));
        a(a("921003", map2));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f35756f = "921001";
        this.f35966h = new com.mbridge.msdk.config.component.eac.model.a(map);
        this.f35967i = new d();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objC = this.f35966h.c();
        if (objC == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", "");
            map.put("reason", "iterationData is null");
            map.put("count", 0);
            a(a("921003", map));
            return;
        }
        if (objC instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objC;
            a(aVar.a(), aVar.e());
            return;
        }
        if (objC instanceof Map) {
            Map map2 = (Map) objC;
            a(map2.entrySet(), map2.size());
        } else {
            if (objC instanceof List) {
                List list = (List) objC;
                a(list, list.size());
                return;
            }
            Map<String, Object> map3 = new HashMap<>();
            map3.put("code", "");
            map3.put("reason", "iterationData type not match");
            map3.put("count", 0);
            a(a("921003", map3));
        }
    }
}
