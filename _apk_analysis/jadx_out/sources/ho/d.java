package ho;

import io.l0;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.y;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    @Nullable
    public static final <T, V> Object b(@NotNull kotlin.coroutines.d dVar, V v10, @NotNull Object obj, @NotNull sn.p<? super V, ? super hn.c<? super T>, ? extends Object> pVar, @NotNull hn.c<? super T> cVar) {
        Object objI = l0.i(dVar, obj);
        try {
            r rVar = new r(cVar, dVar);
            Object objE = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.e(pVar, v10, rVar) : ((sn.p) y.e(pVar, 2)).mo2invoke(v10, rVar);
            l0.f(dVar, objI);
            if (objE == in.a.g()) {
                jn.f.c(cVar);
            }
            return objE;
        } catch (Throwable th2) {
            l0.f(dVar, objI);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(kotlin.coroutines.d dVar, Object obj, Object obj2, sn.p pVar, hn.c cVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = l0.g(dVar);
        }
        return b(dVar, obj, obj2, pVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> go.e<T> d(go.e<? super T> eVar, kotlin.coroutines.d dVar) {
        return ((eVar instanceof q) || (eVar instanceof l)) ? eVar : new UndispatchedContextCollector(eVar, dVar);
    }
}
