package go;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class w extends ho.c<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReference<Object> f62664a = new AtomicReference<>(null);

    @Override // ho.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NotNull StateFlowImpl<?> stateFlowImpl) {
        if (io.d.a(this.f62664a) != null) {
            return false;
        }
        io.d.b(this.f62664a, v.f62662a);
        return true;
    }

    @Nullable
    public final Object e(@NotNull hn.c<? super bn.r> cVar) {
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        if (!androidx.compose.animation.core.a.a(this.f62664a, v.f62662a, cVar2)) {
            Result.a aVar = Result.Companion;
            cVar2.resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
        }
        Object objB = cVar2.B();
        if (objB == in.a.g()) {
            jn.f.c(cVar);
        }
        return objB == in.a.g() ? objB : bn.r.f5635a;
    }

    @Override // ho.c
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public hn.c<bn.r>[] b(@NotNull StateFlowImpl<?> stateFlowImpl) {
        io.d.b(this.f62664a, null);
        return ho.b.f63557a;
    }

    public final void g() {
        AtomicReference<Object> atomicReference = this.f62664a;
        while (true) {
            Object objA = io.d.a(atomicReference);
            if (objA == null || objA == v.f62663b) {
                return;
            }
            if (objA == v.f62662a) {
                if (androidx.compose.animation.core.a.a(this.f62664a, objA, v.f62663b)) {
                    return;
                }
            } else if (androidx.compose.animation.core.a.a(this.f62664a, objA, v.f62662a)) {
                Result.a aVar = Result.Companion;
                ((kotlinx.coroutines.c) objA).resumeWith(Result.m7534constructorimpl(bn.r.f5635a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f62664a.getAndSet(v.f62662a);
        tn.p.h(andSet);
        return andSet == v.f62663b;
    }
}
