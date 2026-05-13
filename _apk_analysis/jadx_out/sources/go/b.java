package go;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f62644g = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final fo.o<T> f62645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f62646f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull fo.o<? extends T> oVar, boolean z10, @NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(dVar, i10, bufferOverflow);
        this.f62645e = oVar;
        this.f62646f = z10;
    }

    public /* synthetic */ b(fo.o oVar, boolean z10, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, tn.i iVar) {
        this(oVar, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String c() {
        return "channel=" + this.f62645e;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull hn.c<? super bn.r> cVar) {
        if (this.f73402c != -3) {
            Object objCollect = super.collect(eVar, cVar);
            return objCollect == in.a.g() ? objCollect : bn.r.f5635a;
        }
        o();
        Object objD = FlowKt__ChannelsKt.d(eVar, this.f62645e, this.f62646f, cVar);
        return objD == in.a.g() ? objD : bn.r.f5635a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object e(@NotNull fo.m<? super T> mVar, @NotNull hn.c<? super bn.r> cVar) {
        Object objD = FlowKt__ChannelsKt.d(new ho.q(mVar), this.f62645e, this.f62646f, cVar);
        return objD == in.a.g() ? objD : bn.r.f5635a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<T> f(@NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new b(this.f62645e, this.f62646f, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public d<T> j() {
        return new b(this.f62645e, this.f62646f, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public fo.o<T> m(@NotNull l0 l0Var) {
        o();
        return this.f73402c == -3 ? this.f62645e : super.m(l0Var);
    }

    public final void o() {
        if (this.f62646f) {
            if (!(f62644g.getAndSet(this, 1) != 1)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
