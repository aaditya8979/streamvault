package gf;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: compiled from: ScarInterstitialAdListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class f extends gf.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f62389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af.g f62390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterstitialAdLoadCallback f62391d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f62392e = new b();

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f62390c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            f.this.f62390c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(f.this.f62392e);
            f.this.f62389b.c(interstitialAd);
            cf.b bVar = f.this.f62380a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* JADX INFO: compiled from: ScarInterstitialAdListener.java */
    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.f62390c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f62390c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f62390c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f62390c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f62390c.onAdOpened();
        }
    }

    public f(af.g gVar, e eVar) {
        this.f62390c = gVar;
        this.f62389b = eVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f62391d;
    }
}
