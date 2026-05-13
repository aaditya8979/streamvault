package com.unity3d.services.core.di;

import bn.g;
import org.jetbrains.annotations.NotNull;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: ServiceFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceFactoryKt {
    @NotNull
    public static final <T> g<T> factoryOf(@NotNull a<? extends T> aVar) {
        p.k(aVar, "initializer");
        return new Factory(aVar);
    }
}
