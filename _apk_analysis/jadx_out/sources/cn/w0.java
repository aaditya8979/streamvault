package cn;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sets.kt */
/* JADX INFO: loaded from: classes12.dex */
public class w0 extends v0 {
    @NotNull
    public static final <T> Set<T> f() {
        return EmptySet.INSTANCE;
    }

    @NotNull
    public static final <T> HashSet<T> g(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return (HashSet) r.C0(tArr, new HashSet(p0.f(tArr.length)));
    }

    @NotNull
    public static final <T> Set<T> h(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return (Set) r.C0(tArr, new LinkedHashSet(p0.f(tArr.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> i(@NotNull Set<? extends T> set) {
        tn.p.k(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : v0.d(set.iterator().next()) : f();
    }

    @NotNull
    public static final <T> Set<T> j(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return r.J0(tArr);
    }
}
