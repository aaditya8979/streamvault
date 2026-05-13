package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UniversalRequestTtlValidator.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface UniversalRequestTtlValidator {
    boolean invoke(@NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy);
}
