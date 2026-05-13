package gf;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: compiled from: ScarRewardedAdListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class h extends gf.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f62395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af.h f62396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RewardedAdLoadCallback f62397d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f62398e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FullScreenContentCallback f62399f = new c();

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f62396c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            h.this.f62396c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f62399f);
            h.this.f62395b.c(rewardedAd);
            cf.b bVar = h.this.f62380a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class b implements OnUserEarnedRewardListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            h.this.f62396c.onUserEarnedReward();
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class c extends FullScreenContentCallback {
        public c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f62396c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f62396c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f62396c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f62396c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f62396c.onAdOpened();
        }
    }

    public h(af.h hVar, g gVar) {
        this.f62396c = hVar;
        this.f62395b = gVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f62397d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f62398e;
    }
}
