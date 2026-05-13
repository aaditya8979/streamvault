package io.ktor.http.cio;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpParser.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", l = {122}, m = "parseHeaders")
public final class HttpParserKt$parseHeaders$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;

    public HttpParserKt$parseHeaders$2(c<? super HttpParserKt$parseHeaders$2> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpParserKt.g(null, null, null, this);
    }
}
