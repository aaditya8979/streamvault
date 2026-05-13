package kl;

import cn.b0;
import cn.f0;
import cn.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes3.dex */
public class w implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f73171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, List<String>> f73172b;

    public w(boolean z10, int i10) {
        this.f73171a = z10;
        this.f73172b = z10 ? n.a() : new LinkedHashMap<>(i10);
    }

    public static final bn.r g(w wVar, String str, List list) {
        tn.p.k(str, "name");
        tn.p.k(list, "values");
        wVar.c(str, list);
        return bn.r.f5635a;
    }

    @Override // kl.u
    @Nullable
    public List<String> a(@NotNull String str) {
        tn.p.k(str, "name");
        return this.f73172b.get(str);
    }

    @Override // kl.u
    public final boolean b() {
        return this.f73171a;
    }

    @Override // kl.u
    public void c(@NotNull String str, @NotNull Iterable<String> iterable) {
        tn.p.k(str, "name");
        tn.p.k(iterable, "values");
        List<String> listI = i(str);
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            o(it.next());
        }
        b0.F(listI, iterable);
    }

    @Override // kl.u
    public void clear() {
        this.f73172b.clear();
    }

    @Override // kl.u
    public boolean contains(@NotNull String str) {
        tn.p.k(str, "name");
        return this.f73172b.containsKey(str);
    }

    @Override // kl.u
    public void d(@NotNull t tVar) {
        tn.p.k(tVar, "stringValues");
        tVar.c(new sn.p() { // from class: kl.v
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return w.g(this.f73170b, (String) obj, (List) obj2);
            }
        });
    }

    @Override // kl.u
    public void e(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "name");
        tn.p.k(str2, "value");
        o(str2);
        i(str).add(str2);
    }

    @Override // kl.u
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return m.a(this.f73172b.entrySet());
    }

    public void h(@NotNull String str, @NotNull Iterable<String> iterable) {
        Set setF;
        tn.p.k(str, "name");
        tn.p.k(iterable, "values");
        List<String> list = this.f73172b.get(str);
        if (list == null || (setF = f0.l1(list)) == null) {
            setF = w0.f();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : iterable) {
            if (!setF.contains(str2)) {
                arrayList.add(str2);
            }
        }
        c(str, arrayList);
    }

    public final List<String> i(String str) {
        List<String> list = this.f73172b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        n(str);
        this.f73172b.put(str, arrayList);
        return arrayList;
    }

    @Override // kl.u
    public boolean isEmpty() {
        return this.f73172b.isEmpty();
    }

    @Nullable
    public String j(@NotNull String str) {
        tn.p.k(str, "name");
        List<String> listA = a(str);
        if (listA != null) {
            return (String) f0.v0(listA);
        }
        return null;
    }

    @NotNull
    public final Map<String, List<String>> k() {
        return this.f73172b;
    }

    public void l(@NotNull String str) {
        tn.p.k(str, "name");
        this.f73172b.remove(str);
    }

    public void m(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "name");
        tn.p.k(str2, "value");
        o(str2);
        List<String> listI = i(str);
        listI.clear();
        listI.add(str2);
    }

    public void n(@NotNull String str) {
        tn.p.k(str, "name");
    }

    @Override // kl.u
    @NotNull
    public Set<String> names() {
        return this.f73172b.keySet();
    }

    public void o(@NotNull String str) {
        tn.p.k(str, "value");
    }
}
