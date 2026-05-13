package cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes10.dex */
public class x extends w {
    public static final <T> int x(@NotNull Iterable<? extends T> iterable, int i10) {
        tn.p.k(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    @Nullable
    public static final <T> Integer y(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @NotNull
    public static final <T> List<T> z(@NotNull Iterable<? extends Iterable<? extends T>> iterable) {
        tn.p.k(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            b0.F(arrayList, it.next());
        }
        return arrayList;
    }
}
