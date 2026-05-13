package cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes10.dex */
public class w extends v {
    @NotNull
    public static final <T> ArrayList<T> g(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new l(tArr, true));
    }

    @NotNull
    public static final <T> Collection<T> h(@NotNull T[] tArr) {
        tn.p.k(tArr, "<this>");
        return new l(tArr, false);
    }

    public static final <T> int i(@NotNull List<? extends T> list, int i10, int i11, @NotNull sn.l<? super T, Integer> lVar) {
        tn.p.k(list, "<this>");
        tn.p.k(lVar, "comparison");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = lVar.invoke(list.get(i13)).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int j(@NotNull List<? extends T> list, @Nullable T t10, int i10, int i11) {
        tn.p.k(list, "<this>");
        u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = fn.b.d(list.get(i13), t10);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int k(List list, int i10, int i11, sn.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return i(list, i10, i11, lVar);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return j(list, comparable, i10, i11);
    }

    @NotNull
    public static final <T> List<T> m() {
        return EmptyList.INSTANCE;
    }

    @NotNull
    public static final zn.i n(@NotNull Collection<?> collection) {
        tn.p.k(collection, "<this>");
        return new zn.i(0, collection.size() - 1);
    }

    public static final <T> int o(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    public static final <T> List<T> p(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return tArr.length > 0 ? p.f(tArr) : m();
    }

    @NotNull
    public static final <T> List<T> q(@Nullable T t10) {
        return t10 != null ? v.e(t10) : m();
    }

    @NotNull
    public static final <T> List<T> r(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return r.S(tArr);
    }

    @NotNull
    public static final <T> List<T> s(@NotNull T... tArr) {
        tn.p.k(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new l(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> t(@NotNull List<? extends T> list) {
        tn.p.k(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : v.e(list.get(0)) : m();
    }

    public static final void u(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static final void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
