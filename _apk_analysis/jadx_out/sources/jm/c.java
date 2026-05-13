package jm;

import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FlowableError.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c<T> extends xl.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends Throwable> f72492c;

    public c(Callable<? extends Throwable> callable) {
        this.f72492c = callable;
    }

    @Override // xl.e
    public void n(ms.b<? super T> bVar) {
        try {
            th = (Throwable) fm.a.e(this.f72492c.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            cm.a.b(th);
        }
        EmptySubscription.error(th, bVar);
    }
}
