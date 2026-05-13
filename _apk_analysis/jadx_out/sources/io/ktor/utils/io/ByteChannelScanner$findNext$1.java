package io.ktor.utils.io;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteChannelScanner.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", l = {53, 55, 58, 70}, m = "findNext$ktor_io")
public final class ByteChannelScanner$findNext$1 extends ContinuationImpl {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ByteChannelScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelScanner$findNext$1(ByteChannelScanner byteChannelScanner, c<? super ByteChannelScanner$findNext$1> cVar) {
        super(cVar);
        this.this$0 = byteChannelScanner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(false, this);
    }
}
