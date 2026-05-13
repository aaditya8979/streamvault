package kotlinx.coroutines.selects;

import bn.r;
import cn.f0;
import cn.v;
import hn.c;
import io.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlinx.coroutines.b;
import lo.f;
import lo.g;
import lo.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.k;
import p000do.y0;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SelectImplementation<R> implements b, g<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f73445g = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f73446b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Object f73448d;
    private volatile /* synthetic */ Object state$volatile = h.f73885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<SelectImplementation<R>.a> f73447c = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73449e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Object f73450f = h.f73888e;

    /* JADX INFO: compiled from: Select.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Object f73451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final q<Object, f<?>, Object, r> f73452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final q<Object, Object, Object, Object> f73453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Object f73454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Object f73455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final q<f<?>, Object, Object, q<Throwable, Object, d, r>> f73456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Object f73457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f73458h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, @NotNull q<Object, ? super f<?>, Object, r> qVar, @NotNull q<Object, Object, Object, ? extends Object> qVar2, @Nullable Object obj2, @NotNull Object obj3, @Nullable q<? super f<?>, Object, Object, ? extends q<? super Throwable, Object, ? super d, r>> qVar3) {
            this.f73451a = obj;
            this.f73452b = qVar;
            this.f73453c = qVar2;
            this.f73454d = obj2;
            this.f73455e = obj3;
            this.f73456f = qVar3;
        }

        @Nullable
        public final q<Throwable, Object, d, r> a(@NotNull f<?> fVar, @Nullable Object obj) {
            q<f<?>, Object, Object, q<Throwable, Object, d, r>> qVar = this.f73456f;
            if (qVar != null) {
                return qVar.invoke(fVar, this.f73454d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f73457g;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof b0) {
                ((b0) obj).s(this.f73458h, null, selectImplementation.getContext());
                return;
            }
            y0 y0Var = obj instanceof y0 ? (y0) obj : null;
            if (y0Var != null) {
                y0Var.dispose();
            }
        }

        @Nullable
        public final Object c(@Nullable Object obj, @NotNull c<? super R> cVar) {
            Object obj2 = this.f73455e;
            if (this.f73454d == h.i()) {
                p.i(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((l) obj2).invoke(cVar);
            }
            p.i(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((sn.p) obj2).mo2invoke(obj, cVar);
        }

        @Nullable
        public final Object d(@Nullable Object obj) {
            return this.f73453c.invoke(this.f73451a, this.f73454d, obj);
        }

        public final boolean e(@NotNull SelectImplementation<R> selectImplementation) {
            this.f73452b.invoke(this.f73451a, selectImplementation, this.f73454d);
            return selectImplementation.f73450f == h.f73888e;
        }
    }

    public SelectImplementation(@NotNull d dVar) {
        this.f73446b = dVar;
    }

    public static /* synthetic */ <R> Object n(SelectImplementation<R> selectImplementation, c<? super R> cVar) {
        return selectImplementation.t() ? selectImplementation.l(cVar) : selectImplementation.o(cVar);
    }

    public static /* synthetic */ void v(SelectImplementation selectImplementation, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectImplementation.u(aVar, z10);
    }

    @Override // kotlinx.coroutines.b
    public void a(@Nullable Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f73445g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f73886c) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, h.f73887d));
        List<SelectImplementation<R>.a> list = this.f73447c;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f73450f = h.f73888e;
        this.f73447c = null;
    }

    @Override // p000do.s2
    public void b(@NotNull b0<?> b0Var, int i10) {
        this.f73448d = b0Var;
        this.f73449e = i10;
    }

    @Override // lo.f
    public void c(@Nullable Object obj) {
        this.f73450f = obj;
    }

    @Override // lo.f
    public void d(@NotNull y0 y0Var) {
        this.f73448d = y0Var;
    }

    @Override // lo.f
    public boolean e(@NotNull Object obj, @Nullable Object obj2) {
        return y(obj, obj2) == 0;
    }

    @Override // lo.g, lo.f
    @NotNull
    public d getContext() {
        return this.f73446b;
    }

    public final void j(Object obj) {
        List<SelectImplementation<R>.a> list = this.f73447c;
        p.h(list);
        boolean z10 = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).f73451a == obj) {
                    break;
                }
            }
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
    }

    public final void k(SelectImplementation<R>.a aVar) {
        List<SelectImplementation<R>.a> list = this.f73447c;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f73445g.set(this, h.f73886c);
        this.f73450f = h.f73888e;
        this.f73447c = null;
    }

    public final Object l(c<? super R> cVar) {
        Object obj = f73445g.get(this);
        p.i(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.a aVar = (a) obj;
        Object obj2 = this.f73450f;
        k(aVar);
        return aVar.c(aVar.d(obj2), cVar);
    }

    @Nullable
    public Object m(@NotNull c<? super R> cVar) {
        return n(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(hn.c<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.c.b(r6)
            goto L4b
        L3c:
            kotlin.c.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.l(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.o(hn.c):java.lang.Object");
    }

    public final SelectImplementation<R>.a p(Object obj) {
        List<SelectImplementation<R>.a> list = this.f73447c;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f73451a == obj) {
                obj2 = next;
                break;
            }
        }
        SelectImplementation<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public void r(@NotNull lo.a aVar, @NotNull l<? super c<? super R>, ? extends Object> lVar) {
        v(this, new a(aVar.d(), aVar.c(), aVar.b(), h.i(), lVar, aVar.a()), false, 1, null);
    }

    public <Q> void s(@NotNull lo.c<? extends Q> cVar, @NotNull sn.p<? super Q, ? super c<? super R>, ? extends Object> pVar) {
        v(this, new a(cVar.d(), cVar.c(), cVar.b(), null, pVar, cVar.a()), false, 1, null);
    }

    public final boolean t() {
        return f73445g.get(this) instanceof a;
    }

    public final void u(@NotNull SelectImplementation<R>.a aVar, boolean z10) {
        if (f73445g.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            j(aVar.f73451a);
        }
        if (!aVar.e(this)) {
            f73445g.set(this, aVar);
            return;
        }
        if (!z10) {
            List<SelectImplementation<R>.a> list = this.f73447c;
            p.h(list);
            list.add(aVar);
        }
        aVar.f73457g = this.f73448d;
        aVar.f73458h = this.f73449e;
        this.f73448d = null;
        this.f73449e = -1;
    }

    public final void w(Object obj) {
        SelectImplementation<R>.a aVarP = p(obj);
        p.h(aVarP);
        aVarP.f73457g = null;
        aVarP.f73458h = -1;
        u(aVarP, true);
    }

    @NotNull
    public final TrySelectDetailedResult x(@NotNull Object obj, @Nullable Object obj2) {
        return h.a(y(obj, obj2));
    }

    public final int y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f73445g.get(this);
            if (obj3 instanceof k) {
                SelectImplementation<R>.a aVarP = p(obj);
                if (aVarP == null) {
                    continue;
                } else {
                    q<Throwable, Object, d, r> qVarA = aVarP.a(this, obj2);
                    if (androidx.concurrent.futures.a.a(f73445g, this, obj3, aVarP)) {
                        this.f73450f = obj2;
                        if (h.j((k) obj3, qVarA)) {
                            return 0;
                        }
                        this.f73450f = h.f73888e;
                        return 2;
                    }
                }
            } else {
                if (p.f(obj3, h.f73886c) || (obj3 instanceof a)) {
                    return 3;
                }
                if (p.f(obj3, h.f73887d)) {
                    return 2;
                }
                if (p.f(obj3, h.f73885b)) {
                    if (androidx.concurrent.futures.a.a(f73445g, this, obj3, v.e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.a.a(f73445g, this, obj3, f0.P0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r0 = r0.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r0 != in.a.g()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        jn.f.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r0 != in.a.g()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        return bn.r.f5635a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(hn.c<? super bn.r> r6) {
        /*
            r5 = this;
            kotlinx.coroutines.c r0 = new kotlinx.coroutines.c
            hn.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.d(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.K()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h()
        L11:
            java.lang.Object r2 = r1.get(r5)
            io.e0 r3 = lo.h.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = h()
            boolean r2 = androidx.concurrent.futures.a.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            p000do.n.c(r0, r5)
            goto L65
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = h()
            io.e0 r4 = lo.h.g()
            boolean r3 = androidx.concurrent.futures.a.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L44:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            i(r5, r3)
            goto L44
        L52:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.SelectImplementation.a
            if (r1 == 0) goto L7c
            bn.r r1 = bn.r.f5635a
            kotlinx.coroutines.selects.SelectImplementation$a r2 = (kotlinx.coroutines.selects.SelectImplementation.a) r2
            java.lang.Object r3 = g(r5)
            sn.q r2 = r2.a(r5, r3)
            r0.y(r1, r2)
        L65:
            java.lang.Object r0 = r0.B()
            java.lang.Object r1 = in.a.g()
            if (r0 != r1) goto L72
            jn.f.c(r6)
        L72:
            java.lang.Object r6 = in.a.g()
            if (r0 != r6) goto L79
            return r0
        L79:
            bn.r r6 = bn.r.f5635a
            return r6
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.z(hn.c):java.lang.Object");
    }
}
