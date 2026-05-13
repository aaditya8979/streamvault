package cn;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes7.dex */
public class b0 extends a0 {
    public static final <T> boolean E(@NotNull Collection<? super T> collection, @NotNull ao.i<? extends T> iVar) {
        tn.p.k(collection, "<this>");
        tn.p.k(iVar, "elements");
        Iterator<? extends T> it = iVar.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean F(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        tn.p.k(collection, "<this>");
        tn.p.k(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean G(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        tn.p.k(collection, "<this>");
        tn.p.k(tArr, "elements");
        return collection.addAll(p.f(tArr));
    }

    @NotNull
    public static final <T> Collection<T> H(@NotNull Iterable<? extends T> iterable) {
        tn.p.k(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : f0.g1(iterable);
    }

    public static final <T> boolean I(Iterable<? extends T> iterable, sn.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final <T> boolean J(List<T> list, sn.l<? super T, Boolean> lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            tn.p.i(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return I(tn.y.b(list), lVar, z10);
        }
        int iO = w.o(list);
        if (iO >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (lVar.invoke(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iO2 = w.o(list);
        if (i10 > iO2) {
            return true;
        }
        while (true) {
            list.remove(iO2);
            if (iO2 == i10) {
                return true;
            }
            iO2--;
        }
    }

    public static final <T> boolean K(@NotNull Iterable<? extends T> iterable, @NotNull sn.l<? super T, Boolean> lVar) {
        tn.p.k(iterable, "<this>");
        tn.p.k(lVar, "predicate");
        return I(iterable, lVar, true);
    }

    public static final <T> boolean L(@NotNull Collection<? super T> collection, @NotNull ao.i<? extends T> iVar) {
        tn.p.k(collection, "<this>");
        tn.p.k(iVar, "elements");
        List listU = SequencesKt___SequencesKt.U(iVar);
        return (listU.isEmpty() ^ true) && collection.removeAll(listU);
    }

    public static final <T> boolean M(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        tn.p.k(collection, "<this>");
        tn.p.k(iterable, "elements");
        return collection.removeAll(H(iterable));
    }

    public static final <T> boolean N(@NotNull Collection<? super T> collection, @NotNull T[] tArr) {
        tn.p.k(collection, "<this>");
        tn.p.k(tArr, "elements");
        return ((tArr.length == 0) ^ true) && collection.removeAll(p.f(tArr));
    }

    public static final <T> boolean O(@NotNull List<T> list, @NotNull sn.l<? super T, Boolean> lVar) {
        tn.p.k(list, "<this>");
        tn.p.k(lVar, "predicate");
        return J(list, lVar, true);
    }

    public static final <T> T P(@NotNull List<T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @Nullable
    public static final <T> T Q(@NotNull List<T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final <T> T R(@NotNull List<T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(w.o(list));
    }

    @Nullable
    public static final <T> T S(@NotNull List<T> list) {
        tn.p.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(w.o(list));
    }

    public static final <T> boolean T(@NotNull Iterable<? extends T> iterable, @NotNull sn.l<? super T, Boolean> lVar) {
        tn.p.k(iterable, "<this>");
        tn.p.k(lVar, "predicate");
        return I(iterable, lVar, false);
    }

    public static final <T> boolean U(@NotNull Collection<? super T> collection, @NotNull Iterable<? extends T> iterable) {
        tn.p.k(collection, "<this>");
        tn.p.k(iterable, "elements");
        return collection.retainAll(H(iterable));
    }
}
