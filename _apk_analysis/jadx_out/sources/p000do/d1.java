package p000do;

import bn.r;
import io.p0;
import io.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.r0;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d1 extends e1 implements r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59839e = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f59840f = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f59841g = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final k<r> f59842d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, @NotNull k<? super r> kVar) {
            super(j10);
            this.f59842d = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59842d.s(d1.this, r.f5635a);
        }

        @Override // do.d1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f59842d;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Runnable f59844d;

        public b(long j10, @NotNull Runnable runnable) {
            super(j10);
            this.f59844d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59844d.run();
        }

        @Override // do.d1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f59844d;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, y0, q0 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f59845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f59846c = -1;

        public c(long j10) {
            this.f59845b = j10;
        }

        @Override // io.q0
        @Nullable
        public p0<?> b() {
            Object obj = this._heap;
            if (obj instanceof p0) {
                return (p0) obj;
            }
            return null;
        }

        @Override // io.q0
        public void c(@Nullable p0<?> p0Var) {
            if (!(this._heap != g1.f59855a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = p0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c cVar) {
            long j10 = this.f59845b - cVar.f59845b;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // p000do.y0
        public final void dispose() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj == g1.f59855a) {
                    return;
                }
                d dVar = obj instanceof d ? (d) obj : null;
                if (dVar != null) {
                    dVar.h(this);
                }
                this._heap = g1.f59855a;
                r rVar = r.f5635a;
            }
        }

        public final int f(long j10, @NotNull d dVar, @NotNull d1 d1Var) {
            synchronized (this) {
                if (this._heap == g1.f59855a) {
                    return 2;
                }
                synchronized (dVar) {
                    c cVarB = dVar.b();
                    if (d1Var.d()) {
                        return 1;
                    }
                    if (cVarB == null) {
                        dVar.f59847c = j10;
                    } else {
                        long j11 = cVarB.f59845b;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - dVar.f59847c > 0) {
                            dVar.f59847c = j10;
                        }
                    }
                    long j12 = this.f59845b;
                    long j13 = dVar.f59847c;
                    if (j12 - j13 < 0) {
                        this.f59845b = j13;
                    }
                    dVar.a(this);
                    return 0;
                }
            }
        }

        public final boolean g(long j10) {
            return j10 - this.f59845b >= 0;
        }

        @Override // io.q0
        public int getIndex() {
            return this.f59846c;
        }

        @Override // io.q0
        public void setIndex(int i10) {
            this.f59846c = i10;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f59845b + ']';
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class d extends p0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f59847c;

        public d(long j10) {
            this.f59847c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return f59841g.get(this) == 1;
    }

    @Override // p000do.r0
    @NotNull
    public y0 A(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.d dVar) {
        return r0.a.a(this, j10, runnable, dVar);
    }

    @Override // p000do.c1
    public long P() {
        c cVarF;
        if (super.P() == 0) {
            return 0L;
        }
        Object obj = f59839e.get(this);
        if (obj != null) {
            if (!(obj instanceof io.r)) {
                return obj == g1.f59856b ? Long.MAX_VALUE : 0L;
            }
            if (!((io.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f59840f.get(this);
        if (dVar == null || (cVarF = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarF.f59845b;
        p000do.b.a();
        return n.f(j10 - System.nanoTime(), 0L);
    }

    @Override // p000do.c1
    public long U() {
        if (V()) {
            return 0L;
        }
        e0();
        Runnable runnableC0 = c0();
        if (runnableC0 == null) {
            return P();
        }
        runnableC0.run();
        return 0L;
    }

    @Override // p000do.r0
    public void a(long j10, @NotNull k<? super r> kVar) {
        long jC = g1.c(j10);
        if (jC < 4611686018427387903L) {
            p000do.b.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, kVar);
            p0(jNanoTime, aVar);
            n.a(kVar, aVar);
        }
    }

    public final void b0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59839e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f59839e, this, null, g1.f59856b)) {
                    return;
                }
            } else if (obj instanceof io.r) {
                ((io.r) obj).d();
                return;
            } else {
                if (obj == g1.f59856b) {
                    return;
                }
                io.r rVar = new io.r(8, true);
                p.i(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f59839e, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable c0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59839e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof io.r) {
                p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                io.r rVar = (io.r) obj;
                Object objM = rVar.m();
                if (objM != io.r.f71309h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.a.a(f59839e, this, obj, rVar.l());
            } else {
                if (obj == g1.f59856b) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f59839e, this, obj, null)) {
                    p.i(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void d0(@NotNull Runnable runnable) {
        e0();
        if (i0(runnable)) {
            Z();
        } else {
            n0.f59868h.d0(runnable);
        }
    }

    @Override // p000do.h0
    public final void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        d0(runnable);
    }

    public final void e0() {
        c cVarI;
        d dVar = (d) f59840f.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        p000do.b.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                c cVarB = dVar.b();
                if (cVarB != null) {
                    c cVar = cVarB;
                    cVarI = cVar.g(jNanoTime) ? i0(cVar) : false ? dVar.i(0) : null;
                }
            }
        } while (cVarI != null);
    }

    public final boolean i0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f59839e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (d()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f59839e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof io.r) {
                p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                io.r rVar = (io.r) obj;
                int iA = rVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.a.a(f59839e, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == g1.f59856b) {
                    return false;
                }
                io.r rVar2 = new io.r(8, true);
                p.i(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(runnable);
                if (androidx.concurrent.futures.a.a(f59839e, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean m0() {
        if (!T()) {
            return false;
        }
        d dVar = (d) f59840f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f59839e.get(this);
        if (obj != null) {
            if (obj instanceof io.r) {
                return ((io.r) obj).j();
            }
            if (obj != g1.f59856b) {
                return false;
            }
        }
        return true;
    }

    public final void n0() {
        c cVarJ;
        p000do.b.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f59840f.get(this);
            if (dVar == null || (cVarJ = dVar.j()) == null) {
                return;
            } else {
                Y(jNanoTime, cVarJ);
            }
        }
    }

    public final void o0() {
        f59839e.set(this, null);
        f59840f.set(this, null);
    }

    public final void p0(long j10, @NotNull c cVar) {
        int iQ0 = q0(j10, cVar);
        if (iQ0 == 0) {
            if (t0(cVar)) {
                Z();
            }
        } else if (iQ0 == 1) {
            Y(j10, cVar);
        } else if (iQ0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final int q0(long j10, c cVar) {
        if (d()) {
            return 1;
        }
        d dVar = (d) f59840f.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(f59840f, this, null, new d(j10));
            Object obj = f59840f.get(this);
            p.h(obj);
            dVar = (d) obj;
        }
        return cVar.f(j10, dVar, this);
    }

    @NotNull
    public final y0 r0(long j10, @NotNull Runnable runnable) {
        long jC = g1.c(j10);
        if (jC >= 4611686018427387903L) {
            return a2.f59823b;
        }
        p000do.b.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        p0(jNanoTime, bVar);
        return bVar;
    }

    public final void s0(boolean z10) {
        f59841g.set(this, z10 ? 1 : 0);
    }

    @Override // p000do.c1
    public void shutdown() {
        m2.f59866a.c();
        s0(true);
        b0();
        while (U() <= 0) {
        }
        n0();
    }

    public final boolean t0(c cVar) {
        d dVar = (d) f59840f.get(this);
        return (dVar != null ? dVar.f() : null) == cVar;
    }
}
