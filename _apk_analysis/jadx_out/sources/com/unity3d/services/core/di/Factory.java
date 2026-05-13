package com.unity3d.services.core.di;

import bn.g;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: ServiceFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
final class Factory<T> implements g<T> {

    @NotNull
    private final a<T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public Factory(@NotNull a<? extends T> aVar) {
        p.k(aVar, "initializer");
        this.initializer = aVar;
    }

    @Override // bn.g
    public T getValue() {
        return this.initializer.invoke();
    }

    @Override // bn.g
    public boolean isInitialized() {
        return false;
    }
}
