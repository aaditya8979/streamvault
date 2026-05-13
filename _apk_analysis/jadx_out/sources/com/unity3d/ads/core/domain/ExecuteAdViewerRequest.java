package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExecuteAdViewerRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ExecuteAdViewerRequest {
    @Nullable
    Object invoke(@NotNull RequestType requestType, @NotNull Object[] objArr, @NotNull c<? super HttpResponse> cVar);
}
