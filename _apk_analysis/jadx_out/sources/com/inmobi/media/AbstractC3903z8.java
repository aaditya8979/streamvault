package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3903z8 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", Ki.a());
            C3746t1 c3746t1 = AbstractC3915zk.f28663a;
            Boolean bool = c3746t1 != null ? c3746t1.f28163c : null;
            if (bool != null) {
                map.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            map.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            Qi.f26188a.getClass();
            HashMap map2 = new HashMap();
            if (Qi.f26192e && (str = Qi.f26191d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
            return map;
        } catch (Exception e10) {
            tn.p.j("z8", "TAG");
            e10.getMessage();
            return map;
        }
    }
}
