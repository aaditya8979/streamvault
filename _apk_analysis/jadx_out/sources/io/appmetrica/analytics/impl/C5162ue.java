package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5162ue implements T8, InterfaceC5187ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f67783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f67784b;

    public C5162ue(@NotNull M6 m62) {
        this.f67783a = m62;
        this.f67784b = new AtomicLong(m62.b());
        m62.a(this);
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a() {
        this.f67784b.set(this.f67783a.b());
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void a(@NotNull List<Integer> list) {
        this.f67784b.addAndGet(list.size());
    }

    public final long b() {
        return this.f67784b.get();
    }

    @Override // io.appmetrica.analytics.impl.T8
    public final void b(@NotNull List<Integer> list) {
        this.f67784b.addAndGet(-list.size());
    }
}
