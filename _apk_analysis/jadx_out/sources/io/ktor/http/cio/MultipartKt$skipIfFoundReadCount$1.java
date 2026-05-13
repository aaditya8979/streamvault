package io.ktor.http.cio;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Multipart.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {143}, m = "skipIfFoundReadCount")
public final class MultipartKt$skipIfFoundReadCount$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public MultipartKt$skipIfFoundReadCount$1(c<? super MultipartKt$skipIfFoundReadCount$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MultipartKt.o(null, null, this);
    }
}
