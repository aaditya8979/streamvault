package com.unity3d.ads.core.domain;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CommonValidateGameId.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonValidateGameId implements ValidateGameId {

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final SetGameId setGameId;

    public CommonValidateGameId(@NotNull GetGameId getGameId, @NotNull SetGameId setGameId) {
        p.k(getGameId, "getGameId");
        p.k(setGameId, "setGameId");
        this.getGameId = getGameId;
        this.setGameId = setGameId;
    }

    @Override // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(@Nullable String str) {
        if (this.getGameId.invoke() != null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        this.setGameId.invoke(str);
        return true;
    }
}
