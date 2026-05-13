package cn;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.builders.SetBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetsJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
public class v0 {
    @NotNull
    public static final <E> Set<E> a(@NotNull Set<E> set) {
        tn.p.k(set, "builder");
        return ((SetBuilder) set).build();
    }

    @NotNull
    public static final <E> Set<E> b() {
        return new SetBuilder();
    }

    @NotNull
    public static final <E> Set<E> c(int i10) {
        return new SetBuilder(i10);
    }

    @NotNull
    public static final <T> Set<T> d(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        tn.p.j(setSingleton, "singleton(...)");
        return setSingleton;
    }

    @NotNull
    public static final <T> TreeSet<T> e(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return (TreeSet) r.C0(tArr, new TreeSet());
    }
}
