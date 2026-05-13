package io.reactivex.internal.operators.single;

import bm.b;
import dm.o;
import fm.a;
import hm.n;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.t;
import xl.u;
import xl.v;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleResumeNext<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<? extends T> f71670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super Throwable, ? extends v<? extends T>> f71671b;

    public static final class ResumeMainSingleObserver<T> extends AtomicReference<b> implements u<T>, b {
        private static final long serialVersionUID = -5314538511045349925L;
        public final u<? super T> downstream;
        public final o<? super Throwable, ? extends v<? extends T>> nextFunction;

        public ResumeMainSingleObserver(u<? super T> uVar, o<? super Throwable, ? extends v<? extends T>> oVar) {
            this.downstream = uVar;
            this.nextFunction = oVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            try {
                ((v) a.e(this.nextFunction.apply(th2), "The nextFunction returned a null SingleSource.")).c(new n(this, this.downstream));
            } catch (Throwable th3) {
                cm.a.b(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // xl.u
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            this.downstream.onSuccess(t10);
        }
    }

    public SingleResumeNext(v<? extends T> vVar, o<? super Throwable, ? extends v<? extends T>> oVar) {
        this.f71670a = vVar;
        this.f71671b = oVar;
    }

    @Override // xl.t
    public void m(u<? super T> uVar) {
        this.f71670a.c(new ResumeMainSingleObserver(uVar, this.f71671b));
    }
}
