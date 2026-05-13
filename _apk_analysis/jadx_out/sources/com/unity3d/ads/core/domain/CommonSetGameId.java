package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonSetGameId.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CommonSetGameId implements SetGameId {

    @NotNull
    private final SessionRepository sessionRepository;

    public CommonSetGameId(@NotNull SessionRepository sessionRepository) {
        p.k(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetGameId
    public void invoke(@Nullable String str) {
        this.sessionRepository.setGameId(str);
    }
}
