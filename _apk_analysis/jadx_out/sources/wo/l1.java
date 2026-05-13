package wo;

import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public volatile SoftReference<T> f86567a = new SoftReference<>(null);

    public final synchronized T a(@NotNull sn.a<? extends T> aVar) {
        tn.p.k(aVar, "factory");
        T t10 = this.f86567a.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar.invoke();
        this.f86567a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
