package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Da {
    public static Ea a(Context context, String str) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "fileKey");
        String strA = a(str);
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea ea2 = (Ea) concurrentHashMap.get(strA);
        if (ea2 == null) {
            ea2 = new Ea(context, strA);
            Ea ea3 = (Ea) concurrentHashMap.putIfAbsent(strA, ea2);
            if (ea3 != null) {
                return ea3;
            }
        }
        return ea2;
    }

    public static String a(String str) {
        tn.p.k(str, "fileKey");
        return "com.im.keyValueStore." + str;
    }
}
