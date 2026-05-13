package com.yandex.mobile.ads.interstitial;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@MainThread
public interface InterstitialAd {
    @NotNull
    List<Object> getAdAttributes();

    @NotNull
    AdInfo getInfo();

    void setAdEventListener(@Nullable InterstitialAdEventListener interstitialAdEventListener);

    void show(@NotNull Activity activity);
}
