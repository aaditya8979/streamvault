package io.ktor.utils.io;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteReadChannelOperations.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {39}, m = "toByteArray")
public final class ByteReadChannelOperationsKt$toByteArray$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$toByteArray$1(c<? super ByteReadChannelOperationsKt$toByteArray$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.w(null, this);
    }
}
