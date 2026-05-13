package io.ktor.utils.io;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountedByteReadChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@d(c = "io.ktor.utils.io.CountedByteReadChannel", f = "CountedByteReadChannel.kt", l = {48}, m = "awaitContent")
public final class CountedByteReadChannel$awaitContent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CountedByteReadChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountedByteReadChannel$awaitContent$1(CountedByteReadChannel countedByteReadChannel, c<? super CountedByteReadChannel$awaitContent$1> cVar) {
        super(cVar);
        this.this$0 = countedByteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(0, this);
    }
}
