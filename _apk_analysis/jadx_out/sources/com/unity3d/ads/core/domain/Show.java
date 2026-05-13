package com.unity3d.ads.core.domain;

import bn.r;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import go.d;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Show.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Show {
    @NotNull
    d<ShowEvent> invoke(@NotNull AdObject adObject, @Nullable UnityAdsShowOptions unityAdsShowOptions);

    @Nullable
    Object terminate(@NotNull AdObject adObject, @NotNull c<? super r> cVar);
}
