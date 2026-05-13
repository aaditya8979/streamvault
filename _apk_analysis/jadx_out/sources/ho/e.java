package ho;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e<T> extends ChannelFlowOperator<T, T> {
    public e(@NotNull go.d<? extends T> dVar, @NotNull kotlin.coroutines.d dVar2, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(dVar, dVar2, i10, bufferOverflow);
    }

    public /* synthetic */ e(go.d dVar, kotlin.coroutines.d dVar2, int i10, BufferOverflow bufferOverflow, int i11, tn.i iVar) {
        this(dVar, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar2, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<T> f(@NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new e(this.f73404e, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public go.d<T> j() {
        return (go.d<T>) this.f73404e;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    @Nullable
    public Object q(@NotNull go.e<? super T> eVar, @NotNull hn.c<? super bn.r> cVar) {
        Object objCollect = this.f73404e.collect((go.e<? super S>) eVar, cVar);
        return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
    }
}
