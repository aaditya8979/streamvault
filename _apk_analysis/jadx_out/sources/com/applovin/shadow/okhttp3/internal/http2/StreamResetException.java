package com.applovin.shadow.okhttp3.internal.http2;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: StreamResetException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StreamResetException extends IOException {

    @NotNull
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(@NotNull ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        p.k(errorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.errorCode = errorCode;
    }
}
