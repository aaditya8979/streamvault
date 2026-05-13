package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
/* JADX INFO: loaded from: classes10.dex */
public final class v1<T, B, V> extends mm.a<T, xl.k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl.p<B> f74708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.o<? super B, ? extends xl.p<V>> f74709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f74710e;

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class a<T, V> extends sm.c<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T, ?, V> f74711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UnicastSubject<T> f74712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74713e;

        public a(c<T, ?, V> cVar, UnicastSubject<T> unicastSubject) {
            this.f74711c = cVar;
            this.f74712d = unicastSubject;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74713e) {
                return;
            }
            this.f74713e = true;
            this.f74711c.k(this);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74713e) {
                tm.a.s(th2);
            } else {
                this.f74713e = true;
                this.f74711c.n(th2);
            }
        }

        @Override // xl.r
        public void onNext(V v10) {
            dispose();
            onComplete();
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class b<T, B> extends sm.c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T, B, ?> f74714c;

        public b(c<T, B, ?> cVar) {
            this.f74714c = cVar;
        }

        @Override // xl.r
        public void onComplete() {
            this.f74714c.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74714c.n(th2);
        }

        @Override // xl.r
        public void onNext(B b10) {
            this.f74714c.p(b10);
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class c<T, B, V> extends hm.j<T, Object, xl.k<T>> implements bm.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final xl.p<B> f74715h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final dm.o<? super B, ? extends xl.p<V>> f74716i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f74717j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final bm.a f74718k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public bm.b f74719l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AtomicReference<bm.b> f74720m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<UnicastSubject<T>> f74721n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final AtomicLong f74722o;

        public c(xl.r<? super xl.k<T>> rVar, xl.p<B> pVar, dm.o<? super B, ? extends xl.p<V>> oVar, int i10) {
            super(rVar, new MpscLinkedQueue());
            this.f74720m = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.f74722o = atomicLong;
            this.f74715h = pVar;
            this.f74716i = oVar;
            this.f74717j = i10;
            this.f74718k = new bm.a();
            this.f74721n = new ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // hm.j, qm.h
        public void b(xl.r<? super xl.k<T>> rVar, Object obj) {
        }

        @Override // bm.b
        public void dispose() {
            this.f63542e = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f63542e;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void k(a<T, V> aVar) {
            this.f74718k.delete(aVar);
            this.f63541d.offer((U) new d(aVar.f74712d, null));
            if (g()) {
                m();
            }
        }

        public void l() {
            this.f74718k.dispose();
            DisposableHelper.dispose(this.f74720m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void m() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f63541d;
            xl.r<? super V> rVar = this.f63540c;
            List<UnicastSubject<T>> list = this.f74721n;
            int iC = 1;
            while (true) {
                boolean z10 = this.f63543f;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    l();
                    Throwable th2 = this.f63544g;
                    if (th2 != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th2);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (z11) {
                    iC = c(-iC);
                    if (iC == 0) {
                        return;
                    }
                } else if (objPoll instanceof d) {
                    d dVar = (d) objPoll;
                    UnicastSubject<T> unicastSubject = dVar.f74723a;
                    if (unicastSubject != null) {
                        if (list.remove(unicastSubject)) {
                            dVar.f74723a.onComplete();
                            if (this.f74722o.decrementAndGet() == 0) {
                                l();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else if (!this.f63542e) {
                        UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74717j);
                        list.add(unicastSubjectD);
                        rVar.onNext(unicastSubjectD);
                        try {
                            xl.p pVar = (xl.p) fm.a.e(this.f74716i.apply(dVar.f74724b), "The ObservableSource supplied is null");
                            a aVar = new a(this, unicastSubjectD);
                            if (this.f74718k.a(aVar)) {
                                this.f74722o.getAndIncrement();
                                pVar.subscribe(aVar);
                            }
                        } catch (Throwable th3) {
                            cm.a.b(th3);
                            this.f63542e = true;
                            rVar.onError(th3);
                        }
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(NotificationLite.getValue(objPoll));
                    }
                }
            }
        }

        public void n(Throwable th2) {
            this.f74719l.dispose();
            this.f74718k.dispose();
            onError(th2);
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f63543f) {
                return;
            }
            this.f63543f = true;
            if (g()) {
                m();
            }
            if (this.f74722o.decrementAndGet() == 0) {
                this.f74718k.dispose();
            }
            this.f63540c.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f63543f) {
                tm.a.s(th2);
                return;
            }
            this.f63544g = th2;
            this.f63543f = true;
            if (g()) {
                m();
            }
            if (this.f74722o.decrementAndGet() == 0) {
                this.f74718k.dispose();
            }
            this.f63540c.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            if (h()) {
                Iterator<UnicastSubject<T>> it = this.f74721n.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (c(-1) == 0) {
                    return;
                }
            } else {
                this.f63541d.offer((U) NotificationLite.next(t10));
                if (!g()) {
                    return;
                }
            }
            m();
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74719l, bVar)) {
                this.f74719l = bVar;
                this.f63540c.onSubscribe(this);
                if (this.f63542e) {
                    return;
                }
                b bVar2 = new b(this);
                if (androidx.compose.animation.core.a.a(this.f74720m, null, bVar2)) {
                    this.f74722o.getAndIncrement();
                    this.f74715h.subscribe(bVar2);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void p(B b10) {
            this.f63541d.offer((U) new d(null, b10));
            if (g()) {
                m();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowBoundarySelector.java */
    public static final class d<T, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnicastSubject<T> f74723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f74724b;

        public d(UnicastSubject<T> unicastSubject, B b10) {
            this.f74723a = unicastSubject;
            this.f74724b = b10;
        }
    }

    public v1(xl.p<T> pVar, xl.p<B> pVar2, dm.o<? super B, ? extends xl.p<V>> oVar, int i10) {
        super(pVar);
        this.f74708c = pVar2;
        this.f74709d = oVar;
        this.f74710e = i10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super xl.k<T>> rVar) {
        this.f74327b.subscribe(new c(new sm.e(rVar), this.f74708c, this.f74709d, this.f74710e));
    }
}
