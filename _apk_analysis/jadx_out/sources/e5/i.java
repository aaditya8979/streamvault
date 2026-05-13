package e5;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import e4.v0;
import e5.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ConcatenatingMediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i extends e5.e<e> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @GuardedBy("this")
    public final List<e> f60501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<d> f60502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public Handler f60503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<e> f60504m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<q, e> f60505n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Map<Object, e> f60506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set<e> f60507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f60508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f60509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f60510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Set<d> f60511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k0 f60512u;

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class b extends e5.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f60513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f60514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int[] f60515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f60516h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final v0[] f60517i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object[] f60518j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final HashMap<Object, Integer> f60519k;

        public b(Collection<e> collection, k0 k0Var, boolean z10) {
            super(z10, k0Var);
            int size = collection.size();
            this.f60515g = new int[size];
            this.f60516h = new int[size];
            this.f60517i = new v0[size];
            this.f60518j = new Object[size];
            this.f60519k = new HashMap<>();
            int iP = 0;
            int i10 = 0;
            int i11 = 0;
            for (e eVar : collection) {
                this.f60517i[i11] = eVar.f60522a.K();
                this.f60516h[i11] = iP;
                this.f60515g[i11] = i10;
                iP += this.f60517i[i11].p();
                i10 += this.f60517i[i11].i();
                Object[] objArr = this.f60518j;
                Object obj = eVar.f60523b;
                objArr[i11] = obj;
                this.f60519k.put(obj, Integer.valueOf(i11));
                i11++;
            }
            this.f60513e = iP;
            this.f60514f = i10;
        }

        @Override // e5.a
        public int A(int i10) {
            return this.f60516h[i10];
        }

        @Override // e5.a
        public v0 D(int i10) {
            return this.f60517i[i10];
        }

        @Override // e4.v0
        public int i() {
            return this.f60514f;
        }

        @Override // e4.v0
        public int p() {
            return this.f60513e;
        }

        @Override // e5.a
        public int s(Object obj) {
            Integer num = this.f60519k.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // e5.a
        public int t(int i10) {
            return a6.k0.g(this.f60515g, i10 + 1, false, false);
        }

        @Override // e5.a
        public int u(int i10) {
            return a6.k0.g(this.f60516h, i10 + 1, false, false);
        }

        @Override // e5.a
        public Object x(int i10) {
            return this.f60518j[i10];
        }

        @Override // e5.a
        public int z(int i10) {
            return this.f60515g[i10];
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class c extends e5.b {
        public c() {
        }

        @Override // e5.r
        public q b(r.a aVar, y5.b bVar, long j10) {
            throw new UnsupportedOperationException();
        }

        @Override // e5.r
        @Nullable
        public Object getTag() {
            return null;
        }

        @Override // e5.r
        public void k(q qVar) {
        }

        @Override // e5.r
        public void maybeThrowSourceInfoRefreshError() throws IOException {
        }

        @Override // e5.b
        public void s(@Nullable y5.q qVar) {
        }

        @Override // e5.b
        public void u() {
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f60520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f60521b;

        public d(Handler handler, Runnable runnable) {
            this.f60520a = handler;
            this.f60521b = runnable;
        }

        public void a() {
            this.f60520a.post(this.f60521b);
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f60522a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f60525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f60526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f60527f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<r.a> f60524c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f60523b = new Object();

        public e(r rVar, boolean z10) {
            this.f60522a = new p(rVar, z10);
        }

        public void a(int i10, int i11) {
            this.f60525d = i10;
            this.f60526e = i11;
            this.f60527f = false;
            this.f60524c.clear();
        }
    }

    /* JADX INFO: compiled from: ConcatenatingMediaSource.java */
    public static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f60529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final d f60530c;

        public f(int i10, T t10, @Nullable d dVar) {
            this.f60528a = i10;
            this.f60529b = t10;
            this.f60530c = dVar;
        }
    }

    public static Object R(Object obj) {
        return e5.a.v(obj);
    }

    public static Object U(Object obj) {
        return e5.a.w(obj);
    }

    public static Object V(e eVar, Object obj) {
        return e5.a.y(eVar.f60523b, obj);
    }

    public synchronized void H(int i10, r rVar) {
        L(i10, Collections.singletonList(rVar), null, null);
    }

    public synchronized void I(r rVar) {
        H(this.f60501j.size(), rVar);
    }

    public final void J(int i10, e eVar) {
        if (i10 > 0) {
            e eVar2 = this.f60504m.get(i10 - 1);
            eVar.a(i10, eVar2.f60526e + eVar2.f60522a.K().p());
        } else {
            eVar.a(i10, 0);
        }
        M(i10, 1, eVar.f60522a.K().p());
        this.f60504m.add(i10, eVar);
        this.f60506o.put(eVar.f60523b, eVar);
        D(eVar, eVar.f60522a);
        if (r() && this.f60505n.isEmpty()) {
            this.f60507p.add(eVar);
        } else {
            w(eVar);
        }
    }

    public final void K(int i10, Collection<e> collection) {
        Iterator<e> it = collection.iterator();
        while (it.hasNext()) {
            J(i10, it.next());
            i10++;
        }
    }

    @GuardedBy("this")
    public final void L(int i10, Collection<r> collection, @Nullable Handler handler, @Nullable Runnable runnable) {
        a6.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f60503l;
        Iterator<r> it = collection.iterator();
        while (it.hasNext()) {
            a6.a.e(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<r> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e(it2.next(), this.f60509r));
        }
        this.f60501j.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new f(i10, arrayList, N(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final void M(int i10, int i11, int i12) {
        while (i10 < this.f60504m.size()) {
            e eVar = this.f60504m.get(i10);
            eVar.f60525d += i11;
            eVar.f60526e += i12;
            i10++;
        }
    }

    @Nullable
    @GuardedBy("this")
    public final d N(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.f60502k.add(dVar);
        return dVar;
    }

    public final void O() {
        Iterator<e> it = this.f60507p.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f60524c.isEmpty()) {
                w(next);
                it.remove();
            }
        }
    }

    public final synchronized void P(Set<d> set) {
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f60502k.removeAll(set);
    }

    public final void Q(e eVar) {
        this.f60507p.add(eVar);
        x(eVar);
    }

    @Override // e5.e
    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public r.a y(e eVar, r.a aVar) {
        for (int i10 = 0; i10 < eVar.f60524c.size(); i10++) {
            if (eVar.f60524c.get(i10).f60582d == aVar.f60582d) {
                return aVar.a(V(eVar, aVar.f60579a));
            }
        }
        return null;
    }

    public synchronized r T(int i10) {
        return this.f60501j.get(i10).f60522a;
    }

    public final Handler W() {
        return (Handler) a6.a.e(this.f60503l);
    }

    public synchronized int X() {
        return this.f60501j.size();
    }

    @Override // e5.e
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public int A(e eVar, int i10) {
        return i10 + eVar.f60526e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Z(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            f fVar = (f) a6.k0.i(message.obj);
            this.f60512u = this.f60512u.cloneAndInsert(fVar.f60528a, ((Collection) fVar.f60529b).size());
            K(fVar.f60528a, (Collection) fVar.f60529b);
            h0(fVar.f60530c);
        } else if (i10 == 1) {
            f fVar2 = (f) a6.k0.i(message.obj);
            int i11 = fVar2.f60528a;
            int iIntValue = ((Integer) fVar2.f60529b).intValue();
            if (i11 == 0 && iIntValue == this.f60512u.getLength()) {
                this.f60512u = this.f60512u.cloneAndClear();
            } else {
                this.f60512u = this.f60512u.cloneAndRemove(i11, iIntValue);
            }
            for (int i12 = iIntValue - 1; i12 >= i11; i12--) {
                e0(i12);
            }
            h0(fVar2.f60530c);
        } else if (i10 == 2) {
            f fVar3 = (f) a6.k0.i(message.obj);
            k0 k0Var = this.f60512u;
            int i13 = fVar3.f60528a;
            k0 k0VarCloneAndRemove = k0Var.cloneAndRemove(i13, i13 + 1);
            this.f60512u = k0VarCloneAndRemove;
            this.f60512u = k0VarCloneAndRemove.cloneAndInsert(((Integer) fVar3.f60529b).intValue(), 1);
            b0(fVar3.f60528a, ((Integer) fVar3.f60529b).intValue());
            h0(fVar3.f60530c);
        } else if (i10 == 3) {
            f fVar4 = (f) a6.k0.i(message.obj);
            this.f60512u = (k0) fVar4.f60529b;
            h0(fVar4.f60530c);
        } else if (i10 == 4) {
            j0();
        } else {
            if (i10 != 5) {
                throw new IllegalStateException();
            }
            P((Set) a6.k0.i(message.obj));
        }
        return true;
    }

    public final void a0(e eVar) {
        if (eVar.f60527f && eVar.f60524c.isEmpty()) {
            this.f60507p.remove(eVar);
            E(eVar);
        }
    }

    @Override // e5.r
    public q b(r.a aVar, y5.b bVar, long j10) {
        Object objU = U(aVar.f60579a);
        r.a aVarA = aVar.a(R(aVar.f60579a));
        e eVar = this.f60506o.get(objU);
        if (eVar == null) {
            eVar = new e(new c(), this.f60509r);
            eVar.f60527f = true;
            D(eVar, eVar.f60522a);
        }
        Q(eVar);
        eVar.f60524c.add(aVarA);
        o oVarG = eVar.f60522a.b(aVarA, bVar, j10);
        this.f60505n.put(oVarG, eVar);
        O();
        return oVarG;
    }

    public final void b0(int i10, int i11) {
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        int iP = this.f60504m.get(iMin).f60526e;
        List<e> list = this.f60504m;
        list.add(i11, list.remove(i10));
        while (iMin <= iMax) {
            e eVar = this.f60504m.get(iMin);
            eVar.f60525d = iMin;
            eVar.f60526e = iP;
            iP += eVar.f60522a.K().p();
            iMin++;
        }
    }

    @Override // e5.e
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void B(e eVar, r rVar, v0 v0Var) {
        i0(eVar, v0Var);
    }

    public synchronized r d0(int i10) {
        r rVarT;
        rVarT = T(i10);
        f0(i10, i10 + 1, null, null);
        return rVarT;
    }

    public final void e0(int i10) {
        e eVarRemove = this.f60504m.remove(i10);
        this.f60506o.remove(eVarRemove.f60523b);
        M(i10, -1, -eVarRemove.f60522a.K().p());
        eVarRemove.f60527f = true;
        a0(eVarRemove);
    }

    @GuardedBy("this")
    public final void f0(int i10, int i11, @Nullable Handler handler, @Nullable Runnable runnable) {
        a6.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.f60503l;
        a6.k0.w0(this.f60501j, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(i10, Integer.valueOf(i11), N(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final void g0() {
        h0(null);
    }

    @Override // e5.r
    @Nullable
    public Object getTag() {
        return null;
    }

    public final void h0(@Nullable d dVar) {
        if (!this.f60510s) {
            W().obtainMessage(4).sendToTarget();
            this.f60510s = true;
        }
        if (dVar != null) {
            this.f60511t.add(dVar);
        }
    }

    public final void i0(e eVar, v0 v0Var) {
        if (eVar == null) {
            throw new IllegalArgumentException();
        }
        if (eVar.f60525d + 1 < this.f60504m.size()) {
            int iP = v0Var.p() - (this.f60504m.get(eVar.f60525d + 1).f60526e - eVar.f60526e);
            if (iP != 0) {
                M(eVar.f60525d + 1, 0, iP);
            }
        }
        g0();
    }

    public final void j0() {
        this.f60510s = false;
        Set<d> set = this.f60511t;
        this.f60511t = new HashSet();
        t(new b(this.f60504m, this.f60512u, this.f60508q));
        W().obtainMessage(5, set).sendToTarget();
    }

    @Override // e5.r
    public void k(q qVar) {
        e eVar = (e) a6.a.e(this.f60505n.remove(qVar));
        eVar.f60522a.k(qVar);
        eVar.f60524c.remove(((o) qVar).f60558c);
        if (!this.f60505n.isEmpty()) {
            O();
        }
        a0(eVar);
    }

    @Override // e5.e, e5.b
    public void p() {
        super.p();
        this.f60507p.clear();
    }

    @Override // e5.e, e5.b
    public void q() {
    }

    @Override // e5.e, e5.b
    public synchronized void s(@Nullable y5.q qVar) {
        super.s(qVar);
        this.f60503l = new Handler(new Handler.Callback() { // from class: e5.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f60471b.Z(message);
            }
        });
        if (this.f60501j.isEmpty()) {
            j0();
        } else {
            this.f60512u = this.f60512u.cloneAndInsert(0, this.f60501j.size());
            K(0, this.f60501j);
            g0();
        }
    }

    @Override // e5.e, e5.b
    public synchronized void u() {
        super.u();
        this.f60504m.clear();
        this.f60507p.clear();
        this.f60506o.clear();
        this.f60512u = this.f60512u.cloneAndClear();
        Handler handler = this.f60503l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f60503l = null;
        }
        this.f60510s = false;
        this.f60511t.clear();
        P(this.f60502k);
    }
}
