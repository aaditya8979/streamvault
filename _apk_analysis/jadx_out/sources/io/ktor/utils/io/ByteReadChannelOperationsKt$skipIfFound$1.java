package io.ktor.utils.io;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteReadChannelOperations.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", l = {598, CommonGatewayClient.CODE_599}, m = "skipIfFound")
public final class ByteReadChannelOperationsKt$skipIfFound$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public ByteReadChannelOperationsKt$skipIfFound$1(c<? super ByteReadChannelOperationsKt$skipIfFound$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.v(null, null, this);
    }
}
