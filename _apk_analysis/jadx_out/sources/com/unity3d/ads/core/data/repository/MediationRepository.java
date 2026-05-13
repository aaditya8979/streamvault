package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MediationRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface MediationRepository {
    @NotNull
    sn.a<ClientInfoOuterClass.MediationProvider> getMediationProvider();

    @Nullable
    String getName();

    @Nullable
    String getVersion();
}
