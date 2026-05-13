package cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: _CollectionsJvm.kt */
/* JADX INFO: loaded from: classes7.dex */
public class d0 extends c0 {
    @NotNull
    public static final <R> List<R> c0(@NotNull Iterable<?> iterable, @NotNull Class<R> cls) {
        tn.p.k(iterable, "<this>");
        tn.p.k(cls, "klass");
        return (List) d0(iterable, new ArrayList(), cls);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C d0(@NotNull Iterable<?> iterable, @NotNull C c10, @NotNull Class<R> cls) {
        tn.p.k(iterable, "<this>");
        tn.p.k(c10, "destination");
        tn.p.k(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c10.add(obj);
            }
        }
        return c10;
    }

    public static final <T> void e0(@NotNull List<T> list) {
        tn.p.k(list, "<this>");
        Collections.reverse(list);
    }
}
