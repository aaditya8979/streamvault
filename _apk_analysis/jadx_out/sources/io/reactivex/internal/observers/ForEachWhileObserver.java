package io.reactivex.internal.observers;

import bm.b;
import dm.a;
import dm.g;
import dm.q;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -4403180040475402120L;
    public boolean done;
    public final a onComplete;
    public final g<? super Throwable> onError;
    public final q<? super T> onNext;

    public ForEachWhileObserver(q<? super T> qVar, g<? super Throwable> gVar, a aVar) {
        this.onNext = qVar;
        this.onError = gVar;
        this.onComplete = aVar;
    }

    @Override // bm.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // bm.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // xl.r
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        try {
            this.onComplete.run();
        } catch (Throwable th2) {
            cm.a.b(th2);
            tm.a.s(th2);
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (this.done) {
            tm.a.s(th2);
            return;
        }
        this.done = true;
        try {
            this.onError.accept(th2);
        } catch (Throwable th3) {
            cm.a.b(th3);
            tm.a.s(new CompositeException(th2, th3));
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (this.done) {
            return;
        }
        try {
            if (this.onNext.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            cm.a.b(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // xl.r
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
