package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xl.s;

/* JADX INFO: compiled from: ObservableWindowTimed.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w1<T> extends mm.a<T, xl.k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f74732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeUnit f74733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xl.s f74734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f74735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f74736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f74737i;

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class a<T> extends hm.j<T, Object, xl.k<T>> implements bm.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f74738h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TimeUnit f74739i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final xl.s f74740j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f74741k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f74742l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f74743m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final s.c f74744n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f74745o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f74746p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public bm.b f74747q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public UnicastSubject<T> f74748r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public volatile boolean f74749s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final AtomicReference<bm.b> f74750t;

        /* JADX INFO: renamed from: mm.w1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public static final class RunnableC0885a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f74751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a<?> f74752c;

            public RunnableC0885a(long j10, a<?> aVar) {
                this.f74751b = j10;
                this.f74752c = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a<?> aVar = this.f74752c;
                if (aVar.f63542e) {
                    aVar.f74749s = true;
                    aVar.m();
                } else {
                    aVar.f63541d.offer(this);
                }
                if (aVar.g()) {
                    aVar.n();
                }
            }
        }

        public a(xl.r<? super xl.k<T>> rVar, long j10, TimeUnit timeUnit, xl.s sVar, int i10, long j11, boolean z10) {
            super(rVar, new MpscLinkedQueue());
            this.f74750t = new AtomicReference<>();
            this.f74738h = j10;
            this.f74739i = timeUnit;
            this.f74740j = sVar;
            this.f74741k = i10;
            this.f74743m = j11;
            this.f74742l = z10;
            if (z10) {
                this.f74744n = sVar.a();
            } else {
                this.f74744n = null;
            }
        }

        @Override // bm.b
        public void dispose() {
            this.f63542e = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f63542e;
        }

        public void m() {
            DisposableHelper.dispose(this.f74750t);
            s.c cVar = this.f74744n;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void n() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f63541d;
            xl.r<? super V> rVar = this.f63540c;
            UnicastSubject<T> unicastSubject = this.f74748r;
            int iC = 1;
            while (!this.f74749s) {
                boolean z10 = this.f63543f;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof RunnableC0885a;
                if (z10 && (z11 || z12)) {
                    this.f74748r = null;
                    mpscLinkedQueue.clear();
                    m();
                    Throwable th2 = this.f63544g;
                    if (th2 != null) {
                        unicastSubject.onError(th2);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iC = c(-iC);
                    if (iC == 0) {
                        return;
                    }
                } else if (z12) {
                    RunnableC0885a runnableC0885a = (RunnableC0885a) objPoll;
                    if (this.f74742l || this.f74746p == runnableC0885a.f74751b) {
                        unicastSubject.onComplete();
                        this.f74745o = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.d(this.f74741k);
                        this.f74748r = unicastSubject;
                        rVar.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(objPoll));
                    long j10 = this.f74745o + 1;
                    if (j10 >= this.f74743m) {
                        this.f74746p++;
                        this.f74745o = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.d(this.f74741k);
                        this.f74748r = unicastSubject;
                        this.f63540c.onNext(unicastSubject);
                        if (this.f74742l) {
                            bm.b bVar = this.f74750t.get();
                            bVar.dispose();
                            s.c cVar = this.f74744n;
                            RunnableC0885a runnableC0885a2 = new RunnableC0885a(this.f74746p, this);
                            long j11 = this.f74738h;
                            bm.b bVarD = cVar.d(runnableC0885a2, j11, j11, this.f74739i);
                            if (!androidx.compose.animation.core.a.a(this.f74750t, bVar, bVarD)) {
                                bVarD.dispose();
                            }
                        }
                    } else {
                        this.f74745o = j10;
                    }
                }
            }
            this.f74747q.dispose();
            mpscLinkedQueue.clear();
            m();
        }

        @Override // xl.r
        public void onComplete() {
            this.f63543f = true;
            if (g()) {
                n();
            }
            this.f63540c.onComplete();
            m();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f63544g = th2;
            this.f63543f = true;
            if (g()) {
                n();
            }
            this.f63540c.onError(th2);
            m();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74749s) {
                return;
            }
            if (h()) {
                UnicastSubject<T> unicastSubject = this.f74748r;
                unicastSubject.onNext(t10);
                long j10 = this.f74745o + 1;
                if (j10 >= this.f74743m) {
                    this.f74746p++;
                    this.f74745o = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74741k);
                    this.f74748r = unicastSubjectD;
                    this.f63540c.onNext(unicastSubjectD);
                    if (this.f74742l) {
                        this.f74750t.get().dispose();
                        s.c cVar = this.f74744n;
                        RunnableC0885a runnableC0885a = new RunnableC0885a(this.f74746p, this);
                        long j11 = this.f74738h;
                        DisposableHelper.replace(this.f74750t, cVar.d(runnableC0885a, j11, j11, this.f74739i));
                    }
                } else {
                    this.f74745o = j10;
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
            n();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            bm.b bVarE;
            if (DisposableHelper.validate(this.f74747q, bVar)) {
                this.f74747q = bVar;
                xl.r<? super V> rVar = this.f63540c;
                rVar.onSubscribe(this);
                if (this.f63542e) {
                    return;
                }
                UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74741k);
                this.f74748r = unicastSubjectD;
                rVar.onNext(unicastSubjectD);
                RunnableC0885a runnableC0885a = new RunnableC0885a(this.f74746p, this);
                if (this.f74742l) {
                    s.c cVar = this.f74744n;
                    long j10 = this.f74738h;
                    bVarE = cVar.d(runnableC0885a, j10, j10, this.f74739i);
                } else {
                    xl.s sVar = this.f74740j;
                    long j11 = this.f74738h;
                    bVarE = sVar.e(runnableC0885a, j11, j11, this.f74739i);
                }
                DisposableHelper.replace(this.f74750t, bVarE);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class b<T> extends hm.j<T, Object, xl.k<T>> implements bm.b, Runnable {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Object f74753p = new Object();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f74754h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TimeUnit f74755i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final xl.s f74756j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f74757k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public bm.b f74758l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public UnicastSubject<T> f74759m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicReference<bm.b> f74760n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public volatile boolean f74761o;

        public b(xl.r<? super xl.k<T>> rVar, long j10, TimeUnit timeUnit, xl.s sVar, int i10) {
            super(rVar, new MpscLinkedQueue());
            this.f74760n = new AtomicReference<>();
            this.f74754h = j10;
            this.f74755i = timeUnit;
            this.f74756j = sVar;
            this.f74757k = i10;
        }

        @Override // bm.b
        public void dispose() {
            this.f63542e = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f63542e;
        }

        public void k() {
            DisposableHelper.dispose(this.f74760n);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.f74759m = null;
            r0.clear();
            k();
            r0 = r7.f63544g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l() {
            /*
                r7 = this;
                gm.g<U> r0 = r7.f63541d
                io.reactivex.internal.queue.MpscLinkedQueue r0 = (io.reactivex.internal.queue.MpscLinkedQueue) r0
                xl.r<? super V> r1 = r7.f63540c
                io.reactivex.subjects.UnicastSubject<T> r2 = r7.f74759m
                r3 = 1
            L9:
                boolean r4 = r7.f74761o
                boolean r5 = r7.f63543f
                java.lang.Object r6 = r0.poll()
                if (r5 == 0) goto L2e
                if (r6 == 0) goto L19
                java.lang.Object r5 = mm.w1.b.f74753p
                if (r6 != r5) goto L2e
            L19:
                r1 = 0
                r7.f74759m = r1
                r0.clear()
                r7.k()
                java.lang.Throwable r0 = r7.f63544g
                if (r0 == 0) goto L2a
                r2.onError(r0)
                goto L2d
            L2a:
                r2.onComplete()
            L2d:
                return
            L2e:
                if (r6 != 0) goto L38
                int r3 = -r3
                int r3 = r7.c(r3)
                if (r3 != 0) goto L9
                return
            L38:
                java.lang.Object r5 = mm.w1.b.f74753p
                if (r6 != r5) goto L53
                r2.onComplete()
                if (r4 != 0) goto L4d
                int r2 = r7.f74757k
                io.reactivex.subjects.UnicastSubject r2 = io.reactivex.subjects.UnicastSubject.d(r2)
                r7.f74759m = r2
                r1.onNext(r2)
                goto L9
            L4d:
                bm.b r4 = r7.f74758l
                r4.dispose()
                goto L9
            L53:
                java.lang.Object r4 = io.reactivex.internal.util.NotificationLite.getValue(r6)
                r2.onNext(r4)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: mm.w1.b.l():void");
        }

        @Override // xl.r
        public void onComplete() {
            this.f63543f = true;
            if (g()) {
                l();
            }
            k();
            this.f63540c.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f63544g = th2;
            this.f63543f = true;
            if (g()) {
                l();
            }
            k();
            this.f63540c.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74761o) {
                return;
            }
            if (h()) {
                this.f74759m.onNext(t10);
                if (c(-1) == 0) {
                    return;
                }
            } else {
                this.f63541d.offer((U) NotificationLite.next(t10));
                if (!g()) {
                    return;
                }
            }
            l();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74758l, bVar)) {
                this.f74758l = bVar;
                this.f74759m = UnicastSubject.d(this.f74757k);
                xl.r<? super V> rVar = this.f63540c;
                rVar.onSubscribe(this);
                rVar.onNext(this.f74759m);
                if (this.f63542e) {
                    return;
                }
                xl.s sVar = this.f74756j;
                long j10 = this.f74754h;
                DisposableHelper.replace(this.f74760n, sVar.e(this, j10, j10, this.f74755i));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f63542e) {
                this.f74761o = true;
                k();
            }
            this.f63541d.offer((U) f74753p);
            if (g()) {
                l();
            }
        }
    }

    /* JADX INFO: compiled from: ObservableWindowTimed.java */
    public static final class c<T> extends hm.j<T, Object, xl.k<T>> implements bm.b, Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f74762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f74763i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TimeUnit f74764j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final s.c f74765k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f74766l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List<UnicastSubject<T>> f74767m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public bm.b f74768n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public volatile boolean f74769o;

        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UnicastSubject<T> f74770b;

            public a(UnicastSubject<T> unicastSubject) {
                this.f74770b = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.k(this.f74770b);
            }
        }

        /* JADX INFO: compiled from: ObservableWindowTimed.java */
        public static final class b<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnicastSubject<T> f74772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f74773b;

            public b(UnicastSubject<T> unicastSubject, boolean z10) {
                this.f74772a = unicastSubject;
                this.f74773b = z10;
            }
        }

        public c(xl.r<? super xl.k<T>> rVar, long j10, long j11, TimeUnit timeUnit, s.c cVar, int i10) {
            super(rVar, new MpscLinkedQueue());
            this.f74762h = j10;
            this.f74763i = j11;
            this.f74764j = timeUnit;
            this.f74765k = cVar;
            this.f74766l = i10;
            this.f74767m = new LinkedList();
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
        public void k(UnicastSubject<T> unicastSubject) {
            this.f63541d.offer((U) new b(unicastSubject, false));
            if (g()) {
                m();
            }
        }

        public void l() {
            this.f74765k.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void m() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.f63541d;
            xl.r<? super V> rVar = this.f63540c;
            List<UnicastSubject<T>> list = this.f74767m;
            int iC = 1;
            while (!this.f74769o) {
                boolean z10 = this.f63543f;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                boolean z12 = objPoll instanceof b;
                if (z10 && (z11 || z12)) {
                    mpscLinkedQueue.clear();
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
                    l();
                    list.clear();
                    return;
                }
                if (z11) {
                    iC = c(-iC);
                    if (iC == 0) {
                        return;
                    }
                } else if (z12) {
                    b bVar = (b) objPoll;
                    if (!bVar.f74773b) {
                        list.remove(bVar.f74772a);
                        bVar.f74772a.onComplete();
                        if (list.isEmpty() && this.f63542e) {
                            this.f74769o = true;
                        }
                    } else if (!this.f63542e) {
                        UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74766l);
                        list.add(unicastSubjectD);
                        rVar.onNext(unicastSubjectD);
                        this.f74765k.c(new a(unicastSubjectD), this.f74762h, this.f74764j);
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(objPoll);
                    }
                }
            }
            this.f74768n.dispose();
            l();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // xl.r
        public void onComplete() {
            this.f63543f = true;
            if (g()) {
                m();
            }
            this.f63540c.onComplete();
            l();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f63544g = th2;
            this.f63543f = true;
            if (g()) {
                m();
            }
            this.f63540c.onError(th2);
            l();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onNext(T t10) {
            if (h()) {
                Iterator<UnicastSubject<T>> it = this.f74767m.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t10);
                }
                if (c(-1) == 0) {
                    return;
                }
            } else {
                this.f63541d.offer((U) t10);
                if (!g()) {
                    return;
                }
            }
            m();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74768n, bVar)) {
                this.f74768n = bVar;
                this.f63540c.onSubscribe(this);
                if (this.f63542e) {
                    return;
                }
                UnicastSubject<T> unicastSubjectD = UnicastSubject.d(this.f74766l);
                this.f74767m.add(unicastSubjectD);
                this.f63540c.onNext(unicastSubjectD);
                this.f74765k.c(new a(unicastSubjectD), this.f74762h, this.f74764j);
                s.c cVar = this.f74765k;
                long j10 = this.f74763i;
                cVar.d(this, j10, j10, this.f74764j);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            Object bVar = new b(UnicastSubject.d(this.f74766l), true);
            if (!this.f63542e) {
                this.f63541d.offer((U) bVar);
            }
            if (g()) {
                m();
            }
        }
    }

    public w1(xl.p<T> pVar, long j10, long j11, TimeUnit timeUnit, xl.s sVar, long j12, int i10, boolean z10) {
        super(pVar);
        this.f74731c = j10;
        this.f74732d = j11;
        this.f74733e = timeUnit;
        this.f74734f = sVar;
        this.f74735g = j12;
        this.f74736h = i10;
        this.f74737i = z10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super xl.k<T>> rVar) {
        sm.e eVar = new sm.e(rVar);
        long j10 = this.f74731c;
        long j11 = this.f74732d;
        if (j10 != j11) {
            this.f74327b.subscribe(new c(eVar, j10, j11, this.f74733e, this.f74734f.a(), this.f74736h));
            return;
        }
        long j12 = this.f74735g;
        if (j12 == Long.MAX_VALUE) {
            this.f74327b.subscribe(new b(eVar, this.f74731c, this.f74733e, this.f74734f, this.f74736h));
        } else {
            this.f74327b.subscribe(new a(eVar, j10, this.f74733e, this.f74734f, this.f74736h, j12, this.f74737i));
        }
    }
}
