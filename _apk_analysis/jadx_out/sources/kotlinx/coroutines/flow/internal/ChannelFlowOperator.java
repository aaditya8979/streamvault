package kotlinx.coroutines.flow.internal;

import bn.r;
import fo.m;
import go.d;
import go.e;
import hn.c;
import ho.q;
import in.a;
import kotlin.coroutines.c;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.f0;
import tn.p;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d<S> f73404e;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(@NotNull d<? extends S> dVar, @NotNull kotlin.coroutines.d dVar2, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(dVar2, i10, bufferOverflow);
        this.f73404e = dVar;
    }

    public static /* synthetic */ <S, T> Object n(ChannelFlowOperator<S, T> channelFlowOperator, e<? super T> eVar, c<? super r> cVar) {
        if (channelFlowOperator.f73402c == -3) {
            kotlin.coroutines.d context = cVar.getContext();
            kotlin.coroutines.d dVarK = f0.k(context, channelFlowOperator.f73401b);
            if (p.f(dVarK, context)) {
                Object objQ = channelFlowOperator.q(eVar, cVar);
                return objQ == a.g() ? objQ : r.f5635a;
            }
            c.b bVar = kotlin.coroutines.c.G8;
            if (p.f(dVarK.get(bVar), context.get(bVar))) {
                Object objP = channelFlowOperator.p(eVar, dVarK, cVar);
                return objP == a.g() ? objP : r.f5635a;
            }
        }
        Object objCollect = super.collect(eVar, cVar);
        return objCollect == a.g() ? objCollect : r.f5635a;
    }

    public static /* synthetic */ <S, T> Object o(ChannelFlowOperator<S, T> channelFlowOperator, m<? super T> mVar, hn.c<? super r> cVar) {
        Object objQ = channelFlowOperator.q(new q(mVar), cVar);
        return objQ == a.g() ? objQ : r.f5635a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull hn.c<? super r> cVar) {
        return n(this, eVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object e(@NotNull m<? super T> mVar, @NotNull hn.c<? super r> cVar) {
        return o(this, mVar, cVar);
    }

    public final Object p(e<? super T> eVar, kotlin.coroutines.d dVar, hn.c<? super r> cVar) {
        return ho.d.c(dVar, ho.d.d(eVar, cVar.getContext()), null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), cVar, 4, null);
    }

    @Nullable
    public abstract Object q(@NotNull e<? super T> eVar, @NotNull hn.c<? super r> cVar);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return this.f73404e + " -> " + super.toString();
    }
}
