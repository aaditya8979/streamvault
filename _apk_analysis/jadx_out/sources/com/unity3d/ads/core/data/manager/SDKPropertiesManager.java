package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SDKPropertiesManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface SDKPropertiesManager {
    @NotNull
    SdkProperties.InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(@NotNull SdkProperties.InitializationState initializationState);

    void setInitialized(boolean z10);
}
