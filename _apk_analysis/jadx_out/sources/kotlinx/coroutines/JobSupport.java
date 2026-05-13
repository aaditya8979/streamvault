package kotlinx.coroutines;

import ao.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.g;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.a2;
import p000do.b1;
import p000do.c2;
import p000do.d2;
import p000do.e2;
import p000do.m0;
import p000do.n;
import p000do.n1;
import p000do.o1;
import p000do.q;
import p000do.q1;
import p000do.r;
import p000do.r1;
import p000do.s;
import p000do.t1;
import p000do.u1;
import p000do.v1;
import p000do.y;
import p000do.y0;
import p000do.z1;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public class JobSupport implements g, s, c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73250b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73251c = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class a<T> extends kotlinx.coroutines.c<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final JobSupport f73252j;

        public a(@NotNull hn.c<? super T> cVar, @NotNull JobSupport jobSupport) {
            super(cVar, 1);
            this.f73252j = jobSupport;
        }

        @Override // kotlinx.coroutines.c
        @NotNull
        public String R() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.c
        @NotNull
        public Throwable x(@NotNull g gVar) {
            Throwable thE;
            Object objU0 = this.f73252j.u0();
            return (!(objU0 instanceof c) || (thE = ((c) objU0).e()) == null) ? objU0 instanceof y ? ((y) objU0).f59911a : gVar.B() : thE;
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class b extends u1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final JobSupport f73253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final c f73254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final r f73255h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final Object f73256i;

        public b(@NotNull JobSupport jobSupport, @NotNull c cVar, @NotNull r rVar, @Nullable Object obj) {
            this.f73253f = jobSupport;
            this.f73254g = cVar;
            this.f73255h = rVar;
            this.f73256i = obj;
        }

        @Override // p000do.u1
        public boolean u() {
            return false;
        }

        @Override // p000do.u1
        public void v(@Nullable Throwable th2) {
            this.f73253f.i0(this.f73254g, this.f73255h, this.f73256i);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class c implements o1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f73257c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f73258d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f73259e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final z1 f73260b;

        public c(@NotNull z1 z1Var, boolean z10, @Nullable Throwable th2) {
            this.f73260b = z1Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        public final void a(@NotNull Throwable th2) {
            Throwable thE = e();
            if (thE == null) {
                o(th2);
                return;
            }
            if (th2 == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                n(th2);
                return;
            }
            if (objD instanceof Throwable) {
                if (th2 == objD) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th2);
                n(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        @Override // p000do.o1
        @NotNull
        public z1 b() {
            return this.f73260b;
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Object d() {
            return f73259e.get(this);
        }

        @Nullable
        public final Throwable e() {
            return (Throwable) f73258d.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // p000do.o1
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f73257c.get(this) == 1;
        }

        public final boolean k() {
            return d() == v1.f59896e;
        }

        @NotNull
        public final List<Throwable> l(@Nullable Throwable th2) {
            ArrayList<Throwable> arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th2 != null && !p.f(th2, thE)) {
                arrayListC.add(th2);
            }
            n(v1.f59896e);
            return arrayListC;
        }

        public final void m(boolean z10) {
            f73257c.set(this, z10 ? 1 : 0);
        }

        public final void n(Object obj) {
            f73259e.set(this, obj);
        }

        public final void o(@Nullable Throwable th2) {
            f73258d.set(this, th2);
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public final class d extends u1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final lo.f<?> f73261f;

        public d(@NotNull lo.f<?> fVar) {
            this.f73261f = fVar;
        }

        @Override // p000do.u1
        public boolean u() {
            return false;
        }

        @Override // p000do.u1
        public void v(@Nullable Throwable th2) {
            Object objU0 = JobSupport.this.u0();
            if (!(objU0 instanceof y)) {
                objU0 = v1.h(objU0);
            }
            this.f73261f.e(JobSupport.this, objU0);
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public final class e extends u1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final lo.f<?> f73263f;

        public e(@NotNull lo.f<?> fVar) {
            this.f73263f = fVar;
        }

        @Override // p000do.u1
        public boolean u() {
            return false;
        }

        @Override // p000do.u1
        public void v(@Nullable Throwable th2) {
            this.f73263f.e(JobSupport.this, bn.r.f5635a);
        }
    }

    public JobSupport(boolean z10) {
        this._state$volatile = z10 ? v1.f59898g : v1.f59897f;
    }

    public static /* synthetic */ CancellationException Y0(JobSupport jobSupport, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return jobSupport.X0(th2, str);
    }

    @NotNull
    public final y0 A0(boolean z10, @NotNull u1 u1Var) {
        boolean z11;
        boolean zC;
        u1Var.w(this);
        while (true) {
            Object objU0 = u0();
            z11 = true;
            if (!(objU0 instanceof b1)) {
                if (!(objU0 instanceof o1)) {
                    z11 = false;
                    break;
                }
                o1 o1Var = (o1) objU0;
                z1 z1VarB = o1Var.b();
                if (z1VarB == null) {
                    p.i(objU0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    R0((u1) objU0);
                } else {
                    if (u1Var.u()) {
                        c cVar = o1Var instanceof c ? (c) o1Var : null;
                        Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (z10) {
                                u1Var.v(thE);
                            }
                            return a2.f59823b;
                        }
                        zC = z1VarB.c(u1Var, 5);
                    } else {
                        zC = z1VarB.c(u1Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                b1 b1Var = (b1) objU0;
                if (!b1Var.isActive()) {
                    Q0(b1Var);
                } else if (androidx.concurrent.futures.a.a(f73250b, this, objU0, u1Var)) {
                    break;
                }
            }
        }
        if (z11) {
            return u1Var;
        }
        if (z10) {
            Object objU02 = u0();
            y yVar = objU02 instanceof y ? (y) objU02 : null;
            u1Var.v(yVar != null ? yVar.f59911a : null);
        }
        return a2.f59823b;
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public final CancellationException B() {
        Object objU0 = u0();
        if (!(objU0 instanceof c)) {
            if (objU0 instanceof o1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objU0 instanceof y) {
                return Y0(this, ((y) objU0).f59911a, null, 1, null);
            }
            return new JobCancellationException(m0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objU0).e();
        if (thE != null) {
            CancellationException cancellationExceptionX0 = X0(thE, m0.a(this) + " is cancelling");
            if (cancellationExceptionX0 != null) {
                return cancellationExceptionX0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public boolean B0() {
        return false;
    }

    @Override // kotlinx.coroutines.g
    @Nullable
    public final Object C(@NotNull hn.c<? super bn.r> cVar) {
        if (C0()) {
            Object objD0 = D0(cVar);
            return objD0 == in.a.g() ? objD0 : bn.r.f5635a;
        }
        t1.k(cVar.getContext());
        return bn.r.f5635a;
    }

    public final boolean C0() {
        Object objU0;
        do {
            objU0 = u0();
            if (!(objU0 instanceof o1)) {
                return false;
            }
        } while (V0(objU0) < 0);
        return true;
    }

    public final Object D0(hn.c<? super bn.r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        n.a(cVar2, JobKt__JobKt.o(this, false, new e2(cVar2), 1, null));
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB == in.a.g() ? objB : bn.r.f5635a;
    }

    public final Object E0(Object obj) throws Throwable {
        Throwable thJ0 = null;
        while (true) {
            Object objU0 = u0();
            if (objU0 instanceof c) {
                synchronized (objU0) {
                    if (((c) objU0).k()) {
                        return v1.f59895d;
                    }
                    boolean zI = ((c) objU0).i();
                    if (obj != null || !zI) {
                        if (thJ0 == null) {
                            thJ0 = j0(obj);
                        }
                        ((c) objU0).a(thJ0);
                    }
                    Throwable thE = zI ^ true ? ((c) objU0).e() : null;
                    if (thE != null) {
                        J0(((c) objU0).b(), thE);
                    }
                    return v1.f59892a;
                }
            }
            if (!(objU0 instanceof o1)) {
                return v1.f59895d;
            }
            if (thJ0 == null) {
                thJ0 = j0(obj);
            }
            o1 o1Var = (o1) objU0;
            if (!o1Var.isActive()) {
                Object objC1 = c1(objU0, new y(thJ0, false, 2, null));
                if (objC1 == v1.f59892a) {
                    throw new IllegalStateException(("Cannot happen in " + objU0).toString());
                }
                if (objC1 != v1.f59894c) {
                    return objC1;
                }
            } else if (b1(o1Var, thJ0)) {
                return v1.f59892a;
            }
        }
    }

    public final boolean F0(@Nullable Object obj) {
        Object objC1;
        do {
            objC1 = c1(u0(), obj);
            if (objC1 == v1.f59892a) {
                return false;
            }
            if (objC1 == v1.f59893b) {
                return true;
            }
        } while (objC1 == v1.f59894c);
        W(objC1);
        return true;
    }

    @Override // p000do.c2
    @NotNull
    public CancellationException G() {
        Throwable thE;
        Object objU0 = u0();
        if (objU0 instanceof c) {
            thE = ((c) objU0).e();
        } else if (objU0 instanceof y) {
            thE = ((y) objU0).f59911a;
        } else {
            if (objU0 instanceof o1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objU0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + W0(objU0), thE, this);
    }

    @Nullable
    public final Object G0(@Nullable Object obj) {
        Object objC1;
        do {
            objC1 = c1(u0(), obj);
            if (objC1 == v1.f59892a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m0(obj));
            }
        } while (objC1 == v1.f59894c);
        return objC1;
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public final q H(@NotNull s sVar) {
        boolean z10;
        Throwable thE;
        r rVar = new r(sVar);
        rVar.w(this);
        while (true) {
            Object objU0 = u0();
            z10 = true;
            if (!(objU0 instanceof b1)) {
                if (!(objU0 instanceof o1)) {
                    z10 = false;
                    break;
                }
                z1 z1VarB = ((o1) objU0).b();
                if (z1VarB == null) {
                    p.i(objU0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    R0((u1) objU0);
                } else if (!z1VarB.c(rVar, 7)) {
                    boolean zC = z1VarB.c(rVar, 3);
                    Object objU02 = u0();
                    if (objU02 instanceof c) {
                        thE = ((c) objU02).e();
                    } else {
                        y yVar = objU02 instanceof y ? (y) objU02 : null;
                        thE = yVar != null ? yVar.f59911a : null;
                    }
                    rVar.v(thE);
                    if (!zC) {
                        return a2.f59823b;
                    }
                }
            } else {
                b1 b1Var = (b1) objU0;
                if (!b1Var.isActive()) {
                    Q0(b1Var);
                } else if (androidx.concurrent.futures.a.a(f73250b, this, objU0, rVar)) {
                    break;
                }
            }
        }
        if (z10) {
            return rVar;
        }
        Object objU03 = u0();
        y yVar2 = objU03 instanceof y ? (y) objU03 : null;
        rVar.v(yVar2 != null ? yVar2.f59911a : null);
        return a2.f59823b;
    }

    @NotNull
    public String H0() {
        return m0.a(this);
    }

    public final r I0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.p()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.l();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.k();
            if (!lockFreeLinkedListNode.p()) {
                if (lockFreeLinkedListNode instanceof r) {
                    return (r) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof z1) {
                    return null;
                }
            }
        }
    }

    @Override // p000do.s
    public final void J(@NotNull c2 c2Var) throws Throwable {
        a0(c2Var);
    }

    public final void J0(z1 z1Var, Throwable th2) throws Throwable {
        N0(th2);
        z1Var.f(4);
        Object objJ = z1Var.j();
        p.i(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeK = (LockFreeLinkedListNode) objJ; !p.f(lockFreeLinkedListNodeK, z1Var); lockFreeLinkedListNodeK = lockFreeLinkedListNodeK.k()) {
            if ((lockFreeLinkedListNodeK instanceof u1) && ((u1) lockFreeLinkedListNodeK).u()) {
                try {
                    ((u1) lockFreeLinkedListNodeK).v(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        bn.d.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeK + " for " + this, th3);
                        bn.r rVar = bn.r.f5635a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            y0(completionHandlerException);
        }
        d0(th2);
    }

    public final void K0(z1 z1Var, Throwable th2) throws Throwable {
        z1Var.f(1);
        Object objJ = z1Var.j();
        p.i(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeK = (LockFreeLinkedListNode) objJ; !p.f(lockFreeLinkedListNodeK, z1Var); lockFreeLinkedListNodeK = lockFreeLinkedListNodeK.k()) {
            if (lockFreeLinkedListNodeK instanceof u1) {
                try {
                    ((u1) lockFreeLinkedListNodeK).v(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        bn.d.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeK + " for " + this, th3);
                        bn.r rVar = bn.r.f5635a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            y0(completionHandlerException);
        }
    }

    public final Object L0(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof y) {
            throw ((y) obj2).f59911a;
        }
        return obj2;
    }

    public final void M0(lo.f<?> fVar, Object obj) {
        Object objU0;
        do {
            objU0 = u0();
            if (!(objU0 instanceof o1)) {
                if (!(objU0 instanceof y)) {
                    objU0 = v1.h(objU0);
                }
                fVar.c(objU0);
                return;
            }
        } while (V0(objU0) < 0);
        fVar.d(JobKt__JobKt.o(this, false, new d(fVar), 1, null));
    }

    public void N0(@Nullable Throwable th2) {
    }

    public void O0(@Nullable Object obj) {
    }

    public void P0() {
    }

    public final void Q0(b1 b1Var) {
        z1 z1Var = new z1();
        Object n1Var = z1Var;
        if (!b1Var.isActive()) {
            n1Var = new n1(z1Var);
        }
        androidx.concurrent.futures.a.a(f73250b, this, b1Var, n1Var);
    }

    public final void R0(u1 u1Var) {
        u1Var.e(new z1());
        androidx.concurrent.futures.a.a(f73250b, this, u1Var, u1Var.k());
    }

    public final void S0(lo.f<?> fVar, Object obj) {
        if (C0()) {
            fVar.d(JobKt__JobKt.o(this, false, new e(fVar), 1, null));
        } else {
            fVar.c(bn.r.f5635a);
        }
    }

    public final void T0(@NotNull u1 u1Var) {
        Object objU0;
        do {
            objU0 = u0();
            if (!(objU0 instanceof u1)) {
                if (!(objU0 instanceof o1) || ((o1) objU0).b() == null) {
                    return;
                }
                u1Var.q();
                return;
            }
            if (objU0 != u1Var) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f73250b, this, objU0, v1.f59898g));
    }

    public final void U0(@Nullable q qVar) {
        f73251c.set(this, qVar);
    }

    public final void V(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                bn.d.a(th2, th3);
            }
        }
    }

    public final int V0(Object obj) {
        if (obj instanceof b1) {
            if (((b1) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.a.a(f73250b, this, obj, v1.f59898g)) {
                return -1;
            }
            P0();
            return 1;
        }
        if (!(obj instanceof n1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f73250b, this, obj, ((n1) obj).b())) {
            return -1;
        }
        P0();
        return 1;
    }

    public void W(@Nullable Object obj) {
    }

    public final String W0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof o1 ? ((o1) obj).isActive() ? "Active" : "New" : obj instanceof y ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    @Nullable
    public final Object X(@NotNull hn.c<Object> cVar) throws Throwable {
        Object objU0;
        do {
            objU0 = u0();
            if (!(objU0 instanceof o1)) {
                if (objU0 instanceof y) {
                    throw ((y) objU0).f59911a;
                }
                return v1.h(objU0);
            }
        } while (V0(objU0) < 0);
        return Y(cVar);
    }

    @NotNull
    public final CancellationException X0(@NotNull Throwable th2, @Nullable String str) {
        CancellationException jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = e0();
            }
            jobCancellationException = new JobCancellationException(str, th2, this);
        }
        return jobCancellationException;
    }

    public final Object Y(hn.c<Object> cVar) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), this);
        aVar.K();
        n.a(aVar, JobKt__JobKt.o(this, false, new d2(aVar), 1, null));
        Object objB = aVar.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB;
    }

    public final boolean Z(@Nullable Throwable th2) {
        return a0(th2);
    }

    @NotNull
    public final String Z0() {
        return H0() + '{' + W0(u0()) + '}';
    }

    public final boolean a0(@Nullable Object obj) throws Throwable {
        Object objE0 = v1.f59892a;
        if (q0() && (objE0 = c0(obj)) == v1.f59893b) {
            return true;
        }
        if (objE0 == v1.f59892a) {
            objE0 = E0(obj);
        }
        if (objE0 == v1.f59892a || objE0 == v1.f59893b) {
            return true;
        }
        if (objE0 == v1.f59895d) {
            return false;
        }
        W(objE0);
        return true;
    }

    public final boolean a1(o1 o1Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.a.a(f73250b, this, o1Var, v1.g(obj))) {
            return false;
        }
        N0(null);
        O0(obj);
        h0(o1Var, obj);
        return true;
    }

    public void b0(@NotNull Throwable th2) throws Throwable {
        a0(th2);
    }

    public final boolean b1(o1 o1Var, Throwable th2) throws Throwable {
        z1 z1VarR0 = r0(o1Var);
        if (z1VarR0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f73250b, this, o1Var, new c(z1VarR0, false, th2))) {
            return false;
        }
        J0(z1VarR0, th2);
        return true;
    }

    public final Object c0(Object obj) {
        Object objC1;
        do {
            Object objU0 = u0();
            if (!(objU0 instanceof o1) || ((objU0 instanceof c) && ((c) objU0).j())) {
                return v1.f59892a;
            }
            objC1 = c1(objU0, new y(j0(obj), false, 2, null));
        } while (objC1 == v1.f59894c);
        return objC1;
    }

    public final Object c1(Object obj, Object obj2) {
        return !(obj instanceof o1) ? v1.f59892a : ((!(obj instanceof b1) && !(obj instanceof u1)) || (obj instanceof r) || (obj2 instanceof y)) ? d1((o1) obj, obj2) : a1((o1) obj, obj2) ? obj2 : v1.f59894c;
    }

    @Override // kotlinx.coroutines.g, fo.o
    public void cancel(@Nullable CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(e0(), null, this);
        }
        b0(cancellationException);
    }

    @Override // kotlinx.coroutines.g
    public final boolean d() {
        return !(u0() instanceof o1);
    }

    public final boolean d0(Throwable th2) {
        if (B0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        q qVarT0 = t0();
        return (qVarT0 == null || qVarT0 == a2.f59823b) ? z10 : qVarT0.a(th2) || z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.JobSupport] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final Object d1(o1 o1Var, Object obj) throws Throwable {
        z1 z1VarR0 = r0(o1Var);
        if (z1VarR0 == null) {
            return v1.f59894c;
        }
        c cVar = o1Var instanceof c ? (c) o1Var : null;
        if (cVar == null) {
            cVar = new c(z1VarR0, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            if (cVar.j()) {
                return v1.f59892a;
            }
            cVar.m(true);
            if (cVar != o1Var && !androidx.concurrent.futures.a.a(f73250b, this, o1Var, cVar)) {
                return v1.f59894c;
            }
            boolean zI = cVar.i();
            y yVar = obj instanceof y ? (y) obj : null;
            if (yVar != null) {
                cVar.a(yVar.f59911a);
            }
            ?? E = Boolean.valueOf(zI ? false : true).booleanValue() ? cVar.e() : 0;
            ref$ObjectRef.element = E;
            bn.r rVar = bn.r.f5635a;
            if (E != 0) {
                J0(z1VarR0, E);
            }
            r rVarI0 = I0(z1VarR0);
            if (rVarI0 != null && e1(cVar, rVarI0, obj)) {
                return v1.f59893b;
            }
            z1VarR0.f(2);
            r rVarI02 = I0(z1VarR0);
            return (rVarI02 == null || !e1(cVar, rVarI02, obj)) ? k0(cVar, obj) : v1.f59893b;
        }
    }

    @NotNull
    public String e0() {
        return "Job was cancelled";
    }

    public final boolean e1(c cVar, r rVar, Object obj) {
        while (t1.n(rVar.f59884f, false, new b(this, cVar, rVar, obj)) == a2.f59823b) {
            rVar = I0(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public final y0 f(@NotNull l<? super Throwable, bn.r> lVar) {
        return A0(true, new r1(lVar));
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) g.a.b(this, r10, pVar);
    }

    public boolean g0(@NotNull Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return a0(th2) && o0();
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) g.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    public final d.c<?> getKey() {
        return g.H8;
    }

    public final void h0(o1 o1Var, Object obj) throws Throwable {
        q qVarT0 = t0();
        if (qVarT0 != null) {
            qVarT0.dispose();
            U0(a2.f59823b);
        }
        y yVar = obj instanceof y ? (y) obj : null;
        Throwable th2 = yVar != null ? yVar.f59911a : null;
        if (!(o1Var instanceof u1)) {
            z1 z1VarB = o1Var.b();
            if (z1VarB != null) {
                K0(z1VarB, th2);
                return;
            }
            return;
        }
        try {
            ((u1) o1Var).v(th2);
        } catch (Throwable th3) {
            y0(new CompletionHandlerException("Exception in completion handler " + o1Var + " for " + this, th3));
        }
    }

    public final void i0(c cVar, r rVar, Object obj) {
        r rVarI0 = I0(rVar);
        if (rVarI0 == null || !e1(cVar, rVarI0, obj)) {
            cVar.b().f(2);
            r rVarI02 = I0(rVar);
            if (rVarI02 == null || !e1(cVar, rVarI02, obj)) {
                W(k0(cVar, obj));
            }
        }
    }

    @Override // kotlinx.coroutines.g
    public boolean isActive() {
        Object objU0 = u0();
        return (objU0 instanceof o1) && ((o1) objU0).isActive();
    }

    @Override // kotlinx.coroutines.g
    public final boolean isCancelled() {
        Object objU0 = u0();
        return (objU0 instanceof y) || ((objU0 instanceof c) && ((c) objU0).i());
    }

    public final Throwable j0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(e0(), null, this) : th2;
        }
        p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((c2) obj).G();
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public final i<g> k() {
        return ao.l.b(new JobSupport$children$1(this, null));
    }

    public final Object k0(c cVar, Object obj) throws Throwable {
        boolean zI;
        Throwable thN0;
        y yVar = obj instanceof y ? (y) obj : null;
        Throwable th2 = yVar != null ? yVar.f59911a : null;
        synchronized (cVar) {
            zI = cVar.i();
            List<Throwable> listL = cVar.l(th2);
            thN0 = n0(cVar, listL);
            if (thN0 != null) {
                V(thN0, listL);
            }
        }
        if (thN0 != null && thN0 != th2) {
            obj = new y(thN0, false, 2, null);
        }
        if (thN0 != null) {
            if (d0(thN0) || x0(thN0)) {
                p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((y) obj).c();
            }
        }
        if (!zI) {
            N0(thN0);
        }
        O0(obj);
        androidx.concurrent.futures.a.a(f73250b, this, cVar, v1.g(obj));
        h0(cVar, obj);
        return obj;
    }

    @Nullable
    public final Object l0() throws Throwable {
        Object objU0 = u0();
        if (!(!(objU0 instanceof o1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objU0 instanceof y) {
            throw ((y) objU0).f59911a;
        }
        return v1.h(objU0);
    }

    public final Throwable m0(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            return yVar.f59911a;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar) {
        return g.a.e(this, cVar);
    }

    public final Throwable n0(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new JobCancellationException(e0(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = list.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean o0() {
        return true;
    }

    @NotNull
    public final lo.c<?> p0() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        p.i(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        sn.q qVar = (sn.q) tn.y.e(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        p.i(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new lo.d(this, qVar, (sn.q) tn.y.e(jobSupport$onAwaitInternal$2, 3), null, 8, null);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar) {
        return g.a.f(this, dVar);
    }

    public boolean q0() {
        return false;
    }

    public final z1 r0(o1 o1Var) {
        z1 z1VarB = o1Var.b();
        if (z1VarB != null) {
            return z1VarB;
        }
        if (o1Var instanceof b1) {
            return new z1();
        }
        if (o1Var instanceof u1) {
            R0((u1) o1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + o1Var).toString());
    }

    @Nullable
    public g s0() {
        q qVarT0 = t0();
        if (qVarT0 != null) {
            return qVarT0.getParent();
        }
        return null;
    }

    @Override // kotlinx.coroutines.g
    public final boolean start() {
        int iV0;
        do {
            iV0 = V0(u0());
            if (iV0 == 0) {
                return false;
            }
        } while (iV0 != 1);
        return true;
    }

    @Nullable
    public final q t0() {
        return (q) f73251c.get(this);
    }

    @NotNull
    public String toString() {
        return Z0() + '@' + m0.b(this);
    }

    @Nullable
    public final Object u0() {
        return f73250b.get(this);
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public final y0 w(boolean z10, boolean z11, @NotNull l<? super Throwable, bn.r> lVar) {
        return A0(z11, z10 ? new q1(lVar) : new r1(lVar));
    }

    @Override // kotlinx.coroutines.g
    @NotNull
    public final lo.a x() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        p.i(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new lo.b(this, (sn.q) tn.y.e(jobSupport$onJoin$1, 3), null, 4, null);
    }

    public boolean x0(@NotNull Throwable th2) {
        return false;
    }

    public void y0(@NotNull Throwable th2) throws Throwable {
        throw th2;
    }

    public final void z0(@Nullable g gVar) {
        if (gVar == null) {
            U0(a2.f59823b);
            return;
        }
        gVar.start();
        q qVarH = gVar.H(this);
        U0(qVarH);
        if (d()) {
            qVarH.dispose();
            U0(a2.f59823b);
        }
    }
}
