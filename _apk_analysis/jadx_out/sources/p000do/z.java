package p000do;

import hn.c;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class z {
    @NotNull
    public static final <T> Object a(@Nullable Object obj, @NotNull c<? super T> cVar) {
        if (!(obj instanceof y)) {
            return Result.m7534constructorimpl(obj);
        }
        Result.a aVar = Result.Companion;
        return Result.m7534constructorimpl(kotlin.c.a(((y) obj).f59911a));
    }

    @Nullable
    public static final <T> Object b(@NotNull Object obj) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        return thM7537exceptionOrNullimpl == null ? obj : new y(thM7537exceptionOrNullimpl, false, 2, null);
    }

    @Nullable
    public static final <T> Object c(@NotNull Object obj, @NotNull k<?> kVar) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(obj);
        return thM7537exceptionOrNullimpl == null ? obj : new y(thM7537exceptionOrNullimpl, false, 2, null);
    }
}
