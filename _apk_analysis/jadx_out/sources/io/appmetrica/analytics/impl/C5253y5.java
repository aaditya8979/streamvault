package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5253y5 implements G8, T8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f68023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f68024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f68025c;

    public C5253y5(@NotNull M6 m62) {
        this.f68023a = m62;
        Set setJ = cn.w0.j(Integer.valueOf(EnumC4703cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC4703cb.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC4703cb.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC4703cb.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC4703cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC4703cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC4703cb.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC4703cb.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f68024b = setJ;
        this.f68025c = new AtomicLong(m62.a(setJ));
        m62.a(this);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a() {
        this.f68025c.set(this.f68023a.a(this.f68024b));
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a(@NotNull List<Integer> list) {
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f68024b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i10 = i10 + 1) < 0) {
                    cn.w.v();
                }
            }
        }
        this.f68025c.addAndGet(i10);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void b(@NotNull List<Integer> list) {
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f68024b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i10 = i10 + 1) < 0) {
                    cn.w.v();
                }
            }
        }
        this.f68025c.addAndGet(-i10);
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        return this.f68025c.get() > 0;
    }
}
