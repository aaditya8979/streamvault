package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cd {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final HashMap<Class<?>, Class<?>> f12782lh;
    public static final Class<?>[] ouw;
    private static Map<String, Method> vt = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        f12782lh = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        ouw = new Class[0];
    }

    public static int ouw(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int ouw(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
