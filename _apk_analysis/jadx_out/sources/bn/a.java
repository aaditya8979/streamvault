package bn;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a<T, R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final sn.q<b<T, R>, T, hn.c<? super R>, Object> f5608a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull sn.q<? super b<T, R>, ? super T, ? super hn.c<? super R>, ? extends Object> qVar) {
        tn.p.k(qVar, "block");
        this.f5608a = qVar;
    }

    @NotNull
    public final sn.q<b<T, R>, T, hn.c<? super R>, Object> a() {
        return this.f5608a;
    }
}
