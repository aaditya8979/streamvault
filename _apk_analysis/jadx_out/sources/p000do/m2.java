package p000do;

import io.e0;
import io.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m2 f59866a = new m2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<c1> f59867b = o0.a(new e0("ThreadLocalEventLoop"));

    @Nullable
    public final c1 a() {
        return f59867b.get();
    }

    @NotNull
    public final c1 b() {
        ThreadLocal<c1> threadLocal = f59867b;
        c1 c1Var = threadLocal.get();
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1VarA = f1.a();
        threadLocal.set(c1VarA);
        return c1VarA;
    }

    public final void c() {
        f59867b.set(null);
    }

    public final void d(@NotNull c1 c1Var) {
        f59867b.set(c1Var);
    }
}
