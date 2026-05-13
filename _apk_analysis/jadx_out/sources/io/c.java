package io;

import io.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<N extends c<N>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71029b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71030c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(@Nullable N n10) {
        this._prev$volatile = n10;
    }

    public final void c() {
        f71030c.set(this, null);
    }

    public final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.k()) {
            n10 = (N) f71030c.get(n10);
        }
        return n10;
    }

    public final N e() {
        c cVarF;
        N n10 = (N) f();
        tn.p.h(n10);
        while (n10.k() && (cVarF = n10.f()) != null) {
            n10 = (N) cVarF;
        }
        return n10;
    }

    @Nullable
    public final N f() {
        Object objG = g();
        if (objG == b.f68502a) {
            return null;
        }
        return (N) objG;
    }

    public final Object g() {
        return f71029b.get(this);
    }

    @Nullable
    public final N h() {
        return (N) f71030c.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.a.a(f71029b, this, null, b.f68502a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            c cVarD = d();
            c cVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71030c;
            do {
                obj = atomicReferenceFieldUpdater.get(cVarE);
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, cVarE, obj, ((c) obj) == null ? null : cVarD));
            if (cVarD != null) {
                f71029b.set(cVarD, cVarE);
            }
            if (!cVarE.k() || cVarE.l()) {
                if (cVarD == null || !cVarD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(@NotNull N n10) {
        return androidx.concurrent.futures.a.a(f71029b, this, null, n10);
    }
}
