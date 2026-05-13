package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonGetInitializationState.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonGetInitializationState implements GetInitializationState {

    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(@NotNull SessionRepository sessionRepository, @NotNull SDKPropertiesManager sDKPropertiesManager) {
        p.k(sessionRepository, "sessionRepository");
        p.k(sDKPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.GetInitializationState
    @NotNull
    public InitializationState invoke(boolean z10) {
        return z10 ? InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState()) : this.sessionRepository.getInitializationState();
    }
}
