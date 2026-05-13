package com.unity3d.ads.core.domain;

import bn.r;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HandleGatewayUniversalResponse.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface HandleGatewayUniversalResponse {
    @Nullable
    Object invoke(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull c<? super r> cVar);
}
