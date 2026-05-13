package ql;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bn.r;
import cn.f0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: PhaseContent.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a<TSubject, Call> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C0937a f78325e = new C0937a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<Object> f78326f = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f78327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f78328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public List<q<c<TSubject, Call>, TSubject, hn.c<? super r>, Object>> f78329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78330d;

    /* JADX INFO: renamed from: ql.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PhaseContent.kt */
    public static final class C0937a {
        public C0937a() {
        }

        public /* synthetic */ C0937a(tn.i iVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NotNull g gVar, @NotNull h hVar) {
        p.k(gVar, TypedValues.CycleType.S_WAVE_PHASE);
        p.k(hVar, "relation");
        List<Object> list = f78326f;
        p.i(list, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        this(gVar, hVar, y.c(list));
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified".toString());
        }
    }

    public a(@NotNull g gVar, @NotNull h hVar, @NotNull List<q<c<TSubject, Call>, TSubject, hn.c<? super r>, Object>> list) {
        p.k(gVar, TypedValues.CycleType.S_WAVE_PHASE);
        p.k(hVar, "relation");
        p.k(list, "interceptors");
        this.f78327a = gVar;
        this.f78328b = hVar;
        this.f78329c = list;
        this.f78330d = true;
    }

    public final void a(@NotNull q<? super c<TSubject, Call>, ? super TSubject, ? super hn.c<? super r>, ? extends Object> qVar) {
        p.k(qVar, "interceptor");
        if (this.f78330d) {
            d();
        }
        this.f78329c.add(qVar);
    }

    public final void b(@NotNull List<q<c<TSubject, Call>, TSubject, hn.c<? super r>, Object>> list) {
        p.k(list, "destination");
        List<q<c<TSubject, Call>, TSubject, hn.c<? super r>, Object>> list2 = this.f78329c;
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.ensureCapacity(arrayList.size() + list2.size());
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.add(list2.get(i10));
        }
    }

    public final List<q<c<TSubject, Call>, TSubject, hn.c<? super r>, Object>> c() {
        return f0.j1(this.f78329c);
    }

    public final void d() {
        this.f78329c = c();
        this.f78330d = false;
    }

    @NotNull
    public final g e() {
        return this.f78327a;
    }

    @NotNull
    public final h f() {
        return this.f78328b;
    }

    public final int g() {
        return this.f78329c.size();
    }

    public final boolean h() {
        return this.f78329c.isEmpty();
    }

    @NotNull
    public final List<q<c<TSubject, Call>, TSubject, hn.c<? super r>, Object>> i() {
        this.f78330d = true;
        return this.f78329c;
    }

    @NotNull
    public String toString() {
        return "Phase `" + this.f78327a.a() + "`, " + g() + " handlers";
    }
}
