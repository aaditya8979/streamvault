package yl;

import android.os.Looper;
import bm.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MainThreadDisposable.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements b {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    /* JADX INFO: renamed from: yl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MainThreadDisposable.java */
    public class RunnableC1112a implements Runnable {
        public RunnableC1112a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.onDispose();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    @Override // bm.b
    public final void dispose() {
        if (this.unsubscribed.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onDispose();
            } else {
                am.a.a().c(new RunnableC1112a());
            }
        }
    }

    @Override // bm.b
    public final boolean isDisposed() {
        return this.unsubscribed.get();
    }

    public abstract void onDispose();
}
