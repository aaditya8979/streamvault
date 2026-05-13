package p000do;

import io.f0;
import io.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f59875a = f0.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final r0 f59876b = b();

    @NotNull
    public static final r0 a() {
        return f59876b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final r0 b() {
        if (!f59875a) {
            return n0.f59868h;
        }
        y1 y1VarC = w0.c();
        return (u.c(y1VarC) || !(y1VarC instanceof r0)) ? n0.f59868h : (r0) y1VarC;
    }
}
