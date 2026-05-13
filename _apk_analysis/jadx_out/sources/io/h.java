package io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.c1;
import p000do.m2;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class h<T> extends kotlinx.coroutines.f<T> implements jn.c, hn.c<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71038i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final p000do.h0 f71039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final hn.c<T> f71040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Object f71041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Object f71042h;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull p000do.h0 h0Var, @NotNull hn.c<? super T> cVar) {
        super(-1);
        this.f71039e = h0Var;
        this.f71040f = cVar;
        this.f71041g = i.f71043a;
        this.f71042h = l0.g(getContext());
    }

    @Override // kotlinx.coroutines.f
    @NotNull
    public hn.c<T> f() {
        return this;
    }

    @Override // jn.c
    @Nullable
    public jn.c getCallerFrame() {
        hn.c<T> cVar = this.f71040f;
        if (cVar instanceof jn.c) {
            return (jn.c) cVar;
        }
        return null;
    }

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return this.f71040f.getContext();
    }

    @Override // kotlinx.coroutines.f
    @Nullable
    public Object j() {
        Object obj = this.f71041g;
        this.f71041g = i.f71043a;
        return obj;
    }

    public final void k() {
        while (f71038i.get(this) == i.f71044b) {
        }
    }

    @Nullable
    public final kotlinx.coroutines.c<T> l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71038i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f71038i.set(this, i.f71044b);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.c) {
                if (androidx.concurrent.futures.a.a(f71038i, this, obj, i.f71044b)) {
                    return (kotlinx.coroutines.c) obj;
                }
            } else if (obj != i.f71044b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void m(@NotNull kotlin.coroutines.d dVar, T t10) {
        this.f71041g = t10;
        this.f73318d = 1;
        this.f71039e.dispatchYield(dVar, this);
    }

    public final kotlinx.coroutines.c<?> n() {
        Object obj = f71038i.get(this);
        if (obj instanceof kotlinx.coroutines.c) {
            return (kotlinx.coroutines.c) obj;
        }
        return null;
    }

    public final boolean r() {
        return f71038i.get(this) != null;
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        Object objB = p000do.z.b(obj);
        if (i.d(this.f71039e, getContext())) {
            this.f71041g = objB;
            this.f73318d = 0;
            i.c(this.f71039e, getContext(), this);
            return;
        }
        c1 c1VarB = m2.f59866a.b();
        if (c1VarB.S()) {
            this.f71041g = objB;
            this.f73318d = 0;
            c1VarB.O(this);
            return;
        }
        c1VarB.Q(true);
        try {
            kotlin.coroutines.d context = getContext();
            Object objI = l0.i(context, this.f71042h);
            try {
                this.f71040f.resumeWith(obj);
                bn.r rVar = bn.r.f5635a;
                while (c1VarB.V()) {
                }
            } finally {
                l0.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.f71039e + ", " + p000do.m0.c(this.f71040f) + ']';
    }

    public final boolean u(@NotNull Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71038i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0 e0Var = i.f71044b;
            if (tn.p.f(obj, e0Var)) {
                if (androidx.concurrent.futures.a.a(f71038i, this, e0Var, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f71038i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void v() {
        k();
        kotlinx.coroutines.c<?> cVarN = n();
        if (cVarN != null) {
            cVarN.u();
        }
    }

    @Nullable
    public final Throwable w(@NotNull p000do.k<?> kVar) {
        e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71038i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0Var = i.f71044b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f71038i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f71038i, this, e0Var, kVar));
        return null;
    }
}
