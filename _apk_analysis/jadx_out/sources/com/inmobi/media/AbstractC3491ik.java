package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3491ik {
    public static final Map a(G g10) {
        String creativeType;
        tn.p.k(g10, "<this>");
        Map mapO = kotlin.collections.a.o(bn.h.a("plId", Long.valueOf(g10.f25488a.f27823a.f25731a)), bn.h.a("plType", g10.f25488a.f27823a.f25737g), bn.h.a("adType", "native"), bn.h.a("markupType", g10.f25490c), bn.h.a("creativeId", "\"" + g10.f25492e + "\""), bn.h.a("impressionId", "\"" + g10.f25500m.f25408b + "\""), bn.h.a("isRewarded", Boolean.valueOf(g10.f25489b.f25281a)));
        MetaInfo metaInfo = g10.f25491d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mapO.put("creativeType", creativeType);
        }
        String str = g10.f25496i;
        if (str != null) {
            mapO.put("metadataBlob", str);
        }
        return mapO;
    }

    public static final Map a(C3647p1 c3647p1) {
        tn.p.k(c3647p1, "<this>");
        return kotlin.collections.a.o(bn.h.a("plId", Long.valueOf(c3647p1.f27823a.f25731a)), bn.h.a("plType", c3647p1.f27823a.f25737g), bn.h.a("adType", "native"));
    }
}
