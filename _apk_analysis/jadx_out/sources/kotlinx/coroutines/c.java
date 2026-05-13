package kotlinx.coroutines;

import bn.r;
import io.b0;
import io.e0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.d;
import kotlinx.coroutines.b;
import kotlinx.coroutines.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.a2;
import p000do.b2;
import p000do.h0;
import p000do.j0;
import p000do.k;
import p000do.m;
import p000do.m0;
import p000do.n;
import p000do.o;
import p000do.p;
import p000do.s2;
import p000do.u0;
import p000do.x;
import p000do.y;
import p000do.y0;
import p000do.z;
import sn.l;
import sn.q;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public class c<T> extends f<T> implements k<T>, jn.c, s2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73267g = AtomicIntegerFieldUpdater.newUpdater(c.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73268h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73269i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final hn.c<T> f73270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f73271f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull hn.c<? super T> cVar, int i10) {
        super(i10);
        this.f73270e = cVar;
        this.f73271f = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = p000do.c.f59825b;
    }

    public static final r V(l lVar, Throwable th2, Object obj, kotlin.coroutines.d dVar) {
        lVar.invoke(th2);
        return r.f5635a;
    }

    public static /* synthetic */ void X(c cVar, Object obj, int i10, q qVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            qVar = null;
        }
        cVar.W(obj, i10, qVar);
    }

    @Override // p000do.k
    public void A(@NotNull Object obj) {
        w(this.f73318d);
    }

    @Nullable
    public final Object B() {
        g gVar;
        boolean zO = O();
        if (b0()) {
            if (z() == null) {
                L();
            }
            if (zO) {
                T();
            }
            return in.a.g();
        }
        if (zO) {
            T();
        }
        Object objC = C();
        if (objC instanceof y) {
            throw ((y) objC).f59911a;
        }
        if (!u0.b(this.f73318d) || (gVar = (g) getContext().get(g.H8)) == null || gVar.isActive()) {
            return h(objC);
        }
        CancellationException cancellationExceptionB = gVar.B();
        c(objC, cancellationExceptionB);
        throw cancellationExceptionB;
    }

    @Nullable
    public final Object C() {
        return f73268h.get(this);
    }

    @Override // p000do.k
    @Nullable
    public Object D(@NotNull Throwable th2) {
        return a0(new y(th2, false, 2, null), null, null);
    }

    @Override // p000do.k
    @Nullable
    public <R extends T> Object E(R r10, @Nullable Object obj, @Nullable q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        return a0(r10, obj, qVar);
    }

    public final String G() {
        Object objC = C();
        return objC instanceof b2 ? "Active" : objC instanceof o ? "Cancelled" : "Completed";
    }

    public void K() {
        y0 y0VarL = L();
        if (y0VarL != null && d()) {
            y0VarL.dispose();
            f73269i.set(this, a2.f59823b);
        }
    }

    public final y0 L() {
        g gVar = (g) getContext().get(g.H8);
        if (gVar == null) {
            return null;
        }
        y0 y0VarO = JobKt__JobKt.o(gVar, false, new p(this), 1, null);
        androidx.concurrent.futures.a.a(f73269i, this, null, y0VarO);
        return y0VarO;
    }

    public final void M(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73268h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p000do.c) {
                if (androidx.concurrent.futures.a.a(f73268h, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof b) || (obj2 instanceof b0)) {
                Q(obj, obj2);
            } else {
                boolean z10 = obj2 instanceof y;
                if (z10) {
                    y yVar = (y) obj2;
                    if (!yVar.c()) {
                        Q(obj, obj2);
                    }
                    if (obj2 instanceof o) {
                        if (!z10) {
                            yVar = null;
                        }
                        Throwable th2 = yVar != null ? yVar.f59911a : null;
                        if (obj instanceof b) {
                            m((b) obj, th2);
                            return;
                        } else {
                            tn.p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            q((b0) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof x) {
                    x xVar = (x) obj2;
                    if (xVar.f59904b != null) {
                        Q(obj, obj2);
                    }
                    if (obj instanceof b0) {
                        return;
                    }
                    tn.p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    b bVar = (b) obj;
                    if (xVar.c()) {
                        m(bVar, xVar.f59907e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.a.a(f73268h, this, obj2, x.b(xVar, null, bVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof b0) {
                        return;
                    }
                    tn.p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.a.a(f73268h, this, obj2, new x(obj2, (b) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void N(@NotNull b bVar) {
        M(bVar);
    }

    public final boolean O() {
        if (u0.c(this.f73318d)) {
            hn.c<T> cVar = this.f73270e;
            tn.p.i(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((io.h) cVar).r()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000do.k
    public void P(@NotNull l<? super Throwable, r> lVar) {
        n.c(this, new b.a(lVar));
    }

    public final void Q(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @NotNull
    public String R() {
        return "CancellableContinuation";
    }

    public final void S(@NotNull Throwable th2) {
        if (r(th2)) {
            return;
        }
        a(th2);
        v();
    }

    public final void T() {
        Throwable thW;
        hn.c<T> cVar = this.f73270e;
        io.h hVar = cVar instanceof io.h ? (io.h) cVar : null;
        if (hVar == null || (thW = hVar.w(this)) == null) {
            return;
        }
        u();
        a(thW);
    }

    public final boolean U() {
        Object obj = f73268h.get(this);
        if ((obj instanceof x) && ((x) obj).f59906d != null) {
            u();
            return false;
        }
        f73267g.set(this, 536870911);
        f73268h.set(this, p000do.c.f59825b);
        return true;
    }

    public final <R> void W(R r10, int i10, @Nullable q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73268h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof b2)) {
                if (obj instanceof o) {
                    o oVar = (o) obj;
                    if (oVar.e()) {
                        if (qVar != null) {
                            n(qVar, oVar.f59911a, r10);
                            return;
                        }
                        return;
                    }
                }
                l(r10);
                throw new KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.a.a(f73268h, this, obj, Y((b2) obj, r10, i10, qVar, null)));
        v();
        w(i10);
    }

    public final <R> Object Y(b2 b2Var, R r10, int i10, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar, Object obj) {
        if (r10 instanceof y) {
            return r10;
        }
        if (!u0.b(i10) && obj == null) {
            return r10;
        }
        if (qVar == null && !(b2Var instanceof b) && obj == null) {
            return r10;
        }
        return new x(r10, b2Var instanceof b ? (b) b2Var : null, qVar, obj, null, 16, null);
    }

    public final boolean Z() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f73267g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f73267g.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    @Override // p000do.k
    public boolean a(@Nullable Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73268h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof b2)) {
                return false;
            }
        } while (!androidx.concurrent.futures.a.a(f73268h, this, obj, new o(this, th2, (obj instanceof b) || (obj instanceof b0))));
        b2 b2Var = (b2) obj;
        if (b2Var instanceof b) {
            m((b) obj, th2);
        } else if (b2Var instanceof b0) {
            q((b0) obj, th2);
        }
        v();
        w(this.f73318d);
        return true;
    }

    public final <R> e0 a0(R r10, Object obj, q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73268h;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof b2)) {
                if ((obj2 instanceof x) && obj != null && ((x) obj2).f59906d == obj) {
                    return m.f59864a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.a.a(f73268h, this, obj2, Y((b2) obj2, r10, this.f73318d, qVar, obj)));
        v();
        return m.f59864a;
    }

    @Override // p000do.s2
    public void b(@NotNull b0<?> b0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f73267g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        M(b0Var);
    }

    public final boolean b0() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f73267g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f73267g.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    @Override // kotlinx.coroutines.f
    public void c(@Nullable Object obj, @NotNull Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73268h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof b2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof y) {
                return;
            }
            if (obj2 instanceof x) {
                x xVar = (x) obj2;
                if (!(!xVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.a.a(f73268h, this, obj2, x.b(xVar, null, null, null, null, th2, 15, null))) {
                    xVar.d(this, th2);
                    return;
                }
            } else if (androidx.concurrent.futures.a.a(f73268h, this, obj2, new x(obj2, null, null, null, th2, 14, null))) {
                return;
            }
        }
    }

    @Override // p000do.k
    public boolean d() {
        return !(C() instanceof b2);
    }

    @Override // kotlinx.coroutines.f
    @NotNull
    public final hn.c<T> f() {
        return this.f73270e;
    }

    @Override // kotlinx.coroutines.f
    @Nullable
    public Throwable g(@Nullable Object obj) {
        Throwable thG = super.g(obj);
        if (thG != null) {
            return thG;
        }
        return null;
    }

    @Override // jn.c
    @Nullable
    public jn.c getCallerFrame() {
        hn.c<T> cVar = this.f73270e;
        if (cVar instanceof jn.c) {
            return (jn.c) cVar;
        }
        return null;
    }

    @Override // p000do.k, hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return this.f73271f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.f
    public <T> T h(@Nullable Object obj) {
        return obj instanceof x ? (T) ((x) obj).f59903a : obj;
    }

    @Override // p000do.k
    public boolean isActive() {
        return C() instanceof b2;
    }

    @Override // kotlinx.coroutines.f
    @Nullable
    public Object j() {
        return C();
    }

    public final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void m(@NotNull b bVar, @Nullable Throwable th2) {
        try {
            bVar.a(th2);
        } catch (Throwable th3) {
            j0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void n(@NotNull q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar, @NotNull Throwable th2, R r10) {
        try {
            qVar.invoke(th2, r10, getContext());
        } catch (Throwable th3) {
            j0.a(getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // p000do.k
    public void p(T t10, @Nullable final l<? super Throwable, r> lVar) {
        W(t10, this.f73318d, lVar != null ? new q() { // from class: do.l
            @Override // sn.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return c.V(lVar, (Throwable) obj, obj2, (d) obj3);
            }
        } : null);
    }

    public final void q(b0<?> b0Var, Throwable th2) {
        int i10 = f73267g.get(this) & 536870911;
        if (!(i10 != 536870911)) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            b0Var.s(i10, th2, getContext());
        } catch (Throwable th3) {
            j0.a(getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final boolean r(Throwable th2) {
        if (!O()) {
            return false;
        }
        hn.c<T> cVar = this.f73270e;
        tn.p.i(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((io.h) cVar).u(th2);
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        X(this, z.c(obj, this), this.f73318d, null, 4, null);
    }

    @Override // p000do.k
    public void s(@NotNull h0 h0Var, T t10) {
        hn.c<T> cVar = this.f73270e;
        io.h hVar = cVar instanceof io.h ? (io.h) cVar : null;
        X(this, t10, (hVar != null ? hVar.f71039e : null) == h0Var ? 4 : this.f73318d, null, 4, null);
    }

    @NotNull
    public String toString() {
        return R() + '(' + m0.c(this.f73270e) + "){" + G() + "}@" + m0.b(this);
    }

    public final void u() {
        y0 y0VarZ = z();
        if (y0VarZ == null) {
            return;
        }
        y0VarZ.dispose();
        f73269i.set(this, a2.f59823b);
    }

    public final void v() {
        if (O()) {
            return;
        }
        u();
    }

    public final void w(int i10) {
        if (Z()) {
            return;
        }
        u0.a(this, i10);
    }

    @NotNull
    public Throwable x(@NotNull g gVar) {
        return gVar.B();
    }

    @Override // p000do.k
    public <R extends T> void y(R r10, @Nullable q<? super Throwable, ? super R, ? super kotlin.coroutines.d, r> qVar) {
        W(r10, this.f73318d, qVar);
    }

    public final y0 z() {
        return (y0) f73269i.get(this);
    }
}
