package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HandleGetTokenRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface HandleGetTokenRequest {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull BiddingSignals biddingSignals, @NotNull c<? super UniversalResponseOuterClass.UniversalResponse> cVar);
}
