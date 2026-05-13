package io.ktor.client.plugins;

import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpRedirect.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", l = {97}, m = "HttpRedirect$lambda$2$handleCall")
public final class HttpRedirectKt$HttpRedirect$2$handleCall$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    public HttpRedirectKt$HttpRedirect$2$handleCall$1(hn.c<? super HttpRedirectKt$HttpRedirect$2$handleCall$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpRedirectKt.c(null, null, null, false, null, this);
    }
}
