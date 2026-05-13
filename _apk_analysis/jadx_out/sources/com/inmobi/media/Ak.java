package com.inmobi.media;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T9 f25172a;

    public Ak(T9 t92) {
        tn.p.k(t92, "mConfigIncludeIdMaskMap");
        this.f25172a = t92;
    }

    public final HashMap a() {
        C3746t1 c3746t1;
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            if (this.f25172a.a() && (c3746t1 = AbstractC3915zk.f28663a) != null && (str = c3746t1.f28162b) != null) {
                tn.p.h(str);
                map2.put("GPID", str);
            }
        } catch (Exception unused) {
            tn.p.j(Ak.class.getSimpleName(), "getSimpleName(...)");
        }
        String string = new JSONObject(map2).toString();
        tn.p.j(string, "toString(...)");
        map.put("u-id-map", string);
        return map;
    }
}
