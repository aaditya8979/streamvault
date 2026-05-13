package com.trello.rxlifecycle2;

import com.trello.rxlifecycle2.internal.Preconditions;
import io.reactivex.BackpressureStrategy;
import ms.a;
import xl.c;
import xl.e;
import xl.g;
import xl.i;
import xl.k;
import xl.p;
import xl.q;
import xl.t;
import xl.v;
import xl.w;

/* JADX INFO: loaded from: classes3.dex */
public final class LifecycleTransformer<T> implements q<T, T>, w<T, T> {
    public final k<?> observable;

    public LifecycleTransformer(k<?> kVar) {
        Preconditions.checkNotNull(kVar, "observable == null");
        this.observable = kVar;
    }

    public a<T> apply(e<T> eVar) {
        return eVar.o(this.observable.toFlowable(BackpressureStrategy.LATEST));
    }

    public c apply(xl.a aVar) {
        return xl.a.c(aVar, this.observable.flatMapCompletable(Functions.CANCEL_COMPLETABLE));
    }

    public i<T> apply(g<T> gVar) {
        return gVar.e(this.observable.firstElement());
    }

    @Override // xl.q
    public p<T> apply(k<T> kVar) {
        return kVar.takeUntil(this.observable);
    }

    @Override // xl.w
    public v<T> apply(t<T> tVar) {
        return tVar.p(this.observable.firstOrError());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LifecycleTransformer.class != obj.getClass()) {
            return false;
        }
        return this.observable.equals(((LifecycleTransformer) obj).observable);
    }

    public int hashCode() {
        return this.observable.hashCode();
    }

    public String toString() {
        return "LifecycleTransformer{observable=" + this.observable + '}';
    }
}
