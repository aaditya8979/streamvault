package io.ktor.http.cio;

import com.vungle.ads.internal.protos.Sdk;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Multipart.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 136}, m = "parsePartBodyImpl")
public final class MultipartKt$parsePartBodyImpl$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public MultipartKt$parsePartBodyImpl$1(c<? super MultipartKt$parsePartBodyImpl$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MultipartKt.l(null, null, null, null, 0L, this);
    }
}
