package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public abstract class T6 {
    public static final void a(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Iterator it = cn.w.p(Da.a("carb_store"), Da.a("aes_key_store"), Da.a("mraid_js_store"), Da.a("omid_js_store"), Da.a("user_info_store"), Da.a("coppa_store"), Da.a("gesture_info_store"), Da.a("display_info_store"), Da.a("unified_id_info_store"), Da.a("app_bundle_store"), Da.a("pub_signals_store"), Da.a("CrashSession-store")).iterator();
        while (it.hasNext()) {
            context.deleteSharedPreferences((String) it.next());
        }
    }

    public static final void a(File file) {
        tn.p.k(file, "path");
        try {
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    Iterator itA = tn.b.a(fileArrListFiles);
                    while (itA.hasNext()) {
                        File file2 = (File) itA.next();
                        if (file2.isDirectory()) {
                            tn.p.h(file2);
                            a(file2);
                        } else if (file2.delete()) {
                            tn.p.j("T6", "TAG");
                            file2.getName();
                        }
                    }
                }
                if (file.delete()) {
                    tn.p.j("T6", "TAG");
                    file.getName();
                }
            }
        } catch (Exception e10) {
            tn.p.j("T6", "TAG");
            e10.getMessage();
        }
    }
}
