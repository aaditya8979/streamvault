package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Pa {
    public static String a(String str) {
        return (str == null || str.length() == 0 || !bo.d0.c0(str, "://", false, 2, null)) ? "invalid" : bo.a0.U(str, "inmobideeplink://", true) ? "inmobideeplink" : bo.a0.U(str, "inmobinativebrowser://", true) ? "inmobinativebrowser" : bo.a0.U(str, "https://", true) ? "https" : bo.a0.U(str, "http://", true) ? "http" : bo.a0.U(str, "market://", true) ? "market" : "deeplink";
    }

    public static void a(Na na2, Ya ya2, Integer num, sn.p pVar) {
        tn.p.k(na2, "funnelState");
        if (ya2 == null || na2.f26030c <= ya2.f26631e) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", ya2.f26627a.f26698c);
        linkedHashMap.put("impressionId", ya2.f26627a.f26697b);
        linkedHashMap.put("plId", Long.valueOf(ya2.f26627a.f26696a));
        linkedHashMap.put("adType", ya2.f26627a.f26699d);
        linkedHashMap.put("markupType", ya2.f26627a.f26700e);
        linkedHashMap.put("creativeType", ya2.f26627a.f26701f);
        linkedHashMap.put("metadataBlob", ya2.f26627a.f26702g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(ya2.f26627a.f26703h));
        String str = ya2.f26632f;
        if (str == null) {
            str = ya2.f26627a.f26704i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", ya2.f26628b);
        if (num != null) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, num);
        }
        long j10 = ya2.f26630d;
        if (j10 != 0) {
            p000do.l0 l0Var = AbstractC3492il.f27361a;
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        }
        ya2.f26631e = na2.f26030c;
        p000do.i.d(A9.f25147c, null, null, new Oa(linkedHashMap, na2, null), 3, null);
        int i10 = ya2.f26629c;
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(TelemetryConfig.class, "clazz");
        if (i10 > ((TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || pVar == null) {
            return;
        }
        String str2 = na2.f26029b;
        String str3 = ya2.f26632f;
        if (str3 == null) {
            str3 = ya2.f26627a.f26704i;
        }
        pVar.mo2invoke(str2, kotlin.collections.a.m(bn.h.a("$OPENMODE", str3), bn.h.a("$URLTYPE", ya2.f26628b)));
    }
}
