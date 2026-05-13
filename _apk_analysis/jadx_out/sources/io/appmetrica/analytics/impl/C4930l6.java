package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4930l6 implements Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f67190a = new CopyOnWriteArrayList();

    public final void a() {
        this.f67190a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(@Nullable Throwable th2, @NotNull V v10) {
        Iterator it = this.f67190a.iterator();
        while (it.hasNext()) {
            ((Ga) it.next()).a(th2, v10);
        }
    }

    public final void a(@NotNull List<? extends Ga> list) {
        this.f67190a.addAll(list);
    }

    public final void a(@NotNull Ga... gaArr) {
        cn.b0.G(this.f67190a, gaArr);
    }
}
