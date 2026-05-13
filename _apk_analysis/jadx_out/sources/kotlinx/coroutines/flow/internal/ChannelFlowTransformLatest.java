package kotlinx.coroutines.flow.internal;

import bn.r;
import go.d;
import go.e;
import hn.c;
import in.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.i;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final q<e<? super R>, T, c<? super r>, Object> f73405f;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(@NotNull q<? super e<? super R>, ? super T, ? super c<? super r>, ? extends Object> qVar, @NotNull d<? extends T> dVar, @NotNull kotlin.coroutines.d dVar2, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(dVar, dVar2, i10, bufferOverflow);
        this.f73405f = qVar;
    }

    public /* synthetic */ ChannelFlowTransformLatest(q qVar, d dVar, kotlin.coroutines.d dVar2, int i10, BufferOverflow bufferOverflow, int i11, i iVar) {
        this(qVar, dVar, (i11 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar2, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<R> f(@NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f73405f, this.f73404e, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @Nullable
    public Object q(@NotNull e<? super R> eVar, @NotNull c<? super r> cVar) {
        Object objF = kotlinx.coroutines.d.f(new ChannelFlowTransformLatest$flowCollect$3(this, eVar, null), cVar);
        return objF == a.g() ? objF : r.f5635a;
    }
}
