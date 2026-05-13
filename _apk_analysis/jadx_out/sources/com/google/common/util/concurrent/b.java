package com.google.common.util.concurrent;

import c8.i;
import java.util.concurrent.Executor;
import y7.l;

/* JADX INFO: compiled from: ForwardingListenableFuture.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b<V> extends c8.c<V> implements i<V> {

    /* JADX INFO: compiled from: ForwardingListenableFuture.java */
    public static abstract class a<V> extends b<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i<V> f23485c;

        public a(i<V> iVar) {
            this.f23485c = (i) l.m(iVar);
        }

        @Override // c8.c
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final i<V> g() {
            return this.f23485c;
        }
    }

    @Override // c8.i
    public void addListener(Runnable runnable, Executor executor) {
        delegate().addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: j */
    public abstract i<? extends V> delegate();
}
