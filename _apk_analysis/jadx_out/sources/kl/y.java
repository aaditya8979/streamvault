package kl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y {
    @NotNull
    public static final u c(@NotNull u uVar, @NotNull u uVar2) {
        tn.p.k(uVar, "<this>");
        tn.p.k(uVar2, "builder");
        Iterator<T> it = uVar2.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            uVar.c((String) entry.getKey(), (List) entry.getValue());
        }
        return uVar;
    }

    public static final boolean d(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return tn.p.f(set, set2);
    }

    public static final int e(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i10) {
        return (i10 * 31) + set.hashCode();
    }
}
