package io.reactivex.internal.operators.observable;

import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableReplay<T> extends rm.a<T> implements em.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f71539f = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<T> f71540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<ReplayObserver<T>> f71541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a<T> f71542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<T> f71543e;

    public static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements e<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public int size;
        public Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null);
            this.tail = node;
            set(node);
        }

        public final void addLast(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void collect(Collection<? super T> collection) {
            Node head = getHead();
            while (true) {
                head = head.get();
                if (head == null) {
                    return;
                }
                Object objLeaveTransform = leaveTransform(head.value);
                if (NotificationLite.isComplete(objLeaveTransform) || NotificationLite.isError(objLeaveTransform)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objLeaveTransform));
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void complete() {
            addLast(new Node(enterTransform(NotificationLite.complete())));
            truncateFinal();
        }

        public Object enterTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void error(Throwable th2) {
            addLast(new Node(enterTransform(NotificationLite.error(th2))));
            truncateFinal();
        }

        public Node getHead() {
            return get();
        }

        public boolean hasCompleted() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isComplete(leaveTransform(obj));
        }

        public boolean hasError() {
            Object obj = this.tail.value;
            return obj != null && NotificationLite.isError(leaveTransform(obj));
        }

        public Object leaveTransform(Object obj) {
            return obj;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void next(T t10) {
            addLast(new Node(enterTransform(NotificationLite.next(t10))));
            truncate();
        }

        public final void removeFirst() {
            this.size--;
            setFirst(get().get());
        }

        public final void removeSome(int i10) {
            Node node = get();
            while (i10 > 0) {
                node = node.get();
                i10--;
                this.size--;
            }
            setFirst(node);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public final void replay(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                Node head = (Node) innerDisposable.index();
                if (head == null) {
                    head = getHead();
                    innerDisposable.index = head;
                }
                while (!innerDisposable.isDisposed()) {
                    Node node = head.get();
                    if (node == null) {
                        innerDisposable.index = head;
                        iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                    } else {
                        if (NotificationLite.accept(leaveTransform(node.value), innerDisposable.child)) {
                            innerDisposable.index = null;
                            return;
                        }
                        head = node;
                    }
                }
                return;
            } while (iAddAndGet != 0);
        }

        public final void setFirst(Node node) {
            set(node);
        }

        public final void trimHead() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }

        public abstract void truncate();

        public void truncateFinal() {
            trimHead();
        }
    }

    public static final class InnerDisposable<T> extends AtomicInteger implements bm.b {
        private static final long serialVersionUID = 2728361546769921047L;
        public volatile boolean cancelled;
        public final r<? super T> child;
        public Object index;
        public final ReplayObserver<T> parent;

        public InnerDisposable(ReplayObserver<T> replayObserver, r<? super T> rVar) {
            this.parent = replayObserver;
            this.child = rVar;
        }

        @Override // bm.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.parent.remove(this);
        }

        public <U> U index() {
            return (U) this.index;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    public static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object value;

        public Node(Object obj) {
            this.value = obj;
        }
    }

    public static final class ReplayObserver<T> extends AtomicReference<bm.b> implements r<T>, bm.b {
        public static final InnerDisposable[] EMPTY = new InnerDisposable[0];
        public static final InnerDisposable[] TERMINATED = new InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        public final e<T> buffer;
        public boolean done;
        public final AtomicReference<InnerDisposable[]> observers = new AtomicReference<>(EMPTY);
        public final AtomicBoolean shouldConnect = new AtomicBoolean();

        public ReplayObserver(e<T> eVar) {
            this.buffer = eVar;
        }

        public boolean add(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!androidx.compose.animation.core.a.a(this.observers, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        @Override // bm.b
        public void dispose() {
            this.observers.set(TERMINATED);
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.complete();
            replayFinal();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.done) {
                tm.a.s(th2);
                return;
            }
            this.done = true;
            this.buffer.error(th2);
            replayFinal();
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            this.buffer.next(t10);
            replay();
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.setOnce(this, bVar)) {
                replay();
            }
        }

        public void remove(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (innerDisposableArr[i11].equals(innerDisposable)) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = EMPTY;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!androidx.compose.animation.core.a.a(this.observers, innerDisposableArr, innerDisposableArr2));
        }

        public void replay() {
            for (InnerDisposable<T> innerDisposable : this.observers.get()) {
                this.buffer.replay(innerDisposable);
            }
        }

        public void replayFinal() {
            for (InnerDisposable<T> innerDisposable : this.observers.getAndSet(TERMINATED)) {
                this.buffer.replay(innerDisposable);
            }
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final int limit;
        public final long maxAge;
        public final s scheduler;
        public final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, s sVar) {
            this.scheduler = sVar;
            this.limit = i10;
            this.maxAge = j10;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object enterTransform(Object obj) {
            return new vm.b(obj, this.scheduler.b(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Node getHead() {
            Node node;
            long jB = this.scheduler.b(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                vm.b bVar = (vm.b) node2.value;
                if (NotificationLite.isComplete(bVar.b()) || NotificationLite.isError(bVar.b()) || bVar.a() > jB) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public Object leaveTransform(Object obj) {
            return ((vm.b) obj).b();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            Node node;
            long jB = this.scheduler.b(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    int i11 = this.size;
                    if (i11 <= this.limit) {
                        if (((vm.b) node2.value).a() > jB) {
                            break;
                        }
                        i10++;
                        this.size--;
                        node3 = node2.get();
                    } else {
                        i10++;
                        this.size = i11 - 1;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncateFinal() {
            Node node;
            long jB = this.scheduler.b(this.unit) - this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i10 = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((vm.b) node2.value).a() > jB) {
                    break;
                }
                i10++;
                this.size--;
                node3 = node2.get();
            }
            if (i10 != 0) {
                setFirst(node);
            }
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int limit;

        public SizeBoundReplayBuffer(int i10) {
            this.limit = i10;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        public void truncate() {
            if (this.size > this.limit) {
                removeFirst();
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements e<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int size;

        public UnboundedReplayBuffer(int i10) {
            super(i10);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void complete() {
            add(NotificationLite.complete());
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void error(Throwable th2) {
            add(NotificationLite.error(th2));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void next(T t10) {
            add(NotificationLite.next(t10));
            this.size++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.e
        public void replay(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() != 0) {
                return;
            }
            r<? super T> rVar = innerDisposable.child;
            int iAddAndGet = 1;
            while (!innerDisposable.isDisposed()) {
                int i10 = this.size;
                Integer num = (Integer) innerDisposable.index();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i10) {
                    if (NotificationLite.accept(get(iIntValue), rVar) || innerDisposable.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                innerDisposable.index = Integer.valueOf(iIntValue);
                iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public interface a<T> {
        e<T> call();
    }

    public static final class b<R> implements dm.g<bm.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ObserverResourceWrapper<R> f71544b;

        public b(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.f71544b = observerResourceWrapper;
        }

        @Override // dm.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(bm.b bVar) {
            this.f71544b.setResource(bVar);
        }
    }

    public static final class c<R, U> extends k<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Callable<? extends rm.a<U>> f71545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super k<U>, ? extends p<R>> f71546c;

        public c(Callable<? extends rm.a<U>> callable, o<? super k<U>, ? extends p<R>> oVar) {
            this.f71545b = callable;
            this.f71546c = oVar;
        }

        @Override // xl.k
        public void subscribeActual(r<? super R> rVar) {
            try {
                rm.a aVar = (rm.a) fm.a.e(this.f71545b.call(), "The connectableFactory returned a null ConnectableObservable");
                p pVar = (p) fm.a.e(this.f71546c.apply(aVar), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(rVar);
                pVar.subscribe(observerResourceWrapper);
                aVar.b(new b(observerResourceWrapper));
            } catch (Throwable th2) {
                cm.a.b(th2);
                EmptyDisposable.error(th2, rVar);
            }
        }
    }

    public static final class d<T> extends rm.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rm.a<T> f71547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k<T> f71548c;

        public d(rm.a<T> aVar, k<T> kVar) {
            this.f71547b = aVar;
            this.f71548c = kVar;
        }

        @Override // rm.a
        public void b(dm.g<? super bm.b> gVar) {
            this.f71547b.b(gVar);
        }

        @Override // xl.k
        public void subscribeActual(r<? super T> rVar) {
            this.f71548c.subscribe(rVar);
        }
    }

    public interface e<T> {
        void complete();

        void error(Throwable th2);

        void next(T t10);

        void replay(InnerDisposable<T> innerDisposable);
    }

    public static final class f<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f71549a;

        public f(int i10) {
            this.f71549a = i10;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<T> call() {
            return new SizeBoundReplayBuffer(this.f71549a);
        }
    }

    public static final class g<T> implements p<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<ReplayObserver<T>> f71550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T> f71551c;

        public g(AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
            this.f71550b = atomicReference;
            this.f71551c = aVar;
        }

        @Override // xl.p
        public void subscribe(r<? super T> rVar) {
            ReplayObserver<T> replayObserver;
            while (true) {
                replayObserver = this.f71550b.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f71551c.call());
                if (androidx.compose.animation.core.a.a(this.f71550b, null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, rVar);
            rVar.onSubscribe(innerDisposable);
            replayObserver.add(innerDisposable);
            if (innerDisposable.isDisposed()) {
                replayObserver.remove(innerDisposable);
            } else {
                replayObserver.buffer.replay(innerDisposable);
            }
        }
    }

    public static final class h<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f71552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f71553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f71554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f71555d;

        public h(int i10, long j10, TimeUnit timeUnit, s sVar) {
            this.f71552a = i10;
            this.f71553b = j10;
            this.f71554c = timeUnit;
            this.f71555d = sVar;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<T> call() {
            return new SizeAndTimeBoundReplayBuffer(this.f71552a, this.f71553b, this.f71554c, this.f71555d);
        }
    }

    public static final class i implements a<Object> {
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.a
        public e<Object> call() {
            return new UnboundedReplayBuffer(16);
        }
    }

    public ObservableReplay(p<T> pVar, p<T> pVar2, AtomicReference<ReplayObserver<T>> atomicReference, a<T> aVar) {
        this.f71543e = pVar;
        this.f71540b = pVar2;
        this.f71541c = atomicReference;
        this.f71542d = aVar;
    }

    public static <T> rm.a<T> d(p<T> pVar, int i10) {
        return i10 == Integer.MAX_VALUE ? h(pVar) : g(pVar, new f(i10));
    }

    public static <T> rm.a<T> e(p<T> pVar, long j10, TimeUnit timeUnit, s sVar) {
        return f(pVar, j10, timeUnit, sVar, Integer.MAX_VALUE);
    }

    public static <T> rm.a<T> f(p<T> pVar, long j10, TimeUnit timeUnit, s sVar, int i10) {
        return g(pVar, new h(i10, j10, timeUnit, sVar));
    }

    public static <T> rm.a<T> g(p<T> pVar, a<T> aVar) {
        AtomicReference atomicReference = new AtomicReference();
        return tm.a.k(new ObservableReplay(new g(atomicReference, aVar), pVar, atomicReference, aVar));
    }

    public static <T> rm.a<T> h(p<? extends T> pVar) {
        return g(pVar, f71539f);
    }

    public static <U, R> k<R> i(Callable<? extends rm.a<U>> callable, o<? super k<U>, ? extends p<R>> oVar) {
        return tm.a.o(new c(callable, oVar));
    }

    public static <T> rm.a<T> j(rm.a<T> aVar, s sVar) {
        return tm.a.k(new d(aVar, aVar.observeOn(sVar)));
    }

    @Override // em.c
    public void a(bm.b bVar) {
        androidx.compose.animation.core.a.a(this.f71541c, (ReplayObserver) bVar, null);
    }

    @Override // rm.a
    public void b(dm.g<? super bm.b> gVar) {
        ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.f71541c.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.f71542d.call());
            if (androidx.compose.animation.core.a.a(this.f71541c, replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z10 = !replayObserver.shouldConnect.get() && replayObserver.shouldConnect.compareAndSet(false, true);
        try {
            gVar.accept(replayObserver);
            if (z10) {
                this.f71540b.subscribe(replayObserver);
            }
        } catch (Throwable th2) {
            if (z10) {
                replayObserver.shouldConnect.compareAndSet(true, false);
            }
            cm.a.b(th2);
            throw ExceptionHelper.d(th2);
        }
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f71543e.subscribe(rVar);
    }
}
