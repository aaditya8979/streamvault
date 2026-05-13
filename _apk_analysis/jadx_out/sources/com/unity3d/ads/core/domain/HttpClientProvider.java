package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.core.HttpClient;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpClientProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface HttpClientProvider {
    @Nullable
    Object invoke(@NotNull c<? super HttpClient> cVar);
}
