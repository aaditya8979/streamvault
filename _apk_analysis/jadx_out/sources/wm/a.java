package wm;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import qm.a;
import xl.r;

/* JADX INFO: compiled from: BehaviorSubject.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a<T> extends c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f86450i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1090a[] f86451j = new C1090a[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1090a[] f86452k = new C1090a[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f86453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<C1090a<T>[]> f86454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReadWriteLock f86455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f86456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lock f86457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Throwable> f86458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f86459h;

    /* JADX INFO: renamed from: wm.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BehaviorSubject.java */
    public static final class C1090a<T> implements bm.b, a.InterfaceC0938a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super T> f86460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f86461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f86462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f86463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public qm.a<Object> f86464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f86465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f86466h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f86467i;

        public C1090a(r<? super T> rVar, a<T> aVar) {
            this.f86460b = rVar;
            this.f86461c = aVar;
        }

        public void a() {
            if (this.f86466h) {
                return;
            }
            synchronized (this) {
                if (this.f86466h) {
                    return;
                }
                if (this.f86462d) {
                    return;
                }
                a<T> aVar = this.f86461c;
                Lock lock = aVar.f86456e;
                lock.lock();
                this.f86467i = aVar.f86459h;
                Object obj = aVar.f86453b.get();
                lock.unlock();
                this.f86463e = obj != null;
                this.f86462d = true;
                if (obj == null || test(obj)) {
                    return;
                }
                b();
            }
        }

        public void b() {
            qm.a<Object> aVar;
            while (!this.f86466h) {
                synchronized (this) {
                    aVar = this.f86464f;
                    if (aVar == null) {
                        this.f86463e = false;
                        return;
                    }
                    this.f86464f = null;
                }
                aVar.d(this);
            }
        }

        public void c(Object obj, long j10) {
            if (this.f86466h) {
                return;
            }
            if (!this.f86465g) {
                synchronized (this) {
                    if (this.f86466h) {
                        return;
                    }
                    if (this.f86467i == j10) {
                        return;
                    }
                    if (this.f86463e) {
                        qm.a<Object> aVar = this.f86464f;
                        if (aVar == null) {
                            aVar = new qm.a<>(4);
                            this.f86464f = aVar;
                        }
                        aVar.c(obj);
                        return;
                    }
                    this.f86462d = true;
                    this.f86465g = true;
                }
            }
            test(obj);
        }

        @Override // bm.b
        public void dispose() {
            if (this.f86466h) {
                return;
            }
            this.f86466h = true;
            this.f86461c.e(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f86466h;
        }

        @Override // qm.a.InterfaceC0938a, dm.q
        public boolean test(Object obj) {
            return this.f86466h || NotificationLite.accept(obj, this.f86460b);
        }
    }

    public a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f86455d = reentrantReadWriteLock;
        this.f86456e = reentrantReadWriteLock.readLock();
        this.f86457f = reentrantReadWriteLock.writeLock();
        this.f86454c = new AtomicReference<>(f86451j);
        this.f86453b = new AtomicReference<>();
        this.f86458g = new AtomicReference<>();
    }

    public static <T> a<T> d() {
        return new a<>();
    }

    public boolean c(C1090a<T> c1090a) {
        C1090a<T>[] c1090aArr;
        C1090a[] c1090aArr2;
        do {
            c1090aArr = this.f86454c.get();
            if (c1090aArr == f86452k) {
                return false;
            }
            int length = c1090aArr.length;
            c1090aArr2 = new C1090a[length + 1];
            System.arraycopy(c1090aArr, 0, c1090aArr2, 0, length);
            c1090aArr2[length] = c1090a;
        } while (!androidx.compose.animation.core.a.a(this.f86454c, c1090aArr, c1090aArr2));
        return true;
    }

    public void e(C1090a<T> c1090a) {
        C1090a<T>[] c1090aArr;
        C1090a[] c1090aArr2;
        do {
            c1090aArr = this.f86454c.get();
            int length = c1090aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = -1;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (c1090aArr[i11] == c1090a) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c1090aArr2 = f86451j;
            } else {
                C1090a[] c1090aArr3 = new C1090a[length - 1];
                System.arraycopy(c1090aArr, 0, c1090aArr3, 0, i10);
                System.arraycopy(c1090aArr, i10 + 1, c1090aArr3, i10, (length - i10) - 1);
                c1090aArr2 = c1090aArr3;
            }
        } while (!androidx.compose.animation.core.a.a(this.f86454c, c1090aArr, c1090aArr2));
    }

    public void f(Object obj) {
        this.f86457f.lock();
        this.f86459h++;
        this.f86453b.lazySet(obj);
        this.f86457f.unlock();
    }

    public C1090a<T>[] g(Object obj) {
        AtomicReference<C1090a<T>[]> atomicReference = this.f86454c;
        C1090a<T>[] c1090aArr = f86452k;
        C1090a<T>[] andSet = atomicReference.getAndSet(c1090aArr);
        if (andSet != c1090aArr) {
            f(obj);
        }
        return andSet;
    }

    @Override // xl.r
    public void onComplete() {
        if (androidx.compose.animation.core.a.a(this.f86458g, null, ExceptionHelper.f71695a)) {
            Object objComplete = NotificationLite.complete();
            for (C1090a<T> c1090a : g(objComplete)) {
                c1090a.c(objComplete, this.f86459h);
            }
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        fm.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!androidx.compose.animation.core.a.a(this.f86458g, null, th2)) {
            tm.a.s(th2);
            return;
        }
        Object objError = NotificationLite.error(th2);
        for (C1090a<T> c1090a : g(objError)) {
            c1090a.c(objError, this.f86459h);
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        fm.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f86458g.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        f(next);
        for (C1090a<T> c1090a : this.f86454c.get()) {
            c1090a.c(next, this.f86459h);
        }
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        if (this.f86458g.get() != null) {
            bVar.dispose();
        }
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        C1090a<T> c1090a = new C1090a<>(rVar, this);
        rVar.onSubscribe(c1090a);
        if (c(c1090a)) {
            if (c1090a.f86466h) {
                e(c1090a);
                return;
            } else {
                c1090a.a();
                return;
            }
        }
        Throwable th2 = this.f86458g.get();
        if (th2 == ExceptionHelper.f71695a) {
            rVar.onComplete();
        } else {
            rVar.onError(th2);
        }
    }
}
