package com.unity3d.ads.core.domain.billing;

import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProductDetailsFetcher.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface ProductDetailsFetcher {
    @Nullable
    Object fetchProductDetails(@NotNull String str, @NotNull c<? super ProductDetailsResult> cVar);
}
