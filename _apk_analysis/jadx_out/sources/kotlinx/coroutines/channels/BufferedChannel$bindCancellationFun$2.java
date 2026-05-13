package kotlinx.coroutines.channels;

import bn.r;
import kotlin.coroutines.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.q;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class BufferedChannel$bindCancellationFun$2<E> extends FunctionReferenceImpl implements q<Throwable, E, d, r> {
    public BufferedChannel$bindCancellationFun$2(Object obj) {
        super(3, obj, BufferedChannel.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sn.q
    public /* bridge */ /* synthetic */ r invoke(Throwable th2, Object obj, d dVar) {
        invoke2(th2, obj, dVar);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2, E e10, d dVar) {
        ((BufferedChannel) this.receiver).E0(th2, e10, dVar);
    }
}
