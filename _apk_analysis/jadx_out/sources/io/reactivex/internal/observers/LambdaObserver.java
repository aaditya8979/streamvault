package io.reactivex.internal.observers;

import bm.b;
import dm.a;
import dm.g;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import xl.r;

/* JADX INFO: loaded from: classes4.dex */
public final class LambdaObserver<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -7251123623727029452L;
    public final a onComplete;
    public final g<? super Throwable> onError;
    public final g<? super T> onNext;
    public final g<? super b> onSubscribe;

    public LambdaObserver(g<? super T> gVar, g<? super Throwable> gVar2, a aVar, g<? super b> gVar3) {
        this.onNext = gVar;
        this.onError = gVar2;
        this.onComplete = aVar;
        this.onSubscribe = gVar3;
    }

    @Override // bm.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean hasCustomOnError() {
        return this.onError != Functions.f71329f;
    }

    @Override // bm.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // xl.r
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th2) {
            cm.a.b(th2);
            tm.a.s(th2);
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (isDisposed()) {
            tm.a.s(th2);
            return;
        }
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.onError.accept(th2);
        } catch (Throwable th3) {
            cm.a.b(th3);
            tm.a.s(new CompositeException(th2, th3));
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t10);
        } catch (Throwable th2) {
            cm.a.b(th2);
            get().dispose();
            onError(th2);
        }
    }

    @Override // xl.r
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th2) {
                cm.a.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }
}
