package mm;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BlockingObservableNext.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl.p<T> f74375b;

    /* JADX INFO: compiled from: BlockingObservableNext.java */
    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T> f74376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xl.p<T> f74377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74379e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74380f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Throwable f74381g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74382h;

        public a(xl.p<T> pVar, b<T> bVar) {
            this.f74377c = pVar;
            this.f74376b = bVar;
        }

        public final boolean a() {
            if (!this.f74382h) {
                this.f74382h = true;
                this.f74376b.c();
                new y0(this.f74377c).subscribe(this.f74376b);
            }
            try {
                xl.j<T> jVarD = this.f74376b.d();
                if (jVarD.h()) {
                    this.f74380f = false;
                    this.f74378d = jVarD.e();
                    return true;
                }
                this.f74379e = false;
                if (jVarD.f()) {
                    return false;
                }
                Throwable thD = jVarD.d();
                this.f74381g = thD;
                throw ExceptionHelper.d(thD);
            } catch (InterruptedException e10) {
                this.f74376b.dispose();
                this.f74381g = e10;
                throw ExceptionHelper.d(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f74381g;
            if (th2 != null) {
                throw ExceptionHelper.d(th2);
            }
            if (this.f74379e) {
                return !this.f74380f || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f74381g;
            if (th2 != null) {
                throw ExceptionHelper.d(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f74380f = true;
            return this.f74378d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* JADX INFO: compiled from: BlockingObservableNext.java */
    public static final class b<T> extends sm.c<xl.j<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BlockingQueue<xl.j<T>> f74383c = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f74384d = new AtomicInteger();

        @Override // xl.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(xl.j<T> jVar) {
            if (this.f74384d.getAndSet(0) == 1 || !jVar.h()) {
                while (!this.f74383c.offer(jVar)) {
                    xl.j<T> jVarPoll = this.f74383c.poll();
                    if (jVarPoll != null && !jVarPoll.h()) {
                        jVar = jVarPoll;
                    }
                }
            }
        }

        public void c() {
            this.f74384d.set(1);
        }

        public xl.j<T> d() throws InterruptedException {
            c();
            qm.c.b();
            return this.f74383c.take();
        }

        @Override // xl.r
        public void onComplete() {
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            tm.a.s(th2);
        }
    }

    public d(xl.p<T> pVar) {
        this.f74375b = pVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f74375b, new b());
    }
}
