package zn;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface e<T extends Comparable<? super T>> extends f<T> {
    boolean a(@NotNull T t10, @NotNull T t11);

    boolean contains(@NotNull T t10);

    @Override // zn.f
    boolean isEmpty();
}
