package kl;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AttributesJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<a<?>, Object> f73169a = new HashMap();

    @Override // kl.b
    @NotNull
    public <T> T c(@NotNull a<T> aVar, @NotNull sn.a<? extends T> aVar2) {
        tn.p.k(aVar, "key");
        tn.p.k(aVar2, "block");
        T t10 = (T) h().get(aVar);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar2.invoke();
        Object objPut = h().put(aVar, tInvoke);
        if (objPut != null) {
            tInvoke = (T) objPut;
        }
        tn.p.i(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return tInvoke;
    }

    @Override // kl.c
    @NotNull
    public Map<a<?>, Object> h() {
        return this.f73169a;
    }
}
