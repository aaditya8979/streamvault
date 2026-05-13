package kotlinx.coroutines.flow;

import bn.r;
import go.d;
import go.e;
import go.f;
import hn.c;
import io.f0;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.jetbrains.annotations.NotNull;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class FlowKt__MergeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f73355a = f0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    @NotNull
    public static final <T, R> d<R> a(@NotNull d<? extends T> dVar, @NotNull p<? super T, ? super c<? super R>, ? extends Object> pVar) {
        return f.P(dVar, new FlowKt__MergeKt$mapLatest$1(pVar, null));
    }

    @NotNull
    public static final <T, R> d<R> b(@NotNull d<? extends T> dVar, @NotNull q<? super e<? super R>, ? super T, ? super c<? super r>, ? extends Object> qVar) {
        return new ChannelFlowTransformLatest(qVar, dVar, null, 0, null, 28, null);
    }
}
