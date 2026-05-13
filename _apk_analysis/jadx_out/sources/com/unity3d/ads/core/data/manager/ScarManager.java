package com.unity3d.ads.core.data.manager;

import android.content.Context;
import bn.r;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.AdFormatOuterClass;
import go.d;
import hn.c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScarManager.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface ScarManager {
    @Nullable
    Object getSignals(@Nullable List<? extends AdFormatOuterClass.AdFormat> list, @NotNull c<? super BiddingSignals> cVar);

    @Nullable
    Object getVersion(@NotNull c<? super String> cVar);

    @Nullable
    Object loadAd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i10, @NotNull c<? super r> cVar);

    @NotNull
    d<GmaEventData> loadBannerAd(@NotNull Context context, @NotNull BannerView bannerView, @NotNull cf.c cVar, @NotNull UnityBannerSize unityBannerSize, @NotNull String str);

    @NotNull
    d<GmaEventData> show(@NotNull String str, @NotNull String str2);
}
