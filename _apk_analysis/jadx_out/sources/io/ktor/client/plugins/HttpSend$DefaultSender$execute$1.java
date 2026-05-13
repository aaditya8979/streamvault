package io.ktor.client.plugins;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.plugins.HttpSend;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpSend.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "execute")
public final class HttpSend$DefaultSender$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HttpSend.DefaultSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$DefaultSender$execute$1(HttpSend.DefaultSender defaultSender, hn.c<? super HttpSend$DefaultSender$execute$1> cVar) {
        super(cVar);
        this.this$0 = defaultSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
