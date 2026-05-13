package com.mbridge.msdk.advanced.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: MBNativeAdvancedWebViewCache.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f35355a = new HashMap();

    public static void a(String str, boolean z10) {
        f35355a.put(str, Boolean.valueOf(z10));
    }

    public static boolean a(String str) {
        if (f35355a.containsKey(str)) {
            return f35355a.get(str).booleanValue();
        }
        return false;
    }

    public static void b(String str) {
        f35355a.remove(str);
    }
}
