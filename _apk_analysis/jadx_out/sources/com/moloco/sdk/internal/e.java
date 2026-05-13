package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    @NotNull
    Banner a(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull a aVar, @NotNull m mVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2);

    @NotNull
    InterstitialAd b(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar);

    @NotNull
    Banner c(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull a aVar, @NotNull m mVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2);

    @NotNull
    RewardedInterstitialAd d(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.acm.recorder.a aVar, @NotNull com.moloco.sdk.internal.services.config.a aVar2);

    @NotNull
    Banner e(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull a aVar, @NotNull m mVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2);

    @NotNull
    NativeAd f(@NotNull Context context, @NotNull com.moloco.sdk.internal.services.r rVar, @NotNull com.moloco.sdk.internal.services.b0 b0Var, @NotNull String str, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0 c0Var, @NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar, @NotNull a aVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, @NotNull com.moloco.sdk.internal.publisher.a0 a0Var, @NotNull com.moloco.sdk.internal.services.j jVar, @NotNull com.moloco.sdk.acm.recorder.a aVar2);
}
