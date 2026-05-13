package go;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes9.dex */
public class c<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final sn.p<fo.m<? super T>, hn.c<? super bn.r>, Object> f62647e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull sn.p<? super fo.m<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar, @NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(dVar, i10, bufferOverflow);
        this.f62647e = pVar;
    }

    public /* synthetic */ c(sn.p pVar, kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow, int i11, tn.i iVar) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static /* synthetic */ <T> Object n(c<T> cVar, fo.m<? super T> mVar, hn.c<? super bn.r> cVar2) {
        Object objMo2invoke = cVar.f62647e.mo2invoke(mVar, cVar2);
        return objMo2invoke == in.a.g() ? objMo2invoke : bn.r.f5635a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object e(@NotNull fo.m<? super T> mVar, @NotNull hn.c<? super bn.r> cVar) {
        return n(this, mVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<T> f(@NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new c(this.f62647e, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return "block[" + this.f62647e + "] -> " + super.toString();
    }
}
