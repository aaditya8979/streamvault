package io.reactivex.internal.subscriptions;

import gm.e;
import ms.b;

/* JADX INFO: loaded from: classes12.dex */
public enum EmptySubscription implements e<Object> {
    INSTANCE;

    public static void complete(b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th2, b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th2);
    }

    @Override // ms.c
    public void cancel() {
    }

    @Override // gm.h
    public void clear() {
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
    public Object poll() {
        return null;
    }

    @Override // ms.c
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // gm.d
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }
}
