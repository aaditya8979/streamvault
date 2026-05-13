package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes4.dex */
public final class A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gb f64966a;

    public A4() {
        this(C5009oa.k().l());
    }

    public A4(Gb gb2) {
        this.f64966a = gb2;
    }

    public static F4 a(C5252y4 c5252y4) {
        return new F4(new D4(c5252y4), c5252y4);
    }

    public final C4972mn a(C5252y4 c5252y4, Bm bm2) {
        C4972mn c4972mn = new C4972mn(c5252y4, new Jg(bm2));
        Gb gb2 = this.f64966a;
        synchronized (gb2) {
            gb2.f65279c.add(c4972mn);
        }
        return c4972mn;
    }
}
