package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAdDataRefreshRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface GetAdDataRefreshRequest {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull c<? super UniversalRequestOuterClass.UniversalRequest> cVar);
}
