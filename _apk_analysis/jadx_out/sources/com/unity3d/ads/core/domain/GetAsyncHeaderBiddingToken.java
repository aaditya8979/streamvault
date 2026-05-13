package com.unity3d.ads.core.domain;

import bn.r;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetAsyncHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface GetAsyncHeaderBiddingToken {
    @Nullable
    Object invoke(int i10, @Nullable TokenConfiguration tokenConfiguration, @Nullable IUnityAdsTokenListener iUnityAdsTokenListener, @NotNull c<? super r> cVar);
}
