package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.hu3;
import yads.iu3;
import yads.r10;
import yads.zp3;

/* JADX INFO: loaded from: classes6.dex */
@MainThread
public final class RewardedAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r10 f59292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zp3 f59293b = new zp3();

    public RewardedAdLoader(@NotNull Context context) {
        this.f59292a = new r10(context, new iu3(context));
    }

    public final void loadAd(@NotNull AdRequestConfiguration adRequestConfiguration) {
        this.f59292a.f94250a.a(this.f59293b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(@Nullable RewardedAdLoadListener rewardedAdLoadListener) {
        this.f59292a.f94250a.a(rewardedAdLoadListener != null ? new hu3(rewardedAdLoadListener) : null);
    }
}
