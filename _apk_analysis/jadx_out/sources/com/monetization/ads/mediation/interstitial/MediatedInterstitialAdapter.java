package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediatedInterstitialAdapter extends com.monetization.ads.mediation.base.a {

    public interface MediatedInterstitialAdapterListener {
    }

    public abstract void loadInterstitial(@NotNull Context context, @NotNull MediatedInterstitialAdapterListener mediatedInterstitialAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);

    public abstract void onInvalidate();

    public abstract void showInterstitial(@NotNull Activity activity);
}
