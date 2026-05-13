package io.reactivex.internal.util;

import ms.c;
import tm.a;
import xl.b;
import xl.f;
import xl.h;
import xl.r;
import xl.u;

/* JADX INFO: loaded from: classes9.dex */
public enum EmptyComponent implements f<Object>, r<Object>, h<Object>, u<Object>, b, c, bm.b {
    INSTANCE;

    public static <T> r<T> asObserver() {
        return INSTANCE;
    }

    public static <T> ms.b<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // ms.c
    public void cancel() {
    }

    @Override // bm.b
    public void dispose() {
    }

    @Override // bm.b
    public boolean isDisposed() {
        return true;
    }

    @Override // ms.b
    public void onComplete() {
    }

    @Override // ms.b
    public void onError(Throwable th2) {
        a.s(th2);
    }

    @Override // ms.b
    public void onNext(Object obj) {
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        bVar.dispose();
    }

    @Override // xl.f, ms.b
    public void onSubscribe(c cVar) {
        cVar.cancel();
    }

    @Override // xl.h
    public void onSuccess(Object obj) {
    }

    @Override // ms.c
    public void request(long j10) {
    }
}
