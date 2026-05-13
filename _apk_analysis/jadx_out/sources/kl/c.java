package kl;

import cn.f0;
import java.util.List;
import java.util.Map;
import kl.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AttributesJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements b {
    @Override // kl.b
    @NotNull
    public <T> T a(@NotNull a<T> aVar) {
        return (T) b.a.a(this, aVar);
    }

    @Override // kl.b
    public final <T> void b(@NotNull a<T> aVar) {
        tn.p.k(aVar, "key");
        h().remove(aVar);
    }

    @Override // kl.b
    @NotNull
    public final List<a<?>> d() {
        return f0.g1(h().keySet());
    }

    @Override // kl.b
    @Nullable
    public final <T> T e(@NotNull a<T> aVar) {
        tn.p.k(aVar, "key");
        return (T) h().get(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kl.b
    public final <T> void f(@NotNull a<T> aVar, @NotNull T t10) {
        tn.p.k(aVar, "key");
        tn.p.k(t10, "value");
        h().put(aVar, t10);
    }

    @Override // kl.b
    public final boolean g(@NotNull a<?> aVar) {
        tn.p.k(aVar, "key");
        return h().containsKey(aVar);
    }

    @NotNull
    public abstract Map<a<?>, Object> h();
}
