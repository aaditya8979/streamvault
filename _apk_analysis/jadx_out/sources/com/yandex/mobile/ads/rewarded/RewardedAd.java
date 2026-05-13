package com.yandex.mobile.ads.rewarded;

import android.app.Activity;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@MainThread
public interface RewardedAd {
    @NotNull
    List<Object> getAdAttributes();

    @NotNull
    AdInfo getInfo();

    void setAdEventListener(@Nullable RewardedAdEventListener rewardedAdEventListener);

    void show(@NotNull Activity activity);
}
