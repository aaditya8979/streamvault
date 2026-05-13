package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3310bh {
    public static final void a(AbstractC3284ah abstractC3284ah) {
        tn.p.k(abstractC3284ah, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (abstractC3284ah instanceof Xg) {
            linkedHashMap.put("trigger", ((Xg) abstractC3284ah).f26599a);
            Wj wj2 = Wj.f26549a;
            Wj.b("BillingClientConnectionError", linkedHashMap, EnumC3287ak.f26805a);
        } else if (abstractC3284ah instanceof Yg) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((Yg) abstractC3284ah).f26650a));
            Wj wj3 = Wj.f26549a;
            Wj.b("IAPFetchFailed", linkedHashMap, EnumC3287ak.f26805a);
        } else {
            if (!(abstractC3284ah instanceof Zg)) {
                throw new NoWhenBranchMatchedException();
            }
            Wj wj4 = Wj.f26549a;
            Wj.b("IAPFetchSuccess", linkedHashMap, EnumC3287ak.f26805a);
        }
    }
}
