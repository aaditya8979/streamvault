package com.ironsource;

import android.util.Log;
import com.ironsource.C4024fe;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class A8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static A8 f28730b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O5 f28731a;

    private A8() {
    }

    private static A8 a() {
        if (f28730b == null) {
            f28730b = new A8();
        }
        return f28730b;
    }

    public static void a(I5 i52, C4351y8 c4351y8) {
        if (i52 != null) {
            try {
                a().f28731a = new O5(i52, c4351y8);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public static void a(C4024fe.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C4024fe.a aVar, Map<String, Object> map) {
        O5 o52 = a().f28731a;
        if (o52 == null) {
            Log.d(G5.f29386a, G5.U);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f31733b));
        }
        o52.a(aVar.f31732a, map);
    }
}
