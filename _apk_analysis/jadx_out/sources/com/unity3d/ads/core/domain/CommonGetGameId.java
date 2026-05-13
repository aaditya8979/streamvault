package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonGetGameId.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetGameId implements GetGameId {

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonGetGameId(@NotNull SessionRepository sessionRepository) {
        p.k(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetGameId
    @Nullable
    public String invoke() {
        return this.sessionRepository.getGameId();
    }
}
