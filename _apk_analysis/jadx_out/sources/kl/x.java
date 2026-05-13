package kl;

import cn.f0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes3.dex */
public class x implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, List<String>> f73174d;

    public x(boolean z10, @NotNull Map<String, ? extends List<String>> map) {
        tn.p.k(map, "values");
        this.f73173c = z10;
        Map mapA = z10 ? n.a() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(value.get(i10));
            }
            mapA.put(key, arrayList);
        }
        this.f73174d = mapA;
    }

    @Override // kl.t
    @Nullable
    public List<String> a(@NotNull String str) {
        tn.p.k(str, "name");
        return d(str);
    }

    @Override // kl.t
    public final boolean b() {
        return this.f73173c;
    }

    @Override // kl.t
    public void c(@NotNull sn.p<? super String, ? super List<String>, bn.r> pVar) {
        tn.p.k(pVar, "body");
        for (Map.Entry<String, List<String>> entry : this.f73174d.entrySet()) {
            pVar.mo2invoke(entry.getKey(), entry.getValue());
        }
    }

    public final List<String> d(String str) {
        return this.f73174d.get(str);
    }

    @Override // kl.t
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return m.a(this.f73174d.entrySet());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f73173c != tVar.b()) {
            return false;
        }
        return y.d(entries(), tVar.entries());
    }

    @Override // kl.t
    @Nullable
    public String get(@NotNull String str) {
        tn.p.k(str, "name");
        List<String> listD = d(str);
        if (listD != null) {
            return (String) f0.v0(listD);
        }
        return null;
    }

    public int hashCode() {
        return y.e(entries(), Boolean.hashCode(this.f73173c) * 31);
    }

    @Override // kl.t
    public boolean isEmpty() {
        return this.f73174d.isEmpty();
    }

    @Override // kl.t
    @NotNull
    public Set<String> names() {
        return m.a(this.f73174d.keySet());
    }
}
