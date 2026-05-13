package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes7.dex */
public final class I1 implements wn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn.a f25630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f25632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25634e;

    public /* synthetic */ I1(Integer num, sn.a aVar, int i10) {
        this(num, aVar, (i10 & 4) == 0, false);
    }

    public I1(Object obj, sn.a aVar, boolean z10, boolean z11) {
        tn.p.k(aVar, "refreshLogic");
        this.f25630a = aVar;
        this.f25631b = z10;
        this.f25632c = obj;
        this.f25633d = new AtomicBoolean(false);
        if (z11) {
            a();
        }
    }

    public final void a() {
        if (this.f25633d.compareAndSet(false, true)) {
            this.f25634e = true;
            p000do.i.d(A9.f25147c, null, null, new H1(this, null), 3, null);
        }
    }

    public final Object getValue(Object obj, KProperty kProperty) {
        tn.p.k(kProperty, "property");
        if (this.f25631b || !this.f25634e) {
            a();
        }
        return this.f25632c;
    }
}
