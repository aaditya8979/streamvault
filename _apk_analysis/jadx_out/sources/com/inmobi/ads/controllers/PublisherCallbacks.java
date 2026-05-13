package com.inmobi.ads.controllers;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3442gk;
import com.inmobi.media.Qg;
import com.inmobi.media.V1;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@UiThread
public abstract class PublisherCallbacks {

    @NotNull
    public static final Qg Companion = new Qg();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(@NotNull Map<Object, ? extends Object> map);

    public abstract void onAdDismissed();

    public void onAdDisplayFailed() {
    }

    public abstract void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo);

    public abstract void onAdFetchFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdFetchSuccessful(@NotNull AdMetaInfo adMetaInfo) {
        p.k(adMetaInfo, "info");
    }

    public void onAdImpressed() {
    }

    public void onAdImpression(@Nullable C3442gk c3442gk) {
    }

    public abstract void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo) {
        p.k(adMetaInfo, "info");
    }

    public void onAdWillDisplay() {
    }

    public void onAudioStateChanged(boolean z10) {
    }

    public void onAudioStatusChanged(@NotNull V1 v12) {
        p.k(v12, "audioStatusInternal");
    }

    public void onImraidLog(@NotNull String str) {
        p.k(str, CreativeInfo.f52469an);
    }

    public void onRequestPayloadCreated(@NotNull byte[] bArr) {
        p.k(bArr, AdActivity.REQUEST_KEY_EXTRA);
    }

    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        p.k(inMobiAdRequestStatus, "reason");
    }

    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> map) {
        p.k(map, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onVideoCompleted() {
    }

    public void onVideoPaused() {
    }

    public void onVideoResumed() {
    }

    public void onVideoStarted() {
    }
}
