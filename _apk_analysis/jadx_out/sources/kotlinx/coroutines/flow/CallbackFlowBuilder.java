package kotlinx.coroutines.flow;

import bn.r;
import fo.m;
import go.c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import sn.p;
import tn.i;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CallbackFlowBuilder<T> extends c<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final p<m<? super T>, hn.c<? super r>, Object> f73319f;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackFlowBuilder(@NotNull p<? super m<? super T>, ? super hn.c<? super r>, ? extends Object> pVar, @NotNull d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(pVar, dVar, i10, bufferOverflow);
        this.f73319f = pVar;
    }

    public /* synthetic */ CallbackFlowBuilder(p pVar, d dVar, int i10, BufferOverflow bufferOverflow, int i11, i iVar) {
        this(pVar, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // go.c, kotlinx.coroutines.flow.internal.ChannelFlow
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@org.jetbrains.annotations.NotNull fo.m<? super T> r5, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = in.a.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            fo.m r5 = (fo.m) r5
            kotlin.c.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = super.e(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.v()
            if (r5 == 0) goto L4c
            bn.r r5 = bn.r.f5635a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.e(fo.m, hn.c):java.lang.Object");
    }

    @Override // go.c, kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<T> f(@NotNull d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.f73319f, dVar, i10, bufferOverflow);
    }
}
