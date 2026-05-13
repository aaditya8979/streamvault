package mm;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableFromIterable.java */
/* JADX INFO: loaded from: classes8.dex */
public final class l0<T> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<? extends T> f74526b;

    /* JADX INFO: compiled from: ObservableFromIterable.java */
    public static final class a<T> extends hm.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<? extends T> f74528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f74529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74532g;

        public a(xl.r<? super T> rVar, Iterator<? extends T> it) {
            this.f74527b = rVar;
            this.f74528c = it;
        }

        public void a() {
            while (!isDisposed()) {
                try {
                    this.f74527b.onNext(fm.a.e(this.f74528c.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f74528c.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.f74527b.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        this.f74527b.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    cm.a.b(th3);
                    this.f74527b.onError(th3);
                    return;
                }
            }
        }

        @Override // gm.h
        public void clear() {
            this.f74531f = true;
        }

        @Override // bm.b
        public void dispose() {
            this.f74529d = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74529d;
        }

        @Override // gm.h
        public boolean isEmpty() {
            return this.f74531f;
        }

        @Override // gm.h
        public T poll() {
            if (this.f74531f) {
                return null;
            }
            if (!this.f74532g) {
                this.f74532g = true;
            } else if (!this.f74528c.hasNext()) {
                this.f74531f = true;
                return null;
            }
            return (T) fm.a.e(this.f74528c.next(), "The iterator returned a null value");
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f74530e = true;
            return 1;
        }
    }

    public l0(Iterable<? extends T> iterable) {
        this.f74526b = iterable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        try {
            Iterator<? extends T> it = this.f74526b.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(rVar);
                    return;
                }
                a aVar = new a(rVar, it);
                rVar.onSubscribe(aVar);
                if (aVar.f74530e) {
                    return;
                }
                aVar.a();
            } catch (Throwable th2) {
                cm.a.b(th2);
                EmptyDisposable.error(th2, rVar);
            }
        } catch (Throwable th3) {
            cm.a.b(th3);
            EmptyDisposable.error(th3, rVar);
        }
    }
}
