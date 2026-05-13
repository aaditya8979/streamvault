package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C3321c2 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private WeakReference<InMobiBanner> f26906a;

    public C3321c2(InMobiBanner inMobiBanner) {
        tn.p.k(inMobiBanner, "banner");
        this.f26906a = new WeakReference<>(inMobiBanner);
    }

    @NotNull
    public final WeakReference<InMobiBanner> a() {
        return this.f26906a;
    }

    public final void a(@NotNull WeakReference<InMobiBanner> weakReference) {
        tn.p.k(weakReference, "<set-?>");
        this.f26906a = weakReference;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> map) {
        Y1 mPubListener$media_release;
        tn.p.k(map, "params");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null) {
            return;
        }
        Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            tn.p.k(inMobiBanner, "ad");
            ((Z1) mPubListener$media_release).f26678a.onAdDismissed(inMobiBanner);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo) {
        Y1 mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiBanner, "ad");
        ((Z1) mPubListener$media_release).f26678a.onAdDisplayed(inMobiBanner);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        Y1 mPubListener$media_release;
        tn.p.k(inMobiAdRequestStatus, "status");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiBanner, "ad");
        tn.p.k(inMobiAdRequestStatus, "status");
        ((Z1) mPubListener$media_release).f26678a.onAdFetchFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo adMetaInfo) {
        Y1 mPubListener$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable C3442gk c3442gk) {
        InMobiBanner inMobiBanner = this.f26906a.get();
        Y1 mPubListener$media_release = inMobiBanner != null ? inMobiBanner.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3442gk != null) {
                c3442gk.b();
            }
        } else {
            tn.p.k(inMobiBanner, "ad");
            ((Z1) mPubListener$media_release).f26678a.onAdImpression(inMobiBanner);
            if (c3442gk != null) {
                c3442gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        tn.p.k(inMobiAdRequestStatus, "status");
        tn.p.j(C3321c2.class.getSimpleName(), "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null) {
            return;
        }
        Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
        if (mPubListener$media_release != null) {
            mPubListener$media_release.a(inMobiBanner, inMobiAdRequestStatus);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo) {
        C3372e2 mAdManager$media_release;
        tn.p.k(adMetaInfo, "info");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mAdManager$media_release = inMobiBanner.getMAdManager$media_release()) == null) {
            return;
        }
        if (!mAdManager$media_release.l()) {
            mAdManager$media_release.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            Y1 mPubListener$media_release = inMobiBanner.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.b(inMobiBanner, adMetaInfo);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager$media_release.l()) {
            AbstractC3547l1 abstractC3547l1F = mAdManager$media_release.f();
            if (abstractC3547l1F != null) {
                abstractC3547l1F.c((short) 2173);
                return;
            }
            return;
        }
        AbstractC3547l1 abstractC3547l1F2 = mAdManager$media_release.f();
        if (abstractC3547l1F2 != null) {
            abstractC3547l1F2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(@NotNull V1 v12) {
        tn.p.k(v12, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(v12);
        AudioListener mAudioListener$media_release = inMobiBanner.getMAudioListener$media_release();
        if (mAudioListener$media_release != null) {
            V1.f26459b.getClass();
            tn.p.k(v12, "item");
            int iOrdinal = v12.ordinal();
            mAudioListener$media_release.onAudioStatusChanged(inMobiBanner, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String str) {
        Y1 mPubListener$media_release;
        tn.p.k(str, CreativeInfo.f52469an);
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiBanner, str);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] bArr) {
        Y1 mPubListener$media_release;
        tn.p.k(bArr, AdActivity.REQUEST_KEY_EXTRA);
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        ((Z1) mPubListener$media_release).f26678a.onRequestPayloadCreated(bArr);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        Y1 mPubListener$media_release;
        tn.p.k(inMobiAdRequestStatus, "reason");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiAdRequestStatus, "status");
        ((Z1) mPubListener$media_release).f26678a.onRequestPayloadCreationFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> map) {
        Y1 mPubListener$media_release;
        tn.p.k(map, "rewards");
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiBanner, "ad");
        tn.p.k(map, "rewards");
        ((Z1) mPubListener$media_release).f26678a.onRewardsUnlocked(inMobiBanner, map);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        Y1 mPubListener$media_release;
        InMobiBanner inMobiBanner = this.f26906a.get();
        if (inMobiBanner == null || (mPubListener$media_release = inMobiBanner.getMPubListener$media_release()) == null) {
            return;
        }
        tn.p.k(inMobiBanner, "ad");
        ((Z1) mPubListener$media_release).f26678a.onUserLeftApplication(inMobiBanner);
    }
}
