package ql;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: StackTraceRecover.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    @NotNull
    public static final Throwable a(@NotNull Throwable th2, @NotNull hn.c<?> cVar) {
        p.k(th2, "exception");
        p.k(cVar, "continuation");
        try {
            return i.a(th2, th2.getCause());
        } catch (Throwable unused) {
            return th2;
        }
    }
}
