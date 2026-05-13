package kotlin.enums;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    @NotNull
    public static final <E extends Enum<E>> kn.a<E> a(@NotNull E[] eArr) {
        p.k(eArr, "entries");
        return new EnumEntriesList(eArr);
    }
}
