package kl;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AttributesJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<a<?>, Object> f73160a = new ConcurrentHashMap<>();

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
        Object objPutIfAbsent = h().putIfAbsent(aVar, tInvoke);
        if (objPutIfAbsent != null) {
            tInvoke = (T) objPutIfAbsent;
        }
        tn.p.i(tInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return tInvoke;
    }

    @Override // kl.c
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap<a<?>, Object> h() {
        return this.f73160a;
    }
}
