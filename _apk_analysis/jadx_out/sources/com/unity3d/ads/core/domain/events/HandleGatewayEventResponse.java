package com.unity3d.ads.core.domain.events;

import bn.r;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HandleGatewayEventResponse.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface HandleGatewayEventResponse {
    @Nullable
    Object invoke(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull c<? super r> cVar);
}
