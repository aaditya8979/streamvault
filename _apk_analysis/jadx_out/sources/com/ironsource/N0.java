package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface N0 {
    void a();

    void a(@Nullable IronSourceError ironSourceError);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        tn.p.k(levelPlayAdInfo, "adInfo");
    }
}
