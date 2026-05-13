package ho;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SendingCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q<T> implements go.e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final fo.p<T> f63567b;

    /* JADX WARN: Multi-variable type inference failed */
    public q(@NotNull fo.p<? super T> pVar) {
        this.f63567b = pVar;
    }

    @Override // go.e
    @Nullable
    public Object emit(T t10, @NotNull hn.c<? super bn.r> cVar) {
        Object objI = this.f63567b.I(t10, cVar);
        return objI == in.a.g() ? objI : bn.r.f5635a;
    }
}
