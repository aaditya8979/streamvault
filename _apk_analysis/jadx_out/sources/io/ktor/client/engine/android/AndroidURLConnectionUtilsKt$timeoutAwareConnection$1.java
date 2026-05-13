package io.ktor.client.engine.android;

import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidURLConnectionUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", f = "AndroidURLConnectionUtils.kt", l = {61}, m = "timeoutAwareConnection")
public final class AndroidURLConnectionUtilsKt$timeoutAwareConnection$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public AndroidURLConnectionUtilsKt$timeoutAwareConnection$1(c<? super AndroidURLConnectionUtilsKt$timeoutAwareConnection$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AndroidURLConnectionUtilsKt.e(null, null, null, this);
    }
}
