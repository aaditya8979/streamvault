package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hr;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class da extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m5930(List<Object> list) {
        hr hrVar = (hr) cz.m5927(list, 1, hr.class);
        return list.get(0) instanceof Class ? hs.m6406((Class) cz.m5927(list, 0, Class.class), hrVar) : hs.m6406(cz.m5927(list, 0, Object.class).getClass(), hrVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<Method> m5931(List<Object> list) {
        hr hrVar = (hr) cz.m5927(list, 1, hr.class);
        return list.get(0) instanceof Class ? hs.m6408((Class) cz.m5927(list, 0, Class.class), hrVar) : hs.m6408(cz.m5927(list, 0, Object.class).getClass(), hrVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static hr.c m5932() {
        return new hr.c();
    }
}
