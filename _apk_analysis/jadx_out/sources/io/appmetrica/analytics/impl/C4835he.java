package io.appmetrica.analytics.impl;

import com.ironsource.C3996e4;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4835he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f66917a;

    public C4835he() {
        HashMap map = new HashMap();
        this.f66917a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", "h");
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", "pc");
        map.put("retry_policy", "rp");
        map.put("cache_control", "cc");
        map.put(C3996e4.f31525c, "at");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f66917a.containsKey(str) ? (String) this.f66917a.get(str) : str;
    }
}
