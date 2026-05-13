package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3442gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3696r1 f27247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27252f;

    public C3442gk(C3696r1 c3696r1, String str, String str2, String str3, String str4) {
        tn.p.k(str4, "markupType");
        this.f27247a = c3696r1;
        this.f27248b = str;
        this.f27249c = str2;
        this.f27250d = str3;
        this.f27251e = str4;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3696r1 c3696r1 = this.f27247a;
        if (c3696r1 != null) {
            linkedHashMap.put("adType", c3696r1.f28013a.l());
        }
        C3696r1 c3696r12 = this.f27247a;
        if (c3696r12 != null) {
            linkedHashMap.put("plId", Long.valueOf(c3696r12.f28013a.f27516l.f28301a));
        }
        C3696r1 c3696r13 = this.f27247a;
        if (c3696r13 != null && (str = c3696r13.f28013a.f27516l.f28306f) != null) {
            linkedHashMap.put("plType", str);
        }
        C3696r1 c3696r14 = this.f27247a;
        String str2 = null;
        if (c3696r14 != null) {
            AdSet adSetR = c3696r14.f28013a.r();
            Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.isRewarded()) : null;
            if (boolValueOf != null) {
                linkedHashMap.put("isRewarded", boolValueOf);
            }
        }
        String str3 = this.f27249c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.f27248b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.f27251e);
        String str5 = this.f27252f;
        if (str5 != null) {
            str2 = str5;
        } else {
            tn.p.C("triggerSource");
        }
        linkedHashMap.put("trigger", str2);
        C3696r1 c3696r15 = this.f27247a;
        if (c3696r15 != null && c3696r15.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f27247a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C3467hk c3467hk;
        AtomicBoolean atomicBoolean;
        C3696r1 c3696r1 = this.f27247a;
        if (c3696r1 == null || (c3467hk = c3696r1.f28014b) == null || (atomicBoolean = c3467hk.f27311a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C3850x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.f27250d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f26549a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3287ak.f26805a);
        }
    }

    public final void c() {
        C3467hk c3467hk;
        AtomicBoolean atomicBoolean;
        C3696r1 c3696r1 = this.f27247a;
        if (c3696r1 == null || (c3467hk = c3696r1.f28014b) == null || (atomicBoolean = c3467hk.f27311a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C3850x5.m());
            linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.f27250d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj2 = Wj.f26549a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3287ak.f26805a);
        }
    }
}
