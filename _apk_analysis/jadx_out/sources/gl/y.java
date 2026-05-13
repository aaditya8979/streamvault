package gl;

import cn.w0;
import gl.x;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<x> f62633a;

    static {
        x.a aVar = x.f62623b;
        f62633a = w0.j(aVar.b(), aVar.c(), aVar.d(), new x("TRACE"));
    }

    public static final boolean a(@NotNull x xVar) {
        tn.p.k(xVar, "<this>");
        return !f62633a.contains(xVar);
    }
}
