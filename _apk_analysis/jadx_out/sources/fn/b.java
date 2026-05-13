package fn;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes12.dex */
public class b {
    @NotNull
    public static final <T> Comparator<T> b(@NotNull final l<? super T, ? extends Comparable<?>>... lVarArr) {
        p.k(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new Comparator() { // from class: fn.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return b.c(lVarArr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int c(l[] lVarArr, Object obj, Object obj2) {
        return e(obj, obj2, lVarArr);
    }

    public static final <T extends Comparable<?>> int d(@Nullable T t10, @Nullable T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    public static final <T> int e(T t10, T t11, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int iD = d(lVar.invoke(t10), lVar.invoke(t11));
            if (iD != 0) {
                return iD;
            }
        }
        return 0;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Comparator<T> f() {
        d dVar = d.f61757b;
        p.i(dVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return dVar;
    }
}
