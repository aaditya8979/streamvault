package mm;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BlockingObservableMostRecent.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl.p<T> f74356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f74357c;

    /* JADX INFO: compiled from: BlockingObservableMostRecent.java */
    public static final class a<T> extends sm.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Object f74358c;

        /* JADX INFO: renamed from: mm.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BlockingObservableMostRecent.java */
        public final class C0881a implements Iterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f74359b;

            public C0881a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f74359b = a.this.f74358c;
                return !NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f74359b == null) {
                        this.f74359b = a.this.f74358c;
                    }
                    if (NotificationLite.isComplete(this.f74359b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f74359b)) {
                        throw ExceptionHelper.d(NotificationLite.getError(this.f74359b));
                    }
                    return (T) NotificationLite.getValue(this.f74359b);
                } finally {
                    this.f74359b = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public a(T t10) {
            this.f74358c = NotificationLite.next(t10);
        }

        public a<T>.C0881a b() {
            return new C0881a();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74358c = NotificationLite.complete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74358c = NotificationLite.error(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74358c = NotificationLite.next(t10);
        }
    }

    public c(xl.p<T> pVar, T t10) {
        this.f74356b = pVar;
        this.f74357c = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f74357c);
        this.f74356b.subscribe(aVar);
        return aVar.b();
    }
}
