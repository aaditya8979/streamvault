package kf;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: ScarBannerAdListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af.f f73091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f73092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdListener f73093d = new a();

    /* JADX INFO: compiled from: ScarBannerAdListener.java */
    public class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f73091b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f73091b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f73092c.d();
            d.this.f73091b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f73091b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f73091b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f73091b.onAdOpened();
        }
    }

    public d(af.f fVar, c cVar) {
        this.f73091b = fVar;
        this.f73092c = cVar;
    }

    public AdListener d() {
        return this.f73093d;
    }
}
