package com.google.common.util.concurrent;

import c8.i;
import com.google.common.util.concurrent.AbstractFuture;

/* JADX INFO: compiled from: SettableFuture.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d<V> extends AbstractFuture.i<V> {
    public static <V> d<V> I() {
        return new d<>();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean D(V v10) {
        return super.D(v10);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean E(Throwable th2) {
        return super.E(th2);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean G(i<? extends V> iVar) {
        return super.G(iVar);
    }
}
