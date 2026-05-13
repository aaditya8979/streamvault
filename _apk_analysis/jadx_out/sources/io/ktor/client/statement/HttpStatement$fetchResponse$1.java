package io.ktor.client.statement;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpStatement.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {162, 165, 166}, m = "fetchResponse")
public final class HttpStatement$fetchResponse$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HttpStatement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpStatement$fetchResponse$1(HttpStatement httpStatement, c<? super HttpStatement$fetchResponse$1> cVar) {
        super(cVar);
        this.this$0 = httpStatement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
