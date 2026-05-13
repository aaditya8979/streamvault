package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3293b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f26820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3605n9 f26825f;

    public C3293b0(WeakReference weakReference, String str, boolean z10) {
        tn.p.k(weakReference, "adUnitEventListener");
        tn.p.k(str, "adtype");
        this.f26820a = weakReference;
        this.f26821b = str;
        this.f26822c = z10;
        this.f26823d = new AtomicBoolean(false);
        this.f26824e = String.valueOf(tn.t.b(C3293b0.class).getSimpleName());
    }

    public final void a(C3442gk c3442gk) {
        Gh gh2;
        C3467hk c3467hk;
        AtomicBoolean atomicBoolean;
        if (!this.f26823d.getAndSet(true)) {
            Qi qi2 = Qi.f26188a;
            String str = this.f26821b;
            Boolean boolValueOf = Boolean.valueOf(this.f26822c);
            qi2.getClass();
            Qi.a(str, boolValueOf);
            AbstractC3423g1 abstractC3423g1 = (AbstractC3423g1) this.f26820a.get();
            if (abstractC3423g1 != null) {
                abstractC3423g1.a(c3442gk);
            } else if (c3442gk != null) {
                c3442gk.b();
            }
            C3605n9 c3605n9 = this.f26825f;
            if (c3605n9 != null) {
                c3605n9.a(this.f26824e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C3605n9 c3605n92 = this.f26825f;
            if (c3605n92 == null || (gh2 = c3605n92.f27675a) == null) {
                return;
            }
            gh2.a();
            return;
        }
        C3605n9 c3605n93 = this.f26825f;
        if (c3605n93 != null) {
            c3605n93.c(this.f26824e, "skipping as Impression is already Called");
        }
        if (c3442gk != null) {
            C3696r1 c3696r1 = c3442gk.f27247a;
            if (c3696r1 == null || (c3467hk = c3696r1.f28014b) == null || (atomicBoolean = c3467hk.f27311a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c3442gk.a();
                linkedHashMapA.put("networkType", C3850x5.m());
                linkedHashMapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = c3442gk.f27250d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                Wj wj2 = Wj.f26549a;
                Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3287ak.f26805a);
            }
        }
    }
}
