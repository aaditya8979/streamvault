package com.moloco.sdk.publisher;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bn.r;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
final class BannerActivitySample extends Activity {
    private Banner banner;

    @NotNull
    private final FrameLayout bannerContainer = new FrameLayout(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final r onCreate$lambda$0(BannerActivitySample bannerActivitySample, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner == null) {
            bannerActivitySample.finish();
            return r.f5635a;
        }
        bannerActivitySample.banner = banner;
        bannerActivitySample.bannerContainer.addView(banner);
        banner.setAdShowListener(new BannerAdShowListener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$1
            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdClicked(MolocoAd molocoAd) {
                p.k(molocoAd, "molocoAd");
                throw new NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdHidden(MolocoAd molocoAd) {
                p.k(molocoAd, "molocoAd");
                throw new NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowFailed(MolocoAdError molocoAdError) {
                p.k(molocoAdError, "molocoAdError");
                throw new NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowSuccess(MolocoAd molocoAd) {
                p.k(molocoAd, "molocoAd");
                throw new NotImplementedError("An operation is not implemented: Not yet implemented");
            }
        });
        banner.load("bid response", new AdLoad.Listener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$2
            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadFailed(MolocoAdError molocoAdError) {
                p.k(molocoAdError, "molocoAdError");
                throw new NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadSuccess(MolocoAd molocoAd) {
                p.k(molocoAd, "molocoAd");
                throw new NotImplementedError("An operation is not implemented: Not yet implemented");
            }
        });
        banner.isLoaded();
        banner.load("an_another_bid_response", null);
        bannerActivitySample.bannerContainer.removeView(banner);
        banner.load("", null);
        banner.load("some_other_bid_response", null);
        bannerActivitySample.bannerContainer.addView(banner);
        return r.f5635a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.D, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle, @Nullable PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        setContentView(this.bannerContainer);
        Moloco.createBanner$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new sn.p() { // from class: com.moloco.sdk.publisher.a
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return BannerActivitySample.onCreate$lambda$0(this.f47621b, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Banner banner = this.banner;
        Banner banner2 = null;
        if (banner == null) {
            p.C("banner");
            banner = null;
        }
        banner.destroy();
        Banner banner3 = this.banner;
        if (banner3 == null) {
            p.C("banner");
            banner3 = null;
        }
        ViewParent parent = banner3.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            Banner banner4 = this.banner;
            if (banner4 == null) {
                p.C("banner");
            } else {
                banner2 = banner4;
            }
            viewGroup.removeView(banner2);
        }
    }
}
