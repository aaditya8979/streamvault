package ql;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import cn.f0;
import cn.w;
import io.ktor.util.pipeline.InvalidPhaseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql.h;
import sn.q;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: Pipeline.kt */
/* JADX INFO: loaded from: classes5.dex */
public class b<TSubject, TContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kl.b f78331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Object> f78333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public g f78336f;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public b(@NotNull g... gVarArr) {
        p.k(gVarArr, "phases");
        this.f78331a = kl.d.a(true);
        this.f78333c = w.s(Arrays.copyOf(gVarArr, gVarArr.length));
        this.interceptors$delegate = null;
    }

    public void a() {
    }

    public final List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> b() {
        int iO;
        int i10 = this.f78334d;
        if (i10 == 0) {
            m(w.m());
            return w.m();
        }
        List<Object> list = this.f78333c;
        int i11 = 0;
        if (i10 == 1 && (iO = w.o(list)) >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i12);
                a<TSubject, TContext> aVar = obj instanceof a ? (a) obj : null;
                if (aVar != null && !aVar.h()) {
                    List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> listI = aVar.i();
                    p(aVar);
                    return listI;
                }
                if (i12 == iO) {
                    break;
                }
                i12++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int iO2 = w.o(list);
        if (iO2 >= 0) {
            while (true) {
                Object obj2 = list.get(i11);
                a aVar2 = obj2 instanceof a ? (a) obj2 : null;
                if (aVar2 != null) {
                    aVar2.b(arrayList);
                }
                if (i11 == iO2) {
                    break;
                }
                i11++;
            }
        }
        m(arrayList);
        return arrayList;
    }

    public final c<TSubject, TContext> c(TContext tcontext, TSubject tsubject, kotlin.coroutines.d dVar) {
        return d.a(tcontext, q(), tsubject, dVar, g());
    }

    @Nullable
    public final Object d(@NotNull TContext tcontext, @NotNull TSubject tsubject, @NotNull hn.c<? super TSubject> cVar) {
        return c(tcontext, tsubject, cVar.getContext()).a(tsubject, cVar);
    }

    public final a<TSubject, TContext> e(g gVar) {
        List<Object> list = this.f78333c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == gVar) {
                a<TSubject, TContext> aVar = new a<>(gVar, h.c.f78342a);
                list.set(i10, aVar);
                return aVar;
            }
            if (obj instanceof a) {
                a<TSubject, TContext> aVar2 = (a) obj;
                if (aVar2.e() == gVar) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final int f(g gVar) {
        List<Object> list = this.f78333c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == gVar || ((obj instanceof a) && ((a) obj).e() == gVar)) {
                return i10;
            }
        }
        return -1;
    }

    public boolean g() {
        return this.f78332b;
    }

    public final List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> h() {
        return (List) this.interceptors$delegate;
    }

    public final boolean i(g gVar) {
        List<Object> list = this.f78333c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == gVar) {
                return true;
            }
            if ((obj instanceof a) && ((a) obj).e() == gVar) {
                return true;
            }
        }
        return false;
    }

    public final void j(@NotNull g gVar, @NotNull g gVar2) throws InvalidPhaseException {
        h hVarF;
        g gVarA;
        p.k(gVar, "reference");
        p.k(gVar2, TypedValues.CycleType.S_WAVE_PHASE);
        if (i(gVar2)) {
            return;
        }
        int iF = f(gVar);
        if (iF == -1) {
            throw new InvalidPhaseException("Phase " + gVar + " was not registered for this pipeline");
        }
        int i10 = iF + 1;
        int iO = w.o(this.f78333c);
        if (i10 <= iO) {
            while (true) {
                Object obj = this.f78333c.get(i10);
                a aVar = obj instanceof a ? (a) obj : null;
                if (aVar != null && (hVarF = aVar.f()) != null) {
                    h.a aVar2 = hVarF instanceof h.a ? (h.a) hVarF : null;
                    if (aVar2 != null && (gVarA = aVar2.a()) != null && p.f(gVarA, gVar)) {
                        iF = i10;
                    }
                    if (i10 == iO) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f78333c.add(iF + 1, new a(gVar2, new h.a(gVar)));
    }

    public final void k(@NotNull g gVar, @NotNull g gVar2) throws InvalidPhaseException {
        p.k(gVar, "reference");
        p.k(gVar2, TypedValues.CycleType.S_WAVE_PHASE);
        if (i(gVar2)) {
            return;
        }
        int iF = f(gVar);
        if (iF != -1) {
            this.f78333c.add(iF, new a(gVar2, new h.b(gVar)));
            return;
        }
        throw new InvalidPhaseException("Phase " + gVar + " was not registered for this pipeline");
    }

    public final void l(@NotNull g gVar, @NotNull q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object> qVar) {
        p.k(gVar, TypedValues.CycleType.S_WAVE_PHASE);
        p.k(qVar, "block");
        a<TSubject, TContext> aVarE = e(gVar);
        if (aVarE == null) {
            throw new InvalidPhaseException("Phase " + gVar + " was not registered for this pipeline");
        }
        if (r(gVar, qVar)) {
            this.f78334d++;
            return;
        }
        aVarE.a(qVar);
        this.f78334d++;
        n();
        a();
    }

    public final void m(List<? extends q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object>> list) {
        o(list);
        this.f78335e = false;
        this.f78336f = null;
    }

    public final void n() {
        o(null);
        this.f78335e = false;
        this.f78336f = null;
    }

    public final void o(List<? extends q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object>> list) {
        this.interceptors$delegate = list;
    }

    public final void p(a<TSubject, TContext> aVar) {
        o(aVar.i());
        this.f78335e = false;
        this.f78336f = aVar.e();
    }

    public final List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> q() {
        if (h() == null) {
            b();
        }
        this.f78335e = true;
        List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> listH = h();
        p.h(listH);
        return listH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(g gVar, q<? super c<TSubject, TContext>, ? super TSubject, ? super hn.c<? super r>, ? extends Object> qVar) {
        List<q<c<TSubject, TContext>, TSubject, hn.c<? super r>, Object>> listH = h();
        if (this.f78333c.isEmpty() || listH == null || this.f78335e || !y.l(listH)) {
            return false;
        }
        if (p.f(this.f78336f, gVar)) {
            listH.add(qVar);
            return true;
        }
        if (!p.f(gVar, f0.F0(this.f78333c)) && f(gVar) != w.o(this.f78333c)) {
            return false;
        }
        a<TSubject, TContext> aVarE = e(gVar);
        p.h(aVarE);
        aVarE.a(qVar);
        listH.add(qVar);
        return true;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
