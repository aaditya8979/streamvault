package io.reactivex.internal.observers;

import bm.b;
import gm.c;
import gm.h;
import hm.i;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import qm.k;
import xl.r;

/* JADX INFO: loaded from: classes4.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<b> implements r<T>, b {
    private static final long serialVersionUID = -5417183359794346637L;
    public volatile boolean done;
    public int fusionMode;
    public final i<T> parent;
    public final int prefetch;
    public h<T> queue;

    public InnerQueuedObserver(i<T> iVar, int i10) {
        this.parent = iVar;
        this.prefetch = i10;
    }

    @Override // bm.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public int fusionMode() {
        return this.fusionMode;
    }

    @Override // bm.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // xl.r
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        this.parent.innerError(this, th2);
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t10);
        } else {
            this.parent.drain();
        }
    }

    @Override // xl.r
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            if (bVar instanceof c) {
                c cVar = (c) bVar;
                int iRequestFusion = cVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                    return;
                }
            }
            this.queue = k.b(-this.prefetch);
        }
    }

    public h<T> queue() {
        return this.queue;
    }

    public void setDone() {
        this.done = true;
    }
}
