package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.ct3;
import yads.iu3;
import yads.x00;
import yads.zp3;

/* JADX INFO: loaded from: classes2.dex */
@MainThread
public final class InterstitialAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zp3 f59190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x00 f59191b;

    public InterstitialAdLoader(@NotNull Context context) {
        iu3 iu3Var = new iu3(context);
        this.f59190a = new zp3();
        this.f59191b = new x00(context, iu3Var);
    }

    public final void loadAd(@NotNull AdRequestConfiguration adRequestConfiguration) {
        this.f59191b.f96575a.a(this.f59190a.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(@Nullable InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f59191b.f96575a.a(interstitialAdLoadListener != null ? new ct3(interstitialAdLoadListener) : null);
    }
}
