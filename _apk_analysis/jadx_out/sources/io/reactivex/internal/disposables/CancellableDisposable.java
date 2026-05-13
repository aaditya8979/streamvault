package io.reactivex.internal.disposables;

import bm.b;
import cm.a;
import dm.f;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CancellableDisposable extends AtomicReference<f> implements b {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(f fVar) {
        super(fVar);
    }

    @Override // bm.b
    public void dispose() {
        f andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e10) {
            a.b(e10);
            tm.a.s(e10);
        }
    }

    @Override // bm.b
    public boolean isDisposed() {
        return get() == null;
    }
}
