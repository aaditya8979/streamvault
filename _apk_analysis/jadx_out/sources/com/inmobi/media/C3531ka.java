package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.special.SpecialsBridge;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C3531ka extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public WeakReference<InMobiInterstitial> f27461a;

    public C3531ka(InMobiInterstitial inMobiInterstitial) {
        tn.p.k(inMobiInterstitial, "interstitial");
        this.f27461a = new WeakReference<>(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> map) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(map, "params");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC3457ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiInterstitial, "ad");
        ((C3482ia) mPubListener$media_release).f27343a.onAdDismissed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC3457ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiInterstitial, "ad");
        ((C3482ia) mPubListener$media_release).f27343a.onAdDisplayFailed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(adMetaInfo, "info");
        SpecialsBridge.inmobiOnInterstitialAdDisplayed(((C3482ia) mPubListener$media_release).f27343a, inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(inMobiAdRequestStatus, "status");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(inMobiAdRequestStatus, "status");
        ((C3482ia) mPubListener$media_release).f27343a.onAdFetchFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable C3442gk c3442gk) {
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        AbstractC3457ha mPubListener$media_release = inMobiInterstitial != null ? inMobiInterstitial.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3442gk != null) {
                c3442gk.b();
            }
        } else {
            tn.p.k(inMobiInterstitial, "ad");
            ((C3482ia) mPubListener$media_release).f27343a.onAdImpression(inMobiInterstitial);
            if (c3442gk != null) {
                c3442gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(inMobiAdRequestStatus, "status");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC3457ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiInterstitial, "ad");
        ((C3482ia) mPubListener$media_release).f27343a.onAdWillDisplay(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String str) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(str, CreativeInfo.f52469an);
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, str);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] bArr) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3482ia) mPubListener$media_release).f27343a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(inMobiAdRequestStatus, "reason");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiAdRequestStatus, "status");
        ((C3482ia) mPubListener$media_release).f27343a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> map) {
        AbstractC3457ha mPubListener$media_release;
        tn.p.k(map, "rewards");
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(map, "rewards");
        ((C3482ia) mPubListener$media_release).f27343a.onRewardsUnlocked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3457ha mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f27461a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiInterstitial, "ad");
        ((C3482ia) mPubListener$media_release).f27343a.onUserLeftApplication(inMobiInterstitial);
    }
}
