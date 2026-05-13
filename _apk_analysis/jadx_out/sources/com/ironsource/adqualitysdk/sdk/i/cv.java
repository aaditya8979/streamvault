package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.ho;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class cv extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Field m5866(List<Object> list) {
        return hu.m6425().m6428().m6374((Class) cz.m5927(list, 0, Class.class), (String) cz.m5927(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static ho.a m5867() {
        hu.m6425().m6428();
        return hq.m6372();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field m5868(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM5927 = cz.m5927(list, 0, Object.class);
            return hu.m6425().m6428().m6376(objM5927.getClass(), (Class) cz.m5927(list, 1, Class.class));
        }
        Class cls = (Class) cz.m5927(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return hu.m6425().m6428().m6376(cls, (Class) cz.m5927(list, 1, Class.class));
        }
        return hu.m6425().m6428().m6375(cls, (ho) cz.m5927(list, 1, ho.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Field> m5869(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM5927 = cz.m5927(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) cz.m5927(list, 1, Boolean.class)).booleanValue() : false;
            hu.m6425().m6428();
            Field[] fieldArrM6371 = hq.m6371(objM5927.getClass(), zBooleanValue, -1, null);
            if (fieldArrM6371 != null) {
                return Arrays.asList(fieldArrM6371);
            }
        } else if (list.size() > 1) {
            return hu.m6425().m6428().m6377((Class) cz.m5927(list, 0, Class.class), (ho) cz.m5927(list, 1, ho.class));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Field m5870(List<Object> list) {
        return hu.m6425().m6428().m6375((Class) cz.m5927(list, 0, Class.class), (ho) cz.m5927(list, 1, ho.class));
    }
}
