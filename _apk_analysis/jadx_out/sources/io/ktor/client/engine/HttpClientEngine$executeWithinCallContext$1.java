package io.ktor.client.engine;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import hn.c;
import io.ktor.client.engine.HttpClientEngine;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpClientEngine.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 184}, m = "executeWithinCallContext")
public final class HttpClientEngine$executeWithinCallContext$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public HttpClientEngine$executeWithinCallContext$1(c<? super HttpClientEngine$executeWithinCallContext$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpClientEngine.DefaultImpls.e(null, null, this);
    }
}
