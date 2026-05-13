package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class R1 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private WeakReference<InMobiAudio> f26216a;

    public R1(InMobiAudio inMobiAudio) {
        tn.p.k(inMobiAudio, "audio");
        this.f26216a = new WeakReference<>(inMobiAudio);
    }

    @NotNull
    public final WeakReference<InMobiAudio> a() {
        return this.f26216a;
    }

    public final void a(@NotNull WeakReference<InMobiAudio> weakReference) {
        tn.p.k(weakReference, "<set-?>");
        this.f26216a = weakReference;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> map) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(map, "params");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdClicked(inMobiAudio, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDismissed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDisplayFailed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdDisplayed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdFetchSuccessful(inMobiAudio, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable C3442gk c3442gk) {
        InMobiAudio inMobiAudio = this.f26216a.get();
        AudioAdEventListener mPubListener$media_release = inMobiAudio != null ? inMobiAudio.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3442gk != null) {
                c3442gk.b();
            }
        } else {
            mPubListener$media_release.onAdImpression(inMobiAudio);
            if (c3442gk != null) {
                c3442gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(inMobiAdRequestStatus, "status");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdLoadFailed(inMobiAudio, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onAdLoadSucceeded(inMobiAudio, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(@NotNull V1 v12) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(v12, "audioStatusInternal");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        V1.f26459b.getClass();
        tn.p.k(v12, "item");
        int iOrdinal = v12.ordinal();
        mPubListener$media_release.onAudioStatusChanged(inMobiAudio, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] bArr) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(inMobiAdRequestStatus, "reason");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> map) {
        AudioAdEventListener mPubListener$media_release;
        tn.p.k(map, "rewards");
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onRewardsUnlocked(inMobiAudio, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AudioAdEventListener mPubListener$media_release;
        InMobiAudio inMobiAudio = this.f26216a.get();
        if (inMobiAudio == null || (mPubListener$media_release = inMobiAudio.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.onUserLeftApplication(inMobiAudio);
    }
}
