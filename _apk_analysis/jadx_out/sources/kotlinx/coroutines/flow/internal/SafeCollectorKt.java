package kotlinx.coroutines.flow.internal;

import bn.r;
import go.e;
import hn.c;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.p;
import tn.y;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class SafeCollectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q<e<Object>, Object, c<? super r>, Object> f73412a;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.INSTANCE;
        p.i(safeCollectorKt$emitFun$1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f73412a = (q) y.e(safeCollectorKt$emitFun$1, 3);
    }
}
