package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f68412a;

    public V(InterfaceC5305i interfaceC5305i) {
        this.f68412a = interfaceC5305i.a();
    }

    public final void a(C5308l c5308l) {
        for (T t10 : this.f68412a) {
            C5309m c5309m = null;
            if (c5308l != null) {
                C5308l c5308l2 = Boolean.valueOf(c5308l.f68458a).booleanValue() ? c5308l : null;
                if (c5308l2 != null) {
                    c5309m = c5308l2.f68459b;
                }
            }
            t10.a(c5309m);
        }
    }
}
