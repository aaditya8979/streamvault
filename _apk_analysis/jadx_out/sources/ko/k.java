package ko;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73195b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73196c = AtomicIntegerFieldUpdater.newUpdater(k.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73197d = AtomicIntegerFieldUpdater.newUpdater(k.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73198e = AtomicIntegerFieldUpdater.newUpdater(k.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReferenceArray<g> f73199a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    @Nullable
    public final g a(@NotNull g gVar, boolean z10) {
        if (z10) {
            return b(gVar);
        }
        g gVar2 = (g) f73195b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        if (e() == 127) {
            return gVar;
        }
        if (gVar.f73186c) {
            f73198e.incrementAndGet(this);
        }
        int i10 = f73196c.get(this) & 127;
        while (this.f73199a.get(i10) != null) {
            Thread.yield();
        }
        this.f73199a.lazySet(i10, gVar);
        f73196c.incrementAndGet(this);
        return null;
    }

    public final void c(g gVar) {
        if (gVar == null || !gVar.f73186c) {
            return;
        }
        f73198e.decrementAndGet(this);
    }

    public final int e() {
        return f73196c.get(this) - f73197d.get(this);
    }

    public final int i() {
        return f73195b.get(this) != null ? e() + 1 : e();
    }

    public final void j(@NotNull c cVar) {
        g gVar = (g) f73195b.getAndSet(this, null);
        if (gVar != null) {
            cVar.a(gVar);
        }
        while (n(cVar)) {
        }
    }

    @Nullable
    public final g k() {
        g gVar = (g) f73195b.getAndSet(this, null);
        return gVar == null ? m() : gVar;
    }

    @Nullable
    public final g l() {
        return o(true);
    }

    public final g m() {
        g andSet;
        while (true) {
            int i10 = f73197d.get(this);
            if (i10 - f73196c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f73197d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f73199a.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    public final boolean n(c cVar) {
        g gVarM = m();
        if (gVarM == null) {
            return false;
        }
        cVar.a(gVarM);
        return true;
    }

    public final g o(boolean z10) {
        g gVar;
        do {
            gVar = (g) f73195b.get(this);
            if (gVar == null || gVar.f73186c != z10) {
                int i10 = f73197d.get(this);
                int i11 = f73196c.get(this);
                while (i10 != i11) {
                    if (z10 && f73198e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    g gVarQ = q(i11, z10);
                    if (gVarQ != null) {
                        return gVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.a.a(f73195b, this, gVar, null));
        return gVar;
    }

    public final g p(int i10) {
        int i11 = f73197d.get(this);
        int i12 = f73196c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f73198e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            g gVarQ = q(i11, z10);
            if (gVarQ != null) {
                return gVarQ;
            }
            i11 = i13;
        }
        return null;
    }

    public final g q(int i10, boolean z10) {
        int i11 = i10 & 127;
        g gVar = this.f73199a.get(i11);
        if (gVar == null || gVar.f73186c != z10 || !wl.c.a(this.f73199a, i11, gVar, null)) {
            return null;
        }
        if (z10) {
            f73198e.decrementAndGet(this);
        }
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int i10, @NotNull Ref$ObjectRef<g> ref$ObjectRef) {
        T tM = i10 == 3 ? m() : p(i10);
        if (tM == 0) {
            return s(i10, ref$ObjectRef);
        }
        ref$ObjectRef.element = tM;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, ko.g] */
    public final long s(int i10, Ref$ObjectRef<g> ref$ObjectRef) {
        ?? r02;
        do {
            r02 = (g) f73195b.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (((r02.f73186c ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = i.f73193f.a() - r02.f73185b;
            long j10 = i.f73189b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.a.a(f73195b, this, r02, null));
        ref$ObjectRef.element = r02;
        return -1L;
    }
}
