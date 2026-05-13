package com.unity3d.ads.core.domain;

import bn.r;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HandleGatewayInitializationResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface HandleGatewayInitializationResponse {
    @Nullable
    Object invoke(@NotNull InitializationResponseOuterClass.InitializationResponse initializationResponse, @NotNull c<? super r> cVar);
}
