package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.NativeConfigurationOuterClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetSafeguardedInitializationPolicy.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface GetSafeguardedInitializationPolicy {
    @NotNull
    NativeConfigurationOuterClass.RequestPolicy invoke(@NotNull NativeConfigurationOuterClass.RequestPolicy requestPolicy);
}
