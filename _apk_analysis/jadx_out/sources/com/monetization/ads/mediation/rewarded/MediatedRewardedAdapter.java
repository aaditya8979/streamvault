package com.monetization.ads.mediation.rewarded;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediatedRewardedAdapter extends a {
    public abstract void loadRewardedAd(@NotNull Context context, @NotNull MediatedRewardedAdapterListener mediatedRewardedAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showRewardedAd(@NotNull Activity activity);
}
