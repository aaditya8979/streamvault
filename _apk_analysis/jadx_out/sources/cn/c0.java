package cn;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes7.dex */
public class c0 extends b0 {
    @NotNull
    public static final <T> List<T> Y(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        return new t0(list);
    }

    public static final int Z(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= w.o(list)) {
            return w.o(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new zn.i(0, w.o(list)) + "].");
    }

    public static final int a0(List<?> list, int i10) {
        return w.o(list) - i10;
    }

    public static final int b0(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new zn.i(0, list.size()) + "].");
    }
}
