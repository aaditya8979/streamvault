package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xl.s;

/* JADX INFO: compiled from: ObservableBufferTimed.java */
/* JADX INFO: loaded from: classes6.dex */
public final class l<T, U extends Collection<? super T>> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f74491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f74492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xl.s f74493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable<U> f74494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f74495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f74496i;

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class a<T, U extends Collection<? super T>> extends hm.j<T, U, U> implements Runnable, bm.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TimeUnit f74499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f74500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f74501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final s.c f74502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public U f74503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public bm.b f74504o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public bm.b f74505p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f74506q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f74507r;

        public a(xl.r<? super U> rVar, Callable<U> callable, long j10, TimeUnit timeUnit, int i10, boolean z10, s.c cVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74497h = callable;
            this.f74498i = j10;
            this.f74499j = timeUnit;
            this.f74500k = i10;
            this.f74501l = z10;
            this.f74502m = cVar;
        }

        @Override // bm.b
        public void dispose() {
            if (this.f63542e) {
                return;
            }
            this.f63542e = true;
            this.f74505p.dispose();
            this.f74502m.dispose();
            synchronized (this) {
                this.f74503n = null;
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f63542e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hm.j, qm.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void b(xl.r<? super U> rVar, U u10) {
            rVar.onNext(u10);
        }

        @Override // xl.r
        public void onComplete() {
            U u10;
            this.f74502m.dispose();
            synchronized (this) {
                u10 = this.f74503n;
                this.f74503n = null;
            }
            this.f63541d.offer(u10);
            this.f63543f = true;
            if (g()) {
                qm.k.c(this.f63541d, this.f63540c, false, this, this);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f74503n = null;
            }
            this.f63540c.onError(th2);
            this.f74502m.dispose();
        }

        @Override // xl.r
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f74503n;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
                if (u10.size() < this.f74500k) {
                    return;
                }
                this.f74503n = null;
                this.f74506q++;
                if (this.f74501l) {
                    this.f74504o.dispose();
                }
                j(u10, false, this);
                try {
                    U u11 = (U) fm.a.e(this.f74497h.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.f74503n = u11;
                        this.f74507r++;
                    }
                    if (this.f74501l) {
                        s.c cVar = this.f74502m;
                        long j10 = this.f74498i;
                        this.f74504o = cVar.d(this, j10, j10, this.f74499j);
                    }
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    this.f63540c.onError(th2);
                    dispose();
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74505p, bVar)) {
                this.f74505p = bVar;
                try {
                    this.f74503n = (U) fm.a.e(this.f74497h.call(), "The buffer supplied is null");
                    this.f63540c.onSubscribe(this);
                    s.c cVar = this.f74502m;
                    long j10 = this.f74498i;
                    this.f74504o = cVar.d(this, j10, j10, this.f74499j);
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.f63540c);
                    this.f74502m.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u10 = (U) fm.a.e(this.f74497h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u11 = this.f74503n;
                    if (u11 != null && this.f74506q == this.f74507r) {
                        this.f74503n = u10;
                        j(u11, false, this);
                    }
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                dispose();
                this.f63540c.onError(th2);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class b<T, U extends Collection<? super T>> extends hm.j<T, U, U> implements Runnable, bm.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TimeUnit f74510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final xl.s f74511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public bm.b f74512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public U f74513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicReference<bm.b> f74514n;

        public b(xl.r<? super U> rVar, Callable<U> callable, long j10, TimeUnit timeUnit, xl.s sVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74514n = new AtomicReference<>();
            this.f74508h = callable;
            this.f74509i = j10;
            this.f74510j = timeUnit;
            this.f74511k = sVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.f74514n);
            this.f74512l.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74514n.get() == DisposableHelper.DISPOSED;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // hm.j, qm.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void b(xl.r<? super U> rVar, U u10) {
            this.f63540c.onNext((Object) u10);
        }

        @Override // xl.r
        public void onComplete() {
            U u10;
            synchronized (this) {
                u10 = this.f74513m;
                this.f74513m = null;
            }
            if (u10 != null) {
                this.f63541d.offer(u10);
                this.f63543f = true;
                if (g()) {
                    qm.k.c(this.f63541d, this.f63540c, false, null, this);
                }
            }
            DisposableHelper.dispose(this.f74514n);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f74513m = null;
            }
            this.f63540c.onError(th2);
            DisposableHelper.dispose(this.f74514n);
        }

        @Override // xl.r
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f74513m;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74512l, bVar)) {
                this.f74512l = bVar;
                try {
                    this.f74513m = (U) fm.a.e(this.f74508h.call(), "The buffer supplied is null");
                    this.f63540c.onSubscribe(this);
                    if (this.f63542e) {
                        return;
                    }
                    xl.s sVar = this.f74511k;
                    long j10 = this.f74509i;
                    bm.b bVarE = sVar.e(this, j10, j10, this.f74510j);
                    if (androidx.compose.animation.core.a.a(this.f74514n, null, bVarE)) {
                        return;
                    }
                    bVarE.dispose();
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    dispose();
                    EmptyDisposable.error(th2, this.f63540c);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u10;
            try {
                U u11 = (U) fm.a.e(this.f74508h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u10 = this.f74513m;
                    if (u10 != null) {
                        this.f74513m = u11;
                    }
                }
                if (u10 == null) {
                    DisposableHelper.dispose(this.f74514n);
                } else {
                    i(u10, false, this);
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f63540c.onError(th2);
                dispose();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableBufferTimed.java */
    public static final class c<T, U extends Collection<? super T>> extends hm.j<T, U, U> implements Runnable, bm.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74515h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74516i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f74517j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final TimeUnit f74518k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final s.c f74519l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List<U> f74520m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public bm.b f74521n;

        /* JADX INFO: compiled from: ObservableBufferTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final U f74522b;

            public a(U u10) {
                this.f74522b = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f74520m.remove(this.f74522b);
                }
                c cVar = c.this;
                cVar.j(this.f74522b, false, cVar.f74519l);
            }
        }

        /* JADX INFO: compiled from: ObservableBufferTimed.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final U f74524b;

            public b(U u10) {
                this.f74524b = u10;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    c.this.f74520m.remove(this.f74524b);
                }
                c cVar = c.this;
                cVar.j(this.f74524b, false, cVar.f74519l);
            }
        }

        public c(xl.r<? super U> rVar, Callable<U> callable, long j10, long j11, TimeUnit timeUnit, s.c cVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74515h = callable;
            this.f74516i = j10;
            this.f74517j = j11;
            this.f74518k = timeUnit;
            this.f74519l = cVar;
            this.f74520m = new LinkedList();
        }

        @Override // bm.b
        public void dispose() {
            if (this.f63542e) {
                return;
            }
            this.f63542e = true;
            n();
            this.f74521n.dispose();
            this.f74519l.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f63542e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // hm.j, qm.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void b(xl.r<? super U> rVar, U u10) {
            rVar.onNext(u10);
        }

        public void n() {
            synchronized (this) {
                this.f74520m.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f74520m);
                this.f74520m.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f63541d.offer((U) ((Collection) it.next()));
            }
            this.f63543f = true;
            if (g()) {
                qm.k.c(this.f63541d, this.f63540c, false, this.f74519l, this);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f63543f = true;
            n();
            this.f63540c.onError(th2);
            this.f74519l.dispose();
        }

        @Override // xl.r
        public void onNext(T t10) {
            synchronized (this) {
                Iterator<U> it = this.f74520m.iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74521n, bVar)) {
                this.f74521n = bVar;
                try {
                    Collection collection = (Collection) fm.a.e(this.f74515h.call(), "The buffer supplied is null");
                    this.f74520m.add((U) collection);
                    this.f63540c.onSubscribe(this);
                    s.c cVar = this.f74519l;
                    long j10 = this.f74517j;
                    cVar.d(this, j10, j10, this.f74518k);
                    this.f74519l.c(new b(collection), this.f74516i, this.f74518k);
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.f63540c);
                    this.f74519l.dispose();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f63542e) {
                return;
            }
            try {
                Collection collection = (Collection) fm.a.e(this.f74515h.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.f63542e) {
                        return;
                    }
                    this.f74520m.add((U) collection);
                    this.f74519l.c(new a(collection), this.f74516i, this.f74518k);
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f63540c.onError(th2);
                dispose();
            }
        }
    }

    public l(xl.p<T> pVar, long j10, long j11, TimeUnit timeUnit, xl.s sVar, Callable<U> callable, int i10, boolean z10) {
        super(pVar);
        this.f74490c = j10;
        this.f74491d = j11;
        this.f74492e = timeUnit;
        this.f74493f = sVar;
        this.f74494g = callable;
        this.f74495h = i10;
        this.f74496i = z10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super U> rVar) {
        if (this.f74490c == this.f74491d && this.f74495h == Integer.MAX_VALUE) {
            this.f74327b.subscribe(new b(new sm.e(rVar), this.f74494g, this.f74490c, this.f74492e, this.f74493f));
            return;
        }
        s.c cVarA = this.f74493f.a();
        if (this.f74490c == this.f74491d) {
            this.f74327b.subscribe(new a(new sm.e(rVar), this.f74494g, this.f74490c, this.f74492e, this.f74495h, this.f74496i, cVarA));
        } else {
            this.f74327b.subscribe(new c(new sm.e(rVar), this.f74494g, this.f74490c, this.f74491d, this.f74492e, cVarA));
        }
    }
}
