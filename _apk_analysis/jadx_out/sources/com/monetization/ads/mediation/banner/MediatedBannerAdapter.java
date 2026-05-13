package com.monetization.ads.mediation.banner;

import android.content.Context;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediatedBannerAdapter extends com.monetization.ads.mediation.base.a {

    public interface MediatedBannerAdapterListener {
    }

    public abstract void loadBanner(@NotNull Context context, @NotNull MediatedBannerAdapterListener mediatedBannerAdapterListener, @NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> map2);

    public abstract void onInvalidate();
}
