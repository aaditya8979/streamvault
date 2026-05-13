package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: CommonSetInitializationState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CommonSetInitializationState implements SetInitializationState {

    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(@NotNull SessionRepository sessionRepository, @NotNull SDKPropertiesManager sDKPropertiesManager) {
        p.k(sessionRepository, "sessionRepository");
        p.k(sDKPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sDKPropertiesManager;
    }

    @Override // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(@NotNull InitializationState initializationState, boolean z10) {
        p.k(initializationState, "state");
        if (z10) {
            this.sdkPropertiesManager.setInitializeState(InitializationStateKt.toLegacy(initializationState));
        } else {
            this.sessionRepository.setInitializationState(initializationState);
        }
    }
}
