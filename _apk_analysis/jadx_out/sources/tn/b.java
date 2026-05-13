package tn;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayIterator.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    @NotNull
    public static final <T> Iterator<T> a(@NotNull T[] tArr) {
        p.k(tArr, "array");
        return new a(tArr);
    }
}
