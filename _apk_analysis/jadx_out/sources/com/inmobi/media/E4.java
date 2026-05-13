package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class E4 implements InterfaceC3724s4 {
    @Override // com.inmobi.media.InterfaceC3724s4
    public final void a(Config config) {
        tn.p.k(config, "config");
        synchronized (this) {
            K4 k42 = K4.f25792a;
            tn.p.j("K4", "access$getTAG$p(...)");
            K4 k43 = K4.f25792a;
            String str = K4.f25797f;
            List<String> skipFields = K4.c().getContextualData().getSkipFields();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(L4.f25845j);
            arrayList.removeAll(skipFields);
            String strD0 = cn.f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
            K4.f25797f = strD0;
            if (!tn.p.f(strD0, str)) {
                k43.f();
            }
            K4.a();
            bn.r rVar = bn.r.f5635a;
        }
    }
}
