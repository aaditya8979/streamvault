package com.unity3d.ads.core.data.manager;

import bn.r;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import go.d;
import hn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OfferwallManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface OfferwallManager {
    @Nullable
    Object getVersion(@NotNull c<? super String> cVar);

    @Nullable
    Object isAdReady(@NotNull String str, @NotNull c<? super Boolean> cVar);

    @Nullable
    Object isConnected(@NotNull c<? super Boolean> cVar);

    @Nullable
    Object loadAd(@NotNull String str, @NotNull c<? super r> cVar);

    @NotNull
    d<OfferwallEventData> showAd(@NotNull String str);
}
