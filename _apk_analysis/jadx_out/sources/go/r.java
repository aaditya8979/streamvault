package go;

import kotlinx.coroutines.flow.SharedFlowImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class r extends ho.c<SharedFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f62656a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public hn.c<? super bn.r> f62657b;

    @Override // ho.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull SharedFlowImpl<?> sharedFlowImpl) {
        if (this.f62656a >= 0) {
            return false;
        }
        this.f62656a = sharedFlowImpl.X();
        return true;
    }

    @Override // ho.c
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public hn.c<bn.r>[] b(@NotNull SharedFlowImpl<?> sharedFlowImpl) {
        long j10 = this.f62656a;
        this.f62656a = -1L;
        this.f62657b = null;
        return sharedFlowImpl.W(j10);
    }
}
