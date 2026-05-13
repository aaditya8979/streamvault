package kotlin;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    @NotNull
    public static final Object a(@NotNull Throwable th2) {
        p.k(th2, "exception");
        return new Result.Failure(th2);
    }

    public static final void b(@NotNull Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
