package kotlinx.coroutines.flow;

import bn.r;
import go.d;
import go.e;
import go.f;
import go.g;
import hn.c;
import ho.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__CollectKt {
    @Nullable
    public static final Object a(@NotNull d<?> dVar, @NotNull c<? super r> cVar) {
        Object objCollect = dVar.collect(l.f63562b, cVar);
        return objCollect == in.a.g() ? objCollect : r.f5635a;
    }

    @Nullable
    public static final <T> Object b(@NotNull d<? extends T> dVar, @NotNull p<? super T, ? super c<? super r>, ? extends Object> pVar, @NotNull c<? super r> cVar) {
        Object objK = f.k(g.b(f.E(dVar, pVar), 0, null, 2, null), cVar);
        return objK == in.a.g() ? objK : r.f5635a;
    }

    @Nullable
    public static final <T> Object c(@NotNull e<? super T> eVar, @NotNull d<? extends T> dVar, @NotNull c<? super r> cVar) {
        f.t(eVar);
        Object objCollect = dVar.collect(eVar, cVar);
        return objCollect == in.a.g() ? objCollect : r.f5635a;
    }

    @NotNull
    public static final <T> kotlinx.coroutines.g d(@NotNull d<? extends T> dVar, @NotNull l0 l0Var) {
        return i.d(l0Var, null, null, new FlowKt__CollectKt$launchIn$1(dVar, null), 3, null);
    }
}
