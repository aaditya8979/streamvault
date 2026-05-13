package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class S4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f65864a = new CopyOnWriteArrayList();

    public final List<InterfaceC4799g4> a() {
        return this.f65864a;
    }

    public final void a(@NonNull InterfaceC4799g4 interfaceC4799g4) {
        this.f65864a.add(interfaceC4799g4);
    }

    public final void b(@NonNull InterfaceC4799g4 interfaceC4799g4) {
        this.f65864a.remove(interfaceC4799g4);
    }
}
