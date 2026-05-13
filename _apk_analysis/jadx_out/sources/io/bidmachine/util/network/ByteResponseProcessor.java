package io.bidmachine.util.network;

import java.net.URLConnection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ByteResponseProcessor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/network/ByteResponseProcessor;", "Lio/bidmachine/util/network/ResponseProcessor;", "", "()V", "process", "urlConnection", "Ljava/net/URLConnection;", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ByteResponseProcessor implements ResponseProcessor<byte[]> {
    @Override // io.bidmachine.util.network.ResponseProcessor
    @NotNull
    public byte[] process(@NotNull URLConnection urlConnection) throws Throwable {
        p.k(urlConnection, "urlConnection");
        return NetworkUtilsKt.readBytes(urlConnection);
    }
}
