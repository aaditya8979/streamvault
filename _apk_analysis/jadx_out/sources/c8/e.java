package c8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: Futures.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends g {

    /* JADX INFO: compiled from: Futures.java */
    public static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Future<V> f6513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d<? super V> f6514c;

        public a(Future<V> future, d<? super V> dVar) {
            this.f6513b = future;
            this.f6514c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f6513b;
            if ((future instanceof d8.a) && (thA = d8.b.a((d8.a) future)) != null) {
                this.f6514c.onFailure(thA);
                return;
            }
            try {
                this.f6514c.onSuccess(e.b(this.f6513b));
            } catch (ExecutionException e10) {
                this.f6514c.onFailure(e10.getCause());
            } catch (Throwable th2) {
                this.f6514c.onFailure(th2);
            }
        }

        public String toString() {
            return y7.g.b(this).h(this.f6514c).toString();
        }
    }

    public static <V> void a(i<V> iVar, d<? super V> dVar, Executor executor) {
        y7.l.m(dVar);
        iVar.addListener(new a(iVar, dVar), executor);
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        y7.l.u(future.isDone(), "Future was expected to be done: %s", future);
        return (V) o.a(future);
    }
}
