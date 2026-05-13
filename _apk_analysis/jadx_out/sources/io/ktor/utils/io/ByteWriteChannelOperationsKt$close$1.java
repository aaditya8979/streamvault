package io.ktor.utils.io;

import bn.r;
import hn.c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import sl.f;
import sn.l;

/* JADX INFO: compiled from: ByteWriteChannelOperations.kt */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class ByteWriteChannelOperationsKt$close$1 extends FunctionReferenceImpl implements l<c<? super r>, Object> {
    public ByteWriteChannelOperationsKt$close$1(Object obj) {
        super(1, obj, f.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // sn.l
    public final Object invoke(c<? super r> cVar) {
        return ((f) this.receiver).c(cVar);
    }
}
