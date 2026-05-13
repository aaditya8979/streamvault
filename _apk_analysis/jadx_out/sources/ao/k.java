package ao;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class k<T> {
    @Nullable
    public abstract Object b(T t10, @NotNull hn.c<? super bn.r> cVar);

    @Nullable
    public final Object c(@NotNull i<? extends T> iVar, @NotNull hn.c<? super bn.r> cVar) {
        Object objF = f(iVar.iterator(), cVar);
        return objF == in.a.g() ? objF : bn.r.f5635a;
    }

    @Nullable
    public abstract Object f(@NotNull Iterator<? extends T> it, @NotNull hn.c<? super bn.r> cVar);
}
