package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Refresh.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Refresh {
    @Nullable
    Object invoke(@NotNull ByteString byteString, @NotNull ByteString byteString2, @NotNull c<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> cVar);
}
