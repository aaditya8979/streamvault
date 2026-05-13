package cn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes10.dex */
public class v {
    @NotNull
    public static final <E> List<E> a(@NotNull List<E> list) {
        tn.p.k(list, "builder");
        return ((ListBuilder) list).build();
    }

    @NotNull
    public static final <T> Object[] b(@NotNull T[] tArr, boolean z10) {
        tn.p.k(tArr, "<this>");
        if (z10 && tn.p.f(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        tn.p.j(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @NotNull
    public static final <E> List<E> c() {
        return new ListBuilder(0, 1, null);
    }

    @NotNull
    public static final <E> List<E> d(int i10) {
        return new ListBuilder(i10);
    }

    @NotNull
    public static final <T> List<T> e(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        tn.p.j(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @NotNull
    public static final <T> T[] f(int i10, @NotNull T[] tArr) {
        tn.p.k(tArr, "array");
        if (i10 < tArr.length) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
