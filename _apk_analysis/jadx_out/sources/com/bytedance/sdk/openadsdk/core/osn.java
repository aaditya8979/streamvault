package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class osn {
    private static volatile osn vt;
    public Map<String, Map<String, String>> ouw = new ConcurrentHashMap();

    private osn() {
    }

    public static osn ouw() {
        if (vt == null) {
            synchronized (osn.class) {
                if (vt == null) {
                    vt = new osn();
                }
            }
        }
        return vt;
    }

    public final void ouw(String str) {
        Map<String, Map<String, String>> map = this.ouw;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.ouw.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.ouw.remove(str);
        }
    }
}
