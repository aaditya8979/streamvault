package gl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UrlDecodedParametersBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c0 f62567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62568b;

    public q0(@NotNull c0 c0Var) {
        tn.p.k(c0Var, "encodedParametersBuilder");
        this.f62567a = c0Var;
        this.f62568b = c0Var.b();
    }

    @Override // kl.u
    @Nullable
    public List<String> a(@NotNull String str) {
        tn.p.k(str, "name");
        ArrayList arrayList = null;
        List<String> listA = this.f62567a.a(e.m(str, false, 1, null));
        if (listA != null) {
            arrayList = new ArrayList(cn.x.x(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(e.k((String) it.next(), 0, 0, true, null, 11, null));
            }
        }
        return arrayList;
    }

    @Override // kl.u
    public boolean b() {
        return this.f62568b;
    }

    @Override // gl.c0
    @NotNull
    public io.ktor.http.b build() {
        return r0.d(this.f62567a);
    }

    @Override // kl.u
    public void c(@NotNull String str, @NotNull Iterable<String> iterable) {
        tn.p.k(str, "name");
        tn.p.k(iterable, "values");
        c0 c0Var = this.f62567a;
        String strM = e.m(str, false, 1, null);
        ArrayList arrayList = new ArrayList(cn.x.x(iterable, 10));
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(e.o(it.next()));
        }
        c0Var.c(strM, arrayList);
    }

    @Override // kl.u
    public void clear() {
        this.f62567a.clear();
    }

    @Override // kl.u
    public boolean contains(@NotNull String str) {
        tn.p.k(str, "name");
        return this.f62567a.contains(e.m(str, false, 1, null));
    }

    @Override // kl.u
    public void d(@NotNull kl.t tVar) {
        tn.p.k(tVar, "stringValues");
        r0.c(this.f62567a, tVar);
    }

    @Override // kl.u
    public void e(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "name");
        tn.p.k(str2, "value");
        this.f62567a.e(e.m(str, false, 1, null), e.o(str2));
    }

    @Override // kl.u
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return r0.d(this.f62567a).entries();
    }

    @Override // kl.u
    public boolean isEmpty() {
        return this.f62567a.isEmpty();
    }

    @Override // kl.u
    @NotNull
    public Set<String> names() {
        Set<String> setNames = this.f62567a.names();
        ArrayList arrayList = new ArrayList(cn.x.x(setNames, 10));
        Iterator<T> it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(e.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return cn.f0.l1(arrayList);
    }
}
