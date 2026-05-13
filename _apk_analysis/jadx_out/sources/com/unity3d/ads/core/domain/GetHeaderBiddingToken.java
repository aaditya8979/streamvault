package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface GetHeaderBiddingToken {

    /* JADX INFO: compiled from: GetHeaderBiddingToken.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetHeaderBiddingToken getHeaderBiddingToken, int i10, TokenConfiguration tokenConfiguration, c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i11 & 2) != 0) {
                tokenConfiguration = null;
            }
            return getHeaderBiddingToken.invoke(i10, tokenConfiguration, cVar);
        }
    }

    @Nullable
    Object invoke(int i10, @Nullable TokenConfiguration tokenConfiguration, @NotNull c<? super String> cVar);
}
