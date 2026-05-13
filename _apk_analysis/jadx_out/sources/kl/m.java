package kl;

import java.util.Collections;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionsJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    @NotNull
    public static final <T> Set<T> a(@NotNull Set<? extends T> set) {
        tn.p.k(set, "<this>");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(set);
        tn.p.j(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }
}
