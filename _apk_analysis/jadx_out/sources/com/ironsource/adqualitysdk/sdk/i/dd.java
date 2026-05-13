package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
public final class dd extends cz {
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m5943(List<Object> list) {
        return kc.m6936((String) cz.m5927(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m5944(List<Object> list) {
        String str = (String) cz.m5927(list, 0, String.class);
        return list.get(1) instanceof String ? kc.m6943(str, (String) cz.m5927(list, 1, String.class)) : kc.m6944(str, new JSONArray((Collection) cz.m5927(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m5945(List<Object> list) {
        return kc.m6942((String) cz.m5927(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m5946(List<Object> list) {
        return hu.m6425().m6427().m6530(cz.m5927(list, 0, Object.class), (List<String>) cz.m5927(list, 1, List.class), ((Integer) cz.m5927(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m5947(List<Object> list) {
        String str = (String) cz.m5927(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) cz.m5927(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? kc.m6937(str, (String) cz.m5927(list, 1, String.class), zBooleanValue) : kc.m6946(str, new JSONArray((Collection) cz.m5927(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int m5948(List<Object> list) {
        return kc.m6935((String) cz.m5927(list, 0, String.class), (String) cz.m5927(list, 1, String.class));
    }
}
