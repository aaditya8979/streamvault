package com.inmobi.media;

import com.inmobi.media.D4;
import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class D4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextData f25291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25293c = D4.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L4 f25294d = new L4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25295e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25296f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f25297g = new AtomicBoolean();

    public D4(ContextData contextData, long j10) {
        this.f25291a = contextData;
        this.f25292b = j10;
    }

    public static final void a(D4 d42) {
        K4 k42 = K4.f25792a;
        L4 l42 = d42.f25294d;
        tn.p.k(l42, "contextualDataModel");
        synchronized (k42) {
            tn.p.j("K4", "TAG");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long expiryTime = jCurrentTimeMillis - ((long) (K4.c().getContextualData().getExpiryTime() * 1000));
            K4.a(expiryTime, K4.c().getContextualData().getMaxAdRecords() - 1);
            String string = M4.a(l42, K4.c().getContextualData().getSkipFields()).toString();
            tn.p.j(string, "toString(...)");
            W5 w52 = new W5(X5.a(string, K4.f25796e), jCurrentTimeMillis);
            K4.f25794c.add(w52);
            Object objClone = K4.f25794c.clone();
            tn.p.i(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            K4.f25795d = (LinkedList) objClone;
            p000do.h.b(null, new I4(w52, expiryTime, null), 1, null);
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void a() {
        tn.p.j(this.f25293c, "TAG");
        ContextData contextData = this.f25291a;
        if (contextData != null) {
            K4.f25792a.a(contextData.getEnabled());
        }
        if (K4.e() && !this.f25296f.getAndSet(true)) {
            this.f25295e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.f25295e / ((long) 1000));
        }
    }

    public final void a(int i10) {
        if (this.f25297g.get()) {
            return;
        }
        this.f25294d.f25849d = i10;
        tn.p.j(this.f25293c, "TAG");
    }

    public final void a(long j10) {
        if (this.f25297g.get()) {
            return;
        }
        this.f25294d.f25848c = j10;
        tn.p.j(this.f25293c, "TAG");
    }

    public final void b() {
        if (!K4.e()) {
            tn.p.j(this.f25293c, "TAG");
            return;
        }
        if (!this.f25296f.get()) {
            tn.p.j(this.f25293c, "TAG");
            return;
        }
        a((int) (System.currentTimeMillis() - this.f25295e));
        if (this.f25297g.getAndSet(true)) {
            tn.p.j(this.f25293c, "TAG");
            return;
        }
        tn.p.j(this.f25293c, "TAG");
        Runnable runnable = new Runnable() { // from class: n9.j
            @Override // java.lang.Runnable
            public final void run() {
                D4.a(this.f75436b);
            }
        };
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.f25297g.get() || (contextData = this.f25291a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        L4 l42 = this.f25294d;
        l42.getClass();
        tn.p.k(advertisedContent, "<set-?>");
        l42.f25846a = advertisedContent;
        tn.p.j(this.f25293c, "TAG");
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.f25297g.get() || (contextData = this.f25291a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.f25294d.f25847b = bidderId.longValue();
        tn.p.j(this.f25293c, "TAG");
    }

    public final void e() {
        ContextData contextData;
        if (this.f25297g.get() || (contextData = this.f25291a) == null) {
            return;
        }
        this.f25294d.f25851f = contextData.getCasAdTypeId();
        tn.p.j(this.f25293c, "TAG");
    }

    public final void f() {
        if (this.f25297g.get()) {
            return;
        }
        this.f25294d.f25852g = 1;
        tn.p.j(this.f25293c, "TAG");
    }

    public final void g() {
        if (this.f25297g.get()) {
            return;
        }
        this.f25294d.f25854i = 1;
        tn.p.j(this.f25293c, "TAG");
    }

    public final void h() {
        if (this.f25297g.get()) {
            return;
        }
        this.f25294d.f25853h = 1;
        tn.p.j(this.f25293c, "TAG");
    }

    public final void i() {
        if (this.f25297g.get()) {
            return;
        }
        this.f25294d.f25850e = this.f25292b;
        tn.p.j(this.f25293c, "TAG");
    }
}
