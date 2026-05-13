package kotlinx.coroutines.scheduling;

import bn.r;
import io.e0;
import io.z;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import ko.g;
import ko.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.m0;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f73422i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73423j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f73424k = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73425l = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final e0 f73426m = new e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73428c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f73429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f73430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ko.c f73431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ko.c f73432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final z<c> f73433h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public static final class WorkerState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ WorkerState[] f73434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kn.a f73435c;
        public static final WorkerState CPU_ACQUIRED = new WorkerState("CPU_ACQUIRED", 0);
        public static final WorkerState BLOCKING = new WorkerState("BLOCKING", 1);
        public static final WorkerState PARKING = new WorkerState("PARKING", 2);
        public static final WorkerState DORMANT = new WorkerState("DORMANT", 3);
        public static final WorkerState TERMINATED = new WorkerState("TERMINATED", 4);

        static {
            WorkerState[] workerStateArrD = d();
            f73434b = workerStateArrD;
            f73435c = kotlin.enums.a.a(workerStateArrD);
        }

        public WorkerState(String str, int i10) {
        }

        public static final /* synthetic */ WorkerState[] d() {
            return new WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        @NotNull
        public static kn.a<WorkerState> getEntries() {
            return f73435c;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f73434b.clone();
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public final class c extends Thread {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f73436j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final k f73437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Ref$ObjectRef<g> f73438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public WorkerState f73439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f73440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f73441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f73442g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f73443h;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f73437b = new k();
            this.f73438c = new Ref$ObjectRef<>();
            this.f73439d = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f73426m;
            int iNanoTime = (int) System.nanoTime();
            this.f73442g = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public c(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            p(i10);
        }

        public final void b(g gVar) {
            this.f73440e = 0L;
            if (this.f73439d == WorkerState.PARKING) {
                this.f73439d = WorkerState.BLOCKING;
            }
            if (!gVar.f73186c) {
                CoroutineScheduler.this.F(gVar);
                return;
            }
            if (u(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.I();
            }
            CoroutineScheduler.this.F(gVar);
            CoroutineScheduler.o().addAndGet(CoroutineScheduler.this, -2097152L);
            if (this.f73439d != WorkerState.TERMINATED) {
                this.f73439d = WorkerState.DORMANT;
            }
        }

        public final g c(boolean z10) {
            g gVarM;
            g gVarM2;
            if (z10) {
                boolean z11 = k(CoroutineScheduler.this.f73427b * 2) == 0;
                if (z11 && (gVarM2 = m()) != null) {
                    return gVarM2;
                }
                g gVarK = this.f73437b.k();
                if (gVarK != null) {
                    return gVarK;
                }
                if (!z11 && (gVarM = m()) != null) {
                    return gVarM;
                }
            } else {
                g gVarM3 = m();
                if (gVarM3 != null) {
                    return gVarM3;
                }
            }
            return v(3);
        }

        public final g d() {
            g gVarL = this.f73437b.l();
            if (gVarL != null) {
                return gVarL;
            }
            g gVarE = CoroutineScheduler.this.f73432g.e();
            return gVarE == null ? v(1) : gVarE;
        }

        @Nullable
        public final g f(boolean z10) {
            return r() ? c(z10) : d();
        }

        public final int g() {
            return this.indexInArray;
        }

        @Nullable
        public final Object h() {
            return this.nextParkedWorker;
        }

        public final boolean j() {
            return this.nextParkedWorker != CoroutineScheduler.f73426m;
        }

        public final int k(int i10) {
            int i11 = this.f73442g;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f73442g = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void l() {
            if (this.f73440e == 0) {
                this.f73440e = System.nanoTime() + CoroutineScheduler.this.f73429d;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f73429d);
            if (System.nanoTime() - this.f73440e >= 0) {
                this.f73440e = 0L;
                w();
            }
        }

        public final g m() {
            if (k(2) == 0) {
                g gVarE = CoroutineScheduler.this.f73431f.e();
                return gVarE != null ? gVarE : CoroutineScheduler.this.f73432g.e();
            }
            g gVarE2 = CoroutineScheduler.this.f73432g.e();
            return gVarE2 != null ? gVarE2 : CoroutineScheduler.this.f73431f.e();
        }

        public final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f73439d != WorkerState.TERMINATED) {
                    g gVarF = f(this.f73443h);
                    if (gVarF != null) {
                        this.f73441f = 0L;
                        b(gVarF);
                    } else {
                        this.f73443h = false;
                        if (this.f73441f == 0) {
                            s();
                        } else if (z10) {
                            u(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f73441f);
                            this.f73441f = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            u(WorkerState.TERMINATED);
        }

        public final void p(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f73430e);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void q(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r() {
            boolean z10;
            if (this.f73439d != WorkerState.CPU_ACQUIRED) {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                AtomicLongFieldUpdater atomicLongFieldUpdaterO = CoroutineScheduler.o();
                while (true) {
                    long j10 = atomicLongFieldUpdaterO.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        z10 = false;
                        break;
                    }
                    if (CoroutineScheduler.o().compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L)) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f73439d = WorkerState.CPU_ACQUIRED;
            }
            return true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final void s() {
            if (!j()) {
                CoroutineScheduler.this.B(this);
                return;
            }
            f73436j.set(this, -1);
            while (j() && f73436j.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f73439d != WorkerState.TERMINATED) {
                u(WorkerState.PARKING);
                Thread.interrupted();
                l();
            }
        }

        public final boolean u(@NotNull WorkerState workerState) {
            WorkerState workerState2 = this.f73439d;
            boolean z10 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.o().addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f73439d = workerState;
            }
            return z10;
        }

        public final g v(int i10) {
            int i11 = (int) (CoroutineScheduler.o().get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iK = k(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iK++;
                if (iK > i11) {
                    iK = 1;
                }
                c cVarB = coroutineScheduler.f73433h.b(iK);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.f73437b.r(i10, this.f73438c);
                    if (jR == -1) {
                        Ref$ObjectRef<g> ref$ObjectRef = this.f73438c;
                        g gVar = ref$ObjectRef.element;
                        ref$ObjectRef.element = null;
                        return gVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f73441f = jMin;
            return null;
        }

        public final void w() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f73433h) {
                if (coroutineScheduler.isTerminated()) {
                    return;
                }
                if (((int) (CoroutineScheduler.o().get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f73427b) {
                    return;
                }
                if (f73436j.compareAndSet(this, -1, 1)) {
                    int i10 = this.indexInArray;
                    p(0);
                    coroutineScheduler.C(this, i10, 0);
                    int andDecrement = (int) (CoroutineScheduler.o().getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i10) {
                        c cVarB = coroutineScheduler.f73433h.b(andDecrement);
                        p.h(cVarB);
                        c cVar = cVarB;
                        coroutineScheduler.f73433h.c(i10, cVar);
                        cVar.p(i10);
                        coroutineScheduler.C(cVar, andDecrement, i10);
                    }
                    coroutineScheduler.f73433h.c(andDecrement, null);
                    r rVar = r.f5635a;
                    this.f73439d = WorkerState.TERMINATED;
                }
            }
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, @NotNull String str) {
        this.f73427b = i10;
        this.f73428c = i11;
        this.f73429d = j10;
        this.f73430e = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f73431f = new ko.c();
            this.f73432g = new ko.c();
            this.f73433h = new z<>((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    public static /* synthetic */ boolean L(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f73424k.get(coroutineScheduler);
        }
        return coroutineScheduler.K(j10);
    }

    public static /* synthetic */ void n(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        coroutineScheduler.m(runnable, z10, z11);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater o() {
        return f73424k;
    }

    public final c A() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73423j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f73433h.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iX = x(cVarB);
            if (iX >= 0 && f73423j.compareAndSet(this, j10, ((long) iX) | j11)) {
                cVarB.q(f73426m);
                return cVarB;
            }
        }
    }

    public final boolean B(@NotNull c cVar) {
        long j10;
        int iG;
        if (cVar.h() != f73426m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73423j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iG = cVar.g();
            cVar.q(this.f73433h.b((int) (2097151 & j10)));
        } while (!f73423j.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iG)));
        return true;
    }

    public final void C(@NotNull c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f73423j;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iX = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iX == i10) {
                iX = i11 == 0 ? x(cVar) : i11;
            }
            if (iX >= 0 && f73423j.compareAndSet(this, j10, j11 | ((long) iX))) {
                return;
            }
        }
    }

    public final void F(@NotNull g gVar) {
        try {
            gVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = w()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = r7.l()
            io.z<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r1 = r7.f73433h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = d()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            io.z<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r4 = r7.f73433h
            java.lang.Object r4 = r4.b(r1)
            tn.p.h(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            ko.k r4 = r4.f73437b
            ko.c r5 = r7.f73432g
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            ko.c r8 = r7.f73432g
            r8.b()
            ko.c r8 = r7.f73431f
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            ko.g r8 = r0.f(r2)
            if (r8 != 0) goto L8b
        L5f:
            ko.c r8 = r7.f73431f
            java.lang.Object r8 = r8.e()
            ko.g r8 = (ko.g) r8
            if (r8 != 0) goto L8b
            ko.c r8 = r7.f73432g
            java.lang.Object r8 = r8.e()
            ko.g r8 = (ko.g) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.u(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = t()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = o()
            r8.set(r7, r0)
            return
        L8b:
            r7.F(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.G(long):void");
    }

    public final void H(long j10) {
        if (M() || K(j10)) {
            return;
        }
        M();
    }

    public final void I() {
        if (M() || L(this, 0L, 1, null)) {
            return;
        }
        M();
    }

    public final g J(c cVar, g gVar, boolean z10) {
        WorkerState workerState;
        if (cVar == null || (workerState = cVar.f73439d) == WorkerState.TERMINATED) {
            return gVar;
        }
        if (!gVar.f73186c && workerState == WorkerState.BLOCKING) {
            return gVar;
        }
        cVar.f73443h = true;
        return cVar.f73437b.a(gVar, z10);
    }

    public final boolean K(long j10) {
        if (n.e(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f73427b) {
            int iH = h();
            if (iH == 1 && this.f73427b > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean M() {
        c cVarA;
        do {
            cVarA = A();
            if (cVarA == null) {
                return false;
            }
        } while (!c.f73436j.compareAndSet(cVarA, -1, 0));
        LockSupport.unpark(cVarA);
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        G(10000L);
    }

    public final boolean e(g gVar) {
        return gVar.f73186c ? this.f73432g.a(gVar) : this.f73431f.a(gVar);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        n(this, runnable, false, false, 6, null);
    }

    public final int h() {
        synchronized (this.f73433h) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = f73424k.get(this);
            int i10 = (int) (j10 & 2097151);
            int iE = n.e(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (iE >= this.f73427b) {
                return 0;
            }
            if (i10 >= this.f73428c) {
                return 0;
            }
            int i11 = ((int) (o().get(this) & 2097151)) + 1;
            if (!(i11 > 0 && this.f73433h.b(i11) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(this, i11);
            this.f73433h.c(i11, cVar);
            if (!(i11 == ((int) (2097151 & f73424k.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i12 = iE + 1;
            cVar.start();
            return i12;
        }
    }

    public final boolean isTerminated() {
        return f73425l.get(this) == 1;
    }

    @NotNull
    public final g k(@NotNull Runnable runnable, boolean z10) {
        long jA = ko.i.f73193f.a();
        if (!(runnable instanceof g)) {
            return ko.i.b(runnable, jA, z10);
        }
        g gVar = (g) runnable;
        gVar.f73185b = jA;
        gVar.f73186c = z10;
        return gVar;
    }

    public final c l() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !p.f(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void m(@NotNull Runnable runnable, boolean z10, boolean z11) {
        p000do.b.a();
        g gVarK = k(runnable, z10);
        boolean z12 = gVarK.f73186c;
        long jAddAndGet = z12 ? f73424k.addAndGet(this, 2097152L) : 0L;
        g gVarJ = J(l(), gVarK, z11);
        if (gVarJ != null && !e(gVarJ)) {
            throw new RejectedExecutionException(this.f73430e + " was terminated");
        }
        if (z12) {
            H(jAddAndGet);
        } else {
            I();
        }
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f73433h.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.f73433h.b(i15);
            if (cVarB != null) {
                int i16 = cVarB.f73437b.i();
                int i17 = b.$EnumSwitchMapping$0[cVarB.f73439d.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f73424k.get(this);
        return this.f73430e + '@' + m0.b(this) + "[Pool Size {core = " + this.f73427b + ", max = " + this.f73428c + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f73431f.c() + ", global blocking queue size = " + this.f73432g.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f73427b - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final int x(c cVar) {
        Object objH = cVar.h();
        while (objH != f73426m) {
            if (objH == null) {
                return 0;
            }
            c cVar2 = (c) objH;
            int iG = cVar2.g();
            if (iG != 0) {
                return iG;
            }
            objH = cVar2.h();
        }
        return -1;
    }
}
