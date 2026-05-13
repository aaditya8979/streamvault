package io.reactivex.internal.disposables;

import gm.c;
import xl.b;
import xl.h;
import xl.r;
import xl.u;

/* JADX INFO: loaded from: classes2.dex */
public enum EmptyDisposable implements c<Object> {
    INSTANCE,
    NEVER;

    public static void complete(b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void complete(h<?> hVar) {
        hVar.onSubscribe(INSTANCE);
        hVar.onComplete();
    }

    public static void complete(r<?> rVar) {
        rVar.onSubscribe(INSTANCE);
        rVar.onComplete();
    }

    public static void error(Throwable th2, b bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th2);
    }

    public static void error(Throwable th2, h<?> hVar) {
        hVar.onSubscribe(INSTANCE);
        hVar.onError(th2);
    }

    public static void error(Throwable th2, r<?> rVar) {
        rVar.onSubscribe(INSTANCE);
        rVar.onError(th2);
    }

    public static void error(Throwable th2, u<?> uVar) {
        uVar.onSubscribe(INSTANCE);
        uVar.onError(th2);
    }

    @Override // gm.h
    public void clear() {
    }

    @Override // bm.b
    public void dispose() {
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // gm.h
    public boolean isEmpty() {
        return true;
    }

    @Override // gm.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // gm.h
    public Object poll() throws Exception {
        return null;
    }

    @Override // gm.d
    public int requestFusion(int i10) {
        return i10 & 2;
    }
}
