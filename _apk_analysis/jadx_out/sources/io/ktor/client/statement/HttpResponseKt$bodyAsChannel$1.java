package io.ktor.client.statement;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpResponse.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "io.ktor.client.statement.HttpResponseKt", f = "HttpResponse.kt", l = {147}, m = "bodyAsChannel")
public final class HttpResponseKt$bodyAsChannel$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public HttpResponseKt$bodyAsChannel$1(c<? super HttpResponseKt$bodyAsChannel$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpResponseKt.a(null, this);
    }
}
