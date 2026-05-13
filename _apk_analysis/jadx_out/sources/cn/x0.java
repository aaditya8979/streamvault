package cn;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes12.dex */
public class x0 extends w0 {
    @NotNull
    public static final <T> Set<T> k(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        tn.p.k(set, "<this>");
        tn.p.k(iterable, "elements");
        Collection<?> collectionH = b0.H(iterable);
        if (collectionH.isEmpty()) {
            return f0.l1(set);
        }
        if (!(collectionH instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionH);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t10 : set) {
            if (!((Set) collectionH).contains(t10)) {
                linkedHashSet2.add(t10);
            }
        }
        return linkedHashSet2;
    }

    @NotNull
    public static final <T> Set<T> l(@NotNull Set<? extends T> set, T t10) {
        tn.p.k(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(p0.f(set.size()));
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && tn.p.f(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> m(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        int size;
        tn.p.k(set, "<this>");
        tn.p.k(iterable, "elements");
        Integer numY = x.y(iterable);
        if (numY != null) {
            size = set.size() + numY.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(p0.f(size));
        linkedHashSet.addAll(set);
        b0.F(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> n(@NotNull Set<? extends T> set, T t10) {
        tn.p.k(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(p0.f(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
