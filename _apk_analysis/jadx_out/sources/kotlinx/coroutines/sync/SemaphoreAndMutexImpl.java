package kotlinx.coroutines.sync;

import bn.r;
import hn.c;
import in.a;
import io.b;
import io.b0;
import io.c0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn.f;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import mo.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import p000do.n;
import p000do.s2;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes11.dex */
public class SemaphoreAndMutexImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73462c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73463d = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73464e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73465f = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73466g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final q<Throwable, r, d, r> f73468b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreAndMutexImpl(int i10, int i11) {
        this.f73467a = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (!(i11 >= 0 && i11 <= i10)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i10 - i11;
        this.f73468b = new q() { // from class: mo.i
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SemaphoreAndMutexImpl.r(this.f74828b, (Throwable) obj, (r) obj2, (kotlin.coroutines.d) obj3);
            }
        };
    }

    public static final r r(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th2, r rVar, d dVar) {
        semaphoreAndMutexImpl.release();
        return r.f5635a;
    }

    @Nullable
    public final Object b(@NotNull c<? super r> cVar) {
        Object objH;
        return (k() <= 0 && (objH = h(cVar)) == a.g()) ? objH : r.f5635a;
    }

    public final void g(@NotNull k<? super r> kVar) {
        while (k() <= 0) {
            p.i(kVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (i((s2) kVar)) {
                return;
            }
        }
        kVar.y(r.f5635a, this.f73468b);
    }

    public final Object h(c<? super r> cVar) {
        kotlinx.coroutines.c cVarB = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        try {
            if (!i(cVarB)) {
                g(cVarB);
            }
            Object objB = cVarB.B();
            if (objB == a.g()) {
                f.c(cVar);
            }
            return objB == a.g() ? objB : r.f5635a;
        } catch (Throwable th2) {
            cVarB.T();
            throw th2;
        }
    }

    public final boolean i(s2 s2Var) {
        Object objC;
        boolean z10;
        l lVar = (l) f73464e.get(this);
        long andIncrement = f73465f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73464e;
        long j10 = andIncrement / ((long) mo.k.f74834f);
        do {
            objC = b.c(lVar, j10, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (c0.c(objC)) {
                break;
            }
            b0 b0VarB = c0.b(objC);
            while (true) {
                b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                if (b0Var.f68504d >= b0VarB.f68504d) {
                    break;
                }
                if (!b0VarB.u()) {
                    z10 = false;
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                    if (b0Var.p()) {
                        b0Var.n();
                    }
                } else if (b0VarB.p()) {
                    b0VarB.n();
                }
            }
            z10 = true;
        } while (!z10);
        l lVar2 = (l) c0.b(objC);
        int i10 = (int) (andIncrement % ((long) mo.k.f74834f));
        if (wl.c.a(lVar2.v(), i10, null, s2Var)) {
            s2Var.b(lVar2, i10);
            return true;
        }
        if (!wl.c.a(lVar2.v(), i10, mo.k.f74830b, mo.k.f74831c)) {
            return false;
        }
        if (s2Var instanceof k) {
            p.i(s2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((k) s2Var).y(r.f5635a, this.f73468b);
            return true;
        }
        if (s2Var instanceof lo.f) {
            ((lo.f) s2Var).c(r.f5635a);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + s2Var).toString());
    }

    public final void j() {
        int i10;
        do {
            i10 = f73466g.get(this);
            if (i10 <= this.f73467a) {
                return;
            }
        } while (!f73466g.compareAndSet(this, i10, this.f73467a));
    }

    public final int k() {
        int andDecrement;
        do {
            andDecrement = f73466g.getAndDecrement(this);
        } while (andDecrement > this.f73467a);
        return andDecrement;
    }

    public final int l() {
        return Math.max(f73466g.get(this), 0);
    }

    public final void release() {
        do {
            int andIncrement = f73466g.getAndIncrement(this);
            if (andIncrement >= this.f73467a) {
                j();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f73467a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!u());
    }

    public final boolean s() {
        while (true) {
            int i10 = f73466g.get(this);
            if (i10 > this.f73467a) {
                j();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f73466g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean t(Object obj) {
        if (!(obj instanceof k)) {
            if (obj instanceof lo.f) {
                return ((lo.f) obj).e(this, r.f5635a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        k kVar = (k) obj;
        Object objE = kVar.E(r.f5635a, null, this.f73468b);
        if (objE == null) {
            return false;
        }
        kVar.A(objE);
        return true;
    }

    public final boolean u() {
        Object objC;
        boolean z10;
        l lVar = (l) f73462c.get(this);
        long andIncrement = f73463d.getAndIncrement(this);
        long j10 = andIncrement / ((long) mo.k.f74834f);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73462c;
        do {
            objC = b.c(lVar, j10, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (c0.c(objC)) {
                break;
            }
            b0 b0VarB = c0.b(objC);
            while (true) {
                b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                if (b0Var.f68504d >= b0VarB.f68504d) {
                    break;
                }
                if (!b0VarB.u()) {
                    z10 = false;
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                    if (b0Var.p()) {
                        b0Var.n();
                    }
                } else if (b0VarB.p()) {
                    b0VarB.n();
                }
            }
            z10 = true;
        } while (!z10);
        l lVar2 = (l) c0.b(objC);
        lVar2.c();
        if (lVar2.f68504d > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) mo.k.f74834f));
        Object andSet = lVar2.v().getAndSet(i10, mo.k.f74830b);
        if (andSet != null) {
            if (andSet == mo.k.f74833e) {
                return false;
            }
            return t(andSet);
        }
        int i11 = mo.k.f74829a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (lVar2.v().get(i10) == mo.k.f74831c) {
                return true;
            }
        }
        return !wl.c.a(lVar2.v(), i10, mo.k.f74830b, mo.k.f74832d);
    }
}
