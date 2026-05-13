package cn;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MutableCollectionsJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
public class a0 extends z {
    public static final <T extends Comparable<? super T>> void C(@NotNull List<T> list) {
        tn.p.k(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static final <T> void D(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        tn.p.k(list, "<this>");
        tn.p.k(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
