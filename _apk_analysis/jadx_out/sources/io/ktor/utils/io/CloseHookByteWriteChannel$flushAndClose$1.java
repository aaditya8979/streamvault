package io.ktor.utils.io;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CloseHookByteWriteChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@d(c = "io.ktor.utils.io.CloseHookByteWriteChannel", f = "CloseHookByteWriteChannel.kt", l = {24, 25}, m = "flushAndClose")
public final class CloseHookByteWriteChannel$flushAndClose$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CloseHookByteWriteChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseHookByteWriteChannel$flushAndClose$1(CloseHookByteWriteChannel closeHookByteWriteChannel, c<? super CloseHookByteWriteChannel$flushAndClose$1> cVar) {
        super(cVar);
        this.this$0 = closeHookByteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
