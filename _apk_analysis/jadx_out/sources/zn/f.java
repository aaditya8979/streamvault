package zn;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface f<T extends Comparable<? super T>> {

    /* JADX INFO: compiled from: Range.kt */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull f<T> fVar, @NotNull T t10) {
            p.k(t10, "value");
            return t10.compareTo(fVar.getStart()) >= 0 && t10.compareTo(fVar.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull f<T> fVar) {
            return fVar.getStart().compareTo(fVar.getEndInclusive()) > 0;
        }
    }

    @NotNull
    T getEndInclusive();

    @NotNull
    T getStart();

    boolean isEmpty();
}
