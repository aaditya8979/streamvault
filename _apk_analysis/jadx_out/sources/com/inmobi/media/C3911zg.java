package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3911zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ea f28644a;

    public C3911zg(Context context, String str) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        this.f28644a = Da.a(context, str);
    }

    public final String a(String str) {
        tn.p.k(str, "key");
        Ea ea2 = this.f28644a;
        ea2.getClass();
        tn.p.k(str, "key");
        return ea2.f25373a.getString(str, null);
    }
}
