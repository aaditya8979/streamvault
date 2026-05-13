package gl;

import cn.w0;
import gl.m;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h f62545c = new h();

    @Override // kl.t
    @Nullable
    public List<String> a(@NotNull String str) {
        tn.p.k(str, "name");
        return null;
    }

    @Override // kl.t
    public boolean b() {
        return true;
    }

    @Override // kl.t
    public void c(@NotNull sn.p<? super String, ? super List<String>, bn.r> pVar) {
        m.b.a(this, pVar);
    }

    @Override // kl.t
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return w0.f();
    }

    @Override // kl.t
    @Nullable
    public String get(@NotNull String str) {
        return m.b.b(this, str);
    }

    @Override // kl.t
    @NotNull
    public Set<String> names() {
        return w0.f();
    }

    @NotNull
    public String toString() {
        return "Headers " + entries();
    }
}
