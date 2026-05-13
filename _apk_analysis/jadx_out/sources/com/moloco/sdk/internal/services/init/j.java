package com.moloco.sdk.internal.services.init;

import androidx.annotation.VisibleForTesting;
import bn.r;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.g0;
import com.moloco.sdk.publisher.MediationInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface j {
    @VisibleForTesting(otherwise = 5)
    @Nullable
    Object a(@NotNull hn.c<? super r> cVar);

    @Nullable
    Object a(@NotNull String str, @NotNull MediationInfo mediationInfo, @NotNull hn.c<? super g0<Init$SDKInitResponse, i>> cVar);
}
