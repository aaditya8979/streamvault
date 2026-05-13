package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import org.jetbrains.annotations.NotNull;
import zn.f;

/* JADX INFO: compiled from: Range.kt */
/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class RangeKt {
    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> and(@NotNull Range<T> range, @NotNull Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> plus(@NotNull Range<T> range, @NotNull Range<T> range2) {
        return range.extend(range2);
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> plus(@NotNull Range<T> range, @NotNull T t10) {
        return range.extend(t10);
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(@NotNull T t10, @NotNull T t11) {
        return new Range<>(t10, t11);
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> f<T> toClosedRange(@NotNull final Range<T> range) {
        return (f<T>) new f<T>() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(@NotNull Comparable comparable) {
                return f.a.a(this, comparable);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // zn.f
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // zn.f
            public Comparable getStart() {
                return range.getLower();
            }

            @Override // zn.f
            public boolean isEmpty() {
                return f.a.b(this);
            }
        };
    }

    @RequiresApi(21)
    @NotNull
    public static final <T extends Comparable<? super T>> Range<T> toRange(@NotNull f<T> fVar) {
        return new Range<>(fVar.getStart(), fVar.getEndInclusive());
    }
}
