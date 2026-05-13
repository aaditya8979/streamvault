package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface E6 {
    void a(@NotNull Activity activity);

    void a(@NotNull C4264t6 c4264t6);

    void a(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError);

    void a(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull C4264t6 c4264t6, @Nullable IronSourceError ironSourceError);

    void b(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@NotNull C4264t6 c4264t6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
