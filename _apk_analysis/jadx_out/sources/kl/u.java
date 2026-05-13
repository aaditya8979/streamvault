package kl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface u {
    @Nullable
    List<String> a(@NotNull String str);

    boolean b();

    void c(@NotNull String str, @NotNull Iterable<String> iterable);

    void clear();

    boolean contains(@NotNull String str);

    void d(@NotNull t tVar);

    void e(@NotNull String str, @NotNull String str2);

    @NotNull
    Set<Map.Entry<String, List<String>>> entries();

    boolean isEmpty();

    @NotNull
    Set<String> names();
}
